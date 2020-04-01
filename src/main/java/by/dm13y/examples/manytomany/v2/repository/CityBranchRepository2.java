package by.dm13y.examples.manytomany.v2.repository;

import by.dm13y.examples.manytomany.v2.entity.CityBranch;
import by.dm13y.examples.manytomany.v2.entity.CityBranchId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityBranchRepository2 extends JpaRepository<CityBranch, CityBranchId> {
}
