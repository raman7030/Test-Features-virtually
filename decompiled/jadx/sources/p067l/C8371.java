package p067l;

import android.content.Context;
import android.view.View;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.builder.PluginRadioButtonBuilder;

/* JADX INFO: renamed from: l.ۛ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D7PL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8371 extends AbstractC25135 implements PluginRadioButtonBuilder {

    /* JADX INFO: renamed from: ۫ */
    public Integer f22431;

    @Override // p067l.AbstractC25135
    /* JADX INFO: renamed from: ֫ */
    public final void mo12670(AbstractC8648 abstractC8648) {
        C23400 c23400 = (C23400) abstractC8648;
        Integer num = this.f22431;
        if (num != null) {
            c23400.m52062(num.intValue());
        }
        super.mo12670((AbstractC8648) c23400);
    }

    @Override // p067l.AbstractC25135, p067l.AbstractC22454, p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final void mo12670(C9318 c9318) {
        C23400 c23400 = (C23400) c9318;
        Integer num = this.f22431;
        if (num != null) {
            c23400.m52062(num.intValue());
        }
        super.mo12670((AbstractC8648) c23400);
    }

    @Override // p067l.AbstractC25135, p067l.AbstractC22454
    /* JADX INFO: renamed from: ֫ */
    public final void mo12670(C12001 c12001) {
        C23400 c23400 = (C23400) c12001;
        Integer num = this.f22431;
        if (num != null) {
            c23400.m52062(num.intValue());
        }
        super.mo12670((AbstractC8648) c23400);
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final C9318 mo8086(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C23400(pluginUI, pluginViewGroup);
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final View mo8085(Context context) {
        return new C1872(context);
    }
}
