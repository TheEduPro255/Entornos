import static org.junit.Assert.*;

import org.junit.Test;

public class ExamenEntonrnos {

	@Test
	public void formulario() {
		try {
			Formulario f = new Formulario("Eduardo", "mi_pass");
		}catch(Exception e) {
			fail("Datos Incorrectos");
		}
	}
	}


