package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9TA */
/* JADX INFO: loaded from: classes2.dex */
public final class C2784 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f8668;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f8669;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f8670;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final List f8671;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f8672;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f8673;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f8674;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f8675;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f8676;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f8677;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f8678;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f8679;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C7225 f8667 = C7225.m19319("0");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C7225 f8666 = C7225.m19319("0123456789");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C7225 f8665 = C7225.m19319(".0123456789");

    public C2784(String str, String str2, String str3) {
        List listAsList = Arrays.asList(str.toLowerCase().split("\\|"));
        this.f8675 = listAsList.contains("2");
        this.f8677 = listAsList.contains("8");
        this.f8668 = listAsList.contains("10");
        this.f8672 = listAsList.contains("16");
        this.f8673 = listAsList.contains("f");
        this.f8676 = listAsList.contains("e");
        this.f8679 = listAsList.contains(am.ax);
        this.f8678 = listAsList.contains("_");
        this.f8669 = listAsList.contains("'");
        String[] strArrSplit = str2.toLowerCase().split("\\|");
        String[] strArrSplit2 = str3.toLowerCase().split("\\|");
        Arrays.sort(strArrSplit, new C13281(1));
        Arrays.sort(strArrSplit2, new C16188());
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str4 : strArrSplit) {
            C11003.requireNonNull(str4);
            arrayList.add(str4);
        }
        this.f8674 = C20195.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList(strArrSplit2.length);
        for (String str5 : strArrSplit2) {
            C11003.requireNonNull(str5);
            arrayList2.add(str5);
        }
        this.f8671 = C20195.unmodifiableList(arrayList2);
    }

    public C2784(C2784 c2784) {
        this.f8675 = c2784.f8675;
        this.f8677 = c2784.f8677;
        this.f8668 = c2784.f8668;
        this.f8672 = c2784.f8672;
        this.f8673 = c2784.f8673;
        this.f8676 = c2784.f8676;
        this.f8679 = c2784.f8679;
        this.f8678 = c2784.f8678;
        this.f8669 = c2784.f8669;
        this.f8674 = c2784.f8674;
        this.f8671 = c2784.f8671;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2784 m8605() {
        return new C2784(this);
    }

    public C2784(C12951 c12951) {
        int iM31494 = c12951.m31494();
        this.f8675 = (iM31494 & 1) != 0;
        this.f8677 = (iM31494 & 2) != 0;
        this.f8668 = (iM31494 & 4) != 0;
        this.f8672 = (iM31494 & 8) != 0;
        this.f8673 = (iM31494 & 16) != 0;
        this.f8676 = (iM31494 & 32) != 0;
        this.f8679 = (iM31494 & 64) != 0;
        this.f8678 = (iM31494 & 128) != 0;
        this.f8669 = (iM31494 & 256) != 0;
        String[] strArrSplit = c12951.m31499().split("\\|");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            C11003.requireNonNull(str);
            arrayList.add(str);
        }
        this.f8674 = C20195.unmodifiableList(arrayList);
        String[] strArrSplit2 = c12951.m31499().split("\\|");
        ArrayList arrayList2 = new ArrayList(strArrSplit2.length);
        for (String str2 : strArrSplit2) {
            C11003.requireNonNull(str2);
            arrayList2.add(str2);
        }
        this.f8671 = C20195.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8606(C10130 c10130) {
        boolean z = this.f8677;
        boolean z2 = this.f8675;
        ?? r1 = z2;
        if (z) {
            r1 = (z2 ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (this.f8668) {
            r2 = (r1 == true ? 1 : 0) | 4;
        }
        ?? r3 = r2;
        if (this.f8672) {
            r3 = (r2 == true ? 1 : 0) | 8;
        }
        ?? r4 = r3;
        if (this.f8673) {
            r4 = (r3 == true ? 1 : 0) | 16;
        }
        ?? r5 = r4;
        if (this.f8676) {
            r5 = (r4 == true ? 1 : 0) | 32;
        }
        ?? r6 = r5;
        if (this.f8679) {
            r6 = (r5 == true ? 1 : 0) | 64;
        }
        ?? r7 = r6;
        if (this.f8678) {
            r7 = (r6 == true ? 1 : 0) | 128;
        }
        int i = r7;
        if (this.f8669) {
            i = (r7 == true ? 1 : 0) | 256;
        }
        c10130.mo13231(i);
        c10130.m25442(C9679.m24609(this.f8674, "|"));
        c10130.m25442(C9679.m24609(this.f8671, "|"));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m8609() {
        ArrayList arrayList = new ArrayList();
        if (this.f8675) {
            arrayList.add("2");
        }
        if (this.f8677) {
            arrayList.add("8");
        }
        if (this.f8668) {
            arrayList.add("10");
        }
        if (this.f8672) {
            arrayList.add("16");
        }
        if (this.f8673) {
            arrayList.add("F");
        }
        if (this.f8676) {
            arrayList.add("E");
        }
        if (this.f8679) {
            arrayList.add("P");
        }
        if (this.f8678) {
            arrayList.add("_");
        }
        if (this.f8669) {
            arrayList.add("'");
        }
        return C9679.m24609(arrayList, "|");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m8611() {
        return C9679.m24609(this.f8674, "|");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m8607() {
        return C9679.m24609(this.f8671, "|");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m8608() {
        return this.f8670;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7225 m8610() {
        if (this.f8673 || this.f8676) {
            return f8665;
        }
        if (this.f8668) {
            return f8666;
        }
        if (this.f8675 || this.f8677 || this.f8672 || this.f8679) {
            return f8667;
        }
        return C7225.f22117;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:117:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0158  */
    /* JADX WARN: Code duplicated, block: B:125:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x0169  */
    /* JADX WARN: Code duplicated, block: B:130:0x0177  */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:133:0x0185  */
    /* JADX WARN: Code duplicated, block: B:134:0x0187  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ac A[ADDED_TO_REGION, PHI: r5
      0x01ac: PHI (r5v8 int) = (r5v7 int), (r5v11 int) binds: [B:143:0x01a1, B:145:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:151:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091 A[PHI: r4
      0x0091: PHI (r4v39 int) = (r4v28 int), (r4v36 int), (r4v43 int) binds: [B:106:0x0137, B:59:0x00b2, B:48:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:96:0x011d  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8604(int i, CharSequence charSequence) {
        int iM8596;
        int i2;
        int iM8597;
        int i3;
        char cCharAt;
        int i4;
        int iM8598;
        int iM8599;
        int i5;
        int i6;
        int iM85910;
        int i7;
        int iM85911;
        int i8;
        int iM85912;
        int i9;
        int iM8603;
        this.f8670 = false;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            return -1;
        }
        boolean z = this.f8679;
        boolean z2 = this.f8676;
        boolean z3 = this.f8673;
        boolean z4 = this.f8672;
        boolean z5 = this.f8668;
        boolean z6 = this.f8677;
        boolean z7 = this.f8675;
        if (i == length) {
            if ((z7 || z6 || z5 || z4 || z3 || z2 || z) && !m8600(i, charSequence)) {
                this.f8670 = true;
            }
            return -1;
        }
        if (!m8601(i, charSequence, false)) {
            return -1;
        }
        int length2 = charSequence.length();
        int i10 = i + 1;
        char cCharAt2 = charSequence.charAt(i);
        List list = this.f8674;
        if (cCharAt2 == '0') {
            if (i10 == length2) {
                this.f8670 = z7 || z6 || z5 || z4 || z3 || z2 || z;
                if (z5) {
                    i5 = -1;
                    i2 = 1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
            } else {
                char cCharAt3 = charSequence.charAt(i10);
                if (z7 && (cCharAt3 == 'b' || cCharAt3 == 'B')) {
                    int i11 = i + 2;
                    int iM85913 = m8597(charSequence, i11, 2, true);
                    iM85912 = iM85913 == -1 ? -1 : iM85913 + m8598(list, charSequence, i11 + iM85913);
                    if (iM85912 == -1) {
                        if (z6) {
                            if (!z4) {
                                i6 = i + 2;
                                iM85910 = m8597(charSequence, i6, 16, true);
                                if (iM85910 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM85910;
                                    if (z4) {
                                        iM85911 = m8598(list, charSequence, i7) + iM85910;
                                    } else {
                                        iM85911 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM85912 = iM85911;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM85912 = iM85911;
                                        }
                                    }
                                    if (iM85912 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM85912 = -1;
                                if (iM85912 != i8) {
                                }
                                i5 = -1;
                            } else {
                                i6 = i + 2;
                                iM85910 = m8597(charSequence, i6, 16, true);
                                if (iM85910 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM85910;
                                    if (z4) {
                                        iM85911 = m8598(list, charSequence, i7) + iM85910;
                                    } else {
                                        iM85911 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM85912 = iM85911;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM85912 = iM85911;
                                        }
                                    }
                                    if (iM85912 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM85912 = -1;
                                if (iM85912 != i8) {
                                }
                                i5 = -1;
                            }
                            if (z5) {
                                i3 = i + iM8597;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM8598 = m8596(i3 + 1, charSequence, true);
                                        if (iM8598 != -1) {
                                            i2 = iM8597 + 1 + iM8598;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM8599 = m8598(list, charSequence, i3);
                                    if (iM8599 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM8597 + iM8599;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM8598 = m8596(i3 + 1, charSequence, true);
                                        if (iM8598 != -1) {
                                            i2 = iM8597 + 1 + iM8598;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM8599 = m8598(list, charSequence, i3);
                                    if (iM8599 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM8597 + iM8599;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            } else {
                                i3 = i + iM8597;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM8598 = m8596(i3 + 1, charSequence, true);
                                        if (iM8598 != -1) {
                                            i2 = iM8597 + 1 + iM8598;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM8599 = m8598(list, charSequence, i3);
                                    if (iM8599 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM8597 + iM8599;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM8598 = m8596(i3 + 1, charSequence, true);
                                        if (iM8598 != -1) {
                                            i2 = iM8597 + 1 + iM8598;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM8599 = m8598(list, charSequence, i3);
                                    if (iM8599 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM8597 + iM8599;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            }
                        } else {
                            if (!z4) {
                                i6 = i + 2;
                                iM85910 = m8597(charSequence, i6, 16, true);
                                if (iM85910 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM85910;
                                    if (z4) {
                                        iM85911 = m8598(list, charSequence, i7) + iM85910;
                                    } else {
                                        iM85911 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM85912 = iM85911;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM85912 = iM85911;
                                        }
                                    }
                                    if (iM85912 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM85912 = -1;
                                if (iM85912 != i8) {
                                }
                                i5 = -1;
                            } else {
                                i6 = i + 2;
                                iM85910 = m8597(charSequence, i6, 16, true);
                                if (iM85910 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM85910;
                                    if (z4) {
                                        iM85911 = m8598(list, charSequence, i7) + iM85910;
                                    } else {
                                        iM85911 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM85912 = iM85911;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM85912 = iM85911;
                                        }
                                    }
                                    if (iM85912 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM85912 = -1;
                                if (iM85912 != i8) {
                                }
                                i5 = -1;
                            }
                            if (z5) {
                                i3 = i + iM8597;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM8598 = m8596(i3 + 1, charSequence, true);
                                        if (iM8598 != -1) {
                                            i2 = iM8597 + 1 + iM8598;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM8599 = m8598(list, charSequence, i3);
                                    if (iM8599 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM8597 + iM8599;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM8598 = m8596(i3 + 1, charSequence, true);
                                        if (iM8598 != -1) {
                                            i2 = iM8597 + 1 + iM8598;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM8599 = m8598(list, charSequence, i3);
                                    if (iM8599 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM8597 + iM8599;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            } else {
                                i3 = i + iM8597;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM8598 = m8596(i3 + 1, charSequence, true);
                                        if (iM8598 != -1) {
                                            i2 = iM8597 + 1 + iM8598;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM8599 = m8598(list, charSequence, i3);
                                    if (iM8599 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM8597 + iM8599;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM8598 = m8596(i3 + 1, charSequence, true);
                                        if (iM8598 != -1) {
                                            i2 = iM8597 + 1 + iM8598;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM8599 = m8598(list, charSequence, i3);
                                    if (iM8599 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM8597 + iM8599;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            }
                        }
                    }
                    i2 = iM85912 + 2;
                    i5 = -1;
                } else if (z6 || !(cCharAt3 == 'o' || cCharAt3 == 'O')) {
                    if ((!z4 || z) && (cCharAt3 == 'x' || cCharAt3 == 'X')) {
                        i6 = i + 2;
                        iM85910 = m8597(charSequence, i6, 16, true);
                        if (iM85910 == -1) {
                            i8 = -1;
                        } else {
                            i7 = i6 + iM85910;
                            if (z4) {
                                iM85911 = m8598(list, charSequence, i7) + iM85910;
                            } else {
                                iM85911 = -1;
                            }
                            if (z || i7 >= charSequence.length()) {
                                i8 = -1;
                                if (z4) {
                                    iM85912 = iM85911;
                                }
                            } else {
                                int i12 = i7 + 1;
                                char cCharAt4 = charSequence.charAt(i7);
                                if (cCharAt4 == '.') {
                                    int iM85914 = m8597(charSequence, i12, 16, false);
                                    if (iM85914 != -1) {
                                        int i13 = i12 + iM85914;
                                        if (i13 < charSequence.length()) {
                                            int i14 = i13 + 1;
                                            char cCharAt5 = charSequence.charAt(i13);
                                            if (cCharAt5 == 'p' || cCharAt5 == 'P') {
                                                int iM8604 = m8603(i14, charSequence);
                                                iM8603 = iM8604 != -1 ? iM85914 + 1 + iM8604 : -1;
                                                if (iM8603 == i9) {
                                                    i8 = i9;
                                                    if (z4) {
                                                        iM85912 = iM85911;
                                                    }
                                                }
                                            }
                                        }
                                        i9 = -1;
                                        iM8603 = -1;
                                        if (iM8603 == i9) {
                                            i8 = i9;
                                            if (z4) {
                                                iM85912 = iM85911;
                                            }
                                        }
                                    }
                                    i9 = -1;
                                    if (iM8603 == i9) {
                                        i8 = i9;
                                        if (z4) {
                                            iM85912 = iM85911;
                                        }
                                    }
                                } else {
                                    i9 = -1;
                                    if ((cCharAt4 != 'p' && cCharAt4 != 'P') || (iM8603 = m8603(i12, charSequence)) == -1) {
                                        i8 = -1;
                                        if (z4) {
                                            iM85912 = iM85911;
                                        }
                                    }
                                }
                                int i15 = i9;
                                iM85912 = iM8603 + iM85910 + 1;
                                i8 = i15;
                            }
                            if (iM85912 != i8) {
                                i2 = iM85912 + 2;
                            }
                            i5 = -1;
                        }
                        iM85912 = -1;
                        if (iM85912 != i8) {
                            i2 = iM85912 + 2;
                        }
                        i5 = -1;
                    }
                    if ((z5 || z3 || z2) && (iM8597 = m8597(charSequence, i, 10, false)) != -1) {
                        i3 = i + iM8597;
                        if ((!z3 || z2) && i3 < charSequence.length()) {
                            cCharAt = charSequence.charAt(i3);
                            if (cCharAt == '.') {
                                iM8598 = m8596(i3 + 1, charSequence, true);
                                if (iM8598 != -1) {
                                    i2 = iM8597 + 1 + iM8598;
                                }
                                i5 = -1;
                            } else if (!z2 && (cCharAt == 'e' || cCharAt == 'E')) {
                                int iM8602 = m8602(i3 + 1, charSequence);
                                if (iM8602 != -1) {
                                    i4 = iM8597 + 1 + iM8602;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            }
                            iM8599 = m8598(list, charSequence, i3);
                            if ((iM8599 != 0 && (iM8599 = m8598(this.f8671, charSequence, i3)) != 0) || z5) {
                                i4 = iM8597 + iM8599;
                                i2 = i4;
                                i5 = -1;
                            }
                        } else {
                            iM8599 = m8598(list, charSequence, i3);
                            if (iM8599 != 0) {
                            }
                            i4 = iM8597 + iM8599;
                            i2 = i4;
                            i5 = -1;
                        }
                    }
                    i5 = -1;
                    i2 = -1;
                } else {
                    int i16 = i + 2;
                    int iM85915 = m8597(charSequence, i16, 8, true);
                    iM85912 = iM85915 == -1 ? -1 : m8598(list, charSequence, i16 + iM85915) + iM85915;
                    if (iM85912 == -1) {
                        if (!z4) {
                            i6 = i + 2;
                            iM85910 = m8597(charSequence, i6, 16, true);
                            if (iM85910 == -1) {
                                i8 = -1;
                            } else {
                                i7 = i6 + iM85910;
                                if (z4) {
                                    iM85911 = m8598(list, charSequence, i7) + iM85910;
                                } else {
                                    iM85911 = -1;
                                }
                                if (z) {
                                    i8 = -1;
                                    if (z4) {
                                        iM85912 = iM85911;
                                    }
                                } else {
                                    i8 = -1;
                                    if (z4) {
                                        iM85912 = iM85911;
                                    }
                                }
                                if (iM85912 != i8) {
                                }
                                i5 = -1;
                            }
                            iM85912 = -1;
                            if (iM85912 != i8) {
                            }
                            i5 = -1;
                        } else {
                            i6 = i + 2;
                            iM85910 = m8597(charSequence, i6, 16, true);
                            if (iM85910 == -1) {
                                i8 = -1;
                            } else {
                                i7 = i6 + iM85910;
                                if (z4) {
                                    iM85911 = m8598(list, charSequence, i7) + iM85910;
                                } else {
                                    iM85911 = -1;
                                }
                                if (z) {
                                    i8 = -1;
                                    if (z4) {
                                        iM85912 = iM85911;
                                    }
                                } else {
                                    i8 = -1;
                                    if (z4) {
                                        iM85912 = iM85911;
                                    }
                                }
                                if (iM85912 != i8) {
                                }
                                i5 = -1;
                            }
                            iM85912 = -1;
                            if (iM85912 != i8) {
                            }
                            i5 = -1;
                        }
                        if (z5) {
                            i3 = i + iM8597;
                            if (!z3) {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM8598 = m8596(i3 + 1, charSequence, true);
                                    if (iM8598 != -1) {
                                        i2 = iM8597 + 1 + iM8598;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM8599 = m8598(list, charSequence, i3);
                                if (iM8599 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM8597 + iM8599;
                                i2 = i4;
                                i5 = -1;
                            } else {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM8598 = m8596(i3 + 1, charSequence, true);
                                    if (iM8598 != -1) {
                                        i2 = iM8597 + 1 + iM8598;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM8599 = m8598(list, charSequence, i3);
                                if (iM8599 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM8597 + iM8599;
                                i2 = i4;
                                i5 = -1;
                            }
                        } else {
                            i3 = i + iM8597;
                            if (!z3) {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM8598 = m8596(i3 + 1, charSequence, true);
                                    if (iM8598 != -1) {
                                        i2 = iM8597 + 1 + iM8598;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM8599 = m8598(list, charSequence, i3);
                                if (iM8599 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM8597 + iM8599;
                                i2 = i4;
                                i5 = -1;
                            } else {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM8598 = m8596(i3 + 1, charSequence, true);
                                    if (iM8598 != -1) {
                                        i2 = iM8597 + 1 + iM8598;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM8599 = m8598(list, charSequence, i3);
                                if (iM8599 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM8597 + iM8599;
                                i2 = i4;
                                i5 = -1;
                            }
                        }
                    }
                    i2 = iM85912 + 2;
                    i5 = -1;
                }
            }
        } else if (cCharAt2 == '.') {
            if ((z3 || z2) && (iM8596 = m8596(i10, charSequence, false)) != -1) {
                i2 = iM8596 + 1;
                i5 = -1;
            } else {
                i5 = -1;
                i2 = -1;
            }
        } else if (z5) {
            i3 = i + iM8597;
            if (!z3) {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM8598 = m8596(i3 + 1, charSequence, true);
                    if (iM8598 != -1) {
                        i2 = iM8597 + 1 + iM8598;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM8599 = m8598(list, charSequence, i3);
                if (iM8599 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM8597 + iM8599;
                i2 = i4;
                i5 = -1;
            } else {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM8598 = m8596(i3 + 1, charSequence, true);
                    if (iM8598 != -1) {
                        i2 = iM8597 + 1 + iM8598;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM8599 = m8598(list, charSequence, i3);
                if (iM8599 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM8597 + iM8599;
                i2 = i4;
                i5 = -1;
            }
        } else {
            i3 = i + iM8597;
            if (!z3) {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM8598 = m8596(i3 + 1, charSequence, true);
                    if (iM8598 != -1) {
                        i2 = iM8597 + 1 + iM8598;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM8599 = m8598(list, charSequence, i3);
                if (iM8599 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM8597 + iM8599;
                i2 = i4;
                i5 = -1;
            } else {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM8598 = m8596(i3 + 1, charSequence, true);
                    if (iM8598 != -1) {
                        i2 = iM8597 + 1 + iM8598;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM8599 = m8598(list, charSequence, i3);
                if (iM8599 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM8597 + iM8599;
                i2 = i4;
                i5 = -1;
            }
        }
        return (i2 != i5 && m8601(i + i2, charSequence, true)) ? i2 : i5;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m8603(int i, CharSequence charSequence) {
        char cCharAt;
        int i2 = (i >= charSequence.length() || !((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) ? 0 : 1;
        int iM8597 = m8597(charSequence, i + i2, 10, false);
        if (iM8597 == -1) {
            return -1;
        }
        int i3 = iM8597 + i2;
        return i3 + m8598(this.f8671, charSequence, i + i3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m8596(int i, CharSequence charSequence, boolean z) {
        int iM8598;
        char cCharAt;
        int i2 = 0;
        int iM8597 = m8597(charSequence, i, 10, false);
        if (iM8597 == -1) {
            if (z) {
            }
            return -1;
        }
        i2 = iM8597;
        int i3 = i + i2;
        if (this.f8676 && i3 < charSequence.length() && ((cCharAt = charSequence.charAt(i3)) == 'e' || cCharAt == 'E')) {
            if (i3 < charSequence.length() - 1) {
                iM8598 = m8602(i3 + 1, charSequence);
                if (iM8598 != -1) {
                    i2++;
                    return i2 + iM8598;
                }
                return -1;
            }
            this.f8670 = true;
        }
        if (this.f8673) {
            iM8598 = m8598(this.f8671, charSequence, i3);
            return i2 + iM8598;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m8602(int i, CharSequence charSequence) {
        char cCharAt;
        int i2 = (i >= charSequence.length() || !((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) ? 0 : 1;
        int iM8597 = m8597(charSequence, i + i2, 10, false);
        if (iM8597 == -1) {
            return -1;
        }
        int i3 = iM8597 + i2;
        return i3 + m8598(this.f8671, charSequence, i + i3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m8597(CharSequence charSequence, int i, int i2, boolean z) {
        int length = charSequence.length();
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            if (i < length) {
                int i4 = i + 1;
                char cCharAt = charSequence.charAt(i);
                if (('0' <= cCharAt && cCharAt <= '9' && cCharAt - '0' < i2) || (('a' <= cCharAt && cCharAt <= 'f' && cCharAt - 'W' < i2) || ('A' <= cCharAt && cCharAt <= 'F' && cCharAt - '7' < i2))) {
                    i3++;
                    z2 = false;
                } else {
                    if ((!this.f8678 || cCharAt != '_') && (!this.f8669 || cCharAt != '\'')) {
                        break;
                    }
                    if (!z && i3 == 0) {
                        return -1;
                    }
                    i3++;
                    z2 = true;
                }
                i = i4;
            } else {
                this.f8670 = true;
                break;
            }
        }
        if (i3 == 0 || z2) {
            return -1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m8598(List list, CharSequence charSequence, int i) {
        if (list.isEmpty() || ((String) list.get(0)).isEmpty() || i == charSequence.length()) {
            return 0;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            int length = str.length();
            if (i >= 0 && i <= charSequence.length()) {
                int length2 = charSequence.length() - i;
                int iMin = Math.min(length, length2);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        if (length <= length2) {
                            return str.length();
                        }
                        this.f8670 = true;
                        break;
                    }
                    if (Character.toLowerCase(charSequence.charAt(i + i3)) != str.charAt(i3)) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x005e A[RETURN] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m8601(int i, CharSequence charSequence, boolean z) {
        boolean z2;
        boolean zM8600 = m8600(i, charSequence);
        if (i < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (z && i == charSequence.length() - 1 && Character.isHighSurrogate((char) iCodePointAt)) {
                this.f8670 = true;
            }
            if (iCodePointAt != 95 && iCodePointAt != 46 && !m8599(iCodePointAt)) {
                if (Character.getType(iCodePointAt) == 6) {
                    while (true) {
                        if (i >= 0) {
                            int iCodePointAt2 = Character.codePointAt(charSequence, i);
                            if (!m8599(iCodePointAt2)) {
                                if (Character.getType(iCodePointAt2) == 6) {
                                    i--;
                                }
                            }
                        }
                    }
                }
            }
            z2 = true;
            if (zM8600 != z2) {
                return true;
            }
            return false;
        }
        if (z && i == charSequence.length()) {
            this.f8670 = true;
        }
        z2 = false;
        if (zM8600 != z2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8600(int i, CharSequence charSequence) {
        if (i <= 0) {
            return false;
        }
        int iCodePointBefore = Character.codePointBefore(charSequence, i);
        if (iCodePointBefore == 95 || iCodePointBefore == 46 || m8599(iCodePointBefore)) {
            return true;
        }
        if (Character.getType(iCodePointBefore) != 6) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int iCodePointAt = Character.codePointAt(charSequence, i2);
            if (m8599(iCodePointAt)) {
                return true;
            }
            if (Character.getType(iCodePointAt) != 6) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8599(int i) {
        if (i > 127) {
            return Character.isLetterOrDigit(i);
        }
        if (97 <= i && i <= 122) {
            return true;
        }
        if (65 > i || i > 90) {
            return 48 <= i && i <= 57;
        }
        return true;
    }
}
