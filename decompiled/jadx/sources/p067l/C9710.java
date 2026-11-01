package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C9710 extends AbstractC16985 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ */
    public transient InterfaceC4206 f26808;

    /* JADX INFO: renamed from: ۙ */
    public transient C10381 f26809;

    /* JADX INFO: renamed from: ۨ */
    public transient InterfaceC21210 f26812;

    /* JADX INFO: renamed from: ۫ */
    public transient boolean f26813;

    /* JADX INFO: renamed from: ۬ */
    public transient C10381 f26814;

    /* JADX INFO: renamed from: ᩶ */
    public transient InterfaceC3242 f26815;

    /* JADX INFO: renamed from: ᩹ */
    public transient boolean[] f26817 = new boolean[64];

    /* JADX INFO: renamed from: ۤ */
    public transient C10381[] f26811 = new C10381[64];

    /* JADX INFO: renamed from: ۛ */
    public transient C10381 f26810 = null;

    /* JADX INFO: renamed from: ᩸ */
    public int f26816 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۫ */
    public final void mo8083() {
    }

    /* JADX INFO: renamed from: ܽ */
    public final C10381 m22659(int i) {
        C10381 c10381M24078 = this.f26810;
        while (c10381M24078 != null) {
            int iCompare = Integer.compare(i, c10381M24078.f19896);
            if (iCompare == 0) {
                break;
            }
            c10381M24078 = iCompare < 0 ? c10381M24078.m24078() : c10381M24078.m24071();
        }
        return c10381M24078;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C10381 m22660(int i) {
        C10381 c10381M24078 = this.f26810;
        C10381 c10381 = c10381M24078;
        int iCompare = 0;
        while (c10381M24078 != null) {
            iCompare = Integer.compare(i, c10381M24078.f19896);
            if (iCompare == 0) {
                break;
            }
            c10381 = c10381M24078;
            c10381M24078 = iCompare < 0 ? c10381M24078.m24078() : c10381M24078.m24071();
        }
        return iCompare == 0 ? c10381M24078 : c10381;
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4686(int i, Object obj) {
        int i2;
        C10381 c10381;
        C10381 c10382;
        C10381 c10383;
        int i3 = 0;
        this.f26813 = false;
        C10381 c10384 = this.f26810;
        if (c10384 == null) {
            this.f26816++;
            c10384 = new C10381(i, null);
            this.f26809 = c10384;
            this.f26814 = c10384;
            this.f26810 = c10384;
        } else {
            int i4 = 0;
            while (true) {
                int iCompare = Integer.compare(i, c10384.f19896);
                if (iCompare == 0) {
                    while (true) {
                        int i5 = i4 - 1;
                        if (i4 == 0) {
                            break;
                        }
                        this.f26811[i5] = null;
                        i4 = i5;
                    }
                } else {
                    this.f26811[i4] = c10384;
                    boolean[] zArr = this.f26817;
                    i2 = i4 + 1;
                    boolean z = iCompare > 0;
                    zArr[i4] = z;
                    if (z) {
                        if (c10384.m24080()) {
                            this.f26816++;
                            c10381 = new C10381(i, null);
                            C10381 c10385 = c10384.f28735;
                            if (c10385 == null) {
                                this.f26814 = c10381;
                            }
                            c10381.f28736 = c10384;
                            c10381.f28735 = c10385;
                            c10384.m24073(c10381);
                            break;
                        }
                        c10384 = c10384.f28735;
                        i4 = i2;
                    } else {
                        if (c10384.m24072()) {
                            this.f26816++;
                            c10381 = new C10381(i, null);
                            C10381 c10386 = c10384.f28736;
                            if (c10386 == null) {
                                this.f26809 = c10381;
                            }
                            c10381.f28735 = c10384;
                            c10381.f28736 = c10386;
                            c10384.f28737 &= -1073741825;
                            c10384.f28736 = c10381;
                            break;
                        }
                        c10384 = c10384.f28736;
                        i4 = i2;
                    }
                }
                Object obj2 = c10384.f19897;
                c10384.f19897 = obj;
                return obj2;
            }
            c10384 = c10381;
            this.f26813 = true;
            while (i4 > 0 && !this.f26811[i4].m24077()) {
                int i6 = i4 - 1;
                if (!this.f26817[i6]) {
                    C10381 c10387 = this.f26811[i6];
                    C10381 c10388 = c10387.f28735;
                    if (!c10387.m24080() && !c10388.m24077()) {
                        this.f26811[i4].m24069(true);
                        c10388.m24069(true);
                        this.f26811[i6].m24069(false);
                        i4 -= 2;
                    } else {
                        if (this.f26817[i4]) {
                            C10381[] c10381Arr = this.f26811;
                            C10381 c10389 = c10381Arr[i4];
                            C10381 c103810 = c10389.f28735;
                            c10389.f28735 = c103810.f28736;
                            c103810.f28736 = c10389;
                            c10381Arr[i6].f28736 = c103810;
                            if (c103810.m24072()) {
                                c103810.m24076(false);
                                c10389.m24075(c103810);
                            }
                            c10383 = c103810;
                        } else {
                            c10383 = this.f26811[i4];
                        }
                        C10381 c103811 = this.f26811[i6];
                        c103811.m24069(false);
                        c10383.m24069(true);
                        c103811.f28736 = c10383.f28735;
                        c10383.f28735 = c103811;
                        if (i4 < 2) {
                            this.f26810 = c10383;
                        } else {
                            int i7 = i4 - 2;
                            if (this.f26817[i7]) {
                                this.f26811[i7].f28735 = c10383;
                            } else {
                                this.f26811[i7].f28736 = c10383;
                            }
                        }
                        if (!c10383.m24080()) {
                            break;
                        }
                        c10383.m24079(false);
                        c103811.m24068(c10383);
                        break;
                    }
                } else {
                    C10381 c103812 = this.f26811[i6];
                    C10381 c103813 = c103812.f28736;
                    if (!c103812.m24072() && !c103813.m24077()) {
                        this.f26811[i4].m24069(true);
                        c103813.m24069(true);
                        this.f26811[i6].m24069(false);
                        i4 -= 2;
                    } else {
                        if (this.f26817[i4]) {
                            c10382 = this.f26811[i4];
                        } else {
                            C10381[] c10381Arr2 = this.f26811;
                            C10381 c103814 = c10381Arr2[i4];
                            C10381 c103815 = c103814.f28736;
                            c103814.f28736 = c103815.f28735;
                            c103815.f28735 = c103814;
                            c10381Arr2[i6].f28735 = c103815;
                            if (c103815.m24080()) {
                                c103815.m24079(false);
                                c103814.m24068(c103815);
                            }
                            c10382 = c103815;
                        }
                        C10381 c103816 = this.f26811[i6];
                        c103816.m24069(false);
                        c10382.m24069(true);
                        c103816.f28735 = c10382.f28736;
                        c10382.f28736 = c103816;
                        if (i4 < 2) {
                            this.f26810 = c10382;
                        } else {
                            int i8 = i4 - 2;
                            if (this.f26817[i8]) {
                                this.f26811[i8].f28735 = c10382;
                            } else {
                                this.f26811[i8].f28736 = c10382;
                            }
                        }
                        if (!c10382.m24072()) {
                            break;
                        }
                        c10382.m24076(false);
                        c103816.m24075(c10382);
                        break;
                    }
                }
            }
            i3 = i2;
        }
        this.f26810.m24069(true);
        while (true) {
            int i9 = i3 - 1;
            if (i3 == 0) {
                break;
            }
            this.f26811[i9] = null;
            i3 = i9;
        }
        Object obj3 = c10384.f19897;
        c10384.f19897 = obj;
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
    @Override // p067l.AbstractC2904, p067l.InterfaceC14680
    public final Object remove(int i) {
        int i2;
        C10381 c10381;
        C10381 c10382;
        C10381 c10383;
        int i3;
        C10381[] c10381Arr;
        int i4;
        C10381[] c10381Arr2;
        int i5;
        C10381 c10384;
        C10381 c10385;
        int i6;
        C10381[] c10381Arr3;
        int i7;
        C10381[] c10381Arr4;
        int i8;
        this.f26813 = false;
        C10381 c10381M24071 = this.f26810;
        if (c10381M24071 == null) {
            return null;
        }
        int i9 = 0;
        while (true) {
            int iCompare = Integer.compare(i, c10381M24071.f19896);
            if (iCompare != 0) {
                boolean[] zArr = this.f26817;
                boolean z = iCompare > 0;
                zArr[i9] = z;
                this.f26811[i9] = c10381M24071;
                i9++;
                if (z) {
                    c10381M24071 = c10381M24071.m24071();
                    if (c10381M24071 == null) {
                        while (true) {
                            int i10 = i9 - 1;
                            if (i9 == 0) {
                                return null;
                            }
                            this.f26811[i10] = null;
                            i9 = i10;
                        }
                    }
                } else {
                    c10381M24071 = c10381M24071.m24078();
                    if (c10381M24071 == null) {
                        while (true) {
                            int i11 = i9 - 1;
                            if (i9 == 0) {
                                return null;
                            }
                            this.f26811[i11] = null;
                            i9 = i11;
                        }
                    }
                }
            } else {
                if (c10381M24071.f28736 == null) {
                    this.f26809 = c10381M24071.m24074();
                }
                if (c10381M24071.f28735 == null) {
                    this.f26814 = c10381M24071.m24070();
                }
                if (c10381M24071.m24080()) {
                    if (!c10381M24071.m24072()) {
                        c10381M24071.m24070().f28735 = c10381M24071.f28735;
                        if (i9 == 0) {
                            this.f26810 = c10381M24071.f28736;
                        } else {
                            int i12 = i9 - 1;
                            if (this.f26817[i12]) {
                                this.f26811[i12].f28735 = c10381M24071.f28736;
                            } else {
                                this.f26811[i12].f28736 = c10381M24071.f28736;
                            }
                        }
                    } else if (i9 == 0) {
                        this.f26810 = c10381M24071.f28736;
                    } else {
                        int i13 = i9 - 1;
                        if (this.f26817[i13]) {
                            this.f26811[i13].m24075(c10381M24071.f28735);
                        } else {
                            this.f26811[i13].m24068(c10381M24071.f28736);
                        }
                    }
                } else {
                    C10381 c10386 = c10381M24071.f28735;
                    if (c10386.m24072()) {
                        c10386.f28736 = c10381M24071.f28736;
                        c10386.m24076(c10381M24071.m24072());
                        if (!c10386.m24072()) {
                            c10386.m24070().f28735 = c10386;
                        }
                        if (i9 == 0) {
                            this.f26810 = c10386;
                        } else {
                            int i14 = i9 - 1;
                            if (this.f26817[i14]) {
                                this.f26811[i14].f28735 = c10386;
                            } else {
                                this.f26811[i14].f28736 = c10386;
                            }
                        }
                        boolean zM24077 = c10386.m24077();
                        c10386.m24069(c10381M24071.m24077());
                        c10381M24071.m24069(zM24077);
                        this.f26817[i9] = true;
                        this.f26811[i9] = c10386;
                        i9++;
                    } else {
                        int i15 = i9 + 1;
                        while (true) {
                            this.f26817[i15] = false;
                            i2 = i15 + 1;
                            this.f26811[i15] = c10386;
                            c10381 = c10386.f28736;
                            if (c10381.m24072()) {
                                break;
                            }
                            c10386 = c10381;
                            i15 = i2;
                        }
                        this.f26817[i9] = true;
                        this.f26811[i9] = c10381;
                        if (c10381.m24080()) {
                            c10386.m24068(c10381);
                        } else {
                            c10386.f28736 = c10381.f28735;
                        }
                        c10381.f28736 = c10381M24071.f28736;
                        if (!c10381M24071.m24072()) {
                            c10381M24071.m24070().f28735 = c10381;
                            c10381.m24076(false);
                        }
                        c10381.m24073(c10381M24071.f28735);
                        boolean zM24078 = c10381.m24077();
                        c10381.m24069(c10381M24071.m24077());
                        c10381M24071.m24069(zM24078);
                        if (i9 == 0) {
                            this.f26810 = c10381;
                        } else {
                            int i16 = i9 - 1;
                            if (this.f26817[i16]) {
                                this.f26811[i16].f28735 = c10381;
                            } else {
                                this.f26811[i16].f28736 = c10381;
                            }
                        }
                        i9 = i2;
                    }
                }
                if (c10381M24071.m24077()) {
                    int i17 = i9;
                    while (true) {
                        if (i9 > 0) {
                            int i18 = i9 - 1;
                            if ((this.f26817[i18] && !this.f26811[i18].m24080()) || (!this.f26817[i18] && !this.f26811[i18].m24072())) {
                                C10381 c10387 = this.f26817[i18] ? this.f26811[i18].f28735 : this.f26811[i18].f28736;
                                if (!c10387.m24077()) {
                                    c10387.m24069(true);
                                } else if (!this.f26817[i18]) {
                                    c10384 = this.f26811[i18].f28735;
                                    if (!c10384.m24077()) {
                                        c10384.m24069(true);
                                        this.f26811[i18].m24069(false);
                                        c10381Arr4 = this.f26811;
                                        C10381 c10388 = c10381Arr4[i18];
                                        c10388.f28735 = c10384.f28736;
                                        c10384.f28736 = c10388;
                                        if (i9 < 2) {
                                            this.f26810 = c10384;
                                        } else {
                                            i8 = i9 - 2;
                                            if (this.f26817[i8]) {
                                                c10381Arr4[i8].f28735 = c10384;
                                            } else {
                                                c10381Arr4[i8].f28736 = c10384;
                                            }
                                        }
                                        c10381Arr4[i9] = c10388;
                                        this.f26817[i9] = false;
                                        c10381Arr4[i18] = c10384;
                                        int i19 = i9 + 1;
                                        if (i17 == i9) {
                                            i17++;
                                        }
                                        c10384 = c10381Arr4[i9].f28735;
                                        i9 = i19;
                                    }
                                    if (!c10384.m24072()) {
                                        c10384.m24069(false);
                                        i9--;
                                    } else {
                                        c10384.m24069(false);
                                        i9--;
                                    }
                                    if (!c10384.m24080()) {
                                        c10385 = c10384.f28736;
                                        c10385.m24069(true);
                                        c10384.m24069(false);
                                        c10384.f28736 = c10385.f28735;
                                        c10385.f28735 = c10384;
                                        this.f26811[i9 - 1].f28735 = c10385;
                                        if (c10385.m24080()) {
                                            c10385.m24079(false);
                                            c10385.f28735.m24068(c10385);
                                        }
                                        c10384 = c10385;
                                    } else {
                                        c10385 = c10384.f28736;
                                        c10385.m24069(true);
                                        c10384.m24069(false);
                                        c10384.f28736 = c10385.f28735;
                                        c10385.f28735 = c10384;
                                        this.f26811[i9 - 1].f28735 = c10385;
                                        if (c10385.m24080()) {
                                            c10385.m24079(false);
                                            c10385.f28735.m24068(c10385);
                                        }
                                        c10384 = c10385;
                                    }
                                    i6 = i9 - 1;
                                    c10384.m24069(this.f26811[i6].m24077());
                                    this.f26811[i6].m24069(true);
                                    c10384.f28735.m24069(true);
                                    c10381Arr3 = this.f26811;
                                    C10381 c10389 = c10381Arr3[i6];
                                    c10389.f28735 = c10384.f28736;
                                    c10384.f28736 = c10389;
                                    if (i9 < 2) {
                                        this.f26810 = c10384;
                                    } else {
                                        i7 = i9 - 2;
                                        if (this.f26817[i7]) {
                                            c10381Arr3[i7].f28735 = c10384;
                                        } else {
                                            c10381Arr3[i7].f28736 = c10384;
                                        }
                                    }
                                    if (c10384.m24072()) {
                                        c10384.m24076(false);
                                        this.f26811[i6].m24075(c10384);
                                    }
                                } else {
                                    c10382 = this.f26811[i18].f28736;
                                    if (!c10382.m24077()) {
                                        c10382.m24069(true);
                                        this.f26811[i18].m24069(false);
                                        c10381Arr2 = this.f26811;
                                        C10381 c103810 = c10381Arr2[i18];
                                        c103810.f28736 = c10382.f28735;
                                        c10382.f28735 = c103810;
                                        if (i9 < 2) {
                                            this.f26810 = c10382;
                                        } else {
                                            i5 = i9 - 2;
                                            if (this.f26817[i5]) {
                                                c10381Arr2[i5].f28735 = c10382;
                                            } else {
                                                c10381Arr2[i5].f28736 = c10382;
                                            }
                                        }
                                        c10381Arr2[i9] = c103810;
                                        this.f26817[i9] = true;
                                        c10381Arr2[i18] = c10382;
                                        int i20 = i9 + 1;
                                        if (i17 == i9) {
                                            i17++;
                                        }
                                        c10382 = c10381Arr2[i9].f28736;
                                        i9 = i20;
                                    }
                                    if (!c10382.m24072()) {
                                        c10382.m24069(false);
                                        i9--;
                                    } else {
                                        c10382.m24069(false);
                                        i9--;
                                    }
                                    if (!c10382.m24072()) {
                                        c10383 = c10382.f28735;
                                        c10383.m24069(true);
                                        c10382.m24069(false);
                                        c10382.f28735 = c10383.f28736;
                                        c10383.f28736 = c10382;
                                        this.f26811[i9 - 1].f28736 = c10383;
                                        if (c10383.m24072()) {
                                            c10383.m24076(false);
                                            c10383.f28736.m24075(c10383);
                                        }
                                        c10382 = c10383;
                                    } else {
                                        c10383 = c10382.f28735;
                                        c10383.m24069(true);
                                        c10382.m24069(false);
                                        c10382.f28735 = c10383.f28736;
                                        c10383.f28736 = c10382;
                                        this.f26811[i9 - 1].f28736 = c10383;
                                        if (c10383.m24072()) {
                                            c10383.m24076(false);
                                            c10383.f28736.m24075(c10383);
                                        }
                                        c10382 = c10383;
                                    }
                                    i3 = i9 - 1;
                                    c10382.m24069(this.f26811[i3].m24077());
                                    this.f26811[i3].m24069(true);
                                    c10382.f28736.m24069(true);
                                    c10381Arr = this.f26811;
                                    C10381 c103811 = c10381Arr[i3];
                                    c103811.f28736 = c10382.f28735;
                                    c10382.f28735 = c103811;
                                    if (i9 < 2) {
                                        this.f26810 = c10382;
                                    } else {
                                        i4 = i9 - 2;
                                        if (this.f26817[i4]) {
                                            c10381Arr[i4].f28735 = c10382;
                                        } else {
                                            c10381Arr[i4].f28736 = c10382;
                                        }
                                    }
                                    if (c10382.m24080()) {
                                        c10382.m24079(false);
                                        this.f26811[i3].m24068(c10382);
                                    }
                                }
                            } else if (!this.f26817[i18]) {
                                c10384 = this.f26811[i18].f28735;
                                if (!c10384.m24077()) {
                                    c10384.m24069(true);
                                    this.f26811[i18].m24069(false);
                                    c10381Arr4 = this.f26811;
                                    C10381 c103812 = c10381Arr4[i18];
                                    c103812.f28735 = c10384.f28736;
                                    c10384.f28736 = c103812;
                                    if (i9 < 2) {
                                        this.f26810 = c10384;
                                    } else {
                                        i8 = i9 - 2;
                                        if (this.f26817[i8]) {
                                            c10381Arr4[i8].f28735 = c10384;
                                        } else {
                                            c10381Arr4[i8].f28736 = c10384;
                                        }
                                    }
                                    c10381Arr4[i9] = c103812;
                                    this.f26817[i9] = false;
                                    c10381Arr4[i18] = c10384;
                                    int i110 = i9 + 1;
                                    if (i17 == i9) {
                                        i17++;
                                    }
                                    c10384 = c10381Arr4[i9].f28735;
                                    i9 = i110;
                                }
                                if ((!c10384.m24072() || c10384.f28736.m24077()) && (c10384.m24080() || c10384.f28735.m24077())) {
                                    c10384.m24069(false);
                                    i9--;
                                } else {
                                    if (!c10384.m24080() || c10384.f28735.m24077()) {
                                        c10385 = c10384.f28736;
                                        c10385.m24069(true);
                                        c10384.m24069(false);
                                        c10384.f28736 = c10385.f28735;
                                        c10385.f28735 = c10384;
                                        this.f26811[i9 - 1].f28735 = c10385;
                                        if (c10385.m24080()) {
                                            c10385.m24079(false);
                                            c10385.f28735.m24068(c10385);
                                        }
                                        c10384 = c10385;
                                    }
                                    i6 = i9 - 1;
                                    c10384.m24069(this.f26811[i6].m24077());
                                    this.f26811[i6].m24069(true);
                                    c10384.f28735.m24069(true);
                                    c10381Arr3 = this.f26811;
                                    C10381 c103813 = c10381Arr3[i6];
                                    c103813.f28735 = c10384.f28736;
                                    c10384.f28736 = c103813;
                                    if (i9 < 2) {
                                        this.f26810 = c10384;
                                    } else {
                                        i7 = i9 - 2;
                                        if (this.f26817[i7]) {
                                            c10381Arr3[i7].f28735 = c10384;
                                        } else {
                                            c10381Arr3[i7].f28736 = c10384;
                                        }
                                    }
                                    if (c10384.m24072()) {
                                        c10384.m24076(false);
                                        this.f26811[i6].m24075(c10384);
                                    }
                                }
                            } else {
                                c10382 = this.f26811[i18].f28736;
                                if (!c10382.m24077()) {
                                    c10382.m24069(true);
                                    this.f26811[i18].m24069(false);
                                    c10381Arr2 = this.f26811;
                                    C10381 c103814 = c10381Arr2[i18];
                                    c103814.f28736 = c10382.f28735;
                                    c10382.f28735 = c103814;
                                    if (i9 < 2) {
                                        this.f26810 = c10382;
                                    } else {
                                        i5 = i9 - 2;
                                        if (this.f26817[i5]) {
                                            c10381Arr2[i5].f28735 = c10382;
                                        } else {
                                            c10381Arr2[i5].f28736 = c10382;
                                        }
                                    }
                                    c10381Arr2[i9] = c103814;
                                    this.f26817[i9] = true;
                                    c10381Arr2[i18] = c10382;
                                    int i21 = i9 + 1;
                                    if (i17 == i9) {
                                        i17++;
                                    }
                                    c10382 = c10381Arr2[i9].f28736;
                                    i9 = i21;
                                }
                                if ((!c10382.m24072() || c10382.f28736.m24077()) && (c10382.m24080() || c10382.f28735.m24077())) {
                                    c10382.m24069(false);
                                    i9--;
                                } else {
                                    if (!c10382.m24072() || c10382.f28736.m24077()) {
                                        c10383 = c10382.f28735;
                                        c10383.m24069(true);
                                        c10382.m24069(false);
                                        c10382.f28735 = c10383.f28736;
                                        c10383.f28736 = c10382;
                                        this.f26811[i9 - 1].f28736 = c10383;
                                        if (c10383.m24072()) {
                                            c10383.m24076(false);
                                            c10383.f28736.m24075(c10383);
                                        }
                                        c10382 = c10383;
                                    }
                                    i3 = i9 - 1;
                                    c10382.m24069(this.f26811[i3].m24077());
                                    this.f26811[i3].m24069(true);
                                    c10382.f28736.m24069(true);
                                    c10381Arr = this.f26811;
                                    C10381 c103815 = c10381Arr[i3];
                                    c103815.f28736 = c10382.f28735;
                                    c10382.f28735 = c103815;
                                    if (i9 < 2) {
                                        this.f26810 = c10382;
                                    } else {
                                        i4 = i9 - 2;
                                        if (this.f26817[i4]) {
                                            c10381Arr[i4].f28735 = c10382;
                                        } else {
                                            c10381Arr[i4].f28736 = c10382;
                                        }
                                    }
                                    if (c10382.m24080()) {
                                        c10382.m24079(false);
                                        this.f26811[i3].m24068(c10382);
                                    }
                                }
                            }
                        }
                        i9 = i17;
                        C10381 c103816 = this.f26810;
                        if (c103816 != null) {
                            c103816.m24069(true);
                        }
                    }
                }
                this.f26813 = true;
                this.f26816--;
                while (true) {
                    int i22 = i9 - 1;
                    if (i9 != 0) {
                        this.f26811[i22] = null;
                        i9 = i22;
                    } else {
                        return c10381M24071.f19897;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C15744 c15744 = new C15744(this);
        int i = this.f26816;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C12826.equals(c15744.m53962().f19897, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f26816 = 0;
        this.f26810 = null;
        this.f26815 = null;
        this.f26812 = null;
        this.f26808 = null;
        this.f26814 = null;
        this.f26809 = null;
    }

    @Override // p067l.AbstractC3575, p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4793(int i) {
        return m22659(i) != null;
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC11771
    public final int size() {
        return this.f26816;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f26816 == 0;
    }

    @Override // p067l.InterfaceC14680
    public final Object get(int i) {
        C10381 c10381M22659 = m22659(i);
        if (c10381M22659 == null) {
            return null;
        }
        return c10381M22659.f19897;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۡ */
    public final int mo8080() {
        if (this.f26810 == null) {
            throw new NoSuchElementException();
        }
        return this.f26809.f19896;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۛ */
    public final int mo8078() {
        if (this.f26810 == null) {
            throw new NoSuchElementException();
        }
        return this.f26814.f19896;
    }

    @Override // p067l.AbstractC16985, p067l.InterfaceC15350
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC3242 mo8079() {
        if (this.f26815 == null) {
            this.f26815 = new C7699(this);
        }
        return this.f26815;
    }

    @Override // p067l.AbstractC16985, java.util.Map, p067l.InterfaceC4031, java.util.SortedMap
    public final InterfaceC4206 keySet() {
        if (this.f26808 == null) {
            this.f26808 = new C23792(this);
        }
        return this.f26808;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f26812 == null) {
            this.f26812 = new C3675(this);
        }
        return this.f26812;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC4031 mo8084(int i) {
        return new C13734(this, 0, true, i, false);
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC4031 mo8081(int i) {
        return new C13734(this, i, false, 0, true);
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4031 mo8082(int i, int i2) {
        return new C13734(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C9710 c9710 = (C9710) super.clone();
            c9710.f26808 = null;
            c9710.f26812 = null;
            c9710.f26815 = null;
            c9710.f26817 = new boolean[64];
            c9710.f26811 = new C10381[64];
            if (this.f26816 != 0) {
                C10381 c10381 = new C10381();
                C10381 c10382 = new C10381();
                C10381 c10383 = this.f26810;
                c10381.f28737 &= -1073741825;
                c10381.f28736 = c10383;
                c10382.m24068((C10381) null);
                C10381 c10384 = c10382;
                loop0: while (true) {
                    if (!c10381.m24072()) {
                        C10381 c10381Clone = c10381.f28736.clone();
                        c10381Clone.m24068(c10384.f28736);
                        c10381Clone.m24075(c10384);
                        c10384.f28737 &= -1073741825;
                        c10384.f28736 = c10381Clone;
                        c10381 = c10381.f28736;
                        c10384 = c10381Clone;
                    } else {
                        while (c10381.m24080()) {
                            c10381 = c10381.f28735;
                            if (c10381 == null) {
                                break loop0;
                            }
                            c10384 = c10384.f28735;
                        }
                        c10381 = c10381.f28735;
                        c10384 = c10384.f28735;
                    }
                    if (!c10381.m24080()) {
                        C10381 c10381Clone2 = c10381.f28735.clone();
                        c10381Clone2.m24075(c10384.f28735);
                        c10381Clone2.m24068(c10384);
                        c10384.m24073(c10381Clone2);
                    }
                }
                c10384.f28735 = null;
                C10381 c10385 = c10382.f28736;
                c9710.f26810 = c10385;
                c9710.f26809 = c10385;
                while (true) {
                    C10381 c10386 = c9710.f26809.f28736;
                    if (c10386 == null) {
                        break;
                    }
                    c9710.f26809 = c10386;
                }
                c9710.f26814 = c9710.f26810;
                while (true) {
                    C10381 c10387 = c9710.f26814.f28735;
                    if (c10387 == null) {
                        break;
                    }
                    c9710.f26814 = c10387;
                }
            }
            return c9710;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f26816;
        C17085 c17085 = new C17085(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C10381 c10381M53962 = c17085.m53962();
            objectOutputStream.writeInt(c10381M53962.f19896);
            objectOutputStream.writeObject(c10381M53962.f19897);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10381 m22658(ObjectInputStream objectInputStream, int i, C10381 c10381, C10381 c10382) {
        if (i == 1) {
            C10381 c10383 = new C10381(objectInputStream.readInt(), objectInputStream.readObject());
            c10383.m24068(c10381);
            c10383.m24075(c10382);
            c10383.m24069(true);
            return c10383;
        }
        if (i == 2) {
            C10381 c10384 = new C10381(objectInputStream.readInt(), objectInputStream.readObject());
            c10384.m24069(true);
            c10384.m24073(new C10381(objectInputStream.readInt(), objectInputStream.readObject()));
            c10384.f28735.m24068(c10384);
            c10384.m24068(c10381);
            c10384.f28735.m24075(c10382);
            return c10384;
        }
        int i2 = i / 2;
        C10381 c10385 = new C10381();
        C10381 c10381M22658 = m22658(objectInputStream, (i - i2) - 1, c10381, c10385);
        c10385.f28737 &= -1073741825;
        c10385.f28736 = c10381M22658;
        c10385.f19896 = objectInputStream.readInt();
        c10385.f19897 = objectInputStream.readObject();
        c10385.m24069(true);
        c10385.m24073(m22658(objectInputStream, i2, c10385, c10382));
        int i3 = i + 2;
        if (i3 == ((-i3) & i3)) {
            c10385.f28735.m24069(false);
        }
        return c10385;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f26817 = new boolean[64];
        this.f26811 = new C10381[64];
        int i = this.f26816;
        if (i != 0) {
            C10381 c10381M22658 = m22658(objectInputStream, i, null, null);
            this.f26810 = c10381M22658;
            while (c10381M22658.m24078() != null) {
                c10381M22658 = c10381M22658.m24078();
            }
            this.f26809 = c10381M22658;
            C10381 c10381M24071 = this.f26810;
            while (c10381M24071.m24071() != null) {
                c10381M24071 = c10381M24071.m24071();
            }
            this.f26814 = c10381M24071;
        }
    }
}
