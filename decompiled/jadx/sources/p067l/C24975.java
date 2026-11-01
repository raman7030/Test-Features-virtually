package p067l;

import android.content.Intent;
import bin.p000mt.plugin.api.p002ui.dialog.PluginDialog;
import bin.p000mt.plugin.api.util.Consumer;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C24975 implements InterfaceC21153, InterfaceC20295, InterfaceC4595, Consumer, InterfaceC14501, InterfaceC8453 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f79747;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f79748;

    public /* synthetic */ C24975(int i, Object obj) {
        this.f79747 = i;
        this.f79748 = obj;
    }

    @Override // bin.p000mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo56319accept(Object obj) {
        ((PluginDialog) this.f79748).setTitle((CharSequence) obj);
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        ((C9633) this.f79748).mo13474(i);
    }

    @Override // p067l.InterfaceC21153
    /* JADX INFO: renamed from: ֫ */
    public void mo6900(Intent intent, int i) {
        C23631.m52489((C23631) this.f79748, i);
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public void mo9171(AbstractC7783 abstractC7783) {
        switch (this.f79747) {
            case 7:
                ((C22004) this.f79748).f69142.mo9171(abstractC7783);
                break;
            default:
                C5473.m12075((C5473) this.f79748, abstractC7783);
                break;
        }
    }

    @Override // p067l.InterfaceC20295
    /* JADX INFO: renamed from: ۧ */
    public void mo8469(AbstractC17043 abstractC17043) throws Throwable {
        C20966.m47300((C18107) this.f79748, abstractC17043);
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo9173() {
        switch (this.f79747) {
        }
        return false;
    }

    @Override // p067l.InterfaceC13831
    /* JADX INFO: renamed from: ֫ */
    public void mo10534(AbstractC17043 abstractC17043) throws IOException {
        C11193 c11193 = (C11193) this.f79748;
        BufferedOutputStream bufferedOutputStreamM38683 = abstractC17043.m38683();
        try {
            c11193.m25828(bufferedOutputStreamM38683);
            bufferedOutputStreamM38683.close();
        } catch (Throwable th) {
            try {
                bufferedOutputStreamM38683.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
