package com.example.vishal.lots;

import model.PermitGroup;

/**
 * Created by Vishal on 4/30/2017.
 */

public class SharedPrefManager {

    private PermitGroup permitGroup;

    public PermitGroup getLastSavedPermit() {
        if(permitGroup!=null){
            return permitGroup;
        } else{
            return PermitGroup.A;
        }

    }

    public void savePermit(PermitGroup permitGroup) {
        this.permitGroup = permitGroup;
    }
}
