package p067l;

import bin.p000mt.json.JSON;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L79Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C10127 {
    /* JADX INFO: renamed from: ֫ */
    public static String m23607(String str) {
        return str.replace("\r\n", "\n").replace('\r', '\n');
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX INFO: renamed from: ֫ */
    public static C3421 m23608(String str, int i, int i2, int i3, int i4) throws C5276 {
        int i5;
        boolean z;
        boolean z2;
        int i6 = i3;
        C20857[] c20857ArrM23610 = m23610((CharSequence) str);
        int length = c20857ArrM23610.length;
        int iMax = Math.max(0, i);
        if (i2 < 0) {
            throw m23609(i2);
        }
        if (iMax >= length || i6 <= 0 || i4 <= 0) {
            if (i2 != 0) {
                throw m23609(i2);
            }
            return new C3421("", iMax, 0, iMax, 0, 0, length, false, null, null, false);
        }
        if (i2 > c20857ArrM23610[iMax].f65542) {
            throw m23609(i2);
        }
        if (str.length() != 0 || iMax != 0 || i2 != 0) {
            StringBuilder sb = new StringBuilder(Math.min(i4 * 2, 4096));
            int i7 = i2;
            int i8 = iMax;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i8 < length && i9 < i6 && i10 < i4) {
                    C20857 c20857 = c20857ArrM23610[i8];
                    int i11 = c20857.f65542;
                    boolean z3 = c20857.f65544;
                    if (i7 > i11) {
                        throw m23609(i7);
                    }
                    int i12 = i4 - i10;
                    if (i12 > 0) {
                        if (i7 != i11) {
                            int i13 = i11 - i7;
                            int iMin = Math.min(i13, i12);
                            if (iMin > 0) {
                                i5 = i7 + iMin;
                                CharSequence charSequence = c20857.f65543;
                                int i14 = c20857.f65545;
                                sb.append(charSequence, Character.offsetByCodePoints(charSequence, i14, i7), Character.offsetByCodePoints(charSequence, i14, i5));
                                i10 += iMin;
                                i9++;
                                if (iMin < i13) {
                                    z = true;
                                    break;
                                }
                                if (!z3 || i10 >= i4) {
                                    i7 = i5;
                                } else {
                                    sb.append('\n');
                                    i10++;
                                    i8++;
                                    i7 = 0;
                                }
                                i6 = i3;
                            }
                        } else if (z3) {
                            sb.append('\n');
                            i10++;
                            i9++;
                            i8++;
                            i7 = 0;
                        }
                    }
                }
                i5 = i7;
                z = false;
                break;
            }
            if (i8 >= c20857ArrM23610.length) {
                z2 = false;
            } else {
                C20857 c20858 = c20857ArrM23610[i8];
                if (i5 < c20858.f65542 || c20858.f65544) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            return new C3421(sb.toString(), iMax, i2, i8, i5, i9, length, z2, z2 ? Integer.valueOf(i8) : null, z2 ? Integer.valueOf(i5) : null, z);
        }
        return new C3421("", 0, 0, 0, 0, 0, length, false, null, null, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m23609(int i) {
        return C5276.m11406("Invalid lineCharOffset", "lineCharOffset", JSON.value(i), JSON.array(0, Integer.MAX_VALUE), JSON.object());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m23606(int i, int i2, String str) {
        C20857[] c20857ArrM23610 = m23610((CharSequence) str);
        int iMax = Math.max(1, i);
        int iMin = Math.min(i2, c20857ArrM23610.length);
        if (iMax > iMin) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = iMax - 1; i3 < iMin; i3++) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            C20857 c20857 = c20857ArrM23610[i3];
            sb.append(c20857.f65543, c20857.f65545, c20857.f65546);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m23605(int i, int i2, CharSequence charSequence) {
        return m23604(i, charSequence.length(), i2, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0058  */
    /* JADX INFO: renamed from: ֫ */
    public static String m23604(int i, int i2, int i3, CharSequence charSequence) {
        int iM23603 = m23603(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        int iM23604 = m23603(Math.max(iM23603, Math.min(i2, charSequence.length())), charSequence);
        if (i3 <= 0 || iM23603 >= iM23604) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Math.min(i3 * 2, iM23604 - iM23603));
        for (int i4 = 0; iM23603 < iM23604 && i4 < i3; i4++) {
            int i5 = iM23603 + 1;
            char cCharAt = charSequence.charAt(iM23603);
            sb.append(cCharAt);
            if (!Character.isHighSurrogate(cCharAt) || i5 >= iM23604) {
                iM23603 = i5;
            } else {
                char cCharAt2 = charSequence.charAt(i5);
                if (Character.isLowSurrogate(cCharAt2)) {
                    sb.append(cCharAt2);
                    iM23603 += 2;
                } else {
                    iM23603 = i5;
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m23611(int i, int i2, CharSequence charSequence) {
        int iM23603 = m23603(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        if (i2 < 0) {
            for (int i3 = -i2; iM23603 > 0 && i3 > 0; i3--) {
                int i4 = iM23603 - 1;
                iM23603 = (i4 > 0 && Character.isLowSurrogate(charSequence.charAt(i4)) && Character.isHighSurrogate(charSequence.charAt(iM23603 + (-2)))) ? iM23603 - 2 : i4;
            }
            return iM23603;
        }
        if (i2 > 0) {
            while (iM23603 < charSequence.length() && i2 > 0) {
                int i5 = iM23603 + 1;
                iM23603 = (Character.isHighSurrogate(charSequence.charAt(iM23603)) && i5 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i5))) ? iM23603 + 2 : i5;
                i2--;
            }
        }
        return iM23603;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m23613(int i, CharSequence charSequence) {
        int iM23603 = m23603(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        do {
            iM23603--;
            if (iM23603 < 0) {
                return 0;
            }
        } while (charSequence.charAt(iM23603) != '\n');
        return iM23603 + 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m23612(int i, CharSequence charSequence) {
        for (int iM23603 = m23603(Math.max(0, Math.min(i, charSequence.length())), charSequence); iM23603 < charSequence.length(); iM23603++) {
            if (charSequence.charAt(iM23603) == '\n') {
                return iM23603;
            }
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m23603(int i, CharSequence charSequence) {
        if (i > 0 && i < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i))) {
            int i2 = i - 1;
            if (Character.isHighSurrogate(charSequence.charAt(i2))) {
                return i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20857[] m23610(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return new C20857[]{new C20857(charSequence, 0, 0, false)};
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (charSequence.charAt(i2) == '\n') {
                arrayList.add(new C20857(charSequence, i, i2, true));
                i = i2 + 1;
            }
        }
        if (i < charSequence.length()) {
            arrayList.add(new C20857(charSequence, i, charSequence.length(), false));
        }
        return (C20857[]) arrayList.toArray(new C20857[0]);
    }
}
