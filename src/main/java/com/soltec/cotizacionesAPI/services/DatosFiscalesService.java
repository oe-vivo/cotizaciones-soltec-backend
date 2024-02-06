package com.soltec.cotizacionesAPI.services;

import com.soltec.cotizacionesAPI.model.DatosFiscales;
import com.soltec.cotizacionesAPI.repository.DatosFiscalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatosFiscalesService {

    private final DatosFiscalesRepository datosFiscalesRepository;

    @Autowired
    public DatosFiscalesService(DatosFiscalesRepository datosFiscalesRepository) {
        this.datosFiscalesRepository = datosFiscalesRepository;
    }

    public DatosFiscales saveDatosFiscales(DatosFiscales datosFiscales) {
        return datosFiscalesRepository.save(datosFiscales);
    }

    public Optional<DatosFiscales> getDatosFiscalesById(Long id) {
        return datosFiscalesRepository.findById(id);
    }

    public List<DatosFiscales> getAllDatosFiscales() {
        return datosFiscalesRepository.findAll();
    }

    public void deleteDatosFiscales(Long id) {
        datosFiscalesRepository.deleteById(id);
    }

    // Puedes añadir más métodos según la lógica de negocio.
}
