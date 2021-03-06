package com.bacapelo.primerapi.service
import com.bacapelo.primerapi.model.Asignatura
import com.bacapelo.primerapi.repository.AsignaturaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping

@Service
class AsignaturaService {
    @Autowired
    lateinit var asignaturaRepository: AsignaturaRepository
    fun list(): List<Asignatura> {

        return asignaturaRepository.findAll()
    }
    @PostMapping
    fun save  (asignatura: Asignatura): Asignatura {
        return asignaturaRepository.save(asignatura)
    }
    @PutMapping
    fun update (asignatura: Asignatura): Asignatura {
        return asignaturaRepository.save(asignatura)
    }
    fun updateDescripcion(asignatura: Asignatura): Asignatura {
        val response = asignaturaRepository.findById(asignatura.id)
                ?: throw Exception()
        response.apply {
            this.materia=asignatura.materia
        }
        return asignaturaRepository.save(response)
    }
    fun delete (id:Long): Boolean{
        asignaturaRepository.deleteById(id)
        return true
    }
}