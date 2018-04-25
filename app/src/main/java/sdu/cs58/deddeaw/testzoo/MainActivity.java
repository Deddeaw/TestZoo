package sdu.cs58.deddeaw.testzoo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   }//method onCreate

    public void clickMobile(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0948577771"));
        startActivity(mobileIntent);
    }

    public void clickMap(View view) {
        String lat = "13.216298";
        String lng = "101.056642";
        String label = "สวนเปิดเขาเขียวดุสิต";

        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:" + lat + "," + lng + "(" + label + ")");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        //mapIntent.setPackage("com.google.android,apps,maps");//กำหนดว่าให้เข้า Package ที่เรากำหนด ; ถ้าใช้เทสบนจินนี่โมชั่นไมไ่ด้
        startActivity(mapIntent);
    }//end clickmap method

    public void clickHorse(View view) {
        if (mediaPlayer != null){//ตรวจสอบว่า obj. mediaPlayer เล่นอยู่หรือเปล่า
            mediaPlayer.stop();// ถ้ามีให้หยุดเล่น
            mediaPlayer.release();//คืน resource ที่ mediaplayer
            }
            mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.horse);
            mediaPlayer.start();
    }//end  clickHorse method


    public void clickElephant(View view) {
        if (mediaPlayer != null){//ตรวจสอบว่า obj. mediaPlayer เล่นอยู่หรือเปล่า
            mediaPlayer.stop();// ถ้ามีให้หยุดเล่น
            mediaPlayer.release();//คืน resource ที่ mediaplayer
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.elephant);
        mediaPlayer.start();
    }//end   clickElephant   medhot


    public void clickLion(View view) {
        if (mediaPlayer != null){//ตรวจสอบว่า obj. mediaPlayer เล่นอยู่หรือเปล่า
            mediaPlayer.stop();// ถ้ามีให้หยุดเล่น
            mediaPlayer.release();//คืน resource ที่ mediaplayer
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.lion);
        mediaPlayer.start();
    }
}//class dsad
