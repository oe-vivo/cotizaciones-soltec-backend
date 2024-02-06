package com.soltec.cotizacionesAPI.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import com.soltec.cotizacionesAPI.model.Mayorista;
import com.soltec.cotizacionesAPI.repository.MayoristaRepository;

@Service
public class MayoristaService {

    private final MayoristaRepository mayoristaRepository;

    @Autowired
    public MayoristaService(MayoristaRepository mayoristaRepository) {
        this.mayoristaRepository = mayoristaRepository;
    }

    public Mayorista saveMayorista(Mayorista mayorista) {
        return mayoristaRepository.save(mayorista);
    }

    public Optional<Mayorista> getMayoristaById(Long id) {
        return mayoristaRepository.findById(id);
    }

    public List<Mayorista> getAllMayoristas() {
        return mayoristaRepository.findAll();
    }

    public void deleteMayorista(Long id) {
        mayoristaRepository.deleteById(id);
    }

    // Puedes añadir más métodos según la lógica de negocio.
}