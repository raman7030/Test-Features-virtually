package p067l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16976 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f50212;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Collection f50213;

    public C16976(Collection collection) {
        this.f50213 = collection;
        this.f50212 = collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f50212.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            return ((InterfaceC22097) this.f50212.next()).toFile();
        } catch (UnsupportedOperationException e) {
            throw new IllegalStateException(e);
        }
    }
}
