package modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contatos", path = "contatos")
public interface ContatosRepositorio  extends JpaRepository<Contatos, Long>{

}
