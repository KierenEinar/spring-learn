package spring.learn.beans;

/**
 * Created by kieren on 18/1/22.
 */
public class MyTestBean {

    private static String name = "MyTestBean";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MyTestBean.name = name;
    }
}
