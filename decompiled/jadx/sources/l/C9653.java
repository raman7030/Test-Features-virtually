package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9653 extends AbstractC6208 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f29239;

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C9653(C5419 c5419) {
        this.f29239 = c5419;
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C20942(this.f29239);
    }

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C8947(this.f29239);
    }

    @Override // l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        C5419 c5419 = this.f29239;
        int[] iArr = c5419.f16906;
        if (c5419.f16907) {
            intConsumer.accept(iArr[c5419.f16902]);
        }
        int i = c5419.f16902;
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
        return this.f29239.f16901;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return this.f29239.mo15510(i);
    }

    @Override // l.AbstractC6208
    public final boolean remove(int i) {
        C5419 c5419 = this.f29239;
        int i2 = c5419.f16901;
        c5419.remove(i);
        return c5419.f16901 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f29239.clear();
    }
}
