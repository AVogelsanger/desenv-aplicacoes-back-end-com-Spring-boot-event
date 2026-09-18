package br.com.professorisidro.events.controller;

import br.com.professorisidro.events.model.Conference;
import br.com.professorisidro.events.service.IConferenceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConferenceController {

    private final IConferenceService service;

    public ConferenceController(IConferenceService service) {
        this.service = service;
    }

    @PostMapping("/conferences")
    public ResponseEntity<Conference> addConference(@RequestBody Conference conference) {
        return ResponseEntity.status(201).body(service.addConference(conference));
    }
}
