package com.example.course_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Excursions extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excursions);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent intent = new Intent(Excursions.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
        public void goToSo(View view){
            goToUrl("https://afisha.yandex.ru/novosibirsk/excursions/poezd-magicheskii-ekspress-nsk?source=rubric");
        }
    public void goToSo1(View view){
        goToUrl("https://afisha.yandex.ru/novosibirsk/water-trip/romanticheskii-vecher-na-obi?source=rubric");
    }
    public void goToSo2(View view){
        goToUrl("https://afisha.yandex.ru/novosibirsk/water-trip/shest-mostov?source=rubric");
    }
    public void goToSo3(View view){
        goToUrl("https://afisha.yandex.ru/novosibirsk/water-trip/gorod-54?source=rubric");
    }
    public void goToSo4(View view){
        goToUrl("https://afisha.yandex.ru/novosibirsk/water-trip/ogni-novosibirska?source=rubric");
    }
    public void goToSu(View view){
        goToUrl("https://www.google.com/maps/place/%D0%96%D0%B5%D0%BB%D0%B5%D0%B7%D0%BD%D0%BE%D0%B4%D0%BE%D1%80%D0%BE%D0%B6%D0%BD%D1%8B%D0%B9+%D0%B2%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA+-+%D0%93%D0%BB%D0%B0%D0%B2%D0%BD%D1%8B%D0%B9/@55.035705,82.89406,17z/data=!3m1!4b1!4m5!3m4!1s0x42dfe436d3e97c3f:0xf9462cd3870b1ab7!8m2!3d55.035705!4d82.896254?hl=ru");
    }
    public void goToSu1(View view){
        goToUrl("https://www.google.com/search?q=+%D1%83%D0%BB.+%D0%94%D0%BE%D0%B1%D1%80%D0%BE%D0%BB%D1%8E%D0%B1%D0%BE%D0%B2%D0%B0%2C+2%D0%91%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B0%D1%8F+%D0%BE%D0%B1%D0%BB.%2C+630009&tbm=lcl&sxsrf=ALiCzsYmis2mDVrO8-WNUZ6yksHK1FJ3sg%3A1653562636879&ei=DF2PYuinNdyOwPAPmaeIuA0&oq=+%D1%83%D0%BB.+%D0%94%D0%BE%D0%B1%D1%80%D0%BE%D0%BB%D1%8E%D0%B1%D0%BE%D0%B2%D0%B0%2C+2%D0%91%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B0%D1%8F+%D0%BE%D0%B1%D0%BB.%2C+630009&gs_l=psy-ab.3..38.15279.18012.0.18857.22.8.0.0.0.0.234.695.0j3j1.5.0....0...1c.1.64.psy-ab..19.3.761.10..35i39k1j0i512k1j0i30i22k1j35i362i39k1.351._aapJgnnwjo#rlfi=hd:;si:;mv:[[55.010606097222706,82.98022396729068],[54.99477956683625,82.92499191925602],null,[55.002693612534095,82.95260794327335],15]");
    }
    public void goToSu2(View view){
        goToUrl("https://www.google.com/search?q=+%D1%83%D0%BB.+%D0%94%D0%BE%D0%B1%D1%80%D0%BE%D0%BB%D1%8E%D0%B1%D0%BE%D0%B2%D0%B0%2C+2%D0%91%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B0%D1%8F+%D0%BE%D0%B1%D0%BB.%2C+630009&tbm=lcl&sxsrf=ALiCzsYmis2mDVrO8-WNUZ6yksHK1FJ3sg%3A1653562636879&ei=DF2PYuinNdyOwPAPmaeIuA0&oq=+%D1%83%D0%BB.+%D0%94%D0%BE%D0%B1%D1%80%D0%BE%D0%BB%D1%8E%D0%B1%D0%BE%D0%B2%D0%B0%2C+2%D0%91%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B0%D1%8F+%D0%BE%D0%B1%D0%BB.%2C+630009&gs_l=psy-ab.3..38.15279.18012.0.18857.22.8.0.0.0.0.234.695.0j3j1.5.0....0...1c.1.64.psy-ab..19.3.761.10..35i39k1j0i512k1j0i30i22k1j35i362i39k1.351._aapJgnnwjo#rlfi=hd:;si:;mv:[[55.010606097222706,82.98022396729068],[54.99477956683625,82.92499191925602],null,[55.002693612534095,82.95260794327335],15]");
    }
    public void goToSu3(View view){
        goToUrl("https://www.google.com/search?q=+%D1%83%D0%BB.+%D0%94%D0%BE%D0%B1%D1%80%D0%BE%D0%BB%D1%8E%D0%B1%D0%BE%D0%B2%D0%B0%2C+2%D0%91%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B0%D1%8F+%D0%BE%D0%B1%D0%BB.%2C+630009&tbm=lcl&sxsrf=ALiCzsYmis2mDVrO8-WNUZ6yksHK1FJ3sg%3A1653562636879&ei=DF2PYuinNdyOwPAPmaeIuA0&oq=+%D1%83%D0%BB.+%D0%94%D0%BE%D0%B1%D1%80%D0%BE%D0%BB%D1%8E%D0%B1%D0%BE%D0%B2%D0%B0%2C+2%D0%91%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B0%D1%8F+%D0%BE%D0%B1%D0%BB.%2C+630009&gs_l=psy-ab.3..38.15279.18012.0.18857.22.8.0.0.0.0.234.695.0j3j1.5.0....0...1c.1.64.psy-ab..19.3.761.10..35i39k1j0i512k1j0i30i22k1j35i362i39k1.351._aapJgnnwjo#rlfi=hd:;si:;mv:[[55.010606097222706,82.98022396729068],[54.99477956683625,82.92499191925602],null,[55.002693612534095,82.95260794327335],15]");
    }
    public void goToSu4(View view){
        goToUrl("https://www.google.com/search?q=+%D1%83%D0%BB.+%D0%94%D0%BE%D0%B1%D1%80%D0%BE%D0%BB%D1%8E%D0%B1%D0%BE%D0%B2%D0%B0%2C+2%D0%91%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B0%D1%8F+%D0%BE%D0%B1%D0%BB.%2C+630009&tbm=lcl&sxsrf=ALiCzsYmis2mDVrO8-WNUZ6yksHK1FJ3sg%3A1653562636879&ei=DF2PYuinNdyOwPAPmaeIuA0&oq=+%D1%83%D0%BB.+%D0%94%D0%BE%D0%B1%D1%80%D0%BE%D0%BB%D1%8E%D0%B1%D0%BE%D0%B2%D0%B0%2C+2%D0%91%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%2C+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B0%D1%8F+%D0%BE%D0%B1%D0%BB.%2C+630009&gs_l=psy-ab.3..38.15279.18012.0.18857.22.8.0.0.0.0.234.695.0j3j1.5.0....0...1c.1.64.psy-ab..19.3.761.10..35i39k1j0i512k1j0i30i22k1j35i362i39k1.351._aapJgnnwjo#rlfi=hd:;si:;mv:[[55.010606097222706,82.98022396729068],[54.99477956683625,82.92499191925602],null,[55.002693612534095,82.95260794327335],15]");
    }
    private void goToUrl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW,uriUrl);
        startActivity(launchBrowser);
    }
}