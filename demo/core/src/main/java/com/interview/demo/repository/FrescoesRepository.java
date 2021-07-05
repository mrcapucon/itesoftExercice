/*
 * Copyright (c) 2016 Bull/Atos.
 * All rights reserved.
 */
package com.interview.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interview.demo.entity.Frescoes;

/**
 * [Enter type description here].
 *
 * @author Bull/Atos
 */
@Repository
public interface FrescoesRepository  extends JpaRepository<Frescoes, Long> {
}
