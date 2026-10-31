package l;

import bin.mt.json.JSON;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L79Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C8163 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21638(String str) {
        return str.replace("\r\n", "\n").replace('\r', '\n');
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1107 m21639(String str, int i, int i2, int i3, int i4) throws C3059 {
        int i5;
        boolean z;
        boolean z2;
        int i6 = i3;
        C19453[] c19453ArrM21641 = m21641((CharSequence) str);
        int length = c19453ArrM21641.length;
        int iMax = Math.max(0, i);
        if (i2 < 0) {
            throw m21640(i2);
        }
        if (iMax >= length || i6 <= 0 || i4 <= 0) {
            if (i2 != 0) {
                throw m21640(i2);
            }
            return new C1107("", iMax, 0, iMax, 0, 0, length, false, null, null, false);
        }
        if (i2 > c19453ArrM21641[iMax].f62925) {
            throw m21640(i2);
        }
        if (str.length() != 0 || iMax != 0 || i2 != 0) {
            StringBuilder sb = new StringBuilder(Math.min(i4 * 2, 4096));
            int i7 = i2;
            int i8 = iMax;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i8 < length && i9 < i6 && i10 < i4) {
                    C19453 c19453 = c19453ArrM21641[i8];
                    int i11 = c19453.f62925;
                    boolean z3 = c19453.f62927;
                    if (i7 > i11) {
                        throw m21640(i7);
                    }
                    int i12 = i4 - i10;
                    if (i12 > 0) {
                        if (i7 != i11) {
                            int i13 = i11 - i7;
                            int iMin = Math.min(i13, i12);
                            if (iMin > 0) {
                                i5 = i7 + iMin;
                                CharSequence charSequence = c19453.f62926;
                                int i14 = c19453.f62928;
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
            if (i8 >= c19453ArrM21641.length) {
                z2 = false;
            } else {
                C19453 c19454 = c19453ArrM21641[i8];
                if (i5 < c19454.f62925 || c19454.f62927) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            return new C1107(sb.toString(), iMax, i2, i8, i5, i9, length, z2, z2 ? Integer.valueOf(i8) : null, z2 ? Integer.valueOf(i5) : null, z);
        }
        return new C1107("", 0, 0, 0, 0, 0, length, false, null, null, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m21640(int i) {
        return C3059.m9364("Invalid lineCharOffset", "lineCharOffset", JSON.value(i), JSON.array(0, Integer.MAX_VALUE), JSON.object());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21637(int i, int i2, String str) {
        C19453[] c19453ArrM21641 = m21641((CharSequence) str);
        int iMax = Math.max(1, i);
        int iMin = Math.min(i2, c19453ArrM21641.length);
        if (iMax > iMin) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = iMax - 1; i3 < iMin; i3++) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            C19453 c19453 = c19453ArrM21641[i3];
            sb.append(c19453.f62926, c19453.f62928, c19453.f62929);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21636(int i, int i2, CharSequence charSequence) {
        return m21635(i, charSequence.length(), i2, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0058  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21635(int i, int i2, int i3, CharSequence charSequence) {
        int iM21634 = m21634(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        int iM21635 = m21634(Math.max(iM21634, Math.min(i2, charSequence.length())), charSequence);
        if (i3 <= 0 || iM21634 >= iM21635) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Math.min(i3 * 2, iM21635 - iM21634));
        for (int i4 = 0; iM21634 < iM21635 && i4 < i3; i4++) {
            int i5 = iM21634 + 1;
            char cCharAt = charSequence.charAt(iM21634);
            sb.append(cCharAt);
            if (!Character.isHighSurrogate(cCharAt) || i5 >= iM21635) {
                iM21634 = i5;
            } else {
                char cCharAt2 = charSequence.charAt(i5);
                if (Character.isLowSurrogate(cCharAt2)) {
                    sb.append(cCharAt2);
                    iM21634 += 2;
                } else {
                    iM21634 = i5;
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m21642(int i, int i2, CharSequence charSequence) {
        int iM21634 = m21634(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        if (i2 < 0) {
            for (int i3 = -i2; iM21634 > 0 && i3 > 0; i3--) {
                int i4 = iM21634 - 1;
                iM21634 = (i4 > 0 && Character.isLowSurrogate(charSequence.charAt(i4)) && Character.isHighSurrogate(charSequence.charAt(iM21634 + (-2)))) ? iM21634 - 2 : i4;
            }
            return iM21634;
        }
        if (i2 > 0) {
            while (iM21634 < charSequence.length() && i2 > 0) {
                int i5 = iM21634 + 1;
                iM21634 = (Character.isHighSurrogate(charSequence.charAt(iM21634)) && i5 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i5))) ? iM21634 + 2 : i5;
                i2--;
            }
        }
        return iM21634;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m21644(int i, CharSequence charSequence) {
        int iM21634 = m21634(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        do {
            iM21634--;
            if (iM21634 < 0) {
                return 0;
            }
        } while (charSequence.charAt(iM21634) != '\n');
        return iM21634 + 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m21643(int i, CharSequence charSequence) {
        for (int iM21634 = m21634(Math.max(0, Math.min(i, charSequence.length())), charSequence); iM21634 < charSequence.length(); iM21634++) {
            if (charSequence.charAt(iM21634) == '\n') {
                return iM21634;
            }
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21634(int i, CharSequence charSequence) {
        if (i > 0 && i < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i))) {
            int i2 = i - 1;
            if (Character.isHighSurrogate(charSequence.charAt(i2))) {
                return i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19453[] m21641(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return new C19453[]{new C19453(charSequence, 0, 0, false)};
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (charSequence.charAt(i2) == '\n') {
                arrayList.add(new C19453(charSequence, i, i2, true));
                i = i2 + 1;
            }
        }
        if (i < charSequence.length()) {
            arrayList.add(new C19453(charSequence, i, charSequence.length(), false));
        }
        return (C19453[]) arrayList.toArray(new C19453[0]);
    }
}
