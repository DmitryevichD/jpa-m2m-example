package by.dm13y.examples.manytomany.v1.service;

import by.dm13y.examples.manytomany.v1.entity.Branch;
import by.dm13y.examples.manytomany.v1.entity.City;
import by.dm13y.examples.manytomany.v1.entity.CityBranch;
import by.dm13y.examples.manytomany.v1.repository.BranchRepository;
import by.dm13y.examples.manytomany.v1.repository.CityBranchRepository;
import by.dm13y.examples.manytomany.v1.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@RequiredArgsConstructor
@Component
public class TestHandler {
    private final BranchRepository branchRepository;
    private final CityRepository cityRepository;
    private final CityBranchRepository cityBranchRepository;

    @Transactional
    public void init() {
        val city = generateCity(1);
        val branch = generateBranch(2);
        val binding = new CityBranch(city, branch, true);
        city.getBranches().add(binding);

        //or
//        branch.getCities().add(binding);

        //or
//        cityBranchRepository.save(binding);
    }

    @Transactional
    public void test() {
        log.info("City test: {}" ,cityRepository.findById(1).get().getBranches().get(0).getId().getCityId());
        log.info("Branch test: {}" ,branchRepository.findById(2).get().getCities().get(0).getId().getCityId());
    }

    private City generateCity(Integer id) {
        val city = new City();
        city.setId(id);
        return cityRepository.save(city);
    }

    private Branch generateBranch(Integer id) {
        val branch = new Branch();
        branch.setId(id);
        return branchRepository.save(branch);
    }
}
