package p067l;

import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: l.۫ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6XM */
/* JADX INFO: loaded from: classes3.dex */
public final class C14254 {

    /* JADX INFO: renamed from: ֫ */
    public final char[] f40591 = new char[8192];

    /* JADX INFO: renamed from: ۧ */
    public int f40592;

    /* JADX INFO: renamed from: ܽ */
    public int f40593;

    /* JADX INFO: renamed from: ᩳ */
    public final InputStreamReader f40594;

    public C14254(InputStreamReader inputStreamReader) {
        this.f40594 = inputStreamReader;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m32764(C14254 c14254) throws IOException {
        int iM32762 = c14254.m32762();
        if (iM32762 < 0) {
            return -1;
        }
        char c = (char) iM32762;
        if (Character.isLowSurrogate(c)) {
            throw new C8219();
        }
        if (!Character.isHighSurrogate(c)) {
            return iM32762;
        }
        int iM32763 = c14254.m32762();
        if (iM32763 >= 0) {
            char c2 = (char) iM32763;
            if (Character.isLowSurrogate(c2)) {
                return Character.toCodePoint(c, c2);
            }
        }
        throw new C8219();
    }

    /* JADX INFO: renamed from: ֫ */
    private int m32762() throws IOException {
        int i;
        do {
            int i2 = this.f40593;
            int i3 = this.f40592;
            char[] cArr = this.f40591;
            if (i2 >= i3) {
                i = this.f40594.read(cArr);
                this.f40592 = i;
                this.f40593 = 0;
            } else {
                this.f40593 = i2 + 1;
                return cArr[i2];
            }
        } while (i >= 0);
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32763(C14254 c14254) throws IOException {
        char c;
        char[] cArr = c14254.f40591;
        do {
            boolean z = false;
            while (true) {
                int i = c14254.f40593;
                if (i < c14254.f40592) {
                    c14254.f40593 = i + 1;
                    c = cArr[i];
                    if (z) {
                        break;
                    }
                    if (Character.isLowSurrogate(c)) {
                        throw new C8219();
                    }
                    if (Character.isHighSurrogate(c)) {
                        z = true;
                    }
                } else {
                    int i2 = c14254.f40594.read(cArr);
                    c14254.f40592 = i2;
                    c14254.f40593 = 0;
                    if (i2 < 0) {
                        if (z) {
                            throw new C8219();
                        }
                        return;
                    }
                }
            }
        } while (Character.isLowSurrogate(c));
        throw new C8219();
    }
}
