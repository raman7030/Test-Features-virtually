package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1311 extends AbstractC21731 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8367 f4712;

    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C1311(C8367 c8367) {
        this.f4712 = c8367;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return this.f4712.mo21969(i);
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0605(this);
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C0605(this);
    }

    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C5545(this, 0, this.f4712.f25674);
    }

    @Override // l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        C8367 c8367 = this.f4712;
        int[] iArr = c8367.f25673;
        int i = c8367.f25674;
        for (int i2 = 0; i2 < i; i2++) {
            intConsumer.accept(iArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f4712.f25674;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f4712.clear();
    }
}
