package tallerelectiva;

public class A {
	int aField;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (!(o instanceof A)) {
			return false;
		}
		A other = (A) o;

		// Este es la parte de codigo se le insertó

		if (aField != other.aField)
			return false;
		return true;

	}

}
