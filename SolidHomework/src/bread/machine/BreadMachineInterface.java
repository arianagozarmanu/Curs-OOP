package bread.machine;

import java.util.List;

import bread.recipe.BreadRecipeInterface;

public interface BreadMachineInterface {
	
	public String getName();
	public List<BreadRecipeInterface> getRecipes();
	public void makeBread(BreadRecipeInterface recipe);

}
