package pl.exercise.sda.dummyLogger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pl.exercise.sda.dummyLogger.DummyLogger;


@Component
@Slf4j
public class SecondDummyLogger implements DummyLogger {

    @Override
    public void sayHello() {
        log.info("Hello from second");
    }
}