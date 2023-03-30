public class Coche {
    public int velocidad;

    public void acelerar_Francisco_andres_garcia_garcia(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_Francisco_andres_garcia_garcia(int deceleracion) {
        velocidad -= deceleracion;
        if(velocidad<0)velocidad=0;
    }
}
