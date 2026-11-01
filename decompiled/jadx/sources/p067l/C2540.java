package p067l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4RU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2540 implements ListIterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C7235 f4175;

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC10588 f4176;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC10588 f4177;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC10588 f4178;

    public C2540(C7235 c7235) {
        this.f4175 = c7235;
        if (c7235.size() < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (c7235.size() == 0) {
            this.f4177 = null;
            this.f4178 = c7235.getLast();
        } else {
            AbstractC10588 first = c7235.getFirst();
            this.f4177 = first;
            this.f4178 = first.f29320;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4177 != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        AbstractC10588 abstractC10588 = this.f4177;
        if (abstractC10588 == null) {
            throw new NoSuchElementException();
        }
        this.f4178 = abstractC10588;
        this.f4177 = abstractC10588.f29319;
        this.f4176 = abstractC10588;
        return abstractC10588;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        AbstractC10588 abstractC10588 = this.f4176;
        if (abstractC10588 != null) {
            AbstractC10588 abstractC10589 = this.f4177;
            if (abstractC10588 == abstractC10589) {
                this.f4177 = abstractC10589.f29319;
            } else {
                this.f4178 = this.f4178.f29320;
            }
            this.f4175.m16578(abstractC10588);
            this.f4176 = null;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4178 != null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        AbstractC10588 abstractC10588 = this.f4178;
        if (abstractC10588 == null) {
            throw new NoSuchElementException();
        }
        this.f4177 = abstractC10588;
        this.f4178 = abstractC10588.f29320;
        this.f4176 = abstractC10588;
        return abstractC10588;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        AbstractC10588 abstractC10588 = this.f4177;
        C7235 c7235 = this.f4175;
        if (abstractC10588 == null) {
            return c7235.size();
        }
        if (c7235.f18874 == null) {
            c7235.f18874 = c7235.toArray();
        }
        return this.f4177.f29316;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        if (this.f4178 == null) {
            return -1;
        }
        C7235 c7235 = this.f4175;
        if (c7235.f18874 == null) {
            c7235.f18874 = c7235.toArray();
        }
        return this.f4178.f29316;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        AbstractC10588 abstractC10588 = this.f4177;
        C7235 c7235 = this.f4175;
        if (abstractC10588 != null) {
            c7235.m16579(abstractC10588, (AbstractC10588) obj);
        } else {
            AbstractC10588 abstractC10589 = this.f4178;
            if (abstractC10589 != null) {
                c7235.m16575(abstractC10589, (AbstractC10588) obj);
            } else {
                c7235.m16574((AbstractC10588) obj);
            }
        }
        this.f4178 = (AbstractC10588) obj;
        this.f4176 = null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        AbstractC10588 abstractC10588 = this.f4176;
        if (abstractC10588 != null) {
            AbstractC10588 abstractC10589 = (AbstractC10588) obj;
            this.f4175.m16580(abstractC10588, abstractC10589);
            if (this.f4176 == this.f4178) {
                this.f4178 = abstractC10589;
                return;
            } else {
                this.f4177 = abstractC10589;
                return;
            }
        }
        throw new IllegalStateException();
    }
}
