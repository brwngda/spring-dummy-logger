package pl.exercise.sda.dummyLogger;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WithSecondaryCommandLineRunner implements CommandLineRunner {

    private final DummyLogger dummyLogger;

    public WithSecondaryCommandLineRunner(@Qualifier("secondDummyLogger") final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
