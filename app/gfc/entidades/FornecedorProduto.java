package gfc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import play.db.ebean.Model;

@Entity
public class FornecedorProduto extends Model{

	@ManyToMany
	@JoinColumn(name = "fornecedor")
	@Column(nullable = false)
	public Fornecedor idFornecedor;
	
	@ManyToMany
	@JoinColumn(name = "produto")
	@Column(nullable = false)
	public Produto idProduto;
}
