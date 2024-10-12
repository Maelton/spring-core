package maelton;

import maelton.beans.Woman;

import maelton.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Woman woman = context.getBean(Woman.class);

        System.out.println(woman.getEyeColor());
    }
}
