package p067l;

import java.util.AbstractQueue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۙܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X426 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6899 extends AbstractQueue {

    /* JADX INFO: renamed from: ۙ */
    public static final C6468 f17956 = new C6468();

    /* JADX INFO: renamed from: ᩶ */
    public HashMap f17957;

    /* JADX INFO: renamed from: ᩸ */
    public LinkedList f17958;

    /* JADX INFO: renamed from: ᩹ */
    public LinkedList f17959;

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        C4036 c4036 = (C4036) obj;
        if (!this.f17958.add(c4036)) {
            return false;
        }
        if (this.f17959 == null) {
            return true;
        }
        m15811(c4036);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6899 m15810(C5127 c5127) {
        C6468 c6468 = f17956;
        C6899 c6899 = (C6899) c5127.m10905(c6468);
        if (c6899 != null) {
            return c6899;
        }
        C6899 c68910 = new C6899();
        c68910.f17958 = new LinkedList();
        c5127.m10908(c6468, c68910);
        return c68910;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f17958.iterator();
    }

    @Override // java.util.Queue
    public final Object peek() {
        LinkedList linkedList = this.f17958;
        if (linkedList.size() == 0) {
            return null;
        }
        return (C4036) linkedList.get(0);
    }

    @Override // java.util.Queue
    public final Object poll() {
        LinkedList linkedList = this.f17958;
        if (linkedList.size() == 0) {
            return null;
        }
        C4036 c4036 = (C4036) linkedList.remove(0);
        if (this.f17959 != null) {
            m15812(c4036);
        }
        return c4036;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f17958.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15813(HashSet hashSet) {
        Iterator it = this.f17958.iterator();
        while (it.hasNext()) {
            C4036 c4036 = (C4036) it.next();
            if (!hashSet.contains(c4036.f8851.f7516)) {
                if (this.f17959 != null) {
                    m15812(c4036);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final LinkedList m15814() {
        if (this.f17959 == null) {
            this.f17959 = new LinkedList();
            Iterator it = this.f17958.iterator();
            while (it.hasNext()) {
                m15811((C4036) it.next());
            }
        }
        return this.f17959;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15811(C4036 c4036) {
        InterfaceC19740 interfaceC19740 = c4036.f8851.f7516;
        if (this.f17957 == null) {
            this.f17957 = new HashMap();
        }
        C21652 c21652 = (C21652) this.f17957.get(interfaceC19740);
        if (c21652 == null) {
            c21652 = new C21652(this);
            this.f17957.put(interfaceC19740, c21652);
            this.f17959.add(c21652);
        }
        c21652.f68217.add(c4036);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m15812(C4036 c4036) {
        InterfaceC19740 interfaceC19740 = c4036.f8851.f7516;
        C21652 c21652 = (C21652) this.f17957.get(interfaceC19740);
        if (c21652 != null && c21652.f68217.remove(c4036) && c21652.isEmpty()) {
            this.f17957.remove(interfaceC19740);
            this.f17959.remove(c21652);
        }
    }
}
