package com.bacapelo.primerapi.model

import javax.persistence.*

@Entity
@Table(name = "client")
class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id : Long? = null

    var cedula : Long? = null
    var nombre : String? = null
    var apellido: String? = null
    var edad: String?=null
    var email: String? = null
}
