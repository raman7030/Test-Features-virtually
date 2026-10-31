package l;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܰ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes3.dex */
public class C14048 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7699 f42461;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterator f42462;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Collection f42463;

    public C14048(C7699 c7699) {
        Iterator it;
        this.f42461 = c7699;
        Collection collection = c7699.f23787;
        this.f42463 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f42462 = it;
    }

    public C14048(C10773 c10773, ListIterator listIterator) {
        this.f42461 = c10773;
        this.f42463 = c10773.f23787;
        this.f42462 = listIterator;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33656() {
        C7699 c7699 = this.f42461;
        c7699.m20601();
        if (c7699.f23787 != this.f42463) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m33656();
        return this.f42462.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m33656();
        return this.f42462.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f42462.remove();
        C7699 c7699 = this.f42461;
        AbstractC16416.m38684(c7699.f23785);
        c7699.m20602();
    }
}
