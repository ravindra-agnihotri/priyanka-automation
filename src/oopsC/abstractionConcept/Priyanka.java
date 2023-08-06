package oopsC.abstractionConcept;

public class Priyanka extends TeamLead{
    public Priyanka(boolean unitTestingDone) {
        super(unitTestingDone);
    }

    @Override
    public void develop() {
        System.out.println("priyanka coding");
    }
}
