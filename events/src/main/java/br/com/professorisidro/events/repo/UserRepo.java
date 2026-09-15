package br.com.professorisidro.events.repo;

import br.com.professorisidro.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserRepo extends ListCrudRepository<User, Integer> {

    public Optional<User> findByEmail(String email);
}
