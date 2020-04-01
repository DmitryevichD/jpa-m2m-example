package by.dm13y.examples.manytomany.v2.repository;

import by.dm13y.examples.manytomany.v2.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository2 extends JpaRepository<City, Integer> {
}
