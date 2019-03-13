package com.vilic.bojan.tictactoe;

import android.util.Log;

public class Cell {

    int position, symbol;
    String state = "not_pressed";

    public int getSymbol() {
        return symbol;
    }

    public void setSymbol(int symbol) {
        this.symbol = symbol;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Cell(int position, int symbol){
        this.position = position;
        this.symbol = symbol;
    }

    public Cell(int position, String state){
        this.position = position;
        this.state = state;
    }

    public void print(){
        Log.i("TAG", state);
    }
}
