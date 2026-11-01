package p067l;

import java.util.AbstractMap;

/* JADX INFO: renamed from: l.ᩳۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19351 extends AbstractC16192 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C18680 f57764;

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return true;
    }

    public C19351(C18680 c18680) {
        this.f57764 = c18680;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C18680 c18680 = this.f57764;
        C6194.m14023(i, c18680.f55758);
        int i2 = i * 2;
        Object obj = c18680.f55757[c18680.f55756 + i2];
        C12826.requireNonNull(obj);
        Object obj2 = c18680.f55757[i2 + (c18680.f55756 ^ 1)];
        C12826.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f57764.f55758;
    }

    @Override // p067l.AbstractC16192, p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }
}
