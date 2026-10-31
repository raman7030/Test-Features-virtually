package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N989 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21087 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6975 f68006;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f68007;

    /* JADX INFO: renamed from: ֫ */
    public abstract long mo7023();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7024(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7025(long j);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo7026();

    public AbstractC21087(AbstractC15440 abstractC15440, InterfaceC6975 interfaceC6975) {
        this.f68007 = abstractC15440;
        this.f68006 = interfaceC6975;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035 A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:17:0x002b, B:19:0x0035, B:21:0x003b, B:24:0x0044, B:25:0x0047), top: B:35:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:17:0x002b, B:19:0x0035, B:21:0x003b, B:24:0x0044, B:25:0x0047), top: B:35:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:17:0x002b, B:19:0x0035, B:21:0x003b, B:24:0x0044, B:25:0x0047), top: B:35:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47984() {
        int iMo7026;
        long jMo7023;
        AbstractC15440 abstractC15440 = this.f68007;
        InterfaceC6975 interfaceC6975 = this.f68006;
        try {
            interfaceC6975.mo2555(abstractC15440, 0);
        } catch (IOException e) {
            if (!abstractC15440.mo23120() || !interfaceC6975.mo2556(e)) {
                throw e;
            }
            try {
                iMo7026 = mo7026();
                int i = iMo7026 | 146;
                if (iMo7026 != i) {
                    try {
                        mo7024(i);
                        interfaceC6975.mo2555(abstractC15440, 1);
                        mo7024(iMo7026);
                        return;
                    } catch (IOException unused) {
                        jMo7023 = mo7023();
                        if (abstractC15440.mo27929()) {
                            throw e;
                        }
                        interfaceC6975.mo2555(abstractC15440, 2);
                        if (iMo7026 != -1) {
                            mo7024(iMo7026);
                        }
                        if (jMo7023 != -1) {
                            mo7025(jMo7023);
                        }
                        C16999.m39870(abstractC15440);
                    }
                }
            } catch (IOException unused2) {
                iMo7026 = -1;
            }
            try {
                jMo7023 = mo7023();
                if (abstractC15440.mo27929()) {
                    throw e;
                }
                interfaceC6975.mo2555(abstractC15440, 2);
                if (iMo7026 != -1) {
                    mo7024(iMo7026);
                }
                if (jMo7023 != -1) {
                    mo7025(jMo7023);
                }
                C16999.m39870(abstractC15440);
            } catch (IOException unused3) {
                throw e;
            }
        }
    }
}
