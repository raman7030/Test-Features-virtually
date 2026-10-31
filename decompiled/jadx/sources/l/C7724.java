package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C7724 extends AbstractC15379 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1933 f23895;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient C8430 f23896;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f23899;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient boolean f23900;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient C8430 f23901;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0919 f23902;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient boolean[] f23904 = new boolean[64];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient C8430[] f23898 = new C8430[64];

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient C8430 f23897 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f23903 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۫ */
    public final void mo5873() {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8430 m20679(int i) {
        C8430 c8430M22108 = this.f23897;
        while (c8430M22108 != null) {
            int iCompare = Integer.compare(i, c8430M22108.f17057);
            if (iCompare == 0) {
                break;
            }
            c8430M22108 = iCompare < 0 ? c8430M22108.m22108() : c8430M22108.m22101();
        }
        return c8430M22108;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8430 m20680(int i) {
        C8430 c8430M22108 = this.f23897;
        C8430 c8430 = c8430M22108;
        int iCompare = 0;
        while (c8430M22108 != null) {
            iCompare = Integer.compare(i, c8430M22108.f17057);
            if (iCompare == 0) {
                break;
            }
            c8430 = c8430M22108;
            c8430M22108 = iCompare < 0 ? c8430M22108.m22108() : c8430M22108.m22101();
        }
        return iCompare == 0 ? c8430M22108 : c8430;
    }

    @Override // l.AbstractC0563, l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2318(int i, Object obj) {
        int i2;
        C8430 c8430;
        C8430 c8431;
        C8430 c8432;
        int i3 = 0;
        this.f23900 = false;
        C8430 c8433 = this.f23897;
        if (c8433 == null) {
            this.f23903++;
            c8433 = new C8430(i, null);
            this.f23896 = c8433;
            this.f23901 = c8433;
            this.f23897 = c8433;
        } else {
            int i4 = 0;
            while (true) {
                int iCompare = Integer.compare(i, c8433.f17057);
                if (iCompare == 0) {
                    while (true) {
                        int i5 = i4 - 1;
                        if (i4 == 0) {
                            break;
                        }
                        this.f23898[i5] = null;
                        i4 = i5;
                    }
                } else {
                    this.f23898[i4] = c8433;
                    boolean[] zArr = this.f23904;
                    i2 = i4 + 1;
                    boolean z = iCompare > 0;
                    zArr[i4] = z;
                    if (z) {
                        if (c8433.m22110()) {
                            this.f23903++;
                            c8430 = new C8430(i, null);
                            C8430 c8434 = c8433.f25822;
                            if (c8434 == null) {
                                this.f23901 = c8430;
                            }
                            c8430.f25823 = c8433;
                            c8430.f25822 = c8434;
                            c8433.m22103(c8430);
                            break;
                        }
                        c8433 = c8433.f25822;
                        i4 = i2;
                    } else {
                        if (c8433.m22102()) {
                            this.f23903++;
                            c8430 = new C8430(i, null);
                            C8430 c8435 = c8433.f25823;
                            if (c8435 == null) {
                                this.f23896 = c8430;
                            }
                            c8430.f25822 = c8433;
                            c8430.f25823 = c8435;
                            c8433.f25824 &= -1073741825;
                            c8433.f25823 = c8430;
                            break;
                        }
                        c8433 = c8433.f25823;
                        i4 = i2;
                    }
                }
                Object obj2 = c8433.f17058;
                c8433.f17058 = obj;
                return obj2;
            }
            c8433 = c8430;
            this.f23900 = true;
            while (i4 > 0 && !this.f23898[i4].m22107()) {
                int i6 = i4 - 1;
                if (!this.f23904[i6]) {
                    C8430 c8436 = this.f23898[i6];
                    C8430 c8437 = c8436.f25822;
                    if (!c8436.m22110() && !c8437.m22107()) {
                        this.f23898[i4].m22099(true);
                        c8437.m22099(true);
                        this.f23898[i6].m22099(false);
                        i4 -= 2;
                    } else {
                        if (this.f23904[i4]) {
                            C8430[] c8430Arr = this.f23898;
                            C8430 c8438 = c8430Arr[i4];
                            C8430 c8439 = c8438.f25822;
                            c8438.f25822 = c8439.f25823;
                            c8439.f25823 = c8438;
                            c8430Arr[i6].f25823 = c8439;
                            if (c8439.m22102()) {
                                c8439.m22106(false);
                                c8438.m22105(c8439);
                            }
                            c8432 = c8439;
                        } else {
                            c8432 = this.f23898[i4];
                        }
                        C8430 c84310 = this.f23898[i6];
                        c84310.m22099(false);
                        c8432.m22099(true);
                        c84310.f25823 = c8432.f25822;
                        c8432.f25822 = c84310;
                        if (i4 < 2) {
                            this.f23897 = c8432;
                        } else {
                            int i7 = i4 - 2;
                            if (this.f23904[i7]) {
                                this.f23898[i7].f25822 = c8432;
                            } else {
                                this.f23898[i7].f25823 = c8432;
                            }
                        }
                        if (!c8432.m22110()) {
                            break;
                        }
                        c8432.m22109(false);
                        c84310.m22098(c8432);
                        break;
                    }
                } else {
                    C8430 c84311 = this.f23898[i6];
                    C8430 c84312 = c84311.f25823;
                    if (!c84311.m22102() && !c84312.m22107()) {
                        this.f23898[i4].m22099(true);
                        c84312.m22099(true);
                        this.f23898[i6].m22099(false);
                        i4 -= 2;
                    } else {
                        if (this.f23904[i4]) {
                            c8431 = this.f23898[i4];
                        } else {
                            C8430[] c8430Arr2 = this.f23898;
                            C8430 c84313 = c8430Arr2[i4];
                            C8430 c84314 = c84313.f25823;
                            c84313.f25823 = c84314.f25822;
                            c84314.f25822 = c84313;
                            c8430Arr2[i6].f25822 = c84314;
                            if (c84314.m22110()) {
                                c84314.m22109(false);
                                c84313.m22098(c84314);
                            }
                            c8431 = c84314;
                        }
                        C8430 c84315 = this.f23898[i6];
                        c84315.m22099(false);
                        c8431.m22099(true);
                        c84315.f25822 = c8431.f25823;
                        c8431.f25823 = c84315;
                        if (i4 < 2) {
                            this.f23897 = c8431;
                        } else {
                            int i8 = i4 - 2;
                            if (this.f23904[i8]) {
                                this.f23898[i8].f25822 = c8431;
                            } else {
                                this.f23898[i8].f25823 = c8431;
                            }
                        }
                        if (!c8431.m22102()) {
                            break;
                        }
                        c8431.m22106(false);
                        c84315.m22105(c8431);
                        break;
                    }
                }
            }
            i3 = i2;
        }
        this.f23897.m22099(true);
        while (true) {
            int i9 = i3 - 1;
            if (i3 == 0) {
                break;
            }
            this.f23898[i9] = null;
            i3 = i9;
        }
        Object obj3 = c8433.f17058;
        c8433.f17058 = obj;
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x020a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0226  */
    /* JADX WARN: Code duplicated, block: B:114:0x0254  */
    /* JADX WARN: Code duplicated, block: B:115:0x0257  */
    /* JADX WARN: Code duplicated, block: B:117:0x025e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0263  */
    /* JADX WARN: Code duplicated, block: B:121:0x026d  */
    /* JADX WARN: Code duplicated, block: B:123:0x027e  */
    /* JADX WARN: Code duplicated, block: B:125:0x028a  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:149:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:151:0x0311  */
    /* JADX WARN: Code duplicated, block: B:155:0x033f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0342  */
    /* JADX WARN: Code duplicated, block: B:158:0x0349  */
    /* JADX WARN: Code duplicated, block: B:159:0x034e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0358  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code duplicated, block: B:84:0x019f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5  */
    @Override // l.AbstractC0563, l.InterfaceC12954
    public final Object remove(int i) {
        int i2;
        C8430 c8430;
        C8430 c8431;
        C8430 c8432;
        int i3;
        C8430[] c8430Arr;
        int i4;
        C8430[] c8430Arr2;
        int i5;
        C8430 c8433;
        C8430 c8434;
        int i6;
        C8430[] c8430Arr3;
        int i7;
        C8430[] c8430Arr4;
        int i8;
        this.f23900 = false;
        C8430 c8430M22101 = this.f23897;
        if (c8430M22101 == null) {
            return null;
        }
        int i9 = 0;
        while (true) {
            int iCompare = Integer.compare(i, c8430M22101.f17057);
            if (iCompare != 0) {
                boolean[] zArr = this.f23904;
                boolean z = iCompare > 0;
                zArr[i9] = z;
                this.f23898[i9] = c8430M22101;
                i9++;
                if (z) {
                    c8430M22101 = c8430M22101.m22101();
                    if (c8430M22101 == null) {
                        while (true) {
                            int i10 = i9 - 1;
                            if (i9 == 0) {
                                return null;
                            }
                            this.f23898[i10] = null;
                            i9 = i10;
                        }
                    }
                } else {
                    c8430M22101 = c8430M22101.m22108();
                    if (c8430M22101 == null) {
                        while (true) {
                            int i11 = i9 - 1;
                            if (i9 == 0) {
                                return null;
                            }
                            this.f23898[i11] = null;
                            i9 = i11;
                        }
                    }
                }
            } else {
                if (c8430M22101.f25823 == null) {
                    this.f23896 = c8430M22101.m22104();
                }
                if (c8430M22101.f25822 == null) {
                    this.f23901 = c8430M22101.m22100();
                }
                if (c8430M22101.m22110()) {
                    if (!c8430M22101.m22102()) {
                        c8430M22101.m22100().f25822 = c8430M22101.f25822;
                        if (i9 == 0) {
                            this.f23897 = c8430M22101.f25823;
                        } else {
                            int i12 = i9 - 1;
                            if (this.f23904[i12]) {
                                this.f23898[i12].f25822 = c8430M22101.f25823;
                            } else {
                                this.f23898[i12].f25823 = c8430M22101.f25823;
                            }
                        }
                    } else if (i9 == 0) {
                        this.f23897 = c8430M22101.f25823;
                    } else {
                        int i13 = i9 - 1;
                        if (this.f23904[i13]) {
                            this.f23898[i13].m22105(c8430M22101.f25822);
                        } else {
                            this.f23898[i13].m22098(c8430M22101.f25823);
                        }
                    }
                } else {
                    C8430 c8435 = c8430M22101.f25822;
                    if (c8435.m22102()) {
                        c8435.f25823 = c8430M22101.f25823;
                        c8435.m22106(c8430M22101.m22102());
                        if (!c8435.m22102()) {
                            c8435.m22100().f25822 = c8435;
                        }
                        if (i9 == 0) {
                            this.f23897 = c8435;
                        } else {
                            int i14 = i9 - 1;
                            if (this.f23904[i14]) {
                                this.f23898[i14].f25822 = c8435;
                            } else {
                                this.f23898[i14].f25823 = c8435;
                            }
                        }
                        boolean zM22107 = c8435.m22107();
                        c8435.m22099(c8430M22101.m22107());
                        c8430M22101.m22099(zM22107);
                        this.f23904[i9] = true;
                        this.f23898[i9] = c8435;
                        i9++;
                    } else {
                        int i15 = i9 + 1;
                        while (true) {
                            this.f23904[i15] = false;
                            i2 = i15 + 1;
                            this.f23898[i15] = c8435;
                            c8430 = c8435.f25823;
                            if (c8430.m22102()) {
                                break;
                            }
                            c8435 = c8430;
                            i15 = i2;
                        }
                        this.f23904[i9] = true;
                        this.f23898[i9] = c8430;
                        if (c8430.m22110()) {
                            c8435.m22098(c8430);
                        } else {
                            c8435.f25823 = c8430.f25822;
                        }
                        c8430.f25823 = c8430M22101.f25823;
                        if (!c8430M22101.m22102()) {
                            c8430M22101.m22100().f25822 = c8430;
                            c8430.m22106(false);
                        }
                        c8430.m22103(c8430M22101.f25822);
                        boolean zM22108 = c8430.m22107();
                        c8430.m22099(c8430M22101.m22107());
                        c8430M22101.m22099(zM22108);
                        if (i9 == 0) {
                            this.f23897 = c8430;
                        } else {
                            int i16 = i9 - 1;
                            if (this.f23904[i16]) {
                                this.f23898[i16].f25822 = c8430;
                            } else {
                                this.f23898[i16].f25823 = c8430;
                            }
                        }
                        i9 = i2;
                    }
                }
                if (c8430M22101.m22107()) {
                    int i17 = i9;
                    while (true) {
                        if (i9 > 0) {
                            int i18 = i9 - 1;
                            if ((this.f23904[i18] && !this.f23898[i18].m22110()) || (!this.f23904[i18] && !this.f23898[i18].m22102())) {
                                C8430 c8436 = this.f23904[i18] ? this.f23898[i18].f25822 : this.f23898[i18].f25823;
                                if (!c8436.m22107()) {
                                    c8436.m22099(true);
                                } else if (!this.f23904[i18]) {
                                    c8433 = this.f23898[i18].f25822;
                                    if (!c8433.m22107()) {
                                        c8433.m22099(true);
                                        this.f23898[i18].m22099(false);
                                        c8430Arr4 = this.f23898;
                                        C8430 c8437 = c8430Arr4[i18];
                                        c8437.f25822 = c8433.f25823;
                                        c8433.f25823 = c8437;
                                        if (i9 < 2) {
                                            this.f23897 = c8433;
                                        } else {
                                            i8 = i9 - 2;
                                            if (this.f23904[i8]) {
                                                c8430Arr4[i8].f25822 = c8433;
                                            } else {
                                                c8430Arr4[i8].f25823 = c8433;
                                            }
                                        }
                                        c8430Arr4[i9] = c8437;
                                        this.f23904[i9] = false;
                                        c8430Arr4[i18] = c8433;
                                        int i19 = i9 + 1;
                                        if (i17 == i9) {
                                            i17++;
                                        }
                                        c8433 = c8430Arr4[i9].f25822;
                                        i9 = i19;
                                    }
                                    if (!c8433.m22102()) {
                                        c8433.m22099(false);
                                        i9--;
                                    } else {
                                        c8433.m22099(false);
                                        i9--;
                                    }
                                    if (!c8433.m22110()) {
                                        c8434 = c8433.f25823;
                                        c8434.m22099(true);
                                        c8433.m22099(false);
                                        c8433.f25823 = c8434.f25822;
                                        c8434.f25822 = c8433;
                                        this.f23898[i9 - 1].f25822 = c8434;
                                        if (c8434.m22110()) {
                                            c8434.m22109(false);
                                            c8434.f25822.m22098(c8434);
                                        }
                                        c8433 = c8434;
                                    } else {
                                        c8434 = c8433.f25823;
                                        c8434.m22099(true);
                                        c8433.m22099(false);
                                        c8433.f25823 = c8434.f25822;
                                        c8434.f25822 = c8433;
                                        this.f23898[i9 - 1].f25822 = c8434;
                                        if (c8434.m22110()) {
                                            c8434.m22109(false);
                                            c8434.f25822.m22098(c8434);
                                        }
                                        c8433 = c8434;
                                    }
                                    i6 = i9 - 1;
                                    c8433.m22099(this.f23898[i6].m22107());
                                    this.f23898[i6].m22099(true);
                                    c8433.f25822.m22099(true);
                                    c8430Arr3 = this.f23898;
                                    C8430 c8438 = c8430Arr3[i6];
                                    c8438.f25822 = c8433.f25823;
                                    c8433.f25823 = c8438;
                                    if (i9 < 2) {
                                        this.f23897 = c8433;
                                    } else {
                                        i7 = i9 - 2;
                                        if (this.f23904[i7]) {
                                            c8430Arr3[i7].f25822 = c8433;
                                        } else {
                                            c8430Arr3[i7].f25823 = c8433;
                                        }
                                    }
                                    if (c8433.m22102()) {
                                        c8433.m22106(false);
                                        this.f23898[i6].m22105(c8433);
                                    }
                                } else {
                                    c8431 = this.f23898[i18].f25823;
                                    if (!c8431.m22107()) {
                                        c8431.m22099(true);
                                        this.f23898[i18].m22099(false);
                                        c8430Arr2 = this.f23898;
                                        C8430 c8439 = c8430Arr2[i18];
                                        c8439.f25823 = c8431.f25822;
                                        c8431.f25822 = c8439;
                                        if (i9 < 2) {
                                            this.f23897 = c8431;
                                        } else {
                                            i5 = i9 - 2;
                                            if (this.f23904[i5]) {
                                                c8430Arr2[i5].f25822 = c8431;
                                            } else {
                                                c8430Arr2[i5].f25823 = c8431;
                                            }
                                        }
                                        c8430Arr2[i9] = c8439;
                                        this.f23904[i9] = true;
                                        c8430Arr2[i18] = c8431;
                                        int i20 = i9 + 1;
                                        if (i17 == i9) {
                                            i17++;
                                        }
                                        c8431 = c8430Arr2[i9].f25823;
                                        i9 = i20;
                                    }
                                    if (!c8431.m22102()) {
                                        c8431.m22099(false);
                                        i9--;
                                    } else {
                                        c8431.m22099(false);
                                        i9--;
                                    }
                                    if (!c8431.m22102()) {
                                        c8432 = c8431.f25822;
                                        c8432.m22099(true);
                                        c8431.m22099(false);
                                        c8431.f25822 = c8432.f25823;
                                        c8432.f25823 = c8431;
                                        this.f23898[i9 - 1].f25823 = c8432;
                                        if (c8432.m22102()) {
                                            c8432.m22106(false);
                                            c8432.f25823.m22105(c8432);
                                        }
                                        c8431 = c8432;
                                    } else {
                                        c8432 = c8431.f25822;
                                        c8432.m22099(true);
                                        c8431.m22099(false);
                                        c8431.f25822 = c8432.f25823;
                                        c8432.f25823 = c8431;
                                        this.f23898[i9 - 1].f25823 = c8432;
                                        if (c8432.m22102()) {
                                            c8432.m22106(false);
                                            c8432.f25823.m22105(c8432);
                                        }
                                        c8431 = c8432;
                                    }
                                    i3 = i9 - 1;
                                    c8431.m22099(this.f23898[i3].m22107());
                                    this.f23898[i3].m22099(true);
                                    c8431.f25823.m22099(true);
                                    c8430Arr = this.f23898;
                                    C8430 c84310 = c8430Arr[i3];
                                    c84310.f25823 = c8431.f25822;
                                    c8431.f25822 = c84310;
                                    if (i9 < 2) {
                                        this.f23897 = c8431;
                                    } else {
                                        i4 = i9 - 2;
                                        if (this.f23904[i4]) {
                                            c8430Arr[i4].f25822 = c8431;
                                        } else {
                                            c8430Arr[i4].f25823 = c8431;
                                        }
                                    }
                                    if (c8431.m22110()) {
                                        c8431.m22109(false);
                                        this.f23898[i3].m22098(c8431);
                                    }
                                }
                            } else if (!this.f23904[i18]) {
                                c8433 = this.f23898[i18].f25822;
                                if (!c8433.m22107()) {
                                    c8433.m22099(true);
                                    this.f23898[i18].m22099(false);
                                    c8430Arr4 = this.f23898;
                                    C8430 c84311 = c8430Arr4[i18];
                                    c84311.f25822 = c8433.f25823;
                                    c8433.f25823 = c84311;
                                    if (i9 < 2) {
                                        this.f23897 = c8433;
                                    } else {
                                        i8 = i9 - 2;
                                        if (this.f23904[i8]) {
                                            c8430Arr4[i8].f25822 = c8433;
                                        } else {
                                            c8430Arr4[i8].f25823 = c8433;
                                        }
                                    }
                                    c8430Arr4[i9] = c84311;
                                    this.f23904[i9] = false;
                                    c8430Arr4[i18] = c8433;
                                    int i110 = i9 + 1;
                                    if (i17 == i9) {
                                        i17++;
                                    }
                                    c8433 = c8430Arr4[i9].f25822;
                                    i9 = i110;
                                }
                                if ((!c8433.m22102() || c8433.f25823.m22107()) && (c8433.m22110() || c8433.f25822.m22107())) {
                                    c8433.m22099(false);
                                    i9--;
                                } else {
                                    if (!c8433.m22110() || c8433.f25822.m22107()) {
                                        c8434 = c8433.f25823;
                                        c8434.m22099(true);
                                        c8433.m22099(false);
                                        c8433.f25823 = c8434.f25822;
                                        c8434.f25822 = c8433;
                                        this.f23898[i9 - 1].f25822 = c8434;
                                        if (c8434.m22110()) {
                                            c8434.m22109(false);
                                            c8434.f25822.m22098(c8434);
                                        }
                                        c8433 = c8434;
                                    }
                                    i6 = i9 - 1;
                                    c8433.m22099(this.f23898[i6].m22107());
                                    this.f23898[i6].m22099(true);
                                    c8433.f25822.m22099(true);
                                    c8430Arr3 = this.f23898;
                                    C8430 c84312 = c8430Arr3[i6];
                                    c84312.f25822 = c8433.f25823;
                                    c8433.f25823 = c84312;
                                    if (i9 < 2) {
                                        this.f23897 = c8433;
                                    } else {
                                        i7 = i9 - 2;
                                        if (this.f23904[i7]) {
                                            c8430Arr3[i7].f25822 = c8433;
                                        } else {
                                            c8430Arr3[i7].f25823 = c8433;
                                        }
                                    }
                                    if (c8433.m22102()) {
                                        c8433.m22106(false);
                                        this.f23898[i6].m22105(c8433);
                                    }
                                }
                            } else {
                                c8431 = this.f23898[i18].f25823;
                                if (!c8431.m22107()) {
                                    c8431.m22099(true);
                                    this.f23898[i18].m22099(false);
                                    c8430Arr2 = this.f23898;
                                    C8430 c84313 = c8430Arr2[i18];
                                    c84313.f25823 = c8431.f25822;
                                    c8431.f25822 = c84313;
                                    if (i9 < 2) {
                                        this.f23897 = c8431;
                                    } else {
                                        i5 = i9 - 2;
                                        if (this.f23904[i5]) {
                                            c8430Arr2[i5].f25822 = c8431;
                                        } else {
                                            c8430Arr2[i5].f25823 = c8431;
                                        }
                                    }
                                    c8430Arr2[i9] = c84313;
                                    this.f23904[i9] = true;
                                    c8430Arr2[i18] = c8431;
                                    int i21 = i9 + 1;
                                    if (i17 == i9) {
                                        i17++;
                                    }
                                    c8431 = c8430Arr2[i9].f25823;
                                    i9 = i21;
                                }
                                if ((!c8431.m22102() || c8431.f25823.m22107()) && (c8431.m22110() || c8431.f25822.m22107())) {
                                    c8431.m22099(false);
                                    i9--;
                                } else {
                                    if (!c8431.m22102() || c8431.f25823.m22107()) {
                                        c8432 = c8431.f25822;
                                        c8432.m22099(true);
                                        c8431.m22099(false);
                                        c8431.f25822 = c8432.f25823;
                                        c8432.f25823 = c8431;
                                        this.f23898[i9 - 1].f25823 = c8432;
                                        if (c8432.m22102()) {
                                            c8432.m22106(false);
                                            c8432.f25823.m22105(c8432);
                                        }
                                        c8431 = c8432;
                                    }
                                    i3 = i9 - 1;
                                    c8431.m22099(this.f23898[i3].m22107());
                                    this.f23898[i3].m22099(true);
                                    c8431.f25823.m22099(true);
                                    c8430Arr = this.f23898;
                                    C8430 c84314 = c8430Arr[i3];
                                    c84314.f25823 = c8431.f25822;
                                    c8431.f25822 = c84314;
                                    if (i9 < 2) {
                                        this.f23897 = c8431;
                                    } else {
                                        i4 = i9 - 2;
                                        if (this.f23904[i4]) {
                                            c8430Arr[i4].f25822 = c8431;
                                        } else {
                                            c8430Arr[i4].f25823 = c8431;
                                        }
                                    }
                                    if (c8431.m22110()) {
                                        c8431.m22109(false);
                                        this.f23898[i3].m22098(c8431);
                                    }
                                }
                            }
                        }
                        i9 = i17;
                        C8430 c84315 = this.f23897;
                        if (c84315 != null) {
                            c84315.m22099(true);
                        }
                    }
                }
                this.f23900 = true;
                this.f23903--;
                while (true) {
                    int i22 = i9 - 1;
                    if (i9 != 0) {
                        this.f23898[i22] = null;
                        i9 = i22;
                    } else {
                        return c8430M22101.f17058;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C14073 c14073 = new C14073(this);
        int i = this.f23903;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C11003.equals(c14073.m51565().f17058, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f23903 = 0;
        this.f23897 = null;
        this.f23902 = null;
        this.f23899 = null;
        this.f23895 = null;
        this.f23901 = null;
        this.f23896 = null;
    }

    @Override // l.AbstractC1269, l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2422(int i) {
        return m20679(i) != null;
    }

    @Override // l.AbstractC0563, l.InterfaceC9893
    public final int size() {
        return this.f23903;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f23903 == 0;
    }

    @Override // l.InterfaceC12954
    public final Object get(int i) {
        C8430 c8430M20679 = m20679(i);
        if (c8430M20679 == null) {
            return null;
        }
        return c8430M20679.f17058;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۡ */
    public final int mo5870() {
        if (this.f23897 == null) {
            throw new NoSuchElementException();
        }
        return this.f23896.f17057;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۛ */
    public final int mo5868() {
        if (this.f23897 == null) {
            throw new NoSuchElementException();
        }
        return this.f23901.f17057;
    }

    @Override // l.AbstractC15379, l.InterfaceC13659
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC0919 mo5869() {
        if (this.f23902 == null) {
            this.f23902 = new C5608(this);
        }
        return this.f23902;
    }

    @Override // l.AbstractC15379, java.util.Map, l.InterfaceC1749, java.util.SortedMap
    public final InterfaceC1933 keySet() {
        if (this.f23895 == null) {
            this.f23895 = new C22541(this);
        }
        return this.f23895;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f23899 == null) {
            this.f23899 = new C1374(this);
        }
        return this.f23899;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC1749 mo5874(int i) {
        return new C11958(this, 0, true, i, false);
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC1749 mo5871(int i) {
        return new C11958(this, i, false, 0, true);
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1749 mo5872(int i, int i2) {
        return new C11958(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C7724 c7724 = (C7724) super.clone();
            c7724.f23895 = null;
            c7724.f23899 = null;
            c7724.f23902 = null;
            c7724.f23904 = new boolean[64];
            c7724.f23898 = new C8430[64];
            if (this.f23903 != 0) {
                C8430 c8430 = new C8430();
                C8430 c8431 = new C8430();
                C8430 c8432 = this.f23897;
                c8430.f25824 &= -1073741825;
                c8430.f25823 = c8432;
                c8431.m22098((C8430) null);
                C8430 c8433 = c8431;
                loop0: while (true) {
                    if (!c8430.m22102()) {
                        C8430 c8430Clone = c8430.f25823.clone();
                        c8430Clone.m22098(c8433.f25823);
                        c8430Clone.m22105(c8433);
                        c8433.f25824 &= -1073741825;
                        c8433.f25823 = c8430Clone;
                        c8430 = c8430.f25823;
                        c8433 = c8430Clone;
                    } else {
                        while (c8430.m22110()) {
                            c8430 = c8430.f25822;
                            if (c8430 == null) {
                                break loop0;
                            }
                            c8433 = c8433.f25822;
                        }
                        c8430 = c8430.f25822;
                        c8433 = c8433.f25822;
                    }
                    if (!c8430.m22110()) {
                        C8430 c8430Clone2 = c8430.f25822.clone();
                        c8430Clone2.m22105(c8433.f25822);
                        c8430Clone2.m22098(c8433);
                        c8433.m22103(c8430Clone2);
                    }
                }
                c8433.f25822 = null;
                C8430 c8434 = c8431.f25823;
                c7724.f23897 = c8434;
                c7724.f23896 = c8434;
                while (true) {
                    C8430 c8435 = c7724.f23896.f25823;
                    if (c8435 == null) {
                        break;
                    }
                    c7724.f23896 = c8435;
                }
                c7724.f23901 = c7724.f23897;
                while (true) {
                    C8430 c8436 = c7724.f23901.f25822;
                    if (c8436 == null) {
                        break;
                    }
                    c7724.f23901 = c8436;
                }
            }
            return c7724;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f23903;
        C15484 c15484 = new C15484(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C8430 c8430M51565 = c15484.m51565();
            objectOutputStream.writeInt(c8430M51565.f17057);
            objectOutputStream.writeObject(c8430M51565.f17058);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8430 m20678(ObjectInputStream objectInputStream, int i, C8430 c8430, C8430 c8431) {
        if (i == 1) {
            C8430 c8432 = new C8430(objectInputStream.readInt(), objectInputStream.readObject());
            c8432.m22098(c8430);
            c8432.m22105(c8431);
            c8432.m22099(true);
            return c8432;
        }
        if (i == 2) {
            C8430 c8433 = new C8430(objectInputStream.readInt(), objectInputStream.readObject());
            c8433.m22099(true);
            c8433.m22103(new C8430(objectInputStream.readInt(), objectInputStream.readObject()));
            c8433.f25822.m22098(c8433);
            c8433.m22098(c8430);
            c8433.f25822.m22105(c8431);
            return c8433;
        }
        int i2 = i / 2;
        C8430 c8434 = new C8430();
        C8430 c8430M20678 = m20678(objectInputStream, (i - i2) - 1, c8430, c8434);
        c8434.f25824 &= -1073741825;
        c8434.f25823 = c8430M20678;
        c8434.f17057 = objectInputStream.readInt();
        c8434.f17058 = objectInputStream.readObject();
        c8434.m22099(true);
        c8434.m22103(m20678(objectInputStream, i2, c8434, c8431));
        int i3 = i + 2;
        if (i3 == ((-i3) & i3)) {
            c8434.f25822.m22099(false);
        }
        return c8434;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f23904 = new boolean[64];
        this.f23898 = new C8430[64];
        int i = this.f23903;
        if (i != 0) {
            C8430 c8430M20678 = m20678(objectInputStream, i, null, null);
            this.f23897 = c8430M20678;
            while (c8430M20678.m22108() != null) {
                c8430M20678 = c8430M20678.m22108();
            }
            this.f23896 = c8430M20678;
            C8430 c8430M22101 = this.f23897;
            while (c8430M22101.m22101() != null) {
                c8430M22101 = c8430M22101.m22101();
            }
            this.f23901 = c8430M22101;
        }
    }
}
