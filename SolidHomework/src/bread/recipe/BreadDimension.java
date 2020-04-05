package bread.recipe;

public enum BreadDimension {
	
	STANDARD("30cmX10cm"),
	SMALL("15cmX10cm");
	
	private String dimension;

	BreadDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getDimensionDescription() {
		return dimension;
	}
	
}
