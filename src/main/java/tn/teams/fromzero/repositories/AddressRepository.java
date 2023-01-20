package tn.teams.fromzero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.teams.fromzero.entities.Address;


@Repository
public interface AddressRepository  extends JpaRepository<Address,Long> {

}
