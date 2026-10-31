package l;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A41S */
/* JADX INFO: loaded from: classes4.dex */
public final class C18837 extends AbstractQueue {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f59418;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2609 f59419;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f59420;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C2609 f59421;

    public C18837() {
        clear();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f59421 = C2609.m8239();
        this.f59419 = null;
        this.f59420 = 0;
        this.f59418 = false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m43514() {
        return this.f59420;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f59420;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return this.f59421.toArray(new Object[this.f59420]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f59420 == 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m43518() {
        return this.f59420 != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43515(Object obj) {
        C2609 c2609 = this.f59421;
        c2609.getClass();
        C2609 c26010 = new C2609(obj, c2609);
        this.f59421 = c26010;
        if (this.f59419 == null) {
            this.f59419 = c26010;
        }
        this.f59420++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43511(Object obj) {
        C12171.m29637(obj);
        if (this.f59418 && this.f59421.m8249()) {
            C2609 c2609 = this.f59421;
            C2609 c2609Of = C2609.of(c2609.f8240);
            this.f59419 = c2609Of;
            this.f59421 = c2609Of;
            while (true) {
                c2609 = c2609.f8241;
                if (!c2609.m8249()) {
                    break;
                }
                this.f59419.f8241 = C2609.of(c2609.f8240);
                this.f59419 = this.f59419.f8241;
            }
        }
        C2609 c2609Of2 = C2609.of(obj);
        C2609 c26010 = this.f59419;
        if (c26010 != null) {
            c26010.f8241 = c2609Of2;
            this.f59419 = c2609Of2;
        } else {
            this.f59419 = c2609Of2;
            this.f59421 = c2609Of2;
        }
        this.f59420++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43512(C2609 c2609) {
        while (c2609.m8249()) {
            m43511(c2609.f8240);
            c2609 = c2609.f8241;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43513(C18837 c18837) {
        c18837.f59418 = true;
        m43512(c18837.f59421);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2609 m43517() {
        this.f59418 = true;
        return this.f59421;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f59421.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f59421.toArray(objArr);
    }

    public final Object first() {
        return this.f59421.f8240;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f59421.f8240;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m43516() {
        C2609 c2609 = this.f59421;
        Object obj = c2609.f8240;
        if (!c2609.isEmpty()) {
            C2609 c26010 = this.f59421.f8241;
            this.f59421 = c26010;
            if (c26010.isEmpty()) {
                this.f59419 = null;
            }
            this.f59420--;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C4020 c4020 = new C4020();
        c4020.f12755 = this.f59421;
        return c4020;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        m43511(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f59421.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m43511(it.next());
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        m43511(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object poll() {
        return m43516();
    }

    public final Object last() {
        C2609 c2609 = this.f59419;
        if (c2609 != null) {
            return c2609.f8240;
        }
        return null;
    }
}
