package com.example.chinhnb.placemap.Dialog;

import android.app.Activity;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.chinhnb.placemap.Entity.Localtion;
import com.example.chinhnb.placemap.Other.CircleTransform;
import com.example.chinhnb.placemap.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by CHINHNB on 11/13/2016.
 */

public class DialogInfoWindowMap implements GoogleMap.InfoWindowAdapter {

    private static final String TAG = DialogInfoWindowMap.class.getSimpleName();

    private final View mWindow;

    private final Activity activity;

    public DialogInfoWindowMap(Activity activity) {
        this.activity=activity;
        mWindow = activity.getLayoutInflater().inflate(R.layout.custom_info_window, null);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        render(marker, mWindow);
        return mWindow;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }

    private void render(Marker marker, View view) {

        ImageView imgavatar=(ImageView) view.findViewById(R.id.imgavatar);
        imgavatar.setBackgroundResource(R.drawable.ic_noavatar);
        String avatar = marker.getSnippet();
        Log.d(TAG, "DialogInfoWindowMap: " + avatar);
        Glide.with(activity).load(avatar)
                .crossFade()
                .thumbnail(0.5f)
                //.bitmapTransform(new CircleTransform(activity))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imgavatar);

        String title = marker.getTitle();
        TextView titleUi = ((TextView) view.findViewById(R.id.title));
        if (title != null) {
            titleUi.setText(title);
        } else {
            titleUi.setText("");
        }

        LatLng latLng = marker.getPosition();
        TextView txtlatLng = ((TextView) view.findViewById(R.id.latLng));
        if (latLng != null) {
            txtlatLng.setText("Vị trí: "+latLng.latitude+" , "+latLng.longitude);
        } else {
            txtlatLng.setText("");
        }
    }
}
