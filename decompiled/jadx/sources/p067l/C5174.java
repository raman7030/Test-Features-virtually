package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2708 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5174 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f12169;

    /* JADX INFO: renamed from: ۜ */
    public int[] f12170;

    /* JADX INFO: renamed from: ۢ */
    public int f12172;

    /* JADX INFO: renamed from: ۧ */
    public boolean[] f12173;

    /* JADX INFO: renamed from: ᩳ */
    public long[] f12178;

    /* JADX INFO: renamed from: ᩷ */
    public int[] f12179;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC6515[] f12180;

    /* JADX INFO: renamed from: ۡ */
    public int[] f12171 = new int[16];

    /* JADX INFO: renamed from: ܿ */
    public int[] f12177 = new int[16];

    /* JADX INFO: renamed from: ܳ */
    public int[] f12174 = new int[16];

    /* JADX INFO: renamed from: ܽ */
    public int f12176 = -1;

    /* JADX INFO: renamed from: ܺ */
    public C23120[] f12175 = new C23120[16];

    /* JADX INFO: renamed from: ۧ */
    public final int m11064() {
        return this.f12172;
    }

    /* JADX INFO: renamed from: ܿ */
    public final long m11073() {
        return (((long) this.f12176) << 32) | (((long) this.f12172) & 4294967295L);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m11075() {
        this.f12169 = true;
        this.f12176 = -1;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m11070() {
        this.f12169 = false;
        this.f12176 = -1;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m11077(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax effect end");
        }
        if (this.f12169) {
            this.f12176 = Math.max(this.f12176, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11057(int i, int i2, C23120 c23120) {
        return m11053(i, i2, c23120, true);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m11065(int i, int i2, C23120 c23120) {
        return m11053(i, i2, c23120, !this.f12169);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m11053(int i, int i2, C23120 c23120, boolean z) {
        if (i < 0 || i2 < i) {
            throw new IllegalArgumentException(C19768.m44907("Invalid style range: ", i, i2, ".."));
        }
        C12826.requireNonNull(c23120, "style");
        if (c23120 == C23120.f72658 || i == i2) {
            return -1;
        }
        if (this.f12172 == this.f12171.length) {
            m11055();
        }
        int i3 = this.f12172;
        this.f12172 = i3 + 1;
        int[] iArr = this.f12171;
        iArr[i3] = i;
        this.f12177[i3] = i2;
        this.f12175[i3] = c23120;
        long[] jArr = this.f12178;
        if (jArr != null) {
            jArr[i3] = 0;
        }
        this.f12174[i3] = -1;
        if (z) {
            boolean[] zArr = this.f12173;
            if (zArr != null) {
                zArr[i3] = false;
            }
            m11077(i2);
        } else {
            if (this.f12173 == null) {
                this.f12173 = new boolean[iArr.length];
            }
            this.f12173[i3] = true;
        }
        if (this.f12180 != null) {
            this.f12179[i3] = -1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11058(C22805 c22805) {
        if (this.f12172 == this.f12171.length) {
            m11055();
        }
        if (this.f12180 == null) {
            int[] iArr = this.f12171;
            this.f12180 = new InterfaceC6515[iArr.length];
            this.f12170 = new int[iArr.length];
            this.f12179 = new int[iArr.length];
        }
        int i = this.f12172;
        this.f12172 = i + 1;
        boolean[] zArr = this.f12173;
        if (zArr != null) {
            zArr[i] = false;
        }
        this.f12175[i] = null;
        long[] jArr = this.f12178;
        if (jArr != null) {
            jArr[i] = 0;
        }
        this.f12174[i] = -1;
        this.f12180[i] = c22805;
        this.f12170[i] = -1;
        this.f12179[i] = -1;
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11066(int i, int i2) {
        this.f12170[i] = i2;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m11069(int i) {
        return this.f12170[i];
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m11071(int i) {
        if (i >= 0 && this.f12180 != null) {
            while (i >= 0) {
                if (this.f12180[i] != null) {
                    return true;
                }
                i = this.f12170[i];
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m11068(int i) {
        return this.f12169 && this.f12176 > i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m11074(int i) {
        InterfaceC6515 interfaceC6515 = this.f12180[i];
        if (interfaceC6515 != null) {
            this.f12179[i] = interfaceC6515.mo14943();
            this.f12180[i] = null;
        }
        return this.f12179[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11060(int i, int i2) {
        this.f12174[i] = i2;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m11072(int i) {
        return this.f12174[i];
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m11063(int i) {
        return this.f12171[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11056(int i) {
        return this.f12177[i];
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C23120 m11076(int i) {
        return this.f12175[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11067(int i, int i2, int i3) {
        C12826.checkIndex(i, this.f12172);
        int[] iArr = this.f12171;
        if (i2 == iArr[i] && i3 == this.f12177[i]) {
            return;
        }
        if (this.f12178 == null) {
            this.f12178 = new long[iArr.length];
        }
        this.f12178[i] = (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11061(int i, int i2, int i3) {
        C12826.checkIndex(i, this.f12172);
        C23120 c23120 = this.f12175[i];
        if (c23120 == null) {
            return;
        }
        if (c23120.m51551() != null) {
            long[] jArr = this.f12178;
            long j = jArr == null ? 0L : jArr[i];
            int i4 = j == 0 ? this.f12171[i] : (int) (j >>> 32);
            int i5 = j == 0 ? this.f12177[i] : (int) j;
            if (i4 < i2 || i5 > i3) {
                C23120[] c23120Arr = this.f12175;
                c23120Arr[i] = c23120Arr[i].m51553((String) null);
            }
        }
        int iMin = Math.min(i3, Math.max(i2, this.f12171[i]));
        this.f12171[i] = iMin;
        int[] iArr = this.f12177;
        iArr[i] = Math.max(iMin, Math.min(i3, iArr[i]));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11062(long j) {
        m11054((int) j);
        this.f12176 = (int) (j >> 32);
    }

    /* JADX INFO: renamed from: ۢ */
    private void m11054(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.f12172)) {
            StringBuilder sbM34408 = C15033.m34408(i, "Invalid style journal mark: ", ", size=");
            sbM34408.append(this.f12172);
            throw new IllegalArgumentException(sbM34408.toString());
        }
        Arrays.fill(this.f12175, i, i2, (Object) null);
        InterfaceC6515[] interfaceC6515Arr = this.f12180;
        if (interfaceC6515Arr != null) {
            Arrays.fill(interfaceC6515Arr, i, this.f12172, (Object) null);
        }
        boolean[] zArr = this.f12173;
        if (zArr != null) {
            Arrays.fill(zArr, i, this.f12172, false);
        }
        this.f12172 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11059() {
        m11054(0);
        this.f12176 = -1;
    }

    /* JADX INFO: renamed from: ܳ */
    private void m11055() {
        int i = this.f12172;
        int iMin = (int) Math.min(2147483647L, ((long) i) + ((long) (i >> 1)));
        if (iMin <= this.f12172) {
            throw new OutOfMemoryError("Syntax style journal capacity exceeded");
        }
        this.f12171 = Arrays.copyOf(this.f12171, iMin);
        this.f12177 = Arrays.copyOf(this.f12177, iMin);
        this.f12174 = Arrays.copyOf(this.f12174, iMin);
        this.f12175 = (C23120[]) Arrays.copyOf(this.f12175, iMin);
        long[] jArr = this.f12178;
        if (jArr != null) {
            this.f12178 = Arrays.copyOf(jArr, iMin);
        }
        boolean[] zArr = this.f12173;
        if (zArr != null) {
            this.f12173 = Arrays.copyOf(zArr, iMin);
        }
        InterfaceC6515[] interfaceC6515Arr = this.f12180;
        if (interfaceC6515Arr != null) {
            this.f12180 = (InterfaceC6515[]) Arrays.copyOf(interfaceC6515Arr, iMin);
            this.f12170 = Arrays.copyOf(this.f12170, iMin);
            this.f12179 = Arrays.copyOf(this.f12179, iMin);
        }
    }
}
