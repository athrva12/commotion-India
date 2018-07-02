package com.example.ashwani.commotionindia.EducationFragment;


import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;


import com.example.ashwani.commotionindia.R;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

/**
 * A simple {@link Fragment} subclass.
 */
public class EducationWorkshopFragment extends Fragment {
    Button button1;
    private PopupWindow mPopupWindow;
    private Context mContext;
    View root;
    private Activity mActivity;


    public EducationWorkshopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_education_workshop, container, false);
        button1=root.findViewById(R.id.the_internet_book_us);
       // mContext = mContext.getApplicationContext();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = inflater.inflate(R.layout.popup_contactus_form, null);
                //ImageView imageView = (ImageView) popupView.findViewById(R.id.popupimage);
                //imageView.setImageResource(R.drawable.newyear1);
                mPopupWindow = new PopupWindow(
                        popupView,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                if (Build.VERSION.SDK_INT >= 21) {
                    mPopupWindow.setElevation(5.0f);
                }
                mPopupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);
            }
        });

        return root;

    }

}
