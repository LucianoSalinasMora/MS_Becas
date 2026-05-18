package SigueTuCarrera.Becas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SigueTuCarrera.Becas.model.Becas;
import SigueTuCarrera.Becas.service.BecasService;

@RestController
@RequestMapping("/api/v0/becas")
public class BecasController {
@Autowired
    private BecasService becasService;

    @PostMapping
    public Becas guardar(@RequestBody Becas beca) {
        return becasService.guardarBeca(beca);
    }

    @GetMapping
    public List<Becas> listar() {
        return becasService.obtenerBecas();
    }

    @GetMapping("/{id}")
    public Becas buscarPorId(@PathVariable Long id) {
        return becasService.obtenerPorId(id);
    }

    @PutMapping("/{id}")
    public Becas actualizar(@PathVariable Long id, @RequestBody Becas beca) {

        return becasService.actualizarBeca(id, beca);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        becasService.eliminarBeca(id);
    }
}
