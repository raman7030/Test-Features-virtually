package l;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.᩷᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E7P7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21133 extends AbstractC9844 implements PluginBaseTextViewBuilder {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Integer f68145;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Boolean f68146;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Boolean f68147;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Typeface f68148;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Integer f68149;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public CharSequence f68150;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ColorStateList f68151;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Float f68152;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Float f68153;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextUtils.TruncateAt f68154;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Integer f68155;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Float f68156;

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void mo10675(C10135 c10135) {
        super.mo10675((C7312) c10135);
        CharSequence charSequence = this.f68150;
        if (charSequence != null) {
            c10135.m25466(charSequence);
        }
        Float f = this.f68156;
        if (f != null) {
            c10135.setTextSize(f.floatValue());
        }
        ColorStateList colorStateList = this.f68151;
        if (colorStateList != null) {
            c10135.setTextColor(colorStateList);
        }
        Integer num = this.f68155;
        if (num != null) {
            c10135.setGravity(num.intValue());
        }
        Typeface typeface = this.f68148;
        if (typeface != null) {
            c10135.setTypeface(typeface);
        }
        Float f2 = this.f68152;
        if (f2 != null && this.f68153 != null) {
            c10135.setLineSpacing(f2.floatValue(), this.f68153.floatValue());
        }
        Boolean bool = this.f68146;
        if (bool != null) {
            c10135.setSingleLine(bool.booleanValue());
        }
        Integer num2 = this.f68145;
        if (num2 != null) {
            c10135.setMaxLines(num2.intValue());
        }
        Integer num3 = this.f68149;
        if (num3 != null) {
            c10135.setMinLines(num3.intValue());
        }
        TextUtils.TruncateAt truncateAt = this.f68154;
        if (truncateAt != null) {
            c10135.setEllipsize(truncateAt);
        }
        Boolean bool2 = this.f68147;
        if (bool2 != null) {
            c10135.setAllCaps(bool2.booleanValue());
        }
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder text(CharSequence charSequence) {
        this.f68150 = m24914(charSequence);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textSize(float f) {
        this.f68156 = Float.valueOf(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textColor(int i) {
        this.f68151 = ColorStateList.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textColor(int i, int i2) {
        this.f68151 = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{i, i2});
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textColor(ColorStateList colorStateList) {
        this.f68151 = colorStateList;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textStyle(boolean z, boolean z2) {
        if (z && z2) {
            this.f68148 = Typeface.create(Typeface.DEFAULT, 3);
            return this;
        }
        if (z) {
            this.f68148 = Typeface.DEFAULT_BOLD;
            return this;
        }
        if (z2) {
            this.f68148 = Typeface.create(Typeface.DEFAULT, 2);
            return this;
        }
        this.f68148 = Typeface.DEFAULT;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder bold() {
        textStyle(true, false);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder italic() {
        textStyle(false, true);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder typeface(Typeface typeface) {
        this.f68148 = typeface;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder typeface(Typeface typeface, int i) {
        if (i > 0) {
            if (typeface == null) {
                typeface = Typeface.defaultFromStyle(i);
            } else {
                typeface = Typeface.create(typeface, i);
            }
        }
        this.f68148 = typeface;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textGravity(int i) {
        this.f68155 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder lineSpacing(float f, float f2) {
        this.f68152 = Float.valueOf(f);
        this.f68153 = Float.valueOf(f2);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder singleLine() {
        this.f68146 = Boolean.TRUE;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder lines(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.f68145 = numValueOf;
        this.f68149 = numValueOf;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder maxLines(int i) {
        this.f68145 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder minLines(int i) {
        this.f68149 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder ellipsize(TextUtils.TruncateAt truncateAt) {
        this.f68154 = truncateAt;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder allCaps(boolean z) {
        this.f68147 = Boolean.valueOf(z);
        return this;
    }
}
