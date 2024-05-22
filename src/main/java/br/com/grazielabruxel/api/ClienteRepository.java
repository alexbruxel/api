package br.com.grazielabruxel.api;

import br.com.grazielabruxel.api.dao.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
