package p067l;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۘۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V702 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6041 implements InterfaceC8367 {

    /* JADX INFO: renamed from: ֡ */
    public int f15123;

    /* JADX INFO: renamed from: ֨ */
    public int f15124;

    /* JADX INFO: renamed from: ֫ */
    public int f15125;

    /* JADX INFO: renamed from: ֫֫ */
    public final int f15126;

    /* JADX INFO: renamed from: ۖ */
    public C20794 f15127;

    /* JADX INFO: renamed from: ۗ */
    public final int f15128;

    /* JADX INFO: renamed from: ۘ */
    public int f15129;

    /* JADX INFO: renamed from: ۙ */
    public int[] f15130;

    /* JADX INFO: renamed from: ۚ */
    public int f15131;

    /* JADX INFO: renamed from: ۛ */
    public boolean f15132;

    /* JADX INFO: renamed from: ۜ */
    public int f15133;

    /* JADX INFO: renamed from: ۜ֫ */
    public int f15134;

    /* JADX INFO: renamed from: ۠ */
    public C21307 f15136;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f15138;

    /* JADX INFO: renamed from: ۢ */
    public C21307 f15139;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f15140;

    /* JADX INFO: renamed from: ۤ */
    public int f15141;

    /* JADX INFO: renamed from: ۧ */
    public int[] f15142;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f15143;

    /* JADX INFO: renamed from: ۨ */
    public int f15144;

    /* JADX INFO: renamed from: ۫ */
    public boolean f15145;

    /* JADX INFO: renamed from: ۬ */
    public C20123 f15146;

    /* JADX INFO: renamed from: ܰ */
    public boolean f15147;

    /* JADX INFO: renamed from: ܳ */
    public int f15148;

    /* JADX INFO: renamed from: ܶ */
    public int f15150;

    /* JADX INFO: renamed from: ܺ */
    public int f15151;

    /* JADX INFO: renamed from: ܽ */
    public int f15153;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C12391 f15154;

    /* JADX INFO: renamed from: ܿ */
    public int f15155;

    /* JADX INFO: renamed from: ܿ֫ */
    public C18110 f15156;

    /* JADX INFO: renamed from: ᩳ */
    public int f15157;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f15158;

    /* JADX INFO: renamed from: ᩴ */
    public int f15159;

    /* JADX INFO: renamed from: ᩵ */
    public int f15160;

    /* JADX INFO: renamed from: ᩶ */
    public C21307[] f15161;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f15163;

    /* JADX INFO: renamed from: ᩸ */
    public int f15164;

    /* JADX INFO: renamed from: ᩹ */
    public int[] f15165;

    /* JADX INFO: renamed from: ᩺ */
    public int[] f15166;

    /* JADX INFO: renamed from: ᩻ */
    public final C16611 f15167;

    /* JADX INFO: renamed from: ᩻֫ */
    public final /* synthetic */ C5370 f15168;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f15149 = -1;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f15152 = -1;

    /* JADX INFO: renamed from: ۟ */
    public long f15135 = -1;

    /* JADX INFO: renamed from: ᩷ */
    public int f15162 = -1;

    /* JADX INFO: renamed from: ۡ */
    public int f15137 = -1;

    public C6041(C5370 c5370, C12391 c12391, C16611 c16611, int i, int i2) {
        this.f15168 = c5370;
        this.f15154 = c12391;
        this.f15167 = c16611;
        this.f15128 = i;
        this.f15126 = i2;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m13603() {
        if (m13573()) {
            m13564();
            return true;
        }
        if (this.f15145) {
            return false;
        }
        int i = this.f15159;
        C12391 c12391 = this.f15154;
        if (i >= c12391.m28553() || c12391.m28564(this.f15159) >= this.f15128) {
            this.f15145 = true;
            return false;
        }
        int i2 = this.f15159;
        this.f15159 = i2 + 1;
        m13568(i2, 0);
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m13593(C20123 c20123) {
        int i;
        C20123 c20124 = this.f15146;
        if (c20124 == null) {
            this.f15146 = c20123;
        } else if (c20124 != c20123) {
            throw new C10064(EnumC2687.INVALID_RESULT);
        }
        if (m13573()) {
            m13564();
            return true;
        }
        boolean zM53664 = this.f15168.f12731.m53664();
        int i2 = this.f15126;
        if (zM53664 && this.f15162 < 0 && (i = this.f15159) <= i2) {
            this.f15162 = i;
        }
        int i3 = this.f15159;
        if (i3 <= i2) {
            this.f15159 = i3 + 1;
            m13568(i3, 1);
            return true;
        }
        m13572(c20123);
        this.f15146 = null;
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m13580(C20123 c20123) {
        int iM11673;
        if (this.f15162 >= 0) {
            boolean z = c20123.f62288;
            int i = c20123.f62259;
            if (!z) {
                C5370 c5370 = this.f15168;
                int i2 = i - 1;
                if (c5370.f12714[i2].f6604 == 15) {
                    if (c5370.f12675.m31283()) {
                        c5370.f12675.m31272(this.f15127);
                        return true;
                    }
                    int i3 = this.f15137;
                    C16611 c16611 = this.f15167;
                    C12391 c12391 = this.f15154;
                    if (i3 >= 0) {
                        C3358[] c3358Arr = c5370.f12714;
                        int i4 = this.f15137;
                        int i5 = c3358Arr[i4].f6567;
                        boolean z2 = i4 == i2;
                        int i6 = this.f15151;
                        if (i6 >= 0 && i6 < c12391.m28550()) {
                            int i7 = this.f15151;
                            if (c12391.m28541(i7) == c12391.m28541(i5) && c12391.m28561(i7) == c12391.m28561(i5) && c12391.m28522(i7) == c12391.m28522(i5) && c12391.m28535(i7) == c12391.m28535(i5) && c12391.m28531(i7) == c12391.m28531(i5) && c12391.m28524(i7) == c12391.m28524(i5) && c12391.m28526(i7) == c12391.m28526(i5) && c12391.m28534(i7) == c12391.m28534(i5) && c12391.m28533(i7) == c12391.m28533(i5) && c12391.m28523(i7) == c12391.m28523(i5)) {
                                AbstractC21639 abstractC21639 = c5370.f12731.f77067[c12391.m28541(i7)];
                                if (((!(abstractC21639 instanceof C23650) && !(abstractC21639 instanceof C12251)) || (c12391.m28549(i7) == c12391.m28549(i5) && c12391.m28538(i7) == c12391.m28538(i5))) && ((!(abstractC21639 instanceof C12251) || (c12391.m28540(i7) == c12391.m28540(i5) && c12391.m28528(i7) == c12391.m28528(i5) && c12391.m28516(i7) == c12391.m28516(i5) && c12391.m28556(i7) == c12391.m28556(i5))) && (z2 || (c12391.m28555(i7) == c12391.m28555(i5) && c12391.m28557(i7) == c12391.m28557(i5) && c12391.m28539(i7) == c12391.m28539(i5) && c12391.m28552(i7) == c12391.m28552(i5) && c12391.m28559(i7) == c12391.m28559(i5) && c12391.m28562(i7) == c12391.m28562(i5) && c12391.m28530(i7) == c12391.m28530(i5))))) {
                                    C21307 c21307M28545 = c12391.m28545(this.f15151);
                                    int iM28532 = c12391.m28532(this.f15151);
                                    if (c21307M28545 != null) {
                                        try {
                                            if (iM28532 > c12391.m28564(this.f15133)) {
                                                this.f15137 = -1;
                                                return true;
                                            }
                                        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
                                            this.f15137 = -1;
                                            return true;
                                        }
                                    }
                                    this.f15127.f65356[this.f15137] = c21307M28545 == null ? null : c21307M28545.m48210(c16611);
                                    this.f15127.f65357[this.f15137] = c21307M28545 == null ? -1 : C5370.m11673(c16611, iM28532);
                                    if (c21307M28545 != null && this.f15127.f65357[this.f15137] < 0) {
                                        this.f15137 = -1;
                                        return true;
                                    }
                                    int iM28542 = c12391.m28542(this.f15151);
                                    this.f15151 = iM28542;
                                    int i8 = this.f15137 - 1;
                                    this.f15137 = i8;
                                    if (i8 < 0 && iM28542 == -1) {
                                        C13732 c13732 = c5370.f12675;
                                        C20794 c20794 = this.f15127;
                                        c13732.m31275(c20794.f65355, c20123.f62293, c20123.f62296, this.f15139, c20794, 0);
                                        return true;
                                    }
                                }
                            }
                        }
                        this.f15137 = -1;
                        return true;
                    }
                    int i9 = this.f15162;
                    int i10 = this.f15126;
                    if (i9 > i10 || !c5370.f12675.m31281()) {
                        this.f15162 = -1;
                    } else {
                        int i11 = this.f15162;
                        this.f15162 = i11 + 1;
                        if (c12391.m28544(i11) && c12391.m28546(i11) == i && c12391.m28536(i11) == c12391.m28536(i10) && c12391.m28519(i11) <= c12391.m28519(i10) && (iM11673 = C5370.m11673(c16611, c12391.m28564(i11))) >= 0 && iM11673 <= c20123.f62266) {
                            try {
                                this.f15139 = c12391.m28554(i11).m48210(c16611);
                                if (this.f15127 == null) {
                                    C20794 c20795 = new C20794(c5370);
                                    this.f15127 = c20795;
                                    c20795.f65353 = i;
                                    c20795.f65356 = new C21307[i];
                                    c20795.f65357 = new int[i];
                                }
                                C20794 c20796 = this.f15127;
                                c20796.f65355 = iM11673;
                                c20796.f65352 = c12391.m28519(i11);
                                this.f15133 = i11;
                                this.f15137 = i2;
                                this.f15151 = c12391.m28558(i11);
                            } catch (IllegalArgumentException | IndexOutOfBoundsException unused2) {
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m13572(C20123 c20123) {
        if (this.f15147) {
            return;
        }
        C5370 c5370 = this.f15168;
        c5370.f12675.m31269(c20123.f62293, c20123.f62264, c20123.f62296);
        this.f15144 = 0;
        this.f15153 = 0;
        this.f15155 = 0;
        this.f15135 = c5370.f12675.m31278();
        c20123.f62298 = c5370.f12675.m31280();
        c20123.f62269 = this.f15135;
        this.f15147 = true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m13605() {
        if (this.f15147 && this.f15135 >= 0 && !m13573()) {
            C5370 c5370 = this.f15168;
            if (!c5370.f12675.m31283()) {
                c5370.f12675.m31273(true);
                this.f15125 = 0;
                this.f15144 = 0;
                this.f15143 = 0;
                this.f15153 = 0;
                this.f15155 = 0;
                this.f15135 = -1L;
                this.f15147 = false;
                return;
            }
        }
        throw new C10064(EnumC2687.INVALID_RESULT);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m13613() {
        if (this.f15147 && this.f15135 >= 0 && !m13573()) {
            C5370 c5370 = this.f15168;
            if (!c5370.f12675.m31283()) {
                c5370.f12675.m31270(this.f15135);
                this.f15125 = 0;
                this.f15144 = 0;
                this.f15143 = 0;
                this.f15153 = 0;
                this.f15155 = 0;
                this.f15135 = -1L;
                this.f15147 = false;
                return;
            }
        }
        throw new C10064(EnumC2687.INVALID_RESULT);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13579(int i, C18110 c18110) {
        this.f15149 = i;
        this.f15156 = c18110;
        this.f15125 = 0;
        this.f15144 = 0;
        this.f15143 = 0;
        this.f15153 = 0;
        this.f15155 = 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m13597() {
        if (m13573()) {
            m13564();
            return true;
        }
        if (this.f15149 < 0) {
            return false;
        }
        int i = this.f15159;
        C12391 c12391 = this.f15154;
        if (i >= c12391.m28553()) {
            return false;
        }
        int i2 = this.f15159;
        this.f15159 = i2 + 1;
        if (c12391.m28564(i2) >= this.f15149 && c12391.m28551(i2) >= this.f15149 && (this.f15152 < 0 || c12391.m28551(i2) <= this.f15152)) {
            m13568(i2, 2);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if ((r9 - r7.f15131) == r7.f15123) goto L98;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m13568(int i, int i2) {
        int iM13570;
        C21307 c21307M48210;
        int i3;
        int i4;
        int i5;
        int iMax;
        C21307[] c21307Arr;
        if (!m13573()) {
            C5370 c5370 = this.f15168;
            if (!c5370.f12675.m31283()) {
                if (i >= 0) {
                    C12391 c12391 = this.f15154;
                    if (i >= c12391.m28553()) {
                        return;
                    }
                    if (!c12391.m28537() || this.f15152 >= 0) {
                        this.f15148 = i2;
                        this.f15158 = i2 == 2;
                        this.f15129 = i;
                        this.f15131 = c12391.m28536(i);
                        this.f15123 = c12391.m28519(i);
                        if (c5370.f12731.m53664() && this.f15158) {
                            C18110 c18110 = this.f15156;
                            if (c18110 != null && c18110.m41294() && this.f15156.m41296()) {
                                int iM41293 = this.f15156.m41293(this.f15131);
                                this.f15131 = iM41293;
                                if (iM41293 >= 0) {
                                    int iM41294 = this.f15156.m41293(c12391.m28536(i) + this.f15123);
                                    if (iM41294 >= 0) {
                                    }
                                }
                            }
                            this.f15136 = null;
                            return;
                        }
                        try {
                            this.f15164 = m13570(c12391.m28564(i));
                            this.f15150 = m13570(c12391.m28551(i));
                            boolean z = this.f15158;
                            C16611 c16611 = this.f15167;
                            if (z) {
                                iM13570 = c16611.m37659(c12391.m28547(i), EnumC3200.BEFORE);
                            } else {
                                iM13570 = m13570(c12391.m28547(i));
                            }
                            this.f15124 = iM13570;
                            if (this.f15158) {
                                c21307M48210 = c12391.m28554(i).m48205(c16611, c12391.m28551(i));
                            } else {
                                c21307M48210 = c12391.m28554(i).m48210(c16611);
                            }
                            this.f15136 = c21307M48210;
                            int i6 = this.f15164;
                            if (i6 < 0 || i6 >= c5370.f12725 || (i3 = this.f15150) < 0 || i3 > (i4 = this.f15164) || (i5 = this.f15124) < 0 || i5 > i4) {
                                this.f15136 = null;
                                return;
                            }
                            int iM28546 = c12391.m28546(this.f15129);
                            this.f15160 = iM28546;
                            if (iM28546 <= 0 || iM28546 > c12391.m28550() || this.f15160 > 262144 / c12391.m28563()) {
                                this.f15136 = null;
                                return;
                            }
                            int[] iArr = this.f15130;
                            if (iArr == null || iArr.length < this.f15160) {
                                if (iArr == null) {
                                    iMax = Math.max(16, this.f15160);
                                } else {
                                    iMax = Math.max(this.f15160, iArr.length << 1);
                                }
                                int[] iArr2 = this.f15130;
                                this.f15130 = iArr2 == null ? new int[iMax] : Arrays.copyOf(iArr2, iMax);
                                if (c5370.f12731.m53667()) {
                                    int[] iArr3 = this.f15165;
                                    this.f15165 = iArr3 == null ? new int[iMax] : Arrays.copyOf(iArr3, iMax);
                                    C21307[] c21307Arr2 = this.f15161;
                                    if (c21307Arr2 == null) {
                                        c21307Arr = new C21307[iMax];
                                    } else {
                                        c21307Arr = (C21307[]) Arrays.copyOf(c21307Arr2, iMax);
                                    }
                                    this.f15161 = c21307Arr;
                                }
                            }
                            this.f15143 = 0;
                            this.f15155 = 0;
                            this.f15134 = this.f15160 - 1;
                            this.f15163 = c12391.m28558(this.f15129);
                            this.f15157 = 1;
                            return;
                        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
                            this.f15136 = null;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        throw new C10064(EnumC2687.INVALID_RESULT);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:137:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x022a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x022e  */
    /* JADX WARN: Code duplicated, block: B:150:0x023a  */
    /* JADX WARN: Code duplicated, block: B:151:0x023f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0247  */
    /* JADX WARN: Code duplicated, block: B:156:0x024f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0262  */
    /* JADX WARN: Code duplicated, block: B:166:0x0265  */
    /* JADX WARN: Code duplicated, block: B:167:0x0267  */
    /* JADX WARN: Code duplicated, block: B:169:0x026a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0272  */
    /* JADX WARN: Code duplicated, block: B:173:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x028f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0293  */
    /* JADX WARN: Code duplicated, block: B:185:0x029b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:204:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:217:0x0308  */
    /* JADX WARN: Code duplicated, block: B:218:0x030a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x0335 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:232:0x0337  */
    /* JADX WARN: Code duplicated, block: B:234:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x0355 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x0421, IllegalArgumentException | IndexOutOfBoundsException -> 0x0421, TRY_ENTER, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x0421, blocks: (B:236:0x0345, B:239:0x0355, B:239:0x0355, B:241:0x0364, B:241:0x0364, B:240:0x0360, B:240:0x0360), top: B:340:0x0345 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x0360 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x0421, IllegalArgumentException | IndexOutOfBoundsException -> 0x0421, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x0421, blocks: (B:236:0x0345, B:239:0x0355, B:239:0x0355, B:241:0x0364, B:241:0x0364, B:240:0x0360, B:240:0x0360), top: B:340:0x0345 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x0367  */
    /* JADX WARN: Code duplicated, block: B:246:0x036d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:247:0x036f  */
    /* JADX WARN: Code duplicated, block: B:252:0x037a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x037c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:254:0x037e  */
    /* JADX WARN: Code duplicated, block: B:257:0x0386  */
    /* JADX WARN: Code duplicated, block: B:259:0x0389  */
    /* JADX WARN: Code duplicated, block: B:266:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:268:0x03af  */
    /* JADX WARN: Code duplicated, block: B:269:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:272:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:275:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:277:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:278:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:281:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:283:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:296:0x0406  */
    /* JADX WARN: Code duplicated, block: B:298:0x0414  */
    /* JADX WARN: Code duplicated, block: B:299:0x0419  */
    /* JADX WARN: Code duplicated, block: B:301:0x041f  */
    /* JADX INFO: renamed from: ۜ */
    private void m13564() {
        boolean z;
        int iM28522;
        C12251 c12251;
        BitSet bitSet;
        C10239 c10239;
        boolean z2;
        int iM28528;
        int iM28529;
        int iM285210;
        int iM285211;
        C21307 c21307M28545;
        int iM28532;
        boolean z3;
        C16611 c16611;
        C21307 c21307M48210;
        int iM28536;
        int iM28533;
        int iM28523;
        int iM13574;
        int iM28524;
        boolean z4;
        boolean z5;
        int i = this.f15157;
        boolean z6 = false;
        C5370 c5370 = this.f15168;
        C12391 c12391 = this.f15154;
        if (i == 1) {
            if (this.f15134 < 0) {
                if (this.f15163 != -1) {
                    m13566();
                    return;
                }
                if (this.f15148 == 1) {
                    if (this.f15146 == null) {
                        throw new C10064(EnumC2687.INVALID_RESULT);
                    }
                    int iM28561 = c12391.m28561(m13574(0));
                    if (iM28561 < this.f15146.f62280 && c12391.m28564(this.f15129) <= this.f15146.f62280) {
                        z6 = !this.f15147;
                    } else if (iM28561 == this.f15146.f62280 && !c5370.f12731.m53664()) {
                        m13572(this.f15146);
                        z6 = true;
                    }
                    if (!z6) {
                        m13566();
                        return;
                    }
                }
                int[] iArr = this.f15165;
                if (iArr != null) {
                    Arrays.fill(iArr, this.f15143, this.f15160, -1);
                    Arrays.fill(this.f15161, this.f15143, this.f15160, (Object) null);
                }
                int iMin = Math.min(this.f15143, this.f15160 - 1);
                this.f15140 = iMin;
                this.f15138 = iMin != 0 ? m13574(iMin - 1) : -1;
                this.f15157 = 2;
                return;
            }
            int i2 = this.f15163;
            if (i2 < 0 || i2 >= c12391.m28550()) {
                m13566();
                return;
            }
            int i3 = this.f15134;
            if (i3 < this.f15144 && this.f15163 == this.f15166[i3]) {
                this.f15155 = i3 + 1;
            }
            if (i3 < this.f15125 && this.f15163 == this.f15142[i3]) {
                int i4 = i3 + 1;
                this.f15143 = i4;
                this.f15155 = Math.max(this.f15155, Math.min(i4, this.f15153));
                this.f15134 = -1;
                this.f15163 = -1;
                return;
            }
            int[] iArr2 = this.f15130;
            this.f15134 = i3 - 1;
            int i5 = this.f15163;
            iArr2[i3] = i5;
            int iM28542 = c12391.m28542(i5);
            if (iM28542 < -1 || iM28542 >= this.f15163) {
                m13566();
                return;
            } else {
                this.f15163 = iM28542;
                return;
            }
        }
        if (i != 2) {
            if (i == 3) {
                if (!c5370.f12675.m31283()) {
                    throw new C10064(EnumC2687.INVALID_RESULT);
                }
                c5370.f12675.m31272(this);
                if (c5370.f12675.m31283()) {
                    return;
                }
                m13559(c5370.f12675.m31282());
                return;
            }
            if (i == 4) {
                int i6 = this.f15141;
                if (i6 < this.f15160) {
                    this.f15142[i6] = this.f15130[i6];
                    this.f15141 = i6 + 1;
                    return;
                } else {
                    m13567();
                    return;
                }
            }
            if (i != 5) {
                throw new C10064(EnumC2687.INVALID_RESULT);
            }
            int i7 = this.f15141;
            int i8 = this.f15160;
            if (i7 < i8) {
                this.f15166[i7] = this.f15142[i7];
                this.f15141 = i7 + 1;
                return;
            } else {
                this.f15144 = i8;
                this.f15153 = i8;
                m13566();
                return;
            }
        }
        int i9 = this.f15140;
        if (i9 == this.f15160) {
            if (c5370.f12675.m31275(this.f15164, this.f15150, this.f15124, this.f15136, this, this.f15155)) {
                this.f15157 = 3;
                return;
            } else {
                m13559(false);
                return;
            }
        }
        int iM13575 = m13574(i9);
        int iM28541 = c12391.m28541(iM13575);
        int iM28531 = c12391.m28531(iM13575);
        int iM28535 = c12391.m28535(iM13575);
        if (iM28541 < 0 || iM28541 >= c5370.f12731.f77067.length || c12391.m28542(iM13575) != this.f15138) {
            m13566();
            return;
        }
        AbstractC21639 abstractC21639 = c5370.f12731.f77067[iM28541];
        if (i9 != 0) {
            int iM13576 = m13574(i9 - 1);
            AbstractC21639 abstractC216310 = c5370.f12731.f77067[c12391.m28541(iM13576)];
            if (C5370.m11675(abstractC216310, iM28531) != iM28541 || C5370.m11676(abstractC216310, c12391.m28535(iM13576), iM28531) != iM28535 || !C5370.m11683(c12391, iM13576, iM28531)) {
                m13566();
                return;
            }
        } else if (iM28541 != 0 || iM28531 != -1 || iM28535 != 0) {
            m13566();
            return;
        }
        boolean z7 = i9 == this.f15160 - 1;
        int iM28564 = c12391.m28564(this.f15129);
        if (m13560(c12391.m28561(iM13575), iM28564) && !(abstractC21639 instanceof C14262) && !(abstractC21639 instanceof C5545)) {
            if (!c5370.f12731.m53664()) {
                iM28522 = c12391.m28522(iM13575);
                if (abstractC21639 instanceof C7557) {
                    C7557 c7557 = (C7557) abstractC21639;
                    if (!z7) {
                    }
                } else if (abstractC21639 instanceof C23650) {
                    C23650 c23650 = (C23650) abstractC21639;
                    int iM28539 = c12391.m28539(iM13575);
                    if (!z7) {
                    }
                } else if (abstractC21639 instanceof C14932) {
                    if (!z7) {
                    }
                } else {
                    c12251 = (C12251) abstractC21639;
                    bitSet = c12251.f34252;
                    c10239 = c12251.f34250;
                    z2 = c12251.f34253;
                    if (bitSet.isEmpty()) {
                        if (iM28522 == 15) {
                            if (z7) {
                            }
                        } else if (z2) {
                            c21307M28545 = c12391.m28545(iM13575);
                            iM28532 = c12391.m28532(iM13575);
                            if (c21307M28545 != null) {
                                this.f15165[i9] = m13570(iM28532);
                                C21307[] c21307Arr = this.f15161;
                                z3 = this.f15158;
                                c16611 = this.f15167;
                                if (z3) {
                                    c21307M48210 = c21307M28545.m48205(c16611, c12391.m28551(this.f15129));
                                } else {
                                    c21307M48210 = c21307M28545.m48210(c16611);
                                }
                                c21307Arr[i9] = c21307M48210;
                                if (c10239 != null) {
                                    if (!z7) {
                                        if (iM28522 != 2) {
                                            if (iM28522 == 13) {
                                                if (c10239 != null) {
                                                }
                                            } else if (iM28522 == 7) {
                                                if (!z2) {
                                                    iM28528 = c12391.m28528(iM13575);
                                                    if (c5370.f12731.m53664()) {
                                                        iM28529 = c12391.m28526(iM13575);
                                                    } else {
                                                        iM28529 = c12391.m28529();
                                                    }
                                                    if (iM28528 == iM28529) {
                                                    }
                                                }
                                            }
                                        }
                                    } else if (iM28522 == 12) {
                                        if (c12391.m28557(iM13575) == iM28564) {
                                        }
                                    } else if (iM28522 == 5) {
                                        if (!z2) {
                                            iM285210 = c12391.m28528(iM13575);
                                            if (c5370.f12731.m53664()) {
                                                iM285211 = c12391.m28526(iM13575);
                                            } else {
                                                iM285211 = c12391.m28529();
                                            }
                                            if (iM285210 == iM285211) {
                                            }
                                        }
                                    }
                                } else if (!z7) {
                                    if (iM28522 != 2) {
                                        if (iM28522 == 13) {
                                            if (c10239 != null) {
                                            }
                                        } else if (iM28522 == 7) {
                                            if (!z2) {
                                                iM28528 = c12391.m28528(iM13575);
                                                if (c5370.f12731.m53664()) {
                                                    iM28529 = c12391.m28526(iM13575);
                                                } else {
                                                    iM28529 = c12391.m28529();
                                                }
                                                if (iM28528 == iM28529) {
                                                }
                                            }
                                        }
                                    }
                                } else if (iM28522 == 12) {
                                    if (c12391.m28557(iM13575) == iM28564) {
                                    }
                                } else if (iM28522 == 5) {
                                    if (!z2) {
                                        iM285210 = c12391.m28528(iM13575);
                                        if (c5370.f12731.m53664()) {
                                            iM285211 = c12391.m28526(iM13575);
                                        } else {
                                            iM285211 = c12391.m28529();
                                        }
                                        if (iM285210 == iM285211) {
                                        }
                                    }
                                }
                            }
                        } else if (!c12251.f34245) {
                            if (c10239 != null) {
                                if (!z7) {
                                    if (iM28522 != 2) {
                                        if (iM28522 == 13) {
                                            if (c10239 != null) {
                                            }
                                        } else if (iM28522 == 7) {
                                            if (!z2) {
                                                iM28528 = c12391.m28528(iM13575);
                                                if (c5370.f12731.m53664()) {
                                                    iM28529 = c12391.m28526(iM13575);
                                                } else {
                                                    iM28529 = c12391.m28529();
                                                }
                                                if (iM28528 == iM28529) {
                                                }
                                            }
                                        }
                                    }
                                } else if (iM28522 == 12) {
                                    if (c12391.m28557(iM13575) == iM28564) {
                                    }
                                } else if (iM28522 == 5) {
                                    if (!z2) {
                                        iM285210 = c12391.m28528(iM13575);
                                        if (c5370.f12731.m53664()) {
                                            iM285211 = c12391.m28526(iM13575);
                                        } else {
                                            iM285211 = c12391.m28529();
                                        }
                                        if (iM285210 == iM285211) {
                                        }
                                    }
                                }
                            } else if (!z7) {
                                if (iM28522 != 2) {
                                    if (iM28522 == 13) {
                                        if (c10239 != null) {
                                        }
                                    } else if (iM28522 == 7) {
                                        if (!z2) {
                                            iM28528 = c12391.m28528(iM13575);
                                            if (c5370.f12731.m53664()) {
                                                iM28529 = c12391.m28526(iM13575);
                                            } else {
                                                iM28529 = c12391.m28529();
                                            }
                                            if (iM28528 == iM28529) {
                                            }
                                        }
                                    }
                                }
                            } else if (iM28522 == 12) {
                                if (c12391.m28557(iM13575) == iM28564) {
                                }
                            } else if (iM28522 == 5) {
                                if (!z2) {
                                    iM285210 = c12391.m28528(iM13575);
                                    if (c5370.f12731.m53664()) {
                                        iM285211 = c12391.m28526(iM13575);
                                    } else {
                                        iM285211 = c12391.m28529();
                                    }
                                    if (iM285210 == iM285211) {
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int iM28525 = c12391.m28524(iM13575);
                int iM28526 = c12391.m28526(iM13575);
                if (iM28525 >= 0 && iM28526 >= iM28525 && iM28526 <= c12391.m28529()) {
                    if (i9 == 0) {
                        if (iM28525 == 0 && iM28526 == c12391.m28529()) {
                            int iM28519 = c12391.m28519(this.f15129);
                            iM28536 = c12391.m28536(this.f15129);
                            int iM28534 = c12391.m28534(iM13575);
                            iM28533 = c12391.m28533(iM13575);
                            iM28523 = c12391.m28523(iM13575);
                            if (iM28536 >= 1 && iM28519 >= 0 && iM28534 >= 0 && iM28534 <= iM28519 && iM28533 >= -1 && iM28533 < iM28519 && iM28523 >= -1 && iM28523 < iM28519) {
                                if (i9 != 0) {
                                    iM13574 = m13574(i9 - 1);
                                    if (!C5370.m11663(c12391, iM13574)) {
                                        iM28524 = c12391.m28533(iM13574);
                                    } else {
                                        iM28524 = c12391.m28523(iM13574);
                                    }
                                    if (iM28533 == iM28524) {
                                        int iM28527 = c12391.m28522(iM13575);
                                        if (abstractC21639 instanceof C12251) {
                                            z4 = false;
                                        } else {
                                            z4 = false;
                                        }
                                        if (iM28523 >= 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z4 == z5) {
                                            iM28522 = c12391.m28522(iM13575);
                                            if (abstractC21639 instanceof C7557) {
                                                C7557 c7558 = (C7557) abstractC21639;
                                                if (!z7) {
                                                }
                                            } else if (abstractC21639 instanceof C23650) {
                                                C23650 c23651 = (C23650) abstractC21639;
                                                int iM285310 = c12391.m28539(iM13575);
                                                if (!z7) {
                                                }
                                            } else if (abstractC21639 instanceof C14932) {
                                                c12251 = (C12251) abstractC21639;
                                                bitSet = c12251.f34252;
                                                c10239 = c12251.f34250;
                                                z2 = c12251.f34253;
                                                if (bitSet.isEmpty()) {
                                                    if (iM28522 == 15) {
                                                        if (z7) {
                                                        }
                                                    } else if (z2) {
                                                        c21307M28545 = c12391.m28545(iM13575);
                                                        iM28532 = c12391.m28532(iM13575);
                                                        if (c21307M28545 != null) {
                                                            this.f15165[i9] = m13570(iM28532);
                                                            C21307[] c21307Arr2 = this.f15161;
                                                            z3 = this.f15158;
                                                            c16611 = this.f15167;
                                                            if (z3) {
                                                                c21307M48210 = c21307M28545.m48205(c16611, c12391.m28551(this.f15129));
                                                            } else {
                                                                c21307M48210 = c21307M28545.m48210(c16611);
                                                            }
                                                            c21307Arr2[i9] = c21307M48210;
                                                            if (c10239 != null) {
                                                                if (!z7) {
                                                                    if (iM28522 != 2) {
                                                                        if (iM28522 == 13) {
                                                                            if (c10239 != null) {
                                                                            }
                                                                        } else if (iM28522 == 7) {
                                                                            if (!z2) {
                                                                                iM28528 = c12391.m28528(iM13575);
                                                                                if (c5370.f12731.m53664()) {
                                                                                    iM28529 = c12391.m28526(iM13575);
                                                                                } else {
                                                                                    iM28529 = c12391.m28529();
                                                                                }
                                                                                if (iM28528 == iM28529) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (iM28522 == 12) {
                                                                    if (c12391.m28557(iM13575) == iM28564) {
                                                                    }
                                                                } else if (iM28522 == 5) {
                                                                    if (!z2) {
                                                                        iM285210 = c12391.m28528(iM13575);
                                                                        if (c5370.f12731.m53664()) {
                                                                            iM285211 = c12391.m28526(iM13575);
                                                                        } else {
                                                                            iM285211 = c12391.m28529();
                                                                        }
                                                                        if (iM285210 == iM285211) {
                                                                        }
                                                                    }
                                                                }
                                                            } else if (!z7) {
                                                                if (iM28522 != 2) {
                                                                    if (iM28522 == 13) {
                                                                        if (c10239 != null) {
                                                                        }
                                                                    } else if (iM28522 == 7) {
                                                                        if (!z2) {
                                                                            iM28528 = c12391.m28528(iM13575);
                                                                            if (c5370.f12731.m53664()) {
                                                                                iM28529 = c12391.m28526(iM13575);
                                                                            } else {
                                                                                iM28529 = c12391.m28529();
                                                                            }
                                                                            if (iM28528 == iM28529) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (iM28522 == 12) {
                                                                if (c12391.m28557(iM13575) == iM28564) {
                                                                }
                                                            } else if (iM28522 == 5) {
                                                                if (!z2) {
                                                                    iM285210 = c12391.m28528(iM13575);
                                                                    if (c5370.f12731.m53664()) {
                                                                        iM285211 = c12391.m28526(iM13575);
                                                                    } else {
                                                                        iM285211 = c12391.m28529();
                                                                    }
                                                                    if (iM285210 == iM285211) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (!c12251.f34245) {
                                                        if (c10239 != null) {
                                                            if (!z7) {
                                                                if (iM28522 != 2) {
                                                                    if (iM28522 == 13) {
                                                                        if (c10239 != null) {
                                                                        }
                                                                    } else if (iM28522 == 7) {
                                                                        if (!z2) {
                                                                            iM28528 = c12391.m28528(iM13575);
                                                                            if (c5370.f12731.m53664()) {
                                                                                iM28529 = c12391.m28526(iM13575);
                                                                            } else {
                                                                                iM28529 = c12391.m28529();
                                                                            }
                                                                            if (iM28528 == iM28529) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (iM28522 == 12) {
                                                                if (c12391.m28557(iM13575) == iM28564) {
                                                                }
                                                            } else if (iM28522 == 5) {
                                                                if (!z2) {
                                                                    iM285210 = c12391.m28528(iM13575);
                                                                    if (c5370.f12731.m53664()) {
                                                                        iM285211 = c12391.m28526(iM13575);
                                                                    } else {
                                                                        iM285211 = c12391.m28529();
                                                                    }
                                                                    if (iM285210 == iM285211) {
                                                                    }
                                                                }
                                                            }
                                                        } else if (!z7) {
                                                            if (iM28522 != 2) {
                                                                if (iM28522 == 13) {
                                                                    if (c10239 != null) {
                                                                    }
                                                                } else if (iM28522 == 7) {
                                                                    if (!z2) {
                                                                        iM28528 = c12391.m28528(iM13575);
                                                                        if (c5370.f12731.m53664()) {
                                                                            iM28529 = c12391.m28526(iM13575);
                                                                        } else {
                                                                            iM28529 = c12391.m28529();
                                                                        }
                                                                        if (iM28528 == iM28529) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (iM28522 == 12) {
                                                            if (c12391.m28557(iM13575) == iM28564) {
                                                            }
                                                        } else if (iM28522 == 5) {
                                                            if (!z2) {
                                                                iM285210 = c12391.m28528(iM13575);
                                                                if (c5370.f12731.m53664()) {
                                                                    iM285211 = c12391.m28526(iM13575);
                                                                } else {
                                                                    iM285211 = c12391.m28529();
                                                                }
                                                                if (iM285210 == iM285211) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (!z7) {
                                            }
                                        }
                                    }
                                } else if (iM28533 == -1) {
                                    int iM285212 = c12391.m28522(iM13575);
                                    if ((abstractC21639 instanceof C12251) || ((C12251) abstractC21639).f34250 == null || !(iM285212 == 12 || iM285212 == 13 || iM285212 == 15)) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iM28523 >= 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4 == z5) {
                                        iM28522 = c12391.m28522(iM13575);
                                        if (abstractC21639 instanceof C7557) {
                                            C7557 c7559 = (C7557) abstractC21639;
                                            if (!z7 || iM28522 != 1 || c12391.m28539(iM13575) < 0 || c12391.m28539(iM13575) > c7559.f19830.length || c12391.m28559(iM13575) < -1) {
                                            }
                                        } else if (abstractC21639 instanceof C23650) {
                                            C23650 c23652 = (C23650) abstractC21639;
                                            int iM285311 = c12391.m28539(iM13575);
                                            if (!z7 || iM28522 != 1 || iM285311 <= 0 || iM285311 > c23652.f75271.length || !m13560(c12391.m28549(iM13575), iM28564) || c12391.m28538(iM13575) < c12391.m28549(iM13575) || !m13560(c12391.m28538(iM13575), iM28564)) {
                                            }
                                        } else if (abstractC21639 instanceof C14932) {
                                            c12251 = (C12251) abstractC21639;
                                            bitSet = c12251.f34252;
                                            c10239 = c12251.f34250;
                                            z2 = c12251.f34253;
                                            if (bitSet.isEmpty() && (iM28522 == 2 || (m13560(c12391.m28549(iM13575), iM28564) && (c12251.f34246 == null || (c12391.m28538(iM13575) >= c12391.m28549(iM13575) && m13560(c12391.m28538(iM13575), iM28564)))))) {
                                                if (iM28522 == 15) {
                                                    if (z7 || c10239 == null || z2 || (c12391.m28525(iM13575) & 24) != 24 || c12391.m28555(iM13575) != iM28564 || c12391.m28557(iM13575) != iM28564 || !m13560(c12391.m28540(iM13575), iM28564) || !m13561(c12251, iM13575, iM28564)) {
                                                    }
                                                } else if (z2) {
                                                    c21307M28545 = c12391.m28545(iM13575);
                                                    iM28532 = c12391.m28532(iM13575);
                                                    if (c21307M28545 != null && iM28532 <= iM28564) {
                                                        try {
                                                            this.f15165[i9] = m13570(iM28532);
                                                            C21307[] c21307Arr3 = this.f15161;
                                                            z3 = this.f15158;
                                                            c16611 = this.f15167;
                                                            if (z3) {
                                                                c21307M48210 = c21307M28545.m48205(c16611, c12391.m28551(this.f15129));
                                                            } else {
                                                                c21307M48210 = c21307M28545.m48210(c16611);
                                                            }
                                                            c21307Arr3[i9] = c21307M48210;
                                                            if (c10239 != null || iM28522 == 2 || m13561(c12251, iM13575, iM28564)) {
                                                                if (!z7) {
                                                                    if (iM28522 != 2) {
                                                                        if (iM28522 == 13) {
                                                                            if (c10239 != null || c12391.m28557(iM13575) > iM28564) {
                                                                            }
                                                                        } else if (iM28522 == 7 && c12391.m28552(iM13575) >= 0 && c12391.m28552(iM13575) < c12251.f34249.f19830.length && m13560(c12391.m28540(iM13575), iM28564) && c12391.m28540(iM13575) <= c12391.m28555(iM13575) && m13560(c12391.m28555(iM13575), iM28564) && c12391.m28555(iM13575) <= iM28564) {
                                                                            if (!z2) {
                                                                                iM28528 = c12391.m28528(iM13575);
                                                                                if (c5370.f12731.m53664()) {
                                                                                    iM28529 = c12391.m28526(iM13575);
                                                                                } else {
                                                                                    iM28529 = c12391.m28529();
                                                                                }
                                                                                if (iM28528 == iM28529) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (iM28522 == 12) {
                                                                    z = c12391.m28557(iM13575) == iM28564;
                                                                } else if (iM28522 == 5 && c12391.m28555(iM13575) == iM28564 && m13560(c12391.m28540(iM13575), iM28564) && c12391.m28540(iM13575) <= iM28564) {
                                                                    if (!z2) {
                                                                        iM285210 = c12391.m28528(iM13575);
                                                                        if (c5370.f12731.m53664()) {
                                                                            iM285211 = c12391.m28526(iM13575);
                                                                        } else {
                                                                            iM285211 = c12391.m28529();
                                                                        }
                                                                        if (iM285210 == iM285211) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
                                                        }
                                                    }
                                                } else if (!c12251.f34245) {
                                                    if (c10239 != null) {
                                                        if (!z7) {
                                                            if (iM28522 != 2) {
                                                                if (iM28522 == 13) {
                                                                    if (c10239 != null) {
                                                                    }
                                                                } else if (iM28522 == 7) {
                                                                    if (!z2) {
                                                                        iM28528 = c12391.m28528(iM13575);
                                                                        if (c5370.f12731.m53664()) {
                                                                            iM28529 = c12391.m28526(iM13575);
                                                                        } else {
                                                                            iM28529 = c12391.m28529();
                                                                        }
                                                                        if (iM28528 == iM28529) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (iM28522 == 12) {
                                                            if (c12391.m28557(iM13575) == iM28564) {
                                                            }
                                                        } else if (iM28522 == 5) {
                                                            if (!z2) {
                                                                iM285210 = c12391.m28528(iM13575);
                                                                if (c5370.f12731.m53664()) {
                                                                    iM285211 = c12391.m28526(iM13575);
                                                                } else {
                                                                    iM285211 = c12391.m28529();
                                                                }
                                                                if (iM285210 == iM285211) {
                                                                }
                                                            }
                                                        }
                                                    } else if (!z7) {
                                                        if (iM28522 != 2) {
                                                            if (iM28522 == 13) {
                                                                if (c10239 != null) {
                                                                }
                                                            } else if (iM28522 == 7) {
                                                                if (!z2) {
                                                                    iM28528 = c12391.m28528(iM13575);
                                                                    if (c5370.f12731.m53664()) {
                                                                        iM28529 = c12391.m28526(iM13575);
                                                                    } else {
                                                                        iM28529 = c12391.m28529();
                                                                    }
                                                                    if (iM28528 == iM28529) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (iM28522 == 12) {
                                                        if (c12391.m28557(iM13575) == iM28564) {
                                                        }
                                                    } else if (iM28522 == 5) {
                                                        if (!z2) {
                                                            iM285210 = c12391.m28528(iM13575);
                                                            if (c5370.f12731.m53664()) {
                                                                iM285211 = c12391.m28526(iM13575);
                                                            } else {
                                                                iM285211 = c12391.m28529();
                                                            }
                                                            if (iM285210 == iM285211) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (!z7 || iM28522 != 1) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int iM13577 = m13574(i9 - 1);
                        if (!C5370.m11663(c12391, iM13577)) {
                            if (iM28525 == c12391.m28524(iM13577) && iM28526 == c12391.m28526(iM13577)) {
                                int iM285110 = c12391.m28519(this.f15129);
                                iM28536 = c12391.m28536(this.f15129);
                                int iM28537 = c12391.m28534(iM13575);
                                iM28533 = c12391.m28533(iM13575);
                                iM28523 = c12391.m28523(iM13575);
                                if (iM28536 >= 1) {
                                    if (i9 != 0) {
                                        iM13574 = m13574(i9 - 1);
                                        if (!C5370.m11663(c12391, iM13574)) {
                                            iM28524 = c12391.m28533(iM13574);
                                        } else {
                                            iM28524 = c12391.m28523(iM13574);
                                        }
                                        if (iM28533 == iM28524) {
                                            int iM285213 = c12391.m28522(iM13575);
                                            if (abstractC21639 instanceof C12251) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                            }
                                            if (iM28523 >= 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z4 == z5) {
                                                iM28522 = c12391.m28522(iM13575);
                                                if (abstractC21639 instanceof C7557) {
                                                    C7557 c75510 = (C7557) abstractC21639;
                                                    if (!z7) {
                                                    }
                                                } else if (abstractC21639 instanceof C23650) {
                                                    C23650 c23653 = (C23650) abstractC21639;
                                                    int iM285312 = c12391.m28539(iM13575);
                                                    if (!z7) {
                                                    }
                                                } else if (abstractC21639 instanceof C14932) {
                                                    c12251 = (C12251) abstractC21639;
                                                    bitSet = c12251.f34252;
                                                    c10239 = c12251.f34250;
                                                    z2 = c12251.f34253;
                                                    if (bitSet.isEmpty()) {
                                                        if (iM28522 == 15) {
                                                            if (z7) {
                                                            }
                                                        } else if (z2) {
                                                            c21307M28545 = c12391.m28545(iM13575);
                                                            iM28532 = c12391.m28532(iM13575);
                                                            if (c21307M28545 != null) {
                                                                this.f15165[i9] = m13570(iM28532);
                                                                C21307[] c21307Arr4 = this.f15161;
                                                                z3 = this.f15158;
                                                                c16611 = this.f15167;
                                                                if (z3) {
                                                                    c21307M48210 = c21307M28545.m48205(c16611, c12391.m28551(this.f15129));
                                                                } else {
                                                                    c21307M48210 = c21307M28545.m48210(c16611);
                                                                }
                                                                c21307Arr4[i9] = c21307M48210;
                                                                if (c10239 != null) {
                                                                    if (!z7) {
                                                                        if (iM28522 != 2) {
                                                                            if (iM28522 == 13) {
                                                                                if (c10239 != null) {
                                                                                }
                                                                            } else if (iM28522 == 7) {
                                                                                if (!z2) {
                                                                                    iM28528 = c12391.m28528(iM13575);
                                                                                    if (c5370.f12731.m53664()) {
                                                                                        iM28529 = c12391.m28526(iM13575);
                                                                                    } else {
                                                                                        iM28529 = c12391.m28529();
                                                                                    }
                                                                                    if (iM28528 == iM28529) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (iM28522 == 12) {
                                                                        if (c12391.m28557(iM13575) == iM28564) {
                                                                        }
                                                                    } else if (iM28522 == 5) {
                                                                        if (!z2) {
                                                                            iM285210 = c12391.m28528(iM13575);
                                                                            if (c5370.f12731.m53664()) {
                                                                                iM285211 = c12391.m28526(iM13575);
                                                                            } else {
                                                                                iM285211 = c12391.m28529();
                                                                            }
                                                                            if (iM285210 == iM285211) {
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (!z7) {
                                                                    if (iM28522 != 2) {
                                                                        if (iM28522 == 13) {
                                                                            if (c10239 != null) {
                                                                            }
                                                                        } else if (iM28522 == 7) {
                                                                            if (!z2) {
                                                                                iM28528 = c12391.m28528(iM13575);
                                                                                if (c5370.f12731.m53664()) {
                                                                                    iM28529 = c12391.m28526(iM13575);
                                                                                } else {
                                                                                    iM28529 = c12391.m28529();
                                                                                }
                                                                                if (iM28528 == iM28529) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (iM28522 == 12) {
                                                                    if (c12391.m28557(iM13575) == iM28564) {
                                                                    }
                                                                } else if (iM28522 == 5) {
                                                                    if (!z2) {
                                                                        iM285210 = c12391.m28528(iM13575);
                                                                        if (c5370.f12731.m53664()) {
                                                                            iM285211 = c12391.m28526(iM13575);
                                                                        } else {
                                                                            iM285211 = c12391.m28529();
                                                                        }
                                                                        if (iM285210 == iM285211) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (!c12251.f34245) {
                                                            if (c10239 != null) {
                                                                if (!z7) {
                                                                    if (iM28522 != 2) {
                                                                        if (iM28522 == 13) {
                                                                            if (c10239 != null) {
                                                                            }
                                                                        } else if (iM28522 == 7) {
                                                                            if (!z2) {
                                                                                iM28528 = c12391.m28528(iM13575);
                                                                                if (c5370.f12731.m53664()) {
                                                                                    iM28529 = c12391.m28526(iM13575);
                                                                                } else {
                                                                                    iM28529 = c12391.m28529();
                                                                                }
                                                                                if (iM28528 == iM28529) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (iM28522 == 12) {
                                                                    if (c12391.m28557(iM13575) == iM28564) {
                                                                    }
                                                                } else if (iM28522 == 5) {
                                                                    if (!z2) {
                                                                        iM285210 = c12391.m28528(iM13575);
                                                                        if (c5370.f12731.m53664()) {
                                                                            iM285211 = c12391.m28526(iM13575);
                                                                        } else {
                                                                            iM285211 = c12391.m28529();
                                                                        }
                                                                        if (iM285210 == iM285211) {
                                                                        }
                                                                    }
                                                                }
                                                            } else if (!z7) {
                                                                if (iM28522 != 2) {
                                                                    if (iM28522 == 13) {
                                                                        if (c10239 != null) {
                                                                        }
                                                                    } else if (iM28522 == 7) {
                                                                        if (!z2) {
                                                                            iM28528 = c12391.m28528(iM13575);
                                                                            if (c5370.f12731.m53664()) {
                                                                                iM28529 = c12391.m28526(iM13575);
                                                                            } else {
                                                                                iM28529 = c12391.m28529();
                                                                            }
                                                                            if (iM28528 == iM28529) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (iM28522 == 12) {
                                                                if (c12391.m28557(iM13575) == iM28564) {
                                                                }
                                                            } else if (iM28522 == 5) {
                                                                if (!z2) {
                                                                    iM285210 = c12391.m28528(iM13575);
                                                                    if (c5370.f12731.m53664()) {
                                                                        iM285211 = c12391.m28526(iM13575);
                                                                    } else {
                                                                        iM285211 = c12391.m28529();
                                                                    }
                                                                    if (iM285210 == iM285211) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (!z7) {
                                                }
                                            }
                                        }
                                    } else if (iM28533 == -1) {
                                        int iM285214 = c12391.m28522(iM13575);
                                        if (abstractC21639 instanceof C12251) {
                                            z4 = false;
                                        } else {
                                            z4 = false;
                                        }
                                        if (iM28523 >= 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z4 == z5) {
                                            iM28522 = c12391.m28522(iM13575);
                                            if (abstractC21639 instanceof C7557) {
                                                C7557 c75511 = (C7557) abstractC21639;
                                                if (!z7) {
                                                }
                                            } else if (abstractC21639 instanceof C23650) {
                                                C23650 c23654 = (C23650) abstractC21639;
                                                int iM285313 = c12391.m28539(iM13575);
                                                if (!z7) {
                                                }
                                            } else if (abstractC21639 instanceof C14932) {
                                                c12251 = (C12251) abstractC21639;
                                                bitSet = c12251.f34252;
                                                c10239 = c12251.f34250;
                                                z2 = c12251.f34253;
                                                if (bitSet.isEmpty()) {
                                                    if (iM28522 == 15) {
                                                        if (z7) {
                                                        }
                                                    } else if (z2) {
                                                        c21307M28545 = c12391.m28545(iM13575);
                                                        iM28532 = c12391.m28532(iM13575);
                                                        if (c21307M28545 != null) {
                                                            this.f15165[i9] = m13570(iM28532);
                                                            C21307[] c21307Arr5 = this.f15161;
                                                            z3 = this.f15158;
                                                            c16611 = this.f15167;
                                                            if (z3) {
                                                                c21307M48210 = c21307M28545.m48205(c16611, c12391.m28551(this.f15129));
                                                            } else {
                                                                c21307M48210 = c21307M28545.m48210(c16611);
                                                            }
                                                            c21307Arr5[i9] = c21307M48210;
                                                            if (c10239 != null) {
                                                                if (!z7) {
                                                                    if (iM28522 != 2) {
                                                                        if (iM28522 == 13) {
                                                                            if (c10239 != null) {
                                                                            }
                                                                        } else if (iM28522 == 7) {
                                                                            if (!z2) {
                                                                                iM28528 = c12391.m28528(iM13575);
                                                                                if (c5370.f12731.m53664()) {
                                                                                    iM28529 = c12391.m28526(iM13575);
                                                                                } else {
                                                                                    iM28529 = c12391.m28529();
                                                                                }
                                                                                if (iM28528 == iM28529) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (iM28522 == 12) {
                                                                    if (c12391.m28557(iM13575) == iM28564) {
                                                                    }
                                                                } else if (iM28522 == 5) {
                                                                    if (!z2) {
                                                                        iM285210 = c12391.m28528(iM13575);
                                                                        if (c5370.f12731.m53664()) {
                                                                            iM285211 = c12391.m28526(iM13575);
                                                                        } else {
                                                                            iM285211 = c12391.m28529();
                                                                        }
                                                                        if (iM285210 == iM285211) {
                                                                        }
                                                                    }
                                                                }
                                                            } else if (!z7) {
                                                                if (iM28522 != 2) {
                                                                    if (iM28522 == 13) {
                                                                        if (c10239 != null) {
                                                                        }
                                                                    } else if (iM28522 == 7) {
                                                                        if (!z2) {
                                                                            iM28528 = c12391.m28528(iM13575);
                                                                            if (c5370.f12731.m53664()) {
                                                                                iM28529 = c12391.m28526(iM13575);
                                                                            } else {
                                                                                iM28529 = c12391.m28529();
                                                                            }
                                                                            if (iM28528 == iM28529) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (iM28522 == 12) {
                                                                if (c12391.m28557(iM13575) == iM28564) {
                                                                }
                                                            } else if (iM28522 == 5) {
                                                                if (!z2) {
                                                                    iM285210 = c12391.m28528(iM13575);
                                                                    if (c5370.f12731.m53664()) {
                                                                        iM285211 = c12391.m28526(iM13575);
                                                                    } else {
                                                                        iM285211 = c12391.m28529();
                                                                    }
                                                                    if (iM285210 == iM285211) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (!c12251.f34245) {
                                                        if (c10239 != null) {
                                                            if (!z7) {
                                                                if (iM28522 != 2) {
                                                                    if (iM28522 == 13) {
                                                                        if (c10239 != null) {
                                                                        }
                                                                    } else if (iM28522 == 7) {
                                                                        if (!z2) {
                                                                            iM28528 = c12391.m28528(iM13575);
                                                                            if (c5370.f12731.m53664()) {
                                                                                iM28529 = c12391.m28526(iM13575);
                                                                            } else {
                                                                                iM28529 = c12391.m28529();
                                                                            }
                                                                            if (iM28528 == iM28529) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (iM28522 == 12) {
                                                                if (c12391.m28557(iM13575) == iM28564) {
                                                                }
                                                            } else if (iM28522 == 5) {
                                                                if (!z2) {
                                                                    iM285210 = c12391.m28528(iM13575);
                                                                    if (c5370.f12731.m53664()) {
                                                                        iM285211 = c12391.m28526(iM13575);
                                                                    } else {
                                                                        iM285211 = c12391.m28529();
                                                                    }
                                                                    if (iM285210 == iM285211) {
                                                                    }
                                                                }
                                                            }
                                                        } else if (!z7) {
                                                            if (iM28522 != 2) {
                                                                if (iM28522 == 13) {
                                                                    if (c10239 != null) {
                                                                    }
                                                                } else if (iM28522 == 7) {
                                                                    if (!z2) {
                                                                        iM28528 = c12391.m28528(iM13575);
                                                                        if (c5370.f12731.m53664()) {
                                                                            iM28529 = c12391.m28526(iM13575);
                                                                        } else {
                                                                            iM28529 = c12391.m28529();
                                                                        }
                                                                        if (iM28528 == iM28529) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (iM28522 == 12) {
                                                            if (c12391.m28557(iM13575) == iM28564) {
                                                            }
                                                        } else if (iM28522 == 5) {
                                                            if (!z2) {
                                                                iM285210 = c12391.m28528(iM13575);
                                                                if (c5370.f12731.m53664()) {
                                                                    iM285211 = c12391.m28526(iM13575);
                                                                } else {
                                                                    iM285211 = c12391.m28529();
                                                                }
                                                                if (iM285210 == iM285211) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (!z7) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            AbstractC21639 abstractC216311 = c5370.f12731.f77067[c12391.m28541(iM13577)];
                            if ((abstractC216311 instanceof C12251) && ((C12251) abstractC216311).f34250 != null && iM28525 == c12391.m28540(iM13577) && iM28526 == c12391.m28528(iM13577)) {
                                int iM285111 = c12391.m28519(this.f15129);
                                iM28536 = c12391.m28536(this.f15129);
                                int iM28538 = c12391.m28534(iM13575);
                                iM28533 = c12391.m28533(iM13575);
                                iM28523 = c12391.m28523(iM13575);
                                if (iM28536 >= 1) {
                                    if (i9 != 0) {
                                        iM13574 = m13574(i9 - 1);
                                        if (!C5370.m11663(c12391, iM13574)) {
                                            iM28524 = c12391.m28533(iM13574);
                                        } else {
                                            iM28524 = c12391.m28523(iM13574);
                                        }
                                        if (iM28533 == iM28524) {
                                            int iM285215 = c12391.m28522(iM13575);
                                            if (abstractC21639 instanceof C12251) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                            }
                                            if (iM28523 >= 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z4 == z5) {
                                                iM28522 = c12391.m28522(iM13575);
                                                if (abstractC21639 instanceof C7557) {
                                                    C7557 c75512 = (C7557) abstractC21639;
                                                    if (!z7) {
                                                    }
                                                } else if (abstractC21639 instanceof C23650) {
                                                    C23650 c23655 = (C23650) abstractC21639;
                                                    int iM285314 = c12391.m28539(iM13575);
                                                    if (!z7) {
                                                    }
                                                } else if (abstractC21639 instanceof C14932) {
                                                    c12251 = (C12251) abstractC21639;
                                                    bitSet = c12251.f34252;
                                                    c10239 = c12251.f34250;
                                                    z2 = c12251.f34253;
                                                    if (bitSet.isEmpty()) {
                                                        if (iM28522 == 15) {
                                                            if (z7) {
                                                            }
                                                        } else if (z2) {
                                                            c21307M28545 = c12391.m28545(iM13575);
                                                            iM28532 = c12391.m28532(iM13575);
                                                            if (c21307M28545 != null) {
                                                                this.f15165[i9] = m13570(iM28532);
                                                                C21307[] c21307Arr6 = this.f15161;
                                                                z3 = this.f15158;
                                                                c16611 = this.f15167;
                                                                if (z3) {
                                                                    c21307M48210 = c21307M28545.m48205(c16611, c12391.m28551(this.f15129));
                                                                } else {
                                                                    c21307M48210 = c21307M28545.m48210(c16611);
                                                                }
                                                                c21307Arr6[i9] = c21307M48210;
                                                                if (c10239 != null) {
                                                                    if (!z7) {
                                                                        if (iM28522 != 2) {
                                                                            if (iM28522 == 13) {
                                                                                if (c10239 != null) {
                                                                                }
                                                                            } else if (iM28522 == 7) {
                                                                                if (!z2) {
                                                                                    iM28528 = c12391.m28528(iM13575);
                                                                                    if (c5370.f12731.m53664()) {
                                                                                        iM28529 = c12391.m28526(iM13575);
                                                                                    } else {
                                                                                        iM28529 = c12391.m28529();
                                                                                    }
                                                                                    if (iM28528 == iM28529) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (iM28522 == 12) {
                                                                        if (c12391.m28557(iM13575) == iM28564) {
                                                                        }
                                                                    } else if (iM28522 == 5) {
                                                                        if (!z2) {
                                                                            iM285210 = c12391.m28528(iM13575);
                                                                            if (c5370.f12731.m53664()) {
                                                                                iM285211 = c12391.m28526(iM13575);
                                                                            } else {
                                                                                iM285211 = c12391.m28529();
                                                                            }
                                                                            if (iM285210 == iM285211) {
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (!z7) {
                                                                    if (iM28522 != 2) {
                                                                        if (iM28522 == 13) {
                                                                            if (c10239 != null) {
                                                                            }
                                                                        } else if (iM28522 == 7) {
                                                                            if (!z2) {
                                                                                iM28528 = c12391.m28528(iM13575);
                                                                                if (c5370.f12731.m53664()) {
                                                                                    iM28529 = c12391.m28526(iM13575);
                                                                                } else {
                                                                                    iM28529 = c12391.m28529();
                                                                                }
                                                                                if (iM28528 == iM28529) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (iM28522 == 12) {
                                                                    if (c12391.m28557(iM13575) == iM28564) {
                                                                    }
                                                                } else if (iM28522 == 5) {
                                                                    if (!z2) {
                                                                        iM285210 = c12391.m28528(iM13575);
                                                                        if (c5370.f12731.m53664()) {
                                                                            iM285211 = c12391.m28526(iM13575);
                                                                        } else {
                                                                            iM285211 = c12391.m28529();
                                                                        }
                                                                        if (iM285210 == iM285211) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (!c12251.f34245) {
                                                            if (c10239 != null) {
                                                                if (!z7) {
                                                                    if (iM28522 != 2) {
                                                                        if (iM28522 == 13) {
                                                                            if (c10239 != null) {
                                                                            }
                                                                        } else if (iM28522 == 7) {
                                                                            if (!z2) {
                                                                                iM28528 = c12391.m28528(iM13575);
                                                                                if (c5370.f12731.m53664()) {
                                                                                    iM28529 = c12391.m28526(iM13575);
                                                                                } else {
                                                                                    iM28529 = c12391.m28529();
                                                                                }
                                                                                if (iM28528 == iM28529) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (iM28522 == 12) {
                                                                    if (c12391.m28557(iM13575) == iM28564) {
                                                                    }
                                                                } else if (iM28522 == 5) {
                                                                    if (!z2) {
                                                                        iM285210 = c12391.m28528(iM13575);
                                                                        if (c5370.f12731.m53664()) {
                                                                            iM285211 = c12391.m28526(iM13575);
                                                                        } else {
                                                                            iM285211 = c12391.m28529();
                                                                        }
                                                                        if (iM285210 == iM285211) {
                                                                        }
                                                                    }
                                                                }
                                                            } else if (!z7) {
                                                                if (iM28522 != 2) {
                                                                    if (iM28522 == 13) {
                                                                        if (c10239 != null) {
                                                                        }
                                                                    } else if (iM28522 == 7) {
                                                                        if (!z2) {
                                                                            iM28528 = c12391.m28528(iM13575);
                                                                            if (c5370.f12731.m53664()) {
                                                                                iM28529 = c12391.m28526(iM13575);
                                                                            } else {
                                                                                iM28529 = c12391.m28529();
                                                                            }
                                                                            if (iM28528 == iM28529) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (iM28522 == 12) {
                                                                if (c12391.m28557(iM13575) == iM28564) {
                                                                }
                                                            } else if (iM28522 == 5) {
                                                                if (!z2) {
                                                                    iM285210 = c12391.m28528(iM13575);
                                                                    if (c5370.f12731.m53664()) {
                                                                        iM285211 = c12391.m28526(iM13575);
                                                                    } else {
                                                                        iM285211 = c12391.m28529();
                                                                    }
                                                                    if (iM285210 == iM285211) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (!z7) {
                                                }
                                            }
                                        }
                                    } else if (iM28533 == -1) {
                                        int iM285216 = c12391.m28522(iM13575);
                                        if (abstractC21639 instanceof C12251) {
                                            z4 = false;
                                        } else {
                                            z4 = false;
                                        }
                                        if (iM28523 >= 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z4 == z5) {
                                            iM28522 = c12391.m28522(iM13575);
                                            if (abstractC21639 instanceof C7557) {
                                                C7557 c75513 = (C7557) abstractC21639;
                                                if (!z7) {
                                                }
                                            } else if (abstractC21639 instanceof C23650) {
                                                C23650 c23656 = (C23650) abstractC21639;
                                                int iM285315 = c12391.m28539(iM13575);
                                                if (!z7) {
                                                }
                                            } else if (abstractC21639 instanceof C14932) {
                                                c12251 = (C12251) abstractC21639;
                                                bitSet = c12251.f34252;
                                                c10239 = c12251.f34250;
                                                z2 = c12251.f34253;
                                                if (bitSet.isEmpty()) {
                                                    if (iM28522 == 15) {
                                                        if (z7) {
                                                        }
                                                    } else if (z2) {
                                                        c21307M28545 = c12391.m28545(iM13575);
                                                        iM28532 = c12391.m28532(iM13575);
                                                        if (c21307M28545 != null) {
                                                            this.f15165[i9] = m13570(iM28532);
                                                            C21307[] c21307Arr7 = this.f15161;
                                                            z3 = this.f15158;
                                                            c16611 = this.f15167;
                                                            if (z3) {
                                                                c21307M48210 = c21307M28545.m48205(c16611, c12391.m28551(this.f15129));
                                                            } else {
                                                                c21307M48210 = c21307M28545.m48210(c16611);
                                                            }
                                                            c21307Arr7[i9] = c21307M48210;
                                                            if (c10239 != null) {
                                                                if (!z7) {
                                                                    if (iM28522 != 2) {
                                                                        if (iM28522 == 13) {
                                                                            if (c10239 != null) {
                                                                            }
                                                                        } else if (iM28522 == 7) {
                                                                            if (!z2) {
                                                                                iM28528 = c12391.m28528(iM13575);
                                                                                if (c5370.f12731.m53664()) {
                                                                                    iM28529 = c12391.m28526(iM13575);
                                                                                } else {
                                                                                    iM28529 = c12391.m28529();
                                                                                }
                                                                                if (iM28528 == iM28529) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (iM28522 == 12) {
                                                                    if (c12391.m28557(iM13575) == iM28564) {
                                                                    }
                                                                } else if (iM28522 == 5) {
                                                                    if (!z2) {
                                                                        iM285210 = c12391.m28528(iM13575);
                                                                        if (c5370.f12731.m53664()) {
                                                                            iM285211 = c12391.m28526(iM13575);
                                                                        } else {
                                                                            iM285211 = c12391.m28529();
                                                                        }
                                                                        if (iM285210 == iM285211) {
                                                                        }
                                                                    }
                                                                }
                                                            } else if (!z7) {
                                                                if (iM28522 != 2) {
                                                                    if (iM28522 == 13) {
                                                                        if (c10239 != null) {
                                                                        }
                                                                    } else if (iM28522 == 7) {
                                                                        if (!z2) {
                                                                            iM28528 = c12391.m28528(iM13575);
                                                                            if (c5370.f12731.m53664()) {
                                                                                iM28529 = c12391.m28526(iM13575);
                                                                            } else {
                                                                                iM28529 = c12391.m28529();
                                                                            }
                                                                            if (iM28528 == iM28529) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (iM28522 == 12) {
                                                                if (c12391.m28557(iM13575) == iM28564) {
                                                                }
                                                            } else if (iM28522 == 5) {
                                                                if (!z2) {
                                                                    iM285210 = c12391.m28528(iM13575);
                                                                    if (c5370.f12731.m53664()) {
                                                                        iM285211 = c12391.m28526(iM13575);
                                                                    } else {
                                                                        iM285211 = c12391.m28529();
                                                                    }
                                                                    if (iM285210 == iM285211) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (!c12251.f34245) {
                                                        if (c10239 != null) {
                                                            if (!z7) {
                                                                if (iM28522 != 2) {
                                                                    if (iM28522 == 13) {
                                                                        if (c10239 != null) {
                                                                        }
                                                                    } else if (iM28522 == 7) {
                                                                        if (!z2) {
                                                                            iM28528 = c12391.m28528(iM13575);
                                                                            if (c5370.f12731.m53664()) {
                                                                                iM28529 = c12391.m28526(iM13575);
                                                                            } else {
                                                                                iM28529 = c12391.m28529();
                                                                            }
                                                                            if (iM28528 == iM28529) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (iM28522 == 12) {
                                                                if (c12391.m28557(iM13575) == iM28564) {
                                                                }
                                                            } else if (iM28522 == 5) {
                                                                if (!z2) {
                                                                    iM285210 = c12391.m28528(iM13575);
                                                                    if (c5370.f12731.m53664()) {
                                                                        iM285211 = c12391.m28526(iM13575);
                                                                    } else {
                                                                        iM285211 = c12391.m28529();
                                                                    }
                                                                    if (iM285210 == iM285211) {
                                                                    }
                                                                }
                                                            }
                                                        } else if (!z7) {
                                                            if (iM28522 != 2) {
                                                                if (iM28522 == 13) {
                                                                    if (c10239 != null) {
                                                                    }
                                                                } else if (iM28522 == 7) {
                                                                    if (!z2) {
                                                                        iM28528 = c12391.m28528(iM13575);
                                                                        if (c5370.f12731.m53664()) {
                                                                            iM28529 = c12391.m28526(iM13575);
                                                                        } else {
                                                                            iM28529 = c12391.m28529();
                                                                        }
                                                                        if (iM28528 == iM28529) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (iM28522 == 12) {
                                                            if (c12391.m28557(iM13575) == iM28564) {
                                                            }
                                                        } else if (iM28522 == 5) {
                                                            if (!z2) {
                                                                iM285210 = c12391.m28528(iM13575);
                                                                if (c5370.f12731.m53664()) {
                                                                    iM285211 = c12391.m28526(iM13575);
                                                                } else {
                                                                    iM285211 = c12391.m28529();
                                                                }
                                                                if (iM285210 == iM285211) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (!z7) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!z) {
            m13566();
        } else {
            this.f15138 = iM13575;
            this.f15140++;
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private boolean m13573() {
        return this.f15157 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13559(boolean z) {
        int iMax;
        this.f15132 = z;
        if (this.f15143 == 0) {
            int[] iArr = this.f15142;
            this.f15142 = this.f15130;
            this.f15130 = iArr;
            m13567();
            return;
        }
        int[] iArr2 = this.f15142;
        if (iArr2 == null || iArr2.length < this.f15160) {
            if (iArr2 == null) {
                iMax = Math.max(16, this.f15160);
            } else {
                iMax = Math.max(this.f15160, iArr2.length << 1);
            }
            int[] iArr3 = this.f15142;
            this.f15142 = iArr3 == null ? new int[iMax] : Arrays.copyOf(iArr3, iMax);
        }
        this.f15141 = this.f15143;
        this.f15157 = 4;
    }

    /* JADX INFO: renamed from: ۢ */
    private void m13567() {
        int iMax;
        int i = this.f15160;
        this.f15125 = i;
        if (!this.f15132) {
            this.f15153 = this.f15155;
            m13566();
            return;
        }
        int[] iArr = this.f15166;
        if (iArr == null || iArr.length < i) {
            if (iArr == null) {
                iMax = Math.max(16, i);
            } else {
                iMax = Math.max(i, iArr.length << 1);
            }
            int[] iArr2 = this.f15166;
            this.f15166 = iArr2 == null ? new int[iMax] : Arrays.copyOf(iArr2, iMax);
        }
        this.f15141 = this.f15155;
        this.f15157 = 5;
    }

    /* JADX INFO: renamed from: ۡ */
    private void m13566() {
        this.f15157 = 0;
        this.f15136 = null;
        this.f15132 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m13561(C12251 c12251, int i, int i2) {
        C12391 c12391 = this.f15154;
        int iM28516 = c12391.m28516(i);
        int iM28556 = c12391.m28556(i);
        int iM28557 = c12391.m28557(i);
        int iM28540 = c12391.m28540(i);
        int iM28528 = c12391.m28528(i);
        int iM28525 = c12391.m28525(i);
        int iM28526 = c12391.m28526(i);
        boolean z = (iM28525 & 1) == 0 ? !(c12251.f34245 || iM28528 != iM28526) : !(c12391.m28560(i) != iM28528 || c12391.m28517(i) < iM28528 || c12391.m28517(i) > iM28526 || c12391.m28527(i) < iM28540 || c12391.m28527(i) > iM28528);
        if (iM28516 >= 0) {
            int[] iArr = c12251.f34250.f28364;
            if (iM28516 < iArr.length && iM28556 == iArr[iM28516] && iM28556 >= 0 && iM28540 >= c12391.m28524(i) && iM28540 <= iM28528 && iM28528 <= iM28526 && iM28557 >= iM28540 && iM28557 <= iM28528 && iM28557 <= i2 && z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m13560(int i, int i2) {
        if (i >= 0 && i <= i2) {
            try {
                if (m13570(i) >= 0) {
                    return true;
                }
            } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ */
    private int m13570(int i) {
        if (i < 0) {
            return i;
        }
        boolean z = this.f15158;
        C16611 c16611 = this.f15167;
        if (!z) {
            int iM11673 = C5370.m11673(c16611, i);
            if (iM11673 >= 0) {
                return iM11673;
            }
            throw new IllegalArgumentException("Ambiguous checkpoint offset");
        }
        int iM37659 = c16611.m37659(i, EnumC3200.AFTER);
        long jM37665 = ((long) c16611.m37665()) - ((long) c16611.m37663());
        if (iM37659 < 0 || ((long) iM37659) - ((long) i) != jM37665) {
            throw new IllegalArgumentException("Checkpoint offset does not move with suffix");
        }
        return iM37659;
    }

    /* JADX INFO: renamed from: ᩺ */
    private int m13574(int i) {
        int iCheckIndex = C12826.checkIndex(i, this.f15160);
        return iCheckIndex < this.f15143 ? this.f15142[iCheckIndex] : this.f15130[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۛ */
    private AbstractC21639 m13563(int i) {
        return this.f15168.f12731.f77067[this.f15154.m28541(m13574(i))];
    }

    /* JADX INFO: renamed from: ֫֫ */
    private boolean m13562(int i) {
        return (m13563(i) instanceof C12251) && this.f15154.m28522(m13574(i)) != 2;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۧ */
    public final int mo13591() {
        return this.f15160;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۬ */
    public final int mo13595(int i) {
        return this.f15154.m28541(m13574(i));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ֡ */
    public final int mo13575(int i) {
        return this.f15154.m28531(m13574(i));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩵ */
    public final int mo13607(int i) {
        return this.f15154.m28535(m13574(i));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۧ */
    public final int mo13592(int i) {
        return this.f15154.m28522(m13574(i));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ܳ */
    public final int mo13596(int i) {
        return m13570(this.f15154.m28561(m13574(i)));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ֫ */
    public final int mo13578(int i) {
        if ((m13563(i) instanceof C23650) || m13562(i)) {
            return m13570(this.f15154.m28549(m13574(i)));
        }
        return 0;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩹ */
    public final int mo13611(int i) {
        boolean z = m13563(i) instanceof C23650;
        C12391 c12391 = this.f15154;
        if (!z) {
            AbstractC21639 abstractC21639M13563 = m13563(i);
            if (!(abstractC21639M13563 instanceof C12251) || ((C12251) abstractC21639M13563).f34246 == null || c12391.m28522(m13574(i)) == 2) {
                return 0;
            }
        }
        return m13570(c12391.m28538(m13574(i)));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩳ */
    public final int mo13604(int i) {
        if (m13562(i)) {
            return m13570(this.f15154.m28540(m13574(i)));
        }
        return 0;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩷ */
    public final int mo13609(int i) {
        if (m13562(i)) {
            return (((C12251) m13563(i)).f34250 == null && m13569(i)) ? this.f15168.f12725 : m13570(this.f15154.m28528(m13574(i)));
        }
        return 0;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۫ */
    public final int mo13594(int i) {
        if (m13562(i)) {
            return m13570(this.f15154.m28555(m13574(i)));
        }
        return 0;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۠ */
    public final int mo13587(int i) {
        return this.f15154.m28552(m13574(i));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩻ */
    public final int mo13612(int i) {
        return this.f15154.m28559(m13574(i));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۙ */
    public final int mo13584(int i) {
        return this.f15154.m28539(m13574(i));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩶ */
    public final int mo13608(int i) {
        return this.f15154.m28562(m13574(i));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ܽ */
    public final long mo13601(int i) {
        return this.f15154.m28530(m13574(i));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ܿ */
    public final int mo13602(int i) {
        int[] iArr = this.f15165;
        if (iArr == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۚ */
    public final C21307 mo13585(int i) {
        C21307[] c21307Arr = this.f15161;
        if (c21307Arr == null) {
            return null;
        }
        return c21307Arr[i];
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۤ */
    public final int mo13590(int i) {
        if (m13569(i)) {
            return 0;
        }
        return m13570(this.f15154.m28524(m13574(i)));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ܶ */
    public final int mo13598(int i) {
        return m13569(i) ? this.f15168.f12725 : m13570(this.f15154.m28526(m13574(i)));
    }

    /* JADX INFO: renamed from: ۧ֫ */
    private boolean m13569(int i) {
        if (!this.f15168.f12731.m53664()) {
            return true;
        }
        int iM13574 = m13574(i);
        C12391 c12391 = this.f15154;
        return c12391.m28524(iM13574) == 0 && c12391.m28526(iM13574) == c12391.m28529();
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۖ */
    public final int mo13581(int i) {
        if (m13565(i)) {
            return m13570(this.f15154.m28560(m13574(i)));
        }
        return -1;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩸ */
    public final int mo13610(int i) {
        if (m13565(i)) {
            return m13570(this.f15154.m28517(m13574(i)));
        }
        return -1;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ֨ */
    public final int mo13576(int i) {
        if (m13565(i)) {
            return m13570(this.f15154.m28527(m13574(i)));
        }
        return -1;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۘ */
    public final int mo13583(int i) {
        if (m13571(i)) {
            return this.f15154.m28516(m13574(i));
        }
        return -1;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۜ */
    public final int mo13586(int i) {
        if (m13571(i)) {
            return this.f15154.m28556(m13574(i));
        }
        return -1;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۢ */
    public final int mo13589(int i) {
        if (m13571(i)) {
            return m13570(this.f15154.m28557(m13574(i)));
        }
        return -1;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۗ */
    public final int mo13582(int i) {
        if (m13571(i)) {
            return this.f15154.m28525(m13574(i));
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܰ */
    private boolean m13571(int i) {
        AbstractC21639 abstractC21639M13563 = m13563(i);
        int iM28522 = this.f15154.m28522(m13574(i));
        if (!(abstractC21639M13563 instanceof C12251) || ((C12251) abstractC21639M13563).f34250 == null) {
            return false;
        }
        return iM28522 == 12 || iM28522 == 13 || iM28522 == 15;
    }

    /* JADX INFO: renamed from: ۟ */
    private boolean m13565(int i) {
        return m13571(i) && (this.f15154.m28525(m13574(i)) & 1) != 0;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ֫ */
    public final int mo13577() {
        return this.f15131;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ܽ */
    public final int mo13600() {
        return this.f15123;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۡ */
    public final int mo13588(int i) {
        return this.f15154.m28534(m13574(i));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩴ */
    public final int mo13606(int i) {
        return this.f15154.m28533(m13574(i));
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ܺ */
    public final int mo13599(int i) {
        return this.f15154.m28523(m13574(i));
    }
}
