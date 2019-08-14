package br.univille.poo.programacaoestruturada.registro;

public class HoraMinutoUtil {
	

	public static void acrescentaMinutos(HoraMinuto h, int minutos) {
		while (minutos>0){
			if (minutos>=60){
				h.hora = h.hora+1;
				minutos=minutos-60;
			} else {
				h.minuto = h.minuto + minutos;
				minutos=0;
			}
		}
	}

}
