package p067l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۢ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 37NY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11725 extends AbstractC18114 implements PluginBaseViewBuilder {

    /* JADX INFO: renamed from: ۖ */
    public Integer f32685;

    /* JADX INFO: renamed from: ۡ */
    public boolean f32687;

    /* JADX INFO: renamed from: ۢ */
    public final PluginUIBuilder f32688;

    /* JADX INFO: renamed from: ۧ */
    public Float f32689;

    /* JADX INFO: renamed from: ܳ */
    public String f32690;

    /* JADX INFO: renamed from: ܺ */
    public Object f32691;

    /* JADX INFO: renamed from: ܽ */
    public Drawable f32692;

    /* JADX INFO: renamed from: ܿ */
    public Boolean f32693;

    /* JADX INFO: renamed from: ᩳ */
    public PluginView.OnClickListener f32694;

    /* JADX INFO: renamed from: ᩻ */
    public PluginView.OnLongClickListener f32696;

    /* JADX INFO: renamed from: ᩷ */
    public LinearLayout.LayoutParams f32695 = new LinearLayout.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: ۜ */
    public Rect f32686 = new Rect(-1, -1, -1, -1);

    /* JADX INFO: renamed from: ֫ */
    public abstract View mo8085(Context context);

    /* JADX INFO: renamed from: ֫ */
    public abstract C9318 mo8086(PluginUI pluginUI, PluginViewGroup pluginViewGroup);

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthWrapContent() {
        return width(-2);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthMatchParent() {
        return width(-1);
    }

    public AbstractC11725(PluginUIBuilder pluginUIBuilder) {
        this.f32688 = pluginUIBuilder;
        m41299(pluginUIBuilder);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightWrapContent() {
        return height(-2);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightMatchParent() {
        return height(-1);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder sizeDp(float f, float f2) {
        size(C13076.m29939(f), C13076.m29939(f2));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthDp(float f) {
        return width(C13076.m29939(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightDp(float f) {
        return height(C13076.m29939(f));
    }

    /* JADX INFO: renamed from: ֫ */
    public C9318 mo26930(PluginUI pluginUI, PluginViewGroup pluginViewGroup, Context context) {
        C9318 c9318Mo8086 = mo8086(pluginUI, pluginViewGroup);
        View viewMo8085 = mo8085(context);
        c9318Mo8086.mo21566(viewMo8085);
        viewMo8085.setLayoutParams(this.f32695);
        mo12670(c9318Mo8086);
        return c9318Mo8086;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f, float f2, float f3, float f4) {
        return padding(C13076.m29939(f), C13076.m29939(f2), C13076.m29939(f3), C13076.m29939(f4));
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f) {
        return padding(C13076.m29939(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeftDp(float f) {
        return paddingLeft(C13076.m29939(f));
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo12670(C9318 c9318) {
        String str = this.f32690;
        if (str != null) {
            c9318.m21567(str);
        }
        Object obj = this.f32691;
        if (obj != null) {
            c9318.setTag(obj);
        }
        Drawable drawable = this.f32692;
        if (drawable != null) {
            c9318.setBackground(drawable);
        }
        Rect rect = this.f32686;
        int paddingLeft = rect.left;
        int paddingTop = rect.top;
        int paddingRight = rect.right;
        int paddingBottom = rect.bottom;
        if (paddingLeft != -1 || paddingTop != -1 || paddingRight != -1 || paddingBottom != -1) {
            if (paddingLeft == -1) {
                paddingLeft = c9318.getPaddingLeft();
            }
            if (paddingTop == -1) {
                paddingTop = c9318.getPaddingTop();
            }
            if (paddingRight == -1) {
                paddingRight = c9318.getPaddingRight();
            }
            if (paddingBottom == -1) {
                paddingBottom = c9318.getPaddingBottom();
            }
            c9318.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        PluginView.OnClickListener onClickListener = this.f32694;
        if (onClickListener != null) {
            c9318.setOnClickListener(onClickListener);
        }
        PluginView.OnLongClickListener onLongClickListener = this.f32696;
        if (onLongClickListener != null) {
            c9318.setOnLongClickListener(onLongClickListener);
        }
        Boolean bool = this.f32693;
        if (bool != null) {
            c9318.setEnabled(bool.booleanValue());
        }
        Float f = this.f32689;
        if (f != null) {
            c9318.setAlpha(f.floatValue());
        }
        if (this.f32687) {
            c9318.requestFocus();
        }
        Integer num = this.f32685;
        if (num != null) {
            c9318.setVisibility(num.intValue());
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTopDp(float f) {
        return paddingTop(C13076.m29939(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRightDp(float f) {
        return paddingRight(C13076.m29939(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottomDp(float f) {
        return paddingBottom(C13076.m29939(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingHorizontalDp(float f) {
        paddingHorizontal(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingVerticalDp(float f) {
        paddingVertical(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f, float f2, float f3, float f4) {
        margin(C13076.m29939(f), C13076.m29939(f2), C13076.m29939(f3), C13076.m29939(f4));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f) {
        margin(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeftDp(float f) {
        return marginLeft(C13076.m29939(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTopDp(float f) {
        return marginTop(C13076.m29939(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRightDp(float f) {
        return marginRight(C13076.m29939(f));
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m26929(CharSequence charSequence) {
        String stringNullable;
        PluginUI pluginUI = getPluginUI();
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C9417.m21911(1, str) == '}' && (stringNullable = pluginUI.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottomDp(float f) {
        return marginBottom(C13076.m29939(f));
    }

    public String getId() {
        return this.f32690;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginHorizontalDp(float f) {
        marginHorizontal(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public String requireId() {
        String id = getId();
        if (id == null || id.isEmpty()) {
            throw new NullPointerException("Please set the id first");
        }
        return id;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginVerticalDp(float f) {
        marginVertical(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    /* JADX INFO: renamed from: id */
    public PluginUIBuilder mo52id(String str) {
        HashSet hashSetM53964;
        if (str == null) {
            throw new NullPointerException("The id cannot be null");
        }
        if (str.isEmpty()) {
            throw new NullPointerException("The id cannot be empty");
        }
        if (getPluginUI().isStrictIdModeEnabled()) {
            String str2 = this.f32690;
            if (!str.equals(str2) && (hashSetM53964 = m26931().m53964()) != null) {
                if (str2 != null) {
                    hashSetM53964.remove(str2);
                }
                if (!hashSetM53964.add(str)) {
                    throw new RuntimeException(C6988.m16053("The id \"", str, " has been used, please use another id or call PluginUI.disableStrictIdMode()"));
                }
            }
        }
        this.f32690 = str;
        return this;
    }

    public PluginUIBuilder tag(Object obj) {
        this.f32691 = obj;
        return this;
    }

    public Object getTag() {
        return this.f32691;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder size(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = this.f32695;
        layoutParams.width = i;
        layoutParams.height = i2;
        return this;
    }

    public PluginUIBuilder width(int i) {
        this.f32695.width = i;
        return this;
    }

    public PluginUIBuilder height(int i) {
        this.f32695.height = i;
        return this;
    }

    public PluginUIBuilder layoutWeight(float f) {
        this.f32695.weight = f;
        return this;
    }

    public PluginUIBuilder layoutGravity(int i) {
        this.f32695.gravity = i;
        return this;
    }

    public PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f32686.set(i, i2, i3, i4);
        return this;
    }

    public PluginUIBuilder padding(int i) {
        this.f32686.set(i, i, i, i);
        return this;
    }

    public PluginUIBuilder paddingLeft(int i) {
        this.f32686.left = i;
        return this;
    }

    public PluginUIBuilder paddingTop(int i) {
        this.f32686.top = i;
        return this;
    }

    public PluginUIBuilder paddingRight(int i) {
        this.f32686.right = i;
        return this;
    }

    public PluginUIBuilder paddingBottom(int i) {
        this.f32686.bottom = i;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingHorizontal(int i) {
        Rect rect = this.f32686;
        rect.left = i;
        rect.right = i;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingVertical(int i) {
        Rect rect = this.f32686;
        rect.top = i;
        rect.bottom = i;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder margin(int i, int i2, int i3, int i4) {
        LinearLayout.LayoutParams layoutParams = this.f32695;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        layoutParams.rightMargin = i3;
        layoutParams.bottomMargin = i4;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder margin(int i) {
        LinearLayout.LayoutParams layoutParams = this.f32695;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i;
        layoutParams.rightMargin = i;
        layoutParams.bottomMargin = i;
        return this;
    }

    public PluginUIBuilder marginLeft(int i) {
        this.f32695.leftMargin = i;
        return this;
    }

    public PluginUIBuilder marginTop(int i) {
        this.f32695.topMargin = i;
        return this;
    }

    public PluginUIBuilder marginRight(int i) {
        this.f32695.rightMargin = i;
        return this;
    }

    public PluginUIBuilder marginBottom(int i) {
        this.f32695.bottomMargin = i;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginHorizontal(int i) {
        LinearLayout.LayoutParams layoutParams = this.f32695;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginVertical(int i) {
        LinearLayout.LayoutParams layoutParams = this.f32695;
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        return this;
    }

    public PluginUIBuilder background(Drawable drawable) {
        this.f32692 = drawable;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder backgroundColor(int i) {
        Drawable drawable = this.f32692;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(i);
            return this;
        }
        this.f32692 = new ColorDrawable(i);
        return this;
    }

    public PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f32694 = onClickListener;
        return this;
    }

    public PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f32696 = onLongClickListener;
        return this;
    }

    public PluginUIBuilder enable(boolean z) {
        this.f32693 = Boolean.valueOf(z);
        return this;
    }

    public PluginUIBuilder alpha(float f) {
        this.f32689 = Float.valueOf(f);
        return this;
    }

    public PluginUIBuilder requestFocus() {
        this.f32687 = true;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder visible() {
        this.f32685 = 0;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder invisible() {
        this.f32685 = 4;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder gone() {
        this.f32685 = 8;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder unifyWidth(String... strArr) {
        PluginUIBuilder pluginUIBuilder = this.f32688;
        if (pluginUIBuilder instanceof C11054) {
            C11054 c11054 = (C11054) pluginUIBuilder;
            if (c11054.f30607 == null) {
                c11054.f30607 = new ArrayList(1);
            }
            c11054.f30607.add(strArr);
            return this;
        }
        if (pluginUIBuilder instanceof C24464) {
            ((C24464) pluginUIBuilder).m56600unifyWidth(strArr);
            return this;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24464 m26931() {
        PluginUIBuilder pluginUIBuilder = this.f32688;
        if (pluginUIBuilder instanceof C11054) {
            return ((C11054) pluginUIBuilder).f30608.m26931();
        }
        return pluginUIBuilder instanceof C24464 ? (C24464) pluginUIBuilder : ((AbstractC11725) pluginUIBuilder).m26931();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginView build() {
        return this.f32688.build();
    }
}
