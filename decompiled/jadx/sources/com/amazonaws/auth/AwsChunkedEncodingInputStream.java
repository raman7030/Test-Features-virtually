package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import l.C19370;

/* JADX INFO: loaded from: classes.dex */
public final class AwsChunkedEncodingInputStream extends SdkInputStream {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f130;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DecodedStreamBuffer f131;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final byte[] f132;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f134;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InputStream f136;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f137;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f138;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AWSS3V4Signer f139;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ChunkContentIterator f140;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f141;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final byte[] f129 = new byte[0];

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final Log f128 = LogFactory.m302(AwsChunkedEncodingInputStream.class);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f135 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f133 = false;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        m282();
        if (!this.f135) {
            throw new UnsupportedOperationException("Chunk-encoded stream only supports mark() at the start of the stream.");
        }
        if (this.f136.markSupported()) {
            Log log = f128;
            if (log.mo293()) {
                log.mo294("AwsChunkedEncodingInputStream marked at the start of the stream (will directly mark the wrapped stream since it's mark-supported).");
            }
            this.f136.mark(Integer.MAX_VALUE);
        } else {
            Log log2 = f128;
            if (log2.mo293()) {
                log2.mo294("AwsChunkedEncodingInputStream marked at the start of the stream (initializing the buffer since the wrapped stream is not mark-supported).");
            }
            this.f131 = new DecodedStreamBuffer(this.f141);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        m282();
        this.f140 = null;
        this.f137 = this.f130;
        if (this.f136.markSupported()) {
            Log log = f128;
            if (log.mo293()) {
                log.mo294("AwsChunkedEncodingInputStream reset (will reset the wrapped stream because it is mark-supported).");
            }
            this.f136.reset();
        } else {
            Log log2 = f128;
            if (log2.mo293()) {
                log2.mo294("AwsChunkedEncodingInputStream reset (will use the buffer of the decoded stream).");
            }
            DecodedStreamBuffer decodedStreamBuffer = this.f131;
            if (decodedStreamBuffer == null) {
                throw new IOException("Cannot reset the stream because the mark is not set.");
            }
            decodedStreamBuffer.m221();
        }
        this.f140 = null;
        this.f135 = true;
        this.f133 = false;
    }

    public AwsChunkedEncodingInputStream(InputStream inputStream, byte[] bArr, String str, String str2, String str3, AWSS3V4Signer aWSS3V4Signer) {
        this.f136 = null;
        int iMax = 262144;
        if (inputStream instanceof AwsChunkedEncodingInputStream) {
            AwsChunkedEncodingInputStream awsChunkedEncodingInputStream = (AwsChunkedEncodingInputStream) inputStream;
            iMax = Math.max(awsChunkedEncodingInputStream.f141, 262144);
            this.f136 = awsChunkedEncodingInputStream.f136;
            this.f131 = awsChunkedEncodingInputStream.f131;
        } else {
            this.f136 = inputStream;
            this.f131 = null;
        }
        if (iMax < 131072) {
            throw new IllegalArgumentException("Max buffer size should not be less than chunk size");
        }
        this.f141 = iMax;
        this.f132 = bArr;
        this.f138 = str;
        this.f134 = str2;
        this.f130 = str3;
        this.f137 = str3;
        this.f139 = aWSS3V4Signer;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        if (i == -1) {
            return i;
        }
        Log log = f128;
        if (log.mo293()) {
            log.mo294("One byte read from the stream.");
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        m282();
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        ChunkContentIterator chunkContentIterator = this.f140;
        if (chunkContentIterator == null || !chunkContentIterator.m217()) {
            if (this.f133) {
                return -1;
            }
            byte[] bArr2 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
            int i3 = 0;
            while (i3 < 131072) {
                DecodedStreamBuffer decodedStreamBuffer = this.f131;
                if (decodedStreamBuffer != null && decodedStreamBuffer.m219()) {
                    bArr2[i3] = this.f131.m220();
                    i3++;
                } else {
                    int i4 = this.f136.read(bArr2, i3, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - i3);
                    if (i4 == -1) {
                        break;
                    }
                    DecodedStreamBuffer decodedStreamBuffer2 = this.f131;
                    if (decodedStreamBuffer2 != null) {
                        decodedStreamBuffer2.m218(i3, i4, bArr2);
                    }
                    i3 += i4;
                }
            }
            if (i3 == 0) {
                this.f140 = new ChunkContentIterator(m213(f129));
                z = true;
            } else {
                if (i3 < 131072) {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr2, 0, bArr3, 0, i3);
                    bArr2 = bArr3;
                }
                this.f140 = new ChunkContentIterator(m213(bArr2));
                z = false;
            }
            this.f133 = z;
        }
        int iM216 = this.f140.m216(bArr, i, i2);
        if (iM216 > 0) {
            this.f135 = false;
            Log log = f128;
            if (log.mo293()) {
                log.mo294(iM216 + " byte read from the stream.");
            }
        }
        return iM216;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i;
        if (j <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(262144L, j);
        byte[] bArr = new byte[iMin];
        long j2 = j;
        while (j2 > 0 && (i = read(bArr, 0, iMin)) >= 0) {
            j2 -= (long) i;
        }
        return j - j2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m214(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Nonnegative content length expected.");
        }
        long j2 = j / 131072;
        long j3 = j % 131072;
        return (j2 * m212(131072L)) + (j3 > 0 ? m212(j3) : 0L) + m212(0L);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m212(long j) {
        return ((long) (Long.toHexString(j).length() + 83)) + j + ((long) 2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private byte[] m213(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(bArr.length));
        StringBuilder sb2 = new StringBuilder("AWS4-HMAC-SHA256-PAYLOAD\n");
        sb2.append(this.f138);
        sb2.append("\n");
        sb2.append(this.f134);
        sb2.append("\n");
        sb2.append(this.f137);
        sb2.append("\n");
        AWSS3V4Signer aWSS3V4Signer = this.f139;
        sb2.append(BinaryUtils.m750(aWSS3V4Signer.hash("")));
        sb2.append("\n");
        sb2.append(BinaryUtils.m750(aWSS3V4Signer.hash(bArr)));
        String strM750 = BinaryUtils.m750(aWSS3V4Signer.sign(sb2.toString(), this.f132, SigningAlgorithm.HmacSHA256));
        this.f137 = strM750;
        sb.append(";chunk-signature=" + strM750);
        sb.append("\r\n");
        try {
            String string = sb.toString();
            Charset charset = StringUtils.f844;
            byte[] bytes = string.getBytes(charset);
            byte[] bytes2 = "\r\n".getBytes(charset);
            byte[] bArr2 = new byte[bytes.length + bArr.length + bytes2.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            System.arraycopy(bytes2, 0, bArr2, bytes.length + bArr.length, bytes2.length);
            return bArr2;
        } catch (Exception e) {
            throw new AmazonClientException(C19370.m44629(e, new StringBuilder("Unable to sign the chunked data. ")), e);
        }
    }

    @Override // com.amazonaws.internal.SdkInputStream
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InputStream mo215() {
        return this.f136;
    }
}
