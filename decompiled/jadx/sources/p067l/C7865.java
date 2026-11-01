package p067l;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۛۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 351M */
/* JADX INFO: loaded from: classes2.dex */
public final class C7865 extends LinkedList {
    public static final long serialVersionUID = 7578371020752763662L;

    /* JADX INFO: renamed from: ᩸ */
    public HashSet f20650 = new HashSet();

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            add(it.next());
            z = true;
        }
        return z;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public final boolean add(Object obj) {
        if (!this.f20650.add(obj)) {
            return true;
        }
        super.add(obj);
        return true;
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    public final Object poll() {
        Object objPoll = super.poll();
        this.f20650.remove(objPoll);
        return objPoll;
    }

    @Override // java.util.LinkedList, java.util.Deque
    public final Object pop() {
        Object objPop = super.pop();
        this.f20650.remove(objPop);
        return objPop;
    }
}
