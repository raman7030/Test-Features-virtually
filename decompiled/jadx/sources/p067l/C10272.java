package p067l;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes3.dex */
public final class C10272 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f28433;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterable f28434;

    public C10272(Iterable iterable) {
        this.f28434 = iterable;
        this.f28433 = iterable.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28433.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C9829.toPath((File) this.f28433.next());
    }
}
