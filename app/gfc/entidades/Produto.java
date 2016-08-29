package gfc.entidades;

import java.math.BigInteger;
import br.com.rss.gfc.negocio.excecoes.*;
import br.com.rss.gfc.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;

@Entity
public class Produto extends Model {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(nullable = false)
	public BigInteger idProduto;

	@Column(nullable = false)
	public String nome;

	@ManyToOne
	@JoinColumn(name = "tipo")
	@Column(nullable = false)
	public TipoProduto idTipo;

	public static Finder<BigInteger, Produto> find = new Finder<BigInteger, Produto>(
			BigInteger.class, Produto.class);

	public Produto cadastrar(Produto produto) throws ProdutoJaCadastradoException, CampoObrigatorioNaoPreenchidoException{
		if (nome != null && !nome.isEmpty()) {
			String validaNome = Funcoes.removeCaracteresEspeciais(nome);
			nome = validaNome;
			Produto.find.where().eq("nome", nome).findUnique();

			if (produto == null) {
				produto = new Produto();
				produto.nome = nome;
				produto.idTipo = idTipo;
				this.save();
				return produto;
			}
		}
		return produto;
	}
	
	public Produto atualizar(Produto produto) throws CampoObrigatorioNaoPreenchidoException, ProdutoInvalidoException, ProdutoNaoCadastradoException{
		
		
		
		
		
		
		
		
		
		
		
		
		
		return produto;
		
	}
}
