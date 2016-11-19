/**
 * codeForGood
 * Created by riddle on 11/18/16.
 *
 * @author rmb481@cs.bham.ac.uk
 */
public class DayDiet {
    private String country;
    private Meal meals[];
    private static int NUMBER_MEALS = 1;

    /**
     * default empty Constructor
     */
    public DayDiet() {
        this.country = "";
        this.meals = new Meal[NUMBER_MEALS];
    }
    /**
     * Constructor
     * @param country Country of Residence
     */
    public DayDiet(String country){
        this.country = country;
        this.meals = new Meal[NUMBER_MEALS];
    }

    public void setMeal(String food, int portionSize, int index){
        meals[index].setFood(food);
        meals[index].setPortionSize(portionSize);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMeals(Meal[] meals) {
        this.meals = meals;
    }
}
