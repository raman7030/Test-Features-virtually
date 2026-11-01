package p067l;

/* JADX INFO: renamed from: l.᩷ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J58E */
/* JADX INFO: loaded from: classes5.dex */
public final class C22034 extends AbstractC8146 {

    /* JADX INFO: renamed from: ۛ */
    public static final C22034 f69338;

    /* JADX INFO: renamed from: ۨ */
    public static final Object[] f69339;

    /* JADX INFO: renamed from: ۗ */
    public final transient int f69340;

    /* JADX INFO: renamed from: ۙ */
    public final transient Object[] f69341;

    /* JADX INFO: renamed from: ۤ */
    public final transient Object[] f69342;

    /* JADX INFO: renamed from: ۫ */
    public final transient int f69343;

    /* JADX INFO: renamed from: ۬ */
    public final transient int f69344;

    @Override // p067l.AbstractC8146
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo18926() {
        return true;
    }

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

    static {
        Object[] objArr = new Object[0];
        f69339 = objArr;
        f69338 = new C22034(0, 0, 0, objArr, objArr);
    }

    public C22034(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f69341 = objArr;
        this.f69340 = i;
        this.f69342 = objArr2;
        this.f69344 = i2;
        this.f69343 = i3;
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f69342;
            if (objArr.length != 0) {
                int iM11132 = C5191.m11132(obj);
                while (true) {
                    int i = iM11132 & this.f69344;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM11132 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f69343;
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC21520 iterator() {
        return mo18927().listIterator(0);
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܽ */
    public final Object[] mo26252() {
        return this.f69341;
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ᩳ */
    public final int mo26254() {
        return this.f69343;
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ֫ */
    public final int mo26245(int i, Object[] objArr) {
        Object[] objArr2 = this.f69341;
        int i2 = this.f69343;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p067l.AbstractC8146
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC16192 mo8248() {
        return AbstractC16192.m36884(this.f69343, this.f69341);
    }

    @Override // p067l.AbstractC8146, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f69340;
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }
}
