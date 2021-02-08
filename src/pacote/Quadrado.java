package pacote;

public class Quadrado {
    int lado;

    public Quadrado(int x){
        lado = x;
    }
    public void AreaCalculavel(){
        System.out.println(lado*lado);
    }
}