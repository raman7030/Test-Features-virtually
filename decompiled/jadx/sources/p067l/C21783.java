package p067l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.p002ui.PluginEditTextWatcher;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G7NS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21783 extends AbstractC11725 implements PluginEditTextBuilder {

    /* JADX INFO: renamed from: ֡ */
    public Integer f68570;

    /* JADX INFO: renamed from: ֨ */
    public Integer f68571;

    /* JADX INFO: renamed from: ۗ */
    public Boolean f68572;

    /* JADX INFO: renamed from: ۘ */
    public boolean f68573;

    /* JADX INFO: renamed from: ۙ */
    public boolean f68574;

    /* JADX INFO: renamed from: ۚ */
    public Integer f68575;

    /* JADX INFO: renamed from: ۛ */
    public Integer f68576;

    /* JADX INFO: renamed from: ۠ */
    public Integer f68577;

    /* JADX INFO: renamed from: ۤ */
    public CharSequence f68578;

    /* JADX INFO: renamed from: ۨ */
    public Float f68579;

    /* JADX INFO: renamed from: ۫ */
    public String f68580;

    /* JADX INFO: renamed from: ۬ */
    public Integer f68581;

    /* JADX INFO: renamed from: ܰ */
    public Typeface f68582;

    /* JADX INFO: renamed from: ܶ */
    public Boolean f68583;

    /* JADX INFO: renamed from: ᩴ */
    public CharSequence f68584;

    /* JADX INFO: renamed from: ᩵ */
    public Integer f68585;

    /* JADX INFO: renamed from: ᩶ */
    public int f68586;

    /* JADX INFO: renamed from: ᩸ */
    public int f68587;

    /* JADX INFO: renamed from: ᩹ */
    public int f68588;

    /* JADX INFO: renamed from: ᩺ */
    public ArrayList f68589;

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginEditTextBuilder onClick(PluginView.OnClickListener onClickListener) {
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginEditTextBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final /* bridge */ /* synthetic */ PluginEditTextBuilder backgroundColor(int i) {
        backgroundColor(i);
        return this;
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final void mo12670(C9318 c9318) {
        C2612 c2612 = (C2612) c9318;
        Drawable drawable = this.f32692;
        if (drawable instanceof C23794) {
            this.f32692 = C12096.m27911(((C12096) c2612.m21563()).getContext(), ((C23794) drawable).f75660 ? 1 : 0);
        }
        ((C12096) c2612.m21563()).setBackground(null);
        ((C12096) c2612.m21563()).setPadding(0, 0, 0, 0);
        super.mo12670(c2612);
        Integer num = this.f68581;
        if (num != null) {
            c2612.setSoftWrap(num.intValue());
        }
        Float f = this.f68579;
        if (f != null) {
            c2612.setTextSize(f.floatValue());
        }
        Boolean bool = this.f68572;
        if (bool != null) {
            c2612.setSingleLine(bool.booleanValue());
        }
        Typeface typeface = this.f68582;
        if (typeface != null) {
            c2612.setTypeface(typeface);
        }
        String str = this.f68580;
        if (str != null) {
            c2612.setSyntaxHighlight(str);
        }
        Integer num2 = this.f68575;
        if (num2 != null && num2.intValue() > 0) {
            c2612.setMaxLength(this.f68575.intValue());
        }
        Integer num3 = this.f68576;
        if (num3 != null) {
            c2612.setTextColor(num3.intValue());
        }
        Integer num4 = this.f68585;
        if (num4 != null) {
            c2612.setHintTextColor(num4.intValue());
        }
        Integer num5 = this.f68571;
        if (num5 != null) {
            c2612.setMaxLines(num5.intValue());
        }
        Integer num6 = this.f68577;
        if (num6 != null) {
            c2612.setMinLines(num6.intValue());
        }
        Integer num7 = this.f68570;
        if (num7 != null) {
            c2612.setInputType(num7.intValue());
        }
        if (this.f68573) {
            c2612.setBracketHighlightEnable(false);
        }
        CharSequence charSequence = this.f68578;
        if (charSequence != null) {
            c2612.m3922(charSequence);
        }
        CharSequence charSequence2 = this.f68584;
        if (charSequence2 != null) {
            c2612.m3923(charSequence2.toString());
        }
        int i = this.f68587;
        if (i == 1) {
            c2612.setSelection(this.f68586, this.f68588);
        } else if (i == 2) {
            c2612.selectAll();
        } else if (i == 3) {
            c2612.selectEnd();
        }
        Boolean bool2 = this.f68583;
        if (bool2 != null) {
            c2612.setReadOnly(bool2.booleanValue());
        }
        ArrayList arrayList = this.f68589;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c2612.addTextChangedListener((PluginEditTextWatcher) it.next());
            }
        }
        if (this.f68574) {
            c2612.requestFocusAndShowIME();
        }
    }

    public C21783(PluginUIBuilder pluginUIBuilder, boolean z) {
        super(pluginUIBuilder);
        this.f32692 = new C23794(z);
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final C9318 mo8086(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C2612(pluginUI, pluginViewGroup);
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final View mo8085(Context context) {
        return new C12096(context);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder text(CharSequence charSequence) {
        this.f68578 = m26929(charSequence);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder text(JSONObject jSONObject) {
        text(jSONObject, null);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder text(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            this.f68578 = str;
            return this;
        }
        this.f68578 = jSONObject.getString(requireId(), str);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder hint(CharSequence charSequence) {
        this.f68584 = m26929(charSequence);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder textSize(float f) {
        this.f68579 = Float.valueOf(f);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder textColor(int i) {
        this.f68576 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder setHintTextColor(int i) {
        this.f68585 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder textStyle(boolean z, boolean z2) {
        if (z && z2) {
            this.f68582 = Typeface.create(Typeface.DEFAULT, 3);
            return this;
        }
        if (z) {
            this.f68582 = Typeface.DEFAULT_BOLD;
            return this;
        }
        if (z2) {
            this.f68582 = Typeface.create(Typeface.DEFAULT, 2);
            return this;
        }
        this.f68582 = Typeface.DEFAULT;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder bold() {
        textStyle(true, false);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder italic() {
        textStyle(false, true);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder typeface(Typeface typeface) {
        this.f68582 = typeface;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder typeface(Typeface typeface, int i) {
        if (i > 0) {
            if (typeface == null) {
                typeface = Typeface.defaultFromStyle(i);
            } else {
                typeface = Typeface.create(typeface, i);
            }
        }
        this.f68582 = typeface;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder singleLine(boolean z) {
        this.f68572 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder lines(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.f68571 = numValueOf;
        this.f68577 = numValueOf;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder minLines(int i) {
        this.f68577 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder maxLines(int i) {
        this.f68571 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder inputType(int i) {
        this.f68570 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder inputTypeMultiline() {
        this.f68570 = 131073;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder inputTypeNumber() {
        this.f68570 = 2;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder maxLength(int i) {
        this.f68575 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder disableBracketHighlight() {
        this.f68573 = true;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginEditTextBuilder background(Drawable drawable) {
        this.f32692 = drawable;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder select(int i) {
        this.f68587 = 1;
        this.f68588 = i;
        this.f68586 = i;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder select(int i, int i2) {
        this.f68587 = 1;
        this.f68586 = i;
        this.f68588 = i2;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder selectAll() {
        this.f68587 = 2;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder selectEnd() {
        this.f68587 = 3;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder syntaxHighlight(String str) {
        this.f68580 = str;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder softWrap(int i) {
        this.f68581 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder readOnly() {
        this.f68583 = Boolean.TRUE;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder readOnly(boolean z) {
        this.f68583 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder addTextChangedListener(PluginEditTextWatcher pluginEditTextWatcher) {
        if (this.f68589 == null) {
            this.f68589 = new ArrayList(1);
        }
        this.f68589.add(pluginEditTextWatcher);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder requestFocusAndShowIME() {
        this.f32687 = true;
        this.f68574 = true;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final boolean isBoxStyle() {
        Drawable drawable = this.f32692;
        return (drawable instanceof C23794) && ((C23794) drawable).f75660;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder
    public final boolean isLineStyle() {
        Drawable drawable = this.f32692;
        return (drawable instanceof C23794) && !((C23794) drawable).f75660;
    }
}
