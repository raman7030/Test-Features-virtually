package l;

/* JADX INFO: renamed from: l.᩷ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J58E */
/* JADX INFO: loaded from: classes5.dex */
public final class C20692 extends AbstractC6079 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C20692 f66656;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Object[] f66657;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final transient int f66658;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient Object[] f66659;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final transient Object[] f66660;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient int f66661;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient int f66662;

    @Override // l.AbstractC6079
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo16995() {
        return true;
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo19283() {
        return false;
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܿ */
    public final int mo24243() {
        return 0;
    }

    static {
        Object[] objArr = new Object[0];
        f66657 = objArr;
        f66656 = new C20692(0, 0, 0, objArr, objArr);
    }

    public C20692(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f66659 = objArr;
        this.f66658 = i;
        this.f66660 = objArr2;
        this.f66662 = i2;
        this.f66661 = i3;
    }

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f66660;
            if (objArr.length != 0) {
                int iM9080 = C2970.m9080(obj);
                while (true) {
                    int i = iM9080 & this.f66662;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM9080 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f66661;
    }

    @Override // l.AbstractC6079, l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC20151 iterator() {
        return mo16996().listIterator(0);
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܽ */
    public final Object[] mo24242() {
        return this.f66659;
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ᩳ */
    public final int mo24244() {
        return this.f66661;
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ֫ */
    public final int mo24235(int i, Object[] objArr) {
        Object[] objArr2 = this.f66659;
        int i2 = this.f66661;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // l.AbstractC6079
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC14545 mo6050() {
        return AbstractC14545.m34735(this.f66661, this.f66659);
    }

    @Override // l.AbstractC6079, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f66658;
    }

    @Override // l.AbstractC6079, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
