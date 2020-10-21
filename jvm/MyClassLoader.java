package jvm;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyClassLoader extends ClassLoader {


    @Override
    protected Class<?> findClass(String name) {
        String filePath = "file:/d:/Hello.xlass";
        byte[] bytes = null;
        Path path = null;
        try {
            path = Paths.get(new URI(filePath));
            bytes = Files.readAllBytes(path);
        } catch (Exception e) {
            e.printStackTrace();
        }

        byte[] result = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            result[i] = (byte) (255 - bytes[i]);
        }
        Class clazz = defineClass(name, result, 0, result.length);
        return clazz;
    }


}
