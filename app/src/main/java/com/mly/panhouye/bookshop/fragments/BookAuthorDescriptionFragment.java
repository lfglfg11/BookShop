package com.mly.panhouye.bookshop.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.mly.panhouye.bookshop.R;

/**
 * Created by panchengjia on 2017/1/15 0015.
 */

public class BookAuthorDescriptionFragment extends Fragment {
    private WebView webView_content_description;

    public static BookAuthorDescriptionFragment newInstance(String web_content){
        BookAuthorDescriptionFragment bookAuthorDescriptionFragment = new BookAuthorDescriptionFragment();
        Bundle arguments = new Bundle();
        arguments.putString("content",web_content);
        bookAuthorDescriptionFragment.setArguments(arguments);
        return bookAuthorDescriptionFragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book_content_description, null);
        webView_content_description = (WebView) view.findViewById(R.id.webView_content_description);
        String html = getArguments().getString("content");
        webView_content_description.loadDataWithBaseURL("",html,"text/html","utf8",null);

        return view;
    }
}
