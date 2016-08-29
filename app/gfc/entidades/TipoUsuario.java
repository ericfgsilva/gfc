package gfc.entidades;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoUsuario {

@Id
@GeneratedValue(strategy = GenerationType.TABLE)
@Column(nullable = false)
public BigInteger idTipo;

@Column(nullable = false)
public String descricao;


}
