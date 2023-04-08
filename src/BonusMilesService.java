public class BonusMilesService {

    public int calculate(int price) {
        int bonus;
        int milesPerRuble = 20;
        bonus = price / milesPerRuble;

        return bonus;


    }

}
