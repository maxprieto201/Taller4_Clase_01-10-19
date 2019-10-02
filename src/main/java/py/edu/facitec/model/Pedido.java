package py.edu.facitec.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido extends General {

	private Date fechaToma;
	private Date fechaEntrega;
	private BigDecimal total;

	@ManyToOne
	private Cliente cliente;

	@ManyToOne
	private Usuario usuario;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	// Pedido es el objeto contenido dentro de ItemPedido, es decir, pedido es un
	// objeto representado en esta clase
	@OneToMany(mappedBy = "pedido")
	private List<ItemPedido> itemPedidos;

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public List<ItemPedido> getItemPedidos() {
		return itemPedidos;
	}

	public void setItemPedidos(List<ItemPedido> itemPedidos) {
		this.itemPedidos = itemPedidos;
	}

	public Date getFechaToma() {
		return fechaToma;
	}

	public void setFechaToma(Date fechaToma) {
		this.fechaToma = fechaToma;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
