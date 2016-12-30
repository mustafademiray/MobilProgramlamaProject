package com.example.mustafa.githubproject;
//https://github.com/Azaezell
//https://github.com/mustafademiray/MobilProgramlamaProject
//https://github.com/yagizoztekin

        import android.os.AsyncTask;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

        import android.widget.ImageView;
        import android.widget.TextView;




        import org.jsoup.Jsoup;
        import org.jsoup.nodes.Document;
        import org.jsoup.select.Elements;



        import java.io.IOException;
        import java.util.ArrayList;


public class MainActivity extends AppCompatActivity  {

    ArrayList<ImageView> images = new ArrayList<>();
    int veridegeri=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images.add((ImageView) findViewById(R.id.argentina));
        images.add((ImageView) findViewById(R.id.france));
        images.add((ImageView) findViewById(R.id.italy));
        images.add((ImageView) findViewById(R.id.england));
        images.add((ImageView) findViewById(R.id.chile));
        images.add((ImageView) findViewById(R.id.brazil));
        images.add((ImageView) findViewById(R.id.australia));
        images.add((ImageView) findViewById(R.id.costarica));
        images.add((ImageView) findViewById(R.id.germany));
        images.add((ImageView) findViewById(R.id.ghana));
        images.add((ImageView) findViewById(R.id.greece));
        images.add((ImageView) findViewById(R.id.netherland));
        images.add((ImageView) findViewById(R.id.spain));
        images.add((ImageView) findViewById(R.id.switzerland));
        images.add((ImageView) findViewById(R.id.turkey));
        images.add((ImageView) findViewById(R.id.usa));
        images.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=169;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        images.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=117;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        images.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=129;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        images.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=124;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        images.get(4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=329;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        images.get(5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=33;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        images.get(6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=297;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        images.get(7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=572;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        images.get(8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=85;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        images.get(9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=265;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        images.get(10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=403;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        images.get(11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=324;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        images.get(12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=164;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        images.get(13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=513;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        images.get(14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=95;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        images.get(15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    setupVariable();
                    veridegeri=23;

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }


    private void setupVariable(){
        new doit().execute();
    }

    public class doit extends AsyncTask<Void,Void,Void> {
        String veri;
        String [] veri2;


        @Override
        protected Void doInBackground(Void... params) {
            try {
                Document doc = Jsoup.connect("http://www.skyturks.com/ulke_nufuslari1.asp").get();
                Elements elements = doc.getElementsByClass("sut");
                System.out.println(elements.toString());

                if (elements.size()!=0){
                    veri=elements.text();
                    veri2=veri.split(" ");

                }
                else{

                    veri="hata";



                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            int t=0;


            ((TextView)findViewById(R.id.textView)).setText(veri2[veridegeri]);

            //169 Argentina
        }
    }
}
