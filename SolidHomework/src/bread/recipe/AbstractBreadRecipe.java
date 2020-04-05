package bread.recipe;

import java.util.List;

public abstract class AbstractBreadRecipe implements BreadRecipeInterface {

	private List<String> ingredients;
	private String name;
	private Long restingTime;
	private Long bakingTime;
	private Long kneadingTime;

	public AbstractBreadRecipe(List<String> ingredients, String name, Long restingTime, Long backingTime, Long kneadingTime) {
		this.ingredients = ingredients;
		this.name = name;
		this.restingTime = restingTime;
		this.bakingTime = backingTime;
		this.kneadingTime = kneadingTime;
	}
	
	@Override
	public void doRecipe() {
		System.out.println(name + " in the making!!");
		System.out.println("Its size is: " + getBreadSize().getDimensionDescription());
		System.out.println("Mix all ingredients:");
		for(String ingredient : getIngredients()) {
			System.out.println(ingredient);
		}
		doKneading(kneadingTime);
		System.out.println("Let it rest for " + restingTime + " minutes");
		System.out.println("Bake it " + bakingTime + " minutes");
	}
	
	protected abstract void doKneading(Long kneadingTime);
	
	protected BreadDimension getBreadSize() {
		return BreadDimension.STANDARD;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	public Long getRestingTime() {
		return restingTime;
	}

	public void setRestingTime(Long restingTime) {
		this.restingTime = restingTime;
	}

	public Long getBakingTime() {
		return bakingTime;
	}

	public void setBakingTime(Long bakingTime) {
		this.bakingTime = bakingTime;
	}

	public Long getKneadingTime() {
		return kneadingTime;
	}

	public void setKneadingTime(Long kneadingTime) {
		this.kneadingTime = kneadingTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
