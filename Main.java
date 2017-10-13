
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{

	 public static void main(String[] args)
	 {
		BufferedReader br = null;
		try { 
		br = new BufferedReader(new InputStreamReader(System.in));
				
				Alarma miReloj = new Alarma();
				System.out.println(miReloj); 
				miReloj.m1(); 
				miReloj.m2();
					//Opción de continuar
					System.out.println(" ");
					System.out.println("Desea Continuar? 1.Si 2.No");
					int respuesta = Integer.parseInt(br.readLine());
					//Si no desea continuar termina de ejecutarse la apliacación
					
				}
		
		  catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	 }
	 

}