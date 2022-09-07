package com.example.gatojuanpablo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int contX = 0;
    int contO = 0;
    boolean cambiar;
    boolean ganador;
    boolean jugada1;
    boolean jugada2;
    boolean jugada3;
    boolean jugada4;
    boolean jugada5;
    boolean jugada6;
    boolean jugada7;
    boolean jugada8;
    boolean jugada9;
    String movimiento1 = "";
    String movimiento2 = "";
    String movimiento3 = "";
    String movimiento4 = "";
    String movimiento5 = "";
    String movimiento6 = "";
    String movimiento7 = "";
    String movimiento8 = "";
    String movimiento9 = "";
    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;
    Button boton5;
    Button boton6;
    Button boton7;
    Button boton8;
    Button boton9;
    Button boton10;
    TextView Texto1;
    TextView Texto2;
    TextView PuntosX;
    TextView PuntosO;
    TextView Ganando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ganador = false;
        cambiar = true;
        jugada1 = true;
        jugada2 = true;
        jugada3 = true;
        jugada4 = true;
        jugada5 = true;
        jugada6 = true;
        jugada7 = true;
        jugada8 = true;
        jugada9 = true;
        boton1 = findViewById(R.id.button1);
        boton2 = findViewById(R.id.button2);
        boton3 = findViewById(R.id.button3);
        boton4 = findViewById(R.id.button4);
        boton5 = findViewById(R.id.button5);
        boton6 = findViewById(R.id.button6);
        boton7 = findViewById(R.id.button7);
        boton8 = findViewById(R.id.button8);
        boton9 = findViewById(R.id.button9);
        boton10 = findViewById(R.id.button10);
        Texto1 = findViewById(R.id.textView1);
        Texto2 = findViewById(R.id.textView2);
        PuntosX = findViewById(R.id.puntosx);
        PuntosO = findViewById(R.id.puntoso);
        Ganando = findViewById(R.id.ganador);
    }

    public void pulsarBoton1(View v) {
        if (ganador == false){
            if (jugada1 == true){
                if (cambiar == true) {
                    boton1.setText("X");
                    Texto1.setText("Le van a las O");
                    movimiento1 = "X";
                    cambiar = false;
                    jugada1 = false;
                } else {
                    boton1.setText("O");
                    Texto1.setText("Le van a las X");
                    movimiento1 = "O";
                    cambiar = true;
                    jugada1 = false;
                }
                if(movimiento1 == "X" & movimiento2 == "X" & movimiento3 == "X" || movimiento4 == "X" & movimiento5 == "X" & movimiento6 == "X" || movimiento7 == "X" & movimiento8 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento4 == "X" & movimiento7 == "X" || movimiento2 == "X" & movimiento5 == "X" & movimiento8 == "X" || movimiento3 == "X" & movimiento6 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento5 == "X" & movimiento9 == "X" || movimiento3 == "X" & movimiento5 == "X" & movimiento7 == "X"){
                    ganador = true;
                    Texto2.setText("Ganaron las X");
                    contX++;

                }else{
                    if(movimiento1 == "O" & movimiento2 == "O" & movimiento3 == "O" || movimiento4 == "O" & movimiento5 == "O" & movimiento6 == "O" || movimiento7 == "O" & movimiento8 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento4 == "O" & movimiento7 == "O" || movimiento2 == "O" & movimiento5 == "O" & movimiento8 == "O" || movimiento3 == "O" & movimiento6 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento5 == "O" & movimiento9 == "O" || movimiento3 == "O" & movimiento5 == "O" & movimiento7 == "O"){
                        ganador = true;
                        Texto2.setText("Ganaron las O");
                        contO++;
                    }else{
                        if(jugada1 == false & jugada2 == false & jugada3 == false & jugada4 == false & jugada5 == false & jugada6 == false & jugada7 == false & jugada8 == false & jugada9 == false){
                            ganador = true;
                            Texto2.setText("Nadie ganó :(");
                        }
                    }
                }
            }
        }
    }

    public void pulsarBoton2(View v) {
        if (ganador == false){
            if (jugada2 == true){
                if (cambiar == true) {
                    boton2.setText("X");
                    Texto1.setText("Le van a las O");
                    movimiento2 = "X";
                    cambiar = false;
                    jugada2 = false;
                } else {
                    boton2.setText("O");
                    Texto1.setText("Le van a las X");
                    movimiento2 = "O";
                    cambiar = true;
                    jugada2 = false;
                }
                if(movimiento1 == "X" & movimiento2 == "X" & movimiento3 == "X" || movimiento4 == "X" & movimiento5 == "X" & movimiento6 == "X" || movimiento7 == "X" & movimiento8 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento4 == "X" & movimiento7 == "X" || movimiento2 == "X" & movimiento5 == "X" & movimiento8 == "X" || movimiento3 == "X" & movimiento6 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento5 == "X" & movimiento9 == "X" || movimiento3 == "X" & movimiento5 == "X" & movimiento7 == "X"){
                    ganador = true;
                    Texto2.setText("Ganaron las X");
                    contX++;

                }else{
                    if(movimiento1 == "O" & movimiento2 == "O" & movimiento3 == "O" || movimiento4 == "O" & movimiento5 == "O" & movimiento6 == "O" || movimiento7 == "O" & movimiento8 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento4 == "O" & movimiento7 == "O" || movimiento2 == "O" & movimiento5 == "O" & movimiento8 == "O" || movimiento3 == "O" & movimiento6 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento5 == "O" & movimiento9 == "O" || movimiento3 == "O" & movimiento5 == "O" & movimiento7 == "O"){
                        ganador = true;
                        Texto2.setText("Ganaron las O");
                        contO++;
                    }else{
                        if(jugada1 == false & jugada2 == false & jugada3 == false & jugada4 == false & jugada5 == false & jugada6 == false & jugada7 == false & jugada8 == false & jugada9 == false){
                            ganador = true;
                            Texto2.setText("Nadie ganó :(");
                        }
                    }
                }
            }
        }
    }

    public void pulsarBoton3(View v) {
        if (ganador == false){
            if (jugada3 == true){
                if (cambiar == true) {
                    boton3.setText("X");
                    Texto1.setText("Le van a las O");
                    movimiento3 = "X";
                    cambiar = false;
                    jugada3 = false;
                } else {
                    boton3.setText("O");
                    Texto1.setText("Le van a las X");
                    movimiento3 = "O";
                    cambiar = true;
                    jugada3 = false;
                }
                if(movimiento1 == "X" & movimiento2 == "X" & movimiento3 == "X" || movimiento4 == "X" & movimiento5 == "X" & movimiento6 == "X" || movimiento7 == "X" & movimiento8 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento4 == "X" & movimiento7 == "X" || movimiento2 == "X" & movimiento5 == "X" & movimiento8 == "X" || movimiento3 == "X" & movimiento6 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento5 == "X" & movimiento9 == "X" || movimiento3 == "X" & movimiento5 == "X" & movimiento7 == "X"){
                    ganador = true;
                    Texto2.setText("Ganaron las X");
                    contX++;

                }else{
                    if(movimiento1 == "O" & movimiento2 == "O" & movimiento3 == "O" || movimiento4 == "O" & movimiento5 == "O" & movimiento6 == "O" || movimiento7 == "O" & movimiento8 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento4 == "O" & movimiento7 == "O" || movimiento2 == "O" & movimiento5 == "O" & movimiento8 == "O" || movimiento3 == "O" & movimiento6 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento5 == "O" & movimiento9 == "O" || movimiento3 == "O" & movimiento5 == "O" & movimiento7 == "O"){
                        ganador = true;
                        Texto2.setText("Ganaron las O");
                        contO++;
                    }else{
                        if(jugada1 == false & jugada2 == false & jugada3 == false & jugada4 == false & jugada5 == false & jugada6 == false & jugada7 == false & jugada8 == false & jugada9 == false){
                            ganador = true;
                            Texto2.setText("Nadie ganó :(");
                        }
                    }
                }
            }
        }
    }

    public void pulsarBoton4(View v) {
        if (ganador == false){
            if (jugada4 == true){
                if (cambiar == true) {
                    boton4.setText("X");
                    Texto1.setText("Le van a las O");
                    movimiento4 = "X";
                    cambiar = false;
                    jugada4 = false;
                } else {
                    boton4.setText("O");
                    Texto1.setText("Le van a las X");
                    movimiento4 = "O";
                    cambiar = true;
                    jugada4 = false;
                }
                if(movimiento1 == "X" & movimiento2 == "X" & movimiento3 == "X" || movimiento4 == "X" & movimiento5 == "X" & movimiento6 == "X" || movimiento7 == "X" & movimiento8 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento4 == "X" & movimiento7 == "X" || movimiento2 == "X" & movimiento5 == "X" & movimiento8 == "X" || movimiento3 == "X" & movimiento6 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento5 == "X" & movimiento9 == "X" || movimiento3 == "X" & movimiento5 == "X" & movimiento7 == "X"){
                    ganador = true;
                    Texto2.setText("Ganaron las X");
                    contX++;

                }else{
                    if(movimiento1 == "O" & movimiento2 == "O" & movimiento3 == "O" || movimiento4 == "O" & movimiento5 == "O" & movimiento6 == "O" || movimiento7 == "O" & movimiento8 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento4 == "O" & movimiento7 == "O" || movimiento2 == "O" & movimiento5 == "O" & movimiento8 == "O" || movimiento3 == "O" & movimiento6 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento5 == "O" & movimiento9 == "O" || movimiento3 == "O" & movimiento5 == "O" & movimiento7 == "O"){
                        ganador = true;
                        Texto2.setText("Ganaron las O");
                        contO++;
                    }else{
                        if(jugada1 == false & jugada2 == false & jugada3 == false & jugada4 == false & jugada5 == false & jugada6 == false & jugada7 == false & jugada8 == false & jugada9 == false){
                            ganador = true;
                            Texto2.setText("Nadie ganó :(");
                        }
                    }
                }
            }
        }
    }

    public void pulsarBoton5(View v) {
        if (ganador == false){
            if (jugada5 == true){
                if (cambiar == true) {
                    boton5.setText("X");
                    Texto1.setText("Le van a las O");
                    movimiento5 = "X";
                    cambiar = false;
                    jugada5 = false;
                } else {
                    boton5.setText("O");
                    Texto1.setText("Le van a las X");
                    movimiento5 = "O";
                    cambiar = true;
                    jugada5 = false;
                }
                if(movimiento1 == "X" & movimiento2 == "X" & movimiento3 == "X" || movimiento4 == "X" & movimiento5 == "X" & movimiento6 == "X" || movimiento7 == "X" & movimiento8 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento4 == "X" & movimiento7 == "X" || movimiento2 == "X" & movimiento5 == "X" & movimiento8 == "X" || movimiento3 == "X" & movimiento6 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento5 == "X" & movimiento9 == "X" || movimiento3 == "X" & movimiento5 == "X" & movimiento7 == "X"){
                    ganador = true;
                    Texto2.setText("Ganaron las X");
                    contX++;

                }else{
                    if(movimiento1 == "O" & movimiento2 == "O" & movimiento3 == "O" || movimiento4 == "O" & movimiento5 == "O" & movimiento6 == "O" || movimiento7 == "O" & movimiento8 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento4 == "O" & movimiento7 == "O" || movimiento2 == "O" & movimiento5 == "O" & movimiento8 == "O" || movimiento3 == "O" & movimiento6 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento5 == "O" & movimiento9 == "O" || movimiento3 == "O" & movimiento5 == "O" & movimiento7 == "O"){
                        ganador = true;
                        Texto2.setText("Ganaron las O");
                        contO++;
                    }else{
                        if(jugada1 == false & jugada2 == false & jugada3 == false & jugada4 == false & jugada5 == false & jugada6 == false & jugada7 == false & jugada8 == false & jugada9 == false){
                            ganador = true;
                            Texto2.setText("Nadie ganó :(");
                        }
                    }
                }
            }
        }
    }

    public void pulsarBoton6(View v) {
        if (ganador == false){
            if (jugada6 == true){
                if (cambiar == true) {
                    boton6.setText("X");
                    Texto1.setText("Le van a las O");
                    movimiento6 = "X";
                    cambiar = false;
                    jugada6 = false;
                } else {
                    boton6.setText("O");
                    Texto1.setText("Le van a las X");
                    movimiento6 = "O";
                    cambiar = true;
                    jugada6 = false;
                }
                if(movimiento1 == "X" & movimiento2 == "X" & movimiento3 == "X" || movimiento4 == "X" & movimiento5 == "X" & movimiento6 == "X" || movimiento7 == "X" & movimiento8 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento4 == "X" & movimiento7 == "X" || movimiento2 == "X" & movimiento5 == "X" & movimiento8 == "X" || movimiento3 == "X" & movimiento6 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento5 == "X" & movimiento9 == "X" || movimiento3 == "X" & movimiento5 == "X" & movimiento7 == "X"){
                    ganador = true;
                    Texto2.setText("Ganaron las X");
                    contX++;

                }else{
                    if(movimiento1 == "O" & movimiento2 == "O" & movimiento3 == "O" || movimiento4 == "O" & movimiento5 == "O" & movimiento6 == "O" || movimiento7 == "O" & movimiento8 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento4 == "O" & movimiento7 == "O" || movimiento2 == "O" & movimiento5 == "O" & movimiento8 == "O" || movimiento3 == "O" & movimiento6 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento5 == "O" & movimiento9 == "O" || movimiento3 == "O" & movimiento5 == "O" & movimiento7 == "O"){
                        ganador = true;
                        Texto2.setText("Ganaron las O");
                        contO++;
                    }else{
                        if(jugada1 == false & jugada2 == false & jugada3 == false & jugada4 == false & jugada5 == false & jugada6 == false & jugada7 == false & jugada8 == false & jugada9 == false){
                            ganador = true;
                            Texto2.setText("Nadie ganó :(");
                        }
                    }
                }
            }
        }
    }

    public void pulsarBoton7(View v) {
        if (ganador == false){
            if (jugada7 == true){
                if (cambiar == true) {
                    boton7.setText("X");
                    Texto1.setText("Le van a las O");
                    movimiento7 = "X";
                    cambiar = false;
                    jugada7 = false;
                } else {
                    boton7.setText("O");
                    Texto1.setText("Le van a las X");
                    movimiento7 = "O";
                    cambiar = true;
                    jugada7 = false;
                }
                if(movimiento1 == "X" & movimiento2 == "X" & movimiento3 == "X" || movimiento4 == "X" & movimiento5 == "X" & movimiento6 == "X" || movimiento7 == "X" & movimiento8 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento4 == "X" & movimiento7 == "X" || movimiento2 == "X" & movimiento5 == "X" & movimiento8 == "X" || movimiento3 == "X" & movimiento6 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento5 == "X" & movimiento9 == "X" || movimiento3 == "X" & movimiento5 == "X" & movimiento7 == "X"){
                    ganador = true;
                    Texto2.setText("Ganaron las X");
                    contX++;

                }else{
                    if(movimiento1 == "O" & movimiento2 == "O" & movimiento3 == "O" || movimiento4 == "O" & movimiento5 == "O" & movimiento6 == "O" || movimiento7 == "O" & movimiento8 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento4 == "O" & movimiento7 == "O" || movimiento2 == "O" & movimiento5 == "O" & movimiento8 == "O" || movimiento3 == "O" & movimiento6 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento5 == "O" & movimiento9 == "O" || movimiento3 == "O" & movimiento5 == "O" & movimiento7 == "O"){
                        ganador = true;
                        Texto2.setText("Ganaron las O");
                        contO++;
                    }else{
                        if(jugada1 == false & jugada2 == false & jugada3 == false & jugada4 == false & jugada5 == false & jugada6 == false & jugada7 == false & jugada8 == false & jugada9 == false){
                            ganador = true;
                            Texto2.setText("Nadie ganó :(");
                        }
                    }
                }
            }
        }
    }

    public void pulsarBoton8(View v) {
        if (ganador == false){
            if (jugada8 == true){
                if (cambiar == true) {
                    boton8.setText("X");
                    Texto1.setText("Le van a las O");
                    movimiento8 = "X";
                    cambiar = false;
                    jugada8 = false;
                } else {
                    boton8.setText("O");
                    Texto1.setText("Le van a las X");
                    movimiento8 = "O";
                    cambiar = true;
                    jugada8 = false;
                }
                if(movimiento1 == "X" & movimiento2 == "X" & movimiento3 == "X" || movimiento4 == "X" & movimiento5 == "X" & movimiento6 == "X" || movimiento7 == "X" & movimiento8 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento4 == "X" & movimiento7 == "X" || movimiento2 == "X" & movimiento5 == "X" & movimiento8 == "X" || movimiento3 == "X" & movimiento6 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento5 == "X" & movimiento9 == "X" || movimiento3 == "X" & movimiento5 == "X" & movimiento7 == "X"){
                    ganador = true;
                    Texto2.setText("Ganaron las X");
                    contX++;

                }else{
                    if(movimiento1 == "O" & movimiento2 == "O" & movimiento3 == "O" || movimiento4 == "O" & movimiento5 == "O" & movimiento6 == "O" || movimiento7 == "O" & movimiento8 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento4 == "O" & movimiento7 == "O" || movimiento2 == "O" & movimiento5 == "O" & movimiento8 == "O" || movimiento3 == "O" & movimiento6 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento5 == "O" & movimiento9 == "O" || movimiento3 == "O" & movimiento5 == "O" & movimiento7 == "O"){
                        ganador = true;
                        Texto2.setText("Ganaron las O");
                        contO++;
                    }else{
                        if(jugada1 == false & jugada2 == false & jugada3 == false & jugada4 == false & jugada5 == false & jugada6 == false & jugada7 == false & jugada8 == false & jugada9 == false){
                            ganador = true;
                            Texto2.setText("Nadie ganó :(");
                        }
                    }
                }
            }
        }
    }

    public void pulsarBoton9(View v) {
        if (ganador == false){
            if (jugada9 == true){
                if (cambiar == true) {
                    boton9.setText("X");
                    Texto1.setText("Le van a las O");
                    movimiento9 = "X";
                    cambiar = false;
                    jugada9 = false;
                } else {
                    boton9.setText("O");
                    Texto1.setText("Le van a las X");
                    movimiento9 = "O";
                    cambiar = true;
                    jugada9 = false;
                }
                if(movimiento1 == "X" & movimiento2 == "X" & movimiento3 == "X" || movimiento4 == "X" & movimiento5 == "X" & movimiento6 == "X" || movimiento7 == "X" & movimiento8 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento4 == "X" & movimiento7 == "X" || movimiento2 == "X" & movimiento5 == "X" & movimiento8 == "X" || movimiento3 == "X" & movimiento6 == "X" & movimiento9 == "X" || movimiento1 == "X" & movimiento5 == "X" & movimiento9 == "X" || movimiento3 == "X" & movimiento5 == "X" & movimiento7 == "X"){
                    ganador = true;
                    Texto2.setText("Ganaron las X");
                    contX++;

                }else{
                    if(movimiento1 == "O" & movimiento2 == "O" & movimiento3 == "O" || movimiento4 == "O" & movimiento5 == "O" & movimiento6 == "O" || movimiento7 == "O" & movimiento8 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento4 == "O" & movimiento7 == "O" || movimiento2 == "O" & movimiento5 == "O" & movimiento8 == "O" || movimiento3 == "O" & movimiento6 == "O" & movimiento9 == "O" || movimiento1 == "O" & movimiento5 == "O" & movimiento9 == "O" || movimiento3 == "O" & movimiento5 == "O" & movimiento7 == "O"){
                        ganador = true;
                        Texto2.setText("Ganaron las O");
                        contO++;
                    }else{
                        if(jugada1 == false & jugada2 == false & jugada3 == false & jugada4 == false & jugada5 == false & jugada6 == false & jugada7 == false & jugada8 == false & jugada9 == false){
                            ganador = true;
                            Texto2.setText("Nadie ganó :(");
                        }
                    }
                }
            }
        }
    }

    public void pulsarBotonM(View v) {
        ganador = false;
        cambiar = true;
        jugada1 = true;
        jugada2 = true;
        jugada3 = true;
        jugada4 = true;
        jugada5 = true;
        jugada6 = true;
        jugada7 = true;
        jugada8 = true;
        jugada9 = true;
        movimiento1 = "#";
        movimiento2 = "#";
        movimiento3 = "#";
        movimiento4 = "#";
        movimiento5 = "#";
        movimiento6 = "#";
        movimiento7 = "#";
        movimiento8 = "#";
        movimiento9 = "#";
        boton1.setText(" ");
        boton2.setText(" ");
        boton3.setText(" ");
        boton4.setText(" ");
        boton5.setText(" ");
        boton6.setText(" ");
        boton7.setText(" ");
        boton8.setText(" ");
        boton9.setText(" ");
        Texto1.setText("Le va a las X");
        Texto2.setText("Esperando a ver quién gana");
        PuntosO.setText("Puntos O:"+contO);
        PuntosX.setText("Puntos X:"+contX);
        if (contX > contO){
            Ganando.setText("Las X van ganando");
        }
        else if(contO > contX){
            Ganando.setText("Las O van ganando");
        }
        else{
            Ganando.setText("Van empatados :/");
        }
    }
}