package SigueTuCarrera.Becas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SigueTuCarrera.Becas.model.Becas;
import SigueTuCarrera.Becas.repository.BecasRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class BecasService {

    @Autowired
    private BecasRepository becasRepository;

     // Guardar beca
    public Becas guardarBeca(Becas beca) {
        return becasRepository.save(beca);
    }

    // Obtener todas las becas
    public List<Becas> obtenerBecas() {
        return becasRepository.findAll();
    }

    // Buscar por ID
    public Becas obtenerPorId(Long id) {
        return becasRepository.findById(id).orElse(null);
    }

    // Eliminar beca
    public void eliminarBeca(Long id) {
        becasRepository.deleteById(id);
    }

    // Actualizar beca
    public Becas actualizarBeca(Long id, Becas nuevaBeca) {

        Becas beca = becasRepository.findById(id).orElse(null);

        if (beca != null) {

            beca.setEstudianteId(nuevaBeca.getEstudianteId());
            beca.setNombreBeca(nuevaBeca.getNombreBeca());
            beca.setPorcentajeCobertura(nuevaBeca.getPorcentajeCobertura());
            beca.setMontoFijo(nuevaBeca.getMontoFijo());
            beca.setFechaVencimiento(nuevaBeca.getFechaVencimiento());
            beca.setEstadoBeneficio(nuevaBeca.getEstadoBeneficio());

            return becasRepository.save(beca);
        }

        return null;
    }
}
