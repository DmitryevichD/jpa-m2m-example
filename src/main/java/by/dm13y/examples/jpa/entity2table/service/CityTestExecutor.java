package by.dm13y.examples.jpa.entity2table.service;

import by.dm13y.examples.jpa.entity2table.repository.ExtCityRepository;
import by.dm13y.examples.jpa.entity2table.repository.CommonCityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CityTestExecutor {
    private final CommonCityRepository cityRepository;
    private final ExtCityRepository extCommonRepository;

    public void execute() {
        val city = cityRepository.findAll();
        log.info("Common city size: {}", city.size());

        val extCities = extCommonRepository.findAll();
        log.info("Ext city size: {}", extCities.size());
    }
}
