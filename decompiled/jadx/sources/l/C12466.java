package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.۫ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C12466 implements InterfaceC2155 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13876 f37478;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23049 f37479;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedList f37480;

    @Override // l.InterfaceC2155
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7114() {
        return true;
    }

    public C12466(C13876 c13876, InterfaceC23049 interfaceC23049, LinkedList linkedList) {
        this.f37478 = c13876;
        this.f37479 = interfaceC23049;
        this.f37480 = linkedList;
    }

    @Override // l.InterfaceC2155
    /* JADX INFO: renamed from: ֫ */
    public final void mo7113(C7527 c7527) {
        if (c7527.m20189()) {
            if (this.f37478.m33272(c7527)) {
                int iMo2075 = this.f37479.mo2075(c7527.f23157, c7527.m20175());
                if (iMo2075 == 1) {
                    if (c7527.m20175()) {
                        return;
                    }
                    c7527.m20178();
                    return;
                } else {
                    if (iMo2075 == 2 && c7527.m20175()) {
                        c7527.m20171();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        this.f37480.addFirst(c7527);
    }
}
