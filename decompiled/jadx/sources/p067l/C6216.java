package p067l;

/* JADX INFO: renamed from: l.ۘܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6N4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6216 {

    /* JADX INFO: renamed from: ֫ */
    public final C14757 f15671;

    /* JADX INFO: renamed from: ۧ */
    public final int f15672;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC9768 f15673;

    /* JADX INFO: renamed from: ܽ */
    public final C14757 f15674;

    /* JADX INFO: renamed from: ܿ */
    public final int f15675;

    /* JADX INFO: renamed from: ᩳ */
    public final C24320 f15676;

    public C6216(InterfaceC9768 interfaceC9768, C24320 c24320, int i, int i2, C14757 c14757, C14757 c14758) {
        this.f15673 = interfaceC9768;
        this.f15676 = c24320;
        this.f15672 = i;
        this.f15675 = i2;
        this.f15674 = c14757;
        this.f15671 = c14758;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m14090(Object obj, C24320 c24320, int i, int i2) {
        return this.f15673 == obj && this.f15676 == c24320 && this.f15672 == i && this.f15675 == i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6216 m14088(C14757 c14757) {
        C14757 c14758;
        int i = c14757.f42082;
        int i2 = c14757.f42081;
        C14757 c14759 = this.f15674;
        int i3 = c14759.f42081;
        C11209 c11209 = c14759.f42080;
        int i4 = c14759.f42082;
        if (i > i3 || i4 > i2) {
            c14758 = c14757;
        } else {
            int iMax = Math.max(Math.min(i4, i), i2 - 65536);
            int iMin = (int) Math.min(Math.max(c14759.f42081, i2), ((long) iMax) + 65536);
            C11209 c11209M25887 = C11209.m25887();
            int i5 = c14757.f42082;
            if (iMax < i5) {
                c11209M25887 = c11209.m25895(iMax - i4, i5 - i4);
            }
            C11209 c11209M25891 = c11209M25887.m25891(c14757.f42080);
            if (iMin > i2) {
                c11209M25891 = c11209M25891.m25891(c11209.m25895(i2 - i4, iMin - i4));
            }
            c14758 = new C14757(iMax, c11209M25891);
        }
        return new C6216(this.f15673, this.f15676, this.f15672, this.f15675, c14758, c14757);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6216 m14087(C9197 c9197) {
        if (c9197 != null && c9197.m21197()) {
            C14757 c14757 = this.f15674;
            int i = c14757.f42082;
            int i2 = c14757.f42082;
            int iMax = Math.max(i, c9197.m21192());
            int iMin = Math.min(c14757.f42081, c9197.m21188());
            if (iMax < iMin) {
                C17913 c17913 = new C17913();
                C11209 c11209M21195 = c9197.m21195();
                int iM21192 = iMax - c9197.m21192();
                c11209M21195.getClass();
                C19255 c19255 = new C19255();
                c19255.m43866(c11209M21195);
                c19255.m43867(iM21192);
                do {
                    int iMax2 = Math.max(iMax, c19255.m43868() + c9197.m21192());
                    int iMin2 = Math.min(iMin, c19255.m43865() + c9197.m21192());
                    C23120 c23120M43870 = c19255.m43870();
                    c17913.m40720(iMin2 - iMax2, new C23120(null, c23120M43870.m51561(), 0, c23120M43870.m51563(), 0, 0), false);
                    if (iMin2 == iMin) {
                        break;
                    }
                } while (c19255.m43871());
                return new C6216(this.f15673, this.f15676, this.f15672, this.f15675, new C14757(i2, c14757.f42080.m25890(iMax - i2, iMin - i2, c17913.m40719())), this.f15671);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6216 m14089(InterfaceC21800 interfaceC21800, C24320 c24320, int i, int i2, int i3, int i4, int i5, C23120 c23120) {
        C11209 c11209M25877;
        if (!m14090(interfaceC21800, c24320, i - 1, (i2 - i5) + i4) || i3 < 0 || i4 < 0 || i5 < 0 || ((long) i3) + ((long) i4) > this.f15675) {
            return null;
        }
        int i6 = i3 + i4;
        int i7 = i5 - i4;
        C14757 c14757 = this.f15674;
        int iMin = c14757.f42082;
        C11209 c11209M25890 = c14757.f42080;
        if (i3 < iMin && i6 <= iMin) {
            iMin += i7;
        } else if (i3 < c14757.f42081) {
            int iMax = Math.max(0, i3 - iMin);
            int iMin2 = Math.min(c11209M25890.m25889(), i6 - iMin);
            C23120 c23120M25892 = i3 > iMin ? c11209M25890.m25892(iMax - 1) : c23120;
            if (i5 == 0) {
                c11209M25877 = C11209.m25887();
            } else {
                c11209M25877 = C11209.m25877(i5, new C23120(null, c23120M25892.m51561(), 0, c23120M25892.m51563(), 0, 0), false);
            }
            c11209M25890 = c11209M25890.m25890(iMax, Math.max(iMax, iMin2), c11209M25877);
            iMin = Math.min(iMin, i3);
            if (c11209M25890.m25889() == 0) {
                return null;
            }
            if (c11209M25890.m25889() > 65536) {
                c11209M25890 = c11209M25890.m25895(0, 65536);
            }
        }
        return new C6216(this.f15673, this.f15676, i, i2, new C14757(iMin, c11209M25890), null);
    }
}
