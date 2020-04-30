package by.dm13y.examples;

import by.dm13y.examples.jpa.entity2table.service.CityTestExecutor;
import by.dm13y.examples.manytomany.v1.service.TestHandler;
import by.dm13y.examples.manytomany.v2.service.TestHandler2;
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
    private final TestHandler2 testHandler2;
    private final CityTestExecutor cityTestExecutor;

    @EventListener(ApplicationReadyEvent.class)
    public void start() {
        testHandler1.init();
        testHandler1.test();

        testHandler2.init();
        testHandler2.test();

        cityTestExecutor.execute();
    }

}
