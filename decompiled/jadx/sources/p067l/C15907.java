package p067l;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܳۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5DP */
/* JADX INFO: loaded from: classes3.dex */
public final class C15907 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: ᩸ */
    public final Object[] f46016;

    public C15907(Object[] objArr) {
        this.f46016 = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46016.length;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f46016[i];
    }
}
