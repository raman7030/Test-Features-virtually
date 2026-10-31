package l;

import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plugin.api.ui.dialog.LoadingDialog;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.ܶ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P44J */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14873 implements InterfaceC15564, InterfaceC20106, InterfaceC18862, Consumer, InterfaceC9167 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45388;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f45389;

    public /* synthetic */ C14873(int i, Object obj) {
        this.f45388 = i;
        this.f45389 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo12762accept(Object obj) {
        LoadingDialog.lambda$new$0((PluginUI) this.f45389, (PluginUIBuilder) obj);
    }

    @Override // l.InterfaceC9167
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void mo16111(AbstractC11347 abstractC11347, int i) {
    }

    @Override // l.InterfaceC9167
    /* JADX INFO: renamed from: ۧ */
    public void mo16112(AbstractC11347 abstractC11347, int i) {
        C19814.m45560((StringBuilder) this.f45389, abstractC11347);
    }

    @Override // l.InterfaceC20106
    /* JADX INFO: renamed from: ֫ */
    public void mo13218(Object obj) {
        switch (this.f45388) {
            case 2:
                ((C11083) this.f45389).m27512((String) obj);
                break;
            default:
                ((RunnableC20699) this.f45389).run();
                break;
        }
    }

    @Override // l.InterfaceC15564
    /* JADX INFO: renamed from: ֫ */
    public boolean mo10274(String str) {
        return ((String) this.f45389).equals(str);
    }

    @Override // l.InterfaceC18862
    /* JADX INFO: renamed from: ۧ */
    public void mo6267(AbstractC15440 abstractC15440) {
        C8699.m22484((C16560) this.f45389, abstractC15440);
    }
}
