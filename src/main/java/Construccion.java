public enum Construccion {
	MADERA("Madera"),
	CEMENTO("Cemento"),
	VIDRIO("Vidrio"),
	CERAMICA("Ceramica");
	private String material;

	private Construccion(String material) {
		this.material=material;
	}

	public String getMaterial() {
		return this.material;
	}

	@Override
	public String toString() {
		return this.material;
	}
}