package l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginEditTextWatcher;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginEditTextBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G7NS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20427 extends AbstractC9844 implements PluginEditTextBuilder {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Integer f65895;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Integer f65896;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Boolean f65897;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f65898;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65899;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Integer f65900;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Integer f65901;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Integer f65902;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public CharSequence f65903;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Float f65904;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f65905;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Integer f65906;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Typeface f65907;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Boolean f65908;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public CharSequence f65909;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Integer f65910;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65911;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f65912;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f65913;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ArrayList f65914;

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginEditTextBuilder onClick(PluginView.OnClickListener onClickListener) {
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginEditTextBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final /* bridge */ /* synthetic */ PluginEditTextBuilder backgroundColor(int i) {
        backgroundColor(i);
        return this;
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final void mo10675(C7312 c7312) {
        C0256 c0256 = (C0256) c7312;
        Drawable drawable = this.f29739;
        if (drawable instanceof C22543) {
            this.f29739 = C10235.m25889(((C10235) c0256.m19595()).getContext(), ((C22543) drawable).f72933 ? 1 : 0);
        }
        ((C10235) c0256.m19595()).setBackground(null);
        ((C10235) c0256.m19595()).setPadding(0, 0, 0, 0);
        super.mo10675(c0256);
        Integer num = this.f65906;
        if (num != null) {
            c0256.setSoftWrap(num.intValue());
        }
        Float f = this.f65904;
        if (f != null) {
            c0256.setTextSize(f.floatValue());
        }
        Boolean bool = this.f65897;
        if (bool != null) {
            c0256.setSingleLine(bool.booleanValue());
        }
        Typeface typeface = this.f65907;
        if (typeface != null) {
            c0256.setTypeface(typeface);
        }
        String str = this.f65905;
        if (str != null) {
            c0256.setSyntaxHighlight(str);
        }
        Integer num2 = this.f65900;
        if (num2 != null && num2.intValue() > 0) {
            c0256.setMaxLength(this.f65900.intValue());
        }
        Integer num3 = this.f65901;
        if (num3 != null) {
            c0256.setTextColor(num3.intValue());
        }
        Integer num4 = this.f65910;
        if (num4 != null) {
            c0256.setHintTextColor(num4.intValue());
        }
        Integer num5 = this.f65896;
        if (num5 != null) {
            c0256.setMaxLines(num5.intValue());
        }
        Integer num6 = this.f65902;
        if (num6 != null) {
            c0256.setMinLines(num6.intValue());
        }
        Integer num7 = this.f65895;
        if (num7 != null) {
            c0256.setInputType(num7.intValue());
        }
        if (this.f65898) {
            c0256.setBracketHighlightEnable(false);
        }
        CharSequence charSequence = this.f65903;
        if (charSequence != null) {
            c0256.m1524(charSequence);
        }
        CharSequence charSequence2 = this.f65909;
        if (charSequence2 != null) {
            c0256.m1525(charSequence2.toString());
        }
        int i = this.f65912;
        if (i == 1) {
            c0256.setSelection(this.f65911, this.f65913);
        } else if (i == 2) {
            c0256.selectAll();
        } else if (i == 3) {
            c0256.selectEnd();
        }
        Boolean bool2 = this.f65908;
        if (bool2 != null) {
            c0256.setReadOnly(bool2.booleanValue());
        }
        ArrayList arrayList = this.f65914;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0256.addTextChangedListener((PluginEditTextWatcher) it.next());
            }
        }
        if (this.f65899) {
            c0256.requestFocusAndShowIME();
        }
    }

    public C20427(PluginUIBuilder pluginUIBuilder, boolean z) {
        super(pluginUIBuilder);
        this.f29739 = new C22543(z);
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final C7312 mo5876(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C0256(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final View mo5875(Context context) {
        return new C10235(context);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder text(CharSequence charSequence) {
        this.f65903 = m24914(charSequence);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder text(JSONObject jSONObject) {
        text(jSONObject, null);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder text(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            this.f65903 = str;
            return this;
        }
        this.f65903 = jSONObject.getString(requireId(), str);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder hint(CharSequence charSequence) {
        this.f65909 = m24914(charSequence);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder textSize(float f) {
        this.f65904 = Float.valueOf(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder textColor(int i) {
        this.f65901 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder setHintTextColor(int i) {
        this.f65910 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder textStyle(boolean z, boolean z2) {
        if (z && z2) {
            this.f65907 = Typeface.create(Typeface.DEFAULT, 3);
            return this;
        }
        if (z) {
            this.f65907 = Typeface.DEFAULT_BOLD;
            return this;
        }
        if (z2) {
            this.f65907 = Typeface.create(Typeface.DEFAULT, 2);
            return this;
        }
        this.f65907 = Typeface.DEFAULT;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder bold() {
        textStyle(true, false);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder italic() {
        textStyle(false, true);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder typeface(Typeface typeface) {
        this.f65907 = typeface;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder typeface(Typeface typeface, int i) {
        if (i > 0) {
            if (typeface == null) {
                typeface = Typeface.defaultFromStyle(i);
            } else {
                typeface = Typeface.create(typeface, i);
            }
        }
        this.f65907 = typeface;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder singleLine(boolean z) {
        this.f65897 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder lines(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.f65896 = numValueOf;
        this.f65902 = numValueOf;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder minLines(int i) {
        this.f65902 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder maxLines(int i) {
        this.f65896 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder inputType(int i) {
        this.f65895 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder inputTypeMultiline() {
        this.f65895 = 131073;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder inputTypeNumber() {
        this.f65895 = 2;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder maxLength(int i) {
        this.f65900 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder disableBracketHighlight() {
        this.f65898 = true;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginEditTextBuilder background(Drawable drawable) {
        this.f29739 = drawable;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder select(int i) {
        this.f65912 = 1;
        this.f65913 = i;
        this.f65911 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder select(int i, int i2) {
        this.f65912 = 1;
        this.f65911 = i;
        this.f65913 = i2;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder selectAll() {
        this.f65912 = 2;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder selectEnd() {
        this.f65912 = 3;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder syntaxHighlight(String str) {
        this.f65905 = str;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder softWrap(int i) {
        this.f65906 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder readOnly() {
        this.f65908 = Boolean.TRUE;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder readOnly(boolean z) {
        this.f65908 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder addTextChangedListener(PluginEditTextWatcher pluginEditTextWatcher) {
        if (this.f65914 == null) {
            this.f65914 = new ArrayList(1);
        }
        this.f65914.add(pluginEditTextWatcher);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder requestFocusAndShowIME() {
        this.f29734 = true;
        this.f65899 = true;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final boolean isBoxStyle() {
        Drawable drawable = this.f29739;
        return (drawable instanceof C22543) && ((C22543) drawable).f72933;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final boolean isLineStyle() {
        Drawable drawable = this.f29739;
        return (drawable instanceof C22543) && !((C22543) drawable).f72933;
    }
}
