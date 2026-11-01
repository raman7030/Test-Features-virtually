package net.engio.mbassy.common;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractConcurrentSet implements Set {

    /* JADX INFO: renamed from: id */
    public static final AtomicLong f80622id = new AtomicLong();
    public final Map entries;
    public Entry head;

    /* JADX INFO: renamed from: ID */
    public final long f80623ID = f80622id.getAndIncrement();
    public final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public abstract Entry createEntry(Object obj, Entry entry);

    public AbstractConcurrentSet(Map map) {
        this.entries = map;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        try {
            writeLock.lock();
            return insert(obj);
        } finally {
            writeLock.unlock();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        try {
            lock.lock();
            ISetEntry iSetEntry = (ISetEntry) this.entries.get(obj);
            lock.unlock();
            return (iSetEntry == null || iSetEntry.getValue() == null) ? false : true;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    private boolean insert(Object obj) {
        if (this.entries.containsKey(obj)) {
            return false;
        }
        Entry entryCreateEntry = createEntry(obj, this.head);
        this.head = entryCreateEntry;
        this.entries.put(obj, entryCreateEntry);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.entries.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        try {
            writeLock.lock();
            boolean zInsert = false;
            for (Object obj : collection) {
                if (obj != null) {
                    zInsert |= insert(obj);
                }
            }
            writeLock.unlock();
            return zInsert;
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        try {
            writeLock.lock();
            ISetEntry iSetEntry = (ISetEntry) this.entries.get(obj);
            if (iSetEntry == null) {
                return false;
            }
            Entry entry = this.head;
            if (iSetEntry != entry) {
                iSetEntry.remove();
            } else {
                this.head = entry.next();
            }
            this.entries.remove(obj);
            return true;
        } finally {
            writeLock.unlock();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.entries.entrySet().toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.entries.entrySet().toArray(objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        try {
            writeLock.lock();
            this.head = null;
            this.entries.clear();
        } finally {
            writeLock.unlock();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        long j = this.f80623ID;
        return ((int) (j ^ (j >>> 32))) + 31;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f80623ID == ((AbstractConcurrentSet) obj).f80623ID;
    }

    public abstract class Entry implements ISetEntry {
        public Entry next;
        public Entry predecessor;

        public Entry(Entry entry) {
            this.next = entry;
            entry.predecessor = this;
        }

        public Entry() {
        }

        @Override // net.engio.mbassy.common.ISetEntry
        public void remove() {
            Entry entry = this.predecessor;
            if (entry != null) {
                entry.next = this.next;
                Entry entry2 = this.next;
                if (entry2 != null) {
                    entry2.predecessor = entry;
                    return;
                }
                return;
            }
            Entry entry3 = this.next;
            if (entry3 != null) {
                entry3.predecessor = null;
            }
        }

        @Override // net.engio.mbassy.common.ISetEntry
        public Entry next() {
            return this.next;
        }

        @Override // net.engio.mbassy.common.ISetEntry
        public void clear() {
            this.next = null;
        }
    }
}
