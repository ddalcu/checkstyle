package com.dalcu;

/**
 * Hello world!
 *
 */
public class App {

    //private final static String ERROR = "error";

    private App() {

    }

    public static void main(final String[] args) {
        System.out.println("Hello World, this code is horrible on purpose!");
        Object object = null;
        try {
            object = new Object();
        } catch (final Exception e) {
            e.printStackTrace();
        }
        object.equals(test());

        test();
        test();
        test();
        test();

        if ("this" == "this") {
            System.out.println("FindBugs !");
        }
    }

    private static Boolean test() {
        return null;
    }


}
