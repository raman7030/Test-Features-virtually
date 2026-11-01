package p067l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 02RL */
/* JADX INFO: loaded from: classes2.dex */
public final class C8787 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC22199 f23839;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C17503 f23840;

    public C8787(AbstractC22199 abstractC22199, C17503 c17503) {
        this.f23839 = abstractC22199;
        this.f23840 = c17503;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        AbstractC19516 abstractC19516 = (AbstractC19516) obj;
        boolean zM44349 = abstractC19516.m44349();
        AbstractC22199 abstractC22199 = this.f23839;
        if (!zM44349) {
            abstractC19516.f59438 = this.f23840;
            AbstractC22199.m50010(abstractC22199, abstractC19516);
            return true;
        }
        throw new IllegalArgumentException(abstractC22199.mo26469());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C24880(AbstractC22199.m50009(this.f23839).iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return AbstractC22199.m50009(this.f23839).size();
    }
}
