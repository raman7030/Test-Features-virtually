package bin.mt.plugin.api.ui.builder;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public interface PluginBaseTextViewBuilder extends PluginBaseViewBuilder {
    PluginUIBuilder allCaps(boolean z);

    PluginUIBuilder bold();

    PluginUIBuilder ellipsize(TextUtils.TruncateAt truncateAt);

    PluginUIBuilder italic();

    PluginUIBuilder lineSpacing(float f, float f2);

    PluginUIBuilder lines(int i);

    PluginUIBuilder maxLines(int i);

    PluginUIBuilder minLines(int i);

    PluginUIBuilder singleLine();

    PluginUIBuilder text(CharSequence charSequence);

    PluginUIBuilder textColor(int i);

    PluginUIBuilder textColor(int i, int i2);

    PluginUIBuilder textColor(ColorStateList colorStateList);

    PluginUIBuilder textGravity(int i);

    PluginUIBuilder textSize(float f);

    PluginUIBuilder textStyle(boolean z, boolean z2);

    PluginUIBuilder typeface(Typeface typeface);

    PluginUIBuilder typeface(Typeface typeface, int i);
}
