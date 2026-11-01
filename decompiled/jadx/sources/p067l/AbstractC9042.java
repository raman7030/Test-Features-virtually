package p067l;

import android.widget.LinearLayout;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.builder.PluginBaseLinearLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.ۜ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7N9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9042 extends AbstractC17758 implements PluginBaseLinearLayoutBuilder {

    /* JADX INFO: renamed from: ֡ */
    public final int f24543;

    /* JADX INFO: renamed from: ᩵ */
    public Integer f24544;

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final void mo12670(C9318 c9318) {
        C9989 c9989 = (C9989) c9318;
        ((LinearLayout) c9989.m21563()).setOrientation(this.f24543);
        super.mo12670(c9989);
        Integer num = this.f24544;
        if (num != null) {
            c9989.setGravity(num.intValue());
        }
    }

    public AbstractC9042(PluginUIBuilder pluginUIBuilder, PluginUI.Style style, int i) {
        super(pluginUIBuilder, style);
        this.f24543 = i;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseLinearLayoutBuilder
    public PluginUIBuilder gravity(int i) {
        this.f24544 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseLinearLayoutBuilder
    public boolean isHorizontal() {
        return this.f24543 == 0;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseLinearLayoutBuilder
    public boolean isVertical() {
        return this.f24543 == 1;
    }
}
