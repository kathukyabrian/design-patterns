package tech.meliora.natujenge.singleton;

public class Singleton {

    private Singleton() {
    }

    private static Singleton singleton;

    public static Singleton getInstance(){

        if(singleton==null){
            return new Singleton();
        }

        return singleton;
    }


    //Game Development
    //Single script monitors -> use it in the entire game
    // If you need to maintain state

    // Development
    // DB : if anyone is writing anything, we want one guy to maintain that
    // 1 object........

    // Spring Boot
    // Resources and Controllers are Singleton

    // PERSPECTIVE
    // basic stuff is easy
    // when working with a group : convention over configuration
    // MVC ---> arch
    // Our biggest task is creating patterns and identifying patterns
    // Design Patterns - other developers won't struggle
    // They are for developers not the code, the code will still work without design patterns

}
