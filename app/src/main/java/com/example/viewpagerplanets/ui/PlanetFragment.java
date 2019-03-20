package com.example.viewpagerplanets.ui;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.viewpagerplanets.R;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlanetFragment extends Fragment {

    private static final String NAME_KEY = "name";
    private static final String NUMBER_KEY = "number";
    private static final String IMAGE_KEY  = "image";

    private String name;
    private String number;
    private String image;


   private TextView planetText;
   private ImageView planetImageview;



    public PlanetFragment() {
        // Required empty public constructor
    }

    public static PlanetFragment getInstance(String name, String number, String image){
        Bundle bundle = new Bundle();
        bundle.putString(NAME_KEY,name);
        bundle.putString(IMAGE_KEY,image);
        bundle.putString(NUMBER_KEY,number);
        PlanetFragment planetFragment = new PlanetFragment();
        planetFragment.setArguments(bundle);
        return planetFragment;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_planet, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstance){
        super.onViewCreated(view, savedInstance);

        planetText = view.findViewById(R.id.viewpager_textView);
        planetImageview = view.findViewById(R.id.viewpager_imageview);

        planetText.setText(name);
        Picasso.get().load(image).into(planetImageview);

    }

    @Override
    public void onCreate (@Nullable Bundle savedInstance){
        super.onCreate(savedInstance);

    }

}
