package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C20952 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public int f65834;

    /* JADX INFO: renamed from: ᩹ */
    public final Iterator f65835;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C20952(Iterator it) {
        C13045.m29867(it, "iterator");
        this.f65835 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f65835.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f65834;
        this.f65834 = i + 1;
        if (i >= 0) {
            return new C6199(i, this.f65835.next());
        }
        throw new ArithmeticException("Index overflow has happened.");
    }
}
