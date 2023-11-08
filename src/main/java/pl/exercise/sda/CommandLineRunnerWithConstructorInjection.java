package pl.exercise.sda;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {

    private DummyLogger dummyLogger;

    @Override
    public void run(final String... args) throws Exception {
        dummyLogger.sayHello();
    }
}