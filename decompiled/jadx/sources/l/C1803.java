package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.֫ۨۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1803 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final CharSequence f6213;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f6214;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19012 f6215;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f6216;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f6217;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f6220;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f6221 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6219 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f6212 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f6218 = "//__MTSX_FORMAT_DIRECTIVE_";

    public C1803(int i, CharSequence charSequence, boolean z) {
        String str;
        this.f6213 = charSequence;
        this.f6214 = z;
        this.f6220 = i;
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
        this.f6216 = str;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5995(CharSequence charSequence, boolean z, int i, C19012 c19012) throws InterruptedException {
        int i2;
        String strM8476;
        C13631 c13631;
        C22804 c22804;
        C1803 c1803 = new C1803(i, charSequence, z);
        int i3 = 0;
        C22804 c22805 = null;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            CharSequence charSequence2 = c1803.f6213;
            int length = charSequence2.length();
            ArrayList arrayList = c1803.f6221;
            if (i3 >= length) {
                if (c22805 != null) {
                    throw new C10976(i5, 0, "Unclosed #if block");
                }
                arrayList.add(new C7282(new C13130(i4, charSequence2.length(), charSequence2), null, null));
                while (C2732.m8474(c1803.f6218, charSequence2, 0) >= 0) {
                    c1803.f6218 = C9045.m23341(new StringBuilder(), c1803.f6218, "_");
                }
                if (arrayList.size() == 1) {
                    C17325.m40648(charSequence, z, i, c19012);
                    return;
                }
                C19012 c19012M43853 = c19012.m43853();
                try {
                    c1803.f6215 = c19012M43853;
                    c1803.m5997(c19012);
                    c19012M43853.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c19012M43853.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            m5994();
            int i6 = i3;
            while (i6 < charSequence2.length() && charSequence2.charAt(i6) != '\r' && charSequence2.charAt(i6) != '\n') {
                if ((i6 & 4095) == 0) {
                    m5994();
                }
                char cCharAt = charSequence2.charAt(i6);
                if (!Character.isWhitespace(cCharAt) && cCharAt != ',') {
                    c1803.f6217++;
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
                        strM8476 = C2732.m8476(i8, i9, charSequence2);
                        strM8476.getClass();
                        switch (strM8476) {
                            case "if":
                            case "elif":
                            case "else":
                            case "endif":
                            case "error":
                                break;
                            default:
                                strM8476 = null;
                                break;
                        }
                    } else {
                        strM8476 = null;
                    }
                    if (strM8476 != null) {
                        int i10 = i6;
                        arrayList.add(new C7282(new C13130(i4, i3, charSequence2), c22805, null));
                        if (c22805 == null) {
                            c13631 = null;
                        } else {
                            c13631 = c22805.f73641;
                        }
                        switch (strM8476) {
                            case "if":
                                if (c22805 == null && c22805.f73640 >= 128) {
                                    throw new C10976(i5, 0, "Directive nesting limit exceeded");
                                }
                                ArrayList arrayList2 = c1803.f6219;
                                c13631 = new C13631(arrayList2.size(), c22805);
                                arrayList2.add(c13631);
                                c22804 = new C22804(c13631, 0);
                                break;
                                break;
                            case "elif":
                            case "else":
                            case "endif":
                                if (c13631 != null) {
                                    throw new C10976(i5, 0, "Unexpected #".concat(strM8476));
                                }
                                c22804 = c13631.f40648;
                                if (!strM8476.equals("endif")) {
                                    if (!c13631.f40646) {
                                        c13631.f40645++;
                                    }
                                    c22805 = c22804;
                                } else {
                                    if (!c13631.f40646) {
                                        throw new C10976(i5, 0, C4860.m14172("Unexpected #", strM8476, " after #else"));
                                    }
                                    c13631.f40646 = strM8476.equals("else");
                                    int i11 = c13631.f40645;
                                    c13631.f40645 = i11 + 1;
                                    c22804 = new C22804(c13631, i11);
                                    c22805 = c22804;
                                }
                                break;
                                break;
                            default:
                                c13631 = null;
                                c22804 = c22805;
                                break;
                        }
                        C7282 c7282 = new C7282(new C13130(i3, i2, charSequence2), c22805, strM8476);
                        c7282.f22355 = C2732.m8476(i7, i10, charSequence2);
                        c7282.f22356 = c13631;
                        arrayList.add(c7282);
                        c22805 = c22804;
                        i4 = i2;
                    }
                    i5++;
                    i3 = i2;
                }
            }
            if (i7 == i6) {
                strM8476 = null;
            } else {
                strM8476 = null;
            }
            if (strM8476 != null) {
                int i12 = i6;
                arrayList.add(new C7282(new C13130(i4, i3, charSequence2), c22805, null));
                if (c22805 == null) {
                    c13631 = null;
                } else {
                    c13631 = c22805.f73641;
                }
                switch (strM8476) {
                    case 3357:
                        if (!strM8476.equals("if")) {
                        }
                        break;
                    case 3116036:
                        if (!strM8476.equals("elif")) {
                        }
                        break;
                    case 3116345:
                        if (!strM8476.equals("else")) {
                        }
                        break;
                    case 96652088:
                        if (!strM8476.equals("endif")) {
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
                throw new UnsupportedOperationException("Method not decompiled: l.C1803.m5995(java.lang.CharSequence, boolean, int, l.ᩴ᩷ܿ):void");
            }

            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            private void m5997(C19012 c19012) throws InterruptedException {
                char cCharAt;
                ArrayList<C13631> arrayList = this.f6219;
                int size = arrayList.size();
                int[] iArr = new int[size];
                m5998(iArr);
                for (C13631 c13631 : arrayList) {
                    for (int i = 0; i < c13631.f40645 && m6000(); i++) {
                        Arrays.fill(iArr, 0);
                        iArr[c13631.f40649] = i;
                        C22804 c22804 = c13631.f40648;
                        while (c22804 != null) {
                            C13631 c13632 = c22804.f73641;
                            iArr[c13632.f40649] = c22804.f73639;
                            c22804 = c13632.f40648;
                        }
                        m5998(iArr);
                    }
                    if (!m6000()) {
                        break;
                    }
                }
                Arrays.fill(iArr, 0);
                loop3: while (m6000()) {
                    int i2 = size - 1;
                    while (true) {
                        if (i2 < 0) {
                            break loop3;
                        }
                        int i3 = iArr[i2] + 1;
                        iArr[i2] = i3;
                        if (i3 < ((C13631) arrayList.get(i2)).f40645) {
                            break;
                        }
                        iArr[i2] = 0;
                        i2--;
                    }
                    m5998(iArr);
                }
                for (C7282 c7282 : this.f6221) {
                    String str = c7282.f22353;
                    C13130 c13130 = c7282.f22358;
                    if (str == null) {
                        C13130 c13131 = c7282.f22357;
                        if (c13131 != null) {
                            c13130 = c13131;
                        }
                        c19012.append((CharSequence) c13130);
                    } else {
                        C13631 c13633 = c7282.f22356;
                        String str2 = c13633 == null ? c7282.f22354 : c13633.f40647;
                        if (str2 == null) {
                            c19012.append((CharSequence) c13130);
                        } else {
                            c19012.append((CharSequence) str2).append((CharSequence) c7282.f22355);
                            if (c13130.length() != 0 && ((cCharAt = c13130.charAt(c13130.length() - 1)) == '\r' || cCharAt == '\n')) {
                                c19012.append((CharSequence) this.f6216);
                            }
                        }
                    }
                }
            }

            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            private void m5998(int[] iArr) throws InterruptedException {
                char c;
                char cCharAt;
                ArrayList arrayList = this.f6221;
                m5994();
                if (m6000()) {
                    ArrayList arrayList2 = this.f6212;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (Arrays.equals((int[]) it.next(), iArr)) {
                            return;
                        }
                    }
                    arrayList2.add((int[]) iArr.clone());
                    C19012 c19012M43853 = this.f6215.m43853();
                    try {
                        C19012 c19012M43854 = this.f6215.m43853();
                        int i = 0;
                        while (true) {
                            try {
                                c = '\n';
                                boolean z = true;
                                if (i >= arrayList.size()) {
                                    try {
                                        break;
                                    } catch (C10976 unused) {
                                        c19012M43854.close();
                                        c19012M43853.close();
                                        return;
                                    }
                                }
                                m5994();
                                C7282 c7282 = (C7282) arrayList.get(i);
                                String str = c7282.f22353;
                                C13130 c13130 = c7282.f22358;
                                if (str == null) {
                                    if (m5999(c7282.f22352, iArr)) {
                                        c19012M43853.append((CharSequence) c13130);
                                    }
                                } else {
                                    c19012M43853.append((CharSequence) (this.f6218 + i + "__"));
                                    if (c13130.length() == 0 || ((cCharAt = c13130.charAt(c13130.length() - 1)) != '\r' && cCharAt != '\n')) {
                                        z = false;
                                    }
                                    if (z) {
                                        c19012M43853.append((CharSequence) this.f6216);
                                    }
                                }
                                i++;
                            } catch (Throwable th) {
                                try {
                                    c19012M43854.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                            try {
                                c19012M43853.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                        C17325.m40648(c19012M43853, this.f6214, this.f6220, c19012M43854);
                        int i2 = 0;
                        int i3 = 1;
                        while (i3 < arrayList.size()) {
                            m5994();
                            C7282 c7283 = (C7282) arrayList.get(i3);
                            String str2 = this.f6218 + i3 + "__";
                            int iM8474 = C2732.m8474(str2, c19012M43854, i2);
                            int i4 = iM8474;
                            while (i4 > i2) {
                                char cCharAt2 = c19012M43854.charAt(i4 - 1);
                                if (cCharAt2 == '\r' || cCharAt2 == c) {
                                    break;
                                } else {
                                    i4--;
                                }
                            }
                            int i5 = i4;
                            m5996((C7282) arrayList.get(i3 - 1), iArr, c19012M43854, i2, i5);
                            if (m5999(c7283.f22352, iArr) && c7283.f22354 == null) {
                                c7283.f22354 = C2732.m8476(i5, iM8474, c19012M43854);
                                if (c7283.f22353.equals("if")) {
                                    C13631 c13631 = c7283.f22356;
                                    if (c13631.f40647 == null) {
                                        c13631.f40647 = c7283.f22354;
                                    }
                                }
                            }
                            int length = iM8474 + str2.length();
                            if (length < c19012M43854.length() && c19012M43854.charAt(length) == '\r') {
                                length++;
                            }
                            if (length < c19012M43854.length() && c19012M43854.charAt(length) == '\n') {
                                length++;
                            }
                            i2 = length;
                            i3 += 2;
                            c = '\n';
                        }
                        m5996((C7282) arrayList.get(arrayList.size() - 1), iArr, c19012M43854, i2, c19012M43854.length());
                        c19012M43854.close();
                        c19012M43853.close();
                    } catch (Throwable th4) {
                        c19012M43853.close();
                        throw th4;
                    }
                }
            }

            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            private void m5996(C7282 c7282, int[] iArr, C19012 c19012, int i, int i2) {
                if (c7282.f22357 == null && m5999(c7282.f22352, iArr)) {
                    int length = this.f6215.length();
                    this.f6215.m43854(i, i2, c19012);
                    C19012 c19013 = this.f6215;
                    c7282.f22357 = new C13130(length, c19013.length(), c19013);
                }
            }

            /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
            private boolean m6000() {
                return ((long) this.f6212.size()) < Math.max(1L, Math.min(64L, X931RNG.BLOCK128_RESEED_MAX / Math.max(1L, this.f6217)));
            }

            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public static boolean m5999(C22804 c22804, int[] iArr) {
                while (c22804 != null) {
                    C13631 c13631 = c22804.f73641;
                    if (iArr[c13631.f40649] != c22804.f73639) {
                        return false;
                    }
                    c22804 = c13631.f40648;
                }
                return true;
            }

            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public static void m5994() throws InterruptedException {
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
            }
        }
