package p067l;

import com.umeng.commonsdk.statistics.C0795b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16491 implements InterfaceC8186 {
    /* JADX WARN: Code duplicated, block: B:113:0x0241  */
    /* JADX WARN: Code duplicated, block: B:115:0x0247  */
    /* JADX WARN: Code duplicated, block: B:117:0x0254  */
    /* JADX WARN: Code duplicated, block: B:120:0x0261 A[LOOP:3: B:116:0x0252->B:120:0x0261, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:221:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:224:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:226:0x03d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:232:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:233:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:236:0x0408  */
    /* JADX WARN: Code duplicated, block: B:255:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x025a A[SYNTHETIC] */
    @Override // p067l.InterfaceC8186
    /* JADX INFO: renamed from: ֫ */
    public final void mo6237(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        int iIntValue;
        Iterator it;
        int iIntValue2;
        C18344 c18344M44705;
        int i;
        String str;
        String str2;
        String strConcat;
        boolean z;
        C16332[] c16332Arr;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        int iM27008;
        int length;
        int i4;
        int i5;
        C6925 c6925M45905;
        Integer numValueOf;
        int iMo14722 = c20337.m45918().mo14722();
        int i6 = 1;
        c20337.m45913(true);
        C19964 c19964M46637 = c20635.m46637("parent");
        String str3 = "null";
        String str4 = "@";
        if (c19964M46637 != null) {
            String strM45304 = c19964M46637.m45304();
            if (!strM45304.startsWith("@")) {
                throw new C3870("Expected reference value", c19964M46637);
            }
            String strSubstring = strM45304.substring(1);
            if (strSubstring.equals("null")) {
                numValueOf = 0;
            } else {
                Integer numM30841 = C13551.m30841(strSubstring);
                if (numM30841 != null) {
                    numValueOf = numM30841;
                } else {
                    int iMo28183 = c12210.mo28183(iMo14722, strSubstring);
                    numValueOf = iMo28183 == -1 ? null : Integer.valueOf(iMo28183);
                }
            }
            if (numValueOf == null) {
                throw new C3870("Resource not found: @".concat(strSubstring), c19964M46637);
            }
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        c20337.m45904(iIntValue);
        C9091 c9091 = new C9091();
        Iterator itM46631 = C20635.m46631(c20635);
        while (itM46631.hasNext()) {
            C20635 c20636 = (C20635) itM46631.next();
            if (c20636.m46644().equals("item")) {
                C19964 c19964M46642 = c20636.m46642("name");
                String strM45305 = c19964M46642.m45304();
                Integer numM30842 = C13551.m30841(strM45305);
                C19015 c19015Mo28190 = c12210.mo28190();
                String[] strArrSplit = strM45305.split(":", 2);
                if (numM30842 != null) {
                    iIntValue2 = (numM30842.intValue() >>> 24) & 255;
                    it = itM46631;
                } else {
                    it = itM46631;
                    if (strArrSplit.length == 2) {
                        int iMo28184 = c12210.mo28184(strArrSplit[0]);
                        strM45305 = strArrSplit[i6];
                        iIntValue2 = iMo28184;
                    } else {
                        iIntValue2 = iMo14722;
                    }
                }
                if (numM30842 == null) {
                    Iterator it2 = c19015Mo28190.f56682.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            c18344M44705 = null;
                            break;
                        }
                        C19686 c19686 = (C19686) it2.next();
                        if (c19686.m44707() == iIntValue2) {
                            c18344M44705 = c19686.m44705(strM45305);
                            break;
                        }
                    }
                } else {
                    c18344M44705 = c19015Mo28190.m43191(numM30842.intValue());
                }
                if (c18344M44705 == null && iIntValue2 == i6) {
                    c18344M44705 = ((C19686) C12981.m29766().f56682.get(0)).m44705(strM45305);
                }
                if (c18344M44705 == null) {
                    throw new C3870("Unknown attr " + c19964M46642.m45304(), c19964M46642);
                }
                int i7 = c18344M44705.f54786;
                int i8 = c18344M44705.f54790;
                int i9 = i8 & 2;
                if (i9 == 0 || c20636.m46640()) {
                    C3199 c3199M46641 = c20636.m46641();
                    String strM5533 = c3199M46641.m5533();
                    if (strM5533.startsWith(str4)) {
                        c9091.f24648 = i6;
                        String strSubstring2 = strM5533.substring(i6);
                        if (strSubstring2.length() == 8 && C11774.m27005(strSubstring2)) {
                            c9091.f24647 = C11774.m27008(strSubstring2);
                        } else if (C13551.m30841(strSubstring2) != null) {
                            c9091.f24647 = C13551.m30841(strSubstring2).intValue();
                        } else if (strSubstring2.equals(str3)) {
                            c9091.f24647 = 0;
                        } else if (strSubstring2.equals(C0795b.f3347f)) {
                            c9091.f24647 = i6;
                            c9091.f24648 = 0;
                        } else {
                            int iMo28185 = c12210.mo28183(iMo14722, strSubstring2);
                            if (iMo28185 == -1) {
                                throw new C3870("Resource not found: ".concat(strSubstring2), c3199M46641);
                            }
                            c9091.f24647 = iMo28185;
                        }
                    } else {
                        if (strM5533.startsWith("?")) {
                            c9091.f24648 = 2;
                            String strSubstring3 = strM5533.substring(i6);
                            if (strSubstring3.length() == 8 && C11774.m27005(strSubstring3)) {
                                c9091.f24647 = C11774.m27008(strSubstring3);
                            } else if (C13551.m30841(strSubstring3) != null) {
                                c9091.f24647 = C13551.m30841(strSubstring3).intValue();
                            } else {
                                int iMo28186 = c12210.mo28183(iMo14722, strSubstring3);
                                if (iMo28186 == -1) {
                                    throw new C3870("Resource not found: ".concat(strSubstring3), c3199M46641);
                                }
                                c9091.f24647 = iMo28186;
                            }
                        } else {
                            C16332[] c16332Arr2 = c18344M44705.f54789;
                            if ((65536 & i8) != 0) {
                                int length2 = c16332Arr2.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 < length2) {
                                        C16332 c16332 = c16332Arr2[i10];
                                        i = iMo14722;
                                        if (c16332.f47990.equals(strM5533)) {
                                            c9091.f24647 = c16332.f47991;
                                            c9091.f24648 = c16332.f47992;
                                            str = str3;
                                            str2 = str4;
                                        } else {
                                            i10++;
                                            iMo14722 = i;
                                        }
                                    } else {
                                        i = iMo14722;
                                        if (C11774.m27015(strM5533)) {
                                            int i11 = Integer.parseInt(strM5533);
                                            int length3 = c16332Arr2.length;
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < length3) {
                                                    if (c16332Arr2[i12].f47991 == i11) {
                                                        c9091.f24648 = 16;
                                                        c9091.f24647 = i11;
                                                    } else {
                                                        i12++;
                                                    }
                                                } else if (i11 == 0 && i8 == 65536) {
                                                    c9091.f24648 = 16;
                                                    c9091.f24647 = i11;
                                                } else if (C11774.m27009(strM5533)) {
                                                    iM27008 = C11774.m27008(strM5533.substring(2));
                                                    length = c16332Arr2.length;
                                                    i4 = 0;
                                                    while (true) {
                                                        if (i4 >= length) {
                                                            if (iM27008 != 0 && i8 == 65536) {
                                                                c9091.f24648 = 16;
                                                                c9091.f24647 = iM27008;
                                                            }
                                                            i2 = 1;
                                                            i3 = 3;
                                                            z3 = false;
                                                        } else if (c16332Arr2[i4].f47991 == iM27008) {
                                                            c9091.f24648 = 16;
                                                            c9091.f24647 = iM27008;
                                                        } else {
                                                            i4++;
                                                        }
                                                    }
                                                }
                                                str = str3;
                                                str2 = str4;
                                                i2 = 1;
                                                i3 = 3;
                                                z3 = false;
                                            }
                                        } else if (C11774.m27009(strM5533)) {
                                            iM27008 = C11774.m27008(strM5533.substring(2));
                                            length = c16332Arr2.length;
                                            i4 = 0;
                                            while (true) {
                                                if (i4 >= length) {
                                                    if (c16332Arr2[i4].f47991 == iM27008) {
                                                        c9091.f24648 = 16;
                                                        c9091.f24647 = iM27008;
                                                    } else {
                                                        i4++;
                                                    }
                                                } else if (iM27008 != 0) {
                                                }
                                                str = str3;
                                                str2 = str4;
                                                i2 = 1;
                                                i3 = 3;
                                                z3 = false;
                                            }
                                        }
                                    }
                                    i2 = 1;
                                    i3 = 3;
                                    z3 = true;
                                }
                            } else {
                                i = iMo14722;
                            }
                            if ((131072 & i8) != 0) {
                                c9091.f24648 = 17;
                                String[] strArrSplit2 = strM5533.split("\\|");
                                int length4 = strArrSplit2.length;
                                int i13 = 0;
                                boolean z4 = false;
                                int i14 = 0;
                                while (true) {
                                    if (i13 >= length4) {
                                        str = str3;
                                        str2 = str4;
                                        z = false;
                                        break;
                                    }
                                    String[] strArr = strArrSplit2;
                                    String strTrim = strArrSplit2[i13].trim();
                                    str = str3;
                                    int length5 = c16332Arr2.length;
                                    str2 = str4;
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= length5) {
                                            c16332Arr = c16332Arr2;
                                            z2 = false;
                                            break;
                                        }
                                        int i16 = length5;
                                        C16332 c16333 = c16332Arr2[i15];
                                        c16332Arr = c16332Arr2;
                                        if (c16333.f47990.equals(strTrim)) {
                                            z2 = true;
                                            i14 |= c16333.f47991;
                                            z4 = true;
                                            break;
                                        } else {
                                            i15++;
                                            length5 = i16;
                                            c16332Arr2 = c16332Arr;
                                        }
                                    }
                                    if (!z2) {
                                        z = true;
                                        break;
                                    }
                                    i13++;
                                    str3 = str;
                                    strArrSplit2 = strArr;
                                    str4 = str2;
                                    c16332Arr2 = c16332Arr;
                                }
                                int i17 = i14;
                                if (z || !z4) {
                                    if (!z4 && C11774.m27015(strM5533)) {
                                        c9091.f24647 = Integer.parseInt(strM5533);
                                    } else if (!z4 && C11774.m27009(strM5533)) {
                                        c9091.f24647 = C11774.m27008(strM5533.substring(2));
                                    }
                                    i2 = 1;
                                    i3 = 3;
                                    z3 = false;
                                } else {
                                    c9091.f24647 = i17;
                                    i2 = 1;
                                    i3 = 3;
                                    z3 = true;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            if ((i8 & 16) == 0 || !strM5533.startsWith("#")) {
                                i6 = 1;
                            } else {
                                i6 = 1;
                                if (strM5533.length() == 1 || !C11774.m27005(strM5533.substring(1))) {
                                    strConcat = "Color value invalid: %s".concat(strM5533);
                                } else {
                                    strConcat = !C11774.m27006(strM5533, c9091) ? "Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ".concat(strM5533) : null;
                                }
                                if (strConcat != null) {
                                    if (i9 == 0) {
                                        throw new C3870(strConcat, c3199M46641);
                                    }
                                }
                                i2 = i6;
                                i3 = 3;
                                z3 = false;
                            }
                            if ((i8 & 4) == 0 || !C11774.m27013(strM5533, c9091)) {
                                int i18 = i8 & 32;
                                if (!(i18 == 0 && (i8 & 64) == 0 && (i8 & 128) == 0) && C11774.m27010(strM5533, c9091) && (i9 == 0 || C11774.m27007(c9091))) {
                                    int i19 = c9091.f24648;
                                    if (i19 == 4 && i18 == 0) {
                                        if (i9 == 0) {
                                            throw new C3870("Float value is not allowed here: ".concat(strM5533), c3199M46641);
                                        }
                                    } else if (i19 == 6 && (i8 & 128) == 0) {
                                        if (i9 == 0) {
                                            throw new C3870("Fraction value is not allowed here: ".concat(strM5533), c3199M46641);
                                        }
                                    } else if (i19 == 5 && (i8 & 64) == 0) {
                                        if (i9 == 0) {
                                            throw new C3870("Dimension value is not allowed here: ".concat(strM5533), c3199M46641);
                                        }
                                    }
                                    if ((i8 & 8) == 0) {
                                        if (i9 != 0) {
                                            throw new C3870(C21459.m48622("Error: ", strM5533, " [", c18344M44705.m41783(), "]"), c3199M46641);
                                        }
                                        c9091.f24648 = 3;
                                        StringBuilder sb = new StringBuilder(strM5533.length());
                                        C13551.m30844(sb, strM5533);
                                        c9091.f24646 = sb.toString();
                                    } else if (strM5533.equals("true")) {
                                        c9091.f24647 = -1;
                                        c9091.f24648 = 18;
                                    } else if (strM5533.equals("false")) {
                                        c9091.f24647 = 0;
                                        c9091.f24648 = 18;
                                    } else {
                                        if (i9 != 0) {
                                            throw new C3870(C21459.m48622("Error: ", strM5533, " [", c18344M44705.m41783(), "]"), c3199M46641);
                                        }
                                        c9091.f24648 = 3;
                                        StringBuilder sb2 = new StringBuilder(strM5533.length());
                                        C13551.m30844(sb2, strM5533);
                                        c9091.f24646 = sb2.toString();
                                    }
                                } else if ((i8 & 8) == 0) {
                                    if (i9 != 0) {
                                        throw new C3870(C21459.m48622("Error: ", strM5533, " [", c18344M44705.m41783(), "]"), c3199M46641);
                                    }
                                    c9091.f24648 = 3;
                                    StringBuilder sb3 = new StringBuilder(strM5533.length());
                                    C13551.m30844(sb3, strM5533);
                                    c9091.f24646 = sb3.toString();
                                } else if (strM5533.equals("true")) {
                                    c9091.f24647 = -1;
                                    c9091.f24648 = 18;
                                } else if (strM5533.equals("false")) {
                                    c9091.f24647 = 0;
                                    c9091.f24648 = 18;
                                } else {
                                    if (i9 != 0) {
                                        throw new C3870(C21459.m48622("Error: ", strM5533, " [", c18344M44705.m41783(), "]"), c3199M46641);
                                    }
                                    c9091.f24648 = 3;
                                    StringBuilder sb4 = new StringBuilder(strM5533.length());
                                    C13551.m30844(sb4, strM5533);
                                    c9091.f24646 = sb4.toString();
                                }
                            }
                            i2 = i6;
                            i3 = 3;
                            z3 = false;
                        }
                        i5 = c9091.f24648;
                        if (i5 == i3) {
                            c6925M45905 = c20337.m45906(c9091.f24646, (C23198[]) null, -1);
                        } else {
                            c6925M45905 = c20337.m45905(c9091.f24647, i5, -1);
                        }
                        c6925M45905.m15877(i7);
                        if (!z3) {
                            c12210.m28189(c6925M45905, c3199M46641);
                        }
                        i6 = i2;
                    }
                    i = iMo14722;
                    str = str3;
                    str2 = str4;
                    i2 = i6;
                    i3 = 3;
                    z3 = false;
                    i5 = c9091.f24648;
                    if (i5 == i3) {
                        c6925M45905 = c20337.m45906(c9091.f24646, (C23198[]) null, -1);
                    } else {
                        c6925M45905 = c20337.m45905(c9091.f24647, i5, -1);
                    }
                    c6925M45905.m15877(i7);
                    if (!z3) {
                        c12210.m28189(c6925M45905, c3199M46641);
                    }
                    i6 = i2;
                } else {
                    C13551.m30847(c20337, c12210, c20636).m15877(i7);
                    i = iMo14722;
                    str = str3;
                    str2 = str4;
                }
                itM46631 = it;
                iMo14722 = i;
                str3 = str;
                str4 = str2;
            } else {
                C6845.m15680(c20337, c12210, c20636).m15877(C6845.m15678(c20636, c9091));
            }
        }
        c20337.m45908(C20337.f62811);
    }
}
