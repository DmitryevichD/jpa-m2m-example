package by.dm13y.examples.manytomany.v1.repository;

import by.dm13y.examples.manytomany.v1.entity.CityBranch;
import by.dm13y.examples.manytomany.v1.entity.CityBranchId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityBranchRepository extends JpaRepository<CityBranch, CityBranchId> {
}
