package tech.meliora.natujenge.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class Reflector {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class cls = Class.forName("tech.meliora.natujenge.reflection.Student");

        System.out.println(LocalDateTime.now()+"|DEBUG"+"|The class is named "+cls.getCanonicalName());

        System.out.println(LocalDateTime.now()+"|DEBUG"+"|The class has "+cls.getConstructors().length + " constructors");

        System.out.println(LocalDateTime.now()+"|DEBUG"+"|The class has "+cls.getDeclaredFields().length + " fields");

        /**
         * Loop through all methods in a class
         */
        System.out.println(LocalDateTime.now()+"|DEBUG"+"|About to loop through the methods in the class");
        Method[] methods = cls.getDeclaredMethods();
        for(int i = 0; i<methods.length; i++){
            System.out.println(LocalDateTime.now()+"|DEBUG"+"|Current iteration for methods array is : "+methods[i]);
        }
        System.out.println(LocalDateTime.now()+"|DEBUG"+"|Finished looping through the methods in the class. Method " +
                "count is "+methods.length);

        /**
         * Use the constructor to create new instances
         */
        Constructor<?> constructor = cls.getConstructor(String.class,String.class,String.class);
        Student student = (Student) constructor.newInstance("Brian","bri@gmail.com","0756191");
        System.out.println(LocalDateTime.now()+"|DEBUG"+"|Constructed an object : "+student);



    }
}
