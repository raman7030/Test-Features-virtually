package p067l;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܿܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18985 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C25020 f56611;

    /* JADX INFO: renamed from: ᩶ */
    public C16302 f56612;

    /* JADX INFO: renamed from: ᩸ */
    public int f56613;

    /* JADX INFO: renamed from: ᩹ */
    public C16302 f56614 = null;

    public AbstractC18985(C25020 c25020) {
        this.f56611 = c25020;
        this.f56612 = c25020.f79870.f47914;
        this.f56613 = c25020.f79873;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56612 != this.f56611.f79870;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16302 m43134() {
        C16302 c16302 = this.f56612;
        C25020 c25020 = this.f56611;
        if (c16302 == c25020.f79870) {
            throw new NoSuchElementException();
        }
        if (c25020.f79873 != this.f56613) {
            throw new ConcurrentModificationException();
        }
        this.f56612 = c16302.f47914;
        this.f56614 = c16302;
        return c16302;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C16302 c16302 = this.f56614;
        if (c16302 == null) {
            throw new IllegalStateException();
        }
        C25020 c25020 = this.f56611;
        c25020.m54939(c16302, true);
        this.f56614 = null;
        this.f56613 = c25020.f79873;
    }

    @Override // java.util.Iterator
    public Object next() {
        return m43134();
    }
}
