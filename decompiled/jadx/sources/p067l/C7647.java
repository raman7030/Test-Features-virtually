package p067l;

import java.util.Random;

/* JADX INFO: renamed from: l.ۚ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48BN */
/* JADX INFO: loaded from: classes2.dex */
public final class C7647 {

    /* JADX INFO: renamed from: ֫ */
    public long f20019 = new Random().nextInt();

    /* JADX INFO: renamed from: ֫ */
    public final double m17623() {
        long j = (this.f20019 * 6364136223846793005L) + 1442695040888963407L;
        this.f20019 = j;
        return ((double) ((int) (j >> 32))) * 4.6566128730773926E-10d;
    }
}
