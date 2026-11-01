package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder;

/* JADX INFO: renamed from: l.ۗ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7IN */
/* JADX INFO: loaded from: classes3.dex */
public final class C5689 extends AbstractC11725 implements PluginImageViewBuilder {

    /* JADX INFO: renamed from: ֡ */
    public Boolean f13866;

    /* JADX INFO: renamed from: ֨ */
    public Bitmap f13867;

    /* JADX INFO: renamed from: ۘ */
    public ColorFilter f13868;

    /* JADX INFO: renamed from: ۚ */
    public Integer f13869;

    /* JADX INFO: renamed from: ۠ */
    public Drawable f13870;

    /* JADX INFO: renamed from: ܶ */
    public Matrix f13871;

    /* JADX INFO: renamed from: ᩴ */
    public Integer f13872;

    /* JADX INFO: renamed from: ᩵ */
    public PorterDuff.Mode f13873;

    /* JADX INFO: renamed from: ᩶ */
    public ImageView.ScaleType f13874;

    /* JADX INFO: renamed from: ᩸ */
    public ColorStateList f13875;

    /* JADX INFO: renamed from: ᩹ */
    public PorterDuff.Mode f13876;

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final void mo12670(C9318 c9318) {
        C3283 c3283 = (C3283) c9318;
        super.mo12670(c3283);
        Drawable drawable = this.f13870;
        if (drawable != null) {
            c3283.setImage(drawable);
        } else {
            Bitmap bitmap = this.f13867;
            if (bitmap != null) {
                c3283.setImage(bitmap);
            }
        }
        ColorStateList colorStateList = this.f13875;
        if (colorStateList != null) {
            c3283.setImageTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f13876;
        if (mode != null) {
            c3283.setImageTintMode(mode);
        }
        ImageView.ScaleType scaleType = this.f13874;
        if (scaleType != null) {
            c3283.setScaleType(scaleType);
        }
        Matrix matrix = this.f13871;
        if (matrix != null) {
            c3283.setImageMatrix(matrix);
        }
        Boolean bool = this.f13866;
        if (bool != null) {
            c3283.setCropToPadding(bool.booleanValue());
        }
        ColorFilter colorFilter = this.f13868;
        if (colorFilter != null) {
            c3283.setColorFilter(colorFilter);
        } else {
            Integer num = this.f13872;
            if (num != null && this.f13873 != null) {
                c3283.setColorFilter(num.intValue(), this.f13873);
            } else if (num != null) {
                c3283.setColorFilter(num.intValue());
            }
        }
        Integer num2 = this.f13869;
        if (num2 != null) {
            c3283.setImageAlpha(num2.intValue());
        }
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final C9318 mo8086(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C3283(pluginUI, pluginViewGroup);
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final View mo8085(Context context) {
        return new C1732(context);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder image(Drawable drawable) {
        this.f13870 = drawable;
        this.f13867 = null;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder image(Bitmap bitmap) {
        this.f13867 = bitmap;
        this.f13870 = null;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageTintList(ColorStateList colorStateList) {
        this.f13875 = colorStateList;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageTintMode(PorterDuff.Mode mode) {
        this.f13876 = mode;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder scaleType(ImageView.ScaleType scaleType) {
        this.f13874 = scaleType;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageMatrix(Matrix matrix) {
        this.f13871 = matrix;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder cropToPadding(boolean z) {
        this.f13866 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder colorFilter(int i, PorterDuff.Mode mode) {
        this.f13872 = Integer.valueOf(i);
        this.f13873 = mode;
        this.f13868 = null;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder colorFilter(int i) {
        this.f13872 = Integer.valueOf(i);
        this.f13873 = null;
        this.f13868 = null;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder colorFilter(ColorFilter colorFilter) {
        this.f13868 = colorFilter;
        this.f13872 = null;
        this.f13873 = null;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageAlpha(int i) {
        this.f13869 = Integer.valueOf(i);
        return this;
    }
}
