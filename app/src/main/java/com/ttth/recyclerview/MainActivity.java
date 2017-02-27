package com.ttth.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String EXTRA_IMAGE = "extra_image";
    private MyAdapter mAdapter;
    private ArrayList<MyImage> arrImage;
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        data();
        if (savedInstanceState != null ){
            arrImage = savedInstanceState.getParcelableArrayList(EXTRA_IMAGE);
            displayList();
        }else {
            displayList();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList(EXTRA_IMAGE, arrImage);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getParcelableArrayList(EXTRA_IMAGE);
    }

    private void initView() {
        mRecyclerView = (RecyclerView) this.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void data(){
        arrImage = new ArrayList<>();
//        arrImage.add(new MyImage(R.drawable.ic_6));
        arrImage.add(new MyImage(R.drawable.ic_7));
        arrImage.add(new MyImage(R.drawable.ic_8));
        arrImage.add(new MyImage(R.drawable.ic_9));
        arrImage.add(new MyImage(R.drawable.ic_11));
        arrImage.add(new MyImage(R.drawable.ic_12));
        arrImage.add(new MyImage(R.drawable.ic_13));

    }
    private void displayList(){
        if (mAdapter == null){
            mAdapter = new MyAdapter(arrImage);
            mRecyclerView.setAdapter(mAdapter);
        }else {
            mRecyclerView.setAdapter(mAdapter);
        }
    }
}
