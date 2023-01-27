package tn.teams.fromzero.services;

import java.util.List;

import tn.teams.fromzero.dto.DepartmentDTO;



public interface ServiceDepartment {
	
	DepartmentDTO save(DepartmentDTO dto);
    void delete(Long id);
    DepartmentDTO findById(Long id);
    List<DepartmentDTO> findAllDepartment();
   

}
