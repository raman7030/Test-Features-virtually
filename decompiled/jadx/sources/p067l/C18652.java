package p067l;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܿۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z93V */
/* JADX INFO: loaded from: classes4.dex */
public final class C18652 extends AbstractList implements List, RandomAccess {

    /* JADX INFO: renamed from: ᩸ */
    public C15969 f55671;

    public C18652(C15969 c15969) {
        this.f55671 = c15969;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f55671.m36300();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f55671.m36301(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42403() {
        ((AbstractList) this).modCount++;
    }
}
