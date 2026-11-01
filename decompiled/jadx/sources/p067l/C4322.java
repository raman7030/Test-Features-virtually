package p067l;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: l.֫᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4322 extends C13770 {

    /* JADX INFO: renamed from: ᩹ */
    public final int f9641;

    public C4322(int i, InterfaceC25109 interfaceC25109, Object obj, ReferenceQueue referenceQueue) {
        super(referenceQueue, obj, interfaceC25109);
        this.f9641 = i;
    }

    @Override // p067l.C13770, p067l.InterfaceC5723
    /* JADX INFO: renamed from: ۧ */
    public final int mo8870() {
        return this.f9641;
    }

    @Override // p067l.C13770, p067l.InterfaceC5723
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5723 mo8869(ReferenceQueue referenceQueue, Object obj, InterfaceC25109 interfaceC25109) {
        return new C4322(this.f9641, interfaceC25109, obj, referenceQueue);
    }
}
