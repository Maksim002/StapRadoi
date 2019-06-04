package mainactivity.musicplayer.example.com.stapradoi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private Aaptar mAdapter;
    private String[] mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView1 = findViewById(R.id.recyclerView);


        mList = getResources().getStringArray(R.array.numbers);


        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView1.setLayoutManager(linearLayoutManager1);

        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        recyclerView1.setLayoutManager(linearLayoutManager1);

        mAdapter = new Aaptar(getApplicationContext(), mList);

        recyclerView1.setAdapter(mAdapter);

    }
}
