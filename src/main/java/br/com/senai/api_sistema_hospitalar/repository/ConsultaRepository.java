package br.com.senai.api_sistema_hospitalar.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.api_sistema_hospitalar.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    
}
