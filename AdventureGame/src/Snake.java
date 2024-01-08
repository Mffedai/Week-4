import java.util.Random;
public class Snake extends Monster{
    Random random = new Random();
    int rndDamage = random.nextInt(3,6);
    public Snake() {
        super(4, "Snake", rndDamage, 12, AWARDS);
    }
}
