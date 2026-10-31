package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginImageViewBuilder;

/* JADX INFO: renamed from: l.ۗ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7IN */
/* JADX INFO: loaded from: classes3.dex */
public final class C3493 extends AbstractC9844 implements PluginImageViewBuilder {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Boolean f11061;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Bitmap f11062;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ColorFilter f11063;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Integer f11064;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Drawable f11065;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Matrix f11066;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Integer f11067;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f11068;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView.ScaleType f11069;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ColorStateList f11070;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f11071;

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10675(C7312 c7312) {
        C0962 c0962 = (C0962) c7312;
        super.mo10675(c0962);
        Drawable drawable = this.f11065;
        if (drawable != null) {
            c0962.setImage(drawable);
        } else {
            Bitmap bitmap = this.f11062;
            if (bitmap != null) {
                c0962.setImage(bitmap);
            }
        }
        ColorStateList colorStateList = this.f11070;
        if (colorStateList != null) {
            c0962.setImageTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f11071;
        if (mode != null) {
            c0962.setImageTintMode(mode);
        }
        ImageView.ScaleType scaleType = this.f11069;
        if (scaleType != null) {
            c0962.setScaleType(scaleType);
        }
        Matrix matrix = this.f11066;
        if (matrix != null) {
            c0962.setImageMatrix(matrix);
        }
        Boolean bool = this.f11061;
        if (bool != null) {
            c0962.setCropToPadding(bool.booleanValue());
        }
        ColorFilter colorFilter = this.f11063;
        if (colorFilter != null) {
            c0962.setColorFilter(colorFilter);
        } else {
            Integer num = this.f11067;
            if (num != null && this.f11068 != null) {
                c0962.setColorFilter(num.intValue(), this.f11068);
            } else if (num != null) {
                c0962.setColorFilter(num.intValue());
            }
        }
        Integer num2 = this.f11064;
        if (num2 != null) {
            c0962.setImageAlpha(num2.intValue());
        }
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final C7312 mo5876(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C0962(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final View mo5875(Context context) {
        return new C17939(context);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder image(Drawable drawable) {
        this.f11065 = drawable;
        this.f11062 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder image(Bitmap bitmap) {
        this.f11062 = bitmap;
        this.f11065 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageTintList(ColorStateList colorStateList) {
        this.f11070 = colorStateList;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageTintMode(PorterDuff.Mode mode) {
        this.f11071 = mode;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder scaleType(ImageView.ScaleType scaleType) {
        this.f11069 = scaleType;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageMatrix(Matrix matrix) {
        this.f11066 = matrix;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder cropToPadding(boolean z) {
        this.f11061 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder colorFilter(int i, PorterDuff.Mode mode) {
        this.f11067 = Integer.valueOf(i);
        this.f11068 = mode;
        this.f11063 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder colorFilter(int i) {
        this.f11067 = Integer.valueOf(i);
        this.f11068 = null;
        this.f11063 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder colorFilter(ColorFilter colorFilter) {
        this.f11063 = colorFilter;
        this.f11067 = null;
        this.f11068 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageAlpha(int i) {
        this.f11064 = Integer.valueOf(i);
        return this;
    }
}
