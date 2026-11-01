package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.֫ۨۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4082 {

    /* JADX INFO: renamed from: ۜ */
    public final CharSequence f8992;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f8993;

    /* JADX INFO: renamed from: ۧ */
    public C20438 f8994;

    /* JADX INFO: renamed from: ܳ */
    public final String f8995;

    /* JADX INFO: renamed from: ܽ */
    public long f8996;

    /* JADX INFO: renamed from: ᩷ */
    public final int f8999;

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayList f9000 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f8998 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f8991 = new ArrayList();

    /* JADX INFO: renamed from: ܿ */
    public String f8997 = "//__MTSX_FORMAT_DIRECTIVE_";

    public C4082(int i, CharSequence charSequence, boolean z) {
        String str;
        this.f8992 = charSequence;
        this.f8993 = z;
        this.f8999 = i;
        int i2 = 0;
        while (i2 < charSequence.length() && charSequence.charAt(i2) != '\r' && charSequence.charAt(i2) != '\n') {
            i2++;
        }
        if (i2 >= charSequence.length() || charSequence.charAt(i2) != '\r') {
            str = "\n";
        } else {
            int i3 = i2 + 1;
            str = (i3 >= charSequence.length() || charSequence.charAt(i3) != '\n') ? "\r" : "\r\n";
        }
        this.f8995 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0132  */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:103:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x013e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0146  */
    /* JADX WARN: Code duplicated, block: B:109:0x014a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:155:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0115  */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    /* JADX WARN: Code duplicated, block: B:96:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x0130  */
    /* JADX INFO: renamed from: ֫ */
    public static void m8192(CharSequence charSequence, boolean z, int i, C20438 c20438) throws InterruptedException {
        int i2;
        String strM10523;
        C15323 c15323;
        C24041 c24041;
        C4082 c4082 = new C4082(i, charSequence, z);
        int i3 = 0;
        C24041 c24042 = null;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            CharSequence charSequence2 = c4082.f8992;
            int length = charSequence2.length();
            ArrayList arrayList = c4082.f9000;
            if (i3 >= length) {
                if (c24042 != null) {
                    throw new C12800(i5, 0, "Unclosed #if block");
                }
                arrayList.add(new C9289(new C14847(i4, charSequence2.length(), charSequence2), null, null));
                while (C4965.m10521(c4082.f8997, charSequence2, 0) >= 0) {
                    c4082.f8997 = C10965.m25286(new StringBuilder(), c4082.f8997, "_");
                }
                if (arrayList.size() == 1) {
                    C18834.m42899(charSequence, z, i, c20438);
                    return;
                }
                C20438 c20438M46121 = c20438.m46121();
                try {
                    c4082.f8994 = c20438M46121;
                    c4082.m8194(c20438);
                    c20438M46121.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c20438M46121.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            m8191();
            int i6 = i3;
            while (i6 < charSequence2.length() && charSequence2.charAt(i6) != '\r' && charSequence2.charAt(i6) != '\n') {
                if ((i6 & 4095) == 0) {
                    m8191();
                }
                char cCharAt = charSequence2.charAt(i6);
                if (!Character.isWhitespace(cCharAt) && cCharAt != ',') {
                    c4082.f8996++;
                }
                i6++;
            }
            if (i6 < charSequence2.length()) {
                i2 = i6 + 1;
                if (charSequence2.charAt(i6) == '\r' && i2 < charSequence2.length() && charSequence2.charAt(i2) == '\n') {
                    i2 = i6 + 2;
                }
            } else {
                i2 = i6;
            }
            for (int i7 = i3; i7 < i6; i7++) {
                char cCharAt2 = charSequence2.charAt(i7);
                if (cCharAt2 != ' ' && cCharAt2 != '\t' && cCharAt2 != '\f') {
                    if (i7 == i6 && charSequence2.charAt(i7) == '#') {
                        int i8 = i7 + 1;
                        int i9 = i8;
                        while (i9 < i6 && !Character.isWhitespace(charSequence2.charAt(i9))) {
                            i9++;
                        }
                        strM10523 = C4965.m10523(i8, i9, charSequence2);
                        strM10523.getClass();
                        switch (strM10523) {
                            case "if":
                            case "elif":
                            case "else":
                            case "endif":
                            case "error":
                                break;
                            default:
                                strM10523 = null;
                                break;
                        }
                    } else {
                        strM10523 = null;
                    }
                    if (strM10523 != null) {
                        int i10 = i6;
                        arrayList.add(new C9289(new C14847(i4, i3, charSequence2), c24042, null));
                        if (c24042 == null) {
                            c15323 = null;
                        } else {
                            c15323 = c24042.f76371;
                        }
                        switch (strM10523) {
                            case "if":
                                if (c24042 == null && c24042.f76370 >= 128) {
                                    throw new C12800(i5, 0, "Directive nesting limit exceeded");
                                }
                                ArrayList arrayList2 = c4082.f8998;
                                c15323 = new C15323(arrayList2.size(), c24042);
                                arrayList2.add(c15323);
                                c24041 = new C24041(c15323, 0);
                                break;
                                break;
                            case "elif":
                            case "else":
                            case "endif":
                                if (c15323 != null) {
                                    throw new C12800(i5, 0, "Unexpected #".concat(strM10523));
                                }
                                c24041 = c15323.f43728;
                                if (!strM10523.equals("endif")) {
                                    if (!c15323.f43726) {
                                        c15323.f43725++;
                                    }
                                    c24042 = c24041;
                                } else {
                                    if (!c15323.f43726) {
                                        throw new C12800(i5, 0, C6988.m16053("Unexpected #", strM10523, " after #else"));
                                    }
                                    c15323.f43726 = strM10523.equals("else");
                                    int i11 = c15323.f43725;
                                    c15323.f43725 = i11 + 1;
                                    c24041 = new C24041(c15323, i11);
                                    c24042 = c24041;
                                }
                                break;
                                break;
                            default:
                                c15323 = null;
                                c24041 = c24042;
                                break;
                        }
                        C9289 c9289 = new C9289(new C14847(i3, i2, charSequence2), c24042, strM10523);
                        c9289.f25246 = C4965.m10523(i7, i10, charSequence2);
                        c9289.f25247 = c15323;
                        arrayList.add(c9289);
                        c24042 = c24041;
                        i4 = i2;
                    }
                    i5++;
                    i3 = i2;
                }
            }
            if (i7 == i6) {
                strM10523 = null;
            } else {
                strM10523 = null;
            }
            if (strM10523 != null) {
                int i12 = i6;
                arrayList.add(new C9289(new C14847(i4, i3, charSequence2), c24042, null));
                if (c24042 == null) {
                    c15323 = null;
                } else {
                    c15323 = c24042.f76371;
                }
                switch (strM10523) {
                    case 3357:
                        if (!strM10523.equals("if")) {
                        }
                        break;
                    case 3116036:
                        if (!strM10523.equals("elif")) {
                        }
                        break;
                    case 3116345:
                        if (!strM10523.equals("else")) {
                        }
                        break;
                    case 96652088:
                        if (!strM10523.equals("endif")) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instruction units count: 620
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p067l.C4082.m8192(java.lang.CharSequence, boolean, int, l.ᩴ᩷ܿ):void");
            }

            /* JADX INFO: renamed from: ֫ */
            private void m8194(C20438 c20438) throws InterruptedException {
                char cCharAt;
                ArrayList<C15323> arrayList = this.f8998;
                int size = arrayList.size();
                int[] iArr = new int[size];
                m8195(iArr);
                for (C15323 c15323 : arrayList) {
                    for (int i = 0; i < c15323.f43725 && m8197(); i++) {
                        Arrays.fill(iArr, 0);
                        iArr[c15323.f43729] = i;
                        C24041 c24041 = c15323.f43728;
                        while (c24041 != null) {
                            C15323 c15324 = c24041.f76371;
                            iArr[c15324.f43729] = c24041.f76369;
                            c24041 = c15324.f43728;
                        }
                        m8195(iArr);
                    }
                    if (!m8197()) {
                        break;
                    }
                }
                Arrays.fill(iArr, 0);
                loop3: while (m8197()) {
                    int i2 = size - 1;
                    while (true) {
                        if (i2 < 0) {
                            break loop3;
                        }
                        int i3 = iArr[i2] + 1;
                        iArr[i2] = i3;
                        if (i3 < ((C15323) arrayList.get(i2)).f43725) {
                            break;
                        }
                        iArr[i2] = 0;
                        i2--;
                    }
                    m8195(iArr);
                }
                for (C9289 c9289 : this.f9000) {
                    String str = c9289.f25244;
                    C14847 c14847 = c9289.f25249;
                    if (str == null) {
                        C14847 c14848 = c9289.f25248;
                        if (c14848 != null) {
                            c14847 = c14848;
                        }
                        c20438.append((CharSequence) c14847);
                    } else {
                        C15323 c15325 = c9289.f25247;
                        String str2 = c15325 == null ? c9289.f25245 : c15325.f43727;
                        if (str2 == null) {
                            c20438.append((CharSequence) c14847);
                        } else {
                            c20438.append((CharSequence) str2).append((CharSequence) c9289.f25246);
                            if (c14847.length() != 0 && ((cCharAt = c14847.charAt(c14847.length() - 1)) == '\r' || cCharAt == '\n')) {
                                c20438.append((CharSequence) this.f8995);
                            }
                        }
                    }
                }
            }

            /* JADX INFO: renamed from: ֫ */
            private void m8195(int[] iArr) throws InterruptedException {
                char c;
                char cCharAt;
                ArrayList arrayList = this.f9000;
                m8191();
                if (m8197()) {
                    ArrayList arrayList2 = this.f8991;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (Arrays.equals((int[]) it.next(), iArr)) {
                            return;
                        }
                    }
                    arrayList2.add((int[]) iArr.clone());
                    C20438 c20438M46121 = this.f8994.m46121();
                    try {
                        C20438 c20438M46122 = this.f8994.m46121();
                        int i = 0;
                        while (true) {
                            try {
                                c = '\n';
                                boolean z = true;
                                if (i >= arrayList.size()) {
                                    try {
                                        break;
                                    } catch (C12800 unused) {
                                        c20438M46122.close();
                                        c20438M46121.close();
                                        return;
                                    }
                                }
                                m8191();
                                C9289 c9289 = (C9289) arrayList.get(i);
                                String str = c9289.f25244;
                                C14847 c14847 = c9289.f25249;
                                if (str == null) {
                                    if (m8196(c9289.f25243, iArr)) {
                                        c20438M46121.append((CharSequence) c14847);
                                    }
                                } else {
                                    c20438M46121.append((CharSequence) (this.f8997 + i + "__"));
                                    if (c14847.length() == 0 || ((cCharAt = c14847.charAt(c14847.length() - 1)) != '\r' && cCharAt != '\n')) {
                                        z = false;
                                    }
                                    if (z) {
                                        c20438M46121.append((CharSequence) this.f8995);
                                    }
                                }
                                i++;
                            } catch (Throwable th) {
                                try {
                                    c20438M46122.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                            try {
                                c20438M46121.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                        C18834.m42899(c20438M46121, this.f8993, this.f8999, c20438M46122);
                        int i2 = 0;
                        int i3 = 1;
                        while (i3 < arrayList.size()) {
                            m8191();
                            C9289 c92810 = (C9289) arrayList.get(i3);
                            String str2 = this.f8997 + i3 + "__";
                            int iM10521 = C4965.m10521(str2, c20438M46122, i2);
                            int i4 = iM10521;
                            while (i4 > i2) {
                                char cCharAt2 = c20438M46122.charAt(i4 - 1);
                                if (cCharAt2 == '\r' || cCharAt2 == c) {
                                    break;
                                } else {
                                    i4--;
                                }
                            }
                            int i5 = i4;
                            m8193((C9289) arrayList.get(i3 - 1), iArr, c20438M46122, i2, i5);
                            if (m8196(c92810.f25243, iArr) && c92810.f25245 == null) {
                                c92810.f25245 = C4965.m10523(i5, iM10521, c20438M46122);
                                if (c92810.f25244.equals("if")) {
                                    C15323 c15323 = c92810.f25247;
                                    if (c15323.f43727 == null) {
                                        c15323.f43727 = c92810.f25245;
                                    }
                                }
                            }
                            int length = iM10521 + str2.length();
                            if (length < c20438M46122.length() && c20438M46122.charAt(length) == '\r') {
                                length++;
                            }
                            if (length < c20438M46122.length() && c20438M46122.charAt(length) == '\n') {
                                length++;
                            }
                            i2 = length;
                            i3 += 2;
                            c = '\n';
                        }
                        m8193((C9289) arrayList.get(arrayList.size() - 1), iArr, c20438M46122, i2, c20438M46122.length());
                        c20438M46122.close();
                        c20438M46121.close();
                    } catch (Throwable th4) {
                        c20438M46121.close();
                        throw th4;
                    }
                }
            }

            /* JADX INFO: renamed from: ֫ */
            private void m8193(C9289 c9289, int[] iArr, C20438 c20438, int i, int i2) {
                if (c9289.f25248 == null && m8196(c9289.f25243, iArr)) {
                    int length = this.f8994.length();
                    this.f8994.m46122(i, i2, c20438);
                    C20438 c20439 = this.f8994;
                    c9289.f25248 = new C14847(length, c20439.length(), c20439);
                }
            }

            /* JADX INFO: renamed from: ۧ */
            private boolean m8197() {
                return ((long) this.f8991.size()) < Math.max(1L, Math.min(64L, X931RNG.BLOCK128_RESEED_MAX / Math.max(1L, this.f8996)));
            }

            /* JADX INFO: renamed from: ֫ */
            public static boolean m8196(C24041 c24041, int[] iArr) {
                while (c24041 != null) {
                    C15323 c15323 = c24041.f76371;
                    if (iArr[c15323.f43729] != c24041.f76369) {
                        return false;
                    }
                    c24041 = c15323.f43728;
                }
                return true;
            }

            /* JADX INFO: renamed from: ֫ */
            public static void m8191() throws InterruptedException {
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
            }
        }
