package py.edu.facitec.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

//Especificando la clase padre
//Para utilizar el id en las demas clases
//Generar la tabla con este atributo
@MappedSuperclass
public abstract class General {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public General() {

	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "General [id=" + id + "]";
	}

}
