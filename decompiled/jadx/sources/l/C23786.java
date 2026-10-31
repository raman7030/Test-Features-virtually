package l;

import android.content.Intent;
import bin.mt.plugin.api.ui.dialog.PluginDialog;
import bin.mt.plugin.api.util.Consumer;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C23786 implements InterfaceC19764, InterfaceC18862, InterfaceC2343, Consumer, InterfaceC12766, InterfaceC6403 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76994;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76995;

    public /* synthetic */ C23786(int i, Object obj) {
        this.f76994 = i;
        this.f76995 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo12762accept(Object obj) {
        ((PluginDialog) this.f76995).setTitle((CharSequence) obj);
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        ((C7643) this.f76995).mo11538(i);
    }

    @Override // l.InterfaceC19764
    /* JADX INFO: renamed from: ֫ */
    public void mo4668(Intent intent, int i) {
        C22372.m50149((C22372) this.f76995, i);
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public void mo7076(AbstractC5698 abstractC5698) {
        switch (this.f76994) {
            case 7:
                ((C20661) this.f76995).f66460.mo7076(abstractC5698);
                break;
            default:
                C3267.m10042((C3267) this.f76995, abstractC5698);
                break;
        }
    }

    @Override // l.InterfaceC18862
    /* JADX INFO: renamed from: ۧ */
    public void mo6267(AbstractC15440 abstractC15440) throws Throwable {
        C19568.m45005((C16560) this.f76995, abstractC15440);
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo7078() {
        switch (this.f76994) {
        }
        return false;
    }

    @Override // l.InterfaceC12061
    /* JADX INFO: renamed from: ֫ */
    public void mo8487(AbstractC15440 abstractC15440) throws IOException {
        C9285 c9285 = (C9285) this.f76995;
        BufferedOutputStream bufferedOutputStreamM36525 = abstractC15440.m36525();
        try {
            c9285.m23819(bufferedOutputStreamM36525);
            bufferedOutputStreamM36525.close();
        } catch (Throwable th) {
            try {
                bufferedOutputStreamM36525.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
