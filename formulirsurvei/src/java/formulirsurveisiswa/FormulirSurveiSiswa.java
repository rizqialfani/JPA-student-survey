/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulirsurveisiswa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "formulir_survei_siswa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormulirSurveiSiswa.findAll", query = "SELECT f FROM FormulirSurveiSiswa f")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByNisn", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.nisn = :nisn")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByNama", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.nama = :nama")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByAlamatSiswa", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.alamatSiswa = :alamatSiswa")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByTtl", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.ttl = :ttl")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByJenisKelamin", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByNamaSekolah", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.namaSekolah = :namaSekolah")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByAlamatSekolah", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.alamatSekolah = :alamatSekolah")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByPertanyaan1", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.pertanyaan1 = :pertanyaan1")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByPertanyaan2", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.pertanyaan2 = :pertanyaan2")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByPertanyaan3", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.pertanyaan3 = :pertanyaan3")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByPertanyaan4", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.pertanyaan4 = :pertanyaan4")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByPertanyaan5", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.pertanyaan5 = :pertanyaan5")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByPertanyaan6", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.pertanyaan6 = :pertanyaan6")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByPertanyaan7", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.pertanyaan7 = :pertanyaan7")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByPertanyaan8", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.pertanyaan8 = :pertanyaan8")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByPertanyaan9", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.pertanyaan9 = :pertanyaan9")
    , @NamedQuery(name = "FormulirSurveiSiswa.findByPertanyaan10", query = "SELECT f FROM FormulirSurveiSiswa f WHERE f.pertanyaan10 = :pertanyaan10")})
public class FormulirSurveiSiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "NISN")
    private String nisn;
    @Size(max = 56)
    @Column(name = "nama")
    private String nama;
    @Size(max = 56)
    @Column(name = "alamat_Siswa")
    private String alamatSiswa;
    @Size(max = 100)
    @Column(name = "TTL")
    private String ttl;
    @Size(max = 20)
    @Column(name = "jenis_Kelamin")
    private String jenisKelamin;
    @Size(max = 56)
    @Column(name = "nama_Sekolah")
    private String namaSekolah;
    @Size(max = 56)
    @Column(name = "alamat_Sekolah")
    private String alamatSekolah;
    @Size(max = 600)
    @Column(name = "pertanyaan_1")
    private String pertanyaan1;
    @Size(max = 600)
    @Column(name = "pertanyaan_2")
    private String pertanyaan2;
    @Size(max = 600)
    @Column(name = "pertanyaan_3")
    private String pertanyaan3;
    @Size(max = 600)
    @Column(name = "pertanyaan_4")
    private String pertanyaan4;
    @Size(max = 500)
    @Column(name = "pertanyaan_5")
    private String pertanyaan5;
    @Size(max = 500)
    @Column(name = "pertanyaan_6")
    private String pertanyaan6;
    @Size(max = 500)
    @Column(name = "pertanyaan_7")
    private String pertanyaan7;
    @Size(max = 500)
    @Column(name = "pertanyaan_8")
    private String pertanyaan8;
    @Size(max = 500)
    @Column(name = "pertanyaan_9")
    private String pertanyaan9;
    @Size(max = 500)
    @Column(name = "pertanyaan_10")
    private String pertanyaan10;

    public FormulirSurveiSiswa() {
    }

    public FormulirSurveiSiswa(String nisn) {
        this.nisn = nisn;
    }

    public String getNisn() {
        return nisn;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamatSiswa() {
        return alamatSiswa;
    }

    public void setAlamatSiswa(String alamatSiswa) {
        this.alamatSiswa = alamatSiswa;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public String getAlamatSekolah() {
        return alamatSekolah;
    }

    public void setAlamatSekolah(String alamatSekolah) {
        this.alamatSekolah = alamatSekolah;
    }

    public String getPertanyaan1() {
        return pertanyaan1;
    }

    public void setPertanyaan1(String pertanyaan1) {
        this.pertanyaan1 = pertanyaan1;
    }

    public String getPertanyaan2() {
        return pertanyaan2;
    }

    public void setPertanyaan2(String pertanyaan2) {
        this.pertanyaan2 = pertanyaan2;
    }

    public String getPertanyaan3() {
        return pertanyaan3;
    }

    public void setPertanyaan3(String pertanyaan3) {
        this.pertanyaan3 = pertanyaan3;
    }

    public String getPertanyaan4() {
        return pertanyaan4;
    }

    public void setPertanyaan4(String pertanyaan4) {
        this.pertanyaan4 = pertanyaan4;
    }

    public String getPertanyaan5() {
        return pertanyaan5;
    }

    public void setPertanyaan5(String pertanyaan5) {
        this.pertanyaan5 = pertanyaan5;
    }

    public String getPertanyaan6() {
        return pertanyaan6;
    }

    public void setPertanyaan6(String pertanyaan6) {
        this.pertanyaan6 = pertanyaan6;
    }

    public String getPertanyaan7() {
        return pertanyaan7;
    }

    public void setPertanyaan7(String pertanyaan7) {
        this.pertanyaan7 = pertanyaan7;
    }

    public String getPertanyaan8() {
        return pertanyaan8;
    }

    public void setPertanyaan8(String pertanyaan8) {
        this.pertanyaan8 = pertanyaan8;
    }

    public String getPertanyaan9() {
        return pertanyaan9;
    }

    public void setPertanyaan9(String pertanyaan9) {
        this.pertanyaan9 = pertanyaan9;
    }

    public String getPertanyaan10() {
        return pertanyaan10;
    }

    public void setPertanyaan10(String pertanyaan10) {
        this.pertanyaan10 = pertanyaan10;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nisn != null ? nisn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormulirSurveiSiswa)) {
            return false;
        }
        FormulirSurveiSiswa other = (FormulirSurveiSiswa) object;
        if ((this.nisn == null && other.nisn != null) || (this.nisn != null && !this.nisn.equals(other.nisn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formulirsurveisiswa.FormulirSurveiSiswa[ nisn=" + nisn + " ]";
    }
    
}
