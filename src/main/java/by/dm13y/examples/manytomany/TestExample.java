package by.dm13y.examples.manytomany;

import by.dm13y.examples.manytomany.v1.service.TestHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class TestExample {
    private final TestHandler testHandler1;

    @EventListener(ApplicationReadyEvent.class)
    public void start() {
        testHandler1.init();
        testHandler1.test();
    }

}
