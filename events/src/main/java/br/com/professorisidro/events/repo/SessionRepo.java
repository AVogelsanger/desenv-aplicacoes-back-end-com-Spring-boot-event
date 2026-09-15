package br.com.professorisidro.events.repo;

import br.com.professorisidro.events.model.Session;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepo extends ListCrudRepository<Session, Integer> {
}
