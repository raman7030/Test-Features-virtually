package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8IL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12743 {

    /* JADX INFO: renamed from: ֡ */
    public final int f35769;

    /* JADX INFO: renamed from: ֨ */
    public final boolean f35770;

    /* JADX INFO: renamed from: ֫ */
    public final int f35771;

    /* JADX INFO: renamed from: ۖ */
    public final int f35772;

    /* JADX INFO: renamed from: ۘ */
    public final float f35773;

    /* JADX INFO: renamed from: ۚ */
    public final C9145 f35774;

    /* JADX INFO: renamed from: ۜ */
    public final int f35775;

    /* JADX INFO: renamed from: ۡ */
    public final int f35776;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f35777;

    /* JADX INFO: renamed from: ۧ */
    public final int f35778;

    /* JADX INFO: renamed from: ܳ */
    public final int f35779;

    /* JADX INFO: renamed from: ܺ */
    public final int f35780;

    /* JADX INFO: renamed from: ܽ */
    public final String f35781;

    /* JADX INFO: renamed from: ܿ */
    public final int f35782;

    /* JADX INFO: renamed from: ᩳ */
    public final int f35783;

    /* JADX INFO: renamed from: ᩴ */
    public final boolean f35784;

    /* JADX INFO: renamed from: ᩵ */
    public final boolean f35785;

    /* JADX INFO: renamed from: ᩷ */
    public final List f35786;

    /* JADX INFO: renamed from: ᩻ */
    public final int f35787;

    /* JADX INFO: renamed from: ֫ */
    public static C12743 m29264(C19203 c19203) {
        return m29266(c19203, false, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12743 m29265(C19203 c19203, C9145 c9145) {
        return m29266(c19203, true, c9145);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a7  */
    /* JADX INFO: renamed from: ֫ */
    public static C12743 m29266(C19203 c19203, boolean z, C9145 c9145) throws C10998 {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str5 = "L-HEVC config";
        String str6 = "Error parsing";
        try {
            if (z) {
                c19203.m43724(4);
            } else {
                c19203.m43724(21);
            }
            int iM43702 = c19203.m43702() & 3;
            int iM43703 = c19203.m43702();
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                Throwable th = null;
                int i8 = -1;
                if (i6 < iM43703) {
                    c19203.m43724(1);
                    int iM43710 = c19203.m43710();
                    int i9 = 0;
                    while (i9 < iM43710) {
                        int iM43711 = c19203.m43710();
                        if (iM43711 > c19203.m43703()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error parsing");
                            sb.append(z ? "L-HEVC config" : "HEVC config");
                            throw C10998.m25387(sb.toString(), th);
                        }
                        if (iM43711 < 2) {
                            arrayList.add(new C4025(c19203.m43731(), iM43711, i8, z2));
                            c19203.m43724(iM43711);
                        } else {
                            arrayList.add(new C4025(c19203.m43731(), iM43711, (c19203.m43728()[c19203.m43731()] & 126) >> 1, true));
                            i7 += iM43711 + 4;
                            c19203.m43724(iM43711);
                        }
                        i9++;
                        z2 = false;
                        th = null;
                        i8 = -1;
                    }
                    i6++;
                    z2 = false;
                } else {
                    byte[] bArr = new byte[i7];
                    C9145 c9145M41115 = c9145;
                    str = "HEVC config";
                    String strM44015 = null;
                    int i10 = 0;
                    int i11 = 0;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = false;
                    boolean z6 = false;
                    boolean z7 = false;
                    boolean z8 = false;
                    int i12 = -1;
                    int i13 = -1;
                    int i14 = -1;
                    int i15 = -1;
                    int i16 = -1;
                    int i17 = -1;
                    int i18 = -1;
                    int i19 = -1;
                    int i20 = -1;
                    float f = 1.0f;
                    int i21 = -1;
                    boolean z9 = false;
                    boolean z10 = false;
                    boolean z11 = false;
                    while (i10 < arrayList.size()) {
                        try {
                            C4025 c4025 = (C4025) arrayList.get(i10);
                            str2 = str5;
                            try {
                                boolean z12 = c4025.f8804;
                                ArrayList arrayList2 = arrayList;
                                int i22 = c4025.f8801;
                                if (z12) {
                                    str3 = str6;
                                    try {
                                        System.arraycopy(C18058.f53916, 0, bArr, i11, 4);
                                        int i23 = i11 + 4;
                                        System.arraycopy(c19203.m43728(), c4025.f8803, bArr, i23, i22);
                                        int i24 = c4025.f8802;
                                        if (i24 != 32) {
                                            if (i24 != 33) {
                                                z6 = z6;
                                                if (i24 == 34) {
                                                    z5 = true;
                                                } else if (i24 == 39 && !z8) {
                                                    try {
                                                        C7804 c7804M41111 = C18058.m41111(i23, i23 + i22, bArr);
                                                        if (c7804M41111 != null && c9145M41115 != null) {
                                                            i20 = c7804M41111.f20489 == ((C21216) c9145M41115.f24762.get(0)).f66705 ? 4 : 5;
                                                        }
                                                    } catch (RuntimeException unused) {
                                                    }
                                                    z8 = true;
                                                }
                                            } else if (z7) {
                                                z4 = true;
                                            } else {
                                                try {
                                                    C13169 c13169M41112 = C18058.m41112(bArr, i23, i23 + i22, c9145M41115);
                                                    i12 = c13169M41112.f37007 + 1;
                                                    int i25 = c13169M41112.f37015;
                                                    try {
                                                        int i26 = c13169M41112.f37009;
                                                        try {
                                                            i15 = c13169M41112.f37008 + 8;
                                                            i16 = c13169M41112.f37003 + 8;
                                                            int i27 = c13169M41112.f37013;
                                                            try {
                                                                int i28 = c13169M41112.f37011;
                                                                try {
                                                                    int i29 = c13169M41112.f37012;
                                                                    i = i25;
                                                                    try {
                                                                        float f2 = c13169M41112.f37006;
                                                                        try {
                                                                            int i30 = c13169M41112.f37014;
                                                                            try {
                                                                                C5122 c5122 = c13169M41112.f37010;
                                                                                if (c5122 != null) {
                                                                                    i3 = i30;
                                                                                    try {
                                                                                        i2 = i26;
                                                                                        try {
                                                                                            i4 = i27;
                                                                                            try {
                                                                                                i5 = i28;
                                                                                                try {
                                                                                                    z6 = z6;
                                                                                                    try {
                                                                                                        strM44015 = C19322.m44015(c5122.f12038, c5122.f12039, c5122.f12037, c5122.f12034, c5122.f12036, c5122.f12035);
                                                                                                    } catch (RuntimeException unused2) {
                                                                                                        i19 = i29;
                                                                                                        f = f2;
                                                                                                        i21 = i3;
                                                                                                        i17 = i4;
                                                                                                        i18 = i5;
                                                                                                        i13 = i;
                                                                                                        i14 = i2;
                                                                                                        z4 = true;
                                                                                                        z7 = true;
                                                                                                        z10 = true;
                                                                                                    }
                                                                                                } catch (RuntimeException unused3) {
                                                                                                    z6 = z6;
                                                                                                    i19 = i29;
                                                                                                    f = f2;
                                                                                                    i21 = i3;
                                                                                                    i17 = i4;
                                                                                                    i18 = i5;
                                                                                                    i13 = i;
                                                                                                    i14 = i2;
                                                                                                    z4 = true;
                                                                                                    z7 = true;
                                                                                                    z10 = true;
                                                                                                    z6 = z6;
                                                                                                    i11 = i23 + i22;
                                                                                                    i10++;
                                                                                                    str5 = str2;
                                                                                                    arrayList = arrayList2;
                                                                                                    str6 = str3;
                                                                                                    iM43702 = iM43702;
                                                                                                }
                                                                                            } catch (RuntimeException unused4) {
                                                                                                i5 = i28;
                                                                                                z6 = z6;
                                                                                                i19 = i29;
                                                                                                f = f2;
                                                                                                i21 = i3;
                                                                                                i17 = i4;
                                                                                                i18 = i5;
                                                                                                i13 = i;
                                                                                                i14 = i2;
                                                                                                z4 = true;
                                                                                                z7 = true;
                                                                                                z10 = true;
                                                                                                z6 = z6;
                                                                                                i11 = i23 + i22;
                                                                                                i10++;
                                                                                                str5 = str2;
                                                                                                arrayList = arrayList2;
                                                                                                str6 = str3;
                                                                                                iM43702 = iM43702;
                                                                                            }
                                                                                        } catch (RuntimeException unused5) {
                                                                                            i4 = i27;
                                                                                            i5 = i28;
                                                                                            z6 = z6;
                                                                                            i19 = i29;
                                                                                            f = f2;
                                                                                            i21 = i3;
                                                                                            i17 = i4;
                                                                                            i18 = i5;
                                                                                            i13 = i;
                                                                                            i14 = i2;
                                                                                            z4 = true;
                                                                                            z7 = true;
                                                                                            z10 = true;
                                                                                            z6 = z6;
                                                                                            i11 = i23 + i22;
                                                                                            i10++;
                                                                                            str5 = str2;
                                                                                            arrayList = arrayList2;
                                                                                            str6 = str3;
                                                                                            iM43702 = iM43702;
                                                                                        }
                                                                                    } catch (RuntimeException unused6) {
                                                                                        i2 = i26;
                                                                                        i4 = i27;
                                                                                        i5 = i28;
                                                                                        z6 = z6;
                                                                                        i19 = i29;
                                                                                        f = f2;
                                                                                        i21 = i3;
                                                                                        i17 = i4;
                                                                                        i18 = i5;
                                                                                        i13 = i;
                                                                                        i14 = i2;
                                                                                        z4 = true;
                                                                                        z7 = true;
                                                                                        z10 = true;
                                                                                        z6 = z6;
                                                                                        i11 = i23 + i22;
                                                                                        i10++;
                                                                                        str5 = str2;
                                                                                        arrayList = arrayList2;
                                                                                        str6 = str3;
                                                                                        iM43702 = iM43702;
                                                                                    }
                                                                                } else {
                                                                                    i3 = i30;
                                                                                    i2 = i26;
                                                                                    i4 = i27;
                                                                                    i5 = i28;
                                                                                    z6 = z6;
                                                                                }
                                                                                i19 = i29;
                                                                                i13 = i;
                                                                                f = f2;
                                                                                i21 = i3;
                                                                                i14 = i2;
                                                                                i17 = i4;
                                                                                i18 = i5;
                                                                                z4 = true;
                                                                                z7 = true;
                                                                            } catch (RuntimeException unused7) {
                                                                                i3 = i30;
                                                                            }
                                                                        } catch (RuntimeException unused8) {
                                                                            i19 = i29;
                                                                            f = f2;
                                                                            i14 = i26;
                                                                            i17 = i27;
                                                                            i18 = i28;
                                                                            i13 = i;
                                                                            z4 = true;
                                                                            z7 = true;
                                                                            z10 = true;
                                                                        }
                                                                    } catch (RuntimeException unused9) {
                                                                        i19 = i29;
                                                                        i13 = i;
                                                                        i14 = i26;
                                                                        i17 = i27;
                                                                        i18 = i28;
                                                                        z4 = true;
                                                                        z7 = true;
                                                                        z10 = true;
                                                                    }
                                                                } catch (RuntimeException unused10) {
                                                                    i = i25;
                                                                }
                                                            } catch (RuntimeException unused11) {
                                                                z6 = z6;
                                                                i13 = i25;
                                                                i14 = i26;
                                                                i17 = i27;
                                                            }
                                                        } catch (RuntimeException unused12) {
                                                            i = i25;
                                                            i2 = i26;
                                                            z6 = z6;
                                                        }
                                                    } catch (RuntimeException unused13) {
                                                        i = i25;
                                                    }
                                                } catch (RuntimeException unused14) {
                                                    z6 = z6;
                                                }
                                            }
                                            z6 = z6;
                                        } else if (z6) {
                                            z6 = z6;
                                            z3 = true;
                                            z6 = z6;
                                        } else {
                                            try {
                                                c9145M41115 = C18058.m41115(i23, i23 + i22, bArr);
                                                z3 = true;
                                                z6 = true;
                                            } catch (RuntimeException unused15) {
                                                z3 = true;
                                                z6 = true;
                                                z9 = true;
                                            }
                                        }
                                        i11 = i23 + i22;
                                    } catch (ArrayIndexOutOfBoundsException e) {
                                        e = e;
                                        if (z) {
                                            str4 = str2;
                                        } else {
                                            str4 = str;
                                        }
                                        throw C10998.m25387(str3.concat(str4), e);
                                    }
                                } else {
                                    str3 = str6;
                                    z11 = true;
                                }
                                i10++;
                                str5 = str2;
                                arrayList = arrayList2;
                                str6 = str3;
                                iM43702 = iM43702;
                            } catch (ArrayIndexOutOfBoundsException e2) {
                                e = e2;
                                str3 = str6;
                                if (z) {
                                    str4 = str2;
                                } else {
                                    str4 = str;
                                }
                                throw C10998.m25387(str3.concat(str4), e);
                            }
                        } catch (ArrayIndexOutOfBoundsException e3) {
                            e = e3;
                            str2 = str5;
                            str3 = str6;
                            if (z) {
                                str4 = str2;
                            } else {
                                str4 = str;
                            }
                            throw C10998.m25387(str3.concat(str4), e);
                        }
                    }
                    str2 = str5;
                    str3 = str6;
                    return new C12743(i7 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM43702 + 1, i12, i13, i14, i15, i16, i17, i18, i19, i20, f, i21, strM44015, c9145M41115, !z && (z11 || !z3 || !z4 || !z5 || z9 || z10), z9, z10, z11);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e4) {
            e = e4;
            str = "HEVC config";
        }
    }

    public C12743(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, C9145 c9145, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f35786 = list;
        this.f35772 = i;
        this.f35780 = i2;
        this.f35775 = i3;
        this.f35787 = i4;
        this.f35778 = i5;
        this.f35771 = i6;
        this.f35782 = i7;
        this.f35783 = i8;
        this.f35779 = i9;
        this.f35769 = i10;
        this.f35773 = f;
        this.f35776 = i11;
        this.f35781 = str;
        this.f35774 = c9145;
        this.f35784 = z;
        this.f35770 = z2;
        this.f35785 = z3;
        this.f35777 = z4;
    }
}
