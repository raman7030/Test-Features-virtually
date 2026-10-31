package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V7EY */
/* JADX INFO: loaded from: classes5.dex */
public final class C18873 extends AbstractC11817 {

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59494;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59495;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public short f59496;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public boolean f59497;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59498;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C20826 f59499;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59500;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59501;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59502;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public C13248 f59503;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59504;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59505;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f59506;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m43593(int i) {
        int i2 = i;
        this.f59506 = i2;
        C20826 c20826 = this.f59499;
        C17503 c17503 = (C17503) this.f35257;
        boolean z = c17503.f29354;
        boolean z2 = c17503.f29342;
        boolean z3 = z || z2;
        boolean z4 = z && z2;
        if (z3 && this.f59496 != 0) {
            m24653(1);
            if (z4) {
                String strM47639 = c20826.m47639(this.f59496);
                StringBuilder sb = new StringBuilder("// ");
                sb.append((int) this.f59496);
                sb.append(strM47639 != null ? "# ".concat(strM47639) : "");
                m24665(sb.toString());
            } else {
                C17503 c17504 = (C17503) this.f35257;
                if (c17504.f29354) {
                    m24659("// %d#", Short.valueOf(this.f59496));
                } else if (c17504.f29342) {
                    String strM476310 = c20826.m47639(this.f59496);
                    m24665(strM476310 != null ? "// ".concat(strM476310) : "");
                }
            }
            m24664(1);
        }
        ArrayList<C23126> arrayList = this.f59502;
        boolean z5 = this.f29343;
        boolean z6 = this.f29326;
        int i3 = 18;
        if (arrayList != null) {
            for (C23126 c23126 : arrayList) {
                m24654(m24663(i2, m24657(18, EnumC15536.f47699.m36618())));
                if (!z6) {
                    m24666("%s %s;", c23126.m51311(), ((C17503) this.f35257).f35264.m25960(c23126.f74368));
                } else if (z5) {
                    m24666("%s #%d;", c23126.m51311(), Integer.valueOf(c23126.f74368));
                } else {
                    String strM51311 = c23126.m51311();
                    int i4 = c23126.f74368;
                    m24654(m24657(this.f29349 - 18, String.format("%s #%d;", strM51311, Integer.valueOf(i4))));
                    StringBuilder sb2 = new StringBuilder(" // ");
                    sb2.append(i4 == 0 ? "any" : ((C17503) this.f35257).f35264.m25960(i4));
                    m24662(sb2.toString());
                }
            }
        }
        if (this.f59494 != null) {
            m24654(m24663(i2, m24657(18, EnumC15536.f47483.m36618())));
            m24662(((String) C5378.stream(this.f59494).map(new C16049()).collect(C22976.joining(", "))) + l.b);
        }
        ArrayList arrayList2 = this.f59495;
        boolean z7 = this.f29347;
        if (arrayList2 != null && !z7) {
            for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
                C21695 c21695 = (C21695) it.next();
                m24654(m24663(i2, m24657(i3, EnumC15536.f47800.m36618())));
                if (!z6) {
                    m24666("%d %s:%s;", Short.valueOf(c21695.f47013), ((C17503) this.f35257).f35264.getName(c21695.f47014), ((C17503) this.f35257).f35264.getName(c21695.f47011));
                } else if (z5) {
                    m24666("%d #%d:#%d;", Short.valueOf(c21695.f47013), Short.valueOf(c21695.f47014), Short.valueOf(c21695.f47011));
                } else {
                    short s = c21695.f47013;
                    short s2 = c21695.f47011;
                    short s3 = c21695.f47014;
                    m24654(m24657(this.f29349 - 18, String.format("%d #%d:#%d;", Short.valueOf(s), Short.valueOf(s3), Short.valueOf(s2))));
                    m24666(" // %s:%s", ((C17503) this.f35257).f35264.getName(s3), ((C17503) this.f35257).f35264.getName(s2));
                }
                i3 = 18;
            }
        }
        ArrayList<C22400> arrayList3 = this.f59498;
        if (arrayList3 == null || z7) {
            return;
        }
        for (C22400 c22400 : arrayList3) {
            m24654(m24663(i2, m24657(18, EnumC15536.f47591.m36618())));
            if (!z6) {
                m24666("%d %s:%s;", Short.valueOf(c22400.f47013), ((C17503) this.f35257).f35264.getName(c22400.f47014), ((C17503) this.f35257).f35264.getName(c22400.f47011));
            } else if (z5) {
                m24666("%d #%d:#%d;", Short.valueOf(c22400.f47013), Short.valueOf(c22400.f47014), Short.valueOf(c22400.f47011));
            } else {
                short s4 = c22400.f47013;
                short s5 = c22400.f47011;
                short s6 = c22400.f47014;
                m24654(m24657(this.f29349 - 18, String.format("%d #%d:#%d;", Short.valueOf(s4), Short.valueOf(s6), Short.valueOf(s5))));
                m24666(" // %s:%s", ((C17503) this.f35257).f35264.getName(s6), ((C17503) this.f35257).f35264.getName(s5));
            }
            i2 = i;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m43592(int i) {
        ArrayList arrayList = this.f59501;
        boolean z = this.f29347;
        if (arrayList != null && !z) {
            m24654(m24663(i, m24657(18, EnumC15536.f47538.m36618())));
            m24662(((String) C5378.stream(this.f59501).map(new C2645()).collect(C22976.joining(","))) + l.b);
        }
        if (this.f59500 != null && !z) {
            m24654(m24663(i, m24657(18, EnumC15536.f47517.m36618())));
            m24662(((String) C5378.stream(this.f59500).map(new C4056()).collect(C22976.joining(","))) + l.b);
        }
        if (this.f59505 != null) {
            m24654(m24663(i, m24657(18, EnumC15536.f47780.m36618())));
            m24662(((String) C5378.stream(this.f59505).map(new C16049()).collect(C22976.joining(","))) + l.b);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m43591(int i) {
        C13248 c13248;
        if (this.f29347 || ((c13248 = this.f59503) == null && this.f59504 == null)) {
            return false;
        }
        if (c13248 != null) {
            if (c13248.m32155()) {
                return m43590(i);
            }
            m43589(i);
            return true;
        }
        if (((C13248) this.f59504.get(0)).m32155()) {
            return m43590(i);
        }
        m43589(i);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m43588(C6491 c6491, String str, int i, int i2) {
        boolean z = ((String) c6491.f20042).isEmpty() && ((String) c6491.f20043).isEmpty();
        StringBuilder sbM15339 = C5368.m15339(str);
        sbM15339.append(z ? l.b : "");
        m24654(m24663(i, m24657(18, sbM15339.toString())));
        boolean z2 = this.f29343;
        boolean z3 = this.f29326;
        if (z3) {
            if (z2) {
                m24662((String) c6491.f20042);
            } else {
                m24654(m24657(i2, (String) c6491.f20042));
                i2 = Math.max(i2, ((String) c6491.f20042).length());
                if (!z) {
                    m24654(" // ");
                }
            }
        }
        if (z3 && (!z3 || z2)) {
            return i2;
        }
        m24662((String) c6491.f20043);
        return i2;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m43589(int i) {
        int i2 = this.f29349 - 18;
        m24661(18, EnumC15536.f47602.m36618() + l.b);
        if (this.f29326 && !this.f29343) {
            this.f29325.mo1968(m24657(i2, " "));
            m24662(" // offset " + this.f59503.f39673);
        } else {
            m24667();
        }
        C13248 c13248 = this.f59503;
        int iM43588 = m43588(c13248.m32152("", c13248.f39670), EnumC15536.f47781.m36618(), i, i2);
        C13248 c13249 = this.f59503;
        m43588(c13249.m32152("", c13249.f39664), EnumC15536.f47789.m36618(), i, iM43588);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private boolean m43590(int i) {
        int i2;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        boolean z4;
        String strM37867;
        String str3;
        int i3;
        int iM43588;
        int i4;
        String str4;
        boolean z5;
        String str5;
        int i5;
        int i6 = this.f29349 - 18;
        boolean z6 = this.f59504 != null;
        String strM36618 = EnumC15536.f47569.m36618();
        String str6 = " ";
        boolean z7 = this.f29343;
        boolean z8 = this.f29326;
        String str7 = AbstractC9701.f29321;
        if (z6) {
            int i7 = 0;
            strM37867 = "";
            String strM37868 = str7;
            while (i7 < this.f59504.size()) {
                C13248 c13248 = (C13248) this.f59504.get(i7);
                if (i7 > 0) {
                    strM36618 = EnumC15536.f47760.m36618();
                    strM37868 = C16014.m37867(str7, str7);
                    strM37867 = str7;
                }
                boolean z9 = z6;
                String str8 = strM36618;
                m24661(18, strM37867 + strM36618);
                if (!z8 || z7) {
                    m24662(c13248.f39672.m51154() + l.b);
                } else {
                    this.f29325.mo1968(m24657(i6, c13248.f39672.m51154() + l.b));
                    m24662(" // " + EnumC15204.f46581.m35967() + str6 + c13248.f39660);
                }
                int[] iArr = c13248.f39674;
                int i8 = this.f29349 - 18;
                if (iArr == null || iArr.length <= 0) {
                    i4 = i6;
                    str4 = str6;
                    z7 = z7;
                    z5 = z8;
                    str5 = str7;
                    i5 = i7;
                } else {
                    int length = iArr.length - 1;
                    C6491 c6491M32153 = this.f59503.m32153(iArr);
                    str4 = str6;
                    i4 = i6;
                    String strConcat = ((String) C5378.stream((List) c6491M32153.f20042).collect(C22976.joining(", "))).concat(l.b);
                    i5 = i7;
                    String strConcat2 = ((String) C5378.stream((List) c6491M32153.f20043).collect(C22976.joining(", "))).concat(l.b);
                    StringBuilder sbM15339 = C5368.m15339(str7);
                    str5 = str7;
                    sbM15339.append(EnumC15536.f47701.m36618());
                    String strM24663 = m24663(i, m24657(18, sbM15339.toString()));
                    m24654(strM24663);
                    String strM24660 = m24660(strM24663.length());
                    if (z8) {
                        if (z7) {
                            m24662(strConcat);
                        } else {
                            if (length == 0) {
                                this.f29325.mo1968(m24657(i8, strConcat));
                                m24662(" // " + strConcat2);
                            } else {
                                this.f29325.mo1968(m24657(i8, ((String) ((List) c6491M32153.f20042).get(0)).concat(",")));
                                m24662(" // " + ((String) ((List) c6491M32153.f20043).get(0)).concat(","));
                                int i9 = 1;
                                while (i9 <= length) {
                                    String str9 = i9 == length ? l.b : ",";
                                    String strConcat3 = ((String) ((List) c6491M32153.f20042).get(i9)).concat(str9);
                                    String strConcat4 = ((String) ((List) c6491M32153.f20043).get(i9)).concat(str9);
                                    this.f29325.mo1968(strM24660);
                                    this.f29325.mo1968(m24657(i8, strConcat3));
                                    m24662(" // " + strConcat4);
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
                            m24662(strConcat2);
                        } else {
                            m24662(((String) ((List) c6491M32153.f20043).get(0)).concat(","));
                            int i10 = 1;
                            while (i10 <= length) {
                                String strConcat5 = ((String) ((List) c6491M32153.f20043).get(i10)).concat(i10 == length ? l.b : ",");
                                this.f29325.mo1968(strM24660);
                                m24662(strConcat5);
                                i10++;
                            }
                        }
                    }
                }
                if (iArr == null || iArr.length == 0) {
                    StringBuilder sbM153310 = C5368.m15339(strM37868);
                    sbM153310.append(EnumC15536.f47701.m36618());
                    sbM153310.append(l.b);
                    m24662(m24663(i, sbM153310.toString()));
                }
                m24654(m24663(this.f59506, ""));
                i7 = i5 + 1;
                z6 = z9;
                strM36618 = str8;
                strM37867 = strM37867;
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
            strM37867 = "";
        }
        String strM36619 = EnumC15536.f47569.m36618();
        if (this.f59503 != null) {
            if (z) {
                strM36619 = EnumC15536.f47760.m36618();
                str3 = str2;
                strM37867 = C16014.m37867(strM37867, str3);
            } else {
                str3 = str2;
            }
            String strM37869 = C16014.m37867(strM37867, str3);
            m24661(18, strM37867 + strM36619);
            if (!z3 || z2) {
                i3 = i2;
                m24662(this.f59503.f39672.m51154() + l.b);
            } else {
                i3 = i2;
                this.f29325.mo1968(m24657(i3, this.f59503.f39672.m51154() + l.b));
                m24662(" // " + EnumC15204.f46581.m35967() + str + this.f59503.f39660);
            }
            C13248 c13249 = this.f59503;
            int[] iArr2 = c13249.f39670;
            if (iArr2 == null || iArr2.length == 0) {
                if (c13249.f39672.m51156()) {
                    StringBuilder sbM153311 = C5368.m15339(strM37869);
                    sbM153311.append(EnumC15536.f47781.m36618());
                    sbM153311.append(l.b);
                    m24662(m24663(i, sbM153311.toString()));
                }
                iM43588 = i3;
            } else {
                C6491 c6491M32152 = c13249.m32152("", iArr2);
                StringBuilder sbM153312 = C5368.m15339(strM37869);
                sbM153312.append(EnumC15536.f47781.m36618());
                iM43588 = m43588(c6491M32152, sbM153312.toString(), i, i3);
            }
            C13248 c132410 = this.f59503;
            int[] iArr3 = c132410.f39664;
            if (iArr3 != null && iArr3.length != 0) {
                C6491 c6491M32154 = c132410.m32152("", iArr3);
                StringBuilder sbM153313 = C5368.m15339(strM37869);
                sbM153313.append(EnumC15536.f47789.m36618());
                m43588(c6491M32154, sbM153313.toString(), i, iM43588);
            } else if (c132410.f39672.m51158()) {
                StringBuilder sbM153314 = C5368.m15339(strM37869);
                sbM153314.append(EnumC15536.f47789.m36618());
                sbM153314.append(l.b);
                m24662(m24663(i, sbM153314.toString()));
            }
        }
        if (this.f59504 == null && this.f59503 == null) {
            return false;
        }
        return z4;
    }
}
