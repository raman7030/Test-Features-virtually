package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ܰܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1XZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15603 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC9476 f44677;

    /* JADX INFO: renamed from: ۧ */
    public int f44678;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m35481(int i, List list) {
        AbstractC9476 abstractC9476 = (AbstractC9476) list.get(i);
        if (!C6712.m15317(abstractC9476)) {
            return false;
        }
        this.f44677 = abstractC9476;
        this.f44678 = ((InterfaceC4059) abstractC9476).mo4189();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m35479() {
        return this.f44678;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35480(C16769 c16769) {
        c16769.f49420.m6072(this.f44677);
    }
}
