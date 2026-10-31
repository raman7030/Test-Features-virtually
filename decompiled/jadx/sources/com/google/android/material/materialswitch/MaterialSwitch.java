package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import l.C17931;
import l.C18637;
import l.C19343;
import l.C21311;
import l.C22733;
import l.C2978;
import l.C7191;
import l.C8184;

/* JADX INFO: loaded from: classes.dex */
public class MaterialSwitch extends C2978 {
    public static final int DEF_STYLE_RES = C18637.f58789;
    public static final int[] STATE_SET_WITH_ICON = {C17931.f55396};
    public int[] currentStateChecked;
    public int[] currentStateUnchecked;
    public Drawable thumbDrawable;
    public Drawable thumbIconDrawable;
    public int thumbIconSize;
    public ColorStateList thumbIconTintList;
    public PorterDuff.Mode thumbIconTintMode;
    public ColorStateList thumbTintList;
    public Drawable trackDecorationDrawable;
    public ColorStateList trackDecorationTintList;
    public PorterDuff.Mode trackDecorationTintMode;
    public Drawable trackDrawable;
    public ColorStateList trackTintList;

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f55194);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.thumbIconSize = -1;
        Context context2 = getContext();
        this.thumbDrawable = super.getThumbDrawable();
        this.thumbTintList = super.getThumbTintList();
        super.setThumbTintList(null);
        this.trackDrawable = super.getTrackDrawable();
        this.trackTintList = super.getTrackTintList();
        super.setTrackTintList(null);
        C22733 c22733ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C19343.f62487, i, i2, new int[0]);
        this.thumbIconDrawable = c22733ObtainTintedStyledAttributes.m50815(C19343.f62328);
        this.thumbIconSize = c22733ObtainTintedStyledAttributes.m50803(C19343.f61157, -1);
        this.thumbIconTintList = c22733ObtainTintedStyledAttributes.m50804(C19343.f61051);
        int iM50809 = c22733ObtainTintedStyledAttributes.m50809(C19343.f61794, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.thumbIconTintMode = ViewUtils.parseTintMode(iM50809, mode);
        this.trackDecorationDrawable = c22733ObtainTintedStyledAttributes.m50815(C19343.f61741);
        this.trackDecorationTintList = c22733ObtainTintedStyledAttributes.m50804(C19343.f61581);
        this.trackDecorationTintMode = ViewUtils.parseTintMode(c22733ObtainTintedStyledAttributes.m50809(C19343.f61263, -1), mode);
        c22733ObtainTintedStyledAttributes.m50813();
        setEnforceSwitchWidth(false);
        refreshThumbDrawable();
        refreshTrackDrawable();
    }

    @Override // android.view.View
    public void invalidate() {
        updateDrawableTints();
        super.invalidate();
    }

    @Override // l.C2978, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.thumbIconDrawable != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, STATE_SET_WITH_ICON);
        }
        this.currentStateUnchecked = DrawableUtils.getUncheckedState(iArrOnCreateDrawableState);
        this.currentStateChecked = DrawableUtils.getCheckedState(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // l.C2978
    public void setThumbDrawable(Drawable drawable) {
        this.thumbDrawable = drawable;
        refreshThumbDrawable();
    }

    @Override // l.C2978
    public Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    @Override // l.C2978
    public void setThumbTintList(ColorStateList colorStateList) {
        this.thumbTintList = colorStateList;
        refreshThumbDrawable();
    }

    @Override // l.C2978
    public ColorStateList getThumbTintList() {
        return this.thumbTintList;
    }

    @Override // l.C2978
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        refreshThumbDrawable();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(C21311.m48345(getContext(), i));
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.thumbIconDrawable = drawable;
        refreshThumbDrawable();
    }

    public Drawable getThumbIconDrawable() {
        return this.thumbIconDrawable;
    }

    public void setThumbIconSize(int i) {
        if (this.thumbIconSize != i) {
            this.thumbIconSize = i;
            refreshThumbDrawable();
        }
    }

    public int getThumbIconSize() {
        return this.thumbIconSize;
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.thumbIconTintList = colorStateList;
        refreshThumbDrawable();
    }

    public ColorStateList getThumbIconTintList() {
        return this.thumbIconTintList;
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.thumbIconTintMode = mode;
        refreshThumbDrawable();
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.thumbIconTintMode;
    }

    @Override // l.C2978
    public void setTrackDrawable(Drawable drawable) {
        this.trackDrawable = drawable;
        refreshTrackDrawable();
    }

    @Override // l.C2978
    public Drawable getTrackDrawable() {
        return this.trackDrawable;
    }

    @Override // l.C2978
    public void setTrackTintList(ColorStateList colorStateList) {
        this.trackTintList = colorStateList;
        refreshTrackDrawable();
    }

    @Override // l.C2978
    public ColorStateList getTrackTintList() {
        return this.trackTintList;
    }

    @Override // l.C2978
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        refreshTrackDrawable();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(C21311.m48345(getContext(), i));
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.trackDecorationDrawable = drawable;
        refreshTrackDrawable();
    }

    public Drawable getTrackDecorationDrawable() {
        return this.trackDecorationDrawable;
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.trackDecorationTintList = colorStateList;
        refreshTrackDrawable();
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.trackDecorationTintList;
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.trackDecorationTintMode = mode;
        refreshTrackDrawable();
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.trackDecorationTintMode;
    }

    private void refreshThumbDrawable() {
        this.thumbDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.thumbDrawable, this.thumbTintList, getThumbTintMode());
        this.thumbIconDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.thumbIconDrawable, this.thumbIconTintList, this.thumbIconTintMode);
        updateDrawableTints();
        Drawable drawable = this.thumbDrawable;
        Drawable drawable2 = this.thumbIconDrawable;
        int i = this.thumbIconSize;
        super.setThumbDrawable(DrawableUtils.compositeTwoLayeredDrawable(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    private void refreshTrackDrawable() {
        this.trackDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.trackDrawable, this.trackTintList, getTrackTintMode());
        this.trackDecorationDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.trackDecorationDrawable, this.trackDecorationTintList, this.trackDecorationTintMode);
        updateDrawableTints();
        Drawable layerDrawable = this.trackDrawable;
        if (layerDrawable != null && this.trackDecorationDrawable != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.trackDrawable, this.trackDecorationDrawable});
        } else if (layerDrawable == null) {
            layerDrawable = this.trackDecorationDrawable;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    private void updateDrawableTints() {
        if (this.thumbTintList == null && this.thumbIconTintList == null && this.trackTintList == null && this.trackDecorationTintList == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.thumbTintList;
        if (colorStateList != null) {
            setInterpolatedDrawableTintIfPossible(this.thumbDrawable, colorStateList, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        ColorStateList colorStateList2 = this.thumbIconTintList;
        if (colorStateList2 != null) {
            setInterpolatedDrawableTintIfPossible(this.thumbIconDrawable, colorStateList2, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        ColorStateList colorStateList3 = this.trackTintList;
        if (colorStateList3 != null) {
            setInterpolatedDrawableTintIfPossible(this.trackDrawable, colorStateList3, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        ColorStateList colorStateList4 = this.trackDecorationTintList;
        if (colorStateList4 != null) {
            setInterpolatedDrawableTintIfPossible(this.trackDecorationDrawable, colorStateList4, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
    }

    public static void setInterpolatedDrawableTintIfPossible(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        C8184.m21683(drawable, C7191.m19267(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
    }
}
