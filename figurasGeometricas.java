package practicafigurasgeometricas;

public class figurasGeometricas {
    double area ;   
    public void calculoAreaCirculo(int x){
        double pi = 3.1416;
         area= pi*Math.pow(x, 2);
         System.out.println("--- Areas De Figuras Geometricas ---");
        System.out.println("Circulo : " + area);
    }    
        
    public void calculoAreaCuadrado(int x){    
        area = x*x;
        System.out.println("Cuadrado : " + area);
    }    
    public void calculoAreaTriangulo(int x, int y){
        area = (x*y)/2;
        System.out.println("Triangulo : " + area);
        
    }    
    public void calculoAreaRectangulo(int x, int y){
        area = x*y;;
        System.out.println("Rectangulo : " + area);
    }
    public void calculoAreaEsfera(int x){
    	double pi = 3.1416;
        area= 4 *pi*Math.pow(x, 2);
        System.out.println("Esfera : " + area);
        
    }    
    public void calculoAreaCubo(int x){
    	 area = 6*(x*x);
         System.out.println("Cubo : " + area);
    }

    public static void main(String[] args) {     
    	figurasGeometricas calc_Circulo = new figurasGeometricas();
    	calc_Circulo.calculoAreaCirculo(2);
        figurasGeometricas calc_Cuadrado = new figurasGeometricas();
        calc_Cuadrado.calculoAreaCuadrado(2);
        figurasGeometricas calc_Triangulo = new figurasGeometricas();
        calc_Triangulo.calculoAreaTriangulo(2,6);
        figurasGeometricas calc_Rectangulo = new figurasGeometricas();
        calc_Rectangulo.calculoAreaRectangulo(2,4);
        figurasGeometricas calc_Esfera = new figurasGeometricas();
        calc_Esfera.calculoAreaEsfera(2);
        figurasGeometricas calc_Cubo = new figurasGeometricas();
        calc_Cubo.calculoAreaCubo(2);
    }
    

}
