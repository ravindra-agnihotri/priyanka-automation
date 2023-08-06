package oopsC.abstractionConcept;

import basics.VarTypes;

public abstract class TeamLead {

    public abstract void develop();
    public boolean unitTestingDone;

    public TeamLead(boolean unitTestingDone) {
        this.unitTestingDone = unitTestingDone;
    }

    public void teamManage(){
        System.out.println("managing");

    }
}
