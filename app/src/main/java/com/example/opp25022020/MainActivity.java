package com.example.opp25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnListenerClick{

    OnListenerClick onListenerClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tính kế thừa
        //Khi kế thừa thì thằng cha có thể khởi tạo thằng con, ngược lại thì không
        // Person person = new User(); True
        // User person = new Person(); False
        //Khi kế thừa thì thằng con không thể khởi tạo thằng cha, ngược lại thì có, và lớp cha sẽ chia sẽ cho lớp con vè các phương thức và thuộc tính mà thằng cha có
//        User user = new User();
//        user.showName();

        //Phương thức ghi đè
//        Person person = new Person();
//        person.name = "Human 1";
//        person.showName();
//
//        User user = new User();
//        user.name = "Cline 1";
//        user.showName();


        //+ Tên phương thức giống nhau chỉ khác nhau thân hàm
        //+ Phương thức nằm ở 2 nơi
        //Phương thức nạp chồng

        //Tính đóng gói

        //Tính trừu tượng
        //Tính đa hình
        //Quan hệ has A

        onListenerClick = this;

        Button button =new Button(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onListenerClick.OnClick();

            }
        });
        button.performClick();
    }

    @Override
    public void OnClick() {
        Log.d("BBB","Đã Click");

    }
}
