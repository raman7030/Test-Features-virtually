package bin.p000mt.plugin.api.p002ui;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public interface PluginTextView extends PluginView {
    void append(CharSequence charSequence);

    void append(CharSequence charSequence, int i, int i2);

    int getCurrentTextColor();

    int getGravity();

    int getMaxLines();

    int getMinLines();

    CharSequence getText();

    ColorStateList getTextColors();

    float getTextSize();

    Typeface getTypeface();

    boolean isAllCaps();

    void setAllCaps(boolean z);

    void setEllipsize(TextUtils.TruncateAt truncateAt);

    void setGravity(int i);

    void setLineSpacing(float f, float f2);

    void setLines(int i);

    void setMaxLines(int i);

    void setMinLines(int i);

    void setSingleLine(boolean z);

    void setText(CharSequence charSequence);

    void setTextColor(int i);

    void setTextColor(int i, int i2);

    void setTextColor(ColorStateList colorStateList);

    void setTextSize(float f);

    void setTypeface(Typeface typeface);

    void setTypeface(Typeface typeface, int i);
}
