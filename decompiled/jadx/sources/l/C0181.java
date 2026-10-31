package l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4RU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0181 implements ListIterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5121 f1401;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC8649 f1402;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC8649 f1403;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC8649 f1404;

    public C0181(C5121 c5121) {
        this.f1401 = c5121;
        if (c5121.size() < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (c5121.size() == 0) {
            this.f1403 = null;
            this.f1404 = c5121.getLast();
        } else {
            AbstractC8649 first = c5121.getFirst();
            this.f1403 = first;
            this.f1404 = first.f26402;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1403 != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        AbstractC8649 abstractC8649 = this.f1403;
        if (abstractC8649 == null) {
            throw new NoSuchElementException();
        }
        this.f1404 = abstractC8649;
        this.f1403 = abstractC8649.f26401;
        this.f1402 = abstractC8649;
        return abstractC8649;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        AbstractC8649 abstractC8649 = this.f1402;
        if (abstractC8649 != null) {
            AbstractC8649 abstractC86410 = this.f1403;
            if (abstractC8649 == abstractC86410) {
                this.f1403 = abstractC86410.f26401;
            } else {
                this.f1404 = this.f1404.f26402;
            }
            this.f1401.m14670(abstractC8649);
            this.f1402 = null;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1404 != null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        AbstractC8649 abstractC8649 = this.f1404;
        if (abstractC8649 == null) {
            throw new NoSuchElementException();
        }
        this.f1403 = abstractC8649;
        this.f1404 = abstractC8649.f26402;
        this.f1402 = abstractC8649;
        return abstractC8649;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        AbstractC8649 abstractC8649 = this.f1403;
        C5121 c5121 = this.f1401;
        if (abstractC8649 == null) {
            return c5121.size();
        }
        if (c5121.f16040 == null) {
            c5121.f16040 = c5121.toArray();
        }
        return this.f1403.f26398;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        if (this.f1404 == null) {
            return -1;
        }
        C5121 c5121 = this.f1401;
        if (c5121.f16040 == null) {
            c5121.f16040 = c5121.toArray();
        }
        return this.f1404.f26398;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        AbstractC8649 abstractC8649 = this.f1403;
        C5121 c5121 = this.f1401;
        if (abstractC8649 != null) {
            c5121.m14671(abstractC8649, (AbstractC8649) obj);
        } else {
            AbstractC8649 abstractC86410 = this.f1404;
            if (abstractC86410 != null) {
                c5121.m14667(abstractC86410, (AbstractC8649) obj);
            } else {
                c5121.m14666((AbstractC8649) obj);
            }
        }
        this.f1404 = (AbstractC8649) obj;
        this.f1402 = null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        AbstractC8649 abstractC8649 = this.f1402;
        if (abstractC8649 != null) {
            AbstractC8649 abstractC86410 = (AbstractC8649) obj;
            this.f1401.m14672(abstractC8649, abstractC86410);
            if (this.f1402 == this.f1404) {
                this.f1404 = abstractC86410;
                return;
            } else {
                this.f1403 = abstractC86410;
                return;
            }
        }
        throw new IllegalStateException();
    }
}
