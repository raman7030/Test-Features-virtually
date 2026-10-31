package l;

import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.ۜ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7N9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7021 extends AbstractC16192 implements PluginBaseLinearLayoutBuilder {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f21662;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Integer f21663;

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final void mo10675(C7312 c7312) {
        C8018 c8018 = (C8018) c7312;
        ((LinearLayout) c8018.m19595()).setOrientation(this.f21662);
        super.mo10675(c8018);
        Integer num = this.f21663;
        if (num != null) {
            c8018.setGravity(num.intValue());
        }
    }

    public AbstractC7021(PluginUIBuilder pluginUIBuilder, PluginUI.Style style, int i) {
        super(pluginUIBuilder, style);
        this.f21662 = i;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder
    public PluginUIBuilder gravity(int i) {
        this.f21663 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder
    public boolean isHorizontal() {
        return this.f21662 == 0;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder
    public boolean isVertical() {
        return this.f21662 == 1;
    }
}
