package pacote;

public class Retangulo {
    int ladoX, ladoY;

    public Retangulo(int x, int y){
        ladoX = x;
        ladoY = y;
    }
    public void AreaCalculavel(){
        System.out.println(ladoX*ladoY);
    }
    
}
