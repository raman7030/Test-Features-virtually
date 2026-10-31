package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import l.C0881;
import l.C14402;
import l.C17648;
import l.C17931;
import l.C18637;
import l.C19343;
import l.C21610;
import l.C22733;
import l.C23575;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends NavigationBarView {
    public static final int MAX_ITEM_COUNT = 5;

    @Deprecated
    public interface OnNavigationItemReselectedListener extends NavigationBarView.OnItemReselectedListener {
    }

    @Deprecated
    public interface OnNavigationItemSelectedListener extends NavigationBarView.OnItemSelectedListener {
    }

    private boolean shouldDrawCompatibilityTopDivider() {
        return false;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f54958);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C18637.f58612);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        C22733 c22733ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C19343.f61569, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(c22733ObtainTintedStyledAttributes.m50801(C19343.f61039, true));
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f61516)) {
            setMinimumHeight(c22733ObtainTintedStyledAttributes.m50803(C19343.f61516, 0));
        }
        if (c22733ObtainTintedStyledAttributes.m50801(C19343.f62048, true) && shouldDrawCompatibilityTopDivider()) {
            addCompatibilityTopDivider(context2);
        }
        c22733ObtainTintedStyledAttributes.m50813();
        applyWindowInsets();
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public C21610 onApplyWindowInsets(View view, C21610 c21610, ViewUtils.RelativePadding relativePadding) {
                relativePadding.bottom = c21610.m48835() + relativePadding.bottom;
                int i = C17648.f53953;
                boolean z = view.getLayoutDirection() == 1;
                int iM48824 = c21610.m48824();
                int iM48834 = c21610.m48834();
                relativePadding.start += z ? iM48834 : iM48824;
                int i2 = relativePadding.end;
                if (!z) {
                    iM48824 = iM48834;
                }
                relativePadding.end = i2 + iM48824;
                relativePadding.applyToView(view);
                return c21610;
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, makeMinHeightSpec(i2));
    }

    private int makeMinHeightSpec(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.isItemHorizontalTranslationEnabled() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().updateMenuView(false);
        }
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((BottomNavigationMenuView) getMenuView()).isItemHorizontalTranslationEnabled();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public NavigationBarMenuView createNavigationBarMenuView(Context context) {
        return new BottomNavigationMenuView(context);
    }

    private void addCompatibilityTopDivider(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0881.m3228(context, C14402.f43507));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C23575.f76267)));
        addView(view);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        setOnItemSelectedListener(onNavigationItemSelectedListener);
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        setOnItemReselectedListener(onNavigationItemReselectedListener);
    }
}
