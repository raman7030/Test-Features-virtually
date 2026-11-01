package p067l;

/* JADX INFO: renamed from: l.ۤۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11880 {

    /* JADX INFO: renamed from: ֫ */
    public final C23120 f33099;

    /* JADX INFO: renamed from: ۧ */
    public final C19255 f33100 = new C19255();

    /* JADX INFO: renamed from: ܳ */
    public int f33101;

    /* JADX INFO: renamed from: ܽ */
    public final int f33102;

    /* JADX INFO: renamed from: ܿ */
    public int f33103;

    /* JADX INFO: renamed from: ᩳ */
    public C17913 f33104;

    /* JADX INFO: renamed from: ᩻ */
    public C11209 f33105;

    public C11880(C11209 c11209, C23120 c23120, int i) {
        this.f33105 = c11209;
        this.f33099 = c23120;
        this.f33102 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27193(int i, int i2, C23120 c23120) {
        int i3;
        int i4 = this.f33102;
        int iMax = Math.max(i, i4) - i4;
        int iMin = Math.min(i2 - i4, this.f33105.m25889());
        if (iMax >= iMin) {
            return;
        }
        if (this.f33104 != null && iMax < this.f33103) {
            m27191();
        }
        if (this.f33104 != null && iMax > (i3 = this.f33103)) {
            C11209 c11209 = this.f33105;
            C19255 c19255 = this.f33100;
            c19255.m43866(c11209);
            c19255.m43867(i3);
            if (c19255.m43865() < iMax) {
                m27191();
            } else {
                this.f33104.m40720(iMax - this.f33103, c19255.m43870(), c19255.m43872() && c19255.m43868() == this.f33103);
            }
            c19255.m43866(C11209.m25887());
        }
        if (this.f33104 == null) {
            this.f33104 = new C17913();
            this.f33101 = iMax;
        }
        this.f33104.m40720(iMin - iMax, c23120, iMax + i4 == i);
        this.f33103 = iMin;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14561 m27192(C7856 c7856) {
        boolean zIsEmpty = c7856.f20596.isEmpty();
        C23120 c23120 = this.f33099;
        if (zIsEmpty) {
            m27193(c7856.f20597, c7856.f20595, c23120);
            return null;
        }
        if (c7856.f20596.size() == 1) {
            C13891 c13891 = (C13891) c7856.f20596.get(0);
            if (c13891.f39224 == c7856.f20597 && c13891.f39223 == c7856.f20595) {
                m27193(c7856.f20597, c7856.f20595, c23120.m51554(c13891.f39225));
                return null;
            }
        }
        return new C14561(c7856, m27191(), c23120, this.f33102);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27194(C14561 c14561) {
        this.f33105 = c14561.m33292();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11209 m27191() {
        C17913 c17913 = this.f33104;
        if (c17913 != null) {
            this.f33105 = this.f33105.m25890(this.f33101, this.f33103, c17913.m40719());
            this.f33104 = null;
        }
        return this.f33105;
    }
}
