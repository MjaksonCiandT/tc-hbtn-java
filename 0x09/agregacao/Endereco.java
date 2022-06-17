public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(String rua_marechal_deodoro, String s, String s1, String santo_amaro, String sao_paulo, String sp, String brasil) {
        this.setLogradouro(rua_marechal_deodoro);
        this.setNumero(s);
        this.setComplemento(s1);
        this.setBairro(santo_amaro);
        this.setCidade(sao_paulo);
        this.setEstado(sp);
        this.setPais(brasil);
    }

    public String getLogradouro() {
        return this.logradouro;
    }
    public void setLogradouro(String rua_marechal_deodoro) {
        this.logradouro=rua_marechal_deodoro;
    }

    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String s) {
        this.numero=s;
    }

    public String getComplemento() {
        return this.complemento;
    }
    public void setComplemento(String s1) {
        this.complemento=s1;
    }

    public String getBairro() {
        return this.bairro;
    }
    public void setBairro(String santo_amaro) {
        this.bairro=santo_amaro;
    }

    public String getCidade() {
        return this.cidade;
    }
    public void setCidade(String sao_paulo) {
        this.cidade=sao_paulo;
    }

    public String getEstado() {
        return this.estado;
    }
    public void setEstado(String sp) {
        this.estado=sp;
    }

    public String getPais() {
        return this.pais;
    }
    public void setPais(String brasil) {
        this.pais=brasil;
    }
}