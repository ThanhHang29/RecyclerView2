package com.ttth.recyclerview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Thanh Hang on 27/02/17.
 */

public class ItemImageView extends LinearLayout {
    private ImageView imgLeft, imgRight;
    public ItemImageView(Context context) {
        super(context);
        init(context, null);
    }

    public ItemImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ItemImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        inflate(context, R.layout.item_image_view, this);
//        int padding = getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin_hafl);
//        int p = padding/2;
//        setPadding(p, p /2, p, p/2);
        imgLeft = (ImageView) findViewById(R.id.img_left);
        imgRight = (ImageView) findViewById(R.id.img_right);
    }
    public void display(MyImage image){
        if (image == null ) return;
        imgLeft.setImageResource(image.getImage());
        imgRight.setImageResource(image.getImage());
        //xu lys tiep anh ow day, load, bitmap....
    }
}