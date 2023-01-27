package tn.teams.fromzero.services;

import java.util.List;

import tn.teams.fromzero.dto.MissionDTO;



public interface ServiceMission {


	MissionDTO save(MissionDTO dto);
    void delete(Long id);
    MissionDTO findById(Long id);
    List<MissionDTO> findAllMission();
   

	
}
