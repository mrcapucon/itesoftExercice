/*
 * Copyright (c) 2016 Bull/Atos.
 * All rights reserved.
 */
package com.interview.demo.rest.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.demo.entity.Frescoes;
import com.interview.demo.repository.FrescoesRepository;


/**
 * [Enter type description here].
 *
 * @author Bull/Atos
 */
@RestController
@RequestMapping("/frescoes")
public class FrescoesService {

    /**
     * The Frescoe repository.
     */
    @Autowired
    FrescoesRepository frescoesRepository;

    /**
     * Gets fresque.
     *
     * @param id the id
     * @return the fresque
     */
    @GetMapping("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Frescoes getFresque(@PathVariable Long id) {
        final Optional<Frescoes> fresque = this.frescoesRepository.findById(id);
        if (fresque.isPresent()) return fresque.get();
        return null;
    }

    /**
     * Gets all fresques.
     *
     * @return the fresques
     */
    @GetMapping
    @Produces(MediaType.APPLICATION_JSON)
    public List<Frescoes> getAllFresques() {
        return this.frescoesRepository.findAll();
    }

    /**
     * Gets all fresques sorted annee creation.
     *
     * @return the fresques
     */
    @GetMapping("/sortedAnnee")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Frescoes> getAllFresquesSortedAnneeCreation() {
        return  this.frescoesRepository.findAll(Sort.by(Sort.Direction.ASC,"anneeCreation"));
    }

    /**
     * Delete response.
     *
     * @param id the id
     * @return the response
     */
    @DeleteMapping(value="/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@PathVariable("id") final Long id) {
        this.frescoesRepository.deleteById(id);
        return Response.ok().build();
    }
}
