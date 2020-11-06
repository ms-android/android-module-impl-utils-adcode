package com.ms.module.impl.utils.impl;

import com.ms.module.supers.client.Modules;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AdCodeUtilsImpl {
    public static String getAdCode() {
        try {
            InputStreamReader inputReader = new InputStreamReader(Modules.getDataModule().getAppData().getApplication().getResources().getAssets().open("msadcode.data"));
            BufferedReader bufReader = new BufferedReader(inputReader);
            String line = "";
            String Result = "";
            while ((line = bufReader.readLine()) != null)
                Result += line;
            return Result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
