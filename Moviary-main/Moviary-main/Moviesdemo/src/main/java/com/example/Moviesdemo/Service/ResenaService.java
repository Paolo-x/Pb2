package com.example.Moviesdemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Moviesdemo.Model.Resena;
import com.example.Moviesdemo.Repository.ResenaRepository;

import java.util.List;

@Service
public class ResenaService {

    @Autowired
    private ResenaRepository resenaRepository;
    
    public Resena agregarResena(Resena resena){ //Agregar reseña

        return resenaRepository.save(resena);
    }

    public List<Resena> listResenas(){ //listar las reseñas por el usuairo
          
        
    }

    
}
