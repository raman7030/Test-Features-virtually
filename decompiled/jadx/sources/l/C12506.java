package l;

import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: l.۫ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6XM */
/* JADX INFO: loaded from: classes3.dex */
public final class C12506 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] f37567 = new char[8192];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f37568;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f37569;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InputStreamReader f37570;

    public C12506(InputStreamReader inputStreamReader) {
        this.f37570 = inputStreamReader;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m30689(C12506 c12506) throws IOException {
        int iM30687 = c12506.m30687();
        if (iM30687 < 0) {
            return -1;
        }
        char c = (char) iM30687;
        if (Character.isLowSurrogate(c)) {
            throw new C6156();
        }
        if (!Character.isHighSurrogate(c)) {
            return iM30687;
        }
        int iM30688 = c12506.m30687();
        if (iM30688 >= 0) {
            char c2 = (char) iM30688;
            if (Character.isLowSurrogate(c2)) {
                return Character.toCodePoint(c, c2);
            }
        }
        throw new C6156();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m30687() throws IOException {
        int i;
        do {
            int i2 = this.f37569;
            int i3 = this.f37568;
            char[] cArr = this.f37567;
            if (i2 >= i3) {
                i = this.f37570.read(cArr);
                this.f37568 = i;
                this.f37569 = 0;
            } else {
                this.f37569 = i2 + 1;
                return cArr[i2];
            }
        } while (i >= 0);
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30688(C12506 c12506) throws IOException {
        char c;
        char[] cArr = c12506.f37567;
        do {
            boolean z = false;
            while (true) {
                int i = c12506.f37569;
                if (i < c12506.f37568) {
                    c12506.f37569 = i + 1;
                    c = cArr[i];
                    if (z) {
                        break;
                    }
                    if (Character.isLowSurrogate(c)) {
                        throw new C6156();
                    }
                    if (Character.isHighSurrogate(c)) {
                        z = true;
                    }
                } else {
                    int i2 = c12506.f37570.read(cArr);
                    c12506.f37568 = i2;
                    c12506.f37569 = 0;
                    if (i2 < 0) {
                        if (z) {
                            throw new C6156();
                        }
                        return;
                    }
                }
            }
        } while (Character.isLowSurrogate(c));
        throw new C6156();
    }
}
