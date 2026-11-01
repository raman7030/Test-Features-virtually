package p067l;

/* JADX INFO: renamed from: l.᩻ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24715 extends AbstractC16192 {

    /* JADX INFO: renamed from: ۗ */
    public final transient int f78219;

    /* JADX INFO: renamed from: ۙ */
    public final transient Object[] f78220;

    /* JADX INFO: renamed from: ۬ */
    public final transient int f78221;

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return true;
    }

    public C24715(int i, int i2, Object[] objArr) {
        this.f78220 = objArr;
        this.f78219 = i;
        this.f78221 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C6194.m14023(i, this.f78221);
        Object obj = this.f78220[(i * 2) + this.f78219];
        C12826.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f78221;
    }

    @Override // p067l.AbstractC16192, p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }
}
