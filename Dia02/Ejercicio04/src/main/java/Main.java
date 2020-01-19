
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,y,z;
        System.out.println("CUANTOS NUMEROS INGRESARA (1,2,3):");
        int option = s.nextInt();
        int secondOption;
        switch(option){
                case 1:
                    Numeros numbers1;
                    System.out.println("INGRESE EL PRIMER DIGITO:");
                    x = s.nextInt();
                    System.out.println("QUE DESEA REALIZAR CON ESTE DIGITO:");
                    System.out.println("1: CALCULAR SI ES POSITIVO O NEGATIVO");
                    secondOption = s.nextInt();
                    switch(secondOption){
                            case 1:
                                numbers1 = new Numeros(x);
                                numbers1.calcularPositividad();
                        }
                    break;
                    
                case 2:
                    Numeros numbers2;
                    System.out.println("INGRESE EL PRIMER DIGITO:");
                    x = s.nextInt();
                    System.out.println("INGRESE EL SEGUNDO DIGITO:");
                    y = s.nextInt();
                    System.out.println("QUE DESSEA REALIZAR CON LOS DOS DIGITOS:");
                    System.out.println("1: CALCULAR SI SON IGUALES O NO");
                    System.out.println("2: CALCULAR SI EXISTE MULTIPLICIDAD");
                    System.out.println("3: CALCULAR EL NUMERO MAYOR");
                    System.out.println("3: ORDENAR DE MAYOR A MENOR");
                    secondOption = s.nextInt();
                        switch(secondOption){
                            case 1:
                                numbers2 = new Numeros(x,y);
                                numbers2.calcularIgualdad();
                                break;
                            case 2:
                                numbers2 = new Numeros(x,y);
                                numbers2.calcularMultiplo();
                                break;
                            case 3:
                                numbers2 = new Numeros(x,y);
                                numbers2.calcularMayor();
                            break;
                            case 4:
                                numbers2 = new Numeros(x,y);
                                numbers2.ordenarMayorMenor();
                            break;
                        }
                    break;
                case 3:
                    Numeros numbers3;
                    System.out.println("INGRESE EL PRIMER DIGITO:");
                    x = s.nextInt();
                    System.out.println("INGRESE EL SEGUNDO DIGITO:");
                    y = s.nextInt();
                    System.out.println("INGRESE EL TERCER DIGITO:");
                    z = s.nextInt();     
                    System.out.println("QUE DESSEA REALIZAR CON LOS DOS DIGITOS:");
                    System.out.println("1: CALCULAR EL NUMERO MAYOR");
                    secondOption = s.nextInt();
                    switch(secondOption){
                            case 1:
                                numbers3 = new Numeros(x,y,z);
                                numbers3.ordenarMayorMenor();
                                break;
                    }            
    }
        
                    
        
    }
}
