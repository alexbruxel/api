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

    public Cliente salvarCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    public Cliente buscarCliente(int id) {
        return this.clienteRepository.findById(id).orElse(null);
    }



    public int nextId() {
        return Long.valueOf(this.clienteRepository.count() + 1).intValue();
    }

}
