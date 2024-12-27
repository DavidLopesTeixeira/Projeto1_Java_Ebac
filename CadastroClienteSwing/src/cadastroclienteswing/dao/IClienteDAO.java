/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroclienteswing.dao;

import cadastroclienteswing.domain.Cliente;
import java.util.Collection;

/**
 *
 * @author david
 */
public interface IClienteDAO {
    public boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    // buscarTodos -> retorna a collection de clitentes
    public Collection<Cliente> buscarTodos();
}
