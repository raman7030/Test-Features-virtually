package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.᩸۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21582 extends AbstractC20151 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f69315;

    public C21582(Iterable iterable, final Comparator comparator) {
        this.f69315 = new PriorityQueue(2, new Comparator() { // from class: l.۠۫ܺ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C15230 c15230 = (C15230) obj;
                C15230 c15231 = (C15230) obj2;
                return AbstractC6497.m17946().mo17951(((C22287) c15230.f46743).peek(), ((C22287) c15231.f46743).peek(), comparator).mo17949(c15230.f46742, c15231.f46742).mo17948();
            }
        });
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Iterator it2 = (Iterator) it.next();
            if (it2.hasNext()) {
                this.f69315.add(new C15230(C4648.m13612(it2), i));
                i++;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f69315.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PriorityQueue priorityQueue = this.f69315;
        C15230 c15230 = (C15230) priorityQueue.remove();
        C22287 c22287 = (C22287) c15230.f46743;
        Object next = c22287.next();
        if (c22287.hasNext()) {
            priorityQueue.add(c15230);
        }
        return next;
    }
}
