package l;

/* JADX INFO: renamed from: l.۟᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T8FC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7708 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20625(int i, int i2, String str, byte[] bArr) {
        int i3;
        if (str.length() == i2 && i >= 0 && (i3 = i2 + i) <= bArr.length) {
            int i4 = 0;
            while (true) {
                int i5 = i + i4;
                int i6 = i5 + 3;
                if (i6 < i3) {
                    char cCharAt = str.charAt(i4);
                    char cCharAt2 = str.charAt(i4 + 1);
                    char cCharAt3 = str.charAt(i4 + 2);
                    char cCharAt4 = str.charAt(i4 + 3);
                    if (cCharAt > 127 || cCharAt2 > 127 || cCharAt3 > 127 || cCharAt4 > 127 || ((byte) cCharAt) != bArr[i5] || ((byte) cCharAt2) != bArr[i5 + 1] || ((byte) cCharAt3) != bArr[i5 + 2] || ((byte) cCharAt4) != bArr[i6]) {
                        break;
                    }
                    i4 += 4;
                } else {
                    while (true) {
                        int i7 = i + i4;
                        if (i7 >= i3) {
                            return true;
                        }
                        char cCharAt5 = str.charAt(i4);
                        if (cCharAt5 > 127 || ((byte) cCharAt5) != bArr[i7]) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return false;
    }
}
