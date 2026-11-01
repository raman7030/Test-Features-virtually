package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9CL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5144 {

    /* JADX INFO: renamed from: ֫ */
    public final String f12085;

    /* JADX INFO: renamed from: ۧ */
    public final char[] f12086;

    /* JADX INFO: renamed from: ܽ */
    public final String f12087;

    public C5144(String str, char[] cArr, String str2) {
        this.f12087 = str;
        this.f12086 = Arrays.copyOf(cArr, cArr.length);
        this.f12085 = str2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m10985() {
        return this.f12087;
    }

    /* JADX INFO: renamed from: ۧ */
    public final char[] m10984() {
        return this.f12086;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m10983() {
        return this.f12085;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m10987() {
        return this.f12087.isEmpty() && this.f12086.length == 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m10986() {
        return this.f12087.equals("Guest") && this.f12086.length == 0;
    }

    public final String toString() {
        return "AuthenticationContext[" + this.f12087 + '@' + this.f12085 + ']';
    }
}
