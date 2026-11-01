package p067l;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.᩷᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E7P7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22454 extends AbstractC11725 implements PluginBaseTextViewBuilder {

    /* JADX INFO: renamed from: ֡ */
    public Integer f70827;

    /* JADX INFO: renamed from: ֨ */
    public Boolean f70828;

    /* JADX INFO: renamed from: ۘ */
    public Boolean f70829;

    /* JADX INFO: renamed from: ۙ */
    public Typeface f70830;

    /* JADX INFO: renamed from: ۚ */
    public Integer f70831;

    /* JADX INFO: renamed from: ۠ */
    public CharSequence f70832;

    /* JADX INFO: renamed from: ܶ */
    public ColorStateList f70833;

    /* JADX INFO: renamed from: ᩴ */
    public Float f70834;

    /* JADX INFO: renamed from: ᩵ */
    public Float f70835;

    /* JADX INFO: renamed from: ᩶ */
    public TextUtils.TruncateAt f70836;

    /* JADX INFO: renamed from: ᩸ */
    public Integer f70837;

    /* JADX INFO: renamed from: ᩹ */
    public Float f70838;

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void mo12670(C12001 c12001) {
        super.mo12670((C9318) c12001);
        CharSequence charSequence = this.f70832;
        if (charSequence != null) {
            c12001.m27485(charSequence);
        }
        Float f = this.f70838;
        if (f != null) {
            c12001.setTextSize(f.floatValue());
        }
        ColorStateList colorStateList = this.f70833;
        if (colorStateList != null) {
            c12001.setTextColor(colorStateList);
        }
        Integer num = this.f70837;
        if (num != null) {
            c12001.setGravity(num.intValue());
        }
        Typeface typeface = this.f70830;
        if (typeface != null) {
            c12001.setTypeface(typeface);
        }
        Float f2 = this.f70834;
        if (f2 != null && this.f70835 != null) {
            c12001.setLineSpacing(f2.floatValue(), this.f70835.floatValue());
        }
        Boolean bool = this.f70828;
        if (bool != null) {
            c12001.setSingleLine(bool.booleanValue());
        }
        Integer num2 = this.f70827;
        if (num2 != null) {
            c12001.setMaxLines(num2.intValue());
        }
        Integer num3 = this.f70831;
        if (num3 != null) {
            c12001.setMinLines(num3.intValue());
        }
        TextUtils.TruncateAt truncateAt = this.f70836;
        if (truncateAt != null) {
            c12001.setEllipsize(truncateAt);
        }
        Boolean bool2 = this.f70829;
        if (bool2 != null) {
            c12001.setAllCaps(bool2.booleanValue());
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder text(CharSequence charSequence) {
        this.f70832 = m26929(charSequence);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textSize(float f) {
        this.f70838 = Float.valueOf(f);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textColor(int i) {
        this.f70833 = ColorStateList.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textColor(int i, int i2) {
        this.f70833 = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{i, i2});
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textColor(ColorStateList colorStateList) {
        this.f70833 = colorStateList;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textStyle(boolean z, boolean z2) {
        if (z && z2) {
            this.f70830 = Typeface.create(Typeface.DEFAULT, 3);
            return this;
        }
        if (z) {
            this.f70830 = Typeface.DEFAULT_BOLD;
            return this;
        }
        if (z2) {
            this.f70830 = Typeface.create(Typeface.DEFAULT, 2);
            return this;
        }
        this.f70830 = Typeface.DEFAULT;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder bold() {
        textStyle(true, false);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder italic() {
        textStyle(false, true);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder typeface(Typeface typeface) {
        this.f70830 = typeface;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder typeface(Typeface typeface, int i) {
        if (i > 0) {
            if (typeface == null) {
                typeface = Typeface.defaultFromStyle(i);
            } else {
                typeface = Typeface.create(typeface, i);
            }
        }
        this.f70830 = typeface;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textGravity(int i) {
        this.f70837 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder lineSpacing(float f, float f2) {
        this.f70834 = Float.valueOf(f);
        this.f70835 = Float.valueOf(f2);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder singleLine() {
        this.f70828 = Boolean.TRUE;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder lines(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.f70827 = numValueOf;
        this.f70831 = numValueOf;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder maxLines(int i) {
        this.f70827 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder minLines(int i) {
        this.f70831 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder ellipsize(TextUtils.TruncateAt truncateAt) {
        this.f70836 = truncateAt;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder allCaps(boolean z) {
        this.f70829 = Boolean.valueOf(z);
        return this;
    }
}
