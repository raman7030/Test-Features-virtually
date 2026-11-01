package p067l;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۧ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12822 extends C8817 {

    /* JADX INFO: renamed from: ܳ */
    public transient Object[] f36069;

    /* JADX INFO: renamed from: ܿ */
    public transient Object[] f36070;

    /* JADX INFO: renamed from: ᩳ */
    public final Comparator f36071;

    @Override // p067l.C8817
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11500 mo20377() {
        throw null;
    }

    public C12822(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f36071 = comparator;
        this.f36070 = new Object[4];
        this.f36069 = new Object[4];
    }

    @Override // p067l.C8817
    /* JADX INFO: renamed from: ֫ */
    public final C8817 mo20376(Object obj, Object obj2) {
        int i = this.f23935 + 1;
        Object[] objArr = this.f36070;
        if (i > objArr.length) {
            int iM30297 = AbstractC13238.m30297(objArr.length, i);
            this.f36070 = Arrays.copyOf(this.f36070, iM30297);
            this.f36069 = Arrays.copyOf(this.f36069, iM30297);
        }
        C23335.m51957(obj, obj2);
        Object[] objArr2 = this.f36070;
        int i2 = this.f23935;
        objArr2[i2] = obj;
        this.f36069[i2] = obj2;
        this.f23935 = i2 + 1;
        return this;
    }

    @Override // p067l.C8817
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC11500 mo20378() {
        int i = this.f23935;
        Comparator comparator = this.f36071;
        if (i == 0) {
            return C19527.m44365(comparator);
        }
        if (i == 1) {
            Object obj = this.f36070[0];
            C12826.requireNonNull(obj);
            Object obj2 = this.f36069[0];
            C12826.requireNonNull(obj2);
            AbstractC16192 abstractC16192M36873of = AbstractC16192.m36873of(obj);
            comparator.getClass();
            return new C19527(new C11305(abstractC16192M36873of, comparator), AbstractC16192.m36873of(obj2), null);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f36070, i);
        Arrays.sort(objArrCopyOf, comparator);
        int i2 = this.f23935;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < this.f23935; i3++) {
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (comparator.compare(objArrCopyOf[i4], objArrCopyOf[i3]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i4] + " and " + objArrCopyOf[i3]);
                }
            }
            Object obj3 = this.f36070[i3];
            C12826.requireNonNull(obj3);
            int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator);
            Object obj4 = this.f36069[i3];
            C12826.requireNonNull(obj4);
            objArr[iBinarySearch] = obj4;
        }
        return new C19527(new C11305(AbstractC16192.m36884(objArrCopyOf.length, objArrCopyOf), comparator), AbstractC16192.m36884(i2, objArr), null);
    }
}
