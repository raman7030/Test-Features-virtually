package p067l;

import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۡۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85J6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10791 extends AbstractC11462 implements ListIterator {
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f31970).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f31970).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo8107(((ListIterator) this.f31970).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f31970).previousIndex();
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
