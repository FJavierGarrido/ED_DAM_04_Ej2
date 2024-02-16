public class CostePersonal {
	private static final float COSTE_POR_HORA_EXTRA = 20;
 
	static float CosteDelPersonal(Trabajador trabajadores[]) {
		float costeTotalEnTrabajadores= 0;

		for (Trabajador trabajador : trabajadores) {
			float salario = trabajador.getNomina();
            		float horasExtras = trabajador.getHorasExtras();
            		float costePorHorasExtras = 0;

			if (trabajador.getTipoTrabajador() == Trabajador.DIRECTOR|| 
			    trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {

					costeFinal += salario;
			}else{
				costeTotalEnTrabajadores += salario + (horasExtras * COSTE_POR_HORA_EXTRA);
			}
		}
		return costeTotalEnTrabajadores;
	}
}