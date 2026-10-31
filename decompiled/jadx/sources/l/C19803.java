package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19803 extends AbstractC21731 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10630 f63958;

    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C19803(C10630 c10630) {
        this.f63958 = c10630;
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C13451(this.f63958);
    }

    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C12746(this.f63958);
    }

    @Override // l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        C10630 c10630 = this.f63958;
        int[] iArr = c10630.f31934;
        int[] iArr2 = c10630.f31942;
        if (c10630.f31944) {
            intConsumer.accept(iArr2[c10630.f31939]);
        }
        int i = c10630.f31939;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                intConsumer.accept(iArr2[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f63958.f31945;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return this.f63958.m26667(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f63958.clear();
    }
}
