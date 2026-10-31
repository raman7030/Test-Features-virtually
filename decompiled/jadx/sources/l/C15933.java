package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6OD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15933 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f49202;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C0411 f49203;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f49204;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C19012 f49205;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f49206;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f49207;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f49208;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f49209 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f49210 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f49211;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f49212;

    public C15933(C0411 c0411, C3463 c3463, C19237 c19237, boolean z, C19012 c19012) {
        String string;
        char cCharAt;
        this.f49203 = c0411;
        this.f49207 = z;
        if (c3463.m10602()) {
            string = "\t";
        } else {
            int iMax = Math.max(0, c3463.m10601());
            if (iMax < 0) {
                throw new IllegalArgumentException(C19370.m44628(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C18307.m42645(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i = 0; i < iMax; i++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f49204 = string;
        this.f49202 = c19237.m44370();
        String strM44371 = "\n";
        if (!z) {
            if (c19237.m44371().isEmpty()) {
                CharSequence charSequence = c0411.f1868;
                for (int i2 = 0; i2 < charSequence.length() && (cCharAt = charSequence.charAt(i2)) != '\n'; i2++) {
                    if (cCharAt == '\r') {
                        int i3 = i2 + 1;
                        if (i3 >= charSequence.length() || charSequence.charAt(i3) != '\n') {
                            strM44371 = "\r";
                            break;
                        } else {
                            strM44371 = "\r\n";
                            break;
                        }
                    }
                }
            } else {
                strM44371 = c19237.m44371();
            }
        }
        this.f49211 = strM44371;
        this.f49205 = c19012;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:127:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:251:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:336:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:379:0x0548 A[PHI: r19 r20
      0x0548: PHI (r19v2 java.lang.CharSequence) = 
      (r19v6 java.lang.CharSequence)
      (r19v6 java.lang.CharSequence)
      (r19v9 java.lang.CharSequence)
      (r19v9 java.lang.CharSequence)
     binds: [B:259:0x03d4, B:261:0x03dc, B:193:0x0306, B:195:0x030c] A[DONT_GENERATE, DONT_INLINE]
      0x0548: PHI (r20v2 int) = (r20v6 int), (r20v6 int), (r20v7 int), (r20v7 int) binds: [B:259:0x03d4, B:261:0x03dc, B:193:0x0306, B:195:0x030c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:382:0x054e A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:385:0x0555  */
    /* JADX WARN: Code duplicated, block: B:390:0x0586  */
    /* JADX WARN: Code duplicated, block: B:395:0x059d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: switch over string: strings are not added: [[switch], [if], [for], [with], [catch], [while], [function]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37712() throws Throwable {
        ArrayList arrayList;
        C0411 c0411;
        C0411 c0412;
        CharSequence charSequence;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        byte b;
        C18051 c18051;
        int i4;
        int type;
        C0411 c0413 = this.f49203;
        CharSequence charSequence2 = c0413.f1868;
        ArrayList arrayList2 = c0413.f1867;
        InterfaceC0463 interfaceC0463 = null;
        int i5 = 0;
        int iMo2053 = 0;
        boolean zM21648 = false;
        while (i5 < arrayList2.size()) {
            C18757.m43430();
            InterfaceC0463 interfaceC0464 = (InterfaceC0463) arrayList2.get(i5);
            this.f49212 += c0413.f1873[i5];
            int type2 = interfaceC0464.getType();
            if (type2 == 141) {
                arrayList = arrayList2;
                c0411 = c0413;
            } else {
                int iMo2054 = interfaceC0464.mo2054();
                String strM8476 = C2732.m8476(iMo2053, iMo2054, charSequence2);
                C19012 c19012 = this.f49205;
                if (type2 == -1) {
                    if (c0413.m1936(i5, 16)) {
                        c19012.append((CharSequence) strM8476);
                        return;
                    }
                    return;
                }
                boolean z3 = this.f49207;
                if (z3 && c0413.m1936(i5, 8)) {
                    zM21648 |= C8173.m21648(strM8476);
                    iMo2053 = interfaceC0464.mo2053() + 1;
                } else {
                    boolean z4 = type2 == 3 || type2 == 4 || type2 == 1 || type2 == 2;
                    if (z3 && z4 && !c0413.m1936(i5, 16)) {
                        String text = interfaceC0464.getText();
                        if (!text.startsWith("#!") && !text.startsWith("/*!") && !text.startsWith("///") && !text.contains("@license") && !text.contains("@preserve") && !text.contains("@copyright") && !text.contains("@ts-") && !text.contains("#__PURE__") && !text.contains("@__PURE__") && !text.contains("sourceURL=")) {
                            if (c0413.m1936(i5, 32)) {
                                m37710(this.f49212);
                            }
                            zM21648 |= C8173.m21648(strM8476) || C8173.m21648(interfaceC0464.getText());
                            iMo2053 = interfaceC0464.mo2053() + 1;
                        }
                    }
                    if (interfaceC0463 == null) {
                        if (c0413.m1936(i5, 16)) {
                            c19012.append((CharSequence) strM8476);
                        } else if (!z3) {
                            c19012.append((CharSequence) this.f49202);
                        }
                    } else if (c0413.m1936(i5, 16) || c0413.m1936(i5, 64)) {
                        c19012.append((CharSequence) strM8476);
                    } else {
                        boolean z5 = zM21648 || C8173.m21648(strM8476);
                        int type3 = interfaceC0463.getType();
                        if (type3 == 3 || type3 == 1 || type3 == 2) {
                            c0412 = c0413;
                            charSequence = charSequence2;
                            arrayList = arrayList2;
                            i = i5;
                            i2 = type2;
                            i3 = iMo2054;
                            z = z3;
                            m37710(this.f49212);
                        } else {
                            if (z3 || !z4) {
                                if (z3 || c0413.m1932(i5) != 2) {
                                    if (z3) {
                                        if (!z5 || c0413.m1936(interfaceC0463.mo2052(), 4) || interfaceC0464.getType() == 92) {
                                            i2 = type2;
                                            z = z3;
                                        } else {
                                            String text2 = interfaceC0463.getText();
                                            int iM1939 = c0413.m1939(interfaceC0463.mo2052());
                                            if (iM1939 >= 0) {
                                                i2 = type2;
                                                z = z3;
                                                boolean z6 = ((InterfaceC0463) arrayList2.get(iM1939)).getType() == 98 || ((InterfaceC0463) arrayList2.get(iM1939)).getType() == 97;
                                                if ((text2.equals("yield") || (c18051 = c0413.f1870) == null || c18051.m42110(interfaceC0463.mo2054())) && !z6 && (text2.equals("return") || text2.equals("throw") || text2.equals("yield") || text2.equals("break") || text2.equals("continue") || text2.equals("async"))) {
                                                    m37710(this.f49212);
                                                }
                                            } else {
                                                i2 = type2;
                                                z = z3;
                                            }
                                            if (text2.equals("yield")) {
                                                m37710(this.f49212);
                                            } else {
                                                m37710(this.f49212);
                                            }
                                        }
                                        if (!c0413.m1936(interfaceC0463.mo2052(), 4) && c0413.m1932(i5) != 3 && C8173.m21649(interfaceC0463, interfaceC0464)) {
                                            m37711();
                                        }
                                    } else {
                                        i2 = type2;
                                        z = z3;
                                        if (c0413.m1932(i5) == 1) {
                                            m37711();
                                        } else if (c0413.m1932(i5) != 3) {
                                            String text3 = interfaceC0463.getText();
                                            String text4 = interfaceC0464.getText();
                                            int iM19310 = c0413.m1939(interfaceC0463.mo2052());
                                            c0412 = c0413;
                                            if (iM19310 >= 0) {
                                                i = i5;
                                                charSequence = charSequence2;
                                                if ((((InterfaceC0463) arrayList2.get(iM19310)).getType() == 98 || ((InterfaceC0463) arrayList2.get(iM19310)).getType() == 97) && (text4.equals("[") || text4.equals(MotionUtils.EASING_TYPE_FORMAT_START))) {
                                                    arrayList = arrayList2;
                                                    i3 = iMo2054;
                                                    z2 = false;
                                                }
                                                if (z2) {
                                                    m37711();
                                                }
                                            } else {
                                                charSequence = charSequence2;
                                                i = i5;
                                            }
                                            if ((!text3.equals("*") || iM19310 < 0 || ((InterfaceC0463) arrayList2.get(iM19310)).getType() != 23) && !C8173.m21649(interfaceC0463, interfaceC0464) && !text3.equals("=") && !text4.equals("=")) {
                                                switch (text3.hashCode()) {
                                                    case -1458301887:
                                                        if (!text3.equals("satisfies")) {
                                                            b = -1;
                                                        } else {
                                                            b = 0;
                                                        }
                                                        break;
                                                    case -1305664359:
                                                        if (!text3.equals("extends")) {
                                                            b = -1;
                                                        } else {
                                                            b = 1;
                                                        }
                                                        break;
                                                    case -1184795739:
                                                        if (!text3.equals("import")) {
                                                            b = -1;
                                                        } else {
                                                            b = 2;
                                                        }
                                                        break;
                                                    case -1068784020:
                                                        if (!text3.equals(am.e)) {
                                                            b = -1;
                                                        } else {
                                                            b = 3;
                                                        }
                                                        break;
                                                    case 3122:
                                                        if (!text3.equals("as")) {
                                                            b = -1;
                                                        } else {
                                                            b = 4;
                                                        }
                                                        break;
                                                    case 3365:
                                                        if (!text3.equals("in")) {
                                                            b = -1;
                                                        } else {
                                                            b = 5;
                                                        }
                                                        break;
                                                    case 3543:
                                                        if (!text3.equals("of")) {
                                                            b = -1;
                                                        } else {
                                                            b = 6;
                                                        }
                                                        break;
                                                    case 3046192:
                                                        if (!text3.equals("case")) {
                                                            b = -1;
                                                        } else {
                                                            b = 7;
                                                        }
                                                        break;
                                                    case 3151786:
                                                        if (!text3.equals("from")) {
                                                            b = -1;
                                                        } else {
                                                            b = 8;
                                                        }
                                                        break;
                                                    default:
                                                        b = -1;
                                                        break;
                                                }
                                                switch (b) {
                                                    default:
                                                        if (!text3.equals(l.d) || !C8173.m21647(text4.charAt(0))) {
                                                            if (text4.equals(",") || text4.equals(l.b)) {
                                                                arrayList = arrayList2;
                                                            } else {
                                                                arrayList = arrayList2;
                                                                if (!text4.equals(MotionUtils.EASING_TYPE_FORMAT_END) && !text4.equals("]") && !text4.equals(".")) {
                                                                    i3 = iMo2054;
                                                                    if (!text4.equals("?.") && !text3.equals(".") && !text3.equals("?.") && !text3.equals(MotionUtils.EASING_TYPE_FORMAT_START) && !text3.equals("[") && !text4.equals(":") && (!text4.equals("[") || text3.equals("return") || text3.equals("throw") || text3.equals("yield"))) {
                                                                        if (!text3.equals(":") && !text3.equals(",") && !text3.equals(l.b) && !text3.equals("=>") && !text4.equals("=>")) {
                                                                            if (text4.equals(MotionUtils.EASING_TYPE_FORMAT_START)) {
                                                                                switch (text3) {
                                                                                }
                                                                            } else if (text4.equals("{")) {
                                                                                z2 = !text3.equals("${");
                                                                                break;
                                                                            } else if ((!text3.equals(l.d) || (!text4.equals("else") && !text4.equals("catch") && !text4.equals("finally"))) && !text3.equals("=") && !text4.equals("=") && !text3.equals("?") && !text4.equals("?") && !text3.equals("|") && !text4.equals("|") && !text3.equals(a.p) && !text4.equals(a.p) && !text3.equals("return") && !text3.equals("throw") && !text3.equals("yield") && !text3.equals("new")) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                z2 = false;
                                                            }
                                                            i3 = iMo2054;
                                                            z2 = false;
                                                            break;
                                                        }
                                                        z2 = true;
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                        arrayList = arrayList2;
                                                        i3 = iMo2054;
                                                        z2 = true;
                                                        break;
                                                }
                                            } else {
                                                arrayList = arrayList2;
                                                i3 = iMo2054;
                                                z2 = true;
                                            }
                                            if (z2) {
                                                m37711();
                                            }
                                        }
                                    }
                                    c0412 = c0413;
                                    charSequence = charSequence2;
                                    arrayList = arrayList2;
                                    i = i5;
                                    i3 = iMo2054;
                                }
                            } else if (type2 == 4) {
                                if (i5 >= this.f49209) {
                                    this.f49210 = c0413.m1939(i5);
                                    this.f49209 = c0413.m1937(i5);
                                    int i6 = this.f49212;
                                    int i7 = i5 + 1;
                                    while (true) {
                                        int i8 = this.f49209;
                                        if (i7 <= i8) {
                                            i6 += c0413.f1873[i7];
                                            i7++;
                                        } else {
                                            this.f49208 = c0413.m1938(this.f49210, i8);
                                            this.f49206 = Math.max(this.f49212, i6);
                                        }
                                    }
                                }
                                if (!this.f49208 && !c0413.m1936(this.f49209, 80)) {
                                    if (!C8173.m21648(interfaceC0464.getText()) && c0413.m1932(this.f49209) != 2 && (i4 = this.f49210) >= 0 && (type = ((InterfaceC0463) arrayList2.get(i4)).getType()) != 87 && type != 89 && type != 91 && type != 99 && type != 135) {
                                        switch (type) {
                                            case 93:
                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                            case 95:
                                                break;
                                            default:
                                                if (!z5) {
                                                    m37711();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                    m37710(this.f49206);
                                } else if (!z5) {
                                    m37711();
                                }
                            } else if (!z5) {
                                m37711();
                            }
                            m37710(this.f49212);
                        }
                        charSequence2 = charSequence;
                        c19012.m43854(i3, interfaceC0464.mo2053() + 1, charSequence2);
                        if (z) {
                            c0411 = c0412;
                            i5 = i;
                            if (c0411.m1936(i5, 4) && i2 != 93) {
                                c19012.append(';');
                            }
                        } else {
                            c0411 = c0412;
                            i5 = i;
                        }
                        iMo2053 = interfaceC0464.mo2053() + 1;
                        interfaceC0463 = interfaceC0464;
                        zM21648 = false;
                    }
                    c0412 = c0413;
                    charSequence = charSequence2;
                    arrayList = arrayList2;
                    i = i5;
                    i2 = type2;
                    i3 = iMo2054;
                    z = z3;
                    charSequence2 = charSequence;
                    c19012.m43854(i3, interfaceC0464.mo2053() + 1, charSequence2);
                    if (z) {
                        c0411 = c0412;
                        i5 = i;
                        if (c0411.m1936(i5, 4)) {
                            c19012.append(';');
                        }
                    } else {
                        c0411 = c0412;
                        i5 = i;
                    }
                    iMo2053 = interfaceC0464.mo2053() + 1;
                    interfaceC0463 = interfaceC0464;
                    zM21648 = false;
                }
                arrayList = arrayList2;
                c0411 = c0413;
            }
            i5++;
            c0413 = c0411;
            arrayList2 = arrayList;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m37711() throws Throwable {
        char cCharAt;
        C19012 c19012 = this.f49205;
        if (c19012.length() == 0 || (cCharAt = c19012.charAt(c19012.length() - 1)) == ' ' || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r') {
            return;
        }
        c19012.append(' ');
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37710(int i) {
        String str = this.f49211;
        C19012 c19012 = this.f49205;
        c19012.append((CharSequence) str);
        if (this.f49207) {
            return;
        }
        c19012.append((CharSequence) this.f49202);
        int iMax = Math.max(0, i);
        if (iMax < 0) {
            throw new IllegalArgumentException(C19370.m44628(iMax, "count is negative: "));
        }
        String string = this.f49204;
        int length = string.length();
        if (iMax == 0 || length == 0) {
            string = "";
        } else if (iMax != 1) {
            if (string.length() > Integer.MAX_VALUE / iMax) {
                throw new OutOfMemoryError("Repeating " + string.length() + " bytes String " + iMax + " times will produce a String exceeding maximum size.");
            }
            StringBuilder sb = new StringBuilder(length * iMax);
            for (int i2 = 0; i2 < iMax; i2++) {
                sb.append(string);
            }
            string = sb.toString();
        }
        c19012.append((CharSequence) string);
    }
}
