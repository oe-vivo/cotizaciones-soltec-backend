package com.soltec.cotizacionesAPI.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import com.soltec.cotizacionesAPI.model.Mayorista;
import com.soltec.cotizacionesAPI.repository.MayoristaRepository;

@Service
public class MayoristaService {

    @Autowired
    private MayoristaRepository mayoristaRepository;

    public List<Mayorista> findAll() {
        return mayoristaRepository.findAll();
    }

    public Optional<Mayorista> findById(Long id) {
        return mayoristaRepository.findById(id);
    }

    public Mayorista save(Mayorista mayorista) {
        return mayoristaRepository.save(mayorista);
    }

    public void delete(Long id) {
        mayoristaRepository.deleteById(id);
    }

    // Aquí puedes añadir más métodos según lo necesites
}

