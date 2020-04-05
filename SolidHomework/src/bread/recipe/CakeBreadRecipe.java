package bread.recipe;

import java.util.List;

public class CakeBreadRecipe extends AbstractBreadRecipe {

	public CakeBreadRecipe(List<String> ingredients, String name, Long restingTime, Long backingTime,
			Long kneadingTime) {
		super(ingredients, name, restingTime, backingTime, kneadingTime);
	}

	@Override
	protected void doKneading(Long kneadingTime) {
		System.out.println("Knead it for " + kneadingTime / 2 + " minutes with the kneading hook and then knead it for "
				+ kneadingTime / 2 + " with the kneading paddle.");
	}

}
