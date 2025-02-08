// Generated by view binder compiler. Do not edit!
package com.example.foodorderapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.foodorderapp.R;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ChipNavigationBar bottomMenu;

  @NonNull
  public final RecyclerView categoryView;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ProgressBar progressBarBanner;

  @NonNull
  public final ProgressBar progressBarCategory;

  @NonNull
  public final ScrollView scrollView3;

  @NonNull
  public final EditText search;

  @NonNull
  public final ConstraintLayout slider;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final ViewPager2 viewpager2;

  @NonNull
  public final TextView web;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull ChipNavigationBar bottomMenu, @NonNull RecyclerView categoryView,
      @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ConstraintLayout main,
      @NonNull ProgressBar progressBarBanner, @NonNull ProgressBar progressBarCategory,
      @NonNull ScrollView scrollView3, @NonNull EditText search, @NonNull ConstraintLayout slider,
      @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ViewPager2 viewpager2,
      @NonNull TextView web) {
    this.rootView = rootView;
    this.bottomMenu = bottomMenu;
    this.categoryView = categoryView;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.main = main;
    this.progressBarBanner = progressBarBanner;
    this.progressBarCategory = progressBarCategory;
    this.scrollView3 = scrollView3;
    this.search = search;
    this.slider = slider;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.viewpager2 = viewpager2;
    this.web = web;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomMenu;
      ChipNavigationBar bottomMenu = ViewBindings.findChildViewById(rootView, id);
      if (bottomMenu == null) {
        break missingId;
      }

      id = R.id.categoryView;
      RecyclerView categoryView = ViewBindings.findChildViewById(rootView, id);
      if (categoryView == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.progressBarBanner;
      ProgressBar progressBarBanner = ViewBindings.findChildViewById(rootView, id);
      if (progressBarBanner == null) {
        break missingId;
      }

      id = R.id.progressBarCategory;
      ProgressBar progressBarCategory = ViewBindings.findChildViewById(rootView, id);
      if (progressBarCategory == null) {
        break missingId;
      }

      id = R.id.scrollView3;
      ScrollView scrollView3 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView3 == null) {
        break missingId;
      }

      id = R.id.search;
      EditText search = ViewBindings.findChildViewById(rootView, id);
      if (search == null) {
        break missingId;
      }

      id = R.id.slider;
      ConstraintLayout slider = ViewBindings.findChildViewById(rootView, id);
      if (slider == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.viewpager2;
      ViewPager2 viewpager2 = ViewBindings.findChildViewById(rootView, id);
      if (viewpager2 == null) {
        break missingId;
      }

      id = R.id.web;
      TextView web = ViewBindings.findChildViewById(rootView, id);
      if (web == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, bottomMenu, categoryView,
          imageView5, imageView6, main, progressBarBanner, progressBarCategory, scrollView3, search,
          slider, textView2, textView3, viewpager2, web);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
