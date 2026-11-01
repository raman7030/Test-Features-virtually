package p067l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11120 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC19837 f30839;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Set f30840;

    public C11120(Set set, InterfaceC19837 interfaceC19837) {
        this.f30840 = set;
        this.f30839 = interfaceC19837;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C25201(this, this.f30840.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30840.size();
    }
}
