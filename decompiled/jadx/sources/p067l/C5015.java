package p067l;

import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9TA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5015 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f11462;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f11463;

    /* JADX INFO: renamed from: ۡ */
    public boolean f11464;

    /* JADX INFO: renamed from: ۢ */
    public final List f11465;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f11466;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f11467;

    /* JADX INFO: renamed from: ܺ */
    public final List f11468;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f11469;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f11470;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f11471;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f11472;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f11473;

    /* JADX INFO: renamed from: ᩴ */
    public static final C9235 f11461 = C9235.m21268("0");

    /* JADX INFO: renamed from: ۘ */
    public static final C9235 f11460 = C9235.m21268("0123456789");

    /* JADX INFO: renamed from: ۖ */
    public static final C9235 f11459 = C9235.m21268(".0123456789");

    public C5015(String str, String str2, String str3) {
        List listAsList = Arrays.asList(str.toLowerCase().split("\\|"));
        this.f11469 = listAsList.contains("2");
        this.f11471 = listAsList.contains("8");
        this.f11462 = listAsList.contains("10");
        this.f11466 = listAsList.contains("16");
        this.f11467 = listAsList.contains("f");
        this.f11470 = listAsList.contains("e");
        this.f11473 = listAsList.contains(C0655am.f2322ax);
        this.f11472 = listAsList.contains("_");
        this.f11463 = listAsList.contains("'");
        String[] strArrSplit = str2.toLowerCase().split("\\|");
        String[] strArrSplit2 = str3.toLowerCase().split("\\|");
        Arrays.sort(strArrSplit, new C14991(1));
        Arrays.sort(strArrSplit2, new C17754());
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str4 : strArrSplit) {
            C12826.requireNonNull(str4);
            arrayList.add(str4);
        }
        this.f11468 = C21562.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList(strArrSplit2.length);
        for (String str5 : strArrSplit2) {
            C12826.requireNonNull(str5);
            arrayList2.add(str5);
        }
        this.f11465 = C21562.unmodifiableList(arrayList2);
    }

    public C5015(C5015 c5015) {
        this.f11469 = c5015.f11469;
        this.f11471 = c5015.f11471;
        this.f11462 = c5015.f11462;
        this.f11466 = c5015.f11466;
        this.f11467 = c5015.f11467;
        this.f11470 = c5015.f11470;
        this.f11473 = c5015.f11473;
        this.f11472 = c5015.f11472;
        this.f11463 = c5015.f11463;
        this.f11468 = c5015.f11468;
        this.f11465 = c5015.f11465;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5015 m10668() {
        return new C5015(this);
    }

    public C5015(C14677 c14677) {
        int iM33581 = c14677.m33581();
        this.f11469 = (iM33581 & 1) != 0;
        this.f11471 = (iM33581 & 2) != 0;
        this.f11462 = (iM33581 & 4) != 0;
        this.f11466 = (iM33581 & 8) != 0;
        this.f11467 = (iM33581 & 16) != 0;
        this.f11470 = (iM33581 & 32) != 0;
        this.f11473 = (iM33581 & 64) != 0;
        this.f11472 = (iM33581 & 128) != 0;
        this.f11463 = (iM33581 & 256) != 0;
        String[] strArrSplit = c14677.m33586().split("\\|");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            C12826.requireNonNull(str);
            arrayList.add(str);
        }
        this.f11468 = C21562.unmodifiableList(arrayList);
        String[] strArrSplit2 = c14677.m33586().split("\\|");
        ArrayList arrayList2 = new ArrayList(strArrSplit2.length);
        for (String str2 : strArrSplit2) {
            C12826.requireNonNull(str2);
            arrayList2.add(str2);
        }
        this.f11465 = C21562.unmodifiableList(arrayList2);
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
    /* JADX INFO: renamed from: ֫ */
    public final void m10669(C11996 c11996) {
        boolean z = this.f11471;
        boolean z2 = this.f11469;
        ?? r1 = z2;
        if (z) {
            r1 = (z2 ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (this.f11462) {
            r2 = (r1 == true ? 1 : 0) | 4;
        }
        ?? r3 = r2;
        if (this.f11466) {
            r3 = (r2 == true ? 1 : 0) | 8;
        }
        ?? r4 = r3;
        if (this.f11467) {
            r4 = (r3 == true ? 1 : 0) | 16;
        }
        ?? r5 = r4;
        if (this.f11470) {
            r5 = (r4 == true ? 1 : 0) | 32;
        }
        ?? r6 = r5;
        if (this.f11473) {
            r6 = (r5 == true ? 1 : 0) | 64;
        }
        ?? r7 = r6;
        if (this.f11472) {
            r7 = (r6 == true ? 1 : 0) | 128;
        }
        int i = r7;
        if (this.f11463) {
            i = (r7 == true ? 1 : 0) | 256;
        }
        c11996.mo15113(i);
        c11996.m27462(C11567.m26623(this.f11468, "|"));
        c11996.m27462(C11567.m26623(this.f11465, "|"));
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m10672() {
        ArrayList arrayList = new ArrayList();
        if (this.f11469) {
            arrayList.add("2");
        }
        if (this.f11471) {
            arrayList.add("8");
        }
        if (this.f11462) {
            arrayList.add("10");
        }
        if (this.f11466) {
            arrayList.add("16");
        }
        if (this.f11467) {
            arrayList.add("F");
        }
        if (this.f11470) {
            arrayList.add("E");
        }
        if (this.f11473) {
            arrayList.add("P");
        }
        if (this.f11472) {
            arrayList.add("_");
        }
        if (this.f11463) {
            arrayList.add("'");
        }
        return C11567.m26623(arrayList, "|");
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m10674() {
        return C11567.m26623(this.f11468, "|");
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m10670() {
        return C11567.m26623(this.f11465, "|");
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m10671() {
        return this.f11464;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C9235 m10673() {
        if (this.f11467 || this.f11470) {
            return f11459;
        }
        if (this.f11462) {
            return f11460;
        }
        if (this.f11469 || this.f11471 || this.f11466 || this.f11473) {
            return f11461;
        }
        return C9235.f25001;
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
    /* JADX INFO: renamed from: ֫ */
    public final int m10667(int i, CharSequence charSequence) {
        int iM10659;
        int i2;
        int iM10660;
        int i3;
        char cCharAt;
        int i4;
        int iM106510;
        int iM10661;
        int i5;
        int i6;
        int iM10662;
        int i7;
        int iM10663;
        int i8;
        int iM10664;
        int i9;
        int iM10666;
        this.f11464 = false;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            return -1;
        }
        boolean z = this.f11473;
        boolean z2 = this.f11470;
        boolean z3 = this.f11467;
        boolean z4 = this.f11466;
        boolean z5 = this.f11462;
        boolean z6 = this.f11471;
        boolean z7 = this.f11469;
        if (i == length) {
            if ((z7 || z6 || z5 || z4 || z3 || z2 || z) && !m10663(i, charSequence)) {
                this.f11464 = true;
            }
            return -1;
        }
        if (!m10664(i, charSequence, false)) {
            return -1;
        }
        int length2 = charSequence.length();
        int i10 = i + 1;
        char cCharAt2 = charSequence.charAt(i);
        List list = this.f11468;
        if (cCharAt2 == '0') {
            if (i10 == length2) {
                this.f11464 = z7 || z6 || z5 || z4 || z3 || z2 || z;
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
                    int iM10665 = m10660(charSequence, i11, 2, true);
                    iM10664 = iM10665 == -1 ? -1 : iM10665 + m10661(list, charSequence, i11 + iM10665);
                    if (iM10664 == -1) {
                        if (z6) {
                            if (!z4) {
                                i6 = i + 2;
                                iM10662 = m10660(charSequence, i6, 16, true);
                                if (iM10662 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM10662;
                                    if (z4) {
                                        iM10663 = m10661(list, charSequence, i7) + iM10662;
                                    } else {
                                        iM10663 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM10664 = iM10663;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM10664 = iM10663;
                                        }
                                    }
                                    if (iM10664 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM10664 = -1;
                                if (iM10664 != i8) {
                                }
                                i5 = -1;
                            } else {
                                i6 = i + 2;
                                iM10662 = m10660(charSequence, i6, 16, true);
                                if (iM10662 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM10662;
                                    if (z4) {
                                        iM10663 = m10661(list, charSequence, i7) + iM10662;
                                    } else {
                                        iM10663 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM10664 = iM10663;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM10664 = iM10663;
                                        }
                                    }
                                    if (iM10664 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM10664 = -1;
                                if (iM10664 != i8) {
                                }
                                i5 = -1;
                            }
                            if (z5) {
                                i3 = i + iM10660;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM106510 = m10659(i3 + 1, charSequence, true);
                                        if (iM106510 != -1) {
                                            i2 = iM10660 + 1 + iM106510;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM10661 = m10661(list, charSequence, i3);
                                    if (iM10661 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM10660 + iM10661;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM106510 = m10659(i3 + 1, charSequence, true);
                                        if (iM106510 != -1) {
                                            i2 = iM10660 + 1 + iM106510;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM10661 = m10661(list, charSequence, i3);
                                    if (iM10661 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM10660 + iM10661;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            } else {
                                i3 = i + iM10660;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM106510 = m10659(i3 + 1, charSequence, true);
                                        if (iM106510 != -1) {
                                            i2 = iM10660 + 1 + iM106510;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM10661 = m10661(list, charSequence, i3);
                                    if (iM10661 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM10660 + iM10661;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM106510 = m10659(i3 + 1, charSequence, true);
                                        if (iM106510 != -1) {
                                            i2 = iM10660 + 1 + iM106510;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM10661 = m10661(list, charSequence, i3);
                                    if (iM10661 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM10660 + iM10661;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            }
                        } else {
                            if (!z4) {
                                i6 = i + 2;
                                iM10662 = m10660(charSequence, i6, 16, true);
                                if (iM10662 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM10662;
                                    if (z4) {
                                        iM10663 = m10661(list, charSequence, i7) + iM10662;
                                    } else {
                                        iM10663 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM10664 = iM10663;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM10664 = iM10663;
                                        }
                                    }
                                    if (iM10664 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM10664 = -1;
                                if (iM10664 != i8) {
                                }
                                i5 = -1;
                            } else {
                                i6 = i + 2;
                                iM10662 = m10660(charSequence, i6, 16, true);
                                if (iM10662 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM10662;
                                    if (z4) {
                                        iM10663 = m10661(list, charSequence, i7) + iM10662;
                                    } else {
                                        iM10663 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM10664 = iM10663;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM10664 = iM10663;
                                        }
                                    }
                                    if (iM10664 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM10664 = -1;
                                if (iM10664 != i8) {
                                }
                                i5 = -1;
                            }
                            if (z5) {
                                i3 = i + iM10660;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM106510 = m10659(i3 + 1, charSequence, true);
                                        if (iM106510 != -1) {
                                            i2 = iM10660 + 1 + iM106510;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM10661 = m10661(list, charSequence, i3);
                                    if (iM10661 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM10660 + iM10661;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM106510 = m10659(i3 + 1, charSequence, true);
                                        if (iM106510 != -1) {
                                            i2 = iM10660 + 1 + iM106510;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM10661 = m10661(list, charSequence, i3);
                                    if (iM10661 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM10660 + iM10661;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            } else {
                                i3 = i + iM10660;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM106510 = m10659(i3 + 1, charSequence, true);
                                        if (iM106510 != -1) {
                                            i2 = iM10660 + 1 + iM106510;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM10661 = m10661(list, charSequence, i3);
                                    if (iM10661 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM10660 + iM10661;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM106510 = m10659(i3 + 1, charSequence, true);
                                        if (iM106510 != -1) {
                                            i2 = iM10660 + 1 + iM106510;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM10661 = m10661(list, charSequence, i3);
                                    if (iM10661 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM10660 + iM10661;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            }
                        }
                    }
                    i2 = iM10664 + 2;
                    i5 = -1;
                } else if (z6 || !(cCharAt3 == 'o' || cCharAt3 == 'O')) {
                    if ((!z4 || z) && (cCharAt3 == 'x' || cCharAt3 == 'X')) {
                        i6 = i + 2;
                        iM10662 = m10660(charSequence, i6, 16, true);
                        if (iM10662 == -1) {
                            i8 = -1;
                        } else {
                            i7 = i6 + iM10662;
                            if (z4) {
                                iM10663 = m10661(list, charSequence, i7) + iM10662;
                            } else {
                                iM10663 = -1;
                            }
                            if (z || i7 >= charSequence.length()) {
                                i8 = -1;
                                if (z4) {
                                    iM10664 = iM10663;
                                }
                            } else {
                                int i12 = i7 + 1;
                                char cCharAt4 = charSequence.charAt(i7);
                                if (cCharAt4 == '.') {
                                    int iM10667 = m10660(charSequence, i12, 16, false);
                                    if (iM10667 != -1) {
                                        int i13 = i12 + iM10667;
                                        if (i13 < charSequence.length()) {
                                            int i14 = i13 + 1;
                                            char cCharAt5 = charSequence.charAt(i13);
                                            if (cCharAt5 == 'p' || cCharAt5 == 'P') {
                                                int iM10668 = m10666(i14, charSequence);
                                                iM10666 = iM10668 != -1 ? iM10667 + 1 + iM10668 : -1;
                                                if (iM10666 == i9) {
                                                    i8 = i9;
                                                    if (z4) {
                                                        iM10664 = iM10663;
                                                    }
                                                }
                                            }
                                        }
                                        i9 = -1;
                                        iM10666 = -1;
                                        if (iM10666 == i9) {
                                            i8 = i9;
                                            if (z4) {
                                                iM10664 = iM10663;
                                            }
                                        }
                                    }
                                    i9 = -1;
                                    if (iM10666 == i9) {
                                        i8 = i9;
                                        if (z4) {
                                            iM10664 = iM10663;
                                        }
                                    }
                                } else {
                                    i9 = -1;
                                    if ((cCharAt4 != 'p' && cCharAt4 != 'P') || (iM10666 = m10666(i12, charSequence)) == -1) {
                                        i8 = -1;
                                        if (z4) {
                                            iM10664 = iM10663;
                                        }
                                    }
                                }
                                int i15 = i9;
                                iM10664 = iM10666 + iM10662 + 1;
                                i8 = i15;
                            }
                            if (iM10664 != i8) {
                                i2 = iM10664 + 2;
                            }
                            i5 = -1;
                        }
                        iM10664 = -1;
                        if (iM10664 != i8) {
                            i2 = iM10664 + 2;
                        }
                        i5 = -1;
                    }
                    if ((z5 || z3 || z2) && (iM10660 = m10660(charSequence, i, 10, false)) != -1) {
                        i3 = i + iM10660;
                        if ((!z3 || z2) && i3 < charSequence.length()) {
                            cCharAt = charSequence.charAt(i3);
                            if (cCharAt == '.') {
                                iM106510 = m10659(i3 + 1, charSequence, true);
                                if (iM106510 != -1) {
                                    i2 = iM10660 + 1 + iM106510;
                                }
                                i5 = -1;
                            } else if (!z2 && (cCharAt == 'e' || cCharAt == 'E')) {
                                int iM10669 = m10665(i3 + 1, charSequence);
                                if (iM10669 != -1) {
                                    i4 = iM10660 + 1 + iM10669;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            }
                            iM10661 = m10661(list, charSequence, i3);
                            if ((iM10661 != 0 && (iM10661 = m10661(this.f11465, charSequence, i3)) != 0) || z5) {
                                i4 = iM10660 + iM10661;
                                i2 = i4;
                                i5 = -1;
                            }
                        } else {
                            iM10661 = m10661(list, charSequence, i3);
                            if (iM10661 != 0) {
                            }
                            i4 = iM10660 + iM10661;
                            i2 = i4;
                            i5 = -1;
                        }
                    }
                    i5 = -1;
                    i2 = -1;
                } else {
                    int i16 = i + 2;
                    int iM106610 = m10660(charSequence, i16, 8, true);
                    iM10664 = iM106610 == -1 ? -1 : m10661(list, charSequence, i16 + iM106610) + iM106610;
                    if (iM10664 == -1) {
                        if (!z4) {
                            i6 = i + 2;
                            iM10662 = m10660(charSequence, i6, 16, true);
                            if (iM10662 == -1) {
                                i8 = -1;
                            } else {
                                i7 = i6 + iM10662;
                                if (z4) {
                                    iM10663 = m10661(list, charSequence, i7) + iM10662;
                                } else {
                                    iM10663 = -1;
                                }
                                if (z) {
                                    i8 = -1;
                                    if (z4) {
                                        iM10664 = iM10663;
                                    }
                                } else {
                                    i8 = -1;
                                    if (z4) {
                                        iM10664 = iM10663;
                                    }
                                }
                                if (iM10664 != i8) {
                                }
                                i5 = -1;
                            }
                            iM10664 = -1;
                            if (iM10664 != i8) {
                            }
                            i5 = -1;
                        } else {
                            i6 = i + 2;
                            iM10662 = m10660(charSequence, i6, 16, true);
                            if (iM10662 == -1) {
                                i8 = -1;
                            } else {
                                i7 = i6 + iM10662;
                                if (z4) {
                                    iM10663 = m10661(list, charSequence, i7) + iM10662;
                                } else {
                                    iM10663 = -1;
                                }
                                if (z) {
                                    i8 = -1;
                                    if (z4) {
                                        iM10664 = iM10663;
                                    }
                                } else {
                                    i8 = -1;
                                    if (z4) {
                                        iM10664 = iM10663;
                                    }
                                }
                                if (iM10664 != i8) {
                                }
                                i5 = -1;
                            }
                            iM10664 = -1;
                            if (iM10664 != i8) {
                            }
                            i5 = -1;
                        }
                        if (z5) {
                            i3 = i + iM10660;
                            if (!z3) {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM106510 = m10659(i3 + 1, charSequence, true);
                                    if (iM106510 != -1) {
                                        i2 = iM10660 + 1 + iM106510;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM10661 = m10661(list, charSequence, i3);
                                if (iM10661 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM10660 + iM10661;
                                i2 = i4;
                                i5 = -1;
                            } else {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM106510 = m10659(i3 + 1, charSequence, true);
                                    if (iM106510 != -1) {
                                        i2 = iM10660 + 1 + iM106510;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM10661 = m10661(list, charSequence, i3);
                                if (iM10661 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM10660 + iM10661;
                                i2 = i4;
                                i5 = -1;
                            }
                        } else {
                            i3 = i + iM10660;
                            if (!z3) {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM106510 = m10659(i3 + 1, charSequence, true);
                                    if (iM106510 != -1) {
                                        i2 = iM10660 + 1 + iM106510;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM10661 = m10661(list, charSequence, i3);
                                if (iM10661 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM10660 + iM10661;
                                i2 = i4;
                                i5 = -1;
                            } else {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM106510 = m10659(i3 + 1, charSequence, true);
                                    if (iM106510 != -1) {
                                        i2 = iM10660 + 1 + iM106510;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM10661 = m10661(list, charSequence, i3);
                                if (iM10661 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM10660 + iM10661;
                                i2 = i4;
                                i5 = -1;
                            }
                        }
                    }
                    i2 = iM10664 + 2;
                    i5 = -1;
                }
            }
        } else if (cCharAt2 == '.') {
            if ((z3 || z2) && (iM10659 = m10659(i10, charSequence, false)) != -1) {
                i2 = iM10659 + 1;
                i5 = -1;
            } else {
                i5 = -1;
                i2 = -1;
            }
        } else if (z5) {
            i3 = i + iM10660;
            if (!z3) {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM106510 = m10659(i3 + 1, charSequence, true);
                    if (iM106510 != -1) {
                        i2 = iM10660 + 1 + iM106510;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM10661 = m10661(list, charSequence, i3);
                if (iM10661 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM10660 + iM10661;
                i2 = i4;
                i5 = -1;
            } else {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM106510 = m10659(i3 + 1, charSequence, true);
                    if (iM106510 != -1) {
                        i2 = iM10660 + 1 + iM106510;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM10661 = m10661(list, charSequence, i3);
                if (iM10661 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM10660 + iM10661;
                i2 = i4;
                i5 = -1;
            }
        } else {
            i3 = i + iM10660;
            if (!z3) {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM106510 = m10659(i3 + 1, charSequence, true);
                    if (iM106510 != -1) {
                        i2 = iM10660 + 1 + iM106510;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM10661 = m10661(list, charSequence, i3);
                if (iM10661 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM10660 + iM10661;
                i2 = i4;
                i5 = -1;
            } else {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM106510 = m10659(i3 + 1, charSequence, true);
                    if (iM106510 != -1) {
                        i2 = iM10660 + 1 + iM106510;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM10661 = m10661(list, charSequence, i3);
                if (iM10661 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM10660 + iM10661;
                i2 = i4;
                i5 = -1;
            }
        }
        return (i2 != i5 && m10664(i + i2, charSequence, true)) ? i2 : i5;
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m10666(int i, CharSequence charSequence) {
        char cCharAt;
        int i2 = (i >= charSequence.length() || !((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) ? 0 : 1;
        int iM10660 = m10660(charSequence, i + i2, 10, false);
        if (iM10660 == -1) {
            return -1;
        }
        int i3 = iM10660 + i2;
        return i3 + m10661(this.f11465, charSequence, i + i3);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m10659(int i, CharSequence charSequence, boolean z) {
        int iM10661;
        char cCharAt;
        int i2 = 0;
        int iM10660 = m10660(charSequence, i, 10, false);
        if (iM10660 == -1) {
            if (z) {
            }
            return -1;
        }
        i2 = iM10660;
        int i3 = i + i2;
        if (this.f11470 && i3 < charSequence.length() && ((cCharAt = charSequence.charAt(i3)) == 'e' || cCharAt == 'E')) {
            if (i3 < charSequence.length() - 1) {
                iM10661 = m10665(i3 + 1, charSequence);
                if (iM10661 != -1) {
                    i2++;
                    return i2 + iM10661;
                }
                return -1;
            }
            this.f11464 = true;
        }
        if (this.f11467) {
            iM10661 = m10661(this.f11465, charSequence, i3);
            return i2 + iM10661;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m10665(int i, CharSequence charSequence) {
        char cCharAt;
        int i2 = (i >= charSequence.length() || !((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) ? 0 : 1;
        int iM10660 = m10660(charSequence, i + i2, 10, false);
        if (iM10660 == -1) {
            return -1;
        }
        int i3 = iM10660 + i2;
        return i3 + m10661(this.f11465, charSequence, i + i3);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m10660(CharSequence charSequence, int i, int i2, boolean z) {
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
                    if ((!this.f11472 || cCharAt != '_') && (!this.f11463 || cCharAt != '\'')) {
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
                this.f11464 = true;
                break;
            }
        }
        if (i3 == 0 || z2) {
            return -1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m10661(List list, CharSequence charSequence, int i) {
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
                        this.f11464 = true;
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
    /* JADX INFO: renamed from: ۧ */
    private boolean m10664(int i, CharSequence charSequence, boolean z) {
        boolean z2;
        boolean zM10663 = m10663(i, charSequence);
        if (i < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (z && i == charSequence.length() - 1 && Character.isHighSurrogate((char) iCodePointAt)) {
                this.f11464 = true;
            }
            if (iCodePointAt != 95 && iCodePointAt != 46 && !m10662(iCodePointAt)) {
                if (Character.getType(iCodePointAt) == 6) {
                    while (true) {
                        if (i >= 0) {
                            int iCodePointAt2 = Character.codePointAt(charSequence, i);
                            if (!m10662(iCodePointAt2)) {
                                if (Character.getType(iCodePointAt2) == 6) {
                                    i--;
                                }
                            }
                        }
                    }
                }
            }
            z2 = true;
            if (zM10663 != z2) {
                return true;
            }
            return false;
        }
        if (z && i == charSequence.length()) {
            this.f11464 = true;
        }
        z2 = false;
        if (zM10663 != z2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m10663(int i, CharSequence charSequence) {
        if (i <= 0) {
            return false;
        }
        int iCodePointBefore = Character.codePointBefore(charSequence, i);
        if (iCodePointBefore == 95 || iCodePointBefore == 46 || m10662(iCodePointBefore)) {
            return true;
        }
        if (Character.getType(iCodePointBefore) != 6) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int iCodePointAt = Character.codePointAt(charSequence, i2);
            if (m10662(iCodePointAt)) {
                return true;
            }
            if (Character.getType(iCodePointAt) != 6) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m10662(int i) {
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
