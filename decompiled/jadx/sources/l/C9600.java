package l;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9IP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9600 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8894 f29131;

    public C9600(C8894 c8894) {
        this.f29131 = c8894;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        try {
            return this.f29131.available() > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            return this.f29131.readObject();
        } catch (Exception e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported on ASN.1 InputStream iterator");
    }
}
