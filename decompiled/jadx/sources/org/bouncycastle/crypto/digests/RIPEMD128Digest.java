package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;
import p067l.C20780;

/* JADX INFO: loaded from: classes2.dex */
public class RIPEMD128Digest extends GeneralDigest {
    public static final int DIGEST_LENGTH = 16;

    /* JADX INFO: renamed from: H0 */
    public int f80861H0;

    /* JADX INFO: renamed from: H1 */
    public int f80862H1;

    /* JADX INFO: renamed from: H2 */
    public int f80863H2;

    /* JADX INFO: renamed from: H3 */
    public int f80864H3;

    /* JADX INFO: renamed from: X */
    public int[] f80865X;
    public int xOff;

    public RIPEMD128Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public RIPEMD128Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f80865X = new int[16];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 128, cryptoServicePurpose));
        reset();
    }

    public RIPEMD128Digest(RIPEMD128Digest rIPEMD128Digest) {
        super(rIPEMD128Digest.purpose);
        this.f80865X = new int[16];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 128, this.purpose));
        copyIn(rIPEMD128Digest);
    }

    /* JADX INFO: renamed from: F1 */
    private int m55326F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55330RL(i + m55331f1(i2, i3, i4) + i5, i6);
    }

    /* JADX INFO: renamed from: F2 */
    private int m55327F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55330RL(C20780.m46927(i, m55332f2(i2, i3, i4), i5, SHA1Digest.f80894Y1), i6);
    }

    /* JADX INFO: renamed from: F3 */
    private int m55328F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55330RL(C20780.m46927(i, m55333f3(i2, i3, i4), i5, SHA1Digest.f80895Y2), i6);
    }

    /* JADX INFO: renamed from: F4 */
    private int m55329F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55330RL(C20780.m46927(i, m55334f4(i2, i3, i4), i5, SHA1Digest.f80896Y3), i6);
    }

    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55330RL(i + m55331f1(i2, i3, i4) + i5, i6);
    }

    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55330RL(C20780.m46927(i, m55332f2(i2, i3, i4), i5, 1836072691), i6);
    }

    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55330RL(C20780.m46927(i, m55333f3(i2, i3, i4), i5, 1548603684), i6);
    }

    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m55330RL(C20780.m46927(i, m55334f4(i2, i3, i4), i5, 1352829926), i6);
    }

    /* JADX INFO: renamed from: RL */
    private int m55330RL(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void copyIn(RIPEMD128Digest rIPEMD128Digest) {
        super.copyIn((GeneralDigest) rIPEMD128Digest);
        this.f80861H0 = rIPEMD128Digest.f80861H0;
        this.f80862H1 = rIPEMD128Digest.f80862H1;
        this.f80863H2 = rIPEMD128Digest.f80863H2;
        this.f80864H3 = rIPEMD128Digest.f80864H3;
        int[] iArr = rIPEMD128Digest.f80865X;
        System.arraycopy(iArr, 0, this.f80865X, 0, iArr.length);
        this.xOff = rIPEMD128Digest.xOff;
    }

    /* JADX INFO: renamed from: f1 */
    private int m55331f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* JADX INFO: renamed from: f2 */
    private int m55332f2(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* JADX INFO: renamed from: f3 */
    private int m55333f3(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    /* JADX INFO: renamed from: f4 */
    private int m55334f4(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new RIPEMD128Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToLittleEndian(this.f80861H0, bArr, i);
        Pack.intToLittleEndian(this.f80862H1, bArr, i + 4);
        Pack.intToLittleEndian(this.f80863H2, bArr, i + 8);
        Pack.intToLittleEndian(this.f80864H3, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD128";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i = this.f80861H0;
        int i2 = this.f80862H1;
        int i3 = this.f80863H2;
        int i4 = this.f80864H3;
        int iM55326F1 = m55326F1(i, i2, i3, i4, this.f80865X[0], 11);
        int iM55326F2 = m55326F1(i4, iM55326F1, i2, i3, this.f80865X[1], 14);
        int iM55326F3 = m55326F1(i3, iM55326F2, iM55326F1, i2, this.f80865X[2], 15);
        int iM55326F4 = m55326F1(i2, iM55326F3, iM55326F2, iM55326F1, this.f80865X[3], 12);
        int iM55326F5 = m55326F1(iM55326F1, iM55326F4, iM55326F3, iM55326F2, this.f80865X[4], 5);
        int iM55326F6 = m55326F1(iM55326F2, iM55326F5, iM55326F4, iM55326F3, this.f80865X[5], 8);
        int iM55326F7 = m55326F1(iM55326F3, iM55326F6, iM55326F5, iM55326F4, this.f80865X[6], 7);
        int iM55326F8 = m55326F1(iM55326F4, iM55326F7, iM55326F6, iM55326F5, this.f80865X[7], 9);
        int iM55326F9 = m55326F1(iM55326F5, iM55326F8, iM55326F7, iM55326F6, this.f80865X[8], 11);
        int iM55326F10 = m55326F1(iM55326F6, iM55326F9, iM55326F8, iM55326F7, this.f80865X[9], 13);
        int iM55326F11 = m55326F1(iM55326F7, iM55326F10, iM55326F9, iM55326F8, this.f80865X[10], 14);
        int iM55326F12 = m55326F1(iM55326F8, iM55326F11, iM55326F10, iM55326F9, this.f80865X[11], 15);
        int iM55326F13 = m55326F1(iM55326F9, iM55326F12, iM55326F11, iM55326F10, this.f80865X[12], 6);
        int iM55326F14 = m55326F1(iM55326F10, iM55326F13, iM55326F12, iM55326F11, this.f80865X[13], 7);
        int iM55326F15 = m55326F1(iM55326F11, iM55326F14, iM55326F13, iM55326F12, this.f80865X[14], 9);
        int iM55326F16 = m55326F1(iM55326F12, iM55326F15, iM55326F14, iM55326F13, this.f80865X[15], 8);
        int iM55327F2 = m55327F2(iM55326F13, iM55326F16, iM55326F15, iM55326F14, this.f80865X[7], 7);
        int iM55327F3 = m55327F2(iM55326F14, iM55327F2, iM55326F16, iM55326F15, this.f80865X[4], 6);
        int iM55327F4 = m55327F2(iM55326F15, iM55327F3, iM55327F2, iM55326F16, this.f80865X[13], 8);
        int iM55327F5 = m55327F2(iM55326F16, iM55327F4, iM55327F3, iM55327F2, this.f80865X[1], 13);
        int iM55327F6 = m55327F2(iM55327F2, iM55327F5, iM55327F4, iM55327F3, this.f80865X[10], 11);
        int iM55327F7 = m55327F2(iM55327F3, iM55327F6, iM55327F5, iM55327F4, this.f80865X[6], 9);
        int iM55327F8 = m55327F2(iM55327F4, iM55327F7, iM55327F6, iM55327F5, this.f80865X[15], 7);
        int iM55327F9 = m55327F2(iM55327F5, iM55327F8, iM55327F7, iM55327F6, this.f80865X[3], 15);
        int iM55327F10 = m55327F2(iM55327F6, iM55327F9, iM55327F8, iM55327F7, this.f80865X[12], 7);
        int iM55327F11 = m55327F2(iM55327F7, iM55327F10, iM55327F9, iM55327F8, this.f80865X[0], 12);
        int iM55327F12 = m55327F2(iM55327F8, iM55327F11, iM55327F10, iM55327F9, this.f80865X[9], 15);
        int iM55327F13 = m55327F2(iM55327F9, iM55327F12, iM55327F11, iM55327F10, this.f80865X[5], 9);
        int iM55327F14 = m55327F2(iM55327F10, iM55327F13, iM55327F12, iM55327F11, this.f80865X[2], 11);
        int iM55327F15 = m55327F2(iM55327F11, iM55327F14, iM55327F13, iM55327F12, this.f80865X[14], 7);
        int iM55327F16 = m55327F2(iM55327F12, iM55327F15, iM55327F14, iM55327F13, this.f80865X[11], 13);
        int iM55327F17 = m55327F2(iM55327F13, iM55327F16, iM55327F15, iM55327F14, this.f80865X[8], 12);
        int iM55328F3 = m55328F3(iM55327F14, iM55327F17, iM55327F16, iM55327F15, this.f80865X[3], 11);
        int iM55328F4 = m55328F3(iM55327F15, iM55328F3, iM55327F17, iM55327F16, this.f80865X[10], 13);
        int iM55328F5 = m55328F3(iM55327F16, iM55328F4, iM55328F3, iM55327F17, this.f80865X[14], 6);
        int iM55328F6 = m55328F3(iM55327F17, iM55328F5, iM55328F4, iM55328F3, this.f80865X[4], 7);
        int iM55328F7 = m55328F3(iM55328F3, iM55328F6, iM55328F5, iM55328F4, this.f80865X[9], 14);
        int iM55328F8 = m55328F3(iM55328F4, iM55328F7, iM55328F6, iM55328F5, this.f80865X[15], 9);
        int iM55328F9 = m55328F3(iM55328F5, iM55328F8, iM55328F7, iM55328F6, this.f80865X[8], 13);
        int iM55328F10 = m55328F3(iM55328F6, iM55328F9, iM55328F8, iM55328F7, this.f80865X[1], 15);
        int iM55328F11 = m55328F3(iM55328F7, iM55328F10, iM55328F9, iM55328F8, this.f80865X[2], 14);
        int iM55328F12 = m55328F3(iM55328F8, iM55328F11, iM55328F10, iM55328F9, this.f80865X[7], 8);
        int iM55328F13 = m55328F3(iM55328F9, iM55328F12, iM55328F11, iM55328F10, this.f80865X[0], 13);
        int iM55328F14 = m55328F3(iM55328F10, iM55328F13, iM55328F12, iM55328F11, this.f80865X[6], 6);
        int iM55328F15 = m55328F3(iM55328F11, iM55328F14, iM55328F13, iM55328F12, this.f80865X[13], 5);
        int iM55328F16 = m55328F3(iM55328F12, iM55328F15, iM55328F14, iM55328F13, this.f80865X[11], 12);
        int iM55328F17 = m55328F3(iM55328F13, iM55328F16, iM55328F15, iM55328F14, this.f80865X[5], 7);
        int iM55328F18 = m55328F3(iM55328F14, iM55328F17, iM55328F16, iM55328F15, this.f80865X[12], 5);
        int iM55329F4 = m55329F4(iM55328F15, iM55328F18, iM55328F17, iM55328F16, this.f80865X[1], 11);
        int iM55329F5 = m55329F4(iM55328F16, iM55329F4, iM55328F18, iM55328F17, this.f80865X[9], 12);
        int iM55329F6 = m55329F4(iM55328F17, iM55329F5, iM55329F4, iM55328F18, this.f80865X[11], 14);
        int iM55329F7 = m55329F4(iM55328F18, iM55329F6, iM55329F5, iM55329F4, this.f80865X[10], 15);
        int iM55329F8 = m55329F4(iM55329F4, iM55329F7, iM55329F6, iM55329F5, this.f80865X[0], 14);
        int iM55329F9 = m55329F4(iM55329F5, iM55329F8, iM55329F7, iM55329F6, this.f80865X[8], 15);
        int iM55329F10 = m55329F4(iM55329F6, iM55329F9, iM55329F8, iM55329F7, this.f80865X[12], 9);
        int iM55329F11 = m55329F4(iM55329F7, iM55329F10, iM55329F9, iM55329F8, this.f80865X[4], 8);
        int iM55329F12 = m55329F4(iM55329F8, iM55329F11, iM55329F10, iM55329F9, this.f80865X[13], 9);
        int iM55329F13 = m55329F4(iM55329F9, iM55329F12, iM55329F11, iM55329F10, this.f80865X[3], 14);
        int iM55329F14 = m55329F4(iM55329F10, iM55329F13, iM55329F12, iM55329F11, this.f80865X[7], 5);
        int iM55329F15 = m55329F4(iM55329F11, iM55329F14, iM55329F13, iM55329F12, this.f80865X[15], 6);
        int iM55329F16 = m55329F4(iM55329F12, iM55329F15, iM55329F14, iM55329F13, this.f80865X[14], 8);
        int iM55329F17 = m55329F4(iM55329F13, iM55329F16, iM55329F15, iM55329F14, this.f80865X[5], 6);
        int iM55329F18 = m55329F4(iM55329F14, iM55329F17, iM55329F16, iM55329F15, this.f80865X[6], 5);
        int iM55329F19 = m55329F4(iM55329F15, iM55329F18, iM55329F17, iM55329F16, this.f80865X[2], 12);
        int iFF4 = FF4(i, i2, i3, i4, this.f80865X[5], 8);
        int iFF5 = FF4(i4, iFF4, i2, i3, this.f80865X[14], 9);
        int iFF6 = FF4(i3, iFF5, iFF4, i2, this.f80865X[7], 9);
        int iFF7 = FF4(i2, iFF6, iFF5, iFF4, this.f80865X[0], 11);
        int iFF8 = FF4(iFF4, iFF7, iFF6, iFF5, this.f80865X[9], 13);
        int iFF9 = FF4(iFF5, iFF8, iFF7, iFF6, this.f80865X[2], 15);
        int iFF10 = FF4(iFF6, iFF9, iFF8, iFF7, this.f80865X[11], 15);
        int iFF11 = FF4(iFF7, iFF10, iFF9, iFF8, this.f80865X[4], 5);
        int iFF12 = FF4(iFF8, iFF11, iFF10, iFF9, this.f80865X[13], 7);
        int iFF13 = FF4(iFF9, iFF12, iFF11, iFF10, this.f80865X[6], 7);
        int iFF14 = FF4(iFF10, iFF13, iFF12, iFF11, this.f80865X[15], 8);
        int iFF15 = FF4(iFF11, iFF14, iFF13, iFF12, this.f80865X[8], 11);
        int iFF16 = FF4(iFF12, iFF15, iFF14, iFF13, this.f80865X[1], 14);
        int iFF17 = FF4(iFF13, iFF16, iFF15, iFF14, this.f80865X[10], 14);
        int iFF18 = FF4(iFF14, iFF17, iFF16, iFF15, this.f80865X[3], 12);
        int iFF19 = FF4(iFF15, iFF18, iFF17, iFF16, this.f80865X[12], 6);
        int iFF3 = FF3(iFF16, iFF19, iFF18, iFF17, this.f80865X[6], 9);
        int iFF20 = FF3(iFF17, iFF3, iFF19, iFF18, this.f80865X[11], 13);
        int iFF21 = FF3(iFF18, iFF20, iFF3, iFF19, this.f80865X[3], 15);
        int iFF22 = FF3(iFF19, iFF21, iFF20, iFF3, this.f80865X[7], 7);
        int iFF23 = FF3(iFF3, iFF22, iFF21, iFF20, this.f80865X[0], 12);
        int iFF24 = FF3(iFF20, iFF23, iFF22, iFF21, this.f80865X[13], 8);
        int iFF25 = FF3(iFF21, iFF24, iFF23, iFF22, this.f80865X[5], 9);
        int iFF26 = FF3(iFF22, iFF25, iFF24, iFF23, this.f80865X[10], 11);
        int iFF27 = FF3(iFF23, iFF26, iFF25, iFF24, this.f80865X[14], 7);
        int iFF28 = FF3(iFF24, iFF27, iFF26, iFF25, this.f80865X[15], 7);
        int iFF29 = FF3(iFF25, iFF28, iFF27, iFF26, this.f80865X[8], 12);
        int iFF30 = FF3(iFF26, iFF29, iFF28, iFF27, this.f80865X[12], 7);
        int iFF31 = FF3(iFF27, iFF30, iFF29, iFF28, this.f80865X[4], 6);
        int iFF32 = FF3(iFF28, iFF31, iFF30, iFF29, this.f80865X[9], 15);
        int iFF33 = FF3(iFF29, iFF32, iFF31, iFF30, this.f80865X[1], 13);
        int iFF34 = FF3(iFF30, iFF33, iFF32, iFF31, this.f80865X[2], 11);
        int iFF2 = FF2(iFF31, iFF34, iFF33, iFF32, this.f80865X[15], 9);
        int iFF35 = FF2(iFF32, iFF2, iFF34, iFF33, this.f80865X[5], 7);
        int iFF36 = FF2(iFF33, iFF35, iFF2, iFF34, this.f80865X[1], 15);
        int iFF37 = FF2(iFF34, iFF36, iFF35, iFF2, this.f80865X[3], 11);
        int iFF38 = FF2(iFF2, iFF37, iFF36, iFF35, this.f80865X[7], 8);
        int iFF39 = FF2(iFF35, iFF38, iFF37, iFF36, this.f80865X[14], 6);
        int iFF40 = FF2(iFF36, iFF39, iFF38, iFF37, this.f80865X[6], 6);
        int iFF41 = FF2(iFF37, iFF40, iFF39, iFF38, this.f80865X[9], 14);
        int iFF42 = FF2(iFF38, iFF41, iFF40, iFF39, this.f80865X[11], 12);
        int iFF43 = FF2(iFF39, iFF42, iFF41, iFF40, this.f80865X[8], 13);
        int iFF44 = FF2(iFF40, iFF43, iFF42, iFF41, this.f80865X[12], 5);
        int iFF45 = FF2(iFF41, iFF44, iFF43, iFF42, this.f80865X[2], 14);
        int iFF46 = FF2(iFF42, iFF45, iFF44, iFF43, this.f80865X[10], 13);
        int iFF47 = FF2(iFF43, iFF46, iFF45, iFF44, this.f80865X[0], 13);
        int iFF48 = FF2(iFF44, iFF47, iFF46, iFF45, this.f80865X[4], 7);
        int iFF49 = FF2(iFF45, iFF48, iFF47, iFF46, this.f80865X[13], 5);
        int iFF1 = FF1(iFF46, iFF49, iFF48, iFF47, this.f80865X[8], 15);
        int iFF50 = FF1(iFF47, iFF1, iFF49, iFF48, this.f80865X[6], 5);
        int iFF51 = FF1(iFF48, iFF50, iFF1, iFF49, this.f80865X[4], 8);
        int iFF52 = FF1(iFF49, iFF51, iFF50, iFF1, this.f80865X[1], 11);
        int iFF53 = FF1(iFF1, iFF52, iFF51, iFF50, this.f80865X[3], 14);
        int iFF54 = FF1(iFF50, iFF53, iFF52, iFF51, this.f80865X[11], 14);
        int iFF55 = FF1(iFF51, iFF54, iFF53, iFF52, this.f80865X[15], 6);
        int iFF56 = FF1(iFF52, iFF55, iFF54, iFF53, this.f80865X[0], 14);
        int iFF57 = FF1(iFF53, iFF56, iFF55, iFF54, this.f80865X[5], 6);
        int iFF58 = FF1(iFF54, iFF57, iFF56, iFF55, this.f80865X[12], 9);
        int iFF59 = FF1(iFF55, iFF58, iFF57, iFF56, this.f80865X[2], 12);
        int iFF60 = FF1(iFF56, iFF59, iFF58, iFF57, this.f80865X[13], 9);
        int iFF61 = FF1(iFF57, iFF60, iFF59, iFF58, this.f80865X[9], 12);
        int iFF62 = FF1(iFF58, iFF61, iFF60, iFF59, this.f80865X[7], 5);
        int iFF63 = FF1(iFF59, iFF62, iFF61, iFF60, this.f80865X[10], 15);
        int iFF64 = FF1(iFF60, iFF63, iFF62, iFF61, this.f80865X[14], 8);
        int i5 = iM55329F18 + this.f80862H1 + iFF62;
        this.f80862H1 = this.f80863H2 + iM55329F17 + iFF61;
        this.f80863H2 = this.f80864H3 + iM55329F16 + iFF64;
        this.f80864H3 = this.f80861H0 + iM55329F19 + iFF63;
        this.f80861H0 = i5;
        this.xOff = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f80865X;
            if (i6 == iArr.length) {
                return;
            }
            iArr[i6] = 0;
            i6++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f80865X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f80865X;
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
        this.f80861H0 = 1732584193;
        this.f80862H1 = -271733879;
        this.f80863H2 = -1732584194;
        this.f80864H3 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f80865X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD128Digest) memoable);
    }
}
