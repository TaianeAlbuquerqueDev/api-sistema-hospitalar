package br.com.senai.api_sistema_hospitalar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.api_sistema_hospitalar.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    boolean existsByCpf(String cpf);
}
