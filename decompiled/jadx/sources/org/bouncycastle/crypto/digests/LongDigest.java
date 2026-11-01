package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes.dex */
public abstract class LongDigest implements ExtendedDigest, Memoable, EncodableDigest {
    public static final int BYTE_LENGTH = 128;

    /* JADX INFO: renamed from: K */
    public static final long[] f80835K = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* JADX INFO: renamed from: H1 */
    public long f80836H1;

    /* JADX INFO: renamed from: H2 */
    public long f80837H2;

    /* JADX INFO: renamed from: H3 */
    public long f80838H3;

    /* JADX INFO: renamed from: H4 */
    public long f80839H4;

    /* JADX INFO: renamed from: H5 */
    public long f80840H5;

    /* JADX INFO: renamed from: H6 */
    public long f80841H6;

    /* JADX INFO: renamed from: H7 */
    public long f80842H7;

    /* JADX INFO: renamed from: H8 */
    public long f80843H8;

    /* JADX INFO: renamed from: W */
    public long[] f80844W;
    public long byteCount1;
    public long byteCount2;
    public final CryptoServicePurpose purpose;
    public int wOff;
    public byte[] xBuf;
    public int xBufOff;

    public LongDigest() {
        this(CryptoServicePurpose.ANY);
    }

    public LongDigest(CryptoServicePurpose cryptoServicePurpose) {
        this.xBuf = new byte[8];
        this.f80844W = new long[80];
        this.purpose = cryptoServicePurpose;
        this.xBufOff = 0;
        reset();
    }

    public LongDigest(LongDigest longDigest) {
        this.xBuf = new byte[8];
        this.f80844W = new long[80];
        this.purpose = longDigest.purpose;
        copyIn(longDigest);
    }

