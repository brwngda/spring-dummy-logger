package pl.exercise.sda.dummyLogger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DummyLogger {

    private void sayHi() {
        log.info("Hi from exercise 4");
    }
}