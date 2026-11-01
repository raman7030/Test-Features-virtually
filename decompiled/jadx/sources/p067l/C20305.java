package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V7EY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20305 extends AbstractC13599 {

    /* JADX INFO: renamed from: ֡ۧ */
    public ArrayList f62723;

    /* JADX INFO: renamed from: ֨ۧ */
    public ArrayList f62724;

    /* JADX INFO: renamed from: ۖۧ */
    public short f62725;

    /* JADX INFO: renamed from: ۘۧ */
    public boolean f62726;

    /* JADX INFO: renamed from: ۚۧ */
    public ArrayList f62727;

    /* JADX INFO: renamed from: ۜۧ */
    public C22161 f62728;

    /* JADX INFO: renamed from: ۡۧ */
    public ArrayList f62729;

    /* JADX INFO: renamed from: ۢۧ */
    public ArrayList f62730;

    /* JADX INFO: renamed from: ܺۧ */
    public ArrayList f62731;

    /* JADX INFO: renamed from: ᩴۧ */
    public C14959 f62732;

    /* JADX INFO: renamed from: ᩵ۧ */
    public ArrayList f62733;

    /* JADX INFO: renamed from: ᩷ۧ */
    public ArrayList f62734;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f62735;

    /* JADX INFO: renamed from: ۡ */
    public final void m45859(int i) {
        int i2 = i;
        this.f62735 = i2;
        C22161 c22161 = this.f62728;
        C19003 c19003 = (C19003) this.f38259;
        boolean z = c19003.f32303;
        boolean z2 = c19003.f32291;
        boolean z3 = z || z2;
        boolean z4 = z && z2;
        if (z3 && this.f62725 != 0) {
            m26667(1);
            if (z4) {
                String strM49967 = c22161.m49967(this.f62725);
                StringBuilder sb = new StringBuilder("// ");
                sb.append((int) this.f62725);
                sb.append(strM49967 != null ? "# ".concat(strM49967) : "");
                m26679(sb.toString());
            } else {
                C19003 c19004 = (C19003) this.f38259;
                if (c19004.f32303) {
                    m26673("// %d#", Short.valueOf(this.f62725));
                } else if (c19004.f32291) {
                    String strM49968 = c22161.m49967(this.f62725);
                    m26679(strM49968 != null ? "// ".concat(strM49968) : "");
                }
            }
            m26678(1);
        }
        ArrayList<C24347> arrayList = this.f62731;
        boolean z5 = this.f32292;
        boolean z6 = this.f32275;
        int i3 = 18;
        if (arrayList != null) {
            for (C24347 c24347 : arrayList) {
                m26668(m26677(i2, m26671(18, EnumC17134.f50831.m38779())));
                if (!z6) {
                    m26680("%s %s;", c24347.m53705(), ((C19003) this.f38259).f38266.m27982(c24347.f77114));
                } else if (z5) {
                    m26680("%s #%d;", c24347.m53705(), Integer.valueOf(c24347.f77114));
                } else {
                    String strM53705 = c24347.m53705();
                    int i4 = c24347.f77114;
                    m26668(m26671(this.f32298 - 18, String.format("%s #%d;", strM53705, Integer.valueOf(i4))));
                    StringBuilder sb2 = new StringBuilder(" // ");
                    sb2.append(i4 == 0 ? "any" : ((C19003) this.f38259).f38266.m27982(i4));
                    m26676(sb2.toString());
                }
            }
        }
        if (this.f62723 != null) {
            m26668(m26677(i2, m26671(18, EnumC17134.f50615.m38779())));
            m26676(((String) C7480.stream(this.f62723).map(new C17621()).collect(C24205.joining(", "))) + C0249l.f1196b);
        }
        ArrayList arrayList2 = this.f62724;
        boolean z7 = this.f32296;
        if (arrayList2 != null && !z7) {
            for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
                C22987 c22987 = (C22987) it.next();
                m26668(m26677(i2, m26671(i3, EnumC17134.f50932.m38779())));
                if (!z6) {
                    m26680("%d %s:%s;", Short.valueOf(c22987.f50138), ((C19003) this.f38259).f38266.getName(c22987.f50139), ((C19003) this.f38259).f38266.getName(c22987.f50136));
                } else if (z5) {
                    m26680("%d #%d:#%d;", Short.valueOf(c22987.f50138), Short.valueOf(c22987.f50139), Short.valueOf(c22987.f50136));
                } else {
                    short s = c22987.f50138;
                    short s2 = c22987.f50136;
                    short s3 = c22987.f50139;
                    m26668(m26671(this.f32298 - 18, String.format("%d #%d:#%d;", Short.valueOf(s), Short.valueOf(s3), Short.valueOf(s2))));
                    m26680(" // %s:%s", ((C19003) this.f38259).f38266.getName(s3), ((C19003) this.f38259).f38266.getName(s2));
                }
                i3 = 18;
            }
        }
        ArrayList<C23657> arrayList3 = this.f62727;
        if (arrayList3 == null || z7) {
            return;
        }
        for (C23657 c23657 : arrayList3) {
            m26668(m26677(i2, m26671(18, EnumC17134.f50723.m38779())));
            if (!z6) {
                m26680("%d %s:%s;", Short.valueOf(c23657.f50138), ((C19003) this.f38259).f38266.getName(c23657.f50139), ((C19003) this.f38259).f38266.getName(c23657.f50136));
            } else if (z5) {
                m26680("%d #%d:#%d;", Short.valueOf(c23657.f50138), Short.valueOf(c23657.f50139), Short.valueOf(c23657.f50136));
            } else {
                short s4 = c23657.f50138;
                short s5 = c23657.f50136;
                short s6 = c23657.f50139;
                m26668(m26671(this.f32298 - 18, String.format("%d #%d:#%d;", Short.valueOf(s4), Short.valueOf(s6), Short.valueOf(s5))));
                m26680(" // %s:%s", ((C19003) this.f38259).f38266.getName(s6), ((C19003) this.f38259).f38266.getName(s5));
            }
            i2 = i;
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m45858(int i) {
        ArrayList arrayList = this.f62730;
        boolean z = this.f32296;
        if (arrayList != null && !z) {
            m26668(m26677(i, m26671(18, EnumC17134.f50670.m38779())));
            m26676(((String) C7480.stream(this.f62730).map(new C4882()).collect(C24205.joining(","))) + C0249l.f1196b);
        }
        if (this.f62729 != null && !z) {
            m26668(m26677(i, m26671(18, EnumC17134.f50649.m38779())));
            m26676(((String) C7480.stream(this.f62729).map(new C6223()).collect(C24205.joining(","))) + C0249l.f1196b);
        }
        if (this.f62734 != null) {
            m26668(m26677(i, m26671(18, EnumC17134.f50912.m38779())));
            m26676(((String) C7480.stream(this.f62734).map(new C17621()).collect(C24205.joining(","))) + C0249l.f1196b);
        }
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m45857(int i) {
        C14959 c14959;
        if (this.f32296 || ((c14959 = this.f62732) == null && this.f62733 == null)) {
            return false;
        }
        if (c14959 != null) {
            if (c14959.m34254()) {
                return m45856(i);
            }
            m45855(i);
            return true;
        }
        if (((C14959) this.f62733.get(0)).m34254()) {
            return m45856(i);
        }
        m45855(i);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m45854(C8537 c8537, String str, int i, int i2) {
        boolean z = ((String) c8537.f22916).isEmpty() && ((String) c8537.f22917).isEmpty();
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(z ? C0249l.f1196b : "");
        m26668(m26677(i, m26671(18, sbM17248.toString())));
        boolean z2 = this.f32292;
        boolean z3 = this.f32275;
        if (z3) {
            if (z2) {
                m26676((String) c8537.f22916);
            } else {
                m26668(m26671(i2, (String) c8537.f22916));
                i2 = Math.max(i2, ((String) c8537.f22916).length());
                if (!z) {
                    m26668(" // ");
                }
            }
        }
        if (z3 && (!z3 || z2)) {
            return i2;
        }
        m26676((String) c8537.f22917);
        return i2;
    }

    /* JADX INFO: renamed from: ۠ */
    private void m45855(int i) {
        int i2 = this.f32298 - 18;
        m26675(18, EnumC17134.f50734.m38779() + C0249l.f1196b);
        if (this.f32275 && !this.f32292) {
            this.f32274.mo4344(m26671(i2, " "));
            m26676(" // offset " + this.f62732.f42737);
        } else {
            m26681();
        }
        C14959 c14959 = this.f62732;
        int iM45854 = m45854(c14959.m34251("", c14959.f42734), EnumC17134.f50913.m38779(), i, i2);
        C14959 c149510 = this.f62732;
        m45854(c149510.m34251("", c149510.f42728), EnumC17134.f50921.m38779(), i, iM45854);
    }

    /* JADX INFO: renamed from: ܶ */
    private boolean m45856(int i) {
        int i2;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        boolean z4;
        String strM40053;
        String str3;
        int i3;
        int iM45854;
        int i4;
        String str4;
        boolean z5;
        String str5;
        int i5;
        int i6 = this.f32298 - 18;
        boolean z6 = this.f62733 != null;
        String strM38779 = EnumC17134.f50701.m38779();
        String str6 = " ";
        boolean z7 = this.f32292;
        boolean z8 = this.f32275;
        String str7 = AbstractC11588.f32270;
        if (z6) {
            int i7 = 0;
            strM40053 = "";
            String strM40054 = str7;
            while (i7 < this.f62733.size()) {
                C14959 c14959 = (C14959) this.f62733.get(i7);
                if (i7 > 0) {
                    strM38779 = EnumC17134.f50892.m38779();
                    strM40054 = C17588.m40053(str7, str7);
                    strM40053 = str7;
                }
                boolean z9 = z6;
                String str8 = strM38779;
                m26675(18, strM40053 + strM38779);
                if (!z8 || z7) {
                    m26676(c14959.f42736.m53547() + C0249l.f1196b);
                } else {
                    this.f32274.mo4344(m26671(i6, c14959.f42736.m53547() + C0249l.f1196b));
                    m26676(" // " + EnumC16818.f49706.m38127() + str6 + c14959.f42724);
                }
                int[] iArr = c14959.f42738;
                int i8 = this.f32298 - 18;
                if (iArr == null || iArr.length <= 0) {
                    i4 = i6;
                    str4 = str6;
                    z7 = z7;
                    z5 = z8;
                    str5 = str7;
                    i5 = i7;
                } else {
                    int length = iArr.length - 1;
                    C8537 c8537M34252 = this.f62732.m34252(iArr);
                    str4 = str6;
                    i4 = i6;
                    String strConcat = ((String) C7480.stream((List) c8537M34252.f22916).collect(C24205.joining(", "))).concat(C0249l.f1196b);
                    i5 = i7;
                    String strConcat2 = ((String) C7480.stream((List) c8537M34252.f22917).collect(C24205.joining(", "))).concat(C0249l.f1196b);
                    StringBuilder sbM17248 = C7470.m17248(str7);
                    str5 = str7;
                    sbM17248.append(EnumC17134.f50833.m38779());
                    String strM26677 = m26677(i, m26671(18, sbM17248.toString()));
                    m26668(strM26677);
                    String strM26674 = m26674(strM26677.length());
                    if (z8) {
                        if (z7) {
                            m26676(strConcat);
                        } else {
                            if (length == 0) {
                                this.f32274.mo4344(m26671(i8, strConcat));
                                m26676(" // " + strConcat2);
                            } else {
                                this.f32274.mo4344(m26671(i8, ((String) ((List) c8537M34252.f22916).get(0)).concat(",")));
                                m26676(" // " + ((String) ((List) c8537M34252.f22917).get(0)).concat(","));
                                int i9 = 1;
                                while (i9 <= length) {
                                    String str9 = i9 == length ? C0249l.f1196b : ",";
                                    String strConcat3 = ((String) ((List) c8537M34252.f22916).get(i9)).concat(str9);
                                    String strConcat4 = ((String) ((List) c8537M34252.f22917).get(i9)).concat(str9);
                                    this.f32274.mo4344(strM26674);
                                    this.f32274.mo4344(m26671(i8, strConcat3));
                                    m26676(" // " + strConcat4);
                                    i9++;
                                    z8 = z8;
                                }
                            }
                            z5 = z8;
                        }
                        z5 = z8;
                    } else {
                        z7 = z7;
                        z5 = z8;
                        if (length == 0) {
                            m26676(strConcat2);
                        } else {
                            m26676(((String) ((List) c8537M34252.f22917).get(0)).concat(","));
                            int i10 = 1;
                            while (i10 <= length) {
                                String strConcat5 = ((String) ((List) c8537M34252.f22917).get(i10)).concat(i10 == length ? C0249l.f1196b : ",");
                                this.f32274.mo4344(strM26674);
                                m26676(strConcat5);
                                i10++;
                            }
                        }
                    }
                }
                if (iArr == null || iArr.length == 0) {
                    StringBuilder sbM17249 = C7470.m17248(strM40054);
                    sbM17249.append(EnumC17134.f50833.m38779());
                    sbM17249.append(C0249l.f1196b);
                    m26676(m26677(i, sbM17249.toString()));
                }
                m26668(m26677(this.f62735, ""));
                i7 = i5 + 1;
                z6 = z9;
                strM38779 = str8;
                strM40053 = strM40053;
                str6 = str4;
                z7 = z7;
                i6 = i4;
                str7 = str5;
                z8 = z5;
            }
            i2 = i6;
            z = z6;
            str = str6;
            z2 = z7;
            z3 = z8;
            str2 = str7;
            z4 = true;
        } else {
            i2 = i6;
            z = z6;
            str = " ";
            z2 = z7;
            z3 = z8;
            str2 = str7;
            z4 = true;
            strM40053 = "";
        }
        String strM387710 = EnumC17134.f50701.m38779();
        if (this.f62732 != null) {
            if (z) {
                strM387710 = EnumC17134.f50892.m38779();
                str3 = str2;
                strM40053 = C17588.m40053(strM40053, str3);
            } else {
                str3 = str2;
            }
            String strM40055 = C17588.m40053(strM40053, str3);
            m26675(18, strM40053 + strM387710);
            if (!z3 || z2) {
                i3 = i2;
                m26676(this.f62732.f42736.m53547() + C0249l.f1196b);
            } else {
                i3 = i2;
                this.f32274.mo4344(m26671(i3, this.f62732.f42736.m53547() + C0249l.f1196b));
                m26676(" // " + EnumC16818.f49706.m38127() + str + this.f62732.f42724);
            }
            C14959 c149510 = this.f62732;
            int[] iArr2 = c149510.f42734;
            if (iArr2 == null || iArr2.length == 0) {
                if (c149510.f42736.m53549()) {
                    StringBuilder sbM172410 = C7470.m17248(strM40055);
                    sbM172410.append(EnumC17134.f50913.m38779());
                    sbM172410.append(C0249l.f1196b);
                    m26676(m26677(i, sbM172410.toString()));
                }
                iM45854 = i3;
            } else {
                C8537 c8537M34251 = c149510.m34251("", iArr2);
                StringBuilder sbM172411 = C7470.m17248(strM40055);
                sbM172411.append(EnumC17134.f50913.m38779());
                iM45854 = m45854(c8537M34251, sbM172411.toString(), i, i3);
            }
            C14959 c149511 = this.f62732;
            int[] iArr3 = c149511.f42728;
            if (iArr3 != null && iArr3.length != 0) {
                C8537 c8537M34253 = c149511.m34251("", iArr3);
                StringBuilder sbM172412 = C7470.m17248(strM40055);
                sbM172412.append(EnumC17134.f50921.m38779());
                m45854(c8537M34253, sbM172412.toString(), i, iM45854);
            } else if (c149511.f42736.m53551()) {
                StringBuilder sbM172413 = C7470.m17248(strM40055);
                sbM172413.append(EnumC17134.f50921.m38779());
                sbM172413.append(C0249l.f1196b);
                m26676(m26677(i, sbM172413.toString()));
            }
        }
        if (this.f62733 == null && this.f62732 == null) {
            return false;
        }
        return z4;
    }
}