    /* JADX INFO: renamed from: Ch */
    private long m55318Ch(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    private long Maj(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    private long Sigma0(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    private long Sigma1(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    private long Sum0(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    private long Sum1(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    private void adjustByteCounts() {
        long j = this.byteCount1;
        if (j > 2305843009213693951L) {
            this.byteCount2 += j >>> 61;
            this.byteCount1 = j & 2305843009213693951L;
        }
    }

    public void copyIn(LongDigest longDigest) {
        byte[] bArr = longDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = longDigest.xBufOff;
        this.byteCount1 = longDigest.byteCount1;
        this.byteCount2 = longDigest.byteCount2;
        this.f80836H1 = longDigest.f80836H1;
        this.f80837H2 = longDigest.f80837H2;
        this.f80838H3 = longDigest.f80838H3;
        this.f80839H4 = longDigest.f80839H4;
        this.f80840H5 = longDigest.f80840H5;
        this.f80841H6 = longDigest.f80841H6;
        this.f80842H7 = longDigest.f80842H7;
        this.f80843H8 = longDigest.f80843H8;
        long[] jArr = longDigest.f80844W;
        System.arraycopy(jArr, 0, this.f80844W, 0, jArr.length);
        this.wOff = longDigest.wOff;
    }

    public abstract CryptoServiceProperties cryptoServiceProperties();

    public void finish() {
        adjustByteCounts();
        long j = this.byteCount1 << 3;
        long j2 = this.byteCount2;
        byte b = GCMSIVBlockCipher.MASK;
        while (true) {
            update(b);
            if (this.xBufOff == 0) {
                processLength(j, j2);
                processBlock();
                return;
            }
            b = 0;
        }
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    public int getEncodedStateSize() {
        return (this.wOff * 8) + 96;
    }

    public void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 8);
        Pack.longToBigEndian(this.byteCount1, bArr, 12);
        Pack.longToBigEndian(this.byteCount2, bArr, 20);
        Pack.longToBigEndian(this.f80836H1, bArr, 28);
        Pack.longToBigEndian(this.f80837H2, bArr, 36);
        Pack.longToBigEndian(this.f80838H3, bArr, 44);
        Pack.longToBigEndian(this.f80839H4, bArr, 52);
        Pack.longToBigEndian(this.f80840H5, bArr, 60);
        Pack.longToBigEndian(this.f80841H6, bArr, 68);
        Pack.longToBigEndian(this.f80842H7, bArr, 76);
        Pack.longToBigEndian(this.f80843H8, bArr, 84);
        Pack.intToBigEndian(this.wOff, bArr, 92);
        for (int i = 0; i < this.wOff; i++) {
            Pack.longToBigEndian(this.f80844W[i], bArr, (i * 8) + 96);
        }
    }

    public void processBlock() {
        adjustByteCounts();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.f80844W;
            long jSigma1 = Sigma1(jArr[i - 2]);
            long[] jArr2 = this.f80844W;
            jArr[i] = jSigma1 + jArr2[i - 7] + Sigma0(jArr2[i - 15]) + this.f80844W[i - 16];
        }
        long j = this.f80836H1;
        long j2 = this.f80837H2;
        long j3 = this.f80838H3;
        long j4 = this.f80839H4;
        long j5 = this.f80840H5;
        long j6 = this.f80841H6;
        long j7 = this.f80842H7;
        int i2 = 0;
        long j8 = j2;
        long j9 = j3;
        long j10 = j5;
        int i3 = 0;
        long j11 = this.f80843H8;
        long j12 = j;
        long j13 = j4;
        while (i3 < 10) {
            long j14 = j10;
            int i4 = i3;
            long jSum1 = Sum1(j10) + m55318Ch(j10, j6, j7);
            long[] jArr3 = f80835K;
            int i5 = i2 + 1;
            long j15 = jSum1 + jArr3[i2] + this.f80844W[i2] + j11;
            long j16 = j13 + j15;
            long jSum0 = Sum0(j12) + Maj(j12, j8, j9) + j15;
            int i6 = i2 + 2;
            long jSum2 = Sum1(j16) + m55318Ch(j16, j14, j6) + jArr3[i5] + this.f80844W[i5] + j7;
            long j17 = j9 + jSum2;
            long jSum3 = Sum0(jSum0) + Maj(jSum0, j12, j8) + jSum2;
            int i7 = i2 + 3;
            long jSum4 = Sum1(j17) + m55318Ch(j17, j16, j14) + jArr3[i6] + this.f80844W[i6] + j6;
            long j18 = j8 + jSum4;
            long jSum5 = Sum0(jSum3) + Maj(jSum3, jSum0, j12) + jSum4;
            int i8 = i2 + 4;
            long jSum6 = Sum1(j18) + m55318Ch(j18, j17, j16) + jArr3[i7] + this.f80844W[i7] + j14;
            long j19 = j12 + jSum6;
            long jSum7 = Sum0(jSum5) + Maj(jSum5, jSum3, jSum0) + jSum6;
            int i9 = i2 + 5;
            long jSum8 = Sum1(j19) + m55318Ch(j19, j18, j17) + jArr3[i8] + this.f80844W[i8] + j16;
            long j20 = jSum0 + jSum8;
            long jSum9 = Sum0(jSum7) + Maj(jSum7, jSum5, jSum3) + jSum8;
            int i10 = i2 + 6;
            long jSum10 = Sum1(j20) + m55318Ch(j20, j19, j18) + jArr3[i9] + this.f80844W[i9] + j17;
            long j21 = jSum3 + jSum10;
            long jSum11 = Sum0(jSum9) + Maj(jSum9, jSum7, jSum5) + jSum10;
            long jSum12 = Sum1(j21);
            j7 = j21;
            j9 = jSum11;
            int i11 = i2 + 7;
            long jM55318Ch = jSum12 + m55318Ch(j21, j20, j19) + jArr3[i10] + this.f80844W[i10] + j18;
            long j22 = jSum5 + jM55318Ch;
            long jSum13 = Sum0(j9) + Maj(j9, jSum9, jSum7) + jM55318Ch;
            long jSum14 = Sum1(j22);
            j6 = j22;
            j8 = jSum13;
            i2 += 8;
            long jM55318Ch2 = jSum14 + m55318Ch(j22, j7, j20) + jArr3[i11] + this.f80844W[i11] + j19;
            long j23 = jSum7 + jM55318Ch2;
            long jSum15 = Sum0(j8) + Maj(j8, j9, jSum9) + jM55318Ch2;
            i3 = i4 + 1;
            j10 = j23;
            j13 = jSum9;
            j11 = j20;
            j12 = jSum15;
        }
        this.f80836H1 += j12;
        this.f80837H2 += j8;
        this.f80838H3 += j9;
        this.f80839H4 += j13;
        this.f80840H5 += j10;
        this.f80841H6 += j6;
        this.f80842H7 += j7;
        this.f80843H8 += j11;
        this.wOff = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            this.f80844W[i12] = 0;
        }
    }

    public void processLength(long j, long j2) {
        if (this.wOff > 14) {
            processBlock();
        }
        long[] jArr = this.f80844W;
        jArr[14] = j2;
        jArr[15] = j;
    }

    public void processWord(byte[] bArr, int i) {
        this.f80844W[this.wOff] = Pack.bigEndianToLong(bArr, i);
        int i2 = this.wOff + 1;
        this.wOff = i2;
        if (i2 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount1 = 0L;
        this.byteCount2 = 0L;
        int i = 0;
        this.xBufOff = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.wOff = 0;
        while (true) {
            long[] jArr = this.f80844W;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    public void restoreState(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 8);
        this.xBufOff = iBigEndianToInt;
        System.arraycopy(bArr, 0, this.xBuf, 0, iBigEndianToInt);
        this.byteCount1 = Pack.bigEndianToLong(bArr, 12);
        this.byteCount2 = Pack.bigEndianToLong(bArr, 20);
        this.f80836H1 = Pack.bigEndianToLong(bArr, 28);
        this.f80837H2 = Pack.bigEndianToLong(bArr, 36);
        this.f80838H3 = Pack.bigEndianToLong(bArr, 44);
        this.f80839H4 = Pack.bigEndianToLong(bArr, 52);
        this.f80840H5 = Pack.bigEndianToLong(bArr, 60);
        this.f80841H6 = Pack.bigEndianToLong(bArr, 68);
        this.f80842H7 = Pack.bigEndianToLong(bArr, 76);
        this.f80843H8 = Pack.bigEndianToLong(bArr, 84);
        this.wOff = Pack.bigEndianToInt(bArr, 92);
        for (int i = 0; i < this.wOff; i++) {
            this.f80844W[i] = Pack.bigEndianToLong(bArr, (i * 8) + 96);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.xBuf;
        int i = this.xBufOff;
        int i2 = i + 1;
        this.xBufOff = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount1++;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.xBufOff != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 >= this.xBuf.length) {
            processWord(bArr, i);
            byte[] bArr2 = this.xBuf;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.byteCount1 += (long) bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
