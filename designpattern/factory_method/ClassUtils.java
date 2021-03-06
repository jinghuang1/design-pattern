package factory_method;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author jinhuan3
 * @date 2/13/2022 - 11:27 PM
 */
public class ClassUtils {

  //给你一个接口，返回这个接口的所有实现类
  public static List<Class> getAllClassByInterface(Class c) {
    List<Class> returnClassList = new ArrayList<>();

    //如果不是接口，则不做处理
    if(c.isInterface()){
      String packageName = c.getPackage().getName();    //获得当前的包名

      try {
        List<Class> allClass = getClasses(packageName);   //获得当前包下以及子包下的所有类

        //判断是否时同一个接口
        for (int i = 0; i < allClass.size(); i++){
          if(c.isAssignableFrom(allClass.get(i))){      //判断是不是接口
            if(!c.equals(allClass.get(i))){
              returnClassList.add(allClass.get(i));
            }
          }
        }
      } catch (IOException e) {
        e.printStackTrace();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    }
    return returnClassList;
  }

  private static List<Class> getClasses(String packageName)
      throws IOException, ClassNotFoundException {
    ClassLoader classLoader = Thread.currentThread()
        .getContextClassLoader();
    String path = packageName.replace('.', '/');
    Enumeration<URL> resources = classLoader.getResources(path);
    List<File> dirs = new ArrayList<File>();
    while (resources.hasMoreElements()) {
      URL resource = resources.nextElement();
      dirs.add(new File(resource.getFile()));
    }
    ArrayList<Class> classes = new ArrayList<Class>();
    for (File directory : dirs) {
      classes.addAll(findClasses(directory, packageName));
    }
    return classes;
  }

  private static List<Class> findClasses(File directory, String packageName)
      throws ClassNotFoundException {
    List<Class> classes = new ArrayList<Class>();
    if (!directory.exists()) {
      return classes;
    }
    File[] files = directory.listFiles();
    for (File file : files) {
      if (file.isDirectory()) {
        assert !file.getName().contains(".");
        classes.addAll(findClasses(file, packageName + "." +
            file.getName()));
      } else if (file.getName().endsWith(".class")) {
        classes.add(Class.forName(packageName + '.' +
            file.getName().substring(0, file.getName().length() - 6)));
      }
    }
    return classes;
  }
}
