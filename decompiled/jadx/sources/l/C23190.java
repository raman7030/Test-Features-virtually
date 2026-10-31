package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28U3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74547;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f74548;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13312 f74549;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f74550;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f74551;

    public C23190(C13312 c13312, boolean z, int[] iArr, boolean[] zArr) {
        int i = c13312.f39854;
        this.f74548 = i;
        boolean z2 = false;
        C22632.m50631(i == iArr.length && i == zArr.length);
        this.f74549 = c13312;
        if (z && i > 1) {
            z2 = true;
        }
        this.f74547 = z2;
        this.f74550 = (int[]) iArr.clone();
        this.f74551 = (boolean[]) zArr.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13312 m51438() {
        return this.f74549;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353 m51437(int i) {
        return this.f74549.m32295(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51439(int i, boolean z) {
        int i2 = this.f74550[i];
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m51442() {
        for (boolean z : this.f74551) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m51443() {
        for (int i = 0; i < this.f74550.length; i++) {
            if (m51439(i, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51441(int i) {
        return this.f74551[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m51440() {
        return this.f74549.f39853;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23190.class == obj.getClass()) {
            C23190 c23190 = (C23190) obj;
            if (this.f74547 == c23190.f74547 && this.f74549.equals(c23190.f74549) && Arrays.equals(this.f74550, c23190.f74550) && Arrays.equals(this.f74551, c23190.f74551)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f74551) + ((Arrays.hashCode(this.f74550) + (((this.f74549.hashCode() * 31) + (this.f74547 ? 1 : 0)) * 31)) * 31);
    }

    static {
        C3603.m11056(0);
        C3603.m11056(1);
        C3603.m11056(3);
        C3603.m11056(4);
    }
}
