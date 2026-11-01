package p067l;

import com.alipay.sdk.p010m.p039o.C0180b;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi;

/* JADX INFO: renamed from: l.ۤ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11816 {
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m27075(C17861 c17861, C14497 c14497) throws C10998 {
        long jM40564;
        c17861.m40563();
        int iM27073 = m27073(c17861, 3, 8, 8);
        c14497.f41399 = iM27073;
        if (iM27073 == -1) {
            return false;
        }
        C23877.m52957(Math.max(Math.max(2, 8), 32) <= 63);
        C10436.m24131(C10436.m24131(3L, 255L), Blake2xsDigest.MAX_NUMBER_BLOCKS);
        if (c17861.m40554() < 2) {
            jM40564 = -1;
        } else {
            jM40564 = c17861.m40564(2);
            if (jM40564 == 3) {
                if (c17861.m40554() < 8) {
                    jM40564 = -1;
                } else {
                    long jM40565 = c17861.m40564(8);
                    jM40564 += jM40565;
                    if (jM40565 == 255) {
                        if (c17861.m40554() < 32) {
                            jM40564 = -1;
                        } else {
                            jM40564 += c17861.m40564(32);
                        }
                    }
                }
            }
        }
        c14497.f41397 = jM40564;
        if (jM40564 == -1) {
            return false;
        }
        if (jM40564 > 16) {
            throw C10998.m25388("Contains sub-stream with an invalid packet label " + c14497.f41397);
        }
        if (jM40564 == 0) {
            int i = c14497.f41399;
            if (i == 1) {
                throw C10998.m25387("Mpegh3daConfig packet with invalid packet label 0", (Throwable) null);
            }
            if (i == 2) {
                throw C10998.m25387("Mpegh3daFrame packet with invalid packet label 0", (Throwable) null);
            }
            if (i == 17) {
                throw C10998.m25387("AudioTruncation packet with invalid packet label 0", (Throwable) null);
            }
        }
        int iM27074 = m27073(c17861, 11, 24, 24);
        c14497.f41398 = iM27074;
        return iM27074 != -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13827 m27074(C17861 c17861) throws C10998 {
        int iM40558;
        int i;
        char c;
        int iM40559;
        int i2 = 8;
        int iM405510 = c17861.m40558(8);
        int iM405511 = c17861.m40558(5);
        if (iM405511 != 31) {
            switch (iM405511) {
                case 0:
                    iM40558 = 96000;
                    break;
                case 1:
                    iM40558 = 88200;
                    break;
                case 2:
                    iM40558 = 64000;
                    break;
                case 3:
                    iM40558 = 48000;
                    break;
                case 4:
                    iM40558 = 44100;
                    break;
                case 5:
                    iM40558 = 32000;
                    break;
                case 6:
                    iM40558 = 24000;
                    break;
                case 7:
                    iM40558 = 22050;
                    break;
                case 8:
                    iM40558 = 16000;
                    break;
                case 9:
                    iM40558 = 12000;
                    break;
                case 10:
                    iM40558 = 11025;
                    break;
                case 11:
                    iM40558 = 8000;
                    break;
                case 12:
                    iM40558 = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw C10998.m25388("Unsupported sampling rate index " + iM405511);
                case 15:
                    iM40558 = 57600;
                    break;
                case 16:
                    iM40558 = PKCS12KeyStoreSpi.MIN_ITERATIONS;
                    break;
                case 17:
                    iM40558 = 40000;
                    break;
                case 18:
                    iM40558 = 38400;
                    break;
                case 19:
                    iM40558 = 34150;
                    break;
                case 20:
                    iM40558 = 28800;
                    break;
                case 21:
                    iM40558 = 25600;
                    break;
                case 22:
                    iM40558 = C0180b.f790j0;
                    break;
                case 23:
                    iM40558 = 19200;
                    break;
                case 24:
                    iM40558 = 17075;
                    break;
                case 25:
                    iM40558 = 14400;
                    break;
                case 26:
                    iM40558 = 12800;
                    break;
                case 27:
                    iM40558 = 9600;
                    break;
            }
        } else {
            iM40558 = c17861.m40558(24);
        }
        int iM405512 = c17861.m40558(3);
        int i3 = 1;
        if (iM405512 == 0) {
            i = 768;
        } else if (iM405512 == 1) {
            i = 1024;
        } else if (iM405512 == 2 || iM405512 == 3) {
            i = 2048;
        } else {
            if (iM405512 != 4) {
                throw C10998.m25388("Unsupported coreSbrFrameLengthIndex " + iM405512);
            }
            i = 4096;
        }
        if (iM405512 == 0 || iM405512 == 1) {
            c = 0;
        } else if (iM405512 == 2) {
            c = 2;
        } else if (iM405512 == 3) {
            c = 3;
        } else {
            if (iM405512 != 4) {
                throw C10998.m25388("Unsupported coreSbrFrameLengthIndex " + iM405512);
            }
            c = 1;
        }
        c17861.m40566(2);
        m27077(c17861);
        int iM405513 = c17861.m40558(5);
        int i4 = 0;
        int iM27073 = 0;
        while (true) {
            int i5 = 16;
            if (i4 < iM405513 + 1) {
                int iM405514 = c17861.m40558(3);
                iM27073 += m27073(c17861, 5, 8, 16) + 1;
                if ((iM405514 == 0 || iM405514 == 2) && c17861.m40567()) {
                    m27077(c17861);
                }
                i4++;
            } else {
                int iM27074 = m27073(c17861, 4, 8, 16) + 1;
                c17861.m40561();
                int i6 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i6 >= iM27074) {
                        byte[] bArr = null;
                        if (c17861.m40567()) {
                            int iM27075 = m27073(c17861, 2, 4, 8) + 1;
                            for (int i7 = 0; i7 < iM27075; i7++) {
                                int iM27076 = m27073(c17861, 4, 8, 16);
                                int iM27077 = m27073(c17861, 4, 8, 16);
                                if (iM27076 == 7) {
                                    int iM405515 = c17861.m40558(4) + 1;
                                    c17861.m40566(4);
                                    byte[] bArr2 = new byte[iM405515];
                                    for (int i8 = 0; i8 < iM405515; i8++) {
                                        bArr2[i8] = (byte) c17861.m40558(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    c17861.m40566(iM27077 * 8);
                                }
                            }
                        }
                        switch (iM40558) {
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
                                throw C10998.m25388("Unsupported sampling rate " + iM40558);
                        }
                        return new C13827(iM405510, bArr, (int) (((double) iM40558) * d), (int) (((double) i) * d));
                    }
                    int iM405516 = c17861.m40558(2);
                    if (iM405516 == 0) {
                        c17861.m40566(3);
                        if (c17861.m40567()) {
                            c17861.m40566(13);
                        }
                        if (c > 0) {
                            m27076(c17861);
                        }
                    } else if (iM405516 == i3) {
                        c17861.m40566(3);
                        boolean zM40567 = c17861.m40567();
                        if (zM40567) {
                            c17861.m40566(13);
                        }
                        if (zM40567) {
                            c17861.m40561();
                        }
                        if (c > 0) {
                            m27076(c17861);
                            iM40559 = c17861.m40558(2);
                        } else {
                            iM40559 = 0;
                        }
                        if (iM40559 > 0) {
                            c17861.m40566(6);
                            int iM405517 = c17861.m40558(2);
                            c17861.m40566(4);
                            if (c17861.m40567()) {
                                c17861.m40566(5);
                            }
                            if (iM40559 == 2 || iM40559 == 3) {
                                c17861.m40566(6);
                            }
                            if (iM405517 == 2) {
                                c17861.m40561();
                            }
                        }
                        int iFloor = ((int) Math.floor(Math.log(iM27073 - 1) / Math.log(2.0d))) + 1;
                        int iM405518 = c17861.m40558(2);
                        if (iM405518 > 0 && c17861.m40567()) {
                            c17861.m40566(iFloor);
                        }
                        if (c17861.m40567()) {
                            c17861.m40566(iFloor);
                        }
                        if (c == 0 && iM405518 == 0) {
                            c17861.m40561();
                        }
                    } else if (iM405516 == 3) {
                        m27073(c17861, 4, i2, i5);
                        int iM27078 = m27073(c17861, 4, i2, i5);
                        if (c17861.m40567()) {
                            m27073(c17861, i2, i5, 0);
                        }
                        c17861.m40561();
                        if (iM27078 > 0) {
                            c17861.m40566(iM27078 * 8);
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

    /* JADX INFO: renamed from: ܽ */
    public static void m27077(C17861 c17861) {
        int iM40558;
        int iM40559 = c17861.m40558(2);
        if (iM40559 == 0) {
            c17861.m40566(6);
            return;
        }
        int iM27073 = m27073(c17861, 5, 8, 16) + 1;
        if (iM40559 == 1) {
            c17861.m40566(iM27073 * 7);
            return;
        }
        if (iM40559 == 2) {
            boolean zM40567 = c17861.m40567();
            int i = zM40567 ? 1 : 5;
            int i2 = zM40567 ? 7 : 5;
            int i3 = zM40567 ? 8 : 6;
            int i4 = 0;
            while (i4 < iM27073) {
                if (c17861.m40567()) {
                    c17861.m40566(7);
                    iM40558 = 0;
                } else {
                    if (c17861.m40558(2) == 3 && c17861.m40558(i2) * i != 0) {
                        c17861.m40561();
                    }
                    iM40558 = c17861.m40558(i3) * i;
                    if (iM40558 != 0 && iM40558 != 180) {
                        c17861.m40561();
                    }
                    c17861.m40561();
                }
                if (iM40558 != 0 && iM40558 != 180 && c17861.m40567()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m27076(C17861 c17861) {
        c17861.m40566(3);
        c17861.m40566(8);
        boolean zM40567 = c17861.m40567();
        boolean zM40568 = c17861.m40567();
        if (zM40567) {
            c17861.m40566(5);
        }
        if (zM40568) {
            c17861.m40566(6);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m27073(C17861 c17861, int i, int i2, int i3) {
        C23877.m52957(Math.max(Math.max(i, i2), i3) <= 31);
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
        if (c17861.m40554() < i) {
            return -1;
        }
        int iM40558 = c17861.m40558(i);
        if (iM40558 == i4) {
            if (c17861.m40554() < i2) {
                return -1;
            }
            int iM40559 = c17861.m40558(i2);
            iM40558 += iM40559;
            if (iM40559 == i5) {
                if (c17861.m40554() < i3) {
                    return -1;
                }
                return c17861.m40558(i3) + iM40558;
            }
        }
        return iM40558;
    }
}
