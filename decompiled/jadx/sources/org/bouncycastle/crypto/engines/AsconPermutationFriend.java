package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.digests.ISAPDigest;
import org.bouncycastle.util.Longs;

/* JADX INFO: loaded from: classes.dex */
public class AsconPermutationFriend {

    public class AsconPermutation {

        /* JADX INFO: renamed from: x0 */
        public long f80983x0;

        /* JADX INFO: renamed from: x1 */
        public long f80984x1;

        /* JADX INFO: renamed from: x2 */
        public long f80985x2;

        /* JADX INFO: renamed from: x3 */
        public long f80986x3;

        /* JADX INFO: renamed from: x4 */
        public long f80987x4;

        /* JADX INFO: renamed from: p */
        public void m55366p(int i) {
            if (i == 12) {
                round(240L);
                round(225L);
                round(210L);
                round(195L);
            }
            if (i >= 8) {
                round(180L);
                round(165L);
            }
            round(150L);
            round(135L);
            round(120L);
            round(105L);
            round(90L);
            round(75L);
        }

        public void round(long j) {
            long j2 = this.f80985x2 ^ j;
            this.f80985x2 = j2;
            long j3 = this.f80983x0;
            long j4 = this.f80987x4;
            long j5 = j3 ^ j4;
            long j6 = this.f80984x1;
            long j7 = j6 ^ j2;
            long j8 = j6 | j2;
            long j9 = this.f80986x3;
            long j10 = ((j9 ^ j8) ^ j3) ^ (j6 & j5);
            long j11 = ((j2 & j6) & j9) ^ (j5 ^ (j8 | j9));
            long j12 = ((~j9) & j4) ^ j7;
            long j13 = j7 ^ (j3 | (j9 ^ j4));
            long j14 = ((j4 | j6) ^ j9) ^ (j3 & j6);
            this.f80983x0 = Longs.rotateRight(j10, 28) ^ (Longs.rotateRight(j10, 19) ^ j10);
            this.f80984x1 = Longs.rotateRight(j11, 61) ^ (Longs.rotateRight(j11, 39) ^ j11);
            this.f80985x2 = ~((Longs.rotateRight(j12, 1) ^ j12) ^ Longs.rotateRight(j12, 6));
            this.f80986x3 = (Longs.rotateRight(j13, 10) ^ j13) ^ Longs.rotateRight(j13, 17);
            this.f80987x4 = (Longs.rotateRight(j14, 7) ^ j14) ^ Longs.rotateRight(j14, 41);
        }

        public void set(long j, long j2, long j3, long j4, long j5) {
            this.f80983x0 = j;
            this.f80984x1 = j2;
            this.f80985x2 = j3;
            this.f80986x3 = j4;
            this.f80987x4 = j5;
        }
    }

    public static AsconPermutation getAsconPermutation(ISAPDigest.Friend friend) {
        if (friend != null) {
            return new AsconPermutation();
        }
        throw new NullPointerException("This method is only for use by ISAPDigest or Ascon Digest");
    }
}
