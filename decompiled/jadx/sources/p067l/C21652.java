package p067l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩶ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X426 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21652 extends AbstractQueue {

    /* JADX INFO: renamed from: ᩸ */
    public LinkedList f68217 = new LinkedList();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C6899 f68218;

    public C21652(C6899 c6899) {
        this.f68218 = c6899;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        C4036 c4036 = (C4036) obj;
        if (!this.f68217.offer(c4036)) {
            return false;
        }
        this.f68218.f17958.add(c4036);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f68217.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f68217.size();
    }

    @Override // java.util.Queue
    public final Object poll() {
        LinkedList linkedList = this.f68217;
        if (linkedList.size() == 0) {
            return null;
        }
        C4036 c4036 = (C4036) linkedList.remove(0);
        this.f68218.f17958.remove(c4036);
        return c4036;
    }

    @Override // java.util.Queue
    public final Object peek() {
        LinkedList linkedList = this.f68217;
        if (linkedList.size() == 0) {
            return null;
        }
        return (C4036) linkedList.get(0);
    }
}
