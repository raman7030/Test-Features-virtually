package net.engio.mbassy.common;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class WeakConcurrentSet extends AbstractConcurrentSet {
    public WeakConcurrentSet() {
        super(new WeakHashMap());
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new Iterator() { // from class: net.engio.mbassy.common.WeakConcurrentSet.1
            public ISetEntry current;

            {
                this.current = WeakConcurrentSet.this.head;
            }

            private void removeOrphans() {
                ISetEntry iSetEntry;
                ReentrantReadWriteLock.WriteLock writeLock = WeakConcurrentSet.this.lock.writeLock();
                try {
                    writeLock.lock();
                    do {
                        ISetEntry iSetEntry2 = this.current;
                        this.current = iSetEntry2.next();
                        WeakConcurrentSet weakConcurrentSet = WeakConcurrentSet.this;
                        AbstractConcurrentSet.Entry entry = weakConcurrentSet.head;
                        if (iSetEntry2 == entry) {
                            weakConcurrentSet.head = entry.next();
                        }
                        iSetEntry2.remove();
                        iSetEntry = this.current;
                        if (iSetEntry == null) {
                            break;
                        }
                    } while (iSetEntry.getValue() == null);
                } finally {
                    writeLock.unlock();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                ISetEntry iSetEntry = this.current;
                if (iSetEntry == null) {
                    return false;
                }
                if (iSetEntry.getValue() != null) {
                    return true;
                }
                removeOrphans();
                return this.current != null;
            }

            @Override // java.util.Iterator
            public Object next() {
                ISetEntry iSetEntry = this.current;
                if (iSetEntry == null) {
                    return null;
                }
                Object value = iSetEntry.getValue();
                if (value == null) {
                    removeOrphans();
                    return next();
                }
                this.current = this.current.next();
                return value;
            }

            @Override // java.util.Iterator
            public void remove() {
                ISetEntry iSetEntry = this.current;
                if (iSetEntry == null) {
                    return;
                }
                ISetEntry next = iSetEntry.next();
                WeakConcurrentSet.this.remove(this.current.getValue());
                this.current = next;
            }
        };
    }

    @Override // net.engio.mbassy.common.AbstractConcurrentSet
    public AbstractConcurrentSet.Entry createEntry(Object obj, AbstractConcurrentSet.Entry entry) {
        return entry != null ? new WeakEntry(obj, entry) : new WeakEntry(obj);
    }

    public class WeakEntry extends AbstractConcurrentSet.Entry {
        public WeakReference value;

        public WeakEntry(Object obj, AbstractConcurrentSet.Entry entry) {
            super(entry);
            this.value = new WeakReference(obj);
        }

        public WeakEntry(Object obj) {
            this.value = new WeakReference(obj);
        }

        @Override // net.engio.mbassy.common.ISetEntry
        public Object getValue() {
            return this.value.get();
        }
    }
}
