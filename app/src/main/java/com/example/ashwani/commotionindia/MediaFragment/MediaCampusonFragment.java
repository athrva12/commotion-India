package com.example.ashwani.commotionindia.MediaFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.Vector;


import com.example.ashwani.commotionindia.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MediaCampusonFragment extends Fragment {
    View root;
    RecyclerView recyclerView;
    Vector youtubeVideos=new Vector();




    public MediaCampusonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_media_campuson, container, false);

        recyclerView=root.findViewById(R.id.media_campuson_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //load video list
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ql33DIx17qg?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>  "));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ul3L9AV4-mM?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>  "));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qLScskhJNtw?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lXvX8zpKeB8?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
       // youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lXvX8zpKeB8\" frameborder="\0\" allow="autoplay; encrypted-media" allowfullscreen></iframe>"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"854\" height=\"480\" src=\"https://www.youtube.com/embed/lXvX8zpKeB8?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/xw1MXRLz5Iw\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8TyzYn44vGI\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Q1fll6iHvC0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/nQ4z1xspge4\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ouAnx40zZ88\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3-F-6u9Zd5Y\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/bkLqjq_V79g\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/CUYbqMI9mQw\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/MSq9UL4mAhI\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/y-2lg12eT7c\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/t1iOX5BNkEM\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));


        MediaCampusonVideoAdapter videoAdapter =new MediaCampusonVideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);
        return root;
    }

}
class MediaCampuson {

    String videoUrl;
    public MediaCampuson(){

    }


    public MediaCampuson(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}