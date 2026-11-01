package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N989 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC22410 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8998 f70688;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 f70689;

    /* JADX INFO: renamed from: ֫ */
    public abstract long mo9134();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9135(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9136(long j);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo9137();

    public AbstractC22410(AbstractC17043 abstractC17043, InterfaceC8998 interfaceC8998) {
        this.f70689 = abstractC17043;
        this.f70688 = interfaceC8998;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035 A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:17:0x002b, B:19:0x0035, B:21:0x003b, B:24:0x0044, B:25:0x0047), top: B:35:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:17:0x002b, B:19:0x0035, B:21:0x003b, B:24:0x0044, B:25:0x0047), top: B:35:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:17:0x002b, B:19:0x0035, B:21:0x003b, B:24:0x0044, B:25:0x0047), top: B:35:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX INFO: renamed from: ܽ */
    public final void m50314() {
        int iMo9137;
        long jMo9134;
        AbstractC17043 abstractC17043 = this.f70689;
        InterfaceC8998 interfaceC8998 = this.f70688;
        try {
            interfaceC8998.mo4911(abstractC17043, 0);
        } catch (IOException e) {
            if (!abstractC17043.mo25094() || !interfaceC8998.mo4912(e)) {
                throw e;
            }
            try {
                iMo9137 = mo9137();
                int i = iMo9137 | 146;
                if (iMo9137 != i) {
                    try {
                        mo9135(i);
                        interfaceC8998.mo4911(abstractC17043, 1);
                        mo9135(iMo9137);
                        return;
                    } catch (IOException unused) {
                        jMo9134 = mo9134();
                        if (abstractC17043.mo29990()) {
                            throw e;
                        }
                        interfaceC8998.mo4911(abstractC17043, 2);
                        if (iMo9137 != -1) {
                            mo9135(iMo9137);
                        }
                        if (jMo9134 != -1) {
                            mo9136(jMo9134);
                        }
                        C18524.m42113(abstractC17043);
                    }
                }
            } catch (IOException unused2) {
                iMo9137 = -1;
            }
            try {
                jMo9134 = mo9134();
                if (abstractC17043.mo29990()) {
                    throw e;
                }
                interfaceC8998.mo4911(abstractC17043, 2);
                if (iMo9137 != -1) {
                    mo9135(iMo9137);
                }
                if (jMo9134 != -1) {
                    mo9136(jMo9134);
                }
                C18524.m42113(abstractC17043);
            } catch (IOException unused3) {
                throw e;
            }
        }
    }
}
