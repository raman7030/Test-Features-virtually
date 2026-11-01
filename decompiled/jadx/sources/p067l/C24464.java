package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import bin.p000mt.plugin.api.p002ui.PluginFrameLayout;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginFrameLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginLinearLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginRootLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩺᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U7PY */
/* JADX INFO: loaded from: classes2.dex */
public final class C24464 extends AbstractC18114 implements PluginBaseViewBuilder, PluginRootLayoutBuilder {

    /* JADX INFO: renamed from: ۧ */
    public final AtomicBoolean f77429 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ܳ */
    public final C19456 f77430;

    /* JADX INFO: renamed from: ܽ */
    public final Context f77431;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC17758 f77432;

    /* JADX INFO: renamed from: ᩳ */
    public final HashSet f77433;

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthWrapContent() {
        width(-2);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthMatchParent() {
        width(-1);
        return this;
    }

    public C24464(C19456 c19456, Context context, boolean z, int i) {
        this.f77430 = c19456;
        this.f77431 = context;
        if (z) {
            this.f77432 = new C7030(this, c19456.getStyle());
        } else {
            this.f77432 = new C15076(this, c19456.getStyle(), i);
        }
        C11054 c11054 = this.f77432.f53030;
        c11054.f30605 = this;
        m41299(c11054);
        this.f77432.size(-1, -2);
        c19456.getStyle().dispatch(c19456, this);
        this.f77433 = c19456.isStrictIdModeEnabled() ? new HashSet() : null;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightWrapContent() {
        height(-2);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final /* bridge */ /* synthetic */ PluginUIBuilder unifyWidth(String[] strArr) {
        m56600unifyWidth(strArr);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightMatchParent() {
        height(-1);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder sizeDp(float f, float f2) {
        size(C13076.m29939(f), C13076.m29939(f2));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthDp(float f) {
        width(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightDp(float f) {
        height(C13076.m29939(f));
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final HashSet m53964() {
        return this.f77433;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f, float f2, float f3, float f4) {
        padding(C13076.m29939(f), C13076.m29939(f2), C13076.m29939(f3), C13076.m29939(f4));
        return this;
    }

    @Override // p067l.AbstractC18114, bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginUI getPluginUI() {
        return this.f77430;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f) {
        padding(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginView build() {
        if (!this.f77429.compareAndSet(false, true)) {
            throw new UnsupportedOperationException("Method 'build()' can only be called once");
        }
        C13342 c13342Mo26930 = this.f77432.mo26930((PluginUI) this.f77430, (PluginViewGroup) null, this.f77431);
        c13342Mo26930.m30471();
        return c13342Mo26930;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeftDp(float f) {
        paddingLeft(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTopDp(float f) {
        paddingTop(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    /* JADX INFO: renamed from: id */
    public final PluginUIBuilder mo52id(String str) {
        this.f77432.mo52id(str);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRightDp(float f) {
        paddingRight(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottomDp(float f) {
        paddingBottom(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final String getId() {
        return this.f77432.getId();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingHorizontalDp(float f) {
        paddingHorizontal(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final String requireId() {
        return this.f77432.requireId();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingVerticalDp(float f) {
        paddingVertical(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder tag(Object obj) {
        this.f77432.tag(obj);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f, float f2, float f3, float f4) {
        margin(C13076.m29939(f), C13076.m29939(f2), C13076.m29939(f3), C13076.m29939(f4));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final Object getTag() {
        return this.f77432.getTag();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f) {
        margin(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder size(int i, int i2) {
        this.f77432.size(i, i2);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeftDp(float f) {
        marginLeft(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTopDp(float f) {
        marginTop(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder width(int i) {
        this.f77432.width(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRightDp(float f) {
        marginRight(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder height(int i) {
        this.f77432.height(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottomDp(float f) {
        marginBottom(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutWeight(float f) {
        this.f77432.layoutWeight(f);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginHorizontalDp(float f) {
        marginHorizontal(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutGravity(int i) {
        this.f77432.layoutGravity(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginVerticalDp(float f) {
        marginVertical(C13076.m29939(f));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f77432.padding(i, i2, i3, i4);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i) {
        this.f77432.padding(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeft(int i) {
        this.f77432.paddingLeft(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTop(int i) {
        this.f77432.paddingTop(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRight(int i) {
        this.f77432.paddingRight(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottom(int i) {
        this.f77432.paddingBottom(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingHorizontal(int i) {
        this.f77432.paddingHorizontal(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingVertical(int i) {
        this.f77432.paddingVertical(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder margin(int i, int i2, int i3, int i4) {
        this.f77432.margin(i, i2, i3, i4);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder margin(int i) {
        this.f77432.margin(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeft(int i) {
        this.f77432.marginLeft(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTop(int i) {
        this.f77432.marginTop(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRight(int i) {
        this.f77432.marginRight(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottom(int i) {
        this.f77432.marginBottom(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginHorizontal(int i) {
        this.f77432.marginHorizontal(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginVertical(int i) {
        this.f77432.marginVertical(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder background(Drawable drawable) {
        this.f77432.background(drawable);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder backgroundColor(int i) {
        this.f77432.backgroundColor(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f77432.onClick(onClickListener);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f77432.onLongClick(onLongClickListener);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder enable(boolean z) {
        this.f77432.enable(z);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder alpha(float f) {
        this.f77432.alpha(f);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder requestFocus() {
        this.f77432.requestFocus();
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder visible() {
        this.f77432.visible();
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder invisible() {
        this.f77432.invisible();
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder gone() {
        this.f77432.gone();
        return this;
    }

    /* JADX INFO: renamed from: unifyWidth, reason: collision with other method in class */
    public final void m56600unifyWidth(String... strArr) {
        C11054 c11054 = this.f77432.f53030;
        if (c11054.f30607 == null) {
            c11054.f30607 = new ArrayList(1);
        }
        c11054.f30607.add(strArr);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginRootLayoutBuilder
    public final boolean isHorizontalLayout() {
        PluginUIBuilder pluginUIBuilder = this.f77432;
        if (pluginUIBuilder instanceof PluginLinearLayoutBuilder) {
            return ((PluginLinearLayoutBuilder) pluginUIBuilder).isHorizontal();
        }
        if (pluginUIBuilder instanceof PluginFrameLayout) {
            return false;
        }
        throw new RuntimeException();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginRootLayoutBuilder
    public final boolean isVerticalLayout() {
        PluginUIBuilder pluginUIBuilder = this.f77432;
        if (pluginUIBuilder instanceof PluginLinearLayoutBuilder) {
            return ((PluginLinearLayoutBuilder) pluginUIBuilder).isVertical();
        }
        if (pluginUIBuilder instanceof PluginFrameLayout) {
            return false;
        }
        throw new RuntimeException();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginRootLayoutBuilder
    public final boolean isFrameLayout() {
        AbstractC17758 abstractC17758 = this.f77432;
        if (abstractC17758 instanceof PluginFrameLayout) {
            return true;
        }
        if (abstractC17758 instanceof PluginLinearLayoutBuilder) {
            return false;
        }
        throw new RuntimeException();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginRootLayoutBuilder
    public final PluginRootLayoutBuilder gravity(int i) {
        PluginUIBuilder pluginUIBuilder = this.f77432;
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
