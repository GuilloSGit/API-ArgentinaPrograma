/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.APIBackend.controller;

import com.argentinaprograma.APIBackend.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author guille
 */
public interface TecnologiaController extends JpaRepository<Tecnologia, Long> {
    
}
