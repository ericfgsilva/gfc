package gfc.entidades;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import play.db.ebean.Model;

@Entity
public class Fornecedor extends Model{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(nullable = false)
	public BigInteger idFornecedor;
	@Column(nullable = false)
	public String nome;
	@OneToOne
	@JoinColumn(name = "tipo")
	@Column(nullable = false)
	public TipoFornecedor idTipo;

	public static Finder<BigInteger, Fornecedor> find = new Finder<BigInteger, Fornecedor>(
			BigInteger.class, Fornecedor.class);
}
