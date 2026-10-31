package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D1JM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18624 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f57762;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f57763;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f57764;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f57765 = 0.0f;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C15094 f57766;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C15094 f57767;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15094 f57768;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15094 f57769;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f57770;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15094 f57771;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15094 f57772;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f57773;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C15094 f57774;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f57775;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f57776;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f57777;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f57778;

    public C18624(C15094 c15094, int i, boolean z) {
        this.f57769 = c15094;
        this.f57764 = i;
        this.f57777 = z;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43181() {
        C15094 c15094;
        int i;
        if (!this.f57763) {
            int i2 = this.f57764;
            int i3 = i2 * 2;
            C15094 c15095 = this.f57769;
            boolean z = false;
            C15094 c15096 = c15095;
            C15094 c15097 = c15096;
            while (!z) {
                this.f57776++;
                C15094[] c15094Arr = c15096.f46134;
                int[] iArr = c15096.f46119;
                C5218[] c5218Arr = c15096.f46135;
                c15094Arr[i2] = null;
                c15096.f46139[i2] = null;
                if (c15096.m35735() != 8) {
                    c15096.m35741(i2);
                    EnumC8040 enumC8040 = EnumC8040.MATCH_CONSTRAINT;
                    c5218Arr[i3].m15007();
                    int i4 = i3 + 1;
                    c5218Arr[i4].m15007();
                    c5218Arr[i3].m15007();
                    c5218Arr[i4].m15007();
                    if (this.f57774 == null) {
                        this.f57774 = c15096;
                    }
                    this.f57771 = c15096;
                    if (c15096.f46124[i2] == enumC8040) {
                        int i5 = iArr[i2];
                        if (i5 == 0 || i5 == 3 || i5 == 2) {
                            this.f57762++;
                            float f = c15096.f46167[i2];
                            if (f > 0.0f) {
                                this.f57765 += f;
                            }
                            if (c15096.m35735() != 8 && c15096.f46124[i2] == enumC8040 && ((i = iArr[i2]) == 0 || i == 3)) {
                                if (f < 0.0f) {
                                    this.f57778 = true;
                                } else {
                                    this.f57770 = true;
                                }
                                if (this.f57775 == null) {
                                    this.f57775 = new ArrayList();
                                }
                                this.f57775.add(c15096);
                            }
                            if (this.f57772 == null) {
                                this.f57772 = c15096;
                            }
                            C15094 c15098 = this.f57767;
                            if (c15098 != null) {
                                c15098.f46139[i2] = c15096;
                            }
                            this.f57767 = c15096;
                        }
                        if (i2 == 0) {
                            if (c15096.f46145 == 0 && c15096.f46153 == 0) {
                                int i6 = c15096.f46113;
                            }
                        } else if (c15096.f46170 == 0 && c15096.f46138 == 0) {
                            int i7 = c15096.f46128;
                        }
                    }
                }
                if (c15097 != c15096) {
                    c15097.f46134[i2] = c15096;
                }
                C5218 c5218 = c5218Arr[i3 + 1].f16339;
                if (c5218 != null) {
                    c15094 = c5218.f16341;
                    C5218 c5219 = c15094.f46135[i3].f16339;
                    if (c5219 == null || c5219.f16341 != c15096) {
                        c15094 = null;
                    }
                } else {
                    c15094 = null;
                }
                if (c15094 == null) {
                    z = true;
                    c15094 = c15096;
                }
                C15094 c15099 = c15094;
                c15097 = c15096;
                c15096 = c15099;
            }
            C15094 c150910 = this.f57774;
            if (c150910 != null) {
                c150910.f46135[i3].m15007();
            }
            C15094 c150911 = this.f57771;
            if (c150911 != null) {
                c150911.f46135[i3 + 1].m15007();
            }
            this.f57768 = c15096;
            if (i2 == 0 && this.f57777) {
                this.f57766 = c15096;
            } else {
                this.f57766 = c15095;
            }
            this.f57773 = this.f57770 && this.f57778;
        }
        this.f57763 = true;
    }
}
