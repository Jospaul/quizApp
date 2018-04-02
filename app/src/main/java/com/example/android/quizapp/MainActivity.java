package com.example.android.quizapp;

import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    int totalAttempt = 0;
    String friendsCast;
    int ansChandler = 0;
    int ansMonica = 0;
    int ansRachel = 0;
    int ansRoss = 0;
    int ansJoey = 0;
    int ansPhoebe = 0;
    String userQuesAttempt = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickChandler(View v){
        enableQues();
        resetQuestions();
        ansChandler = 0;
        EditText q1 = (EditText) findViewById(R.id.ans1);
        q1.setHint("What is the address Chandler gives Janice when " +
                "he lies about moving to Yemen?");
        q1 = (EditText) findViewById(R.id.ans2);
        q1.setHint("What is Chandler’s middle name?");
        TextView q2 = (TextView) findViewById(R.id.q3);
        q2.setText("What is Chandler Bing's job title?");

        RadioButton r1 = (RadioButton) findViewById(R.id.radioAns1);
        r1.setText("Management Information System Director");
        r1 = (RadioButton) findViewById(R.id.radioAns2);
        r1.setText("Customer Support Specialist");
        r1 = (RadioButton) findViewById(R.id.radioAns3);
        r1.setText("Statistical Analysis and Data Reconfiguration");
        r1 = (RadioButton) findViewById(R.id.radioAns4);
        r1.setText("Information Technology Coordinator");

        friendsCast = "Chandler";
        userQuesAttempt += "1";
    }

    public void clickMonica(View v){
        enableQues();
        resetQuestions();
        ansMonica = 0;
        EditText q1 = (EditText) findViewById(R.id.ans1);
        q1.setHint("On what did Monica’s parents spend her wedding fund?    ");
        q1 = (EditText) findViewById(R.id.ans2);
        q1.setHint("What are Monica and Chandler’s twins called?");
        TextView q2 = (TextView) findViewById(R.id.q3);
        q2.setText("How many towel categories does Monica have?");

        RadioButton r1 = (RadioButton) findViewById(R.id.radioAns1);
        r1.setText("9");
        r1 = (RadioButton) findViewById(R.id.radioAns2);
        r1.setText("11");
        r1 = (RadioButton) findViewById(R.id.radioAns3);
        r1.setText("13");
        r1 = (RadioButton) findViewById(R.id.radioAns4);
        r1.setText("10");

        friendsCast = "Monica";
        userQuesAttempt += "2";
    }

    public void clickRoss(View v){
        enableQues();
        resetQuestions();
        ansRoss = 0;
        EditText q1 = (EditText) findViewById(R.id.ans1);
        q1.setHint("Right after high school, what career did Ross try to pursue?");
        q1 = (EditText) findViewById(R.id.ans2);
        q1.setHint("What was the name of the comic book Ross made as a child?");
        TextView q2 = (TextView) findViewById(R.id.q3);
        q2.setText("What food is Ross allergic to in \"The One With The Baby on the Bus?\"");

        RadioButton r1 = (RadioButton) findViewById(R.id.radioAns1);
        r1.setText("Chocolate, Eggs, and Pears");
        r1 = (RadioButton) findViewById(R.id.radioAns2);
        r1.setText("Milk, Eggs, and Kiwi");
        r1 = (RadioButton) findViewById(R.id.radioAns3);
        r1.setText("Apples, Milk, and Peanuts");
        r1 = (RadioButton) findViewById(R.id.radioAns4);
        r1.setText("Kiwi, Lobster, and Peanuts");

        friendsCast = "Ross";
        userQuesAttempt += "3";
    }

    public void clickRachel(View v){
        enableQues();
        resetQuestions();
        ansRachel = 0;
        EditText q1 = (EditText) findViewById(R.id.ans1);
        q1.setHint("What word did Rachel misspell on her résumé?");
        q1 = (EditText) findViewById(R.id.ans2);
        q1.setHint("What did Rachel think Emma's first word was?");
        TextView q2 = (TextView) findViewById(R.id.q3);
        q2.setText("What is the name of the bakery the cheesecake that Rachel and Chandler eats from the floor?");

        RadioButton r1 = (RadioButton) findViewById(R.id.radioAns1);
        r1.setText("The Corner Shop");
        r1 = (RadioButton) findViewById(R.id.radioAns2);
        r1.setText("Mama’s Little Bakery");
        r1 = (RadioButton) findViewById(R.id.radioAns3);
        r1.setText("Cupcake world");
        r1 = (RadioButton) findViewById(R.id.radioAns4);
        r1.setText("Sweet Indulgences");

        friendsCast = "Rachel";
        userQuesAttempt += "4";
    }

    public void clickJoey(View v){
        enableQues();
        resetQuestions();
        ansJoey = 0;
        EditText q1 = (EditText) findViewById(R.id.ans1);
        q1.setHint("What is Joey's full name?");
        q1 = (EditText) findViewById(R.id.ans2);
        q1.setHint("Joey and Chandler spent days in reclining chairs watching TV. Which of these did they watch?");
        TextView q2 = (TextView) findViewById(R.id.q3);
        q2.setText("The poster for which of these movies appears on Joey's wall?");

        RadioButton r1 = (RadioButton) findViewById(R.id.radioAns1);
        r1.setText("The Godfather");
        r1 = (RadioButton) findViewById(R.id.radioAns2);
        r1.setText("The Godfather 2");
        r1 = (RadioButton) findViewById(R.id.radioAns3);
        r1.setText("Scarface");
        r1 = (RadioButton) findViewById(R.id.radioAns4);
        r1.setText("Pulp Fiction");

        friendsCast = "Joey";
        userQuesAttempt += "5";
    }

    public void clickPhoebe(View v){
        enableQues();
        resetQuestions();
        ansPhoebe = 0;
        EditText q1 = (EditText) findViewById(R.id.ans1);
        q1.setHint("What is the name of the hideous woman coming out the picture piece of art that Phoebe gives to Monica?");
        q1 = (EditText) findViewById(R.id.ans2);
        q1.setHint("What kind of college does Frank, Phoebe's brother say he goes to?");
        TextView q2 = (TextView) findViewById(R.id.q3);
        q2.setText("What idea did Phoebe like for naming one of the boy babies?");

        RadioButton r1 = (RadioButton) findViewById(R.id.radioAns1);
        r1.setText("A name that began with \"the\"");
        r1 = (RadioButton) findViewById(R.id.radioAns2);
        r1.setText("The Hulk");
        r1 = (RadioButton) findViewById(R.id.radioAns3);
        r1.setText("Gene");
        r1 = (RadioButton) findViewById(R.id.radioAns4);
        r1.setText("Barney");

        friendsCast = "Phoebe";
        userQuesAttempt += "6";
    }

    private void checkAnswersEntered(String friends){

        String answers;
        if(friends.equalsIgnoreCase("Chandler")) {
            EditText q1 = (EditText) findViewById(R.id.ans1);
            answers = q1.getText().toString();
            if (answers.compareToIgnoreCase("15 Yemen Road, Yemen") == 0) {
                ansChandler += 1;
                totalAttempt += 1;
            } else if (!answers.isEmpty()) {
                totalAttempt += 1;
            }
            q1 = (EditText) findViewById(R.id.ans2);
            answers = q1.getText().toString();
            if (answers.compareToIgnoreCase("Murielle") == 0) {
                ansChandler += 1;
                totalAttempt += 1;
            } else if (!answers.isEmpty()) {
                totalAttempt += 1;
            }
        }
        else if(friends.equalsIgnoreCase("Monica")){
            EditText q1 = (EditText) findViewById(R.id.ans1);
            answers = q1.getText().toString();
            if (answers.compareToIgnoreCase("Beach House") == 0) {
                ansMonica += 1;
                totalAttempt += 1;
            } else if (!answers.isEmpty()) {
                totalAttempt += 1;
            }
            q1 = (EditText) findViewById(R.id.ans2);
            answers = q1.getText().toString();
            if (answers.compareToIgnoreCase("Jack and Erica") == 0) {
                ansMonica += 1;
                totalAttempt += 1;
            } else if (!answers.isEmpty()) {
                totalAttempt += 1;
            }
        }
        else if(friends.equalsIgnoreCase("Ross")){
            EditText q1 = (EditText) findViewById(R.id.ans1);
            answers = q1.getText().toString();
            if (answers.compareToIgnoreCase("Dancer") == 0) {
                ansRoss += 1;
                totalAttempt += 1;
            } else if (!answers.isEmpty()) {
                totalAttempt += 1;
            }
            q1 = (EditText) findViewById(R.id.ans2);
            answers = q1.getText().toString();
            if (answers.compareToIgnoreCase("Science Boy") == 0) {
                ansRoss += 1;
                totalAttempt += 1;
            } else if (!answers.isEmpty()) {
                totalAttempt += 1;
            }
        }
        else if(friends.equalsIgnoreCase("Rachel")){
            EditText q1 = (EditText) findViewById(R.id.ans1);
            answers = q1.getText().toString();
            if (answers.compareToIgnoreCase("Computer") == 0) {
                ansRachel += 1;
                totalAttempt += 1;
            } else if (!answers.isEmpty()) {
                totalAttempt += 1;
            }
            q1 = (EditText) findViewById(R.id.ans2);
            answers = q1.getText().toString();
            if (answers.compareToIgnoreCase("Gleeba") == 0) {
                ansRachel += 1;
                totalAttempt += 1;
            } else if (!answers.isEmpty()) {
                totalAttempt += 1;
            }
        }
        else if(friends.equalsIgnoreCase("Joey")){
            EditText q1 = (EditText) findViewById(R.id.ans1);
            answers = q1.getText().toString();
            if (answers.compareToIgnoreCase("Joseph Francis Tribiani") == 0) {
                ansJoey += 1;
                totalAttempt += 1;
            } else if (!answers.isEmpty()) {
                totalAttempt += 1;
            }
            q1 = (EditText) findViewById(R.id.ans2);
            answers = q1.getText().toString();
            if (answers.compareToIgnoreCase("Beavis and Butt head") == 0) {
                ansJoey += 1;
                totalAttempt += 1;
            } else if (!answers.isEmpty()) {
                totalAttempt += 1;
            }
        }
        else if(friends.equalsIgnoreCase("Phoebe")){
            EditText q1 = (EditText) findViewById(R.id.ans1);
            answers = q1.getText().toString();
            if (answers.compareToIgnoreCase("Gladys") == 0) {
                ansPhoebe += 1;
                totalAttempt += 1;
            } else if (!answers.isEmpty()) {
                totalAttempt += 1;
            }
            q1 = (EditText) findViewById(R.id.ans2);
            answers = q1.getText().toString();
            if (answers.compareToIgnoreCase("Refrigerator College") == 0) {
                ansPhoebe += 1;
                totalAttempt += 1;
            } else if (!answers.isEmpty()) {
                totalAttempt += 1;
            }
        }
    }

    public void onRadioButtonClicked(View v){
        if(friendsCast.equalsIgnoreCase("Chandler")){
            boolean checked = ((RadioButton) v).isChecked();
            ansChandler = 0;
            switch(v.getId()){
                case R.id.radioAns1:
                    if(checked) {
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns2:
                    if(checked){
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns3:
                    if(checked){
                        totalAttempt += 1;
                        ansChandler += 1;
                        disableQues();
                    }
                    break;
                case R.id.radioAns4:
                    if(checked){
                        totalAttempt+=1;
                    }
                    break;
            }
            checkAnswersEntered(friendsCast);
        }
        else if(friendsCast.equalsIgnoreCase("Monica")){
            boolean checked = ((RadioButton) v).isChecked();
            ansMonica = 0;
            switch(v.getId()){
                case R.id.radioAns1:
                    if(checked) {
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns2:
                    if(checked){
                        totalAttempt += 1;
                        ansMonica += 1;
                        disableQues();
                    }
                    break;
                case R.id.radioAns3:
                    if(checked){
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns4:
                    if(checked){
                        totalAttempt+=1;
                    }
                    break;
            }
            checkAnswersEntered(friendsCast);
        }
        else if(friendsCast.equalsIgnoreCase("Ross")){
            boolean checked = ((RadioButton) v).isChecked();
            ansRoss = 0;
            switch(v.getId()){
                case R.id.radioAns1:
                    if(checked) {
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns2:
                    if(checked){
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns3:
                    if(checked){
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns4:
                    if(checked){
                        totalAttempt+=1;
                        ansRoss += 1;
                        disableQues();
                    }
                    break;
            }
            checkAnswersEntered(friendsCast);
        }
        else if(friendsCast.equalsIgnoreCase("Rachel")){
            boolean checked = ((RadioButton) v).isChecked();
            ansRachel = 0;
            switch(v.getId()){
                case R.id.radioAns1:
                    if(checked) {
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns2:
                    if(checked){
                        totalAttempt += 1;
                        ansRachel += 1;
                        disableQues();
                    }
                    break;
                case R.id.radioAns3:
                    if(checked){
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns4:
                    if(checked){
                        totalAttempt+=1;
                    }
                    break;
            }
            checkAnswersEntered(friendsCast);
        }
        else if(friendsCast.equalsIgnoreCase("Joey")){
            boolean checked = ((RadioButton) v).isChecked();
            ansJoey = 0;
            switch(v.getId()){
                case R.id.radioAns1:
                    if(checked) {
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns2:
                    if(checked){
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns3:
                    if(checked){
                        totalAttempt += 1;
                        ansJoey += 1;
                        disableQues();
                    }
                    break;
                case R.id.radioAns4:
                    if(checked){
                        totalAttempt+=1;
                    }
                    break;
            }
            checkAnswersEntered(friendsCast);
        }
        else if(friendsCast.equalsIgnoreCase("Phoebe")){
            boolean checked = ((RadioButton) v).isChecked();
            ansPhoebe = 0;
            switch(v.getId()){
                case R.id.radioAns1:
                    if(checked) {
                        totalAttempt += 1;
                        ansPhoebe += 1;
                        disableQues();
                    }
                    break;
                case R.id.radioAns2:
                    if(checked){
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns3:
                    if(checked){
                        totalAttempt += 1;
                    }
                    break;
                case R.id.radioAns4:
                    if(checked){
                        totalAttempt+=1;
                    }
                    break;
            }
            checkAnswersEntered(friendsCast);
        }
        updateTotals();
    }

    public void updateTotals(){
        int totalPoint = 0;
        TextView totalAttemptsView = (TextView) findViewById(R.id.questionsCount);
        totalAttemptsView.setText("" + totalAttempt);
        TextView totalScore = (TextView) findViewById(R.id.scoreCount);
        totalPoint = ansChandler + ansMonica + ansRoss + ansRachel + ansJoey + ansPhoebe;
        TextView winText = (TextView) findViewById(R.id.resultView);
        if(totalPoint == 18){
            totalScore.setTextColor(Color.parseColor("#00e676"));
            winText.setTextColor(Color.parseColor("#00e676"));
        }
        else if(totalPoint >= 15 && totalPoint < 18){
            totalScore.setTextColor(Color.parseColor("#ccff90"));
            winText.setTextColor(Color.parseColor("#ccff90"));
        }
        else if(totalPoint >= 10 && totalPoint < 15){
            totalScore.setTextColor(Color.parseColor("#f4ff81"));
            winText.setTextColor(Color.parseColor("#f4ff81"));
        }
        else if(totalPoint >= 6 && totalPoint < 10){
            totalScore.setTextColor(Color.parseColor("#ffe57f"));
            winText.setTextColor(Color.parseColor("#ffe57f"));
        }
        else if(totalPoint >= 3 && totalPoint < 6){
            totalScore.setTextColor(Color.parseColor("#ff9100"));
            winText.setTextColor(Color.parseColor("#ff9100"));
        }
        else{
            totalScore.setTextColor(Color.parseColor("#ff1744"));
            winText.setTextColor(Color.parseColor("#ff1744"));
        }
        totalScore.setText("" + totalPoint);
        if(checkAllAnswered(userQuesAttempt)) {
            winText.setText(findWinner(totalPoint, totalAttempt));
        }
    }

    public void resetQuestions(){
        EditText ques1 = (EditText) findViewById(R.id.ans1);
        ques1.setText("");
        ques1.setHint("Question 1");
        ques1 = (EditText) findViewById(R.id.ans2);
        ques1.setText("");
        ques1.setHint("Question 2");
        TextView ques2 = (TextView) findViewById(R.id.q3);
        ques2.setText("Question 3");
        RadioButton r1 = (RadioButton) findViewById(R.id.radioAns1);
        r1.setChecked(false);
        r1.setText("Answer 1");
        r1 = (RadioButton) findViewById(R.id.radioAns2);
        r1.setChecked(false);
        r1.setText("Answer 2");
        r1 = (RadioButton) findViewById(R.id.radioAns3);
        r1.setChecked(false);
        r1.setText("Answer 3");
        r1 = (RadioButton) findViewById(R.id.radioAns4);
        r1.setChecked(false);
        r1.setText("Answer 4");
        TextView results = (TextView) findViewById(R.id.resultView);
        results.setText("");
    }

    public void resetAll(View v){
        resetQuestions();
        TextView count = (TextView) findViewById(R.id.scoreCount);
        count.setText("0");
        count = (TextView) findViewById(R.id.questionsCount);
        count.setText("0");
        totalAttempt=0;
        ansPhoebe=0;
        ansJoey=0;
        ansRachel=0;
        ansRoss=0;
        ansMonica=0;
        ansChandler=0;
        friendsCast="";
        userQuesAttempt="";
    }

    public void disableQues(){
        EditText q1 = (EditText) findViewById(R.id.ans1);
        q1.setEnabled(false);
        q1 = (EditText) findViewById(R.id.ans2);
        q1.setEnabled(false);
        RadioButton r1 = (RadioButton) findViewById(R.id.radioAns1);
        r1.setEnabled(false);
        RadioButton r2 = (RadioButton) findViewById(R.id.radioAns2);
        r2.setEnabled(false);
        RadioButton r3 = (RadioButton) findViewById(R.id.radioAns3);
        r3.setEnabled(false);
        RadioButton r4 = (RadioButton) findViewById(R.id.radioAns4);
        r4.setEnabled(false);
    }

    public void enableQues(){
        EditText q1 = (EditText) findViewById(R.id.ans1);
        q1.setEnabled(true);
        q1 = (EditText) findViewById(R.id.ans2);
        q1.setEnabled(true);
        RadioButton r1 = (RadioButton) findViewById(R.id.radioAns1);
        r1.setEnabled(true);
        RadioButton r2 = (RadioButton) findViewById(R.id.radioAns2);
        r2.setEnabled(true);
        RadioButton r3 = (RadioButton) findViewById(R.id.radioAns3);
        r3.setEnabled(true);
        RadioButton r4 = (RadioButton) findViewById(R.id.radioAns4);
        r4.setEnabled(true);
    }

    public String findWinner(int finalScore, int finalAttempt){
        if(finalScore == 18){
            if(finalScore == finalAttempt){
                return "U R Friend's Crazy";
            }
            else{
                return "U R Awesome";
            }
        }
        else {
            return "U got " + finalScore + " correct! Try again!";
        }
    }

    private boolean checkAllAnswered(String userQues){
        char[] chars = userQues.toCharArray();
        String finalCheck;
        Arrays.sort(chars);
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }

        finalCheck = sb.toString();
        Log.v("Number of Users:",finalCheck);
        if(finalCheck.equalsIgnoreCase("123456")){
            return true;
        }
        else
        {
            return false;
        }
    }
}
