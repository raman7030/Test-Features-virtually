package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4UM */
/* JADX INFO: loaded from: classes2.dex */
public final class C7008 extends AbstractSet {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C7008 f21621 = new C7008(AbstractC6079.of());

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Set f21622;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f21623 = 0;

    public C7008(AbstractC6079 abstractC6079) {
        this.f21622 = abstractC6079;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f21622.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21622.size();
    }
}
