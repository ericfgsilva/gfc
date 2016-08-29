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
public class Usuario extends Model {

@Id
@GeneratedValue(strategy = GenerationType.TABLE)
@Column(nullable = false)
public BigInteger idUsuario;

@Column(nullable = false)
public String nome;

@Column(nullable = false)
public String identificador;

@OneToOne
@JoinColumn(name = "tipo")
@Column(nullable = false)
public TipoUsuario idTipo;

	public static Finder<BigInteger, Usuario> find = new Finder<BigInteger, Usuario>(
			BigInteger.class, Usuario.class);
} 