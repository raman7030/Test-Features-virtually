package l;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.ۙۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANG */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC4358 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f14018;

    public RunnableC4358(C19922 c19922, String str) {
        super(c19922);
        this.f14018 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BufferedInputStream bufferedInputStreamM36518;
        String str;
        String str2;
        String strM48358 = AbstractRunnableC21333.m48358(this.f14018);
        C19922 c19922 = this.f68752;
        AbstractC15440 abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strM48358);
        if (m48366(abstractC15440M48364)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC15440M48364.mo23113()) {
            str = "553 Can't HASH a directory\r\n";
        } else if (!abstractC15440M48364.mo23120()) {
            str = "550 File does not exist\r\n";
        } else if (abstractC15440M48364.mo27936()) {
            try {
                String strM45861 = c19922.m45861();
                MessageDigest messageDigest = MessageDigest.getInstance(strM45861);
                byte[] bArr = new byte[65536];
                bufferedInputStreamM36518 = abstractC15440M48364.m36518();
                try {
                    long jMo23127 = abstractC15440M48364.mo23127() - 1;
                    long j = c19922.f64496;
                    if (j >= 0) {
                        long j2 = c19922.f64491;
                        if (j <= j2 && j2 <= abstractC15440M48364.mo23127() - 1) {
                            jMo23127 = c19922.f64491;
                        }
                        c19922.f64496 = -1L;
                        c19922.f64491 = -1L;
                    } else {
                        j = 0;
                    }
                    long j3 = (jMo23127 - j) + 1;
                    C22194.m49856(j, bufferedInputStreamM36518);
                    while (true) {
                        int i = bufferedInputStreamM36518.read(bArr);
                        if (i == -1) {
                            str2 = strM48358;
                            break;
                        }
                        String str3 = strM48358;
                        long j4 = i;
                        if (j4 > j3) {
                            messageDigest.update(bArr, 0, (int) j3);
                            str2 = str3;
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i);
                            j3 -= j4;
                            strM48358 = str3;
                        }
                    }
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder();
                    for (byte b : bArrDigest) {
                        sb.append(String.format("%02x", Byte.valueOf(b)));
                    }
                    c19922.m45860("213 " + strM45861 + " " + j + "-" + jMo23127 + " " + ((Object) sb) + " " + str2 + "\r\n");
                    try {
                        bufferedInputStreamM36518.close();
                    } catch (IOException unused) {
                    }
                    str = null;
                } catch (FileNotFoundException unused2) {
                    str = "550 File not found\r\n";
                    if (bufferedInputStreamM36518 != null) {
                        try {
                            bufferedInputStreamM36518.close();
                        } catch (IOException unused3) {
                        }
                    }
                } catch (IOException unused4) {
                    str = "425 Network error\r\n";
                    if (bufferedInputStreamM36518 != null) {
                        bufferedInputStreamM36518.close();
                    }
                } catch (NoSuchAlgorithmException unused5) {
                    str = "550 Unknown hashing algorithm\r\n";
                    if (bufferedInputStreamM36518 != null) {
                        bufferedInputStreamM36518.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bufferedInputStreamM36518 != null) {
                        try {
                            bufferedInputStreamM36518.close();
                        } catch (IOException unused6) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused7) {
                bufferedInputStreamM36518 = null;
            } catch (IOException unused8) {
                bufferedInputStreamM36518 = null;
            } catch (NoSuchAlgorithmException unused9) {
                bufferedInputStreamM36518 = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStreamM36518 = null;
            }
        } else {
            str = "556 No read permissions\r\n";
        }
        if (str != null) {
            c19922.m45860(str);
        }
    }
}
