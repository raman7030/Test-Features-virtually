package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: renamed from: l.᩶ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19913 extends AbstractQueue implements Deque, Serializable {
    public static final long serialVersionUID = -387911632671998426L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C0861 f64323;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient C22029 f64324;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Condition f64325;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Condition f64326;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient C22029 f64327;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f64328 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient int f64329;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m45815(long j) throws InterruptedException {
        EnumC8618 enumC8618;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int[] iArr = C2979.f9423;
        C11003.requireNonNull(timeUnit);
        switch (iArr[timeUnit.ordinal()]) {
            case 1:
                enumC8618 = EnumC8618.NANOS;
                break;
            case 2:
                enumC8618 = EnumC8618.MICROS;
                break;
            case 3:
                enumC8618 = EnumC8618.MILLIS;
                break;
            case 4:
                enumC8618 = EnumC8618.SECONDS;
                break;
            case 5:
                enumC8618 = EnumC8618.MINUTES;
                break;
            case 6:
                enumC8618 = EnumC8618.HOURS;
                break;
            case 7:
                enumC8618 = EnumC8618.DAYS;
                break;
            default:
                throw new IllegalArgumentException(timeUnit.toString());
        }
        long nanos = C2828.of(j, enumC8618).toNanos();
        C0861 c0861 = this.f64323;
        c0861.lockInterruptibly();
        while (true) {
            try {
                Object objM45812 = m45812();
                if (objM45812 != null) {
                    c0861.unlock();
                    return objM45812;
                }
                if (nanos > 0) {
                    nanos = this.f64326.awaitNanos(nanos);
                } else {
                    c0861.unlock();
                    return null;
                }
            } catch (Throwable th) {
                c0861.unlock();
                throw th;
            }
        }
    }

    public C19913() {
        C0861 c0861 = new C0861(false);
        this.f64323 = c0861;
        this.f64326 = c0861.newCondition();
        this.f64325 = c0861.newCondition();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.Deque
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.Deque
    public final void addFirst(Object obj) {
        if (!offerFirst(obj)) {
            throw new IllegalStateException("Deque full");
        }
    }

    @Override // java.util.Deque
    public final void addLast(Object obj) {
        if (!offerLast(obj)) {
            throw new IllegalStateException("Deque full");
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            C22029 c22029 = this.f64327;
            while (c22029 != null) {
                c22029.f70619 = null;
                C22029 c220210 = c22029.f70620;
                c22029.f70621 = null;
                c22029.f70620 = null;
                c22029 = c220210;
            }
            this.f64324 = null;
            this.f64327 = null;
            this.f64329 = 0;
            this.f64325.signalAll();
        } finally {
            c0861.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            for (C22029 c22029 = this.f64327; c22029 != null; c22029 = c22029.f70620) {
                if (obj.equals(c22029.f70619)) {
                    c0861.unlock();
                    return true;
                }
            }
            c0861.unlock();
            return false;
        } catch (Throwable th) {
            c0861.unlock();
            throw th;
        }
    }

    @Override // java.util.Deque
    public final Iterator descendingIterator() {
        return new C14972(this);
    }

    @Override // java.util.AbstractQueue, java.util.Queue, java.util.Deque
    public final Object element() {
        return getFirst();
    }

    @Override // java.util.Deque
    public final Object getFirst() {
        Object objPeekFirst = peekFirst();
        if (objPeekFirst != null) {
            return objPeekFirst;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Deque
    public final Object getLast() {
        Object objPeekLast = peekLast();
        if (objPeekLast != null) {
            return objPeekLast;
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m45816() {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            return c0861.getWaitQueueLength(this.f64326);
        } finally {
            c0861.unlock();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m45817() {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            return c0861.hasWaiters(this.f64326);
        } finally {
            c0861.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m45819() {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            c0861.m3171(this.f64326);
        } finally {
            c0861.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public final Iterator iterator() {
        return new C21324(this);
    }

    @Override // java.util.Queue, java.util.Deque
    public final boolean offer(Object obj) {
        return offerLast(obj);
    }

    @Override // java.util.Deque
    public final boolean offerFirst(Object obj) {
        boolean z;
        C11003.requireNonNull(obj, "e");
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            int i = this.f64329;
            if (i >= this.f64328) {
                z = false;
            } else {
                C22029 c22029 = this.f64327;
                C22029 c220210 = new C22029(obj, null, c22029);
                this.f64327 = c220210;
                if (this.f64324 == null) {
                    this.f64324 = c220210;
                } else {
                    c22029.f70621 = c220210;
                }
                z = true;
                this.f64329 = i + 1;
                this.f64326.signal();
            }
            return z;
        } finally {
            c0861.unlock();
        }
    }

    @Override // java.util.Deque
    public final boolean offerLast(Object obj) {
        boolean z;
        C11003.requireNonNull(obj, "e");
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            int i = this.f64329;
            if (i >= this.f64328) {
                z = false;
            } else {
                C22029 c22029 = this.f64324;
                C22029 c220210 = new C22029(obj, c22029, null);
                this.f64324 = c220210;
                if (this.f64327 == null) {
                    this.f64327 = c220210;
                } else {
                    c22029.f70620 = c220210;
                }
                z = true;
                this.f64329 = i + 1;
                this.f64326.signal();
            }
            return z;
        } finally {
            c0861.unlock();
        }
    }

    @Override // java.util.Queue, java.util.Deque
    public final Object peek() {
        return peekFirst();
    }

    @Override // java.util.Deque
    public final Object peekFirst() {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            C22029 c22029 = this.f64327;
            return c22029 == null ? null : c22029.f70619;
        } finally {
            c0861.unlock();
        }
    }

    @Override // java.util.Deque
    public final Object peekLast() {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            C22029 c22029 = this.f64324;
            return c22029 == null ? null : c22029.f70619;
        } finally {
            c0861.unlock();
        }
    }

    @Override // java.util.Queue, java.util.Deque
    public final Object poll() {
        return pollFirst();
    }

    @Override // java.util.Deque
    public final Object pollFirst() {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            return m45812();
        } finally {
            c0861.unlock();
        }
    }

    @Override // java.util.Deque
    public final Object pollLast() {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            return m45814();
        } finally {
            c0861.unlock();
        }
    }

    @Override // java.util.Deque
    public final Object pop() {
        return removeFirst();
    }

    @Override // java.util.Deque
    public final void push(Object obj) {
        addFirst(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f64329 = 0;
        this.f64327 = null;
        this.f64324 = null;
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                return;
            } else {
                addLast(object);
            }
        }
    }

    @Override // java.util.AbstractQueue, java.util.Queue, java.util.Deque
    public final Object remove() {
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean remove(Object obj) {
        return removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    public final Object removeFirst() {
        Object objPollFirst = pollFirst();
        if (objPollFirst != null) {
            return objPollFirst;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Deque
    public final boolean removeFirstOccurrence(Object obj) {
        if (obj == null) {
            return false;
        }
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            for (C22029 c22029 = this.f64327; c22029 != null; c22029 = c22029.f70620) {
                if (obj.equals(c22029.f70619)) {
                    m45810(c22029);
                    return true;
                }
            }
            return false;
        } finally {
            c0861.unlock();
        }
    }

    @Override // java.util.Deque
    public final Object removeLast() {
        Object objPollLast = pollLast();
        if (objPollLast != null) {
            return objPollLast;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Deque
    public final boolean removeLastOccurrence(Object obj) {
        if (obj == null) {
            return false;
        }
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            for (C22029 c22029 = this.f64324; c22029 != null; c22029 = c22029.f70621) {
                if (obj.equals(c22029.f70619)) {
                    m45810(c22029);
                    return true;
                }
            }
            return false;
        } finally {
            c0861.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final int size() {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            return this.f64329;
        } finally {
            c0861.unlock();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object m45818() {
        C0861 c0861 = this.f64323;
        c0861.lock();
        while (true) {
            try {
                Object objM45812 = m45812();
                if (objM45812 == null) {
                    this.f64326.await();
                } else {
                    c0861.unlock();
                    return objM45812;
                }
            } catch (Throwable th) {
                c0861.unlock();
                throw th;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            Object[] objArr = new Object[this.f64329];
            C22029 c22029 = this.f64327;
            int i = 0;
            while (c22029 != null) {
                int i2 = i + 1;
                objArr[i] = c22029.f70619;
                c22029 = c22029.f70620;
                i = i2;
            }
            c0861.unlock();
            return objArr;
        } catch (Throwable th) {
            c0861.unlock();
            throw th;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            if (objArr.length < this.f64329) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f64329);
            }
            C22029 c22029 = this.f64327;
            int i = 0;
            while (c22029 != null) {
                objArr[i] = c22029.f70619;
                c22029 = c22029.f70620;
                i++;
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        } finally {
            c0861.unlock();
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            return super.toString();
        } finally {
            c0861.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m45810(C22029 c22029) {
        C22029 c220210 = c22029.f70621;
        C22029 c220211 = c22029.f70620;
        if (c220210 == null) {
            m45812();
            return;
        }
        if (c220211 == null) {
            m45814();
            return;
        }
        c220210.f70620 = c220211;
        c220211.f70621 = c220210;
        c22029.f70619 = null;
        this.f64329--;
        this.f64325.signal();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private Object m45812() {
        C22029 c22029 = this.f64327;
        if (c22029 == null) {
            return null;
        }
        C22029 c220210 = c22029.f70620;
        Object obj = c22029.f70619;
        c22029.f70619 = null;
        c22029.f70620 = c22029;
        this.f64327 = c220210;
        if (c220210 == null) {
            this.f64324 = null;
        } else {
            c220210.f70621 = null;
        }
        this.f64329--;
        this.f64325.signal();
        return obj;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private Object m45814() {
        C22029 c22029 = this.f64324;
        if (c22029 == null) {
            return null;
        }
        C22029 c220210 = c22029.f70621;
        Object obj = c22029.f70619;
        c22029.f70619 = null;
        c22029.f70621 = c22029;
        this.f64324 = c220210;
        if (c220210 == null) {
            this.f64327 = null;
        } else {
            c220210.f70620 = null;
        }
        this.f64329--;
        this.f64325.signal();
        return obj;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        C0861 c0861 = this.f64323;
        c0861.lock();
        try {
            objectOutputStream.defaultWriteObject();
            for (C22029 c22029 = this.f64327; c22029 != null; c22029 = c22029.f70620) {
                objectOutputStream.writeObject(c22029.f70619);
            }
            objectOutputStream.writeObject(null);
        } finally {
            c0861.unlock();
        }
    }
}
