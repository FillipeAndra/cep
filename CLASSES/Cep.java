package CLASSES;

public class Cep {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
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

    public Cep(CepAPI cepAPI){
        try{
            this.cep = cepAPI.cep();
            this.logradouro = cepAPI.logradouro();
            this.complemento = cepAPI.complemento();
            this.bairro = cepAPI.bairro();
            this.localidade = cepAPI.localidade();
            this.uf = cepAPI.uf();
            this.ibge = cepAPI.ibge();
            this.gia = cepAPI.gia();
            this.ddd = cepAPI.ddd();
            this.siafi = cepAPI.siafi();
        }catch(NullPointerException e){
            System.out.println("algo está vazio");
        }
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
