package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܿۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18680 extends AbstractC8146 {

    /* JADX INFO: renamed from: ۗ */
    public final transient int f55756;

    /* JADX INFO: renamed from: ۙ */
    public final transient Object[] f55757;

    /* JADX INFO: renamed from: ۫ */
    public final transient int f55758;

    /* JADX INFO: renamed from: ۬ */
    public final transient AbstractC11500 f55759;

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return true;
    }

    public C18680(AbstractC11500 abstractC11500, Object[] objArr, int i, int i2) {
        this.f55759 = abstractC11500;
        this.f55757 = objArr;
        this.f55756 = i;
        this.f55758 = i2;
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC21520 iterator() {
        return mo18927().listIterator(0);
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ֫ */
    public final int mo26245(int i, Object[] objArr) {
        return mo18927().mo26245(i, objArr);
    }

    @Override // p067l.AbstractC8146
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC16192 mo8248() {
        return new C19351(this);
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f55759.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f55758;
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }
}
