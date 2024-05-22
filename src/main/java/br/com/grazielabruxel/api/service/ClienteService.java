package br.com.grazielabruxel.api.service;

import br.com.grazielabruxel.api.ClienteRepository;
import br.com.grazielabruxel.api.dao.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    public List<Cliente> listarClientes() {
        return this.clienteRepository.findAll();
    }
}
