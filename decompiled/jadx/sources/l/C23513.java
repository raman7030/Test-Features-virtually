package l;

/* JADX INFO: renamed from: l.᩻ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23513 extends AbstractC14545 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final transient int f75472;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient Object[] f75473;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient int f75474;

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo19283() {
        return true;
    }

    public C23513(int i, int i2, Object[] objArr) {
        this.f75473 = objArr;
        this.f75472 = i;
        this.f75474 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C4025.m12103(i, this.f75474);
        Object obj = this.f75473[(i * 2) + this.f75472];
        C11003.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f75474;
    }

    @Override // l.AbstractC14545, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
