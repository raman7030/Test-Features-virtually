package org.simpleframework.xml.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class OutputStack extends ArrayList {
    public final Set active;

    public OutputStack(Set set) {
        this.active = set;
    }

    public OutputNode pop() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return purge(size - 1);
    }

    public OutputNode top() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return (OutputNode) get(size - 1);
    }

    public OutputNode bottom() {
        if (size() <= 0) {
            return null;
        }
        return (OutputNode) get(0);
    }

    public OutputNode push(OutputNode outputNode) {
        this.active.add(outputNode);
        add(outputNode);
        return outputNode;
    }

    public OutputNode purge(int i) {
        OutputNode outputNode = (OutputNode) remove(i);
        if (outputNode != null) {
            this.active.remove(outputNode);
        }
        return outputNode;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new Sequence();
    }

    public class Sequence implements Iterator {
        public int cursor;

        public Sequence() {
            this.cursor = OutputStack.this.size();
        }

        @Override // java.util.Iterator
        public OutputNode next() {
            if (!hasNext()) {
                return null;
            }
            OutputStack outputStack = OutputStack.this;
            int i = this.cursor - 1;
            this.cursor = i;
            return (OutputNode) outputStack.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.cursor > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            OutputStack.this.purge(this.cursor);
        }
    }
}
