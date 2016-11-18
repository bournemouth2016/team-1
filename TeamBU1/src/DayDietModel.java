import java.util.Observable;

/**
 * codeForGood
 * Created by riddle on 11/18/16.
 *
 * @author rmb481@cs.bham.ac.uk
 */
public class DayDietModel extends Observable {
    private DayDiet dayDiet;

    public DayDietModel( DayDiet dayDiet){
        this.dayDiet = dayDiet;
    }

    public void setMeals(Meal[] meals) {
        dayDiet.setMeals(meals);
    }

    public void setCounty(String country){
        dayDiet.setCountry(country);
    }

}
