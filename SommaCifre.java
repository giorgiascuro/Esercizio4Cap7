public class SommaCifre {
    public static int sommaCifre(int numero) {
        int somma;
        if(numero > 10) 
            somma = sommaCifre(numero / 10) + numero % 10;
        else
            somma = numero;
        return somma;
    }
}
            