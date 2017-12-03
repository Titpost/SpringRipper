package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    }
}
