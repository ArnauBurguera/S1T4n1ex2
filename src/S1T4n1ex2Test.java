import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class S1T4n1ex2Test {
	
	private String esperat;
	private int numIntroduit;

	public S1T4n1ex2Test(String esperat, int numIntroduit) {
		this.esperat = esperat;
		this.numIntroduit = numIntroduit;
	}

	@Parameterized.Parameters
	public static Iterable<Object[]> getData(){
	
		List<Object[]> llista = new ArrayList<Object[]>();		
		llista.add(new Object[] {"47216380W",47216380});
		llista.add(new Object[] {"46005620P",46005620});
		llista.add(new Object[] {"72055121P",72055121});
		llista.add(new Object[] {"26453678K",26453678});
		llista.add(new Object[] {"55931801X",55931801});
		llista.add(new Object[] {"32220817W",32220817});
		llista.add(new Object[] {"33463171B",33463171});
		llista.add(new Object[] {"49527158Q",49527158});
		llista.add(new Object[] {"19533254K",19533254});
		llista.add(new Object[] {"65117744Y",65117744});
		return llista;
	}
	
	@Test
	public void testDni() {
		CalculoDNI calcul = new CalculoDNI();
		assertEquals(esperat,calcul.calcularDni(numIntroduit));
		
	}

}
