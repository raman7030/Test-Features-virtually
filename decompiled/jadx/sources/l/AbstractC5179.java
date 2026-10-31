package l;

import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.ۚۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5179 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f16208;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f16209;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo1497(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ֫ */
    public abstract byte[] mo1498();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m14836() {
        return this.f16209;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m14835() {
        return this.f16208;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5179 m14834(int i) throws C9413 {
        if (i == 0) {
            C0945 c0945 = new C0945();
            c0945.f16209 = 0;
            c0945.f16208 = "None";
            return c0945;
        }
        if (i == 1) {
            return new C19291();
        }
        if (i == 4) {
            return new C0239();
        }
        if (i == 10) {
            try {
                return new C8001();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        throw new C9413(C19370.m44628(i, "Unsupported Check ID "));
    }
}
