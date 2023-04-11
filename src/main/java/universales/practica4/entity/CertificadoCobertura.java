package universales.practica4.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;


@Entity
@Table(name = "CERTIFICADO_COBERTURA")
@Data
public class CertificadoCobertura implements Serializable{
	
	private static final long serialVersionUID = 1L;
	  @EmbeddedId
	    protected CertificadoCoberturaPK certificadoCoberturaPK;
	    @Column(name = "ESTADO")
	    private Character estado;
	    
	    @Column(name = "GRABACION_USUARIO")
	    private String grabacionUsuario;
	    
	    @Column(name = "GRABACION_FECHA")
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date grabacionFecha;
	    
	    @Column(name = "MODIFICACION_USUARIO")
	    private String modificacionUsuario;
	    
	    @Column(name = "MODIFICACION_FECHA")
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date modificacionFecha;
	    
	    @Column(name = "CERTIFICADOS_ID")
	    private BigDecimal certificadoId;
	    
	    @Column(name = "COBERTURAS_ID")
	    private BigDecimal coberturaId;
}
