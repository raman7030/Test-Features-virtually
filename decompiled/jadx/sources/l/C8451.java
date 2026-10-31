package l;

import java.io.UncheckedIOException;
import java.nio.file.DirectoryIteratorException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8451 implements Iterator {
    public final /* synthetic */ Iterator a;

    public C8451(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        try {
            return this.a.hasNext();
        } catch (DirectoryIteratorException e) {
            throw new UncheckedIOException(e.getCause());
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            return (InterfaceC20758) this.a.next();
        } catch (DirectoryIteratorException e) {
            throw new UncheckedIOException(e.getCause());
        }
    }
}
