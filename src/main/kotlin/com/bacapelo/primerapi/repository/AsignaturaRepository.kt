package com.bacapelo.primerapi.repository

import com.bacapelo.primerapi.model.Alumno
import com.bacapelo.primerapi.model.Asignatura

import org.springframework.data.jpa.repository.JpaRepository

interface AsignaturaRepository: JpaRepository<Asignatura, Long> {
    fun findById(id: Long?): Asignatura?

}