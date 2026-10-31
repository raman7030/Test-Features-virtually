package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7019 extends AbstractC6208 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19720 f21661;

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C7019(C19720 c19720) {
        this.f21661 = c19720;
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C23952(this.f21661);
    }

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C21131(this.f21661);
    }

    @Override // l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        C19720 c19720 = this.f21661;
        int[] iArr = c19720.f63729;
        if (c19720.f63737) {
            intConsumer.accept(iArr[c19720.f63730]);
        }
        int i = c19720.f63730;
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
        return this.f21661.f63732;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return this.f21661.mo2422(i);
    }

    @Override // l.AbstractC6208
    public final boolean remove(int i) {
        C19720 c19720 = this.f21661;
        int i2 = c19720.f63732;
        c19720.remove(i);
        return c19720.f63732 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f21661.clear();
    }
}
