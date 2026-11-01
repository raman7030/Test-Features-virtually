package p067l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4UM */
/* JADX INFO: loaded from: classes2.dex */
public final class C9029 extends AbstractSet {

    /* JADX INFO: renamed from: ᩶ */
    public static final C9029 f24502 = new C9029(AbstractC8146.m18915of());

    /* JADX INFO: renamed from: ᩸ */
    public final Set f24503;

    /* JADX INFO: renamed from: ᩹ */
    public int f24504 = 0;

    public C9029(AbstractC8146 abstractC8146) {
        this.f24503 = abstractC8146;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f24503.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24503.size();
    }
}
