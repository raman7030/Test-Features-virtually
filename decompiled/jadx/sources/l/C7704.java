package l;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAYG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7704 implements InterfaceC14304 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicReference f23800;

    public C7704(C2311 c2311) {
        this.f23800 = new AtomicReference(c2311);
    }

    @Override // l.InterfaceC14304
    public final Iterator iterator() {
        InterfaceC14304 interfaceC14304 = (InterfaceC14304) this.f23800.getAndSet(null);
        if (interfaceC14304 == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return interfaceC14304.iterator();
    }
}
