package l;

import android.content.Context;
import android.view.View;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginRadioButtonBuilder;

/* JADX INFO: renamed from: l.ۛ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D7PL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6315 extends AbstractC23954 implements PluginRadioButtonBuilder {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Integer f19560;

    @Override // l.AbstractC23954
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10675(AbstractC6607 abstractC6607) {
        C22129 c22129 = (C22129) abstractC6607;
        Integer num = this.f19560;
        if (num != null) {
            c22129.m49724(num.intValue());
        }
        super.mo10675((AbstractC6607) c22129);
    }

    @Override // l.AbstractC23954, l.AbstractC21133, l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final void mo10675(C7312 c7312) {
        C22129 c22129 = (C22129) c7312;
        Integer num = this.f19560;
        if (num != null) {
            c22129.m49724(num.intValue());
        }
        super.mo10675((AbstractC6607) c22129);
    }

    @Override // l.AbstractC23954, l.AbstractC21133
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10675(C10135 c10135) {
        C22129 c22129 = (C22129) c10135;
        Integer num = this.f19560;
        if (num != null) {
            c22129.m49724(num.intValue());
        }
        super.mo10675((AbstractC6607) c22129);
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final C7312 mo5876(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C22129(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final View mo5875(Context context) {
        return new C20762(context);
    }
}
