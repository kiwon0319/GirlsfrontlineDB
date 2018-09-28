package per.guideung.databasetest;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import static android.provider.ContactsContract.Directory.PACKAGE_NAME;

public class Splashpage extends AppCompatActivity {

    public static Activity SplashActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SplashActivity = Splashpage.this;
        setContentView(R.layout.activity_splashpage);

        Intent intent = new Intent(Splashpage.this,ScrollingActivity.class);
        startActivity(intent);
    }


}
