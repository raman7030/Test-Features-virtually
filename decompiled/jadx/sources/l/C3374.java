package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۗܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1L1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3374 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10308(int i) {
        if (i == 95) {
            return false;
        }
        if (i >= 33 && i <= 47) {
            return true;
        }
        if (i >= 58 && i <= 64) {
            return true;
        }
        if (i < 91 || i > 96) {
            return i >= 123 && i <= 126;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m10309(int i, int i2, CharSequence charSequence) {
        while (i < i2 && C11250.m27828(charSequence.charAt(i))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m10305(int i, int i2, CharSequence charSequence) {
        while (i < i2 && C11250.m27828(charSequence.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22340 m10307(List list, List list2, int i, int i2, int i3, int i4) {
        int i5 = i;
        for (int i6 = i2; i5 < i3 && i6 < i4 && C11003.equals(list.get(i5), list2.get(i6)); i6++) {
            i5++;
        }
        int i7 = i5 - i;
        int i8 = i + i7;
        int i9 = i2 + i7;
        int i10 = i3;
        for (int i11 = i4; i8 < i10 && i9 < i11 && C11003.equals(list.get(i10 - 1), list2.get(i11 - 1)); i11--) {
            i10--;
        }
        int i12 = i3 - i10;
        return new C22340(i8, i3 - i12, i9, i4 - i12);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m10306(CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (i5 < i3 && i2 < i4) {
            if (!(charSequence.charAt(i5) == charSequence2.charAt(i2)) || !C11250.m27828(charSequence.charAt(i5))) {
                break;
            }
            i5++;
            i2++;
        }
        return i5 - i;
    }
}
