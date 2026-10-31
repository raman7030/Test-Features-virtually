package l;

/* JADX INFO: renamed from: l.ۧ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11265 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC13896 m27877(char[] cArr, int i, boolean z) {
        int i2;
        C7547 c2092 = z ? new C2092(i) : new C7547();
        int[] iArr = new int[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = i4 + 1;
            iArr[i4] = i3;
            do {
                char c = cArr[i3];
                if (c == '\r' || c == '\n') {
                    if (c != '\r' || (i2 = i3 + 1) >= i || cArr[i2] != '\n') {
                        i3++;
                        break;
                    }
                    i3 += 2;
                    break;
                }
                if (c == '\t') {
                    c2092.mo6872(i3);
                }
                i3++;
            } while (i3 < i);
            i4 = i5;
        }
        int[] iArr2 = new int[i4];
        c2092.f23319 = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, i4);
        return c2092;
    }
}
