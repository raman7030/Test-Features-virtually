package l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.֨֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 97SA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0757 implements InterfaceC14183 {
    @Override // l.InterfaceC14183
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set mo2897() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{'&'}[0];
        C11003.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C20195.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
    }

    @Override // l.InterfaceC14183
    public final InterfaceC17006 create() {
        return new C7813();
    }
}
