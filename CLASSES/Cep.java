package CLASSES;

import com.google.gson.annotations.SerializedName;

public class Cep {
    @SerializedName("cep")
    private String cep;
    @SerializedName("logradouro")
    private String logradouro;
    @SerializedName("complemento")
    private String complemento;
    @SerializedName("bairro")
    private String bairro;
    @SerializedName("localidade")
    private String localidade;
    @SerializedName("uf")
    private String uf;
    @SerializedName("ibge")
    private String ibge;
    @SerializedName("gia")
    private String gia;
    @SerializedName("ddd")
    private String ddd;
    @SerializedName("siafi")
    private String siafi;

    public Cep(String cep, String logradouro, String complemento,
    String bairro, String localidade, String uf, String ibge,
    String gia, String ddd, String siafi){

        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getIbge() {
        return ibge;
    }

    public String getGia() {
        return gia;
    }

    public String getDdd() {
        return ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    @Override
    public String toString(){
        return "("+"cep = "+this.cep+", logradouro = "+this.logradouro+", complemento = "+
        this.complemento+", bairro = "+this.bairro+", localidade = "+this.localidade+
        ", uf = "+this.uf+", ibge = "+this.ibge+", gia = "+this.gia+", ddd = "+
        this.ddd+", siafi = "+this.siafi+")";
    }
}
