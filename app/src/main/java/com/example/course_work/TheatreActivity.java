package com.example.course_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TheatreActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theatre);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button3:
                Intent intent = new Intent(TheatreActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
    public void goToSo10(View view){
        goToUrl("https://www.afisha.ru/performance/94940/");
    }
    public void goToSo11(View view){
        goToUrl("https://www.afisha.ru/performance/94964/");
    }
    public void goToSo12(View view){
        goToUrl("https://www.afisha.ru/performance/115845/");
    }
    public void goToSo13(View view){
        goToUrl("https://www.afisha.ru/performance/69745/");
    }
    public void goToSo14(View view){
        goToUrl("https://www.afisha.ru/performance/86337/");
    }
    public void goToSu10(View view){
        goToUrl("https://www.google.com/search?tbs=lf:1,lf_ui:8&tbm=lcl&sxsrf=ALiCzsbfuGTB2uXx0YHqtCfOq8PZIxNEjg:1653493348170&q=%D0%B6%D0%B5%D0%BB%D0%B5%D0%B7%D0%BD%D0%BE%D0%B4%D0%BE%D1%80%D0%BE%D0%B6%D0%BD%D1%8B%D0%B9+%D0%B2%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB+%D0%BD%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA&rflfq=1&num=10&ved=2ahUKEwiL0J_d_vr3AhW-AxAIHebiBqEQtgN6BAgGEAY");
    }
    public void goToSu11(View view){
        goToUrl("https://yandex.ru/maps/65/novosibirsk/?from=api-maps&ll=82.941177%2C55.002600&mode=routes&origin=jsapi_2_1_79&rtext=~55.002600%2C82.941177&rtt=auto&ruri=~&z=14");
    }
    public void goToSu12(View view){
        goToUrl("https://yandex.ru/maps/65/novosibirsk/?from=api-maps&ll=82.941177%2C55.002600&mode=routes&origin=jsapi_2_1_79&rtext=~55.002600%2C82.941177&rtt=auto&ruri=~&z=14");
    }
    public void goToSu13(View view){
        goToUrl("https://yandex.ru/maps/65/novosibirsk/?from=api-maps&ll=82.941177%2C55.002600&mode=routes&origin=jsapi_2_1_79&rtext=~55.002600%2C82.941177&rtt=auto&ruri=~&z=14");
    }
    public void goToSu14(View view){
        goToUrl("https://yandex.ru/maps/65/novosibirsk/?from=api-maps&ll=82.941177%2C55.002600&mode=routes&origin=jsapi_2_1_79&rtext=~55.002600%2C82.941177&rtt=auto&ruri=~&z=14");
    }
    private void goToUrl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW,uriUrl);
        startActivity(launchBrowser);
    }

}