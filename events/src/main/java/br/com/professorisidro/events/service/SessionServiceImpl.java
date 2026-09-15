package br.com.professorisidro.events.service;

import br.com.professorisidro.events.exception.NotFoundException;
import br.com.professorisidro.events.model.Session;
import br.com.professorisidro.events.repo.SessionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements ISessionService{

    private final SessionRepo repo;

    public SessionServiceImpl(SessionRepo repo) {
        this.repo = repo;
    }

    @Override
    public Session addSession(Session session) {
        return repo.save(session);
    }

    @Override
    public Session getSessionById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Session " + id + " not found!"));
    }

    @Override
    public List<Session> getAllSessions() {
        return repo.findAll();
    }
}
