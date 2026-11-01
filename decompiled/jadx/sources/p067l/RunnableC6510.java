package p067l;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.ۙۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANG */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC6510 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f16833;

    public RunnableC6510(C21302 c21302, String str) {
        super(c21302);
        this.f16833 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BufferedInputStream bufferedInputStreamM38676;
        String str;
        String str2;
        String strM50693 = AbstractRunnableC22643.m50693(this.f16833);
        C21302 c21302 = this.f71446;
        AbstractC17043 abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
        if (m50701(abstractC17043M50699)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC17043M50699.mo25087()) {
            str = "553 Can't HASH a directory\r\n";
        } else if (!abstractC17043M50699.mo25094()) {
            str = "550 File does not exist\r\n";
        } else if (abstractC17043M50699.mo29997()) {
            try {
                String strM48174 = c21302.m48174();
                MessageDigest messageDigest = MessageDigest.getInstance(strM48174);
                byte[] bArr = new byte[65536];
                bufferedInputStreamM38676 = abstractC17043M50699.m38676();
                try {
                    long jMo25101 = abstractC17043M50699.mo25101() - 1;
                    long j = c21302.f67133;
                    if (j >= 0) {
                        long j2 = c21302.f67128;
                        if (j <= j2 && j2 <= abstractC17043M50699.mo25101() - 1) {
                            jMo25101 = c21302.f67128;
                        }
                        c21302.f67133 = -1L;
                        c21302.f67128 = -1L;
                    } else {
                        j = 0;
                    }
                    long j3 = (jMo25101 - j) + 1;
                    C23461.m52183(j, bufferedInputStreamM38676);
                    while (true) {
                        int i = bufferedInputStreamM38676.read(bArr);
                        if (i == -1) {
                            str2 = strM50693;
                            break;
                        }
                        String str3 = strM50693;
                        long j4 = i;
                        if (j4 > j3) {
                            messageDigest.update(bArr, 0, (int) j3);
                            str2 = str3;
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i);
                            j3 -= j4;
                            strM50693 = str3;
                        }
                    }
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder();
                    for (byte b : bArrDigest) {
                        sb.append(String.format("%02x", Byte.valueOf(b)));
                    }
                    c21302.m48173("213 " + strM48174 + " " + j + "-" + jMo25101 + " " + ((Object) sb) + " " + str2 + "\r\n");
                    try {
                        bufferedInputStreamM38676.close();
                    } catch (IOException unused) {
                    }
                    str = null;
                } catch (FileNotFoundException unused2) {
                    str = "550 File not found\r\n";
                    if (bufferedInputStreamM38676 != null) {
                        try {
                            bufferedInputStreamM38676.close();
                        } catch (IOException unused3) {
                        }
                    }
                } catch (IOException unused4) {
                    str = "425 Network error\r\n";
                    if (bufferedInputStreamM38676 != null) {
                        bufferedInputStreamM38676.close();
                    }
                } catch (NoSuchAlgorithmException unused5) {
                    str = "550 Unknown hashing algorithm\r\n";
                    if (bufferedInputStreamM38676 != null) {
                        bufferedInputStreamM38676.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bufferedInputStreamM38676 != null) {
                        try {
                            bufferedInputStreamM38676.close();
                        } catch (IOException unused6) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused7) {
                bufferedInputStreamM38676 = null;
            } catch (IOException unused8) {
                bufferedInputStreamM38676 = null;
            } catch (NoSuchAlgorithmException unused9) {
                bufferedInputStreamM38676 = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStreamM38676 = null;
            }
        } else {
            str = "556 No read permissions\r\n";
        }
        if (str != null) {
            c21302.m48173(str);
        }
    }
}
