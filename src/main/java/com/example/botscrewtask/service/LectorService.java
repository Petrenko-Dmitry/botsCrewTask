package com.example.botscrewtask.service;

import com.example.botscrewtask.repository.LectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectorService {

    @Autowired
    private LectorRepository lectorRepository;

    public List<String> globalSearch(String template) {
        return this.lectorRepository.findByNameContainingIgnoreCase(template);
    }
}
