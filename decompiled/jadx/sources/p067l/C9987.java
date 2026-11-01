package p067l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۠ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9987 extends AbstractC8269 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6634 f27668;

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C9987(C6634 c6634) {
        this.f27668 = c6634;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return this.f27668.m15118(i) != -1;
    }

    @Override // p067l.AbstractC8269
    public final boolean remove(int i) {
        C6634 c6634 = this.f27668;
        int iM15118 = c6634.m15118(i);
        if (iM15118 == -1) {
            return false;
        }
        int i2 = (c6634.f17107 - iM15118) - 1;
        int[] iArr = c6634.f17111;
        int i3 = iM15118 + 1;
        System.arraycopy(iArr, i3, iArr, iM15118, i2);
        Object[] objArr = c6634.f17106;
        System.arraycopy(objArr, i3, objArr, iM15118, i2);
        int i4 = c6634.f17107 - 1;
        c6634.f17107 = i4;
        c6634.f17106[i4] = null;
        return true;
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C7305(this);
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C7305(this);
    }

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C3281(this, 0, this.f27668.f17107);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        C6634 c6634 = this.f27668;
        int[] iArr = c6634.f17111;
        int i = c6634.f17107;
        for (int i2 = 0; i2 < i; i2++) {
            intConsumer.accept(iArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27668.f17107;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f27668.clear();
    }
}
