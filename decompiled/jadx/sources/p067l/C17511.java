package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6OD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17511 {

    /* JADX INFO: renamed from: ֫ */
    public final String f52349;

    /* JADX INFO: renamed from: ۜ */
    public final C2759 f52350;

    /* JADX INFO: renamed from: ۡ */
    public final String f52351;

    /* JADX INFO: renamed from: ۢ */
    public final C20438 f52352;

    /* JADX INFO: renamed from: ۧ */
    public int f52353;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f52354;

    /* JADX INFO: renamed from: ܽ */
    public boolean f52355;

    /* JADX INFO: renamed from: ܿ */
    public int f52356 = -1;

    /* JADX INFO: renamed from: ᩳ */
    public int f52357 = -1;

    /* JADX INFO: renamed from: ᩷ */
    public final String f52358;

    /* JADX INFO: renamed from: ᩻ */
    public int f52359;

    public C17511(C2759 c2759, C5660 c5660, C20651 c20651, boolean z, C20438 c20438) {
        String string;
        char cCharAt;
        this.f52350 = c2759;
        this.f52354 = z;
        if (c5660.m12610()) {
            string = "\t";
        } else {
            int iMax = Math.max(0, c5660.m12609());
            if (iMax < 0) {
                throw new IllegalArgumentException(C20778.m46922(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C19768.m44906(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i = 0; i < iMax; i++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f52351 = string;
        this.f52349 = c20651.m46664();
        String strM46665 = "\n";
        if (!z) {
            if (c20651.m46665().isEmpty()) {
                CharSequence charSequence = c2759.f4645;
                for (int i2 = 0; i2 < charSequence.length() && (cCharAt = charSequence.charAt(i2)) != '\n'; i2++) {
                    if (cCharAt == '\r') {
                        int i3 = i2 + 1;
                        if (i3 >= charSequence.length() || charSequence.charAt(i3) != '\n') {
                            strM46665 = "\r";
                            break;
                        } else {
                            strM46665 = "\r\n";
                            break;
                        }
                    }
                }
            } else {
                strM46665 = c20651.m46665();
            }
        }
        this.f52358 = strM46665;
        this.f52352 = c20438;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m39887() throws Throwable {
        ArrayList arrayList;
        C2759 c2759;
        C2759 c27510;
        CharSequence charSequence;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        byte b;
        C19524 c19524;
        int i4;
        int type;
        C2759 c27511 = this.f52350;
        CharSequence charSequence2 = c27511.f4645;
        ArrayList arrayList2 = c27511.f4644;
        InterfaceC2808 interfaceC2808 = null;
        int i5 = 0;
        int iMo4433 = 0;
        boolean zM23617 = false;
        while (i5 < arrayList2.size()) {
            C20195.m45697();
            InterfaceC2808 interfaceC2809 = (InterfaceC2808) arrayList2.get(i5);
            this.f52359 += c27511.f4650[i5];
            int type2 = interfaceC2809.getType();
            if (type2 == 141) {
                arrayList = arrayList2;
                c2759 = c27511;
            } else {
                int iMo4434 = interfaceC2809.mo4434();
                String strM10523 = C4965.m10523(iMo4433, iMo4434, charSequence2);
                C20438 c20438 = this.f52352;
                if (type2 == -1) {
                    if (c27511.m4328(i5, 16)) {
                        c20438.append((CharSequence) strM10523);
                        return;
                    }
                    return;
                }
                boolean z3 = this.f52354;
                if (z3 && c27511.m4328(i5, 8)) {
                    zM23617 |= C10136.m23617(strM10523);
                    iMo4433 = interfaceC2809.mo4433() + 1;
                } else {
                    boolean z4 = type2 == 3 || type2 == 4 || type2 == 1 || type2 == 2;
                    if (z3 && z4 && !c27511.m4328(i5, 16)) {
                        String text = interfaceC2809.getText();
                        if (!text.startsWith("#!") && !text.startsWith("/*!") && !text.startsWith("///") && !text.contains("@license") && !text.contains("@preserve") && !text.contains("@copyright") && !text.contains("@ts-") && !text.contains("#__PURE__") && !text.contains("@__PURE__") && !text.contains("sourceURL=")) {
                            if (c27511.m4328(i5, 32)) {
                                m39885(this.f52359);
                            }
                            zM23617 |= C10136.m23617(strM10523) || C10136.m23617(interfaceC2809.getText());
                            iMo4433 = interfaceC2809.mo4433() + 1;
                        }
                    }
                    if (interfaceC2808 == null) {
                        if (c27511.m4328(i5, 16)) {
                            c20438.append((CharSequence) strM10523);
                        } else if (!z3) {
                            c20438.append((CharSequence) this.f52349);
                        }
                    } else if (c27511.m4328(i5, 16) || c27511.m4328(i5, 64)) {
                        c20438.append((CharSequence) strM10523);
                    } else {
                        boolean z5 = zM23617 || C10136.m23617(strM10523);
                        int type3 = interfaceC2808.getType();
                        if (type3 == 3 || type3 == 1 || type3 == 2) {
                            c27510 = c27511;
                            charSequence = charSequence2;
                            arrayList = arrayList2;
                            i = i5;
                            i2 = type2;
                            i3 = iMo4434;
                            z = z3;
                            m39885(this.f52359);
                        } else {
                            if (z3 || !z4) {
                                if (z3 || c27511.m4324(i5) != 2) {
                                    if (z3) {
                                        if (!z5 || c27511.m4328(interfaceC2808.mo4432(), 4) || interfaceC2809.getType() == 92) {
                                            i2 = type2;
                                            z = z3;
                                        } else {
                                            String text2 = interfaceC2808.getText();
                                            int iM4331 = c27511.m4331(interfaceC2808.mo4432());
                                            if (iM4331 >= 0) {
                                                i2 = type2;
                                                z = z3;
                                                boolean z6 = ((InterfaceC2808) arrayList2.get(iM4331)).getType() == 98 || ((InterfaceC2808) arrayList2.get(iM4331)).getType() == 97;
                                                if ((text2.equals("yield") || (c19524 = c27511.f4647) == null || c19524.m44361(interfaceC2808.mo4434())) && !z6 && (text2.equals("return") || text2.equals("throw") || text2.equals("yield") || text2.equals("break") || text2.equals("continue") || text2.equals("async"))) {
                                                    m39885(this.f52359);
                                                }
                                            } else {
                                                i2 = type2;
                                                z = z3;
                                            }
                                            if (text2.equals("yield")) {
                                                m39885(this.f52359);
                                            } else {
                                                m39885(this.f52359);
                                            }
                                        }
                                        if (!c27511.m4328(interfaceC2808.mo4432(), 4) && c27511.m4324(i5) != 3 && C10136.m23618(interfaceC2808, interfaceC2809)) {
                                            m39886();
                                        }
                                    } else {
                                        i2 = type2;
                                        z = z3;
                                        if (c27511.m4324(i5) == 1) {
                                            m39886();
                                        } else if (c27511.m4324(i5) != 3) {
                                            String text3 = interfaceC2808.getText();
                                            String text4 = interfaceC2809.getText();
                                            int iM4332 = c27511.m4331(interfaceC2808.mo4432());
                                            c27510 = c27511;
                                            if (iM4332 >= 0) {
                                                i = i5;
                                                charSequence = charSequence2;
                                                if ((((InterfaceC2808) arrayList2.get(iM4332)).getType() == 98 || ((InterfaceC2808) arrayList2.get(iM4332)).getType() == 97) && (text4.equals("[") || text4.equals(MotionUtils.EASING_TYPE_FORMAT_START))) {
                                                    arrayList = arrayList2;
                                                    i3 = iMo4434;
                                                    z2 = false;
                                                }
                                                if (z2) {
                                                    m39886();
                                                }
                                            } else {
                                                charSequence = charSequence2;
                                                i = i5;
                                            }
                                            if ((!text3.equals("*") || iM4332 < 0 || ((InterfaceC2808) arrayList2.get(iM4332)).getType() != 23) && !C10136.m23618(interfaceC2808, interfaceC2809) && !text3.equals("=") && !text4.equals("=")) {
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
                                                        if (!text3.equals(C0655am.f2344e)) {
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
                                                        if (!text3.equals(C0249l.f1198d) || !C10136.m23616(text4.charAt(0))) {
                                                            if (text4.equals(",") || text4.equals(C0249l.f1196b)) {
                                                                arrayList = arrayList2;
                                                            } else {
                                                                arrayList = arrayList2;
                                                                if (!text4.equals(MotionUtils.EASING_TYPE_FORMAT_END) && !text4.equals("]") && !text4.equals(".")) {
                                                                    i3 = iMo4434;
                                                                    if (!text4.equals("?.") && !text3.equals(".") && !text3.equals("?.") && !text3.equals(MotionUtils.EASING_TYPE_FORMAT_START) && !text3.equals("[") && !text4.equals(":") && (!text4.equals("[") || text3.equals("return") || text3.equals("throw") || text3.equals("yield"))) {
                                                                        if (!text3.equals(":") && !text3.equals(",") && !text3.equals(C0249l.f1196b) && !text3.equals("=>") && !text4.equals("=>")) {
                                                                            if (text4.equals(MotionUtils.EASING_TYPE_FORMAT_START)) {
                                                                                switch (text3) {
                                                                                }
                                                                            } else if (text4.equals("{")) {
                                                                                z2 = !text3.equals("${");
                                                                                break;
                                                                            } else if ((!text3.equals(C0249l.f1198d) || (!text4.equals("else") && !text4.equals("catch") && !text4.equals("finally"))) && !text3.equals("=") && !text4.equals("=") && !text3.equals("?") && !text4.equals("?") && !text3.equals("|") && !text4.equals("|") && !text3.equals(C0233a.f1084p) && !text4.equals(C0233a.f1084p) && !text3.equals("return") && !text3.equals("throw") && !text3.equals("yield") && !text3.equals("new")) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                z2 = false;
                                                            }
                                                            i3 = iMo4434;
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
                                                        i3 = iMo4434;
                                                        z2 = true;
                                                        break;
                                                }
                                            } else {
                                                arrayList = arrayList2;
                                                i3 = iMo4434;
                                                z2 = true;
                                            }
                                            if (z2) {
                                                m39886();
                                            }
                                        }
                                    }
                                    c27510 = c27511;
                                    charSequence = charSequence2;
                                    arrayList = arrayList2;
                                    i = i5;
                                    i3 = iMo4434;
                                }
                            } else if (type2 == 4) {
                                if (i5 >= this.f52356) {
                                    this.f52357 = c27511.m4331(i5);
                                    this.f52356 = c27511.m4329(i5);
                                    int i6 = this.f52359;
                                    int i7 = i5 + 1;
                                    while (true) {
                                        int i8 = this.f52356;
                                        if (i7 <= i8) {
                                            i6 += c27511.f4650[i7];
                                            i7++;
                                        } else {
                                            this.f52355 = c27511.m4330(this.f52357, i8);
                                            this.f52353 = Math.max(this.f52359, i6);
                                        }
                                    }
                                }
                                if (!this.f52355 && !c27511.m4328(this.f52356, 80)) {
                                    if (!C10136.m23617(interfaceC2809.getText()) && c27511.m4324(this.f52356) != 2 && (i4 = this.f52357) >= 0 && (type = ((InterfaceC2808) arrayList2.get(i4)).getType()) != 87 && type != 89 && type != 91 && type != 99 && type != 135) {
                                        switch (type) {
                                            case 93:
                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                            case 95:
                                                break;
                                            default:
                                                if (!z5) {
                                                    m39886();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                    m39885(this.f52353);
                                } else if (!z5) {
                                    m39886();
                                }
                            } else if (!z5) {
                                m39886();
                            }
                            m39885(this.f52359);
                        }
                        charSequence2 = charSequence;
                        c20438.m46122(i3, interfaceC2809.mo4433() + 1, charSequence2);
                        if (z) {
                            c2759 = c27510;
                            i5 = i;
                            if (c2759.m4328(i5, 4) && i2 != 93) {
                                c20438.append(';');
                            }
                        } else {
                            c2759 = c27510;
                            i5 = i;
                        }
                        iMo4433 = interfaceC2809.mo4433() + 1;
                        interfaceC2808 = interfaceC2809;
                        zM23617 = false;
                    }
                    c27510 = c27511;
                    charSequence = charSequence2;
                    arrayList = arrayList2;
                    i = i5;
                    i2 = type2;
                    i3 = iMo4434;
                    z = z3;
                    charSequence2 = charSequence;
                    c20438.m46122(i3, interfaceC2809.mo4433() + 1, charSequence2);
                    if (z) {
                        c2759 = c27510;
                        i5 = i;
                        if (c2759.m4328(i5, 4)) {
                            c20438.append(';');
                        }
                    } else {
                        c2759 = c27510;
                        i5 = i;
                    }
                    iMo4433 = interfaceC2809.mo4433() + 1;
                    interfaceC2808 = interfaceC2809;
                    zM23617 = false;
                }
                arrayList = arrayList2;
                c2759 = c27511;
            }
            i5++;
            c27511 = c2759;
            arrayList2 = arrayList;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m39886() throws Throwable {
        char cCharAt;
        C20438 c20438 = this.f52352;
        if (c20438.length() == 0 || (cCharAt = c20438.charAt(c20438.length() - 1)) == ' ' || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r') {
            return;
        }
        c20438.append(' ');
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39885(int i) {
        String str = this.f52358;
        C20438 c20438 = this.f52352;
        c20438.append((CharSequence) str);
        if (this.f52354) {
            return;
        }
        c20438.append((CharSequence) this.f52349);
        int iMax = Math.max(0, i);
        if (iMax < 0) {
            throw new IllegalArgumentException(C20778.m46922(iMax, "count is negative: "));
        }
        String string = this.f52351;
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
        c20438.append((CharSequence) string);
    }
}
