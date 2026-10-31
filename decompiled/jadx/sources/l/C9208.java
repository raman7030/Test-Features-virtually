package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9208 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18380 f27893;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f27894;

    public C9208(Set set, InterfaceC18380 interfaceC18380) {
        this.f27894 = set;
        this.f27893 = interfaceC18380;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C24024(this, this.f27894.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27894.size();
    }
}
