package p067l;

import bin.p000mt.json.JSON;

/* JADX INFO: renamed from: l.ܽܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7AT */
/* JADX INFO: loaded from: classes4.dex */
public final class C18317 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f54721;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f54722;

    /* JADX INFO: renamed from: ܽ */
    public final String f54723;

    /* JADX INFO: renamed from: ܿ */
    public final String f54724;

    /* JADX INFO: renamed from: ᩳ */
    public final C13259 f54725;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m41751(char c) {
        return c == '.' || c == '/';
    }

    public C18317(C13259 c13259, String str, boolean z, String str2, boolean z2) {
        this.f54725 = c13259;
        this.f54724 = str;
        this.f54721 = z;
        this.f54723 = str2;
        this.f54722 = z2;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x01bd A[PHI: r7 r8 r11 r12 r13 r16
      0x01bd: PHI (r7v6 boolean) = 
      (r7v1 boolean)
      (r7v1 boolean)
      (r7v1 boolean)
      (r7v1 boolean)
      (r7v1 boolean)
      (r7v1 boolean)
      (r7v1 boolean)
      (r7v5 boolean)
      (r7v5 boolean)
      (r7v1 boolean)
      (r7v1 boolean)
     binds: [B:139:0x01b8, B:105:0x016d, B:107:0x0175, B:165:0x01bd, B:166:0x01bd, B:167:0x01bd, B:164:0x01bd, B:95:0x0142, B:97:0x0148, B:48:0x00d2, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r8v9 boolean) = 
      (r8v1 boolean)
      (r8v1 boolean)
      (r8v1 boolean)
      (r8v1 boolean)
      (r8v1 boolean)
      (r8v1 boolean)
      (r8v1 boolean)
      (r8v5 boolean)
      (r8v5 boolean)
      (r8v1 boolean)
      (r8v1 boolean)
     binds: [B:139:0x01b8, B:105:0x016d, B:107:0x0175, B:165:0x01bd, B:166:0x01bd, B:167:0x01bd, B:164:0x01bd, B:95:0x0142, B:97:0x0148, B:48:0x00d2, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r11v7 boolean) = 
      (r11v1 boolean)
      (r11v1 boolean)
      (r11v1 boolean)
      (r11v1 boolean)
      (r11v1 boolean)
      (r11v1 boolean)
      (r11v1 boolean)
      (r11v4 boolean)
      (r11v4 boolean)
      (r11v1 boolean)
      (r11v1 boolean)
     binds: [B:139:0x01b8, B:105:0x016d, B:107:0x0175, B:165:0x01bd, B:166:0x01bd, B:167:0x01bd, B:164:0x01bd, B:95:0x0142, B:97:0x0148, B:48:0x00d2, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r12v7 boolean) = 
      (r12v1 boolean)
      (r12v1 boolean)
      (r12v1 boolean)
      (r12v1 boolean)
      (r12v1 boolean)
      (r12v1 boolean)
      (r12v1 boolean)
      (r12v5 boolean)
      (r12v5 boolean)
      (r12v1 boolean)
      (r12v1 boolean)
     binds: [B:139:0x01b8, B:105:0x016d, B:107:0x0175, B:165:0x01bd, B:166:0x01bd, B:167:0x01bd, B:164:0x01bd, B:95:0x0142, B:97:0x0148, B:48:0x00d2, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r13v6 boolean) = 
      (r13v1 boolean)
      (r13v1 boolean)
      (r13v1 boolean)
      (r13v1 boolean)
      (r13v1 boolean)
      (r13v1 boolean)
      (r13v1 boolean)
      (r13v4 boolean)
      (r13v4 boolean)
      (r13v1 boolean)
      (r13v1 boolean)
     binds: [B:139:0x01b8, B:105:0x016d, B:107:0x0175, B:165:0x01bd, B:166:0x01bd, B:167:0x01bd, B:164:0x01bd, B:95:0x0142, B:97:0x0148, B:48:0x00d2, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r16v1 boolean) = 
      (r16v0 boolean)
      (r16v0 boolean)
      (r16v0 boolean)
      (r16v0 boolean)
      (r16v0 boolean)
      (r16v0 boolean)
      (r16v0 boolean)
      (r16v0 boolean)
      (r16v0 boolean)
      (r16v4 boolean)
      (r16v4 boolean)
     binds: [B:139:0x01b8, B:105:0x016d, B:107:0x0175, B:165:0x01bd, B:166:0x01bd, B:167:0x01bd, B:164:0x01bd, B:95:0x0142, B:97:0x0148, B:48:0x00d2, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x014a A[PHI: r7 r8 r11 r12 r13 r16
      0x014a: PHI (r7v7 boolean) = (r7v5 boolean), (r7v1 boolean) binds: [B:97:0x0148, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r8v10 boolean) = (r8v5 boolean), (r8v1 boolean) binds: [B:97:0x0148, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r11v8 boolean) = (r11v4 boolean), (r11v1 boolean) binds: [B:97:0x0148, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r12v8 boolean) = (r12v5 boolean), (r12v1 boolean) binds: [B:97:0x0148, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r13v7 boolean) = (r13v4 boolean), (r13v1 boolean) binds: [B:97:0x0148, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r16v2 boolean) = (r16v0 boolean), (r16v4 boolean) binds: [B:97:0x0148, B:49:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static C18317 m41750(String str, String str2, String str3, boolean z) throws C5276 {
        boolean z2;
        char cCharAt;
        int i;
        boolean z3;
        if (!"literal".equals(str2) && !"regex".equals(str2)) {
            throw C5276.m11406("Invalid queryType", "queryType", JSON.value(str2), JSON.array("literal", "regex"), JSON.object().add("queryType", "literal"));
        }
        if (!"contains".equals(str3) && !"exact".equals(str3)) {
            throw C5276.m11406("Invalid matchMode", "matchMode", JSON.value(str3), JSON.array("contains", "exact"), JSON.object().add("matchMode", "contains"));
        }
        int i2 = "regex".equals(str2) ? 8 : 16;
        if (!z) {
            i2 |= 66;
        }
        if ("literal".equals(str2)) {
            int i3 = 0;
            while (true) {
                if (i3 < str.length()) {
                    if (!m41751(str.charAt(i3))) {
                        i3++;
                    }
                }
            }
        } else {
            int i4 = 0;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (true) {
                if (i4 < str.length()) {
                    char cCharAt2 = str.charAt(i4);
                    if (z4) {
                        if (cCharAt2 == '\\') {
                            int i5 = i4 + 1;
                            z2 = z4;
                            if (i5 < str.length() && str.charAt(i5) == 'E') {
                                i4 = i5;
                                z4 = false;
                            }
                            i4++;
                        } else {
                            z2 = z4;
                        }
                        if (!m41751(cCharAt2) || z8) {
                            if (!m41751(cCharAt2) || z9) {
                                z4 = z2;
                            } else {
                                z4 = z2;
                                z13 = true;
                            }
                            i4++;
                        }
                    } else {
                        z2 = z4;
                        if (z5) {
                            if (z6) {
                                z7 = false;
                            }
                            if (!m41751(cCharAt2) || z6) {
                                if (m41751(cCharAt2) && !z10) {
                                    z13 = true;
                                }
                                if (cCharAt2 == 'Q') {
                                    z4 = true;
                                    z8 = z6;
                                    z9 = z10;
                                } else {
                                    z4 = z2;
                                }
                                z5 = false;
                                i4++;
                            }
                        } else {
                            if (cCharAt2 == '\\') {
                                z4 = z2;
                                z5 = true;
                            } else if (z6) {
                                if (z7 && cCharAt2 == '^') {
                                    z10 = true;
                                } else {
                                    if (cCharAt2 == ']') {
                                        if (z10 || z11 || z12 || !z13) {
                                            z6 = false;
                                        }
                                    } else if (cCharAt2 == '&' && (i = i4 + 1) < str.length() && str.charAt(i) == '&') {
                                        z11 = true;
                                    } else if (cCharAt2 == '[') {
                                        z12 = true;
                                    }
                                    if (z10 && m41751(cCharAt2)) {
                                        z4 = z2;
                                        z13 = true;
                                    } else {
                                        z4 = z2;
                                    }
                                }
                                z7 = false;
                                if (z10) {
                                }
                                z4 = z2;
                            } else if (cCharAt2 == '[') {
                                z4 = z2;
                                z6 = true;
                                z7 = true;
                                z10 = false;
                                z11 = false;
                                z12 = false;
                                z13 = false;
                            } else {
                                if (cCharAt2 == '(') {
                                    int i6 = i4 + 1;
                                    if (i6 < str.length() && str.charAt(i6) == '?') {
                                        int i7 = i4 + 2;
                                        while (true) {
                                            if (i7 < str.length() && (cCharAt = str.charAt(i7)) != ')' && cCharAt != ':') {
                                                if (cCharAt != 'x') {
                                                    if (cCharAt == '-' || cCharAt == 'i' || cCharAt == 'm' || cCharAt == 's' || cCharAt == 'd' || cCharAt == 'u' || cCharAt == 'c' || cCharAt == 'U') {
                                                        i7++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    z3 = cCharAt2 == '/';
                                }
                                z4 = z2;
                            }
                            i4++;
                        }
                    }
                }
            }
        }
        try {
            return new C18317(C13259.m30303(i2, str), str2, z, str3, z3);
        } catch (C14599 unused) {
            throw C5276.m11406("Invalid query", "query", JSON.value(str), JSON.array(), JSON.object().add("query", "AndroidManifest"));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12954 m41753() {
        C13929 c13929Matcher = this.f54725.matcher((CharSequence) "");
        c13929Matcher.m56474setTimeoutMillis(500);
        return new C12954(this, c13929Matcher);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m41752(C5276 c5276) {
        String str = c5276.f12413;
        return "REGEX_TIMEOUT".equals(str) || "REGEX_RESOURCE_LIMIT".equals(str);
    }
}
