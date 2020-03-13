
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TPtraingle {

	tptriangle t1;

	tptriangle t2;

	tptriangle t3;

	tptriangle t4;

	@Before
	public void btest() {

		t1 = new tptriangle(2, 2, 2);

		t2 = new tptriangle(3, 3, 2);

		t3 = new tptriangle(4, 3, 2);

		t4 = new tptriangle(-5, 0, 2);

	}

	@Test
	public void testn() {

		assertNotNull(t1.getType());
		assertNotNull(t2.getType());
		assertNotNull(t3.getType());
		assertNotNull(t4.getType());

	}

}
