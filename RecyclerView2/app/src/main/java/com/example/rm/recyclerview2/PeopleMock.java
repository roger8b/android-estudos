package com.example.rm.recyclerview2;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class PeopleMock {

    private List<People> mListPeople;

    public PeopleMock(Activity activity){
        this.mListPeople = getPeopleMockList(activity);
    }

    public List<People> getList() {
        return this.mListPeople;
    }

    private List<People> getPeopleMockList(Activity activity) {
        List<People> mMockList = new ArrayList<>();

        People teste1 = new People("Teste1", "10",1,"#f50505"); mMockList.add(teste1);
        People teste2 = new People("Teste2", "20",2,"#303F9F"); mMockList.add(teste2);
        People teste3 = new People("Teste3", "30",3,"#f50505"); mMockList.add(teste3);
        People teste4 = new People("Teste4", "40",4,"#303F9F"); mMockList.add(teste4);
        People teste5 = new People("Teste5", "50",5,"#f50505"); mMockList.add(teste5);
        People teste6 = new People("Teste6", "60",6,"#303F9F"); mMockList.add(teste6);
        People teste7 = new People("Teste7", "70",7,"#f50505"); mMockList.add(teste7);
        People teste8 = new People("Teste8", "80",8,"#303F9F"); mMockList.add(teste8);
        People teste9 = new People("Teste9", "90",9,"#f50505"); mMockList.add(teste9);
        People teste10 = new People("Teste10", "100",9,"#303F9F"); mMockList.add(teste10);
        People teste11 = new People("Teste11", "101",10,"#f50505"); mMockList.add(teste11);
        People teste12 = new People("Teste12", "102",10,"#303F9F"); mMockList.add(teste12);
        People teste13 = new People("Teste13", "103",10,"#f50505"); mMockList.add(teste13);
        People teste14 = new People("Teste14", "104",10,"#303F9F"); mMockList.add(teste14);
        People teste15 = new People("Teste15", "105",10,"#f50505"); mMockList.add(teste15);
        People teste16 = new People("Teste16", "106",10,"#303F9F"); mMockList.add(teste16);
        People teste17 = new People("Teste17", "107",10,"#f50505"); mMockList.add(teste17);
        People teste18 = new People("Teste18", "108",10,"#303F9F"); mMockList.add(teste18);
        People teste19 = new People("Teste19", "109",10,"#f50505"); mMockList.add(teste19);
        People teste20 = new People("Teste20", "110",10,"#303F9F"); mMockList.add(teste20);
        return mMockList;
    }
}
