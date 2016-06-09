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
 * CgMaterialOpme generated by hbm2java
 */
@Entity
@Table(name = "CG_MATERIAL_OPME", schema = "dbo", catalog = "CacDb")
public class CgMaterialOpme implements java.io.Serializable {

	private int idMaterialOpme;
	private int idMaterialAns;
	private int idTipoTabela;
	private String descricao;
	private String refFabricante;
	private String fabricante;
	private String registroAnvisa;
	private String classeRisco;
	private Character DTipo;
	private Boolean FAutorizacaoPrevia;
	private Date dtInicio;
	private Date dtFim;
	private Date timestamp;

	public CgMaterialOpme() {
	}

	public CgMaterialOpme(int idMaterialOpme, int idMaterialAns, int idTipoTabela, String descricao, String fabricante,
			Date dtInicio, Date timestamp) {
		this.idMaterialOpme = idMaterialOpme;
		this.idMaterialAns = idMaterialAns;
		this.idTipoTabela = idTipoTabela;
		this.descricao = descricao;
		this.fabricante = fabricante;
		this.dtInicio = dtInicio;
		this.timestamp = timestamp;
	}

	public CgMaterialOpme(int idMaterialOpme, int idMaterialAns, int idTipoTabela, String descricao,
			String refFabricante, String fabricante, String registroAnvisa, String classeRisco, Character DTipo,
			Boolean FAutorizacaoPrevia, Date dtInicio, Date dtFim, Date timestamp) {
		this.idMaterialOpme = idMaterialOpme;
		this.idMaterialAns = idMaterialAns;
		this.idTipoTabela = idTipoTabela;
		this.descricao = descricao;
		this.refFabricante = refFabricante;
		this.fabricante = fabricante;
		this.registroAnvisa = registroAnvisa;
		this.classeRisco = classeRisco;
		this.DTipo = DTipo;
		this.FAutorizacaoPrevia = FAutorizacaoPrevia;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.timestamp = timestamp;
	}

	@Id

	@Column(name = "id_material_opme", unique = true, nullable = false)
	public int getIdMaterialOpme() {
		return this.idMaterialOpme;
	}

	public void setIdMaterialOpme(int idMaterialOpme) {
		this.idMaterialOpme = idMaterialOpme;
	}

	@Column(name = "id_material_ans", nullable = false)
	public int getIdMaterialAns() {
		return this.idMaterialAns;
	}

	public void setIdMaterialAns(int idMaterialAns) {
		this.idMaterialAns = idMaterialAns;
	}

	@Column(name = "id_tipo_tabela", nullable = false)
	public int getIdTipoTabela() {
		return this.idTipoTabela;
	}

	public void setIdTipoTabela(int idTipoTabela) {
		this.idTipoTabela = idTipoTabela;
	}

	@Column(name = "descricao", nullable = false, length = 150)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "ref_fabricante", length = 100)
	public String getRefFabricante() {
		return this.refFabricante;
	}

	public void setRefFabricante(String refFabricante) {
		this.refFabricante = refFabricante;
	}

	@Column(name = "fabricante", nullable = false, length = 110)
	public String getFabricante() {
		return this.fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Column(name = "registro_anvisa", length = 20)
	public String getRegistroAnvisa() {
		return this.registroAnvisa;
	}

	public void setRegistroAnvisa(String registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}

	@Column(name = "classe_risco", length = 4)
	public String getClasseRisco() {
		return this.classeRisco;
	}

	public void setClasseRisco(String classeRisco) {
		this.classeRisco = classeRisco;
	}

	@Column(name = "d_tipo", length = 1)
	public Character getDTipo() {
		return this.DTipo;
	}

	public void setDTipo(Character DTipo) {
		this.DTipo = DTipo;
	}

	@Column(name = "f_autorizacao_previa")
	public Boolean getFAutorizacaoPrevia() {
		return this.FAutorizacaoPrevia;
	}

	public void setFAutorizacaoPrevia(Boolean FAutorizacaoPrevia) {
		this.FAutorizacaoPrevia = FAutorizacaoPrevia;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_inicio", nullable = false, length = 23)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_fim", length = 23)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
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
