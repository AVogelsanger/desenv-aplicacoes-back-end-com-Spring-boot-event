package br.com.professorisidro.events.controller;

import br.com.professorisidro.events.model.Session;
import br.com.professorisidro.events.model.Subscription;
import br.com.professorisidro.events.model.User;
import br.com.professorisidro.events.service.ISubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubscriptionController {

    private final ISubscriptionService service;

    public SubscriptionController(ISubscriptionService service) {
        this.service = service;
    }

    @PostMapping("/subscription")
    public ResponseEntity<Subscription> addSubscription(@RequestBody Subscription subscription) {
        return ResponseEntity.status(201).body(service.addSubscription(subscription));
    }

    @GetMapping("/subscriptions/user/{id}")
    public ResponseEntity<List<Subscription>> getByUser(@PathVariable Integer id) {
        User user = new User();
        user.setUserId(id);
        return ResponseEntity.ok(service.getAllByUser(user));
    }

    @GetMapping("/subscriptions/session/{id}")
    public ResponseEntity<List<Subscription>> getBySession(@PathVariable Integer id) {
        Session session = new Session();
        session.setIdSession(id);
        return ResponseEntity.ok(service.getAllBySession(session));
    }
}
