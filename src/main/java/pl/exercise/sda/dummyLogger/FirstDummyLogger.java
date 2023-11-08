package pl.exercise.sda.dummyLogger;

import lombok.extern.slf4j.Slf4j;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.exercise.sda.dummyLogger.DummyLogger;

@Component
@Slf4j
@Primary
public class FirstDummyLogger implements DummyLogger {
    @Override
    public void sayHello() {
        log.info("hello from first");
    }
}