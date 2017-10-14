// CC2006, Lab 4
// Una clase para representar a los Generales.

public class General extends Militar {
    public int getDiasVacaciones() {
        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
    }

    public String getFormularioVacaciones() {
        return "rosado";
    }
    
    public void planificaEstrategia() {
        System.out.println("Llevaremos tres divisiones a la frontera!");
    }
}