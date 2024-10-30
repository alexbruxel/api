package br.com.grazielabruxel.api.dto;

import br.com.grazielabruxel.api.dao.Cliente;

public class ClienteDTO {
    private String codigo;
    private String message;
    private Cliente data;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Cliente getData() {
        return data;
    }

    public void setData(Cliente data) {
        this.data = data;
    }
}
