package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.ᩴ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes5.dex */
public class C19052 extends SoftReference implements InterfaceC3529 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC23927 f60015;

    @Override // l.InterfaceC3529
    /* JADX INFO: renamed from: ֫ */
    public final void mo10723(Object obj) {
    }

    @Override // l.InterfaceC3529
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10724() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo6744() {
        return 1;
    }

    @Override // l.InterfaceC3529
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo10725() {
        return true;
    }

    public C19052(ReferenceQueue referenceQueue, Object obj, InterfaceC23927 interfaceC23927) {
        super(obj, referenceQueue);
        this.f60015 = interfaceC23927;
    }

    @Override // l.InterfaceC3529
    public final InterfaceC23927 getEntry() {
        return this.f60015;
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC3529 mo6743(ReferenceQueue referenceQueue, Object obj, InterfaceC23927 interfaceC23927) {
        return new C19052(referenceQueue, obj, interfaceC23927);
    }

    @Override // l.InterfaceC3529
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo10726() {
        return get();
    }
}
