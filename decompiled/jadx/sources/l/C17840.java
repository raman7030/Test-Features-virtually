package l;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ᩳۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z93V */
/* JADX INFO: loaded from: classes4.dex */
public final class C17840 extends AbstractList implements List, RandomAccess {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14311 f54492;

    public C17840(C14311 c14311) {
        this.f54492 = c14311;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f54492.m34167();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f54492.m34164(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41771() {
        ((AbstractList) this).modCount++;
    }
}
