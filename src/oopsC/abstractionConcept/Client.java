package oopsC.abstractionConcept;

public class Client {

    public static void main(String[] args) {
        TeamLead teamLead= new Ravi(true);
        TeamLead teamLead1= new Priyanka(false);

        teamLead.develop();
        teamLead.teamManage();
        teamLead1.develop();
        System.out.println(teamLead1.unitTestingDone);
        Manager manager= new Abhishek();
        manager.delivery();
        int a=Manager.appraisal;
    }
}
