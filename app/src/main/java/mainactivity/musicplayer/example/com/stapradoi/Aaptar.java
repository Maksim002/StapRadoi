package mainactivity.musicplayer.example.com.stapradoi;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.IOException;

public class Aaptar extends RecyclerView.Adapter<ClicVievHolder> {

    private Context mContext;
    private String[] mList;

    boolean started = false;


    public Aaptar(Context contexts, String[] list) {
        this.mContext = contexts;
        this.mList = list;
    }

    @NonNull
    @Override
    public ClicVievHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.item_stil, viewGroup, false);
        return new ClicVievHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ClicVievHolder clicVievHolder, int position) {
        clicVievHolder.textView.setText(mList[position]);
        clicVievHolder.setClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                switch (position) {
                    case 0:
                        started = true;
                        Start();
                        clicVievHolder.setTatel("Play");
                        clicVievHolder.setImageView4(R.drawable.play);
                        break;
                    case 1:
                        if (started){
                            started = true;
                            clicVievHolder.setTatel("Play");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }else {
                            started = false;
                            clicVievHolder.setTatel("Stop");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }
                        break;
                    case 2:
                        if (started){
                            started = true;
                            clicVievHolder.setTatel("Play");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }else {
                            started = false;
                            clicVievHolder.setTatel("Stop");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }
                        break;
                    case 3:
                        if (started){
                            started = true;
                            clicVievHolder.setTatel("Play");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }else {
                            started = false;
                            clicVievHolder.setTatel("Stop");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }
                        break;
                    case 4:
                        if (started){
                            started = true;
                            clicVievHolder.setTatel("Play");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }else {
                            started = false;
                            clicVievHolder.setTatel("Stop");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }
                        break;
                    case 5:
                        if (started){
                            started = true;
                            clicVievHolder.setTatel("Play");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }else {
                            started = false;
                            clicVievHolder.setTatel("Stop");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }
                        break;
                    case 6:
                        if (started){
                            started = true;
                            clicVievHolder.setTatel("Play");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }else {
                            started = false;
                            clicVievHolder.setTatel("Stop");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }
                        break;
                    case 7:
                        if (started){
                            started = true;
                            clicVievHolder.setTatel("Play");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }else {
                            started = false;
                            clicVievHolder.setTatel("Stop");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }
                        break;
                    case 8:
                        if (started){
                            started = true;
                            clicVievHolder.setTatel("Play");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }else {
                            started = false;
                            clicVievHolder.setTatel("Stop");
                            clicVievHolder.setImageView4(R.drawable.play);
                        }
                        break;
                }
            }
        });


        switch (position) {
            case 0:
                clicVievHolder.setImage(R.drawable.sp1);
                clicVievHolder.setImageView4(R.drawable.paus);
                clicVievHolder.setTatel("Microsoft");
                break;
            case 1:
                clicVievHolder.setImage(R.drawable.sp2);
                clicVievHolder.setImageView4(R.drawable.paus);
                clicVievHolder.setTatel("Point");
                break;
            case 2:
                clicVievHolder.setImage(R.drawable.sp3);
                clicVievHolder.setImageView4(R.drawable.paus);
                clicVievHolder.setTatel("Drave");
                break;
            case 3:
                clicVievHolder.setImage(R.drawable.sp4);
                clicVievHolder.setImageView4(R.drawable.paus);
                clicVievHolder.setTatel("Cortana");
                break;
            case 4:
                clicVievHolder.setImage(R.drawable.sp5);
                clicVievHolder.setImageView4(R.drawable.paus);
                clicVievHolder.setTatel("Excel");
                break;
            case 5:
                clicVievHolder.setImage(R.drawable.sp6);
                clicVievHolder.setImageView4(R.drawable.paus);
                clicVievHolder.setTatel("Name");
                break;
            case 6:
                clicVievHolder.setImage(R.drawable.sp7);
                clicVievHolder.setImageView4(R.drawable.paus);
                clicVievHolder.setTatel("Macrisift");
                break;
            case 7:
                clicVievHolder.setImage(R.drawable.sp8);
                clicVievHolder.setImageView4(R.drawable.paus);
                clicVievHolder.setTatel("Info");
                break;
            case 8:
                clicVievHolder.setImage(R.drawable.sp9);
                clicVievHolder.setImageView4(R.drawable.paus);
                clicVievHolder.setTatel("Xbox");
                break;
            default:
        }

    }

    @Override
    public int getItemCount() {
        return mList.length;

    }

    public void Start() {


        MediaPlayer mediaPlayer = new MediaPlayer();

        try {
            mediaPlayer.setDataSource("http://air.radiorecord.ru:8102/dc_320");
            mediaPlayer.prepareAsync();

            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Stop() {
        final MediaPlayer mediaPlayer = new MediaPlayer();
        try {

            mediaPlayer.setDataSource("http://air.radiorecord.ru:8102/dc_320");
            mediaPlayer.prepareAsync();

            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    Stop();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





