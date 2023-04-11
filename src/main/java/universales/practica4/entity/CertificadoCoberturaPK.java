package universales.practica4.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;

import lombok.Data;

@Embeddable
@Data
public class CertificadoCoberturaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Basic(optional = false)
	@Column(name = "CERTIFICADO_ID")
	private BigInteger certificadoId;

	@Basic(optional = false)
	@Column(name = "COBERTURA_ID")
	private BigInteger coberturaId;

}
