package br.com.grazielabruxel.api.controllers;

import br.com.grazielabruxel.api.dao.Cliente;
import br.com.grazielabruxel.api.service.ClienteService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/crud")
public class CrudController
{
    private ClienteService clienteService;

    public CrudController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping(value = "/criar", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Cliente> criar(@RequestBody String requestBody) {
        Cliente cliente = new Cliente();

        //String responseBody = "CRUD Criado com Sucesso!";

        return ResponseEntity.status(HttpStatus.OK).body(cliente);
    }

    @PutMapping(value = "/atualizar/{id}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> atualizar(@RequestBody String requestBody, @PathParam("id") String id) {
        String responseBody = "CRUD Atualizado com Sucesso!" + id;

        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    @DeleteMapping(value = "/deletar/{id}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> deletar(@RequestBody Map<String, String> requestBody, String id) {
        String responseBody = "CRUD Deletado com Sucesso!" + requestBody.get("id");

        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    @GetMapping(value = "/listar/{id}", produces = "application/json")
    @ResponseBody
    public Map<String, String> listar(@PathParam("id") String id) {
        Map<String, String> responseBody = new HashMap<>();
        responseBody.put("id", id);
        responseBody.put("message", "CRUD Listando com Sucesso!");

        return responseBody;
    }

    @GetMapping(value = "/listar", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<Cliente>> listarTudo() {
        String responseBody = "CRUD Listando Tudo com Sucesso!";

        List<Cliente> list = clienteService.listarClientes();
        return ResponseEntity.ok(list);
    }
}
