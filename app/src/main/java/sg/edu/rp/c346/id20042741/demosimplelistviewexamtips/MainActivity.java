package sg.edu.rp.c346.id20042741.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvExamTips;
    String[] examTipsArray;
    ArrayList<String> examTipsAL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips); //get the listview

        examTipsAL = new ArrayList<String>();

        examTipsAL.add("Don't just read the code, code it as much as possible during each practical session");
        examTipsAL.add("Seek help from the lecturer ASAP, don't wait till you lost in the jungle");
        examTipsAL.add("Prepare your template source code for each topic");
        examTipsAL.add("Create a few empty Android projects to speed up your coding during the Exam");
        examTipsAL.add("Ensure that your Android Studio is up and running before the exam");



        // an array to store values
        //examTipsArray = new String[]{"Don't just read the code, code it as much as possible during each practical session", "Seek help from the lecturer ASAP, don't wait till you lost in the jungle", "Prepare your template source code for each topic", "Create a few empty Android projects to speed up your coding during the Exam", "Ensure that your Android Studio is up and running before the exam"};

        // an arrayadapter is to adapt an array of objects as a datasource
        ArrayAdapter examTipsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, examTipsAL);

        // populates the listview with the datasource value in the adapter;
        lvExamTips.setAdapter(examTipsAdapter);
    }
}