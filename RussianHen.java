package HenFactory;

public class RussianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}