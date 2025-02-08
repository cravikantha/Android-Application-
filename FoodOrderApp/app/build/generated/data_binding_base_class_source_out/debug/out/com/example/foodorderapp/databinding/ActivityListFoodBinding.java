// Generated by view binder compiler. Do not edit!
package com.example.foodorderapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.example.foodorderapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityListFoodBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView TitleTxt;

  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final RecyclerView foodListView;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ScrollView scrollView4;

  private ActivityListFoodBinding(@NonNull ConstraintLayout rootView, @NonNull TextView TitleTxt,
      @NonNull ImageView backBtn, @NonNull RecyclerView foodListView,
      @NonNull ConstraintLayout main, @NonNull ProgressBar progressBar,
      @NonNull ScrollView scrollView4) {
    this.rootView = rootView;
    this.TitleTxt = TitleTxt;
    this.backBtn = backBtn;
    this.foodListView = foodListView;
    this.main = main;
    this.progressBar = progressBar;
    this.scrollView4 = scrollView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityListFoodBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityListFoodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_list_food, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityListFoodBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.TitleTxt;
      TextView TitleTxt = ViewBindings.findChildViewById(rootView, id);
      if (TitleTxt == null) {
        break missingId;
      }

      id = R.id.backBtn;
      ImageView backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.foodListView;
      RecyclerView foodListView = ViewBindings.findChildViewById(rootView, id);
      if (foodListView == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.scrollView4;
      ScrollView scrollView4 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView4 == null) {
        break missingId;
      }

      return new ActivityListFoodBinding((ConstraintLayout) rootView, TitleTxt, backBtn,
          foodListView, main, progressBar, scrollView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
