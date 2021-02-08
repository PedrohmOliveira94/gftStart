import pacote.Circulo;
import pacote.Quadrado;
import pacote.Retangulo;

public class Teste {
    public static void main(String[] args) throws Exception {
        Quadrado q1 = new Quadrado(6);
        q1.AreaCalculavel();
        
        Retangulo r1 = new Retangulo(2, 4);
        r1.AreaCalculavel();

        Circulo c1 = new Circulo(4);
        c1.AreaCalculavel();
    }
}
