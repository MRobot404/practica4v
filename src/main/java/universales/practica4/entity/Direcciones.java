package universales.practica4.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.Data;

@Entity
@Table(name = "DIRECCIONES")
@Data
public class Direcciones implements Serializable {
	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "ID", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq2"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SEGUNIS") })
	@Id
	@Basic(optional = false)
	@Column(name = "ID")
	private BigDecimal id;
	
	@Column(name = "DIRECCION")
	private String direccion;
	
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
	
	@Column(name = "CLIENTES_ID")
	private BigDecimal clienteId;

}
