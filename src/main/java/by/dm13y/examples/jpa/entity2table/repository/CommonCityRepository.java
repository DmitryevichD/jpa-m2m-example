package by.dm13y.examples.jpa.entity2table.repository;

import by.dm13y.examples.jpa.entity2table.entity.CommonCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonCityRepository extends JpaRepository<CommonCity, Integer> {
}
