package p067l;

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
public final class C21293 extends AbstractQueue implements Deque, Serializable {
    public static final long serialVersionUID = -387911632671998426L;

    /* JADX INFO: renamed from: ۗ */
    public final C3186 f66961;

    /* JADX INFO: renamed from: ۙ */
    public transient C23304 f66962;

    /* JADX INFO: renamed from: ۫ */
    public final Condition f66963;

    /* JADX INFO: renamed from: ۬ */
    public final Condition f66964;

    /* JADX INFO: renamed from: ᩶ */
    public transient C23304 f66965;

    /* JADX INFO: renamed from: ᩸ */
    public final int f66966 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ᩹ */
    public transient int f66967;

    /* JADX INFO: renamed from: ֫ */
    public final Object m48127(long j) throws InterruptedException {
        EnumC10559 enumC10559;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int[] iArr = C5199.f12222;
        C12826.requireNonNull(timeUnit);
        switch (iArr[timeUnit.ordinal()]) {
            case 1:
                enumC10559 = EnumC10559.NANOS;
                break;
            case 2:
                enumC10559 = EnumC10559.MICROS;
                break;
            case 3:
                enumC10559 = EnumC10559.MILLIS;
                break;
            case 4:
                enumC10559 = EnumC10559.SECONDS;
                break;
            case 5:
                enumC10559 = EnumC10559.MINUTES;
                break;
            case 6:
                enumC10559 = EnumC10559.HOURS;
                break;
            case 7:
                enumC10559 = EnumC10559.DAYS;
                break;
            default:
                throw new IllegalArgumentException(timeUnit.toString());
        }
        long nanos = C5057.m10791of(j, enumC10559).toNanos();
        C3186 c3186 = this.f66961;
        c3186.lockInterruptibly();
        while (true) {
            try {
                Object objM48124 = m48124();
                if (objM48124 != null) {
                    c3186.unlock();
                    return objM48124;
                }
                if (nanos > 0) {
                    nanos = this.f66964.awaitNanos(nanos);
                } else {
                    c3186.unlock();
                    return null;
                }
            } catch (Throwable th) {
                c3186.unlock();
                throw th;
            }
        }
    }

