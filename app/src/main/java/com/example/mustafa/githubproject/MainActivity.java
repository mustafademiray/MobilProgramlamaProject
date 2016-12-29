package com.example.mustafa.githubproject;
//https://github.com/Azaezell
//https://github.com/mustafademiray/MobilProgramlamaProject
//https://github.com/yagizoztekin

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.moshi.Moshi;

import org.json.JSONObject;

import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<ImageView> images = new ArrayList<>();

    private String ENDPOINT = "http://10.0.2.2/get.php?Ulke=";
    private static final Moshi MOSHI = new Moshi.Builder().build();
    private Response response;
    private JSONObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images.add((ImageView) findViewById(R.id.argentina));

        images.get(0).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        OkHttpClient client = new OkHttpClient();

        ENDPOINT = ENDPOINT + "deneme";

        // Create request for remote resource.
        Request request = new Request.Builder().url(ENDPOINT).build();

        // Get the results
        try {
            response = client.newCall(request).execute();
            jsonObject = new JSONObject(response.body().string()); // payload is your JSON
            String nufus = jsonObject.get("nufus").toString();

            Toast.makeText(this, nufus, Toast.LENGTH_LONG);
            /*
            JSONArray my_news = jsonObject.getJSONArray("TopNews");

            ArrayList<String> my_ids = new ArrayList<String>();

            for (int i = 0; i < my_news.length(); i++) {
                JSONObject my_object = my_news.getJSONObject(0);
                int id = Integer.parseInt(my_object.getString("nufus"));
                my_ids.push(id);
            }*/
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
