package l;

import java.util.Random;

/* JADX INFO: renamed from: l.ۚ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48BN */
/* JADX INFO: loaded from: classes2.dex */
public final class C5554 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f17178 = new Random().nextInt();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m15709() {
        long j = (this.f17178 * 6364136223846793005L) + 1442695040888963407L;
        this.f17178 = j;
        return ((double) ((int) (j >> 32))) * 4.6566128730773926E-10d;
    }
}
