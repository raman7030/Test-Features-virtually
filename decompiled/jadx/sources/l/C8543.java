package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49PE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8543 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C8543 f26109 = new C8543(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26110;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f26111;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f26112;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f26113;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object[] f26114;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C8543 m22235() {
        return f26109;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C8543 m22234() {
        return new C8543();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8543 m22232(C8543 c8543, C8543 c8544) {
        int i = c8543.f26110 + c8544.f26110;
        int[] iArrCopyOf = Arrays.copyOf(c8543.f26113, i);
        System.arraycopy(c8544.f26113, 0, iArrCopyOf, c8543.f26110, c8544.f26110);
        Object[] objArrCopyOf = Arrays.copyOf(c8543.f26114, i);
        System.arraycopy(c8544.f26114, 0, objArrCopyOf, c8543.f26110, c8544.f26110);
        return new C8543(i, iArrCopyOf, objArrCopyOf, true);
    }

    public C8543() {
        this(0, new int[8], new Object[8], true);
    }

    public C8543(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f26112 = -1;
        this.f26110 = i;
        this.f26113 = iArr;
        this.f26114 = objArr;
        this.f26111 = z;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22243() {
        if (this.f26111) {
            this.f26111 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22237(int i, Object obj) {
        if (!this.f26111) {
            throw new UnsupportedOperationException();
        }
        m22233(this.f26110 + 1);
        int[] iArr = this.f26113;
        int i2 = this.f26110;
        iArr[i2] = i;
        this.f26114[i2] = obj;
        this.f26110 = i2 + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22239(InterfaceC6633 interfaceC6633) {
        ((C23939) interfaceC6633).getClass();
        if (EnumC23566.ASCENDING == EnumC23566.DESCENDING) {
            int i = this.f26110;
            while (true) {
                i--;
                if (i < 0) {
                    return;
                }
                ((C23939) interfaceC6633).m52758(this.f26113[i] >>> 3, this.f26114[i]);
            }
        } else {
            for (int i2 = 0; i2 < this.f26110; i2++) {
                ((C23939) interfaceC6633).m52758(this.f26113[i2] >>> 3, this.f26114[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22242(InterfaceC6633 interfaceC6633) {
        if (this.f26110 == 0) {
            return;
        }
        C23939 c23939 = (C23939) interfaceC6633;
        c23939.getClass();
        EnumC23566 enumC23566 = EnumC23566.ASCENDING;
        for (int i = 0; i < this.f26110; i++) {
            int i2 = this.f26113[i];
            Object obj = this.f26114[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c23939.m52748(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c23939.m52732(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c23939.m52738(i3, (AbstractC5886) obj);
            } else if (i4 == 3) {
                c23939.getClass();
                EnumC23566 enumC23567 = EnumC23566.ASCENDING;
                c23939.m52746(i3);
                ((C8543) obj).m22242(interfaceC6633);
                c23939.m52729(i3);
            } else if (i4 == 5) {
                c23939.m52747(i3, ((Integer) obj).intValue());
            } else {
                throw new RuntimeException(C2025.m6582());
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m22241() {
        int i = this.f26112;
        if (i != -1) {
            return i;
        }
        int iM35076 = 0;
        for (int i2 = 0; i2 < this.f26110; i2++) {
            int i3 = this.f26113[i2] >>> 3;
            AbstractC5886 abstractC5886 = (AbstractC5886) this.f26114[i2];
            iM35076 += AbstractC14766.m35076(3, abstractC5886) + AbstractC14766.m35084(2, i3) + (AbstractC14766.m35073(1) * 2);
        }
        this.f26112 = iM35076;
        return iM35076;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m22236() {
        int iM35081;
        int i = this.f26112;
        if (i != -1) {
            return i;
        }
        int iM22236 = 0;
        for (int i2 = 0; i2 < this.f26110; i2++) {
            int i3 = this.f26113[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM35081 = AbstractC14766.m35081(i4, ((Long) this.f26114[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f26114[i2]).getClass();
                iM35081 = AbstractC14766.m35073(i4) + 8;
            } else if (i5 != 2) {
                if (i5 == 3) {
                    iM22236 = ((C8543) this.f26114[i2]).m22236() + (AbstractC14766.m35073(i4) * 2) + iM22236;
                } else if (i5 == 5) {
                    ((Integer) this.f26114[i2]).getClass();
                    iM35081 = AbstractC14766.m35078(i4);
                } else {
                    throw new IllegalStateException(C2025.m6582());
                }
            } else {
                iM35081 = AbstractC14766.m35076(i4, (AbstractC5886) this.f26114[i2]);
            }
            iM22236 = iM35081 + iM22236;
        }
        this.f26112 = iM22236;
        return iM22236;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8543)) {
            return false;
        }
        C8543 c8543 = (C8543) obj;
        int i = this.f26110;
        if (i == c8543.f26110) {
            int[] iArr = this.f26113;
            int[] iArr2 = c8543.f26113;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f26114;
            Object[] objArr2 = c8543.f26114;
            int i3 = this.f26110;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f26110;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f26113;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f26114;
        int i6 = this.f26110;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22238(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f26110; i2++) {
            C2172.m7187(sb, i, String.valueOf(this.f26113[i2] >>> 3), this.f26114[i2]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22233(int i) {
        int[] iArr = this.f26113;
        if (i > iArr.length) {
            int i2 = this.f26110;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f26113 = Arrays.copyOf(iArr, i);
            this.f26114 = Arrays.copyOf(this.f26114, i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22240(C8543 c8543) {
        if (c8543.equals(f26109)) {
            return;
        }
        if (!this.f26111) {
            throw new UnsupportedOperationException();
        }
        int i = this.f26110 + c8543.f26110;
        m22233(i);
        System.arraycopy(c8543.f26113, 0, this.f26113, this.f26110, c8543.f26110);
        System.arraycopy(c8543.f26114, 0, this.f26114, this.f26110, c8543.f26110);
        this.f26110 = i;
    }
}
