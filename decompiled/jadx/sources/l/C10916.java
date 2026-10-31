package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8IL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10916 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f32791;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f32792;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f32793;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f32794;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float f32795;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7131 f32796;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f32797;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f32798;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f32799;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f32800;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f32801;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f32802;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f32803;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f32804;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f32805;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f32806;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f32807;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f32808;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f32809;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10916 m27219(C17714 c17714) {
        return m27221(c17714, false, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10916 m27220(C17714 c17714, C7131 c7131) {
        return m27221(c17714, true, c7131);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a7  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10916 m27221(C17714 c17714, boolean z, C7131 c7131) throws C9080 {
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
                c17714.m41478(4);
            } else {
                c17714.m41478(21);
            }
            int iM41456 = c17714.m41456() & 3;
            int iM41457 = c17714.m41456();
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                Throwable th = null;
                int i8 = -1;
                if (i6 < iM41457) {
                    c17714.m41478(1);
                    int iM41464 = c17714.m41464();
                    int i9 = 0;
                    while (i9 < iM41464) {
                        int iM41465 = c17714.m41464();
                        if (iM41465 > c17714.m41457()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error parsing");
                            sb.append(z ? "L-HEVC config" : "HEVC config");
                            throw C9080.m23440(sb.toString(), th);
                        }
                        if (iM41465 < 2) {
                            arrayList.add(new C1743(c17714.m41485(), iM41465, i8, z2));
                            c17714.m41478(iM41465);
                        } else {
                            arrayList.add(new C1743(c17714.m41485(), iM41465, (c17714.m41482()[c17714.m41485()] & 126) >> 1, true));
                            i7 += iM41465 + 4;
                            c17714.m41478(iM41465);
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
                    C7131 c7131M38889 = c7131;
                    str = "HEVC config";
                    String strM41769 = null;
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
                            C1743 c1743 = (C1743) arrayList.get(i10);
                            str2 = str5;
                            try {
                                boolean z12 = c1743.f6027;
                                ArrayList arrayList2 = arrayList;
                                int i22 = c1743.f6024;
                                if (z12) {
                                    str3 = str6;
                                    try {
                                        System.arraycopy(C16509.f50737, 0, bArr, i11, 4);
                                        int i23 = i11 + 4;
                                        System.arraycopy(c17714.m41482(), c1743.f6026, bArr, i23, i22);
                                        int i24 = c1743.f6025;
                                        if (i24 != 32) {
                                            if (i24 != 33) {
                                                z6 = z6;
                                                if (i24 == 34) {
                                                    z5 = true;
                                                } else if (i24 == 39 && !z8) {
                                                    try {
                                                        C5720 c5720M38885 = C16509.m38885(i23, i23 + i22, bArr);
                                                        if (c5720M38885 != null && c7131M38889 != null) {
                                                            i20 = c5720M38885.f17644 == ((C19832) c7131M38889.f21883.get(0)).f64068 ? 4 : 5;
                                                        }
                                                    } catch (RuntimeException unused) {
                                                    }
                                                    z8 = true;
                                                }
                                            } else if (z7) {
                                                z4 = true;
                                            } else {
                                                try {
                                                    C11365 c11365M38886 = C16509.m38886(bArr, i23, i23 + i22, c7131M38889);
                                                    i12 = c11365M38886.f34010 + 1;
                                                    int i25 = c11365M38886.f34018;
                                                    try {
                                                        int i26 = c11365M38886.f34012;
                                                        try {
                                                            i15 = c11365M38886.f34011 + 8;
                                                            i16 = c11365M38886.f34006 + 8;
                                                            int i27 = c11365M38886.f34016;
                                                            try {
                                                                int i28 = c11365M38886.f34014;
                                                                try {
                                                                    int i29 = c11365M38886.f34015;
                                                                    i = i25;
                                                                    try {
                                                                        float f2 = c11365M38886.f34009;
                                                                        try {
                                                                            int i30 = c11365M38886.f34017;
                                                                            try {
                                                                                C2898 c2898 = c11365M38886.f34013;
                                                                                if (c2898 != null) {
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
                                                                                                        strM41769 = C17839.m41769(c2898.f9240, c2898.f9241, c2898.f9239, c2898.f9236, c2898.f9238, c2898.f9237);
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
                                                                                                    iM41456 = iM41456;
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
                                                                                                iM41456 = iM41456;
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
                                                                                            iM41456 = iM41456;
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
                                                                                        iM41456 = iM41456;
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
                                                c7131M38889 = C16509.m38889(i23, i23 + i22, bArr);
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
                                        throw C9080.m23440(str3.concat(str4), e);
                                    }
                                } else {
                                    str3 = str6;
                                    z11 = true;
                                }
                                i10++;
                                str5 = str2;
                                arrayList = arrayList2;
                                str6 = str3;
                                iM41456 = iM41456;
                            } catch (ArrayIndexOutOfBoundsException e2) {
                                e = e2;
                                str3 = str6;
                                if (z) {
                                    str4 = str2;
                                } else {
                                    str4 = str;
                                }
                                throw C9080.m23440(str3.concat(str4), e);
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
                            throw C9080.m23440(str3.concat(str4), e);
                        }
                    }
                    str2 = str5;
                    str3 = str6;
                    return new C10916(i7 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM41456 + 1, i12, i13, i14, i15, i16, i17, i18, i19, i20, f, i21, strM41769, c7131M38889, !z && (z11 || !z3 || !z4 || !z5 || z9 || z10), z9, z10, z11);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e4) {
            e = e4;
            str = "HEVC config";
        }
    }

    public C10916(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, C7131 c7131, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f32808 = list;
        this.f32794 = i;
        this.f32802 = i2;
        this.f32797 = i3;
        this.f32809 = i4;
        this.f32800 = i5;
        this.f32793 = i6;
        this.f32804 = i7;
        this.f32805 = i8;
        this.f32801 = i9;
        this.f32791 = i10;
        this.f32795 = f;
        this.f32798 = i11;
        this.f32803 = str;
        this.f32796 = c7131;
        this.f32806 = z;
        this.f32792 = z2;
        this.f32807 = z3;
        this.f32799 = z4;
    }
}
