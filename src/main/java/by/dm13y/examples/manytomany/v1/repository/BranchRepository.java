package by.dm13y.examples.manytomany.v1.repository;

import by.dm13y.examples.manytomany.v1.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {
}
