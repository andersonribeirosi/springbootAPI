package br.com.elfrarep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.elfrarep.domain.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
