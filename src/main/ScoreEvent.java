/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.EventObject;

/**
 *
 * @author Admin
 */
public class ScoreEvent extends EventObject {
    private String someData ="";
    public ScoreEvent(Object o, String score) {
        super(o);
        someData = score;
    }
    public String getSomeData(){
        return someData;
    }

}
