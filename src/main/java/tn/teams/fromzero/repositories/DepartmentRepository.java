package tn.teams.fromzero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.teams.fromzero.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long>{

}
