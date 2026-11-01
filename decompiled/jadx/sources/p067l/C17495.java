package p067l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5J5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17495 extends AbstractC11423 {

    /* JADX INFO: renamed from: ᩸ */
    public final Iterable f52312;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C6097 f52313;

    public C17495(C6097 c6097, Collection collection) {
        this.f52313 = c6097;
        this.f52312 = collection;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof C15444)) {
            return null;
        }
        C15444 c15444 = (C15444) obj;
        C4756 c4756 = (C4756) this.f52313.f15316.get(c15444.f44130);
        if (c4756 == null || !((C15444) c4756.getKey()).equals(c15444)) {
            return null;
        }
        return c4756.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f52313.f15316.size();
    }

    @Override // p067l.AbstractC11423
    /* JADX INFO: renamed from: ֫ */
    public final Iterator mo17188() {
        return this.f52312.iterator();
    }
}
