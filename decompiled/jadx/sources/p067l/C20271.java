package p067l;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A41S */
/* JADX INFO: loaded from: classes4.dex */
public final class C20271 extends AbstractQueue {

    /* JADX INFO: renamed from: ۙ */
    public boolean f62646;

    /* JADX INFO: renamed from: ᩶ */
    public C4848 f62647;

    /* JADX INFO: renamed from: ᩸ */
    public int f62648;

    /* JADX INFO: renamed from: ᩹ */
    public C4848 f62649;

    public C20271() {
        clear();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f62649 = C4848.m10283();
        this.f62647 = null;
        this.f62648 = 0;
        this.f62646 = false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m45780() {
        return this.f62648;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f62648;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return this.f62649.toArray(new Object[this.f62648]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f62648 == 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m45784() {
        return this.f62648 != 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45781(Object obj) {
        C4848 c4848 = this.f62649;
        c4848.getClass();
        C4848 c4849 = new C4848(obj, c4848);
        this.f62649 = c4849;
        if (this.f62647 == null) {
            this.f62647 = c4849;
        }
        this.f62648++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45777(Object obj) {
        C1446.m31699(obj);
        if (this.f62646 && this.f62649.m10293()) {
            C4848 c4848 = this.f62649;
            C4848 c4848M10276of = C4848.m10276of(c4848.f11034);
            this.f62647 = c4848M10276of;
            this.f62649 = c4848M10276of;
            while (true) {
                c4848 = c4848.f11035;
                if (!c4848.m10293()) {
                    break;
                }
                this.f62647.f11035 = C4848.m10276of(c4848.f11034);
                this.f62647 = this.f62647.f11035;
            }
        }
        C4848 c4848M10276of2 = C4848.m10276of(obj);
        C4848 c4849 = this.f62647;
        if (c4849 != null) {
            c4849.f11035 = c4848M10276of2;
            this.f62647 = c4848M10276of2;
        } else {
            this.f62647 = c4848M10276of2;
            this.f62649 = c4848M10276of2;
        }
        this.f62648++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45778(C4848 c4848) {
        while (c4848.m10293()) {
            m45777(c4848.f11034);
            c4848 = c4848.f11035;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45779(C20271 c20271) {
        c20271.f62646 = true;
        m45778(c20271.f62649);
    }

    /* JADX INFO: renamed from: ܿ */
    public final C4848 m45783() {
        this.f62646 = true;
        return this.f62649;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f62649.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f62649.toArray(objArr);
    }

    public final Object first() {
        return this.f62649.f11034;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f62649.f11034;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m45782() {
        C4848 c4848 = this.f62649;
        Object obj = c4848.f11034;
        if (!c4848.isEmpty()) {
            C4848 c4849 = this.f62649.f11035;
            this.f62649 = c4849;
            if (c4849.isEmpty()) {
                this.f62647 = null;
            }
            this.f62648--;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C6189 c6189 = new C6189();
        c6189.f15570 = this.f62649;
        return c6189;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        m45777(obj);
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
            if (!this.f62649.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m45777(it.next());
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
        m45777(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object poll() {
        return m45782();
    }

    public final Object last() {
        C4848 c4848 = this.f62647;
        if (c4848 != null) {
            return c4848.f11034;
        }
        return null;
    }
}
