package br.com.senai.api_sistema_hospitalar.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.api_sistema_hospitalar.entity.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
        boolean existsByCrm(String crm);
}
