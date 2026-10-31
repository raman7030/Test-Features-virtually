package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6OB */
/* JADX INFO: loaded from: classes.dex */
public final class C23634 implements CharSequence {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f76573;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f76574 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f76575;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m52124(char c) {
        if (c == '_') {
            return true;
        }
        if (c < 'a' || c > 'z') {
            return (c >= 'A' && c <= 'Z') || c >= 128;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0220  */
    /* JADX WARN: Code duplicated, block: B:171:0x0286  */
    /* JADX WARN: Code duplicated, block: B:175:0x0299  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:189:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:194:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:208:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x027e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    public C23634(CharSequence charSequence) {
        CharSequence charSequence2;
        int i;
        int length;
        char cCharAt;
        int length2;
        int iMin;
        char cCharAt2;
        int i2;
        int length3;
        int i3;
        this.f76573 = charSequence;
        boolean z = false;
        int i4 = 0;
        while (i4 < charSequence.length()) {
            m52123();
            int i5 = 2;
            if (C2732.m8477(charSequence, z, i4, "<?", 2)) {
                CharSequence charSequence3 = this.f76573;
                int i6 = i4 + 5;
                if (C2732.m8477(charSequence3, true, i4, "<?xml", 5) && i6 < charSequence3.length() && AbstractC12406.m30574(charSequence3.charAt(i6))) {
                    while (i6 < charSequence3.length() && AbstractC12406.m30574(charSequence3.charAt(i6))) {
                        m52123();
                        i6++;
                    }
                    if (C2732.m8477(this.f76573, z, i6, "version", 7)) {
                        int i7 = i6 + 7;
                        while (i7 < charSequence3.length() && AbstractC12406.m30574(charSequence3.charAt(i7))) {
                            m52123();
                            i7++;
                        }
                        if (i7 >= charSequence3.length() || charSequence3.charAt(i7) != '=') {
                            int i8 = i4 + 2;
                            charSequence2 = this.f76573;
                            i = i8;
                            while (true) {
                                if (i < charSequence2.length()) {
                                    m52123();
                                    cCharAt = charSequence2.charAt(i);
                                    if (!C2732.m8477(this.f76573, z, i, "?>", i5)) {
                                        if (cCharAt != '\'') {
                                            while (true) {
                                                i++;
                                                if (i < charSequence2.length()) {
                                                    m52123();
                                                    cCharAt2 = charSequence2.charAt(i);
                                                    if (cCharAt2 == '\\') {
                                                        int i9 = i + 1;
                                                        if (i9 < charSequence2.length()) {
                                                        }
                                                    } else if (cCharAt2 == cCharAt) {
                                                        length2 = i + 1;
                                                        break;
                                                    } else if (cCharAt != '\'') {
                                                        continue;
                                                    }
                                                }
                                                length2 = charSequence2.length();
                                                break;
                                            }
                                            iMin = length2 - 1;
                                        } else {
                                            while (true) {
                                                i++;
                                                if (i < charSequence2.length()) {
                                                    m52123();
                                                    cCharAt2 = charSequence2.charAt(i);
                                                    if (cCharAt2 == '\\') {
                                                        int i10 = i + 1;
                                                        if (i10 < charSequence2.length()) {
                                                        }
                                                    } else if (cCharAt2 == cCharAt) {
                                                        length2 = i + 1;
                                                        break;
                                                    } else if (cCharAt != '\'') {
                                                        continue;
                                                    }
                                                }
                                                length2 = charSequence2.length();
                                                break;
                                            }
                                            iMin = length2 - 1;
                                        }
                                        i = iMin + 1;
                                        z = false;
                                    }
                                    length = i + 2;
                                    if (length < charSequence.length()) {
                                        length++;
                                    }
                                    if (length < charSequence.length()) {
                                        length++;
                                    }
                                    this.f76574.add(new C14461(i4, length));
                                    i4 = length - 1;
                                }
                                length = charSequence2.length();
                                if (length < charSequence.length()) {
                                    length++;
                                }
                                if (length < charSequence.length()) {
                                    length++;
                                }
                                this.f76574.add(new C14461(i4, length));
                                i4 = length - 1;
                            }
                        }
                    } else {
                        int i11 = i4 + 2;
                        charSequence2 = this.f76573;
                        i = i11;
                        while (true) {
                            if (i < charSequence2.length()) {
                                m52123();
                                cCharAt = charSequence2.charAt(i);
                                if (!C2732.m8477(this.f76573, z, i, "?>", i5)) {
                                    if (cCharAt != '\'') {
                                        while (true) {
                                            i++;
                                            if (i < charSequence2.length()) {
                                                m52123();
                                                cCharAt2 = charSequence2.charAt(i);
                                                if (cCharAt2 == '\\') {
                                                    int i12 = i + 1;
                                                    if (i12 < charSequence2.length()) {
                                                    }
                                                } else if (cCharAt2 == cCharAt) {
                                                    length2 = i + 1;
                                                    break;
                                                } else if (cCharAt != '\'') {
                                                    continue;
                                                }
                                            }
                                            length2 = charSequence2.length();
                                            break;
                                        }
                                        iMin = length2 - 1;
                                    } else {
                                        while (true) {
                                            i++;
                                            if (i < charSequence2.length()) {
                                                m52123();
                                                cCharAt2 = charSequence2.charAt(i);
                                                if (cCharAt2 == '\\') {
                                                    int i13 = i + 1;
                                                    if (i13 < charSequence2.length()) {
                                                    }
                                                } else if (cCharAt2 == cCharAt) {
                                                    length2 = i + 1;
                                                    break;
                                                } else if (cCharAt != '\'') {
                                                    continue;
                                                }
                                            }
                                            length2 = charSequence2.length();
                                            break;
                                        }
                                        iMin = length2 - 1;
                                    }
                                    i = iMin + 1;
                                    z = false;
                                }
                                length = i + 2;
                                if (length < charSequence.length()) {
                                    length++;
                                }
                                if (length < charSequence.length()) {
                                    length++;
                                }
                                this.f76574.add(new C14461(i4, length));
                                i4 = length - 1;
                            }
                            length = charSequence2.length();
                            if (length < charSequence.length()) {
                                length++;
                            }
                            if (length < charSequence.length()) {
                                length++;
                            }
                            this.f76574.add(new C14461(i4, length));
                            i4 = length - 1;
                        }
                    }
                } else {
                    int i14 = i4 + 2;
                    charSequence2 = this.f76573;
                    i = i14;
                    while (true) {
                        if (i < charSequence2.length()) {
                            m52123();
                            cCharAt = charSequence2.charAt(i);
                            if (!C2732.m8477(this.f76573, z, i, "?>", i5)) {
                                if (cCharAt != '\'' || cCharAt == '\"' || cCharAt == '`') {
                                    while (true) {
                                        i++;
                                        if (i < charSequence2.length()) {
                                            m52123();
                                            cCharAt2 = charSequence2.charAt(i);
                                            if (cCharAt2 == '\\') {
                                                int i15 = i + 1;
                                                i = i15 < charSequence2.length() ? i15 : i;
                                            } else if (cCharAt2 == cCharAt) {
                                                length2 = i + 1;
                                                break;
                                            } else if (cCharAt != '\'' || !m52125(i)) {
                                            }
                                        }
                                        length2 = charSequence2.length();
                                        break;
                                    }
                                    iMin = length2 - 1;
                                } else if (C2732.m8477(this.f76573, z, i, "/*", i5)) {
                                    int i16 = i + 2;
                                    while (i16 < charSequence2.length() && !C2732.m8477(this.f76573, z, i16, "*/", i5)) {
                                        m52123();
                                        i16++;
                                    }
                                    iMin = Math.min(charSequence2.length(), i16 + 2) - 1;
                                } else {
                                    if (C2732.m8477(this.f76573, z, i, "//", i5) || (cCharAt == '#' && !C2732.m8477(this.f76573, z, i, "#[", i5))) {
                                        while (true) {
                                            if (i < charSequence2.length() && charSequence2.charAt(i) != '\r' && charSequence2.charAt(i) != '\n') {
                                                m52123();
                                                if (!C2732.m8477(this.f76573, false, i, "?>", 2)) {
                                                    i++;
                                                }
                                            }
                                        }
                                    } else {
                                        if (C2732.m8477(this.f76573, z, i, "<<<", 3)) {
                                            int iM52126 = m52126(i + 3);
                                            char cCharAt3 = iM52126 < charSequence2.length() ? charSequence2.charAt(iM52126) : (char) 0;
                                            boolean z2 = cCharAt3 == '\'' || cCharAt3 == '\"';
                                            iM52126 = z2 ? iM52126 + 1 : iM52126;
                                            if (iM52126 == charSequence2.length() || !m52124(charSequence2.charAt(iM52126))) {
                                                length3 = charSequence2.length();
                                            } else {
                                                int i17 = iM52126;
                                                while (i17 < charSequence2.length() && m52122(charSequence2.charAt(i17))) {
                                                    m52123();
                                                    i17++;
                                                }
                                                if (z2) {
                                                    if (i17 != charSequence2.length()) {
                                                        i3 = i17 + 1;
                                                        if (charSequence2.charAt(i17) != cCharAt3) {
                                                        }
                                                    }
                                                    length3 = charSequence2.length();
                                                } else {
                                                    i3 = i17;
                                                }
                                                int iM52127 = m52126(i3);
                                                if (iM52127 == charSequence2.length() || !(charSequence2.charAt(iM52127) == '\r' || charSequence2.charAt(iM52127) == '\n')) {
                                                    length3 = charSequence2.length();
                                                } else {
                                                    int i18 = iM52127 + 1;
                                                    if (charSequence2.charAt(iM52127) == '\r' && i18 < charSequence2.length() && charSequence2.charAt(i18) == '\n') {
                                                        i18 = iM52127 + 2;
                                                    }
                                                    while (true) {
                                                        if (i18 < charSequence2.length()) {
                                                            m52123();
                                                            int iM52128 = m52126(i18);
                                                            int i19 = (iM52128 + i17) - iM52126;
                                                            if (i19 <= charSequence2.length()) {
                                                                int i20 = iM52126;
                                                                while (true) {
                                                                    if (i20 < i17) {
                                                                        m52123();
                                                                        int i21 = iM52128 + 1;
                                                                        if (charSequence2.charAt(iM52128) == charSequence2.charAt(i20)) {
                                                                            i20++;
                                                                            iM52128 = i21;
                                                                        }
                                                                    } else {
                                                                        length3 = (i19 == charSequence2.length() || !m52122(charSequence2.charAt(i19))) ? i19 : length3;
                                                                    }
                                                                }
                                                            }
                                                            while (true) {
                                                                if (i18 < charSequence2.length() && charSequence2.charAt(i18) != '\r' && charSequence2.charAt(i18) != '\n') {
                                                                    m52123();
                                                                    if (cCharAt3 == '\'' || !m52125(i18)) {
                                                                        i18++;
                                                                    }
                                                                } else if (i18 < charSequence2.length()) {
                                                                    int i22 = i18 + 1;
                                                                    i18 = (charSequence2.charAt(i18) == '\r' && i22 < charSequence2.length() && charSequence2.charAt(i22) == '\n') ? i18 + 2 : i22;
                                                                }
                                                            }
                                                        }
                                                        length3 = charSequence2.length();
                                                    }
                                                }
                                            }
                                            iMin = length3 - 1;
                                        } else if ((i == i14 || !m52122(charSequence2.charAt(i - 1))) && C2732.m8477(this.f76573, true, i, "__halt_compiler", 15) && ((i2 = i + 15) == charSequence2.length() || !m52122(charSequence2.charAt(i2)))) {
                                        }
                                        i5 = 2;
                                    }
                                    iMin = i;
                                    i5 = 2;
                                }
                                i = iMin + 1;
                                z = false;
                            }
                            length = i + 2;
                            if (length < charSequence.length() && charSequence.charAt(length) == '\r') {
                                length++;
                            }
                            if (length < charSequence.length() && charSequence.charAt(length) == '\n') {
                                length++;
                            }
                            this.f76574.add(new C14461(i4, length));
                            i4 = length - 1;
                        }
                        length = charSequence2.length();
                        if (length < charSequence.length()) {
                            length++;
                        }
                        if (length < charSequence.length()) {
                            length++;
                        }
                        this.f76574.add(new C14461(i4, length));
                        i4 = length - 1;
                    }
                }
            }
            i4++;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m52125(int i) {
        CharSequence charSequence = this.f76573;
        return C2732.m8477(charSequence, false, i, "{$", 2) || C2732.m8477(charSequence, false, i, "${", 2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m52127() {
        return this.f76574.isEmpty() ? this.f76573 : this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52128(int i, int i2) {
        ArrayList arrayList = this.f76574;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = (i3 + size) >>> 1;
            if (((C14461) arrayList.get(i4)).f44311 <= i) {
                i3 = i4 + 1;
            } else {
                size = i4;
            }
        }
        return i3 < arrayList.size() && ((C14461) arrayList.get(i3)).f44312 < i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m52126(int i) {
        while (true) {
            CharSequence charSequence = this.f76573;
            if (i >= charSequence.length() || !(charSequence.charAt(i) == ' ' || charSequence.charAt(i) == '\t')) {
                break;
            }
            m52123();
            i++;
        }
        return i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i >= 0) {
            CharSequence charSequence = this.f76573;
            if (i < charSequence.length()) {
                if (m52128(i, i + 1)) {
                    return 'x';
                }
                return charSequence.charAt(i);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f76573.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C13130(i, i2, this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52122(char c) {
        if (m52124(c)) {
            return true;
        }
        return c >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52123() {
        int i = this.f76575 + 1;
        this.f76575 = i;
        if ((i & 1023) == 0) {
            C20813.m47630();
        }
    }
}
