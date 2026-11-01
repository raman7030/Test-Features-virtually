package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.p061s3.internal.AWSS3V4Signer;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import p067l.C20778;

/* JADX INFO: loaded from: classes.dex */
public final class AwsChunkedEncodingInputStream extends SdkInputStream {

    /* JADX INFO: renamed from: ۗ */
    public final String f1290;

    /* JADX INFO: renamed from: ۙ */
    public DecodedStreamBuffer f1291;

    /* JADX INFO: renamed from: ۛ */
    public final byte[] f1292;

    /* JADX INFO: renamed from: ۨ */
    public final String f1294;

    /* JADX INFO: renamed from: ۬ */
    public InputStream f1296;

    /* JADX INFO: renamed from: ܰ */
    public String f1297;

    /* JADX INFO: renamed from: ᩶ */
    public final String f1298;

    /* JADX INFO: renamed from: ᩸ */
    public final AWSS3V4Signer f1299;

    /* JADX INFO: renamed from: ᩹ */
    public ChunkContentIterator f1300;

    /* JADX INFO: renamed from: ᩺ */
    public final int f1301;

    /* JADX INFO: renamed from: ۟ */
    public static final byte[] f1289 = new byte[0];

    /* JADX INFO: renamed from: ֫֫ */
    public static final Log f1288 = LogFactory.m1468(AwsChunkedEncodingInputStream.class);

    /* JADX INFO: renamed from: ۫ */
    public boolean f1295 = true;

    /* JADX INFO: renamed from: ۤ */
    public boolean f1293 = false;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        m1448();
        if (!this.f1295) {
            throw new UnsupportedOperationException("Chunk-encoded stream only supports mark() at the start of the stream.");
        }
        if (this.f1296.markSupported()) {
            Log log = f1288;
            if (log.mo1459()) {
                log.mo1460("AwsChunkedEncodingInputStream marked at the start of the stream (will directly mark the wrapped stream since it's mark-supported).");
            }
            this.f1296.mark(Integer.MAX_VALUE);
        } else {
            Log log2 = f1288;
            if (log2.mo1459()) {
                log2.mo1460("AwsChunkedEncodingInputStream marked at the start of the stream (initializing the buffer since the wrapped stream is not mark-supported).");
            }
            this.f1291 = new DecodedStreamBuffer(this.f1301);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        m1448();
        this.f1300 = null;
        this.f1297 = this.f1290;
        if (this.f1296.markSupported()) {
            Log log = f1288;
            if (log.mo1459()) {
                log.mo1460("AwsChunkedEncodingInputStream reset (will reset the wrapped stream because it is mark-supported).");
            }
            this.f1296.reset();
        } else {
            Log log2 = f1288;
            if (log2.mo1459()) {
                log2.mo1460("AwsChunkedEncodingInputStream reset (will use the buffer of the decoded stream).");
            }
            DecodedStreamBuffer decodedStreamBuffer = this.f1291;
            if (decodedStreamBuffer == null) {
                throw new IOException("Cannot reset the stream because the mark is not set.");
            }
            decodedStreamBuffer.m1387();
        }
        this.f1300 = null;
        this.f1295 = true;
        this.f1293 = false;
    }

