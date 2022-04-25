import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {

	@Test
	void Translatetest1() {
		String expected = "avocadoway";
		String actual = PigLatin.translate("avocado");
		assertEquals(expected, actual);;
	}
	@Test
	void Translatetest2() {
		String expected = "elephantway";
		String actual = PigLatin.translate("elephant");
		assertEquals(expected, actual);;
	}
	@Test
	void Translatetest3() {
		String expected = "ignoreway";
		String actual = PigLatin.translate("ignore");
		assertEquals(expected, actual);;
	}
	@Test
	void Translatetest4() {
		String expected = "octopusway";
		String actual = PigLatin.translate("octopus");
		assertEquals(expected, actual);;
	}
	@Test
	void Translatetest5() {
		String expected = "umbrellaway";
		String actual = PigLatin.translate("umbrella");
		assertEquals(expected, actual);;
	}
	@Test
	void Translatetest6() {
		String expected = "ambleray";
		String actual = PigLatin.translate("ramble");
		assertEquals(expected, actual);;
	}
	@Test
	void Translatetest7() {
		String expected = "uniperjay";
		String actual = PigLatin.translate("juniper");
		assertEquals(expected, actual);;
	}
	@Test
	void Translatetest8() {
		String expected = "inkystay";
		String actual = PigLatin.translate("stinky");
		assertEquals(expected, actual);;
	}
	@Test
	void Translatetest9() {
		String expected = "oatthray";
		String actual = PigLatin.translate("throat");
		assertEquals(expected, actual);;
	}
	@Test
	void Translatetest10() {
		String expected = "umanhay";
		String actual = PigLatin.translate("HuMaN");
		assertEquals(expected, actual);;
	}

}
