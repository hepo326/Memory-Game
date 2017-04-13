package com.example.mohebbadawy.memorygame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

      int num_success=0;




    TextView successTxt;
    TextView triesTxt;

    ImageView android1;
    ImageView android2;
    ImageView android3;
    ImageView android4;
    ImageView android5;
    ImageView android6;
    ImageView android7;
    ImageView android8;
    ImageView android9;
    ImageView android10;
    ImageView android11;
    ImageView android12;
    ImageView android13;
    ImageView android14;
    ImageView android15;
    ImageView android16;

    ImageView angel_1;
    ImageView angel_2;
    ImageView cool_1;
    ImageView cool_2;
    ImageView devil_1;
    ImageView devil_2;
    ImageView happy_1;
    ImageView happy_2;
    ImageView inlove_1;
    ImageView inlove_2;
    ImageView lol_1;
    ImageView lol_2;
    ImageView ner_1;
    ImageView ner_2;
    ImageView question_1;
    ImageView question_2;

    Button reset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        num_tries = 0;



        android1 =(ImageView)findViewById(R.id.imageView1) ;
        android2 =(ImageView)findViewById(R.id.imageView2) ;
        android3 =(ImageView)findViewById(R.id.imageView3) ;
        android4 =(ImageView)findViewById(R.id.imageView4);
        android5 =(ImageView)findViewById(R.id.imageView5);
        android6 =(ImageView)findViewById(R.id.imageView6);
        android7 =(ImageView)findViewById(R.id.imageView7);
        android8 =(ImageView)findViewById(R.id.imageView8);
        android9 =(ImageView)findViewById(R.id.imageView9);
        android10 =(ImageView)findViewById(R.id.imageView10);
        android11 =(ImageView)findViewById(R.id.imageView11);
        android12 =(ImageView)findViewById(R.id.imageView12);
        android13 =(ImageView)findViewById(R.id.imageView13);
        android14 =(ImageView)findViewById(R.id.imageView14);
        android15 =(ImageView)findViewById(R.id.imageView15);
        android16 =(ImageView)findViewById(R.id.imageView16);

        angel_1 =(ImageView)findViewById(R.id.angel);
        angel_2 =(ImageView)findViewById(R.id.angel2);
        cool_1  =(ImageView)findViewById(R.id.cool);
        cool_2 =(ImageView)findViewById(R.id.cool2);
        devil_1 =(ImageView)findViewById(R.id.devil);
        devil_2 =(ImageView)findViewById(R.id.devil2);
        happy_1 =(ImageView)findViewById(R.id.happy);
        happy_2 =(ImageView)findViewById(R.id.happy2);
        inlove_1 =(ImageView)findViewById(R.id.inlove);
        inlove_2 =(ImageView)findViewById(R.id.inlove2);
        lol_1 =(ImageView)findViewById(R.id.lol);
        lol_2 =(ImageView)findViewById(R.id.lol2);
        ner_1 =(ImageView)findViewById(R.id.ner);
        ner_2 =(ImageView)findViewById(R.id.ner2);
        question_1 =(ImageView)findViewById(R.id.question);
        question_2 =(ImageView)findViewById(R.id.question2);

        reset = (Button)findViewById(R.id.rst);

        successTxt = (TextView)findViewById(R.id.successtries);
