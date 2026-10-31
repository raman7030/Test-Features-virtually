package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C19553 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f63214;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Iterator f63215;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C19553(Iterator it) {
        C11233.m27805(it, "iterator");
        this.f63215 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63215.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f63214;
        this.f63214 = i + 1;
        if (i >= 0) {
            return new C4030(i, this.f63215.next());
        }
        throw new ArithmeticException("Index overflow has happened.");
    }
}
