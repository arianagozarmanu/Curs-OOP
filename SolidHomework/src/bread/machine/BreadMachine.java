package bread.machine;

import java.util.List;

import bread.recipe.BreadRecipeInterface;

public class BreadMachine implements BreadMachineInterface {

	private Model model;
	private List<BreadRecipeInterface> recipes;
	
	public BreadMachine(Model model, List<BreadRecipeInterface> recipes) {
		this.model = model;
		this.recipes = recipes;
	}

	@Override
	public void makeBread(BreadRecipeInterface recipe) {
		recipe.doRecipe();
	}
	
	@Override
	public String getName() {
		return getModel().getMake().getName() + " " + getModel().getName();
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public List<BreadRecipeInterface> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<BreadRecipeInterface> recipes) {
		this.recipes = recipes;
	}

}
