package com.example.course_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Exhibitions extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibitions);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button2:
                Intent intent = new Intent(Exhibitions.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
    public void goToSo5(View view){
        goToUrl("https://afisha.yandex.ru/novosibirsk/cinema/salvador-dali-v-poiskakh-bessmertiia?source=selection-events&schedule-date=2022-06-28");
    }
    public void goToSo6(View view){
        goToUrl("https://afisha.yandex.ru/novosibirsk/cinema/moi-rembrandt?source=selection-events&schedule-date=2022-06-21");
    }
    public void goToSo7(View view){
        goToUrl("https://afisha.yandex.ru/novosibirsk/cinema/palladio-vlast-arkhitektury?source=selection-events&schedule-date=2022-05-24");
    }
    public void goToSo8(View view){
        goToUrl("https://afisha.yandex.ru/novosibirsk/art/narodnye-promysly-rossii-khokhloma-zhostovo-gzhel-palekh-filimonovskaia-bogorodskaia-dymkovskaia-igrushka?source=selection-events");
    }
    public void goToSo9(View view){
        goToUrl("https://afisha.yandex.ru/novosibirsk/art/russkoe-iskusstvo-xvi-xx-vekov?source=selection-events");
    }
    public void goToSu5(View view){
        goToUrl("https://www.google.com/maps/place/%D0%9F%D0%BE%D0%B1%D0%B5%D0%B4%D0%B0/@55.0291619,82.9147996,15z/data=!4m2!3m1!1s0x0:0x110982194b39dc26?sa=X&ved=2ahUKEwikys2Ngfv3AhVjoosKHW8iBHkQ_BJ6BAheEAU");
    }
    public void goToSu6(View view){
        goToUrl("https://www.google.com/maps/place/%D0%9F%D0%BE%D0%B1%D0%B5%D0%B4%D0%B0/@55.0291619,82.9147996,15z/data=!4m2!3m1!1s0x0:0x110982194b39dc26?sa=X&ved=2ahUKEwikys2Ngfv3AhVjoosKHW8iBHkQ_BJ6BAheEAU");
    }
    public void goToSu7(View view){
        goToUrl("https://www.google.com/maps/place/%D0%9F%D0%BE%D0%B1%D0%B5%D0%B4%D0%B0/@55.0291619,82.9147996,15z/data=!4m2!3m1!1s0x0:0x110982194b39dc26?sa=X&ved=2ahUKEwikys2Ngfv3AhVjoosKHW8iBHkQ_BJ6BAheEAU");
    }
    public void goToSu8(View view){
        goToUrl("https://www.google.com/maps/place/%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B8%D0%B9+%D0%B3%D0%BE%D1%81%D1%83%D0%B4%D0%B0%D1%80%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9+%D1%85%D1%83%D0%B4%D0%BE%D0%B6%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9+%D0%BC%D1%83%D0%B7%D0%B5%D0%B9/@55.0217857,82.9211681,15z/data=!4m2!3m1!1s0x0:0xc2a5405b2e34ed90?sa=X&ved=2ahUKEwjeqoGpgfv3AhXhtYsKHe2HAxoQ_BJ6BAhYEAU");
    }
    public void goToSu9(View view){
        goToUrl("https://www.google.com/maps/place/%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B8%D0%B9+%D0%B3%D0%BE%D1%81%D1%83%D0%B4%D0%B0%D1%80%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9+%D1%85%D1%83%D0%B4%D0%BE%D0%B6%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9+%D0%BC%D1%83%D0%B7%D0%B5%D0%B9/@55.0217857,82.9211681,15z/data=!4m2!3m1!1s0x0:0xc2a5405b2e34ed90?sa=X&ved=2ahUKEwjeqoGpgfv3AhXhtYsKHe2HAxoQ_BJ6BAhYEAU");
    }
    private void goToUrl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW,uriUrl);
        startActivity(launchBrowser);
    }
}
