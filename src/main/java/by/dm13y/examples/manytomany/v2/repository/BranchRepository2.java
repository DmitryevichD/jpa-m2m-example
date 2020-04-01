package by.dm13y.examples.manytomany.v2.repository;

import by.dm13y.examples.manytomany.v2.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository2 extends JpaRepository<Branch, Integer> {
}
