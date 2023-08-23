package az.iktlab.enums;

import az.iktlab.service.impl.RUService;
import az.iktlab.service.impl.SHPService;
import az.iktlab.service.impl.SPService;
import az.iktlab.service.inter.DBService;
import az.iktlab.service.inter.RUServiceInter;

public enum Menu {
    SP(1, new SPService()),
    RU(2,new RUService()),
    SHP(3,new SHPService()),
    EXIT;
    private int index;
    private DBService dbService;

    Menu() {
    }
    Menu(int index, DBService dbService) {
        this.index = index;
        this.dbService = dbService;
    }
    public void doProcess(){
        this.dbService.process();
    }

    public int getIndex() {
        return index;
    }
}
