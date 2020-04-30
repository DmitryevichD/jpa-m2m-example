package by.dm13y.examples.jpa.entity2table.repository;

import by.dm13y.examples.jpa.entity2table.entity.ExtCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtCityRepository extends JpaRepository<ExtCity, Integer> {
}
