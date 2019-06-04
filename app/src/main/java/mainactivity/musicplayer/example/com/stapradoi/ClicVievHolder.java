package mainactivity.musicplayer.example.com.stapradoi;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ClicVievHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener{

    private ItemClickListener clickListener;
    private ImageView imageView, imageView4;
    public TextView textView;

    private ImageView b_Play;


    public ClicVievHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView = itemView.findViewById(R.id.imageView3);
        this.imageView4 = itemView.findViewById(R.id.iView4);
        this.textView = itemView.findViewById(R.id.textView3);

        this.b_Play = imageView.findViewById(R.id.iView4);


        itemView.setTag(itemView);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }
    public void setImageViewPlai(int imageViewPlai){
        b_Play.setImageResource(imageViewPlai);

    }


    public void setTatel(String tatel){
        textView.setText(tatel);
    }
    public void setImage(int imageId){
        imageView.setImageResource(imageId);

    }

    public void setImageView4(int imageViewId) {
        imageView4.setImageResource(imageViewId);
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        clickListener.onClick(v, getPosition(), false);
    }

    @Override
    public boolean onLongClick(View v) {
        clickListener.onClick(v, getPosition(), true);
        return true;
    }
}
