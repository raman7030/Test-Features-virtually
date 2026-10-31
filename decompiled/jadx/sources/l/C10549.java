package l;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import bin.mt.plugin.api.ui.PluginProgressBar;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.ۤ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 97PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C10549 extends AbstractC9844 implements PluginProgressBarBuilder {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f31673;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f31674;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public PluginProgressBar.Style f31675;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f31676;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f31677;

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final void mo10675(C7312 c7312) {
        C15072 c15072 = (C15072) c7312;
        super.mo10675(c15072);
        if (this.f31675 == PluginProgressBar.Style.HORIZONTAL) {
            c15072.setMaxProgress(this.f31676);
            c15072.setProgress(this.f31677);
            c15072.setSecondaryProgress(this.f31673);
            c15072.setIndeterminate(this.f31674);
        }
    }

    public C10549(PluginUIBuilder pluginUIBuilder) {
        super(pluginUIBuilder);
        this.f31677 = 0;
        this.f31673 = 0;
        this.f31676 = 100;
        this.f31674 = false;
        this.f31675 = PluginProgressBar.Style.HORIZONTAL;
        this.f29742.width = -1;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder style(PluginProgressBar.Style style) {
        this.f31675 = style;
        PluginProgressBar.Style style2 = PluginProgressBar.Style.HORIZONTAL;
        LinearLayout.LayoutParams layoutParams = this.f29742;
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

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder progress(int i) {
        this.f31677 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder secondaryProgress(int i) {
        this.f31673 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder maxProgress(int i) {
        this.f31676 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder indeterminate(boolean z) {
        this.f31674 = z;
        return this;
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final C7312 mo5876(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C15072(pluginUI, pluginViewGroup, this.f31675);
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final View mo5875(Context context) {
        int i;
        int i2 = C12665.f38178[this.f31675.ordinal()];
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
