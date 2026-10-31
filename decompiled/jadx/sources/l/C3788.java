package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R4U5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3788 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f11964 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18605 f11965;

    public C3788(AbstractC18605 abstractC18605) {
        this.f11965 = abstractC18605;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11964 < this.f11965.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f11964;
        this.f11964 = i + 1;
        return this.f11965.mo16999(i);
    }
}
