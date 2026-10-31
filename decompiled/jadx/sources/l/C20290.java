package l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩶ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X426 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20290 extends AbstractQueue {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public LinkedList f65542 = new LinkedList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4767 f65543;

    public C20290(C4767 c4767) {
        this.f65543 = c4767;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        C1755 c1755 = (C1755) obj;
        if (!this.f65542.offer(c1755)) {
            return false;
        }
        this.f65543.f15128.add(c1755);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f65542.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f65542.size();
    }

    @Override // java.util.Queue
    public final Object poll() {
        LinkedList linkedList = this.f65542;
        if (linkedList.size() == 0) {
            return null;
        }
        C1755 c1755 = (C1755) linkedList.remove(0);
        this.f65543.f15128.remove(c1755);
        return c1755;
    }

    @Override // java.util.Queue
    public final Object peek() {
        LinkedList linkedList = this.f65542;
        if (linkedList.size() == 0) {
            return null;
        }
        return (C1755) linkedList.get(0);
    }
}
