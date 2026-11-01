package p067l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܶ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17164 extends AbstractC8269 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C12472 f51108;

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C17164(C12472 c12472) {
        this.f51108 = c12472;
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C10460(this.f51108);
    }

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C23201(this.f51108);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        C12472 c12472 = this.f51108;
        int[] iArr = c12472.f34906;
        if (c12472.f34916) {
            intConsumer.accept(iArr[c12472.f34911]);
        }
        int i = c12472.f34911;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int i3 = iArr[i2];
            if (i3 != 0) {
                intConsumer.accept(i3);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f51108.f34917;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return this.f51108.mo25658(i);
    }

    @Override // p067l.AbstractC8269
    public final boolean remove(int i) {
        C12472 c12472 = this.f51108;
        int i2 = c12472.f34917;
        c12472.remove(i);
        return c12472.f34917 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f51108.clear();
    }
}
