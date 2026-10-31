package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P3JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8583 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3644 f26214;

    public C8583(C3644 c3644) {
        this.f26214 = c3644;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26214 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C3644 c3644 = this.f26214;
        if (c3644 == null) {
            throw new NoSuchElementException();
        }
        InterfaceC13206 interfaceC13206 = c3644.f11500;
        this.f26214 = this.f26214.f11498;
        return interfaceC13206;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
