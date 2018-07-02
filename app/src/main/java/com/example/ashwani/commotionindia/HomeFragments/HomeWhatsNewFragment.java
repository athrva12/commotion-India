package com.example.ashwani.commotionindia.HomeFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ashwani.commotionindia.MediaFragment.MediaDocumentationCard;
import com.example.ashwani.commotionindia.MediaFragment.MediaDocumentationVideoAdapter;
import com.example.ashwani.commotionindia.R;

import java.util.Vector;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeWhatsNewFragment extends Fragment {

    View root;
    RecyclerView recyclerView;
    Vector youtubeVideos=new Vector();

    public HomeWhatsNewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_home_whats_new, container, false);
        recyclerView=root.findViewById(R.id.home_whatsnew_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        youtubeVideos.add(new whatsnewvideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Y9ZBRulooEo?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        //youtubeVideos.add(new whatsnewvideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/j0JmGc0Wdj0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        //youtubeVideos.add(new whatsnewvideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/HOlinfcZvbo\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        //youtubeVideos.add(new MediaDocumentationCard(""));
        // youtubeVideos.add(new MediaDocumentationCard(""));
        // youtubeVideos.add(new MediaDocumentationCard("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ul3L9AV4-mM?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>  "));
        //youtubeVideos.add(new MediaDocumentationCard("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qLScskhJNtw?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        //youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lXvX8zpKeB8?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        //youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lXvX8zpKeB8?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        HomeWhatsnewVideoAdapter videoAdapter =new HomeWhatsnewVideoAdapter(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);
        return root;
    }

}
class whatsnewvideo{
    public whatsnewvideo() {
    }
    String videoUrl;



    public whatsnewvideo(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
