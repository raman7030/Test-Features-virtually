package p067l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 87SE */
/* JADX INFO: loaded from: classes4.dex */
public final class C16498 implements InterfaceC15847 {
    @Override // p067l.InterfaceC15847
    /* JADX INFO: renamed from: ֫ */
    public final Set mo5226() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{'<'}[0];
        C12826.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C21562.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
    }

    @Override // p067l.InterfaceC15847
    public final InterfaceC18530 create() {
        return new C22535();
    }
}
