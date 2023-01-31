package padroesprojetos.spring.gof.service;

import padroesprojetos.spring.gof.model.Cliente;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * Interface que define o padrão <b>Stategy</b> no domínio de cliente. Com isso,
 * se necessário, podemos ter multiplas implementações dessa mesma interface
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
