package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.p002ui.PluginRadioButton;
import bin.p000mt.plugin.api.p002ui.PluginRadioGroup;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.builder.PluginRadioGroupBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;
import bin.p000mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.ۨ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 37MY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13736 extends AbstractC9042 implements PluginRadioGroupBuilder {

    /* JADX INFO: renamed from: ֨ */
    public boolean f38829;

    /* JADX INFO: renamed from: ۚ */
    public boolean f38830;

    /* JADX INFO: renamed from: ۠ */
    public String f38831;

    /* JADX INFO: renamed from: ܶ */
    public int f38832;

    /* JADX INFO: renamed from: ᩸ */
    public PluginRadioGroup.OnCheckedChangeListener f38833;

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedId(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            str = jSONObject.getString(super.requireId(), str);
        }
        check(str);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedPosition(JSONObject jSONObject, int i) {
        if (jSONObject != null) {
            i = jSONObject.getInt(super.requireId(), i);
        }
        check(i);
        return this;
    }

    @Override // p067l.AbstractC9042, bin.p000mt.plugin.api.p002ui.builder.PluginBaseLinearLayoutBuilder
    public final PluginUIBuilder gravity(int i) {
        this.f24544 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder check(String str) {
        this.f38829 = true;
        if (str == null) {
            str = "";
        }
        this.f38831 = str;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedId(JSONObject jSONObject) {
        checkedId(jSONObject, null);
        return this;
    }

    @Override // p067l.AbstractC17758, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewGroupBuilder
    public final PluginUI.Style getChildrenStyle() {
        return this.f53031;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder check(int i) {
        this.f38829 = true;
        this.f38831 = null;
        this.f38832 = i;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedPosition(JSONObject jSONObject) {
        checkedPosition(jSONObject, -1);
        return this;
    }

    @Override // p067l.AbstractC17758, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewGroupBuilder
    public final PluginUIBuilder children(Consumer consumer) {
        consumer.mo56319accept(this.f53030);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder postOnCheckedChanged(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f38830 = false;
        this.f38833 = onCheckedChangeListener;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder onCheckedChanged(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f38830 = true;
        this.f38833 = onCheckedChangeListener;
        return this;
    }

    @Override // p067l.AbstractC17758, p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final C6636 mo26930(PluginUI pluginUI, PluginViewGroup pluginViewGroup, Context context) {
        int i = 0;
        for (AbstractC11725 abstractC11725 : this.f53030.f30606) {
            if (abstractC11725 instanceof C8371) {
                ((C8371) abstractC11725).f22431 = Integer.valueOf(i);
                i++;
            }
        }
        C6636 c6636 = (C6636) super.mo26930(pluginUI, pluginViewGroup, context);
        if (this.f38829) {
            String str = this.f38831;
            if (str != null) {
                c6636.check(str);
            } else {
                c6636.check(this.f38832);
            }
        }
        PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f38833;
        if (onCheckedChangeListener != null) {
            c6636.setOnCheckedChangeListener(onCheckedChangeListener);
            if (this.f38830) {
                PluginRadioButton checkedRadioButton = c6636.getCheckedRadioButton();
                this.f38833.onCheckedChanged(c6636, checkedRadioButton, checkedRadioButton == null ? -1 : ((C23400) checkedRadioButton).getPositionInRadioGroup());
            }
        }
        return c6636;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final String getId() {
        return this.f32690;
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final C9318 mo8086(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C6636(pluginUI, pluginViewGroup);
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final View mo8085(Context context) {
        return new LinearLayout(context);
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder tag(Object obj) {
        this.f32691 = obj;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final Object getTag() {
        return this.f32691;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder width(int i) {
        this.f32695.width = i;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder height(int i) {
        this.f32695.height = i;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutWeight(float f) {
        this.f32695.weight = f;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutGravity(int i) {
        this.f32695.gravity = i;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f32686.set(i, i2, i3, i4);
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i) {
        this.f32686.set(i, i, i, i);
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeft(int i) {
        this.f32686.left = i;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTop(int i) {
        this.f32686.top = i;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRight(int i) {
        this.f32686.right = i;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottom(int i) {
        this.f32686.bottom = i;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeft(int i) {
        this.f32695.leftMargin = i;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTop(int i) {
        this.f32695.topMargin = i;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRight(int i) {
        this.f32695.rightMargin = i;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottom(int i) {
        this.f32695.bottomMargin = i;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder background(Drawable drawable) {
        this.f32692 = drawable;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f32694 = onClickListener;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f32696 = onLongClickListener;
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder enable(boolean z) {
        this.f32693 = Boolean.valueOf(z);
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder alpha(float f) {
        this.f32689 = Float.valueOf(f);
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder requestFocus() {
        this.f32687 = true;
        return this;
    }
}
