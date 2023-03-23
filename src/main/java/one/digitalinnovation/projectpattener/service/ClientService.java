package one.digitalinnovation.projectpattener.service;

import one.digitalinnovation.projectpattener.model.Cliente;

public interface ClientService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);
    void insert(Cliente client);
    void update(Long id, Cliente cliente);
    void delete(Long id);
}
