package l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5EV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19709 extends AbstractCollection {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0657 f63668;

    public C19709(C0657 c0657) {
        this.f63668 = c0657;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C0657 c0657 = this.f63668;
        return C4648.m13613(AbstractC14545.of(c0657.f2525.iterator(), c0657.f2528.iterator()), AbstractC10232.m25861());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C0657 c0657 = this.f63668;
        return c0657.f2528.size() + c0657.f2525.size();
    }
}
