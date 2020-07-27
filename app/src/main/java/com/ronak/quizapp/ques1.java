package com.ronak.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ques1 extends AppCompatActivity {

    private int i=0;
    private String[] ques,o1,o2,o3,o4;
    private TextView que,opt1,opt2,opt3,opt4;
    private Button nex,pre;
    protected static int cnt=0;
    private int[] ans,trueans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques1);

        nex=(Button) findViewById(R.id.Next) ;
        pre=(Button) findViewById(R.id.Prev);
        que=(TextView) findViewById(R.id.Ques1);
        opt1=(RadioButton) findViewById(R.id.radio1);
        opt2=(RadioButton) findViewById(R.id.radio2);
        opt3=(RadioButton) findViewById(R.id.radio3);
        opt4=(RadioButton) findViewById(R.id.radio4);

        ques=new String[10];
        o1=new String[10];
        o2=new String[10];
        o3=new String[10];
        o4=new String[10];
        final RadioGroup option=(RadioGroup) findViewById(R.id.radioopt);
        final int fisrtid=opt1.getId();
        ans=new int[10];
        for(int i=0;i<10;++i)ans[i]=-1;
        trueans=new int[10];
        trueans[0]=2;
        trueans[1]=2;
        trueans[2]=2;
        trueans[3]=2;
        trueans[4]=2;
        trueans[5]=2;
        trueans[6]=2;
        trueans[7]=2;
        trueans[8]=2;
        trueans[9]=2;
        //2131165310



        ques[0]="What is your Name ?";
        o1[0]="Ram";o2[0]="Shyam";o3[0]="Bharat";o4[0]="Shatrugan";

        ques[1]="What is your Name1 ?";
        o1[1]="Ram1";o2[1]="Shyam1";o3[1]="Bharat1";o4[1]="Shatrugan1";

        ques[2]="What is your Name2 ?";
        o1[2]="Ram2";o2[2]="Shyam2";o3[2]="Bharat2";o4[2]="Shatrugan2";

        ques[3]="What is your Name3 ?";
        o1[3]="Ram3";o2[3]="Shyam3";o3[3]="Bharat3";o4[3]="Shatrugan3";

        ques[4]="What is your Name4 ?";
        o1[4]="Ram4";o2[4]="Shyam4";o3[4]="Bharat4";o4[4]="Shatrugan4";

        ques[5]="What is your Name5 ?";
        o1[5]="Ram5";o2[5]="Shyam5";o3[5]="Bharat5";o4[5]="Shatrugan5";

        ques[6]="What is your Name6 ?";
        o1[6]="Ram6";o2[6]="Shyam6";o3[6]="Bharat6";o4[6]="Shatrugan6";

        ques[7]="What is your Name7 ?";
        o1[7]="Ram7";o2[7]="Shyam7";o3[7]="Bharat7";o4[7]="Shatrugan7";

        ques[8]="What is your Name8 ?";
        o1[8]="Ram8";o2[8]="Shyam8";o3[8]="Bharat8";o4[8]="Shatrugan8";

        ques[9]="What is your Name9 ?";
        o1[9]="Ram9";o2[9]="Shyam9";o3[9]="Bharat9";o4[9]="Shatrugan9";

        /*
        *  result = (TextView) findViewById(R.id.ans);

            bAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                double a1=Double.valueOf(Num1.getText().toString());
                double a2=Double.valueOf(Num2.getText().toString());

                if((Double.toString(a1).isEmpty()))a1=0.0;
                    if((Double.toString(a2).isEmpty()))a2=0.0;
                double res=a1+a2;
                result.setText(Double.toString(res));
            /* //  result.setText("ronakk");
                    int a1 = Integer.valueOf(Num1.getText().toString());
                    int a2 = Integer.valueOf(Num2.getText().toString());
                    int res = a1 + a2;
                    result.setText( String.valueOf(res));*/


        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ansmark=option.getCheckedRadioButtonId();
                option.clearCheck();
                ans[i]=ansmark-fisrtid;
                if(i<9)nex.setText("Next");
                else nex.setText("Submit");

                if(i==9)
                {
                    for(int i=0;i<10;++i)
                    {
                        if(ans[i]==trueans[i]) {
                            ++cnt;
                        }
                    }

                    openNewActivity();

                }
                else {
                    if (i < 9) i = i + 1;
                    que.setText(ques[i]);
                    opt1.setText(o1[i]);
                    opt2.setText(o2[i]);
                    opt3.setText(o3[i]);
                    opt4.setText(o4[i]);
                    if(ans[i]!=-1)option.check(fisrtid+ans[i]);
                //    if (i == 9) nex.setText("Submit");
                }


            }
        });


        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<9)nex.setText("Next");
                else nex.setText("Submit");
                int ansmark=option.getCheckedRadioButtonId();
                option.clearCheck();
                ans[i]=ansmark-fisrtid;

                if(i>0)i=i-1;
                que.setText(ques[i]);
                opt1.setText(o1[i]);
                opt2.setText(o2[i]);
                opt3.setText(o3[i]);
                opt4.setText(o4[i]);
                if(ans[i]!=-1)option.check(fisrtid+ans[i]);
            }
        });







    }
    public void openNewActivity()
    {
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("cnt1",Integer.toString(cnt));
        cnt=0;
        startActivity(intent);
    }

}