//        triesTxt = (TextView)findViewById(R.id.tries);

        //------------------------------------------------------------------------------------------

        android1.setOnClickListener(this);
        android2.setOnClickListener(this);
        android3.setOnClickListener(this);
        android4.setOnClickListener(this);
        android5.setOnClickListener(this);
        android6.setOnClickListener(this);
        android7.setOnClickListener(this);
        android8.setOnClickListener(this);
        android9.setOnClickListener(this);
        android10.setOnClickListener(this);
        android11.setOnClickListener(this);
        android12.setOnClickListener(this);
        android13.setOnClickListener(this);
        android14.setOnClickListener(this);
        android15.setOnClickListener(this);
        android16.setOnClickListener(this);

        angel_1.setOnClickListener(this);
        angel_2.setOnClickListener(this);
        cool_1.setOnClickListener(this);
        cool_2.setOnClickListener(this);
        devil_1.setOnClickListener(this);
        devil_2.setOnClickListener(this);
        happy_1.setOnClickListener(this);
        happy_2.setOnClickListener(this);
        inlove_1.setOnClickListener(this);
        inlove_2.setOnClickListener(this);
        lol_1.setOnClickListener(this);
        lol_2.setOnClickListener(this);
        ner_1.setOnClickListener(this);
        ner_2.setOnClickListener(this);
        question_1.setOnClickListener(this);
        question_2.setOnClickListener(this);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android1.setVisibility(View.VISIBLE);
                android2.setVisibility(View.VISIBLE);
                android3.setVisibility(View.VISIBLE);
                android4.setVisibility(View.VISIBLE);
                android5.setVisibility(View.VISIBLE);
                android6.setVisibility(View.VISIBLE);
                android7.setVisibility(View.VISIBLE);
                android8.setVisibility(View.VISIBLE);
                android9.setVisibility(View.VISIBLE);
                android10.setVisibility(View.VISIBLE);
                android11.setVisibility(View.VISIBLE);
                android12.setVisibility(View.VISIBLE);
                android13.setVisibility(View.VISIBLE);
                android14.setVisibility(View.VISIBLE);
                android15.setVisibility(View.VISIBLE);
                android16.setVisibility(View.VISIBLE);

                angel_1.setVisibility(View.INVISIBLE);
                angel_2.setVisibility(View.INVISIBLE);
                cool_1.setVisibility(View.INVISIBLE);
                cool_2.setVisibility(View.INVISIBLE);
                devil_1.setVisibility(View.INVISIBLE);
                devil_2.setVisibility(View.INVISIBLE);
                happy_1.setVisibility(View.INVISIBLE);
                happy_2.setVisibility(View.INVISIBLE);
                inlove_1.setVisibility(View.INVISIBLE);
                inlove_2.setVisibility(View.INVISIBLE);
                lol_1.setVisibility(View.INVISIBLE);
                lol_2.setVisibility(View.INVISIBLE);
                ner_1.setVisibility(View.INVISIBLE);
                ner_2.setVisibility(View.INVISIBLE);
                question_1.setVisibility(View.INVISIBLE);
                question_2.setVisibility(View.INVISIBLE);

                num_success=0;

                successTxt.setText(Integer.toString(num_success));

            }
        });

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.imageView1 :



                angel_1.setVisibility(View.VISIBLE);
                android1.setVisibility(View.INVISIBLE);

                if(angel_2.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    angel_1.setVisibility(View.INVISIBLE);
                    angel_2.setVisibility(View.INVISIBLE);
                }



                break;
            case R.id.imageView2 :


                cool_2.setVisibility(View.VISIBLE);
                android2.setVisibility(View.INVISIBLE);

                if(cool_1.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    cool_1.setVisibility(View.INVISIBLE);
                    cool_2.setVisibility(View.INVISIBLE);
                }


                break;
            case R.id.imageView3 :


                lol_1.setVisibility(View.VISIBLE);
                android3.setVisibility(View.INVISIBLE);

                if(lol_2.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    lol_1.setVisibility(View.INVISIBLE);
                    lol_2.setVisibility(View.INVISIBLE);
                }


                break;
            case R.id.imageView4 :


                happy_1.setVisibility(View.VISIBLE);
                android4.setVisibility(View.INVISIBLE);

                if(happy_2.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    happy_1.setVisibility(View.INVISIBLE);
                    happy_2.setVisibility(View.INVISIBLE);
                }


                break;
            case R.id.imageView5 :


                devil_1.setVisibility(View.VISIBLE);
                android5.setVisibility(View.INVISIBLE);

                if(devil_2.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    devil_1.setVisibility(View.INVISIBLE);
                    devil_2.setVisibility(View.INVISIBLE);
                }


                break;
            case R.id.imageView6 :


                question_2.setVisibility(View.VISIBLE);
                android6.setVisibility(View.INVISIBLE);

                if(question_1.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    question_1.setVisibility(View.INVISIBLE);
                    question_2.setVisibility(View.INVISIBLE);
                }





                break;
            case R.id.imageView7 :


                ner_1.setVisibility(View.VISIBLE);
                android7.setVisibility(View.INVISIBLE);

                if(ner_2.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    ner_1.setVisibility(View.INVISIBLE);
                    ner_2.setVisibility(View.INVISIBLE);
                }




                break;
            case R.id.imageView8 :


                inlove_1.setVisibility(View.VISIBLE);
                android8.setVisibility(View.INVISIBLE);


                if(inlove_2.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    inlove_1.setVisibility(View.INVISIBLE);
                    inlove_2.setVisibility(View.INVISIBLE);
                }



                break;
            case R.id.imageView9 :


                ner_2.setVisibility(View.VISIBLE);
                android9.setVisibility(View.INVISIBLE);


                if(ner_1.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    ner_2.setVisibility(View.INVISIBLE);
                    ner_1.setVisibility(View.INVISIBLE);
                }



                break;
            case R.id.imageView10 :


                cool_1.setVisibility(View.VISIBLE);
                android10.setVisibility(View.INVISIBLE);



                if(cool_2.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    cool_2.setVisibility(View.INVISIBLE);
                    cool_1.setVisibility(View.INVISIBLE);
                }




                break;
            case R.id.imageView11 :


                inlove_2.setVisibility(View.VISIBLE);
                android11.setVisibility(View.INVISIBLE);


                if(inlove_1.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    inlove_1.setVisibility(View.INVISIBLE);
                    inlove_2.setVisibility(View.INVISIBLE);
                }




                break;
            case R.id.imageView12 :


                devil_2.setVisibility(View.VISIBLE);
                android12.setVisibility(View.INVISIBLE);


                if(devil_1.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    devil_2.setVisibility(View.INVISIBLE);
                    devil_1.setVisibility(View.INVISIBLE);
                }




                break;
            case R.id.imageView13:


                question_1.setVisibility(View.VISIBLE);
                android13.setVisibility(View.INVISIBLE);


                if(question_2.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    question_1.setVisibility(View.INVISIBLE);
                    question_2.setVisibility(View.INVISIBLE);
                }



                break;
            case R.id.imageView14:


                happy_2.setVisibility(View.VISIBLE);
                android14.setVisibility(View.INVISIBLE);


                if(happy_1.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    happy_1.setVisibility(View.INVISIBLE);
                    happy_2.setVisibility(View.INVISIBLE);
                }



                break;
            case R.id.imageView15:


                angel_2.setVisibility(View.VISIBLE);
                android15.setVisibility(View.INVISIBLE);

                if(angel_1.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    angel_2.setVisibility(View.INVISIBLE);
                    angel_1.setVisibility(View.INVISIBLE);


                }



                break;
            case R.id.imageView16:


                lol_2.setVisibility(View.VISIBLE);
                android16.setVisibility(View.INVISIBLE);


                if(lol_1.isShown())
                {
                    num_success++;
                    successTxt.setText(Integer.toString(num_success));
                    lol_1.setVisibility(View.INVISIBLE);
                    lol_2.setVisibility(View.INVISIBLE);

                }




                break;



            default:
                break;


        }


    }
}
