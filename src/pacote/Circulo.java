package pacote;

public class Circulo {
    int raio;
    double pi = 3.14;
    double resul;

    public Circulo(int r){
        raio = r;
    }
    public void AreaCalculavel(){
        resul = Math.pow(raio,2)*pi;
        System.out.println(resul);
    }
    
}
