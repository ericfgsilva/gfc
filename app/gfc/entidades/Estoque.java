package gfc.entidades;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import play.db.ebean.Model;

public class Estoque extends Model{

@OneToMany
@JoinColumn(name = "produto")
@Column(nullable = false)
public Produto idProduto;

@Column(nullable = false)
public BigInteger quantidadeAbastecimento;

@Column(nullable = true)
public String dataAbastecimento;

}
