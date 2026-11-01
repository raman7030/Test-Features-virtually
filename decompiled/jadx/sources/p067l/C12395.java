package p067l;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import bin.p000mt.plugin.api.p002ui.PluginProgressBar;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.builder.PluginProgressBarBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.ۤ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 97PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12395 extends AbstractC11725 implements PluginProgressBarBuilder {

    /* JADX INFO: renamed from: ֡ */
    public int f34637;

    /* JADX INFO: renamed from: ۘ */
    public boolean f34638;

    /* JADX INFO: renamed from: ۚ */
    public PluginProgressBar.Style f34639;

    /* JADX INFO: renamed from: ᩴ */
    public int f34640;

    /* JADX INFO: renamed from: ᩵ */
    public int f34641;

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final void mo12670(C9318 c9318) {
        C16693 c16693 = (C16693) c9318;
        super.mo12670(c16693);
        if (this.f34639 == PluginProgressBar.Style.HORIZONTAL) {
            c16693.setMaxProgress(this.f34640);
            c16693.setProgress(this.f34641);
            c16693.setSecondaryProgress(this.f34637);
            c16693.setIndeterminate(this.f34638);
        }
    }

    public C12395(PluginUIBuilder pluginUIBuilder) {
        super(pluginUIBuilder);
        this.f34641 = 0;
        this.f34637 = 0;
        this.f34640 = 100;
        this.f34638 = false;
        this.f34639 = PluginProgressBar.Style.HORIZONTAL;
        this.f32695.width = -1;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder style(PluginProgressBar.Style style) {
        this.f34639 = style;
        PluginProgressBar.Style style2 = PluginProgressBar.Style.HORIZONTAL;
        LinearLayout.LayoutParams layoutParams = this.f32695;
        if (style == style2) {
            if (layoutParams.width == -2) {
                layoutParams.width = -1;
                return this;
            }
        } else if (layoutParams.width == -1) {
            layoutParams.width = -2;
        }
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder progress(int i) {
        this.f34641 = i;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder secondaryProgress(int i) {
        this.f34637 = i;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder maxProgress(int i) {
        this.f34640 = i;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder indeterminate(boolean z) {
        this.f34638 = z;
        return this;
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final C9318 mo8086(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C16693(pluginUI, pluginViewGroup, this.f34639);
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final View mo8085(Context context) {
        int i;
        int i2 = C14406.f41205[this.f34639.ordinal()];
        if (i2 == 1) {
            i = R.attr.progressBarStyleHorizontal;
        } else if (i2 == 2) {
            i = R.attr.progressBarStyle;
        } else if (i2 == 3) {
            i = R.attr.progressBarStyleSmall;
        } else {
            if (i2 != 4) {
                throw new IncompatibleClassChangeError();
            }
            i = R.attr.progressBarStyleLarge;
        }
        return new ProgressBar(context, null, i);
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
