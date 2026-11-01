package p067l;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import bin.p000mt.plugin.api.p002ui.PluginTextView;

/* JADX INFO: renamed from: l.ۤۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 57OH */
/* JADX INFO: loaded from: classes4.dex */
public class C12001 extends C9318 implements PluginTextView {
    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final CharSequence getText() {
        return ((TextView) this.f25339).getText();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27485(CharSequence charSequence) {
        ((TextView) this.f25339).setText(charSequence);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final float getTextSize() {
        return C13076.m29940(((TextView) this.f25339).getTextSize());
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final ColorStateList getTextColors() {
        return ((TextView) this.f25339).getTextColors();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final int getCurrentTextColor() {
        return ((TextView) this.f25339).getCurrentTextColor();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final Typeface getTypeface() {
        return ((TextView) this.f25339).getTypeface();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final int getGravity() {
        return ((TextView) this.f25339).getGravity();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final int getMinLines() {
        return ((TextView) this.f25339).getMinLines();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final int getMaxLines() {
        return ((TextView) this.f25339).getMaxLines();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final boolean isAllCaps() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((TextView) this.f25339).isAllCaps();
        }
        return ((TextView) this.f25339).getTransformationMethod() instanceof C1963;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void append(CharSequence charSequence) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).append(charSequence);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void append(CharSequence charSequence, int i, int i2) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).append(charSequence, i, i2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setAllCaps(boolean z) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setAllCaps(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setEllipsize(truncateAt);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setGravity(int i) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setGravity(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setLineSpacing(float f, float f2) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setLineSpacing(f, f2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setLines(int i) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setLines(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setMaxLines(int i) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setMaxLines(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setMinLines(int i) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setMinLines(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setSingleLine(boolean z) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setSingleLine(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setText(CharSequence charSequence) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setText(m21565(charSequence));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setTextColor(int i) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setTextColor(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setTextColor(int i, int i2) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{i, i2}));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setTextColor(ColorStateList colorStateList) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setTextColor(colorStateList);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setTextSize(float f) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setTextSize(f);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setTypeface(Typeface typeface) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setTypeface(typeface);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginTextView
    public final void setTypeface(Typeface typeface, int i) {
        if (C12799.m29347()) {
            ((TextView) this.f25339).setTypeface(typeface, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
