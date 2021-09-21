package tech.meliora.natujenge.singleton;

public class SingletonCreator {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton);
    }
}
