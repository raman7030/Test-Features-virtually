package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܶ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15567 extends AbstractC6208 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10630 f47976;

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C15567(C10630 c10630) {
        this.f47976 = c10630;
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C8513(this.f47976);
    }

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C21919(this.f47976);
    }

    @Override // l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        C10630 c10630 = this.f47976;
        int[] iArr = c10630.f31934;
        if (c10630.f31944) {
            intConsumer.accept(iArr[c10630.f31939]);
        }
        int i = c10630.f31939;
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
        return this.f47976.f31945;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return this.f47976.mo23659(i);
    }

    @Override // l.AbstractC6208
    public final boolean remove(int i) {
        C10630 c10630 = this.f47976;
        int i2 = c10630.f31945;
        c10630.remove(i);
        return c10630.f31945 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47976.clear();
    }
}
