package l;

import java.util.AbstractQueue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۙܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X426 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4767 extends AbstractQueue {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C4314 f15126 = new C4314();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public HashMap f15127;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public LinkedList f15128;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public LinkedList f15129;

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        C1755 c1755 = (C1755) obj;
        if (!this.f15128.add(c1755)) {
            return false;
        }
        if (this.f15129 == null) {
            return true;
        }
        m13931(c1755);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4767 m13930(C2903 c2903) {
        C4314 c4314 = f15126;
        C4767 c4767 = (C4767) c2903.m8838(c4314);
        if (c4767 != null) {
            return c4767;
        }
        C4767 c4768 = new C4767();
        c4768.f15128 = new LinkedList();
        c2903.m8841(c4314, c4768);
        return c4768;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f15128.iterator();
    }

    @Override // java.util.Queue
    public final Object peek() {
        LinkedList linkedList = this.f15128;
        if (linkedList.size() == 0) {
            return null;
        }
        return (C1755) linkedList.get(0);
    }

    @Override // java.util.Queue
    public final Object poll() {
        LinkedList linkedList = this.f15128;
        if (linkedList.size() == 0) {
            return null;
        }
        C1755 c1755 = (C1755) linkedList.remove(0);
        if (this.f15129 != null) {
            m13932(c1755);
        }
        return c1755;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f15128.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13933(HashSet hashSet) {
        Iterator it = this.f15128.iterator();
        while (it.hasNext()) {
            C1755 c1755 = (C1755) it.next();
            if (!hashSet.contains(c1755.f6075.f4745)) {
                if (this.f15129 != null) {
                    m13932(c1755);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedList m13934() {
        if (this.f15129 == null) {
            this.f15129 = new LinkedList();
            Iterator it = this.f15128.iterator();
            while (it.hasNext()) {
                m13931((C1755) it.next());
            }
        }
        return this.f15129;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13931(C1755 c1755) {
        InterfaceC18278 interfaceC18278 = c1755.f6075.f4745;
        if (this.f15127 == null) {
            this.f15127 = new HashMap();
        }
        C20290 c20290 = (C20290) this.f15127.get(interfaceC18278);
        if (c20290 == null) {
            c20290 = new C20290(this);
            this.f15127.put(interfaceC18278, c20290);
            this.f15129.add(c20290);
        }
        c20290.f65542.add(c1755);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13932(C1755 c1755) {
        InterfaceC18278 interfaceC18278 = c1755.f6075.f4745;
        C20290 c20290 = (C20290) this.f15127.get(interfaceC18278);
        if (c20290 != null && c20290.f65542.remove(c1755) && c20290.isEmpty()) {
            this.f15127.remove(interfaceC18278);
            this.f15129.remove(c20290);
        }
    }
}
