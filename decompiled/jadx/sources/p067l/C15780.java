package p067l;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: l.ܰ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15780 extends C20476 {

    /* JADX INFO: renamed from: ᩹ */
    public final int f45676;

    public C15780(int i, InterfaceC25109 interfaceC25109, Object obj, ReferenceQueue referenceQueue) {
        super(referenceQueue, obj, interfaceC25109);
        this.f45676 = i;
    }

    @Override // p067l.C20476, p067l.InterfaceC5723
    /* JADX INFO: renamed from: ۧ */
    public final int mo8870() {
        return this.f45676;
    }

    @Override // p067l.C20476, p067l.InterfaceC5723
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5723 mo8869(ReferenceQueue referenceQueue, Object obj, InterfaceC25109 interfaceC25109) {
        return new C15780(this.f45676, interfaceC25109, obj, referenceQueue);
    }
}
