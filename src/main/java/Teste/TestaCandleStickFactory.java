package Teste;

import model.CandleStick;
import model.Negocio;
import reader.CandleStickFactory;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TestaCandleStickFactory {
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();

        Negocio negocio1 = new Negocio(40.5, 100, hoje);
        Negocio negocio2 = new Negocio(45.0, 100, hoje);
        Negocio negocio3 = new Negocio(39.8, 100, hoje);
        Negocio negocio4 = new Negocio(42.4, 100, hoje);


        List<Negocio> negocios = Arrays.asList(negocio1, negocio2, negocio3, negocio4);

        CandleStickFactory fabrica = new CandleStickFactory();
        CandleStick candle = fabrica.constroiCandleParaData(hoje, negocios);

        System.out.println(candle.getAbertura());
        System.out.println(candle.getFechamento());
        System.out.println(candle.getMinimo());
        System.out.println(candle.getMaximo());
        System.out.println(candle.getVolume());
    }
}
