package l;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import bin.mt.plugin.api.ui.PluginImageView;

/* JADX INFO: renamed from: l.֨ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K7IB */
/* JADX INFO: loaded from: classes3.dex */
public final class C0962 extends C7312 implements PluginImageView {
    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final Drawable getImageDrawable() {
        return ((ImageView) this.f22448).getDrawable();
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final void setImage(Drawable drawable) {
        ((ImageView) this.f22448).setImageDrawable(drawable);
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final void setImage(Bitmap bitmap) {
        ((ImageView) this.f22448).setImageBitmap(bitmap);
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final ColorStateList getImageTintList() {
        return ((ImageView) this.f22448).getImageTintList();
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final void setImageTintList(ColorStateList colorStateList) {
        ((ImageView) this.f22448).setImageTintList(colorStateList);
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final PorterDuff.Mode getImageTintMode() {
        return ((ImageView) this.f22448).getImageTintMode();
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final void setImageTintMode(PorterDuff.Mode mode) {
        ((ImageView) this.f22448).setImageTintMode(mode);
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final ImageView.ScaleType getScaleType() {
        return ((ImageView) this.f22448).getScaleType();
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        ((ImageView) this.f22448).setScaleType(scaleType);
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final Matrix getImageMatrix() {
        return ((ImageView) this.f22448).getImageMatrix();
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final void setImageMatrix(Matrix matrix) {
        ((ImageView) this.f22448).setImageMatrix(matrix);
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final boolean getCropToPadding() {
        return ((ImageView) this.f22448).getCropToPadding();
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final void setCropToPadding(boolean z) {
        ((ImageView) this.f22448).setCropToPadding(z);
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final ColorFilter getColorFilter() {
        return ((ImageView) this.f22448).getColorFilter();
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        ((ImageView) this.f22448).setColorFilter(i, mode);
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final void setColorFilter(int i) {
        ((ImageView) this.f22448).setColorFilter(i);
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final void setColorFilter(ColorFilter colorFilter) {
        ((ImageView) this.f22448).setColorFilter(colorFilter);
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final void clearColorFilter() {
        ((ImageView) this.f22448).clearColorFilter();
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final int getImageAlpha() {
        return ((ImageView) this.f22448).getImageAlpha();
    }

    @Override // bin.mt.plugin.api.ui.PluginImageView
    public final void setImageAlpha(int i) {
        ((ImageView) this.f22448).setImageAlpha(i);
    }
}
