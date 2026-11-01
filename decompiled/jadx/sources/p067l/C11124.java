package p067l;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.ۡ᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes3.dex */
public final class C11124 implements InterfaceC20028 {

    /* JADX INFO: renamed from: ֫ */
    public C11996 f30845 = new C11996();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C17828 f30846;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C12828 f30847;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C8545 f30848;

    public C11124(C17828 c17828, C8545 c8545, C12828 c12828) {
        this.f30846 = c17828;
        this.f30848 = c8545;
        this.f30847 = c12828;
    }

    @Override // p067l.InterfaceC20028
    /* JADX INFO: renamed from: ۧ */
    public final void mo11541() {
        C11996 c11996 = this.f30845;
        c11996.writeInt(1382253411);
        c11996.m27445(this.f30846.f53193);
        this.f30848.m19926(c11996);
    }

    @Override // p067l.InterfaceC20028
    /* JADX INFO: renamed from: ֫ */
    public final void mo11540() {
        try {
            this.f30847.m29400();
            synchronized (this.f30846) {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(this.f30847.m29402().mo25506(false));
                try {
                    gZIPOutputStream.write(this.f30845.m27458(), 0, this.f30845.size());
                    gZIPOutputStream.close();
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException e) {
            this.f30846.f53198.m13320((Throwable) e);
        }
    }
}
