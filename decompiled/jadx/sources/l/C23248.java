package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.ui.PluginFrameLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder;
import bin.mt.plugin.api.ui.builder.PluginFrameLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginLinearLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩺᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U7PY */
/* JADX INFO: loaded from: classes2.dex */
public final class C23248 extends AbstractC16567 implements PluginBaseViewBuilder, PluginRootLayoutBuilder {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f74686 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17979 f74687;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Context f74688;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC16192 f74689;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashSet f74690;

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthWrapContent() {
        width(-2);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthMatchParent() {
        width(-1);
        return this;
    }

    public C23248(C17979 c17979, Context context, boolean z, int i) {
        this.f74687 = c17979;
        this.f74688 = context;
        if (z) {
            this.f74689 = new C4904(this, c17979.getStyle());
        } else {
            this.f74689 = new C13370(this, c17979.getStyle(), i);
        }
        C9138 c9138 = this.f74689.f49864;
        c9138.f27665 = this;
        m39073(c9138);
        this.f74689.size(-1, -2);
        c17979.getStyle().dispatch(c17979, this);
        this.f74690 = c17979.isStrictIdModeEnabled() ? new HashSet() : null;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightWrapContent() {
        height(-2);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final /* bridge */ /* synthetic */ PluginUIBuilder unifyWidth(String[] strArr) {
        m51568unifyWidth(strArr);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightMatchParent() {
        height(-1);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder sizeDp(float f, float f2) {
        size(C11266.m27878(f), C11266.m27878(f2));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthDp(float f) {
        width(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightDp(float f) {
        height(C11266.m27878(f));
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet m51567() {
        return this.f74690;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f, float f2, float f3, float f4) {
        padding(C11266.m27878(f), C11266.m27878(f2), C11266.m27878(f3), C11266.m27878(f4));
        return this;
    }

    @Override // l.AbstractC16567, bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginUI getPluginUI() {
        return this.f74687;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f) {
        padding(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginView build() {
        if (!this.f74686.compareAndSet(false, true)) {
            throw new UnsupportedOperationException("Method 'build()' can only be called once");
        }
        C11546 c11546Mo24915 = this.f74689.mo24915((PluginUI) this.f74687, (PluginViewGroup) null, this.f74688);
        c11546Mo24915.m28425();
        return c11546Mo24915;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeftDp(float f) {
        paddingLeft(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTopDp(float f) {
        paddingTop(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder id(String str) {
        this.f74689.id(str);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRightDp(float f) {
        paddingRight(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottomDp(float f) {
        paddingBottom(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final String getId() {
        return this.f74689.getId();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingHorizontalDp(float f) {
        paddingHorizontal(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final String requireId() {
        return this.f74689.requireId();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingVerticalDp(float f) {
        paddingVertical(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder tag(Object obj) {
        this.f74689.tag(obj);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f, float f2, float f3, float f4) {
        margin(C11266.m27878(f), C11266.m27878(f2), C11266.m27878(f3), C11266.m27878(f4));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final Object getTag() {
        return this.f74689.getTag();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f) {
        margin(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder size(int i, int i2) {
        this.f74689.size(i, i2);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeftDp(float f) {
        marginLeft(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTopDp(float f) {
        marginTop(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder width(int i) {
        this.f74689.width(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRightDp(float f) {
        marginRight(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder height(int i) {
        this.f74689.height(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottomDp(float f) {
        marginBottom(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutWeight(float f) {
        this.f74689.layoutWeight(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginHorizontalDp(float f) {
        marginHorizontal(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutGravity(int i) {
        this.f74689.layoutGravity(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginVerticalDp(float f) {
        marginVertical(C11266.m27878(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f74689.padding(i, i2, i3, i4);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i) {
        this.f74689.padding(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeft(int i) {
        this.f74689.paddingLeft(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTop(int i) {
        this.f74689.paddingTop(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRight(int i) {
        this.f74689.paddingRight(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottom(int i) {
        this.f74689.paddingBottom(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingHorizontal(int i) {
        this.f74689.paddingHorizontal(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingVertical(int i) {
        this.f74689.paddingVertical(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder margin(int i, int i2, int i3, int i4) {
        this.f74689.margin(i, i2, i3, i4);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder margin(int i) {
        this.f74689.margin(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeft(int i) {
        this.f74689.marginLeft(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTop(int i) {
        this.f74689.marginTop(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRight(int i) {
        this.f74689.marginRight(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottom(int i) {
        this.f74689.marginBottom(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginHorizontal(int i) {
        this.f74689.marginHorizontal(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginVertical(int i) {
        this.f74689.marginVertical(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder background(Drawable drawable) {
        this.f74689.background(drawable);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder backgroundColor(int i) {
        this.f74689.backgroundColor(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f74689.onClick(onClickListener);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f74689.onLongClick(onLongClickListener);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder enable(boolean z) {
        this.f74689.enable(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder alpha(float f) {
        this.f74689.alpha(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder requestFocus() {
        this.f74689.requestFocus();
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder visible() {
        this.f74689.visible();
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder invisible() {
        this.f74689.invisible();
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder gone() {
        this.f74689.gone();
        return this;
    }

    /* JADX INFO: renamed from: unifyWidth, reason: collision with other method in class */
    public final void m51568unifyWidth(String... strArr) {
        C9138 c9138 = this.f74689.f49864;
        if (c9138.f27667 == null) {
            c9138.f27667 = new ArrayList(1);
        }
        c9138.f27667.add(strArr);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder
    public final boolean isHorizontalLayout() {
        PluginUIBuilder pluginUIBuilder = this.f74689;
        if (pluginUIBuilder instanceof PluginLinearLayoutBuilder) {
            return ((PluginLinearLayoutBuilder) pluginUIBuilder).isHorizontal();
        }
        if (pluginUIBuilder instanceof PluginFrameLayout) {
            return false;
        }
        throw new RuntimeException();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder
    public final boolean isVerticalLayout() {
        PluginUIBuilder pluginUIBuilder = this.f74689;
        if (pluginUIBuilder instanceof PluginLinearLayoutBuilder) {
            return ((PluginLinearLayoutBuilder) pluginUIBuilder).isVertical();
        }
        if (pluginUIBuilder instanceof PluginFrameLayout) {
            return false;
        }
        throw new RuntimeException();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder
    public final boolean isFrameLayout() {
        AbstractC16192 abstractC16192 = this.f74689;
        if (abstractC16192 instanceof PluginFrameLayout) {
            return true;
        }
        if (abstractC16192 instanceof PluginLinearLayoutBuilder) {
            return false;
        }
        throw new RuntimeException();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder
    public final PluginRootLayoutBuilder gravity(int i) {
        PluginUIBuilder pluginUIBuilder = this.f74689;
        if (pluginUIBuilder instanceof PluginLinearLayoutBuilder) {
            ((PluginLinearLayoutBuilder) pluginUIBuilder).gravity(i);
            return this;
        }
        if (pluginUIBuilder instanceof PluginFrameLayoutBuilder) {
            throw new RuntimeException("PluginRootLayoutBuilder using FrameLayout does not support gravity method");
        }
        throw new RuntimeException();
    }
}
