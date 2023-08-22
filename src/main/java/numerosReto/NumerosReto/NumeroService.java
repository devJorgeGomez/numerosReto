package numerosReto.NumerosReto;

public class NumeroService {

    public Integer obtenerTotal(Integer n){
        int numeroElegido=n;
        n=0;
        String stringNumber;

        for (int i=1; i<=numeroElegido;i++){

            stringNumber=String.valueOf(i);

            if(!stringNumber.startsWith("13")) {
                n++;
            }
        }
        return n;
    }
}
