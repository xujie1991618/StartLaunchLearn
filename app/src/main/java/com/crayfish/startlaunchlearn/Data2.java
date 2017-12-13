package com.crayfish.startlaunchlearn;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * ============================
 * 作    者：crayfish(徐杰)
 * 创建日期：2017/12/12.
 * 描    述：
 * 修改历史：
 * ===========================
 */

public class Data2 implements Parcelable {
    protected Data2(Parcel in) {
    }

    public static final Creator<Data2> CREATOR = new Creator<Data2>() {
        @Override
        public Data2 createFromParcel(Parcel in) {
            return new Data2(in);
        }

        @Override
        public Data2[] newArray(int size) {
            return new Data2[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

}
