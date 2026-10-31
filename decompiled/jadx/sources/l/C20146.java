package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes4.dex */
public final class C20146 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C20146 f65246 = new C20146();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46403(int i, int i2) throws IOException {
        if (i <= 0 || i2 <= 0 || i > 1000000 || i2 > 1000000 || ((long) i) * ((long) i2) > 268435456) {
            throw new IOException("Image dimensions exceed safe decode limits");
        }
    }
}
