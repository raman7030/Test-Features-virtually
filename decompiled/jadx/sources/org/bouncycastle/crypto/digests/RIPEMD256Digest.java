package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;
import p067l.C20780;

/* JADX INFO: loaded from: classes2.dex */
public class RIPEMD256Digest extends GeneralDigest {
    public static final int DIGEST_LENGTH = 32;

    /* JADX INFO: renamed from: H0 */
    public int f80872H0;

    /* JADX INFO: renamed from: H1 */
    public int f80873H1;

    /* JADX INFO: renamed from: H2 */
    public int f80874H2;

    /* JADX INFO: renamed from: H3 */
    public int f80875H3;

    /* JADX INFO: renamed from: H4 */
    public int f80876H4;

    /* JADX INFO: renamed from: H5 */
    public int f80877H5;

    /* JADX INFO: renamed from: H6 */
    public int f80878H6;

    /* JADX INFO: renamed from: H7 */
    public int f80879H7;

    /* JADX INFO: renamed from: X */
    public int[] f80880X;
    public int xOff;

    public RIPEMD256Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public RIPEMD256Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f80880X = new int[16];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 128, cryptoServicePurpose));
        reset();
    }

    public RIPEMD256Digest(RIPEMD256Digest rIPEMD256Digest) {
        super(rIPEMD256Digest.purpose);
        this.f80880X = new int[16];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 128, this.purpose));
        copyIn(rIPEMD256Digest);
    }

    /* JADX INFO: renamed from: F1 */
    private int m55341F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55345RL(i + m55346f1(i2, i3, i4) + i5, i6);
    }

    /* JADX INFO: renamed from: F2 */
    private int m55342F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55345RL(C20780.m46927(i, m55347f2(i2, i3, i4), i5, SHA1Digest.f80894Y1), i6);
    }

    /* JADX INFO: renamed from: F3 */
    private int m55343F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55345RL(C20780.m46927(i, m55348f3(i2, i3, i4), i5, SHA1Digest.f80895Y2), i6);
    }

    /* JADX INFO: renamed from: F4 */
    private int m55344F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55345RL(C20780.m46927(i, m55349f4(i2, i3, i4), i5, SHA1Digest.f80896Y3), i6);
    }

    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55345RL(i + m55346f1(i2, i3, i4) + i5, i6);
    }

    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55345RL(C20780.m46927(i, m55347f2(i2, i3, i4), i5, 1836072691), i6);
    }

    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55345RL(C20780.m46927(i, m55348f3(i2, i3, i4), i5, 1548603684), i6);
    }

    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55345RL(C20780.m46927(i, m55349f4(i2, i3, i4), i5, 1352829926), i6);
    }

    /* JADX INFO: renamed from: RL */
    private int m55345RL(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void copyIn(RIPEMD256Digest rIPEMD256Digest) {
        super.copyIn((GeneralDigest) rIPEMD256Digest);
        this.f80872H0 = rIPEMD256Digest.f80872H0;
        this.f80873H1 = rIPEMD256Digest.f80873H1;
        this.f80874H2 = rIPEMD256Digest.f80874H2;
        this.f80875H3 = rIPEMD256Digest.f80875H3;
        this.f80876H4 = rIPEMD256Digest.f80876H4;
        this.f80877H5 = rIPEMD256Digest.f80877H5;
        this.f80878H6 = rIPEMD256Digest.f80878H6;
        this.f80879H7 = rIPEMD256Digest.f80879H7;
        int[] iArr = rIPEMD256Digest.f80880X;
        System.arraycopy(iArr, 0, this.f80880X, 0, iArr.length);
        this.xOff = rIPEMD256Digest.xOff;
    }

    /* JADX INFO: renamed from: f1 */
    private int m55346f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* JADX INFO: renamed from: f2 */
    private int m55347f2(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* JADX INFO: renamed from: f3 */
    private int m55348f3(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    /* JADX INFO: renamed from: f4 */
    private int m55349f4(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new RIPEMD256Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToLittleEndian(this.f80872H0, bArr, i);
        Pack.intToLittleEndian(this.f80873H1, bArr, i + 4);
        Pack.intToLittleEndian(this.f80874H2, bArr, i + 8);
        Pack.intToLittleEndian(this.f80875H3, bArr, i + 12);
        Pack.intToLittleEndian(this.f80876H4, bArr, i + 16);
        Pack.intToLittleEndian(this.f80877H5, bArr, i + 20);
        Pack.intToLittleEndian(this.f80878H6, bArr, i + 24);
        Pack.intToLittleEndian(this.f80879H7, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD256";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i = this.f80872H0;
        int i2 = this.f80873H1;
        int i3 = this.f80874H2;
        int i4 = this.f80875H3;
        int i5 = this.f80876H4;
        int i6 = this.f80877H5;
        int i7 = this.f80878H6;
        int i8 = this.f80879H7;
        int iM55341F1 = m55341F1(i, i2, i3, i4, this.f80880X[0], 11);
        int iM55341F2 = m55341F1(i4, iM55341F1, i2, i3, this.f80880X[1], 14);
        int iM55341F3 = m55341F1(i3, iM55341F2, iM55341F1, i2, this.f80880X[2], 15);
        int iM55341F4 = m55341F1(i2, iM55341F3, iM55341F2, iM55341F1, this.f80880X[3], 12);
        int iM55341F5 = m55341F1(iM55341F1, iM55341F4, iM55341F3, iM55341F2, this.f80880X[4], 5);
        int iM55341F6 = m55341F1(iM55341F2, iM55341F5, iM55341F4, iM55341F3, this.f80880X[5], 8);
        int iM55341F7 = m55341F1(iM55341F3, iM55341F6, iM55341F5, iM55341F4, this.f80880X[6], 7);
        int iM55341F8 = m55341F1(iM55341F4, iM55341F7, iM55341F6, iM55341F5, this.f80880X[7], 9);
        int iM55341F9 = m55341F1(iM55341F5, iM55341F8, iM55341F7, iM55341F6, this.f80880X[8], 11);
        int iM55341F10 = m55341F1(iM55341F6, iM55341F9, iM55341F8, iM55341F7, this.f80880X[9], 13);
        int iM55341F11 = m55341F1(iM55341F7, iM55341F10, iM55341F9, iM55341F8, this.f80880X[10], 14);
        int iM55341F12 = m55341F1(iM55341F8, iM55341F11, iM55341F10, iM55341F9, this.f80880X[11], 15);
        int iM55341F13 = m55341F1(iM55341F9, iM55341F12, iM55341F11, iM55341F10, this.f80880X[12], 6);
        int iM55341F14 = m55341F1(iM55341F10, iM55341F13, iM55341F12, iM55341F11, this.f80880X[13], 7);
        int iM55341F15 = m55341F1(iM55341F11, iM55341F14, iM55341F13, iM55341F12, this.f80880X[14], 9);
        int iM55341F16 = m55341F1(iM55341F12, iM55341F15, iM55341F14, iM55341F13, this.f80880X[15], 8);
        int iFF4 = FF4(i5, i6, i7, i8, this.f80880X[5], 8);
        int iFF5 = FF4(i8, iFF4, i6, i7, this.f80880X[14], 9);
        int iFF6 = FF4(i7, iFF5, iFF4, i6, this.f80880X[7], 9);
        int iFF7 = FF4(i6, iFF6, iFF5, iFF4, this.f80880X[0], 11);
        int iFF8 = FF4(iFF4, iFF7, iFF6, iFF5, this.f80880X[9], 13);
        int iFF9 = FF4(iFF5, iFF8, iFF7, iFF6, this.f80880X[2], 15);
        int iFF10 = FF4(iFF6, iFF9, iFF8, iFF7, this.f80880X[11], 15);
        int iFF11 = FF4(iFF7, iFF10, iFF9, iFF8, this.f80880X[4], 5);
        int iFF12 = FF4(iFF8, iFF11, iFF10, iFF9, this.f80880X[13], 7);
        int iFF13 = FF4(iFF9, iFF12, iFF11, iFF10, this.f80880X[6], 7);
        int iFF14 = FF4(iFF10, iFF13, iFF12, iFF11, this.f80880X[15], 8);
        int iFF15 = FF4(iFF11, iFF14, iFF13, iFF12, this.f80880X[8], 11);
        int iFF16 = FF4(iFF12, iFF15, iFF14, iFF13, this.f80880X[1], 14);
        int iFF17 = FF4(iFF13, iFF16, iFF15, iFF14, this.f80880X[10], 14);
        int iFF18 = FF4(iFF14, iFF17, iFF16, iFF15, this.f80880X[3], 12);
        int iFF19 = FF4(iFF15, iFF18, iFF17, iFF16, this.f80880X[12], 6);
        int iM55342F2 = m55342F2(iFF16, iM55341F16, iM55341F15, iM55341F14, this.f80880X[7], 7);
        int iM55342F3 = m55342F2(iM55341F14, iM55342F2, iM55341F16, iM55341F15, this.f80880X[4], 6);
        int iM55342F4 = m55342F2(iM55341F15, iM55342F3, iM55342F2, iM55341F16, this.f80880X[13], 8);
        int iM55342F5 = m55342F2(iM55341F16, iM55342F4, iM55342F3, iM55342F2, this.f80880X[1], 13);
        int iM55342F6 = m55342F2(iM55342F2, iM55342F5, iM55342F4, iM55342F3, this.f80880X[10], 11);
        int iM55342F7 = m55342F2(iM55342F3, iM55342F6, iM55342F5, iM55342F4, this.f80880X[6], 9);
        int iM55342F8 = m55342F2(iM55342F4, iM55342F7, iM55342F6, iM55342F5, this.f80880X[15], 7);
        int iM55342F9 = m55342F2(iM55342F5, iM55342F8, iM55342F7, iM55342F6, this.f80880X[3], 15);
        int iM55342F10 = m55342F2(iM55342F6, iM55342F9, iM55342F8, iM55342F7, this.f80880X[12], 7);
        int iM55342F11 = m55342F2(iM55342F7, iM55342F10, iM55342F9, iM55342F8, this.f80880X[0], 12);
        int iM55342F12 = m55342F2(iM55342F8, iM55342F11, iM55342F10, iM55342F9, this.f80880X[9], 15);
        int iM55342F13 = m55342F2(iM55342F9, iM55342F12, iM55342F11, iM55342F10, this.f80880X[5], 9);
        int iM55342F14 = m55342F2(iM55342F10, iM55342F13, iM55342F12, iM55342F11, this.f80880X[2], 11);
        int iM55342F15 = m55342F2(iM55342F11, iM55342F14, iM55342F13, iM55342F12, this.f80880X[14], 7);
        int iM55342F16 = m55342F2(iM55342F12, iM55342F15, iM55342F14, iM55342F13, this.f80880X[11], 13);
        int iM55342F17 = m55342F2(iM55342F13, iM55342F16, iM55342F15, iM55342F14, this.f80880X[8], 12);
        int iFF3 = FF3(iM55341F13, iFF19, iFF18, iFF17, this.f80880X[6], 9);
        int iFF20 = FF3(iFF17, iFF3, iFF19, iFF18, this.f80880X[11], 13);
        int iFF21 = FF3(iFF18, iFF20, iFF3, iFF19, this.f80880X[3], 15);
        int iFF22 = FF3(iFF19, iFF21, iFF20, iFF3, this.f80880X[7], 7);
        int iFF23 = FF3(iFF3, iFF22, iFF21, iFF20, this.f80880X[0], 12);
        int iFF24 = FF3(iFF20, iFF23, iFF22, iFF21, this.f80880X[13], 8);
        int iFF25 = FF3(iFF21, iFF24, iFF23, iFF22, this.f80880X[5], 9);
        int iFF26 = FF3(iFF22, iFF25, iFF24, iFF23, this.f80880X[10], 11);
        int iFF27 = FF3(iFF23, iFF26, iFF25, iFF24, this.f80880X[14], 7);
        int iFF28 = FF3(iFF24, iFF27, iFF26, iFF25, this.f80880X[15], 7);
        int iFF29 = FF3(iFF25, iFF28, iFF27, iFF26, this.f80880X[8], 12);
        int iFF30 = FF3(iFF26, iFF29, iFF28, iFF27, this.f80880X[12], 7);
        int iFF31 = FF3(iFF27, iFF30, iFF29, iFF28, this.f80880X[4], 6);
        int iFF32 = FF3(iFF28, iFF31, iFF30, iFF29, this.f80880X[9], 15);
        int iFF33 = FF3(iFF29, iFF32, iFF31, iFF30, this.f80880X[1], 13);
        int iFF34 = FF3(iFF30, iFF33, iFF32, iFF31, this.f80880X[2], 11);
        int iM55343F3 = m55343F3(iM55342F14, iFF34, iM55342F16, iM55342F15, this.f80880X[3], 11);
        int iM55343F4 = m55343F3(iM55342F15, iM55343F3, iFF34, iM55342F16, this.f80880X[10], 13);
        int iM55343F5 = m55343F3(iM55342F16, iM55343F4, iM55343F3, iFF34, this.f80880X[14], 6);
        int iM55343F6 = m55343F3(iFF34, iM55343F5, iM55343F4, iM55343F3, this.f80880X[4], 7);
        int iM55343F7 = m55343F3(iM55343F3, iM55343F6, iM55343F5, iM55343F4, this.f80880X[9], 14);
        int iM55343F8 = m55343F3(iM55343F4, iM55343F7, iM55343F6, iM55343F5, this.f80880X[15], 9);
        int iM55343F9 = m55343F3(iM55343F5, iM55343F8, iM55343F7, iM55343F6, this.f80880X[8], 13);
        int iM55343F10 = m55343F3(iM55343F6, iM55343F9, iM55343F8, iM55343F7, this.f80880X[1], 15);
        int iM55343F11 = m55343F3(iM55343F7, iM55343F10, iM55343F9, iM55343F8, this.f80880X[2], 14);
        int iM55343F12 = m55343F3(iM55343F8, iM55343F11, iM55343F10, iM55343F9, this.f80880X[7], 8);
        int iM55343F13 = m55343F3(iM55343F9, iM55343F12, iM55343F11, iM55343F10, this.f80880X[0], 13);
        int iM55343F14 = m55343F3(iM55343F10, iM55343F13, iM55343F12, iM55343F11, this.f80880X[6], 6);
        int iM55343F15 = m55343F3(iM55343F11, iM55343F14, iM55343F13, iM55343F12, this.f80880X[13], 5);
        int iM55343F16 = m55343F3(iM55343F12, iM55343F15, iM55343F14, iM55343F13, this.f80880X[11], 12);
        int iM55343F17 = m55343F3(iM55343F13, iM55343F16, iM55343F15, iM55343F14, this.f80880X[5], 7);
        int iM55343F18 = m55343F3(iM55343F14, iM55343F17, iM55343F16, iM55343F15, this.f80880X[12], 5);
        int iFF2 = FF2(iFF31, iM55342F17, iFF33, iFF32, this.f80880X[15], 9);
        int iFF35 = FF2(iFF32, iFF2, iM55342F17, iFF33, this.f80880X[5], 7);
        int iFF36 = FF2(iFF33, iFF35, iFF2, iM55342F17, this.f80880X[1], 15);
        int iFF37 = FF2(iM55342F17, iFF36, iFF35, iFF2, this.f80880X[3], 11);
        int iFF38 = FF2(iFF2, iFF37, iFF36, iFF35, this.f80880X[7], 8);
        int iFF39 = FF2(iFF35, iFF38, iFF37, iFF36, this.f80880X[14], 6);
        int iFF40 = FF2(iFF36, iFF39, iFF38, iFF37, this.f80880X[6], 6);
        int iFF41 = FF2(iFF37, iFF40, iFF39, iFF38, this.f80880X[9], 14);
        int iFF42 = FF2(iFF38, iFF41, iFF40, iFF39, this.f80880X[11], 12);
        int iFF43 = FF2(iFF39, iFF42, iFF41, iFF40, this.f80880X[8], 13);
        int iFF44 = FF2(iFF40, iFF43, iFF42, iFF41, this.f80880X[12], 5);
        int iFF45 = FF2(iFF41, iFF44, iFF43, iFF42, this.f80880X[2], 14);
        int iFF46 = FF2(iFF42, iFF45, iFF44, iFF43, this.f80880X[10], 13);
        int iFF47 = FF2(iFF43, iFF46, iFF45, iFF44, this.f80880X[0], 13);
        int iFF48 = FF2(iFF44, iFF47, iFF46, iFF45, this.f80880X[4], 7);
        int iFF49 = FF2(iFF45, iFF48, iFF47, iFF46, this.f80880X[13], 5);
        int iM55344F4 = m55344F4(iM55343F15, iM55343F18, iFF48, iM55343F16, this.f80880X[1], 11);
        int iM55344F5 = m55344F4(iM55343F16, iM55344F4, iM55343F18, iFF48, this.f80880X[9], 12);
        int iM55344F6 = m55344F4(iFF48, iM55344F5, iM55344F4, iM55343F18, this.f80880X[11], 14);
        int iM55344F7 = m55344F4(iM55343F18, iM55344F6, iM55344F5, iM55344F4, this.f80880X[10], 15);
        int iM55344F8 = m55344F4(iM55344F4, iM55344F7, iM55344F6, iM55344F5, this.f80880X[0], 14);
        int iM55344F9 = m55344F4(iM55344F5, iM55344F8, iM55344F7, iM55344F6, this.f80880X[8], 15);
        int iM55344F10 = m55344F4(iM55344F6, iM55344F9, iM55344F8, iM55344F7, this.f80880X[12], 9);
        int iM55344F11 = m55344F4(iM55344F7, iM55344F10, iM55344F9, iM55344F8, this.f80880X[4], 8);
        int iM55344F12 = m55344F4(iM55344F8, iM55344F11, iM55344F10, iM55344F9, this.f80880X[13], 9);
        int iM55344F13 = m55344F4(iM55344F9, iM55344F12, iM55344F11, iM55344F10, this.f80880X[3], 14);
        int iM55344F14 = m55344F4(iM55344F10, iM55344F13, iM55344F12, iM55344F11, this.f80880X[7], 5);
        int iM55344F15 = m55344F4(iM55344F11, iM55344F14, iM55344F13, iM55344F12, this.f80880X[15], 6);
        int iM55344F16 = m55344F4(iM55344F12, iM55344F15, iM55344F14, iM55344F13, this.f80880X[14], 8);
        int iM55344F17 = m55344F4(iM55344F13, iM55344F16, iM55344F15, iM55344F14, this.f80880X[5], 6);
        int iM55344F18 = m55344F4(iM55344F14, iM55344F17, iM55344F16, iM55344F15, this.f80880X[6], 5);
        int iM55344F19 = m55344F4(iM55344F15, iM55344F18, iM55344F17, iM55344F16, this.f80880X[2], 12);
        int iFF1 = FF1(iFF46, iFF49, iM55343F17, iFF47, this.f80880X[8], 15);
        int iFF50 = FF1(iFF47, iFF1, iFF49, iM55343F17, this.f80880X[6], 5);
        int iFF51 = FF1(iM55343F17, iFF50, iFF1, iFF49, this.f80880X[4], 8);
        int iFF52 = FF1(iFF49, iFF51, iFF50, iFF1, this.f80880X[1], 11);
        int iFF53 = FF1(iFF1, iFF52, iFF51, iFF50, this.f80880X[3], 14);
        int iFF54 = FF1(iFF50, iFF53, iFF52, iFF51, this.f80880X[11], 14);
        int iFF55 = FF1(iFF51, iFF54, iFF53, iFF52, this.f80880X[15], 6);
        int iFF56 = FF1(iFF52, iFF55, iFF54, iFF53, this.f80880X[0], 14);
        int iFF57 = FF1(iFF53, iFF56, iFF55, iFF54, this.f80880X[5], 6);
        int iFF58 = FF1(iFF54, iFF57, iFF56, iFF55, this.f80880X[12], 9);
        int iFF59 = FF1(iFF55, iFF58, iFF57, iFF56, this.f80880X[2], 12);
        int iFF60 = FF1(iFF56, iFF59, iFF58, iFF57, this.f80880X[13], 9);
        int iFF61 = FF1(iFF57, iFF60, iFF59, iFF58, this.f80880X[9], 12);
        int iFF62 = FF1(iFF58, iFF61, iFF60, iFF59, this.f80880X[7], 5);
        int iFF63 = FF1(iFF59, iFF62, iFF61, iFF60, this.f80880X[10], 15);
        int iFF64 = FF1(iFF60, iFF63, iFF62, iFF61, this.f80880X[14], 8);
        this.f80872H0 += iM55344F16;
        this.f80873H1 += iM55344F19;
        this.f80874H2 += iM55344F18;
        this.f80875H3 += iFF62;
        this.f80876H4 += iFF61;
        this.f80877H5 += iFF64;
        this.f80878H6 += iFF63;
        this.f80879H7 += iM55344F17;
        this.xOff = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f80880X;
            if (i9 == iArr.length) {
                return;
            }
            iArr[i9] = 0;
            i9++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f80880X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f80880X;
        int i2 = this.xOff;
        this.xOff = i2 + 1;
        iArr[i2] = Pack.littleEndianToInt(bArr, i);
        if (this.xOff == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f80872H0 = 1732584193;
        this.f80873H1 = -271733879;
        this.f80874H2 = -1732584194;
        this.f80875H3 = 271733878;
        this.f80876H4 = 1985229328;
        this.f80877H5 = -19088744;
        this.f80878H6 = -1985229329;
        this.f80879H7 = 19088743;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f80880X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD256Digest) memoable);
    }
}
