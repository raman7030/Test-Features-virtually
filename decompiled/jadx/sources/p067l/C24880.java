package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 02RL */
/* JADX INFO: loaded from: classes.dex */
public final class C24880 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC19516 f79467 = null;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterator f79468;

    public C24880(Iterator it) {
        this.f79468 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f79468.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC19516 abstractC19516 = (AbstractC19516) this.f79468.next();
        this.f79467 = abstractC19516;
        return abstractC19516;
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC19516 abstractC19516 = this.f79467;
        if (abstractC19516 != null) {
            abstractC19516.f59438 = null;
        }
        this.f79468.remove();
    }
}
