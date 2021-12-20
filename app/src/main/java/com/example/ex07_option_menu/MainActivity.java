package com.example.ex07_option_menu;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button button1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기");

        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.button1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //메뉴를 화면에 출력하는 2가지 방식
        //1.xml을 사용해서 (인플레이터 방식) - 추천
        //2.java 코드만을 이용해서(java only방식) - 비추천

        //1.xml을 사용해서 (인플레이터 방식) - 추천
//        Inflater inflater1 = new Inflater(this);
//        MenuInflater mInflater = getMenuInflater();
//        mInflater.inflate(R.menu.menu1,menu);

        //2.java 코드만을 이용해서(java only방식) - 비추천
        menu.add(0,1,0,"빨강");
        menu.add(0,2,0,"그린");
        menu.add(0,3,0,"파랑");

        SubMenu sMenu = menu.addSubMenu("버튼변경>>");
        sMenu.add(0,4,0,"회전45");
        sMenu.add(0,5,0,"확대2배");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
//            case R.id.itemRed:
            case 1:
                baseLayout.setBackgroundColor(Color.RED);
                return false;
//            case R.id.itemGreen:
            case 2:
                baseLayout.setBackgroundColor(Color.GREEN);
                return false;
//            case R.id.itemBlue:
            case 3:
                baseLayout.setBackgroundColor(Color.BLUE);
                return false;
//            case R.id.subRotate:
            case 4:
                button1.setRotation(45);
                return false;
//            case R.id.subSize:
            case 5:
                button1.setScaleX(2);
                return false;
        }


        return super.onOptionsItemSelected(item);
    }
}
