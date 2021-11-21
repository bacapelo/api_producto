package com.bacapelo.primerapi.repository

import com.bacapelo.primerapi.model.Alumno
import com.bacapelo.primerapi.model.Docente

import org.springframework.data.jpa.repository.JpaRepository

interface DocenteRepository: JpaRepository<Docente, Long> {
    fun findById(id: Long?): Docente?

}