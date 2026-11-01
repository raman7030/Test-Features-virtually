package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.builder.PluginFrameLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;
import bin.p000mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.ۙ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V7NH */
/* JADX INFO: loaded from: classes3.dex */
public final class C7030 extends AbstractC17758 implements PluginFrameLayoutBuilder {
    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final C9318 mo8086(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C7307(pluginUI, pluginViewGroup);
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final View mo8085(Context context) {
        return new FrameLayout(context);
    }

    @Override // p067l.AbstractC17758, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewGroupBuilder
    public final PluginUI.Style getChildrenStyle() {
        return this.f53031;
    }

    @Override // p067l.AbstractC17758, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewGroupBuilder
    public final PluginUIBuilder children(Consumer consumer) {
        consumer.mo56319accept(this.f53030);
        return this;
    }

    @Override // p067l.AbstractC11725, bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewBuilder
    public final String getId() {
        return this.f32690;
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
