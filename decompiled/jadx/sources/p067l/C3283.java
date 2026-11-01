package p067l;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import bin.p000mt.plugin.api.p002ui.PluginImageView;

/* JADX INFO: renamed from: l.֨ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K7IB */
/* JADX INFO: loaded from: classes3.dex */
public final class C3283 extends C9318 implements PluginImageView {
    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final Drawable getImageDrawable() {
        return ((ImageView) this.f25339).getDrawable();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final void setImage(Drawable drawable) {
        ((ImageView) this.f25339).setImageDrawable(drawable);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final void setImage(Bitmap bitmap) {
        ((ImageView) this.f25339).setImageBitmap(bitmap);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final ColorStateList getImageTintList() {
        return ((ImageView) this.f25339).getImageTintList();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final void setImageTintList(ColorStateList colorStateList) {
        ((ImageView) this.f25339).setImageTintList(colorStateList);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final PorterDuff.Mode getImageTintMode() {
        return ((ImageView) this.f25339).getImageTintMode();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final void setImageTintMode(PorterDuff.Mode mode) {
        ((ImageView) this.f25339).setImageTintMode(mode);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final ImageView.ScaleType getScaleType() {
        return ((ImageView) this.f25339).getScaleType();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        ((ImageView) this.f25339).setScaleType(scaleType);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final Matrix getImageMatrix() {
        return ((ImageView) this.f25339).getImageMatrix();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final void setImageMatrix(Matrix matrix) {
        ((ImageView) this.f25339).setImageMatrix(matrix);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final boolean getCropToPadding() {
        return ((ImageView) this.f25339).getCropToPadding();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final void setCropToPadding(boolean z) {
        ((ImageView) this.f25339).setCropToPadding(z);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final ColorFilter getColorFilter() {
        return ((ImageView) this.f25339).getColorFilter();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        ((ImageView) this.f25339).setColorFilter(i, mode);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final void setColorFilter(int i) {
        ((ImageView) this.f25339).setColorFilter(i);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final void setColorFilter(ColorFilter colorFilter) {
        ((ImageView) this.f25339).setColorFilter(colorFilter);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final void clearColorFilter() {
        ((ImageView) this.f25339).clearColorFilter();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final int getImageAlpha() {
        return ((ImageView) this.f25339).getImageAlpha();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginImageView
    public final void setImageAlpha(int i) {
        ((ImageView) this.f25339).setImageAlpha(i);
    }
}
