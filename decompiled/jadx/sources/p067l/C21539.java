package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21539 extends AbstractC21520 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f67929;

    /* JADX INFO: renamed from: ᩹ */
    public final Object f67930;

    public C21539(Object obj) {
        this.f67930 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f67929;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f67929) {
            throw new NoSuchElementException();
        }
        this.f67929 = true;
        return this.f67930;
    }
}
