package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۨᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11895 extends AbstractC21731 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9800 f35522;

    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C11895(C9800 c9800) {
        this.f35522 = c9800;
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C6977(this.f35522);
    }

    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C21089(this.f35522);
    }

    @Override // l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        C9800 c9800 = this.f35522;
        Object[] objArr = c9800.f29626;
        int[] iArr = c9800.f29636;
        if (c9800.f29634) {
            intConsumer.accept(iArr[c9800.f29627]);
        }
        int i = c9800.f29627;
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
        return this.f35522.f29629;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return this.f35522.mo21969(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f35522.clear();
    }
}
