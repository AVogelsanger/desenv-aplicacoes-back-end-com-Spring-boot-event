package br.com.professorisidro.events.repo;

import br.com.professorisidro.events.model.Session;
import br.com.professorisidro.events.model.Subscription;
import br.com.professorisidro.events.model.SubscriptionID;
import br.com.professorisidro.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SubscriptionRepo extends ListCrudRepository<Subscription, SubscriptionID> {

    public List<Subscription> findByIdUser(User user);
    public List<Subscription> findByIdSession(Session session);
}
