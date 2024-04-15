public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friends = 19;
        System.out.println("frinds=" + friends);

        friends = friends + 2;
        System.out.println("frinds+2=" + friends);

        friends = friends / 7;
        System.out.println("frinds/7=" + friends);

        var frog = 3.5;
        System.out.println("frog=" + frog);

        frog = frog * 10;
        System.out.println("frog*10=" + frog);

        frog = frog / 3.5;
        System.out.println("frog/3.5=" + frog);

        frog = frog + 4;
        System.out.println("frog+4=" + frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeight = boxerOne + boxerTwo;

        System.out.println("Total Weight=" + totalWeight);

        var difference = boxerTwo - boxerOne;
        System.out.println("difference=" + difference);

        var remains = boxerTwo % boxerOne;
        System.out.println("remains=" + remains);

        var allTime = 640;
        var oneTime = 8;
        var workers = allTime / oneTime;
        System.out.println("Всего работников в компании = " + workers +" человек");



    }
}