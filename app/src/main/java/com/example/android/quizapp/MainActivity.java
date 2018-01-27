package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Tracks the number of correct answers.
     */
    private int numberCorrectAnswers = 0;


    /**
     * Gets question 1 result
     */
    private RadioGroup question_1;

    /**
     * Gets question 2 result
     */
    private CheckBox question_2_A;
    private CheckBox question_2_B;
    private CheckBox question_2_C;
    private CheckBox question_2_D;

    /**
     * Gets question 3 result
     */
    private CheckBox question_3_A;
    private CheckBox question_3_B;
    private CheckBox question_3_C;
    private CheckBox question_3_D;

    /**
     * Gets question 4 result
     */
    private CheckBox question_4_A;
    private CheckBox question_4_B;
    private CheckBox question_4_C;
    private CheckBox question_4_D;


    /**
     * Gets question 5 result
     */
    private CheckBox question_5_A;
    private CheckBox question_5_B;
    private CheckBox question_5_C;
    private CheckBox question_5_D;

    /**
     * Gets question 6 result
     */
    private RadioGroup question_6;

    /**
     * Gets question 7 result
     */
    private CheckBox question_7_A;
    private CheckBox question_7_B;
    private CheckBox question_7_C;
    private CheckBox question_7_D;


    /**
     * Gets question 8 result
     */
    private CheckBox question_8_A;
    private CheckBox question_8_B;
    private CheckBox question_8_C;
    private CheckBox question_8_D;




    /**
     * stores the user email in the variable.
     */
    private String EmailUser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //-----Question number 1 Radio
        question_1 = (RadioGroup) findViewById(R.id.q1_radio_group);


        //-----Question number 2 Checkbox

        question_2_A = (CheckBox) findViewById(R.id.q2_checkbox_answer_1);
        question_2_B = (CheckBox) findViewById(R.id.q2_checkbox_answer_2);
        question_2_C = (CheckBox) findViewById(R.id.q2_checkbox_answer_3);
        question_2_D = (CheckBox) findViewById(R.id.q2_checkbox_answer_4);

        //-----Question number 3 Checkbox
        question_3_A = (CheckBox) findViewById(R.id.q3_checkbox_answer_1);
        question_3_B = (CheckBox) findViewById(R.id.q3_checkbox_answer_2);
        question_3_C = (CheckBox) findViewById(R.id.q3_checkbox_answer_3);
        question_3_D = (CheckBox) findViewById(R.id.q3_checkbox_answer_4);


        //-----Question number 4 Checkbox

        question_4_A = (CheckBox) findViewById(R.id.q4_checkbox_answer_1);
        question_4_B = (CheckBox) findViewById(R.id.q4_checkbox_answer_2);
        question_4_C = (CheckBox) findViewById(R.id.q4_checkbox_answer_3);
        question_4_D = (CheckBox) findViewById(R.id.q4_checkbox_answer_4);

        //-----Question number 5 Checkbox

        question_5_A = (CheckBox) findViewById(R.id.q5_checkbox_answer_1);
        question_5_B = (CheckBox) findViewById(R.id.q5_checkbox_answer_2);
        question_5_C = (CheckBox) findViewById(R.id.q5_checkbox_answer_3);
        question_5_D = (CheckBox) findViewById(R.id.q5_checkbox_answer_4);


        //-----Question number 6 Radio
        question_6 = (RadioGroup) findViewById(R.id.q6_radio_group);


        //-----Question number 7 Checkbox

        question_7_A = (CheckBox) findViewById(R.id.q7_checkbox_answer_1);
        question_7_B = (CheckBox) findViewById(R.id.q7_checkbox_answer_2);
        question_7_C = (CheckBox) findViewById(R.id.q7_checkbox_answer_3);
        question_7_D = (CheckBox) findViewById(R.id.q7_checkbox_answer_4);

        //-----Question number 8 Checkbox

        question_8_A = (CheckBox) findViewById(R.id.q8_checkbox_answer_1);
        question_8_B = (CheckBox) findViewById(R.id.q8_checkbox_answer_2);
        question_8_C = (CheckBox) findViewById(R.id.q8_checkbox_answer_3);
        question_8_D = (CheckBox) findViewById(R.id.q8_checkbox_answer_4);

    }


    /**
     * This method is used for calculating the number of correct answers.
     */
    private int calculateCorrectAnswers() {

        // Question number 1
        if (question_1.getCheckedRadioButtonId() == R.id.q1_radio_answer_4) {
            numberCorrectAnswers = 1;
        }

        // Question number 2
        if (question_2_A.isChecked() && question_2_B.isChecked() && question_2_C.isChecked() && question_2_D.isChecked()) {
            numberCorrectAnswers += 1;
        }


        // Question number 3
        if (question_3_A.isChecked() && question_3_B.isChecked() && question_3_C.isChecked() && question_3_D.isChecked()) {
            numberCorrectAnswers += 1;
        }

        // Question number 4
        if (question_4_A.isChecked() && question_4_B.isChecked() && question_4_C.isChecked() && question_4_D.isChecked()) {
            numberCorrectAnswers += 1;
        }

        // Question number 5
        if (question_5_A.isChecked() && question_5_C.isChecked()) {
            numberCorrectAnswers += 1;
        }

        // Question number 6
        if (question_6.getCheckedRadioButtonId() == R.id.q6_radio_answer_3) {
            numberCorrectAnswers += 1;
        }

        // Question number 7
        if (question_7_A.isChecked() && question_7_B.isChecked() && question_7_C.isChecked() && question_7_D.isChecked()) {
            numberCorrectAnswers += 1;
        }

        // Question number 8
        if (question_8_A.isChecked() && question_8_B.isChecked() && question_8_C.isChecked() && question_8_D.isChecked()) {
            numberCorrectAnswers += 1;
        }


        // returns the results
        return numberCorrectAnswers;
    }


    /**
     * This method is called when the SEE RESULT button is clicked.
     */
    public void showResult(View view) {

        String resultMessage = "\nYou answered correctly to " + calculateCorrectAnswers() + " out of 8 questions!\n";

        //if user got more then 5 answers correct gets this answer
        if (numberCorrectAnswers > 5){

            resultMessage += getString(R.string.good_job);

        //if not get this one
        } else {
            resultMessage += getString(R.string.bad_job);
        }

        displayResult(resultMessage);
    }




    /**
     * This method displays the final result of the quizz with a background image (box type).
     */
    private void displayResult(String message) {
        TextView FinalResult = (TextView) findViewById(R.id.display_result);
        FinalResult.setText(message);

        //set background image for result
        TextView backgroundResult = (TextView) findViewById(R.id.display_result);
        backgroundResult.setBackgroundResource(R.drawable.rounded_corner);
    }




    /**
     * TOAST - This method is called when the help button is clicked per each question. It will give information about the question
     */

    //Help - Information for Question 1
    public void showHelpQ1(View view) {
            Toast.makeText(this, getString(R.string.help_1), Toast.LENGTH_LONG).show();
        }

    //Help - Information for Question 2
    public void showHelpQ2(View view) {
         Toast.makeText(this, getString(R.string.help_2), Toast.LENGTH_LONG).show();
    }


    //Help - Information for Question 3
    public void showHelpQ3(View view) {
        Toast.makeText(this, getString(R.string.help_3), Toast.LENGTH_LONG).show();
    }


    //Help - Information for Question 4
    public void showHelpQ4(View view) {
        Toast.makeText(this, getString(R.string.help_4), Toast.LENGTH_LONG).show();
    }


    //Help - Information for Question 5
    public void showHelpQ5(View view) {
        Toast.makeText(this, getString(R.string.help_5), Toast.LENGTH_LONG).show();
    }

    //Help - Information for Question 6
    public void showHelpQ6(View view) {
        Toast.makeText(this, getString(R.string.help_6), Toast.LENGTH_LONG).show();
    }

    //Help - Information for Question 7
    public void showHelpQ7(View view) {
        Toast.makeText(this, getString(R.string.help_7), Toast.LENGTH_LONG).show();
    }

    //Help - Information for Question 8
    public void showHelpQ8(View view) {
        Toast.makeText(this, getString(R.string.help_8), Toast.LENGTH_LONG).show();
    }



    /**
     * This method is called to send Email to user with more information
     */


    public void sendEmail(View view) {


        EditText userEmail = (EditText) findViewById(R.id.edit_email);
        String emailUser = userEmail.getText().toString();

    //Send email if there's an email

    Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this

        intent.putExtra(Intent.EXTRA_EMAIL, emailUser); // send to the user email

        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.title_question));

        intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.text_email));


        if (intent.resolveActivity(getPackageManager()) != null) {
        startActivity(intent);
    }
    }


/**
 * This method is called to unCheck all questions
 */

        public void unCheckAllResults(View view) {

            question_1.clearCheck();

            question_2_A.setChecked(false);
            question_2_B.setChecked(false);
            question_2_C.setChecked(false);
            question_2_D.setChecked(false);

            question_3_A.setChecked(false);
            question_3_B.setChecked(false);
            question_3_C.setChecked(false);
            question_3_D.setChecked(false);

            question_4_A.setChecked(false);
            question_4_B.setChecked(false);
            question_4_C.setChecked(false);
            question_4_D.setChecked(false);

            question_5_A.setChecked(false);
            question_5_B.setChecked(false);
            question_5_C.setChecked(false);
            question_5_D.setChecked(false);

            question_6.clearCheck();

            question_7_A.setChecked(false);
            question_7_B.setChecked(false);
            question_7_C.setChecked(false);
            question_7_D.setChecked(false);

            question_8_A.setChecked(false);
            question_8_B.setChecked(false);
            question_8_C.setChecked(false);
            question_8_D.setChecked(false);

            numberCorrectAnswers = 0;




            /** After it will Scroll to top of the app to Start Over
             *
             */
            ScrollView hscrollViewMain = (ScrollView)findViewById(R.id.scrollViewMain);
            hscrollViewMain.scrollTo(0, 0); // scroll to application top


        }






    }


