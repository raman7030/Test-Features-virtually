package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;
import l.C14369;
import l.C16445;
import l.C17648;
import l.C23575;
import l.C9762;
import l.ViewOnClickListenerC9411;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalBadgeUtils
public class BadgeUtils {
    public static final String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT = false;

    public static void updateBadgeBounds(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view) {
        attachBadgeDrawable(badgeDrawable, view, (FrameLayout) null);
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
        if (badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(badgeDrawable);
        } else {
            if (USE_COMPAT_PARENT) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, C9762 c9762, int i) {
        attachBadgeDrawable(badgeDrawable, c9762, i, null);
    }

    public static void attachBadgeDrawable(final BadgeDrawable badgeDrawable, final C9762 c9762, final int i, final FrameLayout frameLayout) {
        c9762.post(new Runnable() { // from class: com.google.android.material.badge.BadgeUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ViewOnClickListenerC9411 actionMenuItemView = ToolbarUtils.getActionMenuItemView(c9762, i);
                if (actionMenuItemView != null) {
                    BadgeUtils.setToolbarOffset(badgeDrawable, c9762.getResources());
                    BadgeUtils.attachBadgeDrawable(badgeDrawable, actionMenuItemView, frameLayout);
                    BadgeUtils.attachBadgeContentDescription(badgeDrawable, actionMenuItemView);
                }
            }
        });
    }

    public static void attachBadgeContentDescription(final BadgeDrawable badgeDrawable, View view) {
        if (Build.VERSION.SDK_INT >= 29 && C17648.m41319(view)) {
            C17648.m41309(view, new C16445(view.getAccessibilityDelegate()) { // from class: com.google.android.material.badge.BadgeUtils.2
                @Override // l.C16445
                public void onInitializeAccessibilityNodeInfo(View view2, C14369 c14369) {
                    super.onInitializeAccessibilityNodeInfo(view2, c14369);
                    c14369.m34305(badgeDrawable.getContentDescription());
                }
            });
        } else {
            C17648.m41309(view, new C16445() { // from class: com.google.android.material.badge.BadgeUtils.3
                @Override // l.C16445
                public void onInitializeAccessibilityNodeInfo(View view2, C14369 c14369) {
                    super.onInitializeAccessibilityNodeInfo(view2, c14369);
                    c14369.m34305(badgeDrawable.getContentDescription());
                }
            });
        }
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (USE_COMPAT_PARENT || badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, C9762 c9762, int i) {
        ViewOnClickListenerC9411 actionMenuItemView;
        if (badgeDrawable == null || (actionMenuItemView = ToolbarUtils.getActionMenuItemView(c9762, i)) == null) {
            return;
        }
        removeToolbarOffset(badgeDrawable);
        detachBadgeDrawable(badgeDrawable, actionMenuItemView);
        detachBadgeContentDescription(actionMenuItemView);
    }

    public static void detachBadgeContentDescription(View view) {
        if (Build.VERSION.SDK_INT >= 29 && C17648.m41319(view)) {
            C17648.m41309(view, new C16445(view.getAccessibilityDelegate()) { // from class: com.google.android.material.badge.BadgeUtils.4
                @Override // l.C16445
                public void onInitializeAccessibilityNodeInfo(View view2, C14369 c14369) {
                    super.onInitializeAccessibilityNodeInfo(view2, c14369);
                    c14369.m34305((CharSequence) null);
                }
            });
        } else {
            C17648.m41309(view, (C16445) null);
        }
    }

    public static void setToolbarOffset(BadgeDrawable badgeDrawable, Resources resources) {
        badgeDrawable.setAdditionalHorizontalOffset(resources.getDimensionPixelOffset(C23575.f76277));
        badgeDrawable.setAdditionalVerticalOffset(resources.getDimensionPixelOffset(C23575.f76301));
    }

    public static void removeToolbarOffset(BadgeDrawable badgeDrawable) {
        badgeDrawable.setAdditionalHorizontalOffset(0);
        badgeDrawable.setAdditionalVerticalOffset(0);
    }

    public static void setBadgeDrawableBounds(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    public static ParcelableSparseArray createParcelableBadgeStates(SparseArray sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            BadgeDrawable badgeDrawable = (BadgeDrawable) sparseArray.valueAt(i);
            parcelableSparseArray.put(iKeyAt, badgeDrawable != null ? badgeDrawable.getSavedState() : null);
        }
        return parcelableSparseArray;
    }

    public static SparseArray createBadgeDrawablesFromSavedStates(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int iKeyAt = parcelableSparseArray.keyAt(i);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i);
            sparseArray.put(iKeyAt, state != null ? BadgeDrawable.createFromSavedState(context, state) : null);
        }
        return sparseArray;
    }
}
