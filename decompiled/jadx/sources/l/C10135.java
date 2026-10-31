package l;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import bin.mt.plugin.api.ui.PluginTextView;

/* JADX INFO: renamed from: l.ۤۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 57OH */
/* JADX INFO: loaded from: classes4.dex */
public class C10135 extends C7312 implements PluginTextView {
    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final CharSequence getText() {
        return ((TextView) this.f22448).getText();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25466(CharSequence charSequence) {
        ((TextView) this.f22448).setText(charSequence);
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final float getTextSize() {
        return C11266.m27879(((TextView) this.f22448).getTextSize());
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final ColorStateList getTextColors() {
        return ((TextView) this.f22448).getTextColors();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final int getCurrentTextColor() {
        return ((TextView) this.f22448).getCurrentTextColor();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final Typeface getTypeface() {
        return ((TextView) this.f22448).getTypeface();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final int getGravity() {
        return ((TextView) this.f22448).getGravity();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final int getMinLines() {
        return ((TextView) this.f22448).getMinLines();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final int getMaxLines() {
        return ((TextView) this.f22448).getMaxLines();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final boolean isAllCaps() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((TextView) this.f22448).isAllCaps();
        }
        return ((TextView) this.f22448).getTransformationMethod() instanceof C22607;
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void append(CharSequence charSequence) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).append(charSequence);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void append(CharSequence charSequence, int i, int i2) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).append(charSequence, i, i2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setAllCaps(boolean z) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setAllCaps(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setEllipsize(truncateAt);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setGravity(int i) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setGravity(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setLineSpacing(float f, float f2) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setLineSpacing(f, f2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setLines(int i) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setLines(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setMaxLines(int i) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setMaxLines(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setMinLines(int i) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setMinLines(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setSingleLine(boolean z) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setSingleLine(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setText(CharSequence charSequence) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setText(m19597(charSequence));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTextColor(int i) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setTextColor(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTextColor(int i, int i2) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{i, i2}));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTextColor(ColorStateList colorStateList) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setTextColor(colorStateList);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTextSize(float f) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setTextSize(f);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTypeface(Typeface typeface) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setTypeface(typeface);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTypeface(Typeface typeface, int i) {
        if (C10975.m27285()) {
            ((TextView) this.f22448).setTypeface(typeface, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
