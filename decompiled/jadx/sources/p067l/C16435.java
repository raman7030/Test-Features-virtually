package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.p066io.UncheckedIOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܳ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16435 implements Iterator, Closeable {

    /* JADX INFO: renamed from: a */
    public final C21131 f48306a;

    /* JADX INFO: renamed from: b */
    public C17776 f48307b;

    public C16435(InterfaceC22097 interfaceC22097, EnumC12709... enumC12709Arr) throws IOException {
        C21131 c21131 = new C21131(Arrays.asList(enumC12709Arr), Integer.MAX_VALUE);
        this.f48306a = c21131;
        if (c21131.f66413e) {
            throw new IllegalStateException("Closed");
        }
        C17776 c17776M47759e = c21131.m47759e(interfaceC22097, false);
        this.f48307b = c17776M47759e;
        IOException iOException = c17776M47759e.f53082d;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m37353b() {
        if (this.f48307b == null) {
            C17776 c17776M47758d = this.f48306a.m47758d();
            while (c17776M47758d != null) {
                IOException iOException = c17776M47758d.f53082d;
                if (iOException != null) {
                    throw new UncheckedIOException(iOException);
                }
                if (c17776M47758d.f53079a != EnumC6378.END_DIRECTORY) {
                    this.f48307b = c17776M47758d;
                    return;
                }
                c17776M47758d = this.f48306a.m47758d();
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f48306a.f66413e) {
            throw new IllegalStateException();
        }
        m37353b();
        return this.f48307b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f48306a.f66413e) {
            throw new IllegalStateException();
        }
        m37353b();
        C17776 c17776 = this.f48307b;
        if (c17776 == null) {
            throw new NoSuchElementException();
        }
        this.f48307b = null;
        return c17776;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f48306a.close();
    }
}
