package by.dm13y.examples.manytomany.v2.service;

import by.dm13y.examples.manytomany.v2.entity.CityBranch;
import by.dm13y.examples.manytomany.v2.entity.Branch;
import by.dm13y.examples.manytomany.v2.entity.City;
import by.dm13y.examples.manytomany.v2.repository.BranchRepository2;
import by.dm13y.examples.manytomany.v2.repository.CityBranchRepository2;
import by.dm13y.examples.manytomany.v2.repository.CityRepository2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@RequiredArgsConstructor
@Component
public class TestHandler2 {
    private final BranchRepository2 branchRepository;
    private final CityRepository2 cityRepository;
    private final CityBranchRepository2 cityBranchRepository;

    @Transactional
    public void init() {
        //В отличии от v1 связаностью сущностей можно управлять только чреез CityBranchRepository
        val city = generateCity(100);
        val branch = generateBranch(200);
        val binding = new CityBranch(city, branch, true);
        cityBranchRepository.save(binding);

        val city2 = generateCity(1000);
        val branch2 = generateBranch(2000);
        val binding2 = new CityBranch(city2, branch2, false);

        cityBranchRepository.save(binding2);
    }

    @Transactional
    public void test() {

        log.info("City is present test: {}" ,cityRepository.findById(100).get().getBranches().size());
        log.info("Branch is present test: {}" ,branchRepository.findById(200).get().getCities().size());

        log.info("City is NOT present test: {}" ,cityRepository.findById(1000).get().getBranches().size());
        log.info("Branch is NOT present test: {}" ,branchRepository.findById(2000).get().getCities().size());
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
