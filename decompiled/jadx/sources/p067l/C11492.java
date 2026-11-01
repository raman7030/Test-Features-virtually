package p067l;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9IP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11492 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C10821 f32078;

    public C11492(C10821 c10821) {
        this.f32078 = c10821;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        try {
            return this.f32078.available() > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            return this.f32078.readObject();
        } catch (Exception e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported on ASN.1 InputStream iterator");
    }
}
