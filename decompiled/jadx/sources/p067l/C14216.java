package p067l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.۫ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14216 implements InterfaceC4417 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C15556 f40498;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC24274 f40499;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ LinkedList f40500;

    @Override // p067l.InterfaceC4417
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9209() {
        return true;
    }

    public C14216(C15556 c15556, InterfaceC24274 interfaceC24274, LinkedList linkedList) {
        this.f40498 = c15556;
        this.f40499 = interfaceC24274;
        this.f40500 = linkedList;
    }

    @Override // p067l.InterfaceC4417
    /* JADX INFO: renamed from: ֫ */
    public final void mo9208(C9522 c9522) {
        if (c9522.m22165()) {
            if (this.f40498.m35391(c9522)) {
                int iMo4456 = this.f40499.mo4456(c9522.f26070, c9522.m22151());
                if (iMo4456 == 1) {
                    if (c9522.m22151()) {
                        return;
                    }
                    c9522.m22154();
                    return;
                } else {
                    if (iMo4456 == 2 && c9522.m22151()) {
                        c9522.m22147();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        this.f40500.addFirst(c9522);
    }
}
