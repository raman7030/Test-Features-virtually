package l;

import java.util.AbstractMap;

/* JADX INFO: renamed from: l.ᩳۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17869 extends AbstractC14545 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17163 f54566;

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo19283() {
        return true;
    }

    public C17869(C17163 c17163) {
        this.f54566 = c17163;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C17163 c17163 = this.f54566;
        C4025.m12103(i, c17163.f52575);
        int i2 = i * 2;
        Object obj = c17163.f52574[c17163.f52573 + i2];
        C11003.requireNonNull(obj);
        Object obj2 = c17163.f52574[i2 + (c17163.f52573 ^ 1)];
        C11003.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f54566.f52575;
    }

    @Override // l.AbstractC14545, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
