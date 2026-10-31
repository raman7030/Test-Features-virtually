package l;

import com.alipay.sdk.m.o.b;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi;

/* JADX INFO: renamed from: l.ۤ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9941 {
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25058(C16302 c16302, C12762 c12762) throws C9080 {
        long jM38349;
        c16302.m38348();
        int iM25056 = m25056(c16302, 3, 8, 8);
        c12762.f38359 = iM25056;
        if (iM25056 == -1) {
            return false;
        }
        C22632.m50631(Math.max(Math.max(2, 8), 32) <= 63);
        C8488.m22163(C8488.m22163(3L, 255L), Blake2xsDigest.MAX_NUMBER_BLOCKS);
        if (c16302.m38339() < 2) {
            jM38349 = -1;
        } else {
            jM38349 = c16302.m38349(2);
            if (jM38349 == 3) {
                if (c16302.m38339() < 8) {
                    jM38349 = -1;
                } else {
                    long jM383410 = c16302.m38349(8);
                    jM38349 += jM383410;
                    if (jM383410 == 255) {
                        if (c16302.m38339() < 32) {
                            jM38349 = -1;
                        } else {
                            jM38349 += c16302.m38349(32);
                        }
                    }
                }
            }
        }
        c12762.f38357 = jM38349;
        if (jM38349 == -1) {
            return false;
        }
        if (jM38349 > 16) {
            throw C9080.m23441("Contains sub-stream with an invalid packet label " + c12762.f38357);
        }
        if (jM38349 == 0) {
            int i = c12762.f38359;
            if (i == 1) {
                throw C9080.m23440("Mpegh3daConfig packet with invalid packet label 0", (Throwable) null);
            }
            if (i == 2) {
                throw C9080.m23440("Mpegh3daFrame packet with invalid packet label 0", (Throwable) null);
            }
            if (i == 17) {
                throw C9080.m23440("AudioTruncation packet with invalid packet label 0", (Throwable) null);
            }
        }
        int iM25057 = m25056(c16302, 11, 24, 24);
        c12762.f38358 = iM25057;
        return iM25057 != -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12057 m25057(C16302 c16302) throws C9080 {
        int iM38343;
        int i;
        char c;
        int iM38344;
        int i2 = 8;
        int iM38345 = c16302.m38343(8);
        int iM38346 = c16302.m38343(5);
        if (iM38346 != 31) {
            switch (iM38346) {
                case 0:
                    iM38343 = 96000;
                    break;
                case 1:
                    iM38343 = 88200;
                    break;
                case 2:
                    iM38343 = 64000;
                    break;
                case 3:
                    iM38343 = 48000;
                    break;
                case 4:
                    iM38343 = 44100;
                    break;
                case 5:
                    iM38343 = 32000;
                    break;
                case 6:
                    iM38343 = 24000;
                    break;
                case 7:
                    iM38343 = 22050;
                    break;
                case 8:
                    iM38343 = 16000;
                    break;
                case 9:
                    iM38343 = 12000;
                    break;
                case 10:
                    iM38343 = 11025;
                    break;
                case 11:
                    iM38343 = 8000;
                    break;
                case 12:
                    iM38343 = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw C9080.m23441("Unsupported sampling rate index " + iM38346);
                case 15:
                    iM38343 = 57600;
                    break;
                case 16:
                    iM38343 = PKCS12KeyStoreSpi.MIN_ITERATIONS;
                    break;
                case 17:
                    iM38343 = 40000;
                    break;
                case 18:
                    iM38343 = 38400;
                    break;
                case 19:
                    iM38343 = 34150;
                    break;
                case 20:
                    iM38343 = 28800;
                    break;
                case 21:
                    iM38343 = 25600;
                    break;
                case 22:
                    iM38343 = b.j0;
                    break;
                case 23:
                    iM38343 = 19200;
                    break;
                case 24:
                    iM38343 = 17075;
                    break;
                case 25:
                    iM38343 = 14400;
                    break;
                case 26:
                    iM38343 = 12800;
                    break;
                case 27:
                    iM38343 = 9600;
                    break;
            }
        } else {
            iM38343 = c16302.m38343(24);
        }
        int iM38347 = c16302.m38343(3);
        int i3 = 1;
        if (iM38347 == 0) {
            i = 768;
        } else if (iM38347 == 1) {
            i = 1024;
        } else if (iM38347 == 2 || iM38347 == 3) {
            i = 2048;
        } else {
            if (iM38347 != 4) {
                throw C9080.m23441("Unsupported coreSbrFrameLengthIndex " + iM38347);
            }
            i = 4096;
        }
        if (iM38347 == 0 || iM38347 == 1) {
            c = 0;
        } else if (iM38347 == 2) {
            c = 2;
        } else if (iM38347 == 3) {
            c = 3;
        } else {
            if (iM38347 != 4) {
                throw C9080.m23441("Unsupported coreSbrFrameLengthIndex " + iM38347);
            }
            c = 1;
        }
        c16302.m38351(2);
        m25060(c16302);
        int iM38348 = c16302.m38343(5);
        int i4 = 0;
        int iM25056 = 0;
        while (true) {
            int i5 = 16;
            if (i4 < iM38348 + 1) {
                int iM38349 = c16302.m38343(3);
                iM25056 += m25056(c16302, 5, 8, 16) + 1;
                if ((iM38349 == 0 || iM38349 == 2) && c16302.m38352()) {
                    m25060(c16302);
                }
                i4++;
            } else {
                int iM25057 = m25056(c16302, 4, 8, 16) + 1;
                c16302.m38346();
                int i6 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i6 >= iM25057) {
                        byte[] bArr = null;
                        if (c16302.m38352()) {
                            int iM25058 = m25056(c16302, 2, 4, 8) + 1;
                            for (int i7 = 0; i7 < iM25058; i7++) {
                                int iM25059 = m25056(c16302, 4, 8, 16);
                                int iM250510 = m25056(c16302, 4, 8, 16);
                                if (iM25059 == 7) {
                                    int iM383410 = c16302.m38343(4) + 1;
                                    c16302.m38351(4);
                                    byte[] bArr2 = new byte[iM383410];
                                    for (int i8 = 0; i8 < iM383410; i8++) {
                                        bArr2[i8] = (byte) c16302.m38343(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    c16302.m38351(iM250510 * 8);
                                }
                            }
                        }
                        switch (iM38343) {
                            case 14700:
                            case 16000:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                throw C9080.m23441("Unsupported sampling rate " + iM38343);
                        }
                        return new C12057(iM38345, bArr, (int) (((double) iM38343) * d), (int) (((double) i) * d));
                    }
                    int iM383411 = c16302.m38343(2);
                    if (iM383411 == 0) {
                        c16302.m38351(3);
                        if (c16302.m38352()) {
                            c16302.m38351(13);
                        }
                        if (c > 0) {
                            m25059(c16302);
                        }
                    } else if (iM383411 == i3) {
                        c16302.m38351(3);
                        boolean zM38352 = c16302.m38352();
                        if (zM38352) {
                            c16302.m38351(13);
                        }
                        if (zM38352) {
                            c16302.m38346();
                        }
                        if (c > 0) {
                            m25059(c16302);
                            iM38344 = c16302.m38343(2);
                        } else {
                            iM38344 = 0;
                        }
                        if (iM38344 > 0) {
                            c16302.m38351(6);
                            int iM383412 = c16302.m38343(2);
                            c16302.m38351(4);
                            if (c16302.m38352()) {
                                c16302.m38351(5);
                            }
                            if (iM38344 == 2 || iM38344 == 3) {
                                c16302.m38351(6);
                            }
                            if (iM383412 == 2) {
                                c16302.m38346();
                            }
                        }
                        int iFloor = ((int) Math.floor(Math.log(iM25056 - 1) / Math.log(2.0d))) + 1;
                        int iM383413 = c16302.m38343(2);
                        if (iM383413 > 0 && c16302.m38352()) {
                            c16302.m38351(iFloor);
                        }
                        if (c16302.m38352()) {
                            c16302.m38351(iFloor);
                        }
                        if (c == 0 && iM383413 == 0) {
                            c16302.m38346();
                        }
                    } else if (iM383411 == 3) {
                        m25056(c16302, 4, i2, i5);
                        int iM250511 = m25056(c16302, 4, i2, i5);
                        if (c16302.m38352()) {
                            m25056(c16302, i2, i5, 0);
                        }
                        c16302.m38346();
                        if (iM250511 > 0) {
                            c16302.m38351(iM250511 * 8);
                        }
                    }
                    i6++;
                    i3 = 1;
                    i5 = 16;
                    i2 = 8;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m25060(C16302 c16302) {
        int iM38343;
        int iM38344 = c16302.m38343(2);
        if (iM38344 == 0) {
            c16302.m38351(6);
            return;
        }
        int iM25056 = m25056(c16302, 5, 8, 16) + 1;
        if (iM38344 == 1) {
            c16302.m38351(iM25056 * 7);
            return;
        }
        if (iM38344 == 2) {
            boolean zM38352 = c16302.m38352();
            int i = zM38352 ? 1 : 5;
            int i2 = zM38352 ? 7 : 5;
            int i3 = zM38352 ? 8 : 6;
            int i4 = 0;
            while (i4 < iM25056) {
                if (c16302.m38352()) {
                    c16302.m38351(7);
                    iM38343 = 0;
                } else {
                    if (c16302.m38343(2) == 3 && c16302.m38343(i2) * i != 0) {
                        c16302.m38346();
                    }
                    iM38343 = c16302.m38343(i3) * i;
                    if (iM38343 != 0 && iM38343 != 180) {
                        c16302.m38346();
                    }
                    c16302.m38346();
                }
                if (iM38343 != 0 && iM38343 != 180 && c16302.m38352()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25059(C16302 c16302) {
        c16302.m38351(3);
        c16302.m38351(8);
        boolean zM38352 = c16302.m38352();
        boolean zM38353 = c16302.m38352();
        if (zM38352) {
            c16302.m38351(5);
        }
        if (zM38353) {
            c16302.m38351(6);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m25056(C16302 c16302, int i, int i2, int i3) {
        C22632.m50631(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        long j = ((long) i4) + ((long) i5);
        long j2 = (int) j;
        if (j != j2) {
            throw new ArithmeticException();
        }
        long j3 = j2 + ((long) (1 << i3));
        if (j3 != ((int) j3)) {
            throw new ArithmeticException();
        }
        if (c16302.m38339() < i) {
            return -1;
        }
        int iM38343 = c16302.m38343(i);
        if (iM38343 == i4) {
            if (c16302.m38339() < i2) {
                return -1;
            }
            int iM38344 = c16302.m38343(i2);
            iM38343 += iM38344;
            if (iM38344 == i5) {
                if (c16302.m38339() < i3) {
                    return -1;
                }
                return c16302.m38343(i3) + iM38343;
            }
        }
        return iM38343;
    }
}
