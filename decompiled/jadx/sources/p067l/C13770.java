package p067l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۨ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public class C13770 extends WeakReference implements InterfaceC5723 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC25109 f38929;

    @Override // p067l.InterfaceC5723
    /* JADX INFO: renamed from: ֫ */
    public final void mo12719(Object obj) {
    }

    @Override // p067l.InterfaceC5723
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12720() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo8870() {
        return 1;
    }

    @Override // p067l.InterfaceC5723
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12721() {
        return true;
    }

    public C13770(ReferenceQueue referenceQueue, Object obj, InterfaceC25109 interfaceC25109) {
        super(obj, referenceQueue);
        this.f38929 = interfaceC25109;
    }

    @Override // p067l.InterfaceC5723
    public final InterfaceC25109 getEntry() {
        return this.f38929;
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC5723 mo8869(ReferenceQueue referenceQueue, Object obj, InterfaceC25109 interfaceC25109) {
        return new C13770(referenceQueue, obj, interfaceC25109);
    }

    @Override // p067l.InterfaceC5723
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo12722() {
        return get();
    }
}
