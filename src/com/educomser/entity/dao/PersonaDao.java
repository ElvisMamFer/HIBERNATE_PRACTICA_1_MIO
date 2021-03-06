package com.educomser.entity.dao;

import com.educomser.entity.Persona;
import java.util.List;

public interface PersonaDao {
    
    public  void create(Persona persona);
    public  void update(Persona persona);
    public  void delete(Persona persona);
       public  List<Persona> getAll();

    public Persona findById(int id);
}
