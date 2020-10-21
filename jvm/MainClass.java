package jvm;

import java.lang.reflect.Method;

public class MainClass {

    public static void main(String[] args) {
        MyClassLoader loader = new MyClassLoader();
        Class<?> aClass = loader.findClass("Hello");
        try {
            Object obj = aClass.newInstance();
            Method method = aClass.getMethod("hello");
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
