import java.util.*;
import java.io.*;

public class Bronze2015DecQ3 {
    public static void main(String[] args) throws IOException {

        ArrayList<Drink> recordTime = new ArrayList<>();
        ArrayList<Sick> sickTime = new ArrayList<>();


        BufferedReader br = new BufferedReader(new FileReader("badmilk.in"));

        String nums = br.readLine();
        StringTokenizer tok = new StringTokenizer(nums);
        int numOfPeople = Integer.parseInt(tok.nextToken());
        int numOfMilk = Integer.parseInt(tok.nextToken());
        int drinkTimes = Integer.parseInt(tok.nextToken());
        int sickTimes = Integer.parseInt(tok.nextToken());
        String[] currentDrinker = new String[numOfMilk];
        boolean[] susMilk = new boolean[numOfMilk];

        for (int i = 0; i < drinkTimes; i++) {
            Drink a = new Drink();
            String b = br.readLine();
            StringTokenizer tokB = new StringTokenizer(b);
            a.person = Integer.parseInt(tokB.nextToken());
            a.milk = Integer.parseInt(tokB.nextToken());
            a.time = Integer.parseInt(tokB.nextToken());
            recordTime.add(a);
        }
        for (int i = 0; i < sickTimes; i++) {
            Sick a = new Sick();
            String b = br.readLine();
            StringTokenizer tokB = new StringTokenizer(b);
            a.person = Integer.parseInt(tokB.nextToken());
            a.time = Integer.parseInt(tokB.nextToken());
            sickTime.add(a);
        }
        br.close();

        Collections.sort(recordTime,(o1, o2) -> o1.time - o2.time);
        Collections.sort(sickTime,(o1, o2) -> o1.time - o2.time);
        for (int i = 1; i < 100; i++) {
            for (int j = 0; j < recordTime.size(); j++) {
                if(recordTime.get(j).time == i){
                    currentDrinker[recordTime.get(j).milk-1]+=recordTime.get(j).person;
                }
            }
            for (int j = 0; j < sickTime.size(); j++) {
                if(sickTime.get(j).time == i){
                    for (int k = 0; k < currentDrinker.length; k++) {
                        if(currentDrinker)
                    }
                }
            }
        }
        


    }

}



class Drink{

    int time = 0;
    int person = 0;
    int milk = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return time == drink.time &&
                person == drink.person &&
                milk == drink.milk;
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, person, milk);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "time=" + time +
                ", person=" + person +
                ", milk=" + milk +
                '}';
    }
}

class Sick{

    int time = 0;

    int person = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sick sick = (Sick) o;
        return time == sick.time &&
                person == sick.person;
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, person);
    }

    @Override
    public String toString() {
        return "Sick{" +
                "time=" + time +
                ", person=" + person +
                '}';
    }
}