    public AwsChunkedEncodingInputStream(InputStream inputStream, byte[] bArr, String str, String str2, String str3, AWSS3V4Signer aWSS3V4Signer) {
        this.f1296 = null;
        int iMax = 262144;
        if (inputStream instanceof AwsChunkedEncodingInputStream) {
            AwsChunkedEncodingInputStream awsChunkedEncodingInputStream = (AwsChunkedEncodingInputStream) inputStream;
            iMax = Math.max(awsChunkedEncodingInputStream.f1301, 262144);
            this.f1296 = awsChunkedEncodingInputStream.f1296;
            this.f1291 = awsChunkedEncodingInputStream.f1291;
        } else {
            this.f1296 = inputStream;
            this.f1291 = null;
        }
        if (iMax < 131072) {
            throw new IllegalArgumentException("Max buffer size should not be less than chunk size");
        }
        this.f1301 = iMax;
        this.f1292 = bArr;
        this.f1298 = str;
        this.f1294 = str2;
        this.f1290 = str3;
        this.f1297 = str3;
        this.f1299 = aWSS3V4Signer;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        if (i == -1) {
            return i;
        }
        Log log = f1288;
        if (log.mo1459()) {
            log.mo1460("One byte read from the stream.");
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        m1448();
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        ChunkContentIterator chunkContentIterator = this.f1300;
        if (chunkContentIterator == null || !chunkContentIterator.m1383()) {
            if (this.f1293) {
                return -1;
            }
            byte[] bArr2 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
            int i3 = 0;
            while (i3 < 131072) {
                DecodedStreamBuffer decodedStreamBuffer = this.f1291;
                if (decodedStreamBuffer != null && decodedStreamBuffer.m1385()) {
                    bArr2[i3] = this.f1291.m1386();
                    i3++;
                } else {
                    int i4 = this.f1296.read(bArr2, i3, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - i3);
                    if (i4 == -1) {
                        break;
                    }
                    DecodedStreamBuffer decodedStreamBuffer2 = this.f1291;
                    if (decodedStreamBuffer2 != null) {
                        decodedStreamBuffer2.m1384(i3, i4, bArr2);
                    }
                    i3 += i4;
                }
            }
            if (i3 == 0) {
                this.f1300 = new ChunkContentIterator(m1379(f1289));
                z = true;
            } else {
                if (i3 < 131072) {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr2, 0, bArr3, 0, i3);
                    bArr2 = bArr3;
                }
                this.f1300 = new ChunkContentIterator(m1379(bArr2));
                z = false;
            }
            this.f1293 = z;
        }
        int iM1382 = this.f1300.m1382(bArr, i, i2);
        if (iM1382 > 0) {
            this.f1295 = false;
            Log log = f1288;
            if (log.mo1459()) {
                log.mo1460(iM1382 + " byte read from the stream.");
            }
        }
        return iM1382;
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

    /* JADX INFO: renamed from: ᩳ */
    public static long m1380(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Nonnegative content length expected.");
        }
        long j2 = j / 131072;
        long j3 = j % 131072;
        return (j2 * m1378(131072L)) + (j3 > 0 ? m1378(j3) : 0L) + m1378(0L);
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m1378(long j) {
        return ((long) (Long.toHexString(j).length() + 83)) + j + ((long) 2);
    }

    /* JADX INFO: renamed from: ۧ */
    private byte[] m1379(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(bArr.length));
        StringBuilder sb2 = new StringBuilder("AWS4-HMAC-SHA256-PAYLOAD\n");
        sb2.append(this.f1298);
        sb2.append("\n");
        sb2.append(this.f1294);
        sb2.append("\n");
        sb2.append(this.f1297);
        sb2.append("\n");
        AWSS3V4Signer aWSS3V4Signer = this.f1299;
        sb2.append(BinaryUtils.m1915(aWSS3V4Signer.hash("")));
        sb2.append("\n");
        sb2.append(BinaryUtils.m1915(aWSS3V4Signer.hash(bArr)));
        String strM1915 = BinaryUtils.m1915(aWSS3V4Signer.sign(sb2.toString(), this.f1292, SigningAlgorithm.HmacSHA256));
        this.f1297 = strM1915;
        sb.append(";chunk-signature=" + strM1915);
        sb.append("\r\n");
        try {
            String string = sb.toString();
            Charset charset = StringUtils.f2004;
            byte[] bytes = string.getBytes(charset);
            byte[] bytes2 = "\r\n".getBytes(charset);
            byte[] bArr2 = new byte[bytes.length + bArr.length + bytes2.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            System.arraycopy(bytes2, 0, bArr2, bytes.length + bArr.length, bytes2.length);
            return bArr2;
        } catch (Exception e) {
            throw new AmazonClientException(C20778.m46923(e, new StringBuilder("Unable to sign the chunked data. ")), e);
        }
    }

    @Override // com.amazonaws.internal.SdkInputStream
    /* JADX INFO: renamed from: ᩳ */
    public final InputStream mo1381() {
        return this.f1296;
    }
}
