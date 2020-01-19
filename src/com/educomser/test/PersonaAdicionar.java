
package com.educomser.test;

import com.educomser.entity.Persona;
import com.educomser.entity.dao.PersonaDao;
import com.educomser.entity.dao.impl.PersonaDaoImpl;
import com.educomser.util.HibernateUtil;
import java.util.Date;

public class PersonaAdicionar {

  
    public static void main(String[] args) {
        Persona p=new Persona();
        
        p.setNombre("elv");
        p.setSueldo(300);
        p.setContrato(true);
        p.setFechaNacimiento( new Date());
        
        System.out.println(p);
        //creamos el Dao
         PersonaDao perDao=new PersonaDaoImpl();
         perDao.create(p);
         //esta funcion solo usamos en alplicacion de  escertirio
         HibernateUtil.closeSessionFactory();
        
        
    }
    
}
