package p067l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۨᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13674 extends AbstractC23022 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11683 f38532;

    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C13674(C11683 c11683) {
        this.f38532 = c11683;
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C9000(this.f38532);
    }

    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C22412(this.f38532);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        C11683 c11683 = this.f38532;
        Object[] objArr = c11683.f32577;
        int[] iArr = c11683.f32587;
        if (c11683.f32585) {
            intConsumer.accept(iArr[c11683.f32578]);
        }
        int i = c11683.f32578;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (objArr[i2] != null) {
                intConsumer.accept(iArr[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f38532.f32580;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return this.f38532.mo23940(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f38532.clear();
    }
}
