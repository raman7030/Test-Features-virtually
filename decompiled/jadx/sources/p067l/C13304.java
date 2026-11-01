package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S737 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13304 {

    /* JADX INFO: renamed from: ֫ */
    public final String f37360;

    /* JADX INFO: renamed from: ۧ */
    public final String f37361;

    /* JADX INFO: renamed from: ܽ */
    public final long f37362;

    /* JADX INFO: renamed from: ᩳ */
    public final String f37363;

    public C13304(long j, String str, String str2, String str3) {
        this.f37362 = j;
        this.f37360 = str;
        this.f37361 = str2;
        this.f37363 = str3;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m30379() {
        return this.f37362;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m30375() {
        return this.f37360;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m30377() {
        return this.f37361;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m30380() {
        return this.f37363;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C13304 m30378(String str) {
        return new C13304(this.f37362, this.f37360, this.f37361, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30376(String str) throws IOException {
        String str2 = this.f37363;
        if (str2 != null && !str2.equals(str)) {
            throw new IOException("Remote payload metadata changed since it was opened");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30374(C13304 c13304, C13304 c13305) throws IOException {
        String str = c13304.f37361;
        String str2 = c13304.f37360;
        long j = c13304.f37362;
        long j2 = c13305.f37362;
        String str3 = c13305.f37360;
        if (j != j2) {
            throw new IOException("Remote resource length changed since it was opened");
        }
        if (C24032.m53269(str2)) {
            if (!str2.equals(str3)) {
                throw new IOException("Remote resource ETag changed since it was opened");
            }
        } else {
            if (str != null && !str.equals(c13305.f37361)) {
                throw new IOException("Remote resource Last-Modified changed since it was opened");
            }
            if (str == null && str2 != null && !str2.equals(str3)) {
                throw new IOException("Remote resource ETag changed since it was opened");
            }
        }
    }
}
