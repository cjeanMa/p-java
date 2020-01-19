public class Numeros {
    private int x, y, z;
    
    public Numeros(int x){
        this.x = x;
    };
    public Numeros(int x, int y){
        this(x);
        this.y = y;
    };
    public Numeros(int x, int y, int z){
        this(x, y);
        this.z = z;
    };
    public void calcularIgualdad(){
        if(this.x == this.y){
            System.out.println("SON IGUALES");
        }
        else{
            System.out.println("NO SON IGUALES");
        }
            
    }
    public void calcularPositividad(){
        if (this.x >= 0) {
            System.out.println("ES POSITIVO");
        }
        else
            System.out.println("ES NEGATIVO");
    }
    public void calcularMultiplo(){
        if(this.x%this.y==0 || this.y%this.x==0){
            System.out.println("SI EXISTE MULTIPLICIDAD");
        }
        else{
            System.out.println("NO EXISTE MULTIPLICIDAD");
        }
    }
    public void calcularMayor(){
        if (this.x > this.y) {
            System.out.println("EL VALOR MAYOR ES:"+ this.x);
        }
        else if (this.x < this.y) {
            System.out.println("EL VALOR MAYOR ES:"+ this.y);
        }
        else
            calcularIgualdad();
    }
    public void ordenarMayorMenor(){
     if(this.z!=0){
         if (this.x >= this.y && this.x >= this.z) {
             if (this.y >= this.z) {
                 System.out.println("ORDEN: "+ this.x +" - "+ this.y + " - " + this.z);
             }
             else
                 System.out.println("ORDEN: "+ this.x +" - "+ this.z + " - " + this.y);
         }
         if (this.y >= this.x && this.y >= this.z) {
             if (this.x >= this.z) {
                 System.out.println("ORDEN: "+ this.y +" - "+ this.x + " - " + this.z);
             }
             else
                 System.out.println("ORDEN: "+ this.y +" - "+ this.z + " - " + this.x);
         }
         if (this.z >= this.y && this.z >= this.x) {
             if (this.y >= this.x) {
                 System.out.println("ORDEN: "+ this.z +" - "+ this.y + " - " + this.x);
             }
             else
                 System.out.println("ORDEN: "+ this.z +" - "+ this.x + " - " + this.y);
         }
        }
     else   
         if (this.x >= this.y) {
            System.out.println("EL ORDEN ES: " + this.x + " - "+ this.y);
        }
        else
            System.out.println("EL ORDEN ES: " + this.y + " - "+ this.x);
    }
         
        
}
