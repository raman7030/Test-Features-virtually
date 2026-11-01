package p067l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.᩸۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C22880 extends AbstractC21520 {

    /* JADX INFO: renamed from: ᩸ */
    public final PriorityQueue f72017;

    public C22880(Iterable iterable, final Comparator comparator) {
        this.f72017 = new PriorityQueue(2, new Comparator() { // from class: l.۠۫ܺ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C16843 c16843 = (C16843) obj;
                C16843 c16844 = (C16843) obj2;
                return AbstractC8543.m19894().mo19899(((C23550) c16843.f49867).peek(), ((C23550) c16844.f49867).peek(), comparator).mo19897(c16843.f49866, c16844.f49866).mo19896();
            }
        });
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Iterator it2 = (Iterator) it.next();
            if (it2.hasNext()) {
                this.f72017.add(new C16843(C6786.m15487(it2), i));
                i++;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f72017.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PriorityQueue priorityQueue = this.f72017;
        C16843 c16843 = (C16843) priorityQueue.remove();
        C23550 c23550 = (C23550) c16843.f49867;
        Object next = c23550.next();
        if (c23550.hasNext()) {
            priorityQueue.add(c16843);
        }
        return next;
    }
}
