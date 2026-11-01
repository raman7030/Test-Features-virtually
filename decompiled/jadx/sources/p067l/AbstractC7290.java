package p067l;

import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.ۚۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7290 {

    /* JADX INFO: renamed from: ֫ */
    public String f19049;

    /* JADX INFO: renamed from: ۧ */
    public int f19050;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3895(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ֫ */
    public abstract byte[] mo3896();

    /* JADX INFO: renamed from: ܽ */
    public final int m16746() {
        return this.f19050;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m16745() {
        return this.f19049;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC7290 m16744(int i) throws C11314 {
        if (i == 0) {
            C3266 c3266 = new C3266();
            c3266.f19050 = 0;
            c3266.f19049 = "None";
            return c3266;
        }
        if (i == 1) {
            return new C20702();
        }
        if (i == 4) {
            return new C2595();
        }
        if (i == 10) {
            try {
                return new C9972();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        throw new C11314(C20778.m46922(i, "Unsupported Check ID "));
    }
}
