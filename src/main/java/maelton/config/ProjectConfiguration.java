package maelton.config;

import maelton.beans.Woman;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    public Woman woman() {
        Woman woman = new Woman();
        woman.setEyeColor("Light Brown");
        return woman;
    }
}
