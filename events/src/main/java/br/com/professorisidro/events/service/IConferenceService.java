package br.com.professorisidro.events.service;

import br.com.professorisidro.events.model.Conference;

import java.util.List;

public interface IConferenceService {
    public Conference addConference(Conference conference);
    public Conference getConferenceById(Integer id);
    public List<Conference> getAllConferences();
}
