package br.org.cac.tiss.suporte.model;
// Generated 09/06/2016 19:01:50 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CgBrasindice generated by hbm2java
 */
@Entity
@Table(name = "CG_BRASINDICE", schema = "dbo", catalog = "CacDb")
public class CgBrasindice implements java.io.Serializable {

	private int idBrasindice;
	private String codBrasindice;
	private String codLaboratorio;
	private String nomeLaboratorio;
	private String codigo;
	private String nome;
	private String codApresentacao;
	private String nomeApresentacao;
	private String codBarras;
	private Integer idTipoTabela;
	private String codTuss;
	private boolean FGenerico;
	private String DTipo;
	private String codHierMaterial;
	private Date dtInclusao;
	private Date dtExclusao;
	private int idEdicao;
	private Date timestamp;

	public CgBrasindice() {
	}

	public CgBrasindice(int idBrasindice, String codBrasindice, String codLaboratorio, String nomeLaboratorio,
			String codigo, String nome, String codApresentacao, String nomeApresentacao, boolean FGenerico,
			String DTipo, Date dtInclusao, int idEdicao, Date timestamp) {
		this.idBrasindice = idBrasindice;
		this.codBrasindice = codBrasindice;
		this.codLaboratorio = codLaboratorio;
		this.nomeLaboratorio = nomeLaboratorio;
		this.codigo = codigo;
		this.nome = nome;
		this.codApresentacao = codApresentacao;
		this.nomeApresentacao = nomeApresentacao;
		this.FGenerico = FGenerico;
		this.DTipo = DTipo;
		this.dtInclusao = dtInclusao;
		this.idEdicao = idEdicao;
		this.timestamp = timestamp;
	}

	public CgBrasindice(int idBrasindice, String codBrasindice, String codLaboratorio, String nomeLaboratorio,
			String codigo, String nome, String codApresentacao, String nomeApresentacao, String codBarras,
			Integer idTipoTabela, String codTuss, boolean FGenerico, String DTipo, String codHierMaterial,
			Date dtInclusao, Date dtExclusao, int idEdicao, Date timestamp) {
		this.idBrasindice = idBrasindice;
		this.codBrasindice = codBrasindice;
		this.codLaboratorio = codLaboratorio;
		this.nomeLaboratorio = nomeLaboratorio;
		this.codigo = codigo;
		this.nome = nome;
		this.codApresentacao = codApresentacao;
		this.nomeApresentacao = nomeApresentacao;
		this.codBarras = codBarras;
		this.idTipoTabela = idTipoTabela;
		this.codTuss = codTuss;
		this.FGenerico = FGenerico;
		this.DTipo = DTipo;
		this.codHierMaterial = codHierMaterial;
		this.dtInclusao = dtInclusao;
		this.dtExclusao = dtExclusao;
		this.idEdicao = idEdicao;
		this.timestamp = timestamp;
	}

	@Id

	@Column(name = "id_brasindice", unique = true, nullable = false)
	public int getIdBrasindice() {
		return this.idBrasindice;
	}

	public void setIdBrasindice(int idBrasindice) {
		this.idBrasindice = idBrasindice;
	}

	@Column(name = "cod_brasindice", nullable = false, length = 10)
	public String getCodBrasindice() {
		return this.codBrasindice;
	}

	public void setCodBrasindice(String codBrasindice) {
		this.codBrasindice = codBrasindice;
	}

	@Column(name = "cod_laboratorio", nullable = false, length = 3)
	public String getCodLaboratorio() {
		return this.codLaboratorio;
	}

	public void setCodLaboratorio(String codLaboratorio) {
		this.codLaboratorio = codLaboratorio;
	}

	@Column(name = "nome_laboratorio", nullable = false, length = 37)
	public String getNomeLaboratorio() {
		return this.nomeLaboratorio;
	}

	public void setNomeLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
	}

	@Column(name = "codigo", nullable = false, length = 5)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "nome", nullable = false, length = 80)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "cod_apresentacao", nullable = false, length = 4)
	public String getCodApresentacao() {
		return this.codApresentacao;
	}

	public void setCodApresentacao(String codApresentacao) {
		this.codApresentacao = codApresentacao;
	}

	@Column(name = "nome_apresentacao", nullable = false, length = 150)
	public String getNomeApresentacao() {
		return this.nomeApresentacao;
	}

	public void setNomeApresentacao(String nomeApresentacao) {
		this.nomeApresentacao = nomeApresentacao;
	}

	@Column(name = "cod_barras", length = 13)
	public String getCodBarras() {
		return this.codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	@Column(name = "id_tipo_tabela")
	public Integer getIdTipoTabela() {
		return this.idTipoTabela;
	}

	public void setIdTipoTabela(Integer idTipoTabela) {
		this.idTipoTabela = idTipoTabela;
	}

	@Column(name = "cod_TUSS", length = 8)
	public String getCodTuss() {
		return this.codTuss;
	}

	public void setCodTuss(String codTuss) {
		this.codTuss = codTuss;
	}

	@Column(name = "f_generico", nullable = false)
	public boolean isFGenerico() {
		return this.FGenerico;
	}

	public void setFGenerico(boolean FGenerico) {
		this.FGenerico = FGenerico;
	}

	@Column(name = "d_tipo", nullable = false, length = 2)
	public String getDTipo() {
		return this.DTipo;
	}

	public void setDTipo(String DTipo) {
		this.DTipo = DTipo;
	}

	@Column(name = "cod_Hier_material", length = 4)
	public String getCodHierMaterial() {
		return this.codHierMaterial;
	}

	public void setCodHierMaterial(String codHierMaterial) {
		this.codHierMaterial = codHierMaterial;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_inclusao", nullable = false, length = 23)
	public Date getDtInclusao() {
		return this.dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_exclusao", length = 23)
	public Date getDtExclusao() {
		return this.dtExclusao;
	}

	public void setDtExclusao(Date dtExclusao) {
		this.dtExclusao = dtExclusao;
	}

	@Column(name = "id_edicao", nullable = false)
	public int getIdEdicao() {
		return this.idEdicao;
	}

	public void setIdEdicao(int idEdicao) {
		this.idEdicao = idEdicao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", nullable = false, length = 23)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
