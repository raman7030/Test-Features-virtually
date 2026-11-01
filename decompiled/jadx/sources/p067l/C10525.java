package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P3JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10525 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public C5831 f29131;

    public C10525(C5831 c5831) {
        this.f29131 = c5831;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29131 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C5831 c5831 = this.f29131;
        if (c5831 == null) {
            throw new NoSuchElementException();
        }
        InterfaceC14919 interfaceC14919 = c5831.f14306;
        this.f29131 = this.f29131.f14304;
        return interfaceC14919;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
