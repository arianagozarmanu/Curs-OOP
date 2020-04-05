import java.util.ArrayList;
import java.util.List;

import bread.machine.BreadMachine;
import bread.machine.BreadMachineInterface;
import bread.machine.Make;
import bread.machine.Model;
import bread.recipe.BreadDimension;
import bread.recipe.NormalBreadRecipe;
import bread.recipe.CakeBreadRecipe;
import bread.recipe.BreadRecipeInterface;

public class Main {

	public static void main(String[] args) {
		List<String> ingredients = new ArrayList<String>();
		ingredients.add("100ml apa");
		ingredients.add("300g faina alba 650");
		ingredients.add("7g drojdie uscata");
		ingredients.add("sare");
		
		// SIMPLE BREAD SMALL
		BreadRecipeInterface simpleBreadSmall = new NormalBreadRecipe(ingredients, "Simple Bread Small", 40l, 35l, 10l, BreadDimension.SMALL);
		// SIMPLE BREAD STANDARD
		BreadRecipeInterface simpleBreadStandard = new NormalBreadRecipe(ingredients, "Simple Bread Standard", 40l, 35l, 10l, BreadDimension.STANDARD);

		ingredients.clear();
		ingredients.add("150ml apa");
		ingredients.add("300g faina integrala");
		ingredients.add("25g drojdie proaspata");
		ingredients.add("sare");
		
		// WHOLE WEAT BREAD
		BreadRecipeInterface wholeWeatBreadStandard = new NormalBreadRecipe(ingredients, "Whole Wheat Bread Standard", 30l, 30l, 10l, BreadDimension.STANDARD);

		ingredients.clear();
		ingredients.add("170ml apa");
		ingredients.add("200g faina integrala");
		ingredients.add("100g faina alba 650");
		ingredients.add("7g drojdie uscata");
		ingredients.add("mix seminte");
		ingredients.add("sare");
		
		// SEEDS BREAD
		NormalBreadRecipe seedsBreadStandard = new NormalBreadRecipe(ingredients, "Seeds Bread Standard", 40l, 40l, 15l, BreadDimension.SMALL);
		
		ingredients.clear();
		ingredients.add("150ml apa");
		ingredients.add("300g faina alba 000");
		ingredients.add("50ml ulei floarea soarelui");
		ingredients.add("100ml lapte cald");
		ingredients.add("7g drojdie uscata");
		ingredients.add("100g fulgi de ciocolata");
		ingredients.add("100g zahar");
		ingredients.add("3 oua");
		
		// PANETTONE
		BreadRecipeInterface panettone = new CakeBreadRecipe(ingredients, "Panettone cu ciocolata", 720l, 60l, 40l);
		
		ingredients.clear();
		ingredients.add("100ml apa");
		ingredients.add("350g faina alba 000");
		ingredients.add("25ml ulei floarea soarelui");
		ingredients.add("80ml lapte cald");
		ingredients.add("7g drojdie uscata");
		ingredients.add("100g fructe uscate");
		ingredients.add("150g zahar");
		ingredients.add("2 oua");
		// COZONAC
		BreadRecipeInterface sweetBread = new CakeBreadRecipe(ingredients, "Cozonac cu fructe", 120l, 60l, 40l);

		Make make = new Make("Kitchen Aid");
		Model standardModel = new Model("Standard", make);
		Model proModel = new Model("PROx 2000", make);
		
		List<BreadRecipeInterface> recipes = new ArrayList<>();
		recipes.add(simpleBreadSmall);
		recipes.add(simpleBreadStandard);
		recipes.add(wholeWeatBreadStandard);
		recipes.add(seedsBreadStandard);
		// STANDARD BREAD MACHINE
		BreadMachineInterface standardMachine = new BreadMachine(standardModel, recipes);
		// PRO BREAD MACHINE
		recipes.add(sweetBread);
		recipes.add(panettone);
		BreadMachineInterface proMachine = new BreadMachine(proModel, recipes);

		List<BreadMachineInterface> breadMachines = new ArrayList<>();
		breadMachines.add(standardMachine);
		breadMachines.add(proMachine);
		
		for(BreadMachineInterface breadMachine : breadMachines) {
			System.out.println("Do all recipes for bread machine: " + breadMachine.getName());
			for(BreadRecipeInterface recipe : breadMachine.getRecipes()) {
				System.out.println("-----------------------------------------------------------");
				recipe.doRecipe();
				System.out.println("-----------------------------------------------------------");
			}
			System.out.println("===========================================================");
		}
		
	}

}
