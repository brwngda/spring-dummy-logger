package pl.exercise.sda.dummyLogger;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class UtilConfiguration {

    @Bean
    public DummyLogger dummyLogger() {
        return new DummyLogger();
    }

    @Bean
    public ListUtil listUtility() {
        return new ListUtil();
    }

    @Bean(name = "stringUtility")
    public StringUtil stringUtil() {
        return new StringUtil();
    }

}
