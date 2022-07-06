package provedores;

public class Sedex  implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double resultado = 0 ;

        if(peso > 1000){
            resultado =valor * 1.10;
        }else {
            resultado = valor*0.05;
        }
        return new Frete(resultado,obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
