/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ScoreSoure {
    private ArrayList<ScoreListener> listeners;
    public ScoreSoure() {
	listeners = new ArrayList<>();
    }
    public void setSourceLine(String val) {
	fireScoreEvent(new ScoreEvent(this, val));
    }
    public void register(ScoreListener l) {
        listeners.add(l);
    }
    public void remove(ScoreListener l) {
	listeners.remove(l);
    }
    public void fireScoreEvent(ScoreEvent e) {
        for(int i = 0; i < listeners.size(); i++) {
            ScoreListener l = listeners.get(i);
            l.scoreChange(e);
	}
    }
}
