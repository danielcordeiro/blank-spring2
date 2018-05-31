package com.dgc.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dgc.domain.nosql.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}