package l;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܿۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z93V */
/* JADX INFO: loaded from: classes4.dex */
public final class C17134 extends AbstractList implements List, RandomAccess {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14311 f52488;

    public C17134(C14311 c14311) {
        this.f52488 = c14311;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f52488.m34167();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f52488.m34168(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40158() {
        ((AbstractList) this).modCount++;
    }
}
