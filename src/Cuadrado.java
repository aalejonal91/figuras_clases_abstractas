public class Cuadrado extends Figura {
        private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
        /* ó este otro metodo tambien
        double area;
        area=lado*lado
         return area;*/
    }

    @Override
    public String toString() {
        return "Cuadrado{" +"color= " + super.getColor()+
                "lado= " + lado +
                '}';
    }
}
