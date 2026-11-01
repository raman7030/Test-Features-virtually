package p067l;

import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;
import bin.p000mt.plugin.api.p002ui.dialog.LoadingDialog;
import bin.p000mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.ܶ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P44J */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16503 implements InterfaceC17161, InterfaceC21477, InterfaceC20295, Consumer, InterfaceC11081 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f48503;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f48504;

    public /* synthetic */ C16503(int i, Object obj) {
        this.f48503 = i;
        this.f48504 = obj;
    }

    @Override // bin.p000mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo56319accept(Object obj) {
        LoadingDialog.lambda$new$0((PluginUI) this.f48504, (PluginUIBuilder) obj);
    }

    @Override // p067l.InterfaceC11081
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void mo18030(AbstractC13152 abstractC13152, int i) {
    }

    @Override // p067l.InterfaceC11081
    /* JADX INFO: renamed from: ۧ */
    public void mo18031(AbstractC13152 abstractC13152, int i) {
        C21199.m47871((StringBuilder) this.f48504, abstractC13152);
    }

    @Override // p067l.InterfaceC21477
    /* JADX INFO: renamed from: ֫ */
    public void mo15100(Object obj) {
        switch (this.f48503) {
            case 2:
                ((C12902) this.f48504).m29574((String) obj);
                break;
            default:
                ((RunnableC22041) this.f48504).run();
                break;
        }
    }

    @Override // p067l.InterfaceC17161
    /* JADX INFO: renamed from: ֫ */
    public boolean mo12311(String str) {
        return ((String) this.f48504).equals(str);
    }

    @Override // p067l.InterfaceC20295
    /* JADX INFO: renamed from: ۧ */
    public void mo8469(AbstractC17043 abstractC17043) {
        C10636.m24453((C18107) this.f48504, abstractC17043);
    }
}
