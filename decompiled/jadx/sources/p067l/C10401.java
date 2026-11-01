package p067l;

import java.nio.file.DirectoryIteratorException;
import java.p066io.UncheckedIOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10401 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator f28765a;

    public C10401(Iterator it) {
        this.f28765a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        try {
            return this.f28765a.hasNext();
        } catch (DirectoryIteratorException e) {
            throw new UncheckedIOException(e.getCause());
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            return (InterfaceC22097) this.f28765a.next();
        } catch (DirectoryIteratorException e) {
            throw new UncheckedIOException(e.getCause());
        }
    }
}
