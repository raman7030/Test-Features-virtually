package p067l;

/* JADX INFO: renamed from: l.ܽۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18110 {

    /* JADX INFO: renamed from: ֫ */
    public final C16611 f54089;

    /* JADX INFO: renamed from: ۧ */
    public boolean f54093;

    /* JADX INFO: renamed from: ܳ */
    public final int f54094;

    /* JADX INFO: renamed from: ܽ */
    public int f54095;

    /* JADX INFO: renamed from: ܿ */
    public final int f54096;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f54097;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f54098;

    /* JADX INFO: renamed from: ᩻ */
    public final C19452 f54099;

    /* JADX INFO: renamed from: ۜ */
    public int f54090 = 1;

    /* JADX INFO: renamed from: ۢ */
    public int f54092 = -1;

    /* JADX INFO: renamed from: ۡ */
    public boolean f54091 = true;

    public C18110(C19452 c19452, C16611 c16611, int i, int i2, boolean z) {
        this.f54099 = c19452;
        C12826.requireNonNull(c16611, "changes");
        this.f54089 = c16611;
        this.f54094 = i;
        this.f54096 = i2;
        this.f54098 = z;
        if (c16611.m37663() != c19452.f59268 || i < 0 || i > c16611.m37663() || i2 < 0 || i2 > c16611.m37665()) {
            throw new IllegalArgumentException("Syntax context reuse boundaries differ");
        }
        if (z) {
            this.f54095 = c19452.f59266 - 1;
            this.f54097 = true;
        } else {
            this.f54095 = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m41295(C16098 c16098) {
        if (this.f54093) {
            return false;
        }
        boolean z = this.f54097;
        int i = this.f54094;
        C19452 c19452 = this.f54099;
        if (z) {
            if (this.f54095 > 0) {
                int[] iArr = c19452.f59264;
                int i2 = this.f54095;
                if (iArr[i2] >= i) {
                    this.f54095 = i2 - 1;
                    return true;
                }
            }
            int i3 = this.f54095 + 1;
            this.f54090 = i3;
            this.f54095 = i3;
            this.f54092 = c16098.m36631();
            this.f54097 = false;
            if (this.f54095 >= c19452.f59266) {
                this.f54093 = true;
                return true;
            }
        } else {
            boolean z2 = this.f54098;
            if (!z2 && (this.f54095 >= c19452.f59266 || c19452.f59262[this.f54095] > i)) {
                this.f54093 = true;
                return false;
            }
            if (this.f54095 >= c19452.f59266) {
                this.f54093 = true;
                return false;
            }
            if (this.f54092 < 0) {
                this.f54092 = c16098.m36631();
            }
            int i4 = this.f54095;
            int i5 = c19452.f59265[i4];
            if (i5 != 0 && i5 < this.f54090) {
                this.f54091 = false;
                this.f54093 = true;
            } else {
                EnumC3200 enumC3200 = z2 ? EnumC3200.AFTER : EnumC3200.BEFORE;
                int i6 = c19452.f59264[i4];
                C16611 c16611 = this.f54089;
                int iM37659 = c16611.m37659(i6, enumC3200);
                int iM376510 = c16611.m37659(c19452.f59262[i4], enumC3200);
                if (iM37659 < 0 || iM376510 <= iM37659 || iM376510 - iM37659 != c19452.f59262[i4] - c19452.f59264[i4]) {
                    this.f54091 = false;
                    this.f54093 = true;
                } else {
                    int i7 = this.f54096;
                    if (!z2 ? iM376510 > i7 : iM37659 < i7) {
                        this.f54091 = false;
                        this.f54093 = true;
                    } else {
                        if (!c16098.m36630((this.f54092 + i4) - this.f54090, iM37659, iM376510, i5 == 0 ? 0 : (this.f54092 + i5) - this.f54090, c19452.f59263[i4])) {
                            this.f54091 = false;
                            this.f54093 = true;
                        }
                    }
                }
            }
            int i8 = this.f54095 + 1;
            this.f54095 = i8;
            if (i8 >= c19452.f59266) {
                this.f54093 = true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41294() {
        return this.f54093;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m41296() {
        return this.f54091;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41293(int i) {
        if (!this.f54098 || !this.f54093 || !this.f54091 || this.f54092 < 0 || i < this.f54090 || i > this.f54099.f59266) {
            return -1;
        }
        return (this.f54092 + i) - this.f54090;
    }
}
