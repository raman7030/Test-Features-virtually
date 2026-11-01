package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.۬ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes3.dex */
public final class C14561 {

    /* JADX INFO: renamed from: ֫ */
    public C13891 f41567;

    /* JADX INFO: renamed from: ۜ */
    public C11209 f41568;

    /* JADX INFO: renamed from: ۧ */
    public C19255 f41569;

    /* JADX INFO: renamed from: ܳ */
    public int f41570;

    /* JADX INFO: renamed from: ܽ */
    public final C23120 f41571;

    /* JADX INFO: renamed from: ܿ */
    public final int f41572;

    /* JADX INFO: renamed from: ᩳ */
    public int f41573 = -1;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C7856 f41574;

    /* JADX INFO: renamed from: ᩻ */
    public C17913 f41575;

    public C14561(C7856 c7856, C11209 c11209, C23120 c23120, int i) {
        this.f41574 = c7856;
        this.f41568 = c11209;
        this.f41571 = c23120;
        this.f41572 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m33291() {
        int i = this.f41573;
        C7856 c7856 = this.f41574;
        int i2 = this.f41572;
        if (i < 0) {
            int iMax = Math.max(c7856.f20597, i2) - i2;
            int iMin = Math.min(c7856.f20595 - i2, this.f41568.m25889());
            if (iMax < iMin) {
                this.f41568 = this.f41568.m25890(iMax, iMin, C11209.m25877(iMin - iMax, this.f41571, c7856.f20597 == i2 + iMax));
            }
            this.f41573 = 0;
            return false;
        }
        C13891 c13891 = this.f41567;
        if (c13891 == null) {
            if (i == c7856.f20596.size()) {
                return true;
            }
            List list = c7856.f20596;
            int i3 = this.f41573;
            this.f41573 = i3 + 1;
            C13891 c13892 = (C13891) list.get(i3);
            int iMax2 = Math.max(c13892.f39224, i2) - i2;
            int iMin2 = Math.min(c13892.f39223 - i2, this.f41568.m25889());
            if (iMax2 >= iMin2 || c13892.f39225 == C23120.f72658) {
                this.f41567 = null;
                return false;
            }
            C13891 c13893 = new C13891(iMax2, iMin2, c13892.f39225);
            this.f41567 = c13893;
            C11209 c11209 = this.f41568;
            int i4 = c13893.f39224;
            c11209.getClass();
            C19255 c19255 = new C19255();
            c19255.m43866(c11209);
            c19255.m43867(i4);
            this.f41569 = c19255;
            this.f41575 = new C17913();
            this.f41570 = this.f41567.f39224;
            return false;
        }
        int iMin3 = Math.min(c13891.f39223, this.f41569.m43865());
        this.f41575.m40720(iMin3 - this.f41570, this.f41569.m43870().m51554(this.f41567.f39225), this.f41569.m43872() && this.f41570 == this.f41569.m43868());
        this.f41570 = iMin3;
        if (iMin3 == this.f41567.f39223) {
            this.f41568 = this.f41568.m25890(this.f41567.f39224, this.f41567.f39223, this.f41575.m40719());
            this.f41567 = null;
            this.f41569 = null;
            this.f41575 = null;
            return false;
        }
        if (this.f41569.m43871()) {
            return false;
        }
        throw new IllegalStateException("Incomplete syntax style transaction coverage");
    }

    /* JADX INFO: renamed from: ۧ */
    public final C11209 m33292() {
        return this.f41568;
    }
}
