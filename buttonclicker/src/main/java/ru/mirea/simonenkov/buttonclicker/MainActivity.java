package ru.mirea.simonenkov.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button ItsNotMe;
    private CheckBox checkBoxStudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_clicker);
        textViewStudent = findViewById(R.id.textViewStudent);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        ItsNotMe = findViewById(R.id.btnitsNotMe);
        checkBoxStudent = findViewById(R.id.checkBox);
        checkBoxStudent.setChecked(false);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBoxStudent.isChecked() == false){
                    checkBoxStudent.setChecked(true);
                }
                else {
                    checkBoxStudent.setChecked(false);
                }

                textViewStudent.setText("Мой номер по списку 24");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);



    }
    public void onMyButtonClick(View v)
    {
        if (checkBoxStudent.isChecked() == false){
            checkBoxStudent.setChecked(true);
        }
        else {
            checkBoxStudent.setChecked(false);
        }


        Toast.makeText(this,"Еще один способ!",Toast.LENGTH_SHORT).show();
        textViewStudent.setText("Это не я сделал");
    }
}