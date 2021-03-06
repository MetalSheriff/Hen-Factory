package HenFactory;

public class BelarusianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 80;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}