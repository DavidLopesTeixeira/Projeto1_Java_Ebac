package br.com.davidlopes.dao;

import br.com.davidlopes.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    public boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    // buscarTodos -> retorna a collection de clitentes
    public Collection<Cliente> buscarTodos();

}
