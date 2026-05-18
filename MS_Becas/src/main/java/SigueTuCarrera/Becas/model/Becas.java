package SigueTuCarrera.Becas.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Becas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long becaId;
    
    private String estudianteId;
    private String nombreBeca;
    private Double porcentajeCobertura;
    private Double montoFijo;     
    private LocalDate fechaVencimiento;
    
    @Enumerated(EnumType.STRING)
    private EstadoBeneficio estadoBeneficio;

    public enum EstadoBeneficio {
        ACTIVO, SUSPENDIDO, REVOCADO, VENCIDO
    }
}
