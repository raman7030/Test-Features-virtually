package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p067l.C1278;
import p067l.C1326;
import p067l.ViewOnClickListenerC1309;

/* JADX INFO: loaded from: classes.dex */
public class ToolbarUtils {
    public static final Comparator VIEW_TOP_COMPARATOR = new Comparator() { // from class: com.google.android.material.internal.ToolbarUtils.1
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    };

    public static TextView getTitleTextView(C1326 c1326) {
        List textViewsWithText = getTextViewsWithText(c1326, c1326.getTitle());
        if (textViewsWithText.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(textViewsWithText, VIEW_TOP_COMPARATOR);
    }

    public static TextView getSubtitleTextView(C1326 c1326) {
        List textViewsWithText = getTextViewsWithText(c1326, c1326.getSubtitle());
        if (textViewsWithText.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(textViewsWithText, VIEW_TOP_COMPARATOR);
    }

    public static List getTextViewsWithText(C1326 c1326, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c1326.getChildCount(); i++) {
            View childAt = c1326.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static ImageView getLogoImageView(C1326 c1326) {
        return getImageView(c1326, c1326.getLogo());
    }

    public static ImageView getImageView(C1326 c1326, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < c1326.getChildCount(); i++) {
            View childAt = c1326.getChildAt(i);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    public static View getSecondaryActionMenuItemView(C1326 c1326) {
        C1278 actionMenuView = getActionMenuView(c1326);
        if (actionMenuView == null || actionMenuView.getChildCount() <= 1) {
            return null;
        }
        return actionMenuView.getChildAt(0);
    }

    public static C1278 getActionMenuView(C1326 c1326) {
        for (int i = 0; i < c1326.getChildCount(); i++) {
            View childAt = c1326.getChildAt(i);
            if (childAt instanceof C1278) {
                return (C1278) childAt;
            }
        }
        return null;
    }

    public static ImageButton getNavigationIconButton(C1326 c1326) {
        Drawable navigationIcon = c1326.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < c1326.getChildCount(); i++) {
            View childAt = c1326.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ViewOnClickListenerC1309 getActionMenuItemView(C1326 c1326, int i) {
        C1278 actionMenuView = getActionMenuView(c1326);
        if (actionMenuView == null) {
            return null;
        }
        for (int i2 = 0; i2 < actionMenuView.getChildCount(); i2++) {
            View childAt = actionMenuView.getChildAt(i2);
            if (childAt instanceof ViewOnClickListenerC1309) {
                ViewOnClickListenerC1309 viewOnClickListenerC1309 = (ViewOnClickListenerC1309) childAt;
                if (viewOnClickListenerC1309.getItemData().getItemId() == i) {
                    return viewOnClickListenerC1309;
                }
            }
        }
        return null;
    }
}
