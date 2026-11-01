package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89QF */
/* JADX INFO: loaded from: classes3.dex */
public final class C13651 implements Iterable, Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final int f38413;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC14680 f38414;

    /* JADX INFO: renamed from: ᩹ */
    public int f38415;

    public C13651(int i, InterfaceC14680 interfaceC14680) {
        this.f38413 = i;
        this.f38414 = interfaceC14680;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        this.f38415 = 0;
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38415 < this.f38413;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f38415;
        this.f38415 = i + 1;
        return this.f38414.apply(i);
    }
}
