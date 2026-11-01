package p067l;

/* JADX INFO: renamed from: l.ܽۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: G552 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18009 extends AbstractC16192 {

    /* JADX INFO: renamed from: ۬ */
    public static final AbstractC16192 f53770 = new C18009(0, new Object[0]);

    /* JADX INFO: renamed from: ۗ */
    public final transient int f53771;

    /* JADX INFO: renamed from: ۙ */
    public final transient Object[] f53772;

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return false;
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܿ */
    public final int mo26253() {
        return 0;
    }

    public C18009(int i, Object[] objArr) {
        this.f53772 = objArr;
        this.f53771 = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f53771;
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܽ */
    public final Object[] mo26252() {
        return this.f53772;
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ᩳ */
    public final int mo26254() {
        return this.f53771;
    }

    @Override // p067l.AbstractC16192, p067l.AbstractC23966
    /* JADX INFO: renamed from: ֫ */
    public final int mo26245(int i, Object[] objArr) {
        Object[] objArr2 = this.f53772;
        int i2 = this.f53771;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C6194.m14023(i, this.f53771);
        Object obj = this.f53772[i];
        C12826.requireNonNull(obj);
        return obj;
    }

    @Override // p067l.AbstractC16192, p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }
}
