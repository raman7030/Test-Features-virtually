package p067l;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAYG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9691 implements InterfaceC15963 {

    /* JADX INFO: renamed from: ֫ */
    public final AtomicReference f26714;

    public C9691(C4565 c4565) {
        this.f26714 = new AtomicReference(c4565);
    }

    @Override // p067l.InterfaceC15963
    public final Iterator iterator() {
        InterfaceC15963 interfaceC15963 = (InterfaceC15963) this.f26714.getAndSet(null);
        if (interfaceC15963 == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return interfaceC15963.iterator();
    }
}
