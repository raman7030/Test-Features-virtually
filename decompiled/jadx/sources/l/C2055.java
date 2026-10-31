package l;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: l.֫᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C2055 extends C11996 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f6858;

    public C2055(int i, InterfaceC23927 interfaceC23927, Object obj, ReferenceQueue referenceQueue) {
        super(referenceQueue, obj, interfaceC23927);
        this.f6858 = i;
    }

    @Override // l.C11996, l.InterfaceC3529
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo6744() {
        return this.f6858;
    }

    @Override // l.C11996, l.InterfaceC3529
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3529 mo6743(ReferenceQueue referenceQueue, Object obj, InterfaceC23927 interfaceC23927) {
        return new C2055(this.f6858, interfaceC23927, obj, referenceQueue);
    }
}
