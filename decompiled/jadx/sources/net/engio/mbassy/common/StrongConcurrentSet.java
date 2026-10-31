package net.engio.mbassy.common;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class StrongConcurrentSet extends AbstractConcurrentSet {
    public StrongConcurrentSet() {
        super(new HashMap());
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new Iterator() { // from class: net.engio.mbassy.common.StrongConcurrentSet.1
            public ISetEntry current;

            {
                this.current = StrongConcurrentSet.this.head;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.current != null;
            }

            @Override // java.util.Iterator
            public Object next() {
                ISetEntry iSetEntry = this.current;
                if (iSetEntry == null) {
                    return null;
                }
                Object value = iSetEntry.getValue();
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
                StrongConcurrentSet.this.remove(this.current.getValue());
                this.current = next;
            }
        };
    }

    @Override // net.engio.mbassy.common.AbstractConcurrentSet
    public AbstractConcurrentSet.Entry createEntry(Object obj, AbstractConcurrentSet.Entry entry) {
        return entry != null ? new StrongEntry(obj, entry) : new StrongEntry(obj);
    }

    public class StrongEntry extends AbstractConcurrentSet.Entry {
        public Object value;

        public StrongEntry(Object obj, AbstractConcurrentSet.Entry entry) {
            super(entry);
            this.value = obj;
        }

        public StrongEntry(Object obj) {
            this.value = obj;
        }

        @Override // net.engio.mbassy.common.ISetEntry
        public Object getValue() {
            return this.value;
        }
    }
}
