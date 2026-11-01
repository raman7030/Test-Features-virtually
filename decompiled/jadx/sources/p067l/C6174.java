package p067l;

/* JADX INFO: renamed from: l.ۘܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBEJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6174 {

    /* JADX INFO: renamed from: ֫ */
    public final C21007 f15514;

    /* JADX INFO: renamed from: ۜ */
    public final int f15515;

    /* JADX INFO: renamed from: ۧ */
    public final C2665 f15516;

    /* JADX INFO: renamed from: ܳ */
    public final int f15517;

    /* JADX INFO: renamed from: ܽ */
    public final C14735 f15518;

    /* JADX INFO: renamed from: ܿ */
    public final C16231 f15519;

    /* JADX INFO: renamed from: ᩳ */
    public int[] f15520 = null;

    /* JADX INFO: renamed from: ᩷ */
    public final C4833 f15521;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f15522;

    /* JADX INFO: renamed from: ֫ */
    public static C21677 m13981(C14735 c14735, C2665 c2665, int i, C11619 c11619) {
        C18088 c18088M42784;
        int i2;
        C6174 c6174 = new C6174(c14735, c2665, i, c11619);
        C18759 c18759M33676 = c14735.m33676();
        int size = c18759M33676.size();
        int iM40215 = c18759M33676.m40215();
        int[] iArrM34734 = C15268.m34734(iM40215);
        int[] iArrM34735 = C15268.m34734(iM40215);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C15268.m34739(c18759M33676.m56522get(i4).mo4636(), iArrM34734);
        }
        int[] iArr = new int[size];
        int iM33678 = c14735.m33678();
        int i5 = 0;
        while (iM33678 != -1) {
            while (true) {
                C22388 c22388M33677 = c14735.m33677(iM33678);
                int size2 = c22388M33677.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        break;
                    }
                    i2 = c22388M33677.get(i6);
                    if (C15268.m34738(i2, iArrM34735)) {
                        break;
                    }
                    if (C15268.m34738(i2, iArrM34734) && c18759M33676.m42784(i2).m41139() == iM33678) {
                        break;
                    }
                    i6++;
                }
                C15268.m34739(i2, iArrM34735);
                iM33678 = i2;
            }
            while (iM33678 != -1) {
                C15268.m34732(iM33678, iArrM34734);
                C15268.m34732(iM33678, iArrM34735);
                iArr[i5] = iM33678;
                i5++;
                C18088 c18088M42785 = c18759M33676.m42784(iM33678);
                int iM41139 = c18088M42785.m41139();
                C22388 c22388M41137 = c18088M42785.m41137();
                int size3 = c22388M41137.size();
                if (size3 == 0) {
                    c18088M42784 = null;
                } else if (size3 != 1 && iM41139 != -1) {
                    c18088M42784 = c18759M33676.m42784(iM41139);
                } else {
                    c18088M42784 = c18759M33676.m42784(c22388M41137.get(0));
                }
                if (c18088M42784 == null) {
                    break;
                }
                int iMo4636 = c18088M42784.mo4636();
                int iM411310 = c18088M42785.m41139();
                if (C15268.m34738(iMo4636, iArrM34734)) {
                    iM33678 = iMo4636;
                } else if (iM411310 == iMo4636 || iM411310 < 0 || !C15268.m34738(iM411310, iArrM34734)) {
                    C22388 c22388M41138 = c18088M42785.m41137();
                    int size4 = c22388M41138.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            iM33678 = -1;
                            break;
                        }
                        int i8 = c22388M41138.get(i7);
                        if (C15268.m34738(i8, iArrM34734)) {
                            iM33678 = i8;
                            break;
                        }
                        i7++;
                    }
                } else {
                    iM33678 = iM411310;
                }
            }
            iM33678 = C15268.m34735(0, iArrM34734);
        }
        if (i5 != size) {
            throw new RuntimeException("shouldn't happen");
        }
        c6174.f15520 = iArr;
        C18759 c18759M33677 = c14735.m33676();
        int[] iArr2 = c6174.f15520;
        int length = iArr2.length;
        while (true) {
            C16231 c16231 = c6174.f15519;
            C21007 c21007 = c6174.f15514;
            if (i3 >= length) {
                return new C21677(c16231.m36988(), new C20927(c14735, c6174.f15520, c21007));
            }
            int i9 = i3 + 1;
            int i10 = i9 == iArr2.length ? -1 : iArr2[i9];
            C18088 c18088M42786 = c18759M33677.m42784(iArr2[i3]);
            C16981 c16981M47350 = c21007.m47350(c18088M42786);
            c16231.m36989((AbstractC6924) c16981M47350);
            C2665 c2666 = c6174.f15516;
            if (c2666 != null) {
                c16231.m36989(new C12880(c16981M47350.m15863(), c2666.m4121(c18088M42786)));
            }
            C16981 c16981M47349 = c21007.m47349(c18088M42786);
            C4833 c4833 = c6174.f15521;
            c4833.m10257(c18088M42786, c16981M47349);
            c18088M42786.m41142().m9914(c4833);
            c16231.m36989((AbstractC6924) c21007.m47348(c18088M42786));
            int iM411311 = c18088M42786.m41139();
            AbstractC17417 abstractC17417M41141 = c18088M42786.m41141();
            if (iM411311 >= 0 && iM411311 != i10) {
                if (abstractC17417M41141.m39656().m11601() == 4 && c18088M42786.m41144() == i10) {
                    c16231.m36990(c21007.m47347(iM411311));
                } else {
                    c16231.m36989(new C7515(C14300.f40848, abstractC17417M41141.m39652(), C21442.f67643, c21007.m47347(iM411311)));
                }
            }
            i3 = i9;
        }
    }

    public C6174(C14735 c14735, C2665 c2665, int i, C11619 c11619) {
        this.f15518 = c14735;
        this.f15516 = c2665;
        this.f15514 = new C21007(c14735);
        this.f15517 = i;
        boolean[] zArr = {true};
        c14735.m33676().m42781(new C10868(zArr, c14735.m33676().m42785(), i));
        boolean z = zArr[0];
        this.f15522 = z;
        C18759 c18759M33676 = c14735.m33676();
        int size = c18759M33676.size();
        int i2 = size * 3;
        int iM42782 = c18759M33676.m42782() + i2;
        int iM4125 = c2665 != null ? iM42782 + c2665.m4125() + size : iM42782;
        int iM42785 = c18759M33676.m42785() + (z ? 0 : i);
        this.f15515 = iM42785;
        C16231 c16231 = new C16231(c11619, iM4125, i2, iM42785, i);
        this.f15519 = c16231;
        if (c2665 != null) {
            this.f15521 = new C17572(this, c16231, c2665);
        } else {
            this.f15521 = new C4833(this, c16231);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21442 m13979(AbstractC17417 abstractC17417) {
        return m13983(abstractC17417, abstractC17417.m39655());
    }

    /* JADX INFO: renamed from: ۧ */
    public static C21442 m13983(AbstractC17417 abstractC17417, C22783 c22783) {
        C21442 c21442M39651 = abstractC17417.m39651();
        if (abstractC17417.m39656().m11600() && c21442M39651.size() == 2 && c22783.m50989() == c21442M39651.m56524get(1).m50989()) {
            c21442M39651 = C21442.m48566(c21442M39651.m56524get(1), c21442M39651.m56524get(0));
        }
        return c22783 == null ? c21442M39651 : c21442M39651.m48571(c22783);
    }
}
