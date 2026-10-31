package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginFrameLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.ۙ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V7NH */
/* JADX INFO: loaded from: classes3.dex */
public final class C4904 extends AbstractC16192 implements PluginFrameLayoutBuilder {
    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final C7312 mo5876(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C5196(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final View mo5875(Context context) {
        return new FrameLayout(context);
    }

    @Override // l.AbstractC16192, bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public final PluginUI.Style getChildrenStyle() {
        return this.f49865;
    }

    @Override // l.AbstractC16192, bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public final PluginUIBuilder children(Consumer consumer) {
        consumer.mo12762accept(this.f49864);
        return this;
    }

    @Override // l.AbstractC9844, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final String getId() {
        return this.f29737;
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
