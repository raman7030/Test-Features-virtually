package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۢ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 37NY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9844 extends AbstractC16567 implements PluginBaseViewBuilder {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Integer f29732;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f29734;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final PluginUIBuilder f29735;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Float f29736;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f29737;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f29738;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Drawable f29739;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Boolean f29740;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public PluginView.OnClickListener f29741;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PluginView.OnLongClickListener f29743;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public LinearLayout.LayoutParams f29742 = new LinearLayout.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Rect f29733 = new Rect(-1, -1, -1, -1);

    /* JADX INFO: renamed from: ֫ */
    public abstract View mo5875(Context context);

    /* JADX INFO: renamed from: ֫ */
    public abstract C7312 mo5876(PluginUI pluginUI, PluginViewGroup pluginViewGroup);

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthWrapContent() {
        return width(-2);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthMatchParent() {
        return width(-1);
    }

    public AbstractC9844(PluginUIBuilder pluginUIBuilder) {
        this.f29735 = pluginUIBuilder;
        m39073(pluginUIBuilder);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightWrapContent() {
        return height(-2);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightMatchParent() {
        return height(-1);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder sizeDp(float f, float f2) {
        size(C11266.m27878(f), C11266.m27878(f2));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthDp(float f) {
        return width(C11266.m27878(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightDp(float f) {
        return height(C11266.m27878(f));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7312 mo24915(PluginUI pluginUI, PluginViewGroup pluginViewGroup, Context context) {
        C7312 c7312Mo5876 = mo5876(pluginUI, pluginViewGroup);
        View viewMo5875 = mo5875(context);
        c7312Mo5876.mo19598(viewMo5875);
        viewMo5875.setLayoutParams(this.f29742);
        mo10675(c7312Mo5876);
        return c7312Mo5876;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f, float f2, float f3, float f4) {
        return padding(C11266.m27878(f), C11266.m27878(f2), C11266.m27878(f3), C11266.m27878(f4));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f) {
        return padding(C11266.m27878(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeftDp(float f) {
        return paddingLeft(C11266.m27878(f));
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10675(C7312 c7312) {
        String str = this.f29737;
        if (str != null) {
            c7312.m19599(str);
        }
        Object obj = this.f29738;
        if (obj != null) {
            c7312.setTag(obj);
        }
        Drawable drawable = this.f29739;
        if (drawable != null) {
            c7312.setBackground(drawable);
        }
        Rect rect = this.f29733;
        int paddingLeft = rect.left;
        int paddingTop = rect.top;
        int paddingRight = rect.right;
        int paddingBottom = rect.bottom;
        if (paddingLeft != -1 || paddingTop != -1 || paddingRight != -1 || paddingBottom != -1) {
            if (paddingLeft == -1) {
                paddingLeft = c7312.getPaddingLeft();
            }
            if (paddingTop == -1) {
                paddingTop = c7312.getPaddingTop();
            }
            if (paddingRight == -1) {
                paddingRight = c7312.getPaddingRight();
            }
            if (paddingBottom == -1) {
                paddingBottom = c7312.getPaddingBottom();
            }
            c7312.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        PluginView.OnClickListener onClickListener = this.f29741;
        if (onClickListener != null) {
            c7312.setOnClickListener(onClickListener);
        }
        PluginView.OnLongClickListener onLongClickListener = this.f29743;
        if (onLongClickListener != null) {
            c7312.setOnLongClickListener(onLongClickListener);
        }
        Boolean bool = this.f29740;
        if (bool != null) {
            c7312.setEnabled(bool.booleanValue());
        }
        Float f = this.f29736;
        if (f != null) {
            c7312.setAlpha(f.floatValue());
        }
        if (this.f29734) {
            c7312.requestFocus();
        }
        Integer num = this.f29732;
        if (num != null) {
            c7312.setVisibility(num.intValue());
        }
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTopDp(float f) {
        return paddingTop(C11266.m27878(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRightDp(float f) {
        return paddingRight(C11266.m27878(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottomDp(float f) {
        return paddingBottom(C11266.m27878(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingHorizontalDp(float f) {
        paddingHorizontal(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingVerticalDp(float f) {
        paddingVertical(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f, float f2, float f3, float f4) {
        margin(C11266.m27878(f), C11266.m27878(f2), C11266.m27878(f3), C11266.m27878(f4));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f) {
        margin(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeftDp(float f) {
        return marginLeft(C11266.m27878(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTopDp(float f) {
        return marginTop(C11266.m27878(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRightDp(float f) {
        return marginRight(C11266.m27878(f));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m24914(CharSequence charSequence) {
        String stringNullable;
        PluginUI pluginUI = getPluginUI();
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C7416.m19937(1, str) == '}' && (stringNullable = pluginUI.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottomDp(float f) {
        return marginBottom(C11266.m27878(f));
    }

    public String getId() {
        return this.f29737;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginHorizontalDp(float f) {
        marginHorizontal(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public String requireId() {
        String id = getId();
        if (id == null || id.isEmpty()) {
            throw new NullPointerException("Please set the id first");
        }
        return id;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginVerticalDp(float f) {
        marginVertical(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder id(String str) {
        HashSet hashSetM51567;
        if (str == null) {
            throw new NullPointerException("The id cannot be null");
        }
        if (str.isEmpty()) {
            throw new NullPointerException("The id cannot be empty");
        }
        if (getPluginUI().isStrictIdModeEnabled()) {
            String str2 = this.f29737;
            if (!str.equals(str2) && (hashSetM51567 = m24916().m51567()) != null) {
                if (str2 != null) {
                    hashSetM51567.remove(str2);
                }
                if (!hashSetM51567.add(str)) {
                    throw new RuntimeException(C4860.m14172("The id \"", str, " has been used, please use another id or call PluginUI.disableStrictIdMode()"));
                }
            }
        }
        this.f29737 = str;
        return this;
    }

    public PluginUIBuilder tag(Object obj) {
        this.f29738 = obj;
        return this;
    }

    public Object getTag() {
        return this.f29738;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder size(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = this.f29742;
        layoutParams.width = i;
        layoutParams.height = i2;
        return this;
    }

    public PluginUIBuilder width(int i) {
        this.f29742.width = i;
        return this;
    }

    public PluginUIBuilder height(int i) {
        this.f29742.height = i;
        return this;
    }

    public PluginUIBuilder layoutWeight(float f) {
        this.f29742.weight = f;
        return this;
    }

    public PluginUIBuilder layoutGravity(int i) {
        this.f29742.gravity = i;
        return this;
    }

    public PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f29733.set(i, i2, i3, i4);
        return this;
    }

    public PluginUIBuilder padding(int i) {
        this.f29733.set(i, i, i, i);
        return this;
    }

    public PluginUIBuilder paddingLeft(int i) {
        this.f29733.left = i;
        return this;
    }

    public PluginUIBuilder paddingTop(int i) {
        this.f29733.top = i;
        return this;
    }

    public PluginUIBuilder paddingRight(int i) {
        this.f29733.right = i;
        return this;
    }

    public PluginUIBuilder paddingBottom(int i) {
        this.f29733.bottom = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingHorizontal(int i) {
        Rect rect = this.f29733;
        rect.left = i;
        rect.right = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingVertical(int i) {
        Rect rect = this.f29733;
        rect.top = i;
        rect.bottom = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder margin(int i, int i2, int i3, int i4) {
        LinearLayout.LayoutParams layoutParams = this.f29742;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        layoutParams.rightMargin = i3;
        layoutParams.bottomMargin = i4;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder margin(int i) {
        LinearLayout.LayoutParams layoutParams = this.f29742;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i;
        layoutParams.rightMargin = i;
        layoutParams.bottomMargin = i;
        return this;
    }

    public PluginUIBuilder marginLeft(int i) {
        this.f29742.leftMargin = i;
        return this;
    }

    public PluginUIBuilder marginTop(int i) {
        this.f29742.topMargin = i;
        return this;
    }

    public PluginUIBuilder marginRight(int i) {
        this.f29742.rightMargin = i;
        return this;
    }

    public PluginUIBuilder marginBottom(int i) {
        this.f29742.bottomMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginHorizontal(int i) {
        LinearLayout.LayoutParams layoutParams = this.f29742;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginVertical(int i) {
        LinearLayout.LayoutParams layoutParams = this.f29742;
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        return this;
    }

    public PluginUIBuilder background(Drawable drawable) {
        this.f29739 = drawable;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder backgroundColor(int i) {
        Drawable drawable = this.f29739;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(i);
            return this;
        }
        this.f29739 = new ColorDrawable(i);
        return this;
    }

    public PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f29741 = onClickListener;
        return this;
    }

    public PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f29743 = onLongClickListener;
        return this;
    }

    public PluginUIBuilder enable(boolean z) {
        this.f29740 = Boolean.valueOf(z);
        return this;
    }

    public PluginUIBuilder alpha(float f) {
        this.f29736 = Float.valueOf(f);
        return this;
    }

    public PluginUIBuilder requestFocus() {
        this.f29734 = true;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder visible() {
        this.f29732 = 0;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder invisible() {
        this.f29732 = 4;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder gone() {
        this.f29732 = 8;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder unifyWidth(String... strArr) {
        PluginUIBuilder pluginUIBuilder = this.f29735;
        if (pluginUIBuilder instanceof C9138) {
            C9138 c9138 = (C9138) pluginUIBuilder;
            if (c9138.f27667 == null) {
                c9138.f27667 = new ArrayList(1);
            }
            c9138.f27667.add(strArr);
            return this;
        }
        if (pluginUIBuilder instanceof C23248) {
            ((C23248) pluginUIBuilder).m51568unifyWidth(strArr);
            return this;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23248 m24916() {
        PluginUIBuilder pluginUIBuilder = this.f29735;
        if (pluginUIBuilder instanceof C9138) {
            return ((C9138) pluginUIBuilder).f27668.m24916();
        }
        return pluginUIBuilder instanceof C23248 ? (C23248) pluginUIBuilder : ((AbstractC9844) pluginUIBuilder).m24916();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginView build() {
        return this.f29735.build();
    }
}
