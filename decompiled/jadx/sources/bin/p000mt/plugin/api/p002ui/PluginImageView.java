package bin.p000mt.plugin.api.p002ui;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public interface PluginImageView extends PluginView {
    void clearColorFilter();

    ColorFilter getColorFilter();

    boolean getCropToPadding();

    int getImageAlpha();

    Drawable getImageDrawable();

    Matrix getImageMatrix();

    ColorStateList getImageTintList();

    PorterDuff.Mode getImageTintMode();

    ImageView.ScaleType getScaleType();

    void setColorFilter(int i);

    void setColorFilter(int i, PorterDuff.Mode mode);

    void setColorFilter(ColorFilter colorFilter);

    void setCropToPadding(boolean z);

    void setImage(Bitmap bitmap);

    void setImage(Drawable drawable);

    void setImageAlpha(int i);

    void setImageMatrix(Matrix matrix);

    void setImageTintList(ColorStateList colorStateList);

    void setImageTintMode(PorterDuff.Mode mode);

    void setScaleType(ImageView.ScaleType scaleType);
}
