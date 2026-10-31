package l;

import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۡۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85J6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8862 extends AbstractC9568 implements ListIterator {
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f29023).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f29023).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo5897(((ListIterator) this.f29023).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f29023).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }
}
