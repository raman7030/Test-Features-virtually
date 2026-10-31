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
import l.C8788;
import l.C9762;
import l.ViewOnClickListenerC9411;

/* JADX INFO: loaded from: classes.dex */
public class ToolbarUtils {
    public static final Comparator VIEW_TOP_COMPARATOR = new Comparator() { // from class: com.google.android.material.internal.ToolbarUtils.1
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    };

    public static TextView getTitleTextView(C9762 c9762) {
        List textViewsWithText = getTextViewsWithText(c9762, c9762.getTitle());
        if (textViewsWithText.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(textViewsWithText, VIEW_TOP_COMPARATOR);
    }

    public static TextView getSubtitleTextView(C9762 c9762) {
        List textViewsWithText = getTextViewsWithText(c9762, c9762.getSubtitle());
        if (textViewsWithText.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(textViewsWithText, VIEW_TOP_COMPARATOR);
    }

    public static List getTextViewsWithText(C9762 c9762, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c9762.getChildCount(); i++) {
            View childAt = c9762.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static ImageView getLogoImageView(C9762 c9762) {
        return getImageView(c9762, c9762.getLogo());
    }

    public static ImageView getImageView(C9762 c9762, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < c9762.getChildCount(); i++) {
            View childAt = c9762.getChildAt(i);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    public static View getSecondaryActionMenuItemView(C9762 c9762) {
        C8788 actionMenuView = getActionMenuView(c9762);
        if (actionMenuView == null || actionMenuView.getChildCount() <= 1) {
            return null;
        }
        return actionMenuView.getChildAt(0);
    }

    public static C8788 getActionMenuView(C9762 c9762) {
        for (int i = 0; i < c9762.getChildCount(); i++) {
            View childAt = c9762.getChildAt(i);
            if (childAt instanceof C8788) {
                return (C8788) childAt;
            }
        }
        return null;
    }

    public static ImageButton getNavigationIconButton(C9762 c9762) {
        Drawable navigationIcon = c9762.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < c9762.getChildCount(); i++) {
            View childAt = c9762.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ViewOnClickListenerC9411 getActionMenuItemView(C9762 c9762, int i) {
        C8788 actionMenuView = getActionMenuView(c9762);
        if (actionMenuView == null) {
            return null;
        }
        for (int i2 = 0; i2 < actionMenuView.getChildCount(); i2++) {
            View childAt = actionMenuView.getChildAt(i2);
            if (childAt instanceof ViewOnClickListenerC9411) {
                ViewOnClickListenerC9411 viewOnClickListenerC9411 = (ViewOnClickListenerC9411) childAt;
                if (viewOnClickListenerC9411.getItemData().getItemId() == i) {
                    return viewOnClickListenerC9411;
                }
            }
        }
        return null;
    }
}
