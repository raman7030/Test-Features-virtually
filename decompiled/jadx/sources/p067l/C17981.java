package p067l;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܽۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z93V */
/* JADX INFO: loaded from: classes4.dex */
public final class C17981 extends AbstractList implements List, RandomAccess {

    /* JADX INFO: renamed from: ᩸ */
    public C15969 f53700;

    public C17981(C15969 c15969) {
        this.f53700 = c15969;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f53700.m36300();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f53700.m36291(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40925() {
        ((AbstractList) this).modCount++;
    }
}
