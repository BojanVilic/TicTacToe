package com.vilic.bojan.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Random;


public class PlayGameActivity extends AppCompatActivity {

    ImageView mImage00, mImage01, mImage02, mImage10, mImage11, mImage12, mImage20, mImage21, mImage22;
    RadioGroup mRadioGroup;
    RadioButton mX, mO;
    boolean move = true; // false CPU's move, true PLAYER's move
    boolean winnerFound = false;

    Cell cell0 = new Cell(0, -1);
    Cell cell1 = new Cell(1, -1);
    Cell cell2 = new Cell(2, -1);
    Cell cell3 = new Cell(3, -1);
    Cell cell4 = new Cell(4, -1);
    Cell cell5 = new Cell(5, -1);
    Cell cell6 = new Cell(6, -1);
    Cell cell7 = new Cell(7, -1);
    Cell cell8 = new Cell(8, -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
        mImage00 = findViewById(R.id.button_00);
        mImage01 = findViewById(R.id.button_01);
        mImage02 = findViewById(R.id.button_02);
        mImage10 = findViewById(R.id.button_10);
        mImage11 = findViewById(R.id.button_11);
        mImage12 = findViewById(R.id.button_12);
        mImage20 = findViewById(R.id.button_20);
        mImage21 = findViewById(R.id.button_21);
        mImage22 = findViewById(R.id.button_22);
        mX = findViewById(R.id.x);
        mO = findViewById(R.id.o);
        mRadioGroup = findViewById(R.id.radioGroup);

        mX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mRadioGroup.getCheckedRadioButtonId() == R.id.o) {
                    mX.setChecked(true);
                    mO.setChecked(false);
                }
            }
        });

        mO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mX.setChecked(false);
                move = false;
                mO.setEnabled(false);
                mX.setEnabled(false);
                randomMoveX();
                mO.setChecked(true);
            }
        });

        mImage00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cell0.state.equals("not_pressed")){
                    cell0.setState("pressed");
                    cell0.print();
                    mO.setEnabled(false);
                    mX.setEnabled(false);
                    if(move) {
                        if(mO.isChecked()) {
                            mImage00.setBackgroundResource(R.drawable.owhite);
                            cell0.setSymbol(1);
                        }
                        else {
                            mImage00.setBackgroundResource(R.drawable.x);
                            cell0.setSymbol(0);
                        }
                        move = false;
                        cellCheck();
                        randomMoveX();
                    }
                }
            }
        });

        mImage01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cell1.state.equals("not_pressed")){
                    cell1.setState("pressed");
                    cell1.print();
                    if(move) {
                        if(mO.isChecked()) {
                            mImage01.setBackgroundResource(R.drawable.owhite);
                            cell1.setSymbol(1);
                        }
                        else {
                            mImage01.setBackgroundResource(R.drawable.x);
                            cell1.setSymbol(0);
                        }
                        move = false;
                        cellCheck();
                        randomMoveX();
                    }
                    mO.setEnabled(false);
                    mX.setEnabled(false);
                }
            }
        });

        mImage02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cell2.state.equals("not_pressed")){
                    cell2.setState("pressed");
                    cell2.print();
                    if(move) {
                        if(mO.isChecked()) {
                            mImage02.setBackgroundResource(R.drawable.owhite);
                            cell2.setSymbol(1);
                        }
                        else {
                            mImage02.setBackgroundResource(R.drawable.x);
                            cell2.setSymbol(0);
                        }
                        move = false;
                        cellCheck();
                        randomMoveX();
                    }
                    mO.setEnabled(false);
                    mX.setEnabled(false);
                }
            }
        });

        mImage10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cell3.state.equals("not_pressed")){
                    cell3.setState("pressed");
                    cell3.print();
                    if(move) {
                        if(mO.isChecked()) {
                            mImage10.setBackgroundResource(R.drawable.owhite);
                            cell3.setSymbol(1);
                        }
                        else {
                            mImage10.setBackgroundResource(R.drawable.x);
                            cell3.setSymbol(0);
                        }
                        move = false;
                        cellCheck();
                        randomMoveX();
                    }
                    mO.setEnabled(false);
                    mX.setEnabled(false);
                }
            }
        });

        mImage11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cell4.state.equals("not_pressed")){
                    cell4.setState("pressed");
                    cell4.print();
                    if(move) {
                        if(mO.isChecked()) {
                            mImage11.setBackgroundResource(R.drawable.owhite);
                            cell4.setSymbol(1);
                        }
                        else {
                            mImage11.setBackgroundResource(R.drawable.x);
                            cell4.setSymbol(0);
                        }
                        move = false;
                        cellCheck();
                        randomMoveX();
                    }
                    mO.setEnabled(false);
                    mX.setEnabled(false);
                }
            }
        });

        mImage12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cell5.state.equals("not_pressed")){
                    cell5.setState("pressed");
                    cell5.print();
                    if(move) {
                        if(mO.isChecked()) {
                            mImage12.setBackgroundResource(R.drawable.owhite);
                            cell5.setSymbol(1);
                        }
                        else {
                            mImage12.setBackgroundResource(R.drawable.x);
                            cell5.setSymbol(0);
                        }
                        move = false;
                        cellCheck();
                        randomMoveX();
                    }
                    mO.setEnabled(false);
                    mX.setEnabled(false);
                }
            }
        });

        mImage20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cell6.state.equals("not_pressed")){
                    cell6.setState("pressed");
                    cell6.print();
                    if(move) {
                        if(mO.isChecked()) {
                            mImage20.setBackgroundResource(R.drawable.owhite);
                            cell6.setSymbol(1);
                        }
                        else {
                            mImage20.setBackgroundResource(R.drawable.x);
                            cell6.setSymbol(0);
                        }
                        move = false;
                        cellCheck();
                        randomMoveX();
                    }
                    mO.setEnabled(false);
                    mX.setEnabled(false);
                }
            }
        });

        mImage21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cell7.state.equals("not_pressed")){
                    cell7.setState("pressed");
                    cell7.print();
                    if(move) {
                        if(mO.isChecked()) {
                            mImage21.setBackgroundResource(R.drawable.owhite);
                            cell7.setSymbol(1);
                        }
                        else {
                            mImage21.setBackgroundResource(R.drawable.x);
                            cell7.setSymbol(0);
                        }
                        move = false;
                        cellCheck();
                        randomMoveX();
                    }
                    mO.setEnabled(false);
                    mX.setEnabled(false);
                }
            }
        });

        mImage22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cell8.state.equals("not_pressed")){
                    cell8.setState("pressed");
                    cell8.print();
                    if(move) {
                        if(mO.isChecked()) {
                            mImage22.setBackgroundResource(R.drawable.owhite);
                            cell8.setSymbol(1);
                        }
                        else {
                            mImage22.setBackgroundResource(R.drawable.x);
                            cell8.setSymbol(0);
                        }
                        move = false;
                        cellCheck();
                        randomMoveX();
                    }
                    mO.setEnabled(false);
                    mX.setEnabled(false);
                }
            }
        });
    }

    private void randomMoveX() {
        if(!winnerFound) {
            Random random = new Random();
            int num = random.nextInt(8);
            switch (num) {
                case 0: {
                    if (cell0.state.equals("not_pressed")) {
                        cell0.setState("pressed");
                        cell0.print();
                        if (mO.isChecked()) {
                            mImage00.setBackgroundResource(R.drawable.x);
                            cell0.setSymbol(0);
                        } else {
                            mImage00.setBackgroundResource(R.drawable.owhite);
                            cell0.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    }
                }
                case 1: {
                    if (cell1.state.equals("not_pressed")) {
                        cell1.setState("pressed");
                        cell1.print();
                        if (mO.isChecked()) {
                            mImage01.setBackgroundResource(R.drawable.x);
                            cell1.setSymbol(0);
                        } else {
                            mImage01.setBackgroundResource(R.drawable.owhite);
                            cell1.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    }
                }
                case 2: {
                    if (cell2.state.equals("not_pressed")) {
                        cell2.setState("pressed");
                        cell2.print();
                        if (mO.isChecked()) {
                            mImage02.setBackgroundResource(R.drawable.x);
                            cell2.setSymbol(0);
                        } else {
                            mImage02.setBackgroundResource(R.drawable.owhite);
                            cell2.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    }
                }
                case 3: {
                    if (cell3.state.equals("not_pressed")) {
                        cell3.setState("pressed");
                        cell3.print();
                        if (mO.isChecked()) {
                            mImage10.setBackgroundResource(R.drawable.x);
                            cell3.setSymbol(0);
                        } else {
                            mImage10.setBackgroundResource(R.drawable.owhite);
                            cell3.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    }
                }
                case 4: {
                    if (cell4.state.equals("not_pressed")) {
                        cell4.setState("pressed");
                        cell4.print();
                        if (mO.isChecked()) {
                            mImage11.setBackgroundResource(R.drawable.x);
                            cell4.setSymbol(0);
                        } else {
                            mImage11.setBackgroundResource(R.drawable.owhite);
                            cell4.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    }
                }
                case 5: {
                    if (cell5.state.equals("not_pressed")) {
                        cell5.setState("pressed");
                        cell5.print();
                        if (mO.isChecked()) {
                            mImage12.setBackgroundResource(R.drawable.x);
                            cell5.setSymbol(0);
                        } else {
                            mImage12.setBackgroundResource(R.drawable.owhite);
                            cell5.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    }
                }
                case 6: {
                    if (cell6.state.equals("not_pressed")) {
                        cell6.setState("pressed");
                        cell6.print();
                        if (mO.isChecked()) {
                            mImage20.setBackgroundResource(R.drawable.x);
                            cell6.setSymbol(0);
                        } else {
                            mImage20.setBackgroundResource(R.drawable.owhite);
                            cell6.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    }
                }
                case 7: {
                    if (cell7.state.equals("not_pressed")) {
                        cell7.setState("pressed");
                        cell7.print();
                        if (mO.isChecked()) {
                            mImage21.setBackgroundResource(R.drawable.x);
                            cell7.setSymbol(0);
                        } else {
                            mImage21.setBackgroundResource(R.drawable.owhite);
                            cell7.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    }
                }
                case 8: {
                    if (cell8.state.equals("not_pressed")) {
                        cell8.setState("pressed");
                        cell8.print();
                        if (mO.isChecked()) {
                            mImage22.setBackgroundResource(R.drawable.x);
                            cell8.setSymbol(0);
                        } else {
                            mImage22.setBackgroundResource(R.drawable.owhite);
                            cell8.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    }
                }

                default: {
                    if (cell0.state.equals("not_pressed")) {
                        cell0.setState("pressed");
                        cell0.print();
                        if (mO.isChecked()) {
                            mImage00.setBackgroundResource(R.drawable.x);
                            cell0.setSymbol(0);
                        } else {
                            mImage00.setBackgroundResource(R.drawable.owhite);
                            cell0.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    } else if (cell1.state.equals("not_pressed")) {
                        cell1.setState("pressed");
                        cell1.print();
                        if (mO.isChecked()) {
                            mImage01.setBackgroundResource(R.drawable.x);
                            cell1.setSymbol(0);
                        } else {
                            mImage01.setBackgroundResource(R.drawable.owhite);
                            cell1.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    } else if (cell2.state.equals("not_pressed")) {
                        cell2.setState("pressed");
                        cell2.print();
                        if (mO.isChecked()) {
                            mImage02.setBackgroundResource(R.drawable.x);
                            cell2.setSymbol(0);
                        } else {
                            mImage02.setBackgroundResource(R.drawable.owhite);
                            cell2.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    } else if (cell3.state.equals("not_pressed")) {
                        cell3.setState("pressed");
                        cell3.print();
                        if (mO.isChecked()) {
                            mImage10.setBackgroundResource(R.drawable.x);
                            cell3.setSymbol(0);
                        } else {
                            mImage10.setBackgroundResource(R.drawable.owhite);
                            cell3.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    } else if (cell4.state.equals("not_pressed")) {
                        cell4.setState("pressed");
                        cell4.print();
                        if (mO.isChecked()) {
                            mImage11.setBackgroundResource(R.drawable.x);
                            cell4.setSymbol(0);
                        } else {
                            mImage11.setBackgroundResource(R.drawable.owhite);
                            cell4.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    } else if (cell5.state.equals("not_pressed")) {
                        cell5.setState("pressed");
                        cell5.print();
                        if (mO.isChecked()) {
                            mImage12.setBackgroundResource(R.drawable.x);
                            cell5.setSymbol(0);
                        } else {
                            mImage12.setBackgroundResource(R.drawable.owhite);
                            cell5.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    } else if (cell6.state.equals("not_pressed")) {
                        cell6.setState("pressed");
                        cell6.print();
                        if (mO.isChecked()) {
                            mImage20.setBackgroundResource(R.drawable.x);
                            cell6.setSymbol(0);
                        } else {
                            mImage20.setBackgroundResource(R.drawable.owhite);
                            cell6.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    } else if (cell7.state.equals("not_pressed")) {
                        cell7.setState("pressed");
                        cell7.print();
                        if (mO.isChecked()) {
                            mImage21.setBackgroundResource(R.drawable.x);
                            cell7.setSymbol(0);
                        } else {
                            mImage21.setBackgroundResource(R.drawable.owhite);
                            cell7.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    } else if (cell8.state.equals("not_pressed")) {
                        cell8.setState("pressed");
                        cell8.print();
                        if (mO.isChecked()) {
                            mImage22.setBackgroundResource(R.drawable.x);
                            cell8.setSymbol(0);
                        } else {
                            mImage22.setBackgroundResource(R.drawable.owhite);
                            cell8.setSymbol(1);
                        }
                        move = true;
                        cellCheck();
                        break;
                    }
                }
            }
        }
    }

    private void cellCheck(){
        if(cell0.getSymbol() == 0 && cell1.getSymbol() == 0 && cell2.getSymbol() == 0){
            showResultDialog("X");
            winnerFound = true;
        }
        else if(cell0.getSymbol() == 1 && cell1.getSymbol() == 1 && cell2.getSymbol() == 1){
            showResultDialog("O");
            winnerFound = true;
        }
        else if(cell3.getSymbol() == 0 && cell4.getSymbol() == 0 && cell5.getSymbol() == 0){
            showResultDialog("X");
            winnerFound = true;
        }
        else if(cell3.getSymbol() == 1 && cell4.getSymbol() == 1 && cell5.getSymbol() == 1){
            showResultDialog("O");
            winnerFound = true;
        }
        else if(cell6.getSymbol() == 0 && cell7.getSymbol() == 0 && cell8.getSymbol() == 0){
            showResultDialog("X");
            winnerFound = true;
        }
        else if(cell6.getSymbol() == 1 && cell7.getSymbol() == 1 && cell8.getSymbol() == 1){
            showResultDialog("O");
            winnerFound = true;
        }
        else if(cell0.getSymbol() == 0 && cell3.getSymbol() == 0 && cell6.getSymbol() == 0){
            showResultDialog("X");
            winnerFound = true;
        }
        else if(cell0.getSymbol() == 1 && cell3.getSymbol() == 1 && cell6.getSymbol() == 1){
            showResultDialog("O");
            winnerFound = true;
        }
        else if(cell1.getSymbol() == 0 && cell4.getSymbol() == 0 && cell7.getSymbol() == 0){
            showResultDialog("X");
            winnerFound = true;
        }
        else if(cell1.getSymbol() == 1 && cell4.getSymbol() == 1 && cell7.getSymbol() == 1){
            showResultDialog("O");
            winnerFound = true;
        }
        else if(cell2.getSymbol() == 0 && cell5.getSymbol() == 0 && cell8.getSymbol() == 0){
            showResultDialog("X");
            winnerFound = true;
        }
        else if(cell2.getSymbol() == 1 && cell5.getSymbol() == 1 && cell8.getSymbol() == 1){
            showResultDialog("O");
            winnerFound = true;
        }
        else if(cell0.getSymbol() == 0 && cell4.getSymbol() == 0 && cell8.getSymbol() == 0){
            showResultDialog("X");
            winnerFound = true;
        }
        else if(cell0.getSymbol() == 1 && cell4.getSymbol() == 1 && cell8.getSymbol() == 1){
            showResultDialog("O");
            winnerFound = true;
        }
        else if(cell2.getSymbol() == 0 && cell4.getSymbol() == 0 && cell6.getSymbol() == 0){
            showResultDialog("X");
            winnerFound = true;
        }
        else if(cell2.getSymbol() == 1 && cell4.getSymbol() == 1 && cell6.getSymbol() == 1){
            showResultDialog("O");
            winnerFound = true;
        }
        else if(cell0.getSymbol() >= 0 && cell1.getSymbol() >= 0 && cell2.getSymbol() >= 0 && cell3.getSymbol() >= 0  && cell4.getSymbol() >= 0
                && cell5.getSymbol() >= 0 && cell6.getSymbol() >= 0 && cell7.getSymbol() >= 0 && cell8.getSymbol() >= 0) {
            showResultDialog("draw");
            winnerFound = true;
        }
    }

    private void showResultDialog(String winner) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        if(winner.equals("X")) {
            alertDialog.setTitle("X has won");
        }
        else if(winner.equals("O")){
            alertDialog.setTitle("O has won");
        }
        else {
            alertDialog.setTitle("It's a draw");
        }
        alertDialog.setMessage("Wanna play again?");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                cleanGame();
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(PlayGameActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    private void cleanGame(){
        cell0 = new Cell(0, -1);
        cell1 = new Cell(1, -1);
        cell2 = new Cell(2, -1);
        cell3 = new Cell(3, -1);
        cell4 = new Cell(4, -1);
        cell5 = new Cell(5, -1);
        cell6 = new Cell(6, -1);
        cell7 = new Cell(7, -1);
        cell8 = new Cell(8, -1);
        mImage00.setBackgroundResource(R.color.colorPrimaryDark);
        mImage01.setBackgroundResource(R.color.colorPrimaryDark);
        mImage02.setBackgroundResource(R.color.colorPrimaryDark);
        mImage10.setBackgroundResource(R.color.colorPrimaryDark);
        mImage11.setBackgroundResource(R.color.colorPrimaryDark);
        mImage12.setBackgroundResource(R.color.colorPrimaryDark);
        mImage20.setBackgroundResource(R.color.colorPrimaryDark);
        mImage21.setBackgroundResource(R.color.colorPrimaryDark);
        mImage22.setBackgroundResource(R.color.colorPrimaryDark);
        mO.setEnabled(true);
        mX.setEnabled(true);
        mX.setChecked(true);
        mO.setChecked(false);
        winnerFound = false;
        move = true;
    }

}
