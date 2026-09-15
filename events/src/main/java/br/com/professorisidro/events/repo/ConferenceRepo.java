package br.com.professorisidro.events.repo;

import br.com.professorisidro.events.model.Conference;
import org.springframework.data.repository.ListCrudRepository;

public interface ConferenceRepo extends ListCrudRepository<Conference, Integer> {
}
