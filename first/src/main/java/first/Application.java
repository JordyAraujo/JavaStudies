package first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Config;
import model.ITodo;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ITodo todo = context.getBean(ITodo.class);
        System.out.println(todo);
        context.close();
    }
}