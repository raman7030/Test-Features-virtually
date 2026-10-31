package bin.mt.plugin.api.ui.builder;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public interface PluginImageViewBuilder extends PluginBaseViewBuilder {
    PluginImageViewBuilder colorFilter(int i);

    PluginImageViewBuilder colorFilter(int i, PorterDuff.Mode mode);

    PluginImageViewBuilder colorFilter(ColorFilter colorFilter);

    PluginImageViewBuilder cropToPadding(boolean z);

    PluginImageViewBuilder image(Bitmap bitmap);

    PluginImageViewBuilder image(Drawable drawable);

    PluginImageViewBuilder imageAlpha(int i);

    PluginImageViewBuilder imageMatrix(Matrix matrix);

    PluginImageViewBuilder imageTintList(ColorStateList colorStateList);

    PluginImageViewBuilder imageTintMode(PorterDuff.Mode mode);

    PluginImageViewBuilder scaleType(ImageView.ScaleType scaleType);
}
