// Generated by view binder compiler. Do not edit!
package com.example.foodorderapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.foodorderapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView PriceTxt;

  @NonNull
  public final TextView RatingTxt;

  @NonNull
  public final TextView TimeTxt;

  @NonNull
  public final TextView TitleTxt;

  @NonNull
  public final AppCompatButton addBtn;

  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final TextView descriptionTxt;

  @NonNull
  public final ImageView faveBtn;

  @NonNull
  public final ImageView imageView11;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView minusBtn;

  @NonNull
  public final TextView numTxt;

  @NonNull
  public final ImageView pic;

  @NonNull
  public final TextView plusBtn;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView totalTxt;

  @NonNull
  public final View view2;

  private ActivityDetailBinding(@NonNull ConstraintLayout rootView, @NonNull TextView PriceTxt,
      @NonNull TextView RatingTxt, @NonNull TextView TimeTxt, @NonNull TextView TitleTxt,
      @NonNull AppCompatButton addBtn, @NonNull ImageView backBtn, @NonNull TextView descriptionTxt,
      @NonNull ImageView faveBtn, @NonNull ImageView imageView11,
      @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout main,
      @NonNull TextView minusBtn, @NonNull TextView numTxt, @NonNull ImageView pic,
      @NonNull TextView plusBtn, @NonNull RatingBar ratingBar, @NonNull ScrollView scrollView2,
      @NonNull TextView textView, @NonNull TextView textView14, @NonNull TextView textView8,
      @NonNull TextView totalTxt, @NonNull View view2) {
    this.rootView = rootView;
    this.PriceTxt = PriceTxt;
    this.RatingTxt = RatingTxt;
    this.TimeTxt = TimeTxt;
    this.TitleTxt = TitleTxt;
    this.addBtn = addBtn;
    this.backBtn = backBtn;
    this.descriptionTxt = descriptionTxt;
    this.faveBtn = faveBtn;
    this.imageView11 = imageView11;
    this.linearLayout = linearLayout;
    this.main = main;
    this.minusBtn = minusBtn;
    this.numTxt = numTxt;
    this.pic = pic;
    this.plusBtn = plusBtn;
    this.ratingBar = ratingBar;
    this.scrollView2 = scrollView2;
    this.textView = textView;
    this.textView14 = textView14;
    this.textView8 = textView8;
    this.totalTxt = totalTxt;
    this.view2 = view2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.PriceTxt;
      TextView PriceTxt = ViewBindings.findChildViewById(rootView, id);
      if (PriceTxt == null) {
        break missingId;
      }

      id = R.id.RatingTxt;
      TextView RatingTxt = ViewBindings.findChildViewById(rootView, id);
      if (RatingTxt == null) {
        break missingId;
      }

      id = R.id.TimeTxt;
      TextView TimeTxt = ViewBindings.findChildViewById(rootView, id);
      if (TimeTxt == null) {
        break missingId;
      }

      id = R.id.TitleTxt;
      TextView TitleTxt = ViewBindings.findChildViewById(rootView, id);
      if (TitleTxt == null) {
        break missingId;
      }

      id = R.id.addBtn;
      AppCompatButton addBtn = ViewBindings.findChildViewById(rootView, id);
      if (addBtn == null) {
        break missingId;
      }

      id = R.id.backBtn;
      ImageView backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.descriptionTxt;
      TextView descriptionTxt = ViewBindings.findChildViewById(rootView, id);
      if (descriptionTxt == null) {
        break missingId;
      }

      id = R.id.faveBtn;
      ImageView faveBtn = ViewBindings.findChildViewById(rootView, id);
      if (faveBtn == null) {
        break missingId;
      }

      id = R.id.imageView11;
      ImageView imageView11 = ViewBindings.findChildViewById(rootView, id);
      if (imageView11 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.minusBtn;
      TextView minusBtn = ViewBindings.findChildViewById(rootView, id);
      if (minusBtn == null) {
        break missingId;
      }

      id = R.id.numTxt;
      TextView numTxt = ViewBindings.findChildViewById(rootView, id);
      if (numTxt == null) {
        break missingId;
      }

      id = R.id.pic;
      ImageView pic = ViewBindings.findChildViewById(rootView, id);
      if (pic == null) {
        break missingId;
      }

      id = R.id.plusBtn;
      TextView plusBtn = ViewBindings.findChildViewById(rootView, id);
      if (plusBtn == null) {
        break missingId;
      }

      id = R.id.ratingBar;
      RatingBar ratingBar = ViewBindings.findChildViewById(rootView, id);
      if (ratingBar == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.totalTxt;
      TextView totalTxt = ViewBindings.findChildViewById(rootView, id);
      if (totalTxt == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      return new ActivityDetailBinding((ConstraintLayout) rootView, PriceTxt, RatingTxt, TimeTxt,
          TitleTxt, addBtn, backBtn, descriptionTxt, faveBtn, imageView11, linearLayout, main,
          minusBtn, numTxt, pic, plusBtn, ratingBar, scrollView2, textView, textView14, textView8,
          totalTxt, view2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
