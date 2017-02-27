package com.ttth.recyclerview;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Thanh Hang on 27/02/17.
 */

public class MyImage implements Parcelable {
    private int image;

    public MyImage(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.image);
    }

    protected MyImage(Parcel in) {
        this.image = in.readInt();
    }

    public static final Parcelable.Creator<MyImage> CREATOR = new Parcelable.Creator<MyImage>() {
        @Override
        public MyImage createFromParcel(Parcel source) {
            return new MyImage(source);
        }

        @Override
        public MyImage[] newArray(int size) {
            return new MyImage[size];
        }
    };
}
