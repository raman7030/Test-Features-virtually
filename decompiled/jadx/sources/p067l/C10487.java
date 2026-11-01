package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49PE */
/* JADX INFO: loaded from: classes3.dex */
public final class C10487 {

    /* JADX INFO: renamed from: ܳ */
    public static final C10487 f29024 = new C10487(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: ֫ */
    public int f29025;

    /* JADX INFO: renamed from: ۧ */
    public boolean f29026;

    /* JADX INFO: renamed from: ܽ */
    public int f29027;

    /* JADX INFO: renamed from: ܿ */
    public int[] f29028;

    /* JADX INFO: renamed from: ᩳ */
    public Object[] f29029;

    /* JADX INFO: renamed from: ᩳ */
    public static C10487 m24203() {
        return f29024;
    }

    /* JADX INFO: renamed from: ܿ */
    public static C10487 m24202() {
        return new C10487();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10487 m24200(C10487 c10487, C10487 c10488) {
        int i = c10487.f29025 + c10488.f29025;
        int[] iArrCopyOf = Arrays.copyOf(c10487.f29028, i);
        System.arraycopy(c10488.f29028, 0, iArrCopyOf, c10487.f29025, c10488.f29025);
        Object[] objArrCopyOf = Arrays.copyOf(c10487.f29029, i);
        System.arraycopy(c10488.f29029, 0, objArrCopyOf, c10487.f29025, c10488.f29025);
        return new C10487(i, iArrCopyOf, objArrCopyOf, true);
    }

    public C10487() {
        this(0, new int[8], new Object[8], true);
    }

    public C10487(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f29027 = -1;
        this.f29025 = i;
        this.f29028 = iArr;
        this.f29029 = objArr;
        this.f29026 = z;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24211() {
        if (this.f29026) {
            this.f29026 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24205(int i, Object obj) {
        if (!this.f29026) {
            throw new UnsupportedOperationException();
        }
        m24201(this.f29025 + 1);
        int[] iArr = this.f29028;
        int i2 = this.f29025;
        iArr[i2] = i;
        this.f29029[i2] = obj;
        this.f29025 = i2 + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24207(InterfaceC8672 interfaceC8672) {
        ((C25120) interfaceC8672).getClass();
        if (EnumC24765.ASCENDING == EnumC24765.DESCENDING) {
            int i = this.f29025;
            while (true) {
                i--;
                if (i < 0) {
                    return;
                }
                ((C25120) interfaceC8672).m55164(this.f29028[i] >>> 3, this.f29029[i]);
            }
        } else {
            for (int i2 = 0; i2 < this.f29025; i2++) {
                ((C25120) interfaceC8672).m55164(this.f29028[i2] >>> 3, this.f29029[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24210(InterfaceC8672 interfaceC8672) {
        if (this.f29025 == 0) {
            return;
        }
        C25120 c25120 = (C25120) interfaceC8672;
        c25120.getClass();
        EnumC24765 enumC24765 = EnumC24765.ASCENDING;
        for (int i = 0; i < this.f29025; i++) {
            int i2 = this.f29028[i];
            Object obj = this.f29029[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c25120.m55154(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c25120.m55138(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c25120.m55144(i3, (AbstractC7962) obj);
            } else if (i4 == 3) {
                c25120.getClass();
                EnumC24765 enumC24766 = EnumC24765.ASCENDING;
                c25120.m55152(i3);
                ((C10487) obj).m24210(interfaceC8672);
                c25120.m55135(i3);
            } else if (i4 == 5) {
                c25120.m55153(i3, ((Integer) obj).intValue());
            } else {
                throw new RuntimeException(C4293.m8708());
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m24209() {
        int i = this.f29027;
        if (i != -1) {
            return i;
        }
        int iM37223 = 0;
        for (int i2 = 0; i2 < this.f29025; i2++) {
            int i3 = this.f29028[i2] >>> 3;
            AbstractC7962 abstractC7962 = (AbstractC7962) this.f29029[i2];
            iM37223 += AbstractC16402.m37223(3, abstractC7962) + AbstractC16402.m37231(2, i3) + (AbstractC16402.m37220(1) * 2);
        }
        this.f29027 = iM37223;
        return iM37223;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m24204() {
        int iM37228;
        int i = this.f29027;
        if (i != -1) {
            return i;
        }
        int iM24204 = 0;
        for (int i2 = 0; i2 < this.f29025; i2++) {
            int i3 = this.f29028[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM37228 = AbstractC16402.m37228(i4, ((Long) this.f29029[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f29029[i2]).getClass();
                iM37228 = AbstractC16402.m37220(i4) + 8;
            } else if (i5 != 2) {
                if (i5 == 3) {
                    iM24204 = ((C10487) this.f29029[i2]).m24204() + (AbstractC16402.m37220(i4) * 2) + iM24204;
                } else if (i5 == 5) {
                    ((Integer) this.f29029[i2]).getClass();
                    iM37228 = AbstractC16402.m37225(i4);
                } else {
                    throw new IllegalStateException(C4293.m8708());
                }
            } else {
                iM37228 = AbstractC16402.m37223(i4, (AbstractC7962) this.f29029[i2]);
            }
            iM24204 = iM37228 + iM24204;
        }
        this.f29027 = iM24204;
        return iM24204;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10487)) {
            return false;
        }
        C10487 c10487 = (C10487) obj;
        int i = this.f29025;
        if (i == c10487.f29025) {
            int[] iArr = this.f29028;
            int[] iArr2 = c10487.f29028;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f29029;
            Object[] objArr2 = c10487.f29029;
            int i3 = this.f29025;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f29025;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f29028;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f29029;
        int i6 = this.f29025;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24206(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f29025; i2++) {
            C4432.m9266(sb, i, String.valueOf(this.f29028[i2] >>> 3), this.f29029[i2]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24201(int i) {
        int[] iArr = this.f29028;
        if (i > iArr.length) {
            int i2 = this.f29025;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f29028 = Arrays.copyOf(iArr, i);
            this.f29029 = Arrays.copyOf(this.f29029, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24208(C10487 c10487) {
        if (c10487.equals(f29024)) {
            return;
        }
        if (!this.f29026) {
            throw new UnsupportedOperationException();
        }
        int i = this.f29025 + c10487.f29025;
        m24201(i);
        System.arraycopy(c10487.f29028, 0, this.f29028, this.f29025, c10487.f29025);
        System.arraycopy(c10487.f29029, 0, this.f29029, this.f29025, c10487.f29025);
        this.f29025 = i;
    }
}
