package com.lmoura.myApp.repository;

import com.lmoura.myApp.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {


}