    public C21293() {
        C3186 c3186 = new C3186(false);
        this.f66961 = c3186;
        this.f66964 = c3186.newCondition();
        this.f66963 = c3186.newCondition();
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
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            C23304 c23304 = this.f66965;
            while (c23304 != null) {
                c23304.f73336 = null;
                C23304 c23305 = c23304.f73337;
                c23304.f73338 = null;
                c23304.f73337 = null;
                c23304 = c23305;
            }
            this.f66962 = null;
            this.f66965 = null;
            this.f66967 = 0;
            this.f66963.signalAll();
        } finally {
            c3186.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            for (C23304 c23304 = this.f66965; c23304 != null; c23304 = c23304.f73337) {
                if (obj.equals(c23304.f73336)) {
                    c3186.unlock();
                    return true;
                }
            }
            c3186.unlock();
            return false;
        } catch (Throwable th) {
            c3186.unlock();
            throw th;
        }
    }

    @Override // java.util.Deque
    public final Iterator descendingIterator() {
        return new C16597(this);
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

    /* JADX INFO: renamed from: ۧ */
    public final int m48128() {
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            return c3186.getWaitQueueLength(this.f66964);
        } finally {
            c3186.unlock();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m48129() {
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            return c3186.hasWaiters(this.f66964);
        } finally {
            c3186.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m48131() {
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            c3186.m5485(this.f66964);
        } finally {
            c3186.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public final Iterator iterator() {
        return new C22634(this);
    }

    @Override // java.util.Queue, java.util.Deque
    public final boolean offer(Object obj) {
        return offerLast(obj);
    }

    @Override // java.util.Deque
    public final boolean offerFirst(Object obj) {
        boolean z;
        C12826.requireNonNull(obj, "e");
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            int i = this.f66967;
            if (i >= this.f66966) {
                z = false;
            } else {
                C23304 c23304 = this.f66965;
                C23304 c23305 = new C23304(obj, null, c23304);
                this.f66965 = c23305;
                if (this.f66962 == null) {
                    this.f66962 = c23305;
                } else {
                    c23304.f73338 = c23305;
                }
                z = true;
                this.f66967 = i + 1;
                this.f66964.signal();
            }
            return z;
        } finally {
            c3186.unlock();
        }
    }

    @Override // java.util.Deque
    public final boolean offerLast(Object obj) {
        boolean z;
        C12826.requireNonNull(obj, "e");
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            int i = this.f66967;
            if (i >= this.f66966) {
                z = false;
            } else {
                C23304 c23304 = this.f66962;
                C23304 c23305 = new C23304(obj, c23304, null);
                this.f66962 = c23305;
                if (this.f66965 == null) {
                    this.f66965 = c23305;
                } else {
                    c23304.f73337 = c23305;
                }
                z = true;
                this.f66967 = i + 1;
                this.f66964.signal();
            }
            return z;
        } finally {
            c3186.unlock();
        }
    }

    @Override // java.util.Queue, java.util.Deque
    public final Object peek() {
        return peekFirst();
    }

    @Override // java.util.Deque
    public final Object peekFirst() {
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            C23304 c23304 = this.f66965;
            return c23304 == null ? null : c23304.f73336;
        } finally {
            c3186.unlock();
        }
    }

    @Override // java.util.Deque
    public final Object peekLast() {
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            C23304 c23304 = this.f66962;
            return c23304 == null ? null : c23304.f73336;
        } finally {
            c3186.unlock();
        }
    }

    @Override // java.util.Queue, java.util.Deque
    public final Object poll() {
        return pollFirst();
    }

    @Override // java.util.Deque
    public final Object pollFirst() {
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            return m48124();
        } finally {
            c3186.unlock();
        }
    }

    @Override // java.util.Deque
    public final Object pollLast() {
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            return m48126();
        } finally {
            c3186.unlock();
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
        this.f66967 = 0;
        this.f66965 = null;
        this.f66962 = null;
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
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            for (C23304 c23304 = this.f66965; c23304 != null; c23304 = c23304.f73337) {
                if (obj.equals(c23304.f73336)) {
                    m48122(c23304);
                    return true;
                }
            }
            return false;
        } finally {
            c3186.unlock();
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
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            for (C23304 c23304 = this.f66962; c23304 != null; c23304 = c23304.f73338) {
                if (obj.equals(c23304.f73336)) {
                    m48122(c23304);
                    return true;
                }
            }
            return false;
        } finally {
            c3186.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final int size() {
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            return this.f66967;
        } finally {
            c3186.unlock();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final Object m48130() {
        C3186 c3186 = this.f66961;
        c3186.lock();
        while (true) {
            try {
                Object objM48124 = m48124();
                if (objM48124 == null) {
                    this.f66964.await();
                } else {
                    c3186.unlock();
                    return objM48124;
                }
            } catch (Throwable th) {
                c3186.unlock();
                throw th;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            Object[] objArr = new Object[this.f66967];
            C23304 c23304 = this.f66965;
            int i = 0;
            while (c23304 != null) {
                int i2 = i + 1;
                objArr[i] = c23304.f73336;
                c23304 = c23304.f73337;
                i = i2;
            }
            c3186.unlock();
            return objArr;
        } catch (Throwable th) {
            c3186.unlock();
            throw th;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            if (objArr.length < this.f66967) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f66967);
            }
            C23304 c23304 = this.f66965;
            int i = 0;
            while (c23304 != null) {
                objArr[i] = c23304.f73336;
                c23304 = c23304.f73337;
                i++;
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        } finally {
            c3186.unlock();
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            return super.toString();
        } finally {
            c3186.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m48122(C23304 c23304) {
        C23304 c23305 = c23304.f73338;
        C23304 c23306 = c23304.f73337;
        if (c23305 == null) {
            m48124();
            return;
        }
        if (c23306 == null) {
            m48126();
            return;
        }
        c23305.f73337 = c23306;
        c23306.f73338 = c23305;
        c23304.f73336 = null;
        this.f66967--;
        this.f66963.signal();
    }

    /* JADX INFO: renamed from: ܳ */
    private Object m48124() {
        C23304 c23304 = this.f66965;
        if (c23304 == null) {
            return null;
        }
        C23304 c23305 = c23304.f73337;
        Object obj = c23304.f73336;
        c23304.f73336 = null;
        c23304.f73337 = c23304;
        this.f66965 = c23305;
        if (c23305 == null) {
            this.f66962 = null;
        } else {
            c23305.f73338 = null;
        }
        this.f66967--;
        this.f66963.signal();
        return obj;
    }

    /* JADX INFO: renamed from: ᩻ */
    private Object m48126() {
        C23304 c23304 = this.f66962;
        if (c23304 == null) {
            return null;
        }
        C23304 c23305 = c23304.f73338;
        Object obj = c23304.f73336;
        c23304.f73336 = null;
        c23304.f73338 = c23304;
        this.f66962 = c23305;
        if (c23305 == null) {
            this.f66965 = null;
        } else {
            c23305.f73337 = null;
        }
        this.f66967--;
        this.f66963.signal();
        return obj;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        C3186 c3186 = this.f66961;
        c3186.lock();
        try {
            objectOutputStream.defaultWriteObject();
            for (C23304 c23304 = this.f66965; c23304 != null; c23304 = c23304.f73337) {
                objectOutputStream.writeObject(c23304.f73336);
            }
            objectOutputStream.writeObject(null);
        } finally {
            c3186.unlock();
        }
    }
}
