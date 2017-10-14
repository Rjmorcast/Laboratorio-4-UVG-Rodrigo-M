/**
	@Author: Rodrigo Morales 17027
	@Date: 3/08/17
	@proposito: preguntar al usuario que quiere hacer con respecto de los vuelos.
	
	
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class main
{

	 public static void main(String[] args)
	 {
		General general = new General();
		Teniente teniente = new Teniente();
		Coronel coronel = new Coronel();
		Soldado soldado = new Soldado();
		BufferedReader br = null;
		try { 
		br = new BufferedReader(new InputStreamReader(System.in));
				while (true){
					//¨Pregunta al usuario que quiere hacer
					System.out.println("Que quiere hacer?");
					System.out.println("1.Consultar Salarios");
					System.out.println("2. Consultar horas");
					System.out.println("3. Días de vacaciones");
					System.out.println("4. Formulario de vacaciones");
					System.out.println("5.Recibir orden");
					System.out.println("6. Ejecutar orden maniobra");
					System.out.println("7. planifcicar estrategia");
					System.out.println("8. tomar orden coronel");
					int i = Integer.parseInt(br.readLine());
					if( i == 1)
					{
						//Consulta los salarios
						System.out.println("Coronel: Q."+coronel.getSalario());
						System.out.println("Teniente: Q."+teniente.getSalario());
						System.out.println("General: Q."+general.getSalario());
						System.out.println("Soldado: Q."+soldado.getSalario());
					}
					if (i == 2)
					{
						//Consulta las horas
						System.out.println("Coronel: "+coronel.getHoras());
						System.out.println("Teniente: "+teniente.getHoras());
						System.out.println("General: "+general.getHoras());
						System.out.println("Soldado: "+soldado.getHoras());
					}
					if (i == 3)
					{
						//Consulta las vacaciones
						System.out.println("Coronel: "+coronel.getDiasVacaciones());
						System.out.println("Teniente: "+teniente.getDiasVacaciones());
						System.out.println("General: "+general.getDiasVacaciones());
						System.out.println("Soldado: "+soldado.getDiasVacaciones());
					}
					if (i == 4)
					{
						//Formulario de vacaciones
						System.out.println("Coronel: "+coronel.getFormularioVacaciones());
						System.out.println("Teniente: "+teniente.getFormularioVacaciones());
						System.out.println("General: "+general.getFormularioVacaciones());
						System.out.println("Soldado: "+soldado.getFormularioVacaciones());
					}
					if (i == 5)
					{
						//Recibir orden
						soldado.recibeOrden();
					}
					if (i==6)
					{
						coronel.ejecutaOrdenManiobra();
					}
					if (i==7)
					{
						general.planificaEstrategia();
					}
					if (i==8)
					{
						String c = br.readLine();
						teniente.tomaOrdenCoronel(c);
					}
					//Opción de continuar
					System.out.println(" ");
					System.out.println("Desea Continuar? 1.Si 2.No");
					int respuesta = Integer.parseInt(br.readLine());
					//Si no desea continuar termina de ejecutarse la apliacación
					if (respuesta == 2){break;}
				}
		
		}  catch (IOException e) {
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