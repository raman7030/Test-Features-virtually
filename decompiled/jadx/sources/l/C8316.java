package l;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8316 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f25522;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f25523;

    public C8316(Iterable iterable) {
        this.f25523 = iterable;
        this.f25522 = iterable.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25522.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C7850.toPath((File) this.f25522.next());
    }
}
