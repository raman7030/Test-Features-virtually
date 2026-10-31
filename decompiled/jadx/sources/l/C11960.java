package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginRadioButton;
import bin.mt.plugin.api.ui.PluginRadioGroup;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.ۨ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 37MY */
/* JADX INFO: loaded from: classes4.dex */
public final class C11960 extends AbstractC7021 implements PluginRadioGroupBuilder {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f35819;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f35820;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f35821;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f35822;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public PluginRadioGroup.OnCheckedChangeListener f35823;

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedId(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            str = jSONObject.getString(super.requireId(), str);
        }
        check(str);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedPosition(JSONObject jSONObject, int i) {
        if (jSONObject != null) {
            i = jSONObject.getInt(super.requireId(), i);
        }
        check(i);
        return this;
    }

    @Override // l.AbstractC7021, bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder
    public final PluginUIBuilder gravity(int i) {
        this.f21663 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder check(String str) {
        this.f35819 = true;
        if (str == null) {
            str = "";
        }
        this.f35821 = str;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedId(JSONObject jSONObject) {
        checkedId(jSONObject, null);
        return this;
    }

    @Override // l.AbstractC16192, bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public final PluginUI.Style getChildrenStyle() {
        return this.f49865;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder check(int i) {
        this.f35819 = true;
        this.f35821 = null;
        this.f35822 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedPosition(JSONObject jSONObject) {
        checkedPosition(jSONObject, -1);
        return this;
    }

    @Override // l.AbstractC16192, bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public final PluginUIBuilder children(Consumer consumer) {
        consumer.mo12762accept(this.f49864);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder postOnCheckedChanged(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f35820 = false;
        this.f35823 = onCheckedChangeListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder onCheckedChanged(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f35820 = true;
        this.f35823 = onCheckedChangeListener;
        return this;
    }

    @Override // l.AbstractC16192, l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final C4490 mo24915(PluginUI pluginUI, PluginViewGroup pluginViewGroup, Context context) {
        int i = 0;
        for (AbstractC9844 abstractC9844 : this.f49864.f27666) {
            if (abstractC9844 instanceof C6315) {
                ((C6315) abstractC9844).f19560 = Integer.valueOf(i);
                i++;
            }
        }
        C4490 c4490 = (C4490) super.mo24915(pluginUI, pluginViewGroup, context);
        if (this.f35819) {
            String str = this.f35821;
            if (str != null) {
                c4490.check(str);
            } else {
                c4490.check(this.f35822);
            }
        }
        PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f35823;
        if (onCheckedChangeListener != null) {
            c4490.setOnCheckedChangeListener(onCheckedChangeListener);
            if (this.f35820) {
                PluginRadioButton checkedRadioButton = c4490.getCheckedRadioButton();
                this.f35823.onCheckedChanged(c4490, checkedRadioButton, checkedRadioButton == null ? -1 : ((C22129) checkedRadioButton).getPositionInRadioGroup());
            }
        }
        return c4490;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final String getId() {
        return this.f29737;
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final C7312 mo5876(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C4490(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final View mo5875(Context context) {
        return new LinearLayout(context);
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder tag(Object obj) {
        this.f29738 = obj;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final Object getTag() {
        return this.f29738;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder width(int i) {
        this.f29742.width = i;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder height(int i) {
        this.f29742.height = i;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutWeight(float f) {
        this.f29742.weight = f;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutGravity(int i) {
        this.f29742.gravity = i;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f29733.set(i, i2, i3, i4);
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i) {
        this.f29733.set(i, i, i, i);
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeft(int i) {
        this.f29733.left = i;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTop(int i) {
        this.f29733.top = i;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRight(int i) {
        this.f29733.right = i;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottom(int i) {
        this.f29733.bottom = i;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeft(int i) {
        this.f29742.leftMargin = i;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTop(int i) {
        this.f29742.topMargin = i;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRight(int i) {
        this.f29742.rightMargin = i;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottom(int i) {
        this.f29742.bottomMargin = i;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder background(Drawable drawable) {
        this.f29739 = drawable;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f29741 = onClickListener;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f29743 = onLongClickListener;
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder enable(boolean z) {
        this.f29740 = Boolean.valueOf(z);
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder alpha(float f) {
        this.f29736 = Float.valueOf(f);
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder requestFocus() {
        this.f29734 = true;
        return this;
    }
}
