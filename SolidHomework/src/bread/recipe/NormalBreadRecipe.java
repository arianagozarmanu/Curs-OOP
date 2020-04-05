package bread.recipe;

import java.util.List;

public class NormalBreadRecipe extends AbstractBreadRecipe {

	private BreadDimension dimension;
	
	public NormalBreadRecipe(List<String> ingredients, String name, Long restingTime, Long backingTime, Long kneadingTime, BreadDimension dimension) {
		super(ingredients, name, restingTime, backingTime, kneadingTime);
		this.dimension = dimension;
	}

	public BreadDimension getDimension() {
		return dimension;
	}

	public void setDimension(BreadDimension dimension) {
		this.dimension = dimension;
	}
	
	@Override
	protected BreadDimension getBreadSize() {
		return getDimension();
	}

	@Override
	protected void doKneading(Long kneadingTime) {
		System.out.println("Knead it for " + kneadingTime + " minutes");
	}

}
