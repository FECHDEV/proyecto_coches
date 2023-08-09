package com.project.coches.domain.service;

import com.project.coches.domain.dto.MarcaCocheDto;
import com.project.coches.domain.repository.IMarcaCocheRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio de marca coche
 */
@RequiredArgsConstructor
@Service
public class MarcaCocheService implements IMarcaCocheService{

    /**
     * Repositorio de marca coche
     */
    private final IMarcaCocheRepository iMarcaCocheRepository;

    /**
     * Devuelve una lista de todas las marcas de coches
     * @return Lista de marcas de coches
     */
    @Override
    public List<MarcaCocheDto> getAll() {
        return iMarcaCocheRepository.getAll();
    }

    /**
     * Devuelve una marca de coche dada su id
     * @param id Id de marca coche
     * @return Optional del marca coche encontrado
     */
    @Override
    public Optional<MarcaCocheDto> getMarcaCoche(Integer id) {
        return iMarcaCocheRepository.getMarcaCoche(id);
    }

    /**
     * Guarda una nueva marca coche
     * @param newMarcaCoche Marca coche a guardar
     * @return Marca coche guardada
     */
    @Override
    public MarcaCocheDto save(MarcaCocheDto newMarcaCoche) {
        return iMarcaCocheRepository.save(newMarcaCoche);
    }

    /**
     * Elimina una marca coche dada su id
     * @param idMarcaCoche Id del marca coche a eliminar
     * @return true si se elimino, false de lo contrario
     */
    @Override
    public boolean delete(Integer idMarcaCoche) {
        try {
            iMarcaCocheRepository.delete(idMarcaCoche);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
