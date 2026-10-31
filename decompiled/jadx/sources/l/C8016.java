package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۠ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8016 extends AbstractC6208 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4488 f24754;

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C8016(C4488 c4488) {
        this.f24754 = c4488;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return this.f24754.m13236(i) != -1;
    }

    @Override // l.AbstractC6208
    public final boolean remove(int i) {
        C4488 c4488 = this.f24754;
        int iM13236 = c4488.m13236(i);
        if (iM13236 == -1) {
            return false;
        }
        int i2 = (c4488.f14280 - iM13236) - 1;
        int[] iArr = c4488.f14284;
        int i3 = iM13236 + 1;
        System.arraycopy(iArr, i3, iArr, iM13236, i2);
        Object[] objArr = c4488.f14279;
        System.arraycopy(objArr, i3, objArr, iM13236, i2);
        int i4 = c4488.f14280 - 1;
        c4488.f14280 = i4;
        c4488.f14279[i4] = null;
        return true;
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5194(this);
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C5194(this);
    }

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C0960(this, 0, this.f24754.f14280);
    }

    @Override // l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        C4488 c4488 = this.f24754;
        int[] iArr = c4488.f14284;
        int i = c4488.f14280;
        for (int i2 = 0; i2 < i; i2++) {
            intConsumer.accept(iArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24754.f14280;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f24754.clear();
    }
}
