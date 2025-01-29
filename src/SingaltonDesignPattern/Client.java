package SingaltonDesignPattern;

public class Client {
    public static void main(String[] args) {
        SingletonDesignPattern singletonDesignPattern1 =  SingletonDesignPattern.createInstance();
        SingletonDesignPattern singletonDesignPattern2 =  SingletonDesignPattern.createInstance();
        System.out.println();
    }
}
