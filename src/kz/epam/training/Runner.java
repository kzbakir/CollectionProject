package kz.epam.training;

public class Runner {

    public static void main(String[] args) {
        Rector rector = new Rector();
        rector.sortById();
        rector.sortByPosition();
        rector.sortByFirstName();
        rector.sortByLastName();
    }
}
