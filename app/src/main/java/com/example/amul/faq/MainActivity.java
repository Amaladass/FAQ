package com.example.amul.faq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void link(View v) {
        Intent intent;
        int id = v.getId();
        if(id == R.id.button){
            intent = new Intent(this,CollegeDetailsActivity.class);
            startActivity(intent);
        }
        else if(id == R.id.button1){
            intent = new Intent(this,CanteenDetailsActivity.class);
            startActivity(intent);
        }
        else if(id == R.id.button2){
            intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        }
        else if(id == R.id.button4){
            intent = new Intent(this,CoursesOfferedActivity.class);
            startActivity(intent);
        }
        else if(id == R.id.button5){
            intent = new Intent(this,DepartmentDetailsActivity.class);
            startActivity(intent);
        }
        else if(id == R.id.button6){
            intent = new Intent(this,ApplicationFormActivity.class);
            startActivity(intent);
        }
        else if(id == R.id.button7){
            intent = new Intent(this,LibraryDetails.class);
            startActivity(intent);
        }
        else if(id == R.id.button8){
            intent = new Intent(this,ContactDetails.class);
            startActivity(intent);
        }
        else if(id == R.id.button9){
            intent = new Intent(this,StrengthOfDetails.class);
            startActivity(intent);
        }
        else if(id == R.id.button10){
            intent = new Intent(this,CollegeMap.class);
            startActivity(intent);
        }
        else if(id == R.id.button11){
            intent = new Intent(this,OnlinePaymentDetails.class);
            startActivity(intent);
        }
        else if(id == R.id.button12){
            intent = new Intent(this,RulesAndRegulation.class);
            startActivity(intent);
        }
        else if(id == R.id.button13){
            intent = new Intent(this,IdeaSubmission.class);
            startActivity(intent);
        }
        else if(id == R.id.button14){
            intent = new Intent(this,ScholarshipDetails.class);
            startActivity(intent);
        }
        else if(id == R.id.button15){
            intent = new Intent(this,PassportDetails.class);
            startActivity(intent);
        }
        else if(id == R.id.button16){
            intent = new Intent(this,Infrasturcture.class);
            startActivity(intent);
        }
        else if(id == R.id.button17){
            intent = new Intent(this,CollegePhotos.class);
            startActivity(intent);
        }
        else if(id == R.id.button18){
            intent = new Intent(this,AnnualFee.class);
            startActivity(intent);
        }
        else if(id == R.id.button19){
            intent = new Intent(this,BankLoan.class);
            startActivity(intent);
        }
        else if(id == R.id.button20){
            intent = new Intent(this,HostelDetails.class);
            startActivity(intent);
        }
        else if(id == R.id.button21){
            intent = new Intent(this,IvRequisition.class);
            startActivity(intent);
        }
        else if(id == R.id.button22){
            intent = new Intent(this,TransportDetails.class);
            startActivity(intent);
        }
        else if(id == R.id.button23){
            intent = new Intent(this,PlacementDetails.class);
            startActivity(intent);
        }
        else if(id == R.id.button24){
            intent = new Intent(this,CollegeTiming.class);
            startActivity(intent);
        }
    }
}
