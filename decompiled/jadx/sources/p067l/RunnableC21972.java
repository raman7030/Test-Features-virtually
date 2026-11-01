package p067l;

import com.umeng.analytics.pro.C0698cb;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J68J */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC21972 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f69031;

    public RunnableC21972(C21302 c21302, String str) {
        super(c21302);
        this.f69031 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z;
        long j;
        int i;
        String strM50693 = AbstractRunnableC22643.m50693(this.f69031);
        C21302 c21302 = this.f71446;
        AbstractC17043 abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
        if (m50701(abstractC17043M50699)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC17043M50699.mo25087()) {
            str = "550 Can't RETR a directory\r\n";
        } else if (!abstractC17043M50699.mo25094()) {
            str = "550 File does not exist\r\n";
        } else if (abstractC17043M50699.mo29997()) {
            try {
                BufferedInputStream bufferedInputStreamM38676 = abstractC17043M50699.m38676();
                try {
                    byte[] bArr = new byte[65536];
                    if (c21302.m48176()) {
                        c21302.m48173("150 Sending file\r\n");
                        if (c21302.m48171()) {
                            long jMo25101 = abstractC17043M50699.mo25101() - 1;
                            long j2 = c21302.f67133;
                            if (j2 >= 0) {
                                long j3 = c21302.f67128;
                                j = j3 >= j2 ? j3 : jMo25101;
                                c21302.f67133 = -1L;
                                c21302.f67128 = -1L;
                            } else {
                                j2 = 0;
                                j = jMo25101;
                            }
                            long j4 = (j - j2) + 1;
                            C23461.m52183(j2, bufferedInputStreamM38676);
                            while (true) {
                                if (j4 > 0 && (i = bufferedInputStreamM38676.read(bArr)) != -1) {
                                    int iMin = (int) Math.min(i, j4);
                                    if (c21302.m48160(0, iMin, bArr)) {
                                        j4 -= (long) iMin;
                                    } else {
                                        str = "426 Data socket error\r\n";
                                    }
                                } else {
                                    bufferedInputStreamM38676.close();
                                    str = null;
                                }
                            }
                        } else if (c21302.f67133 >= 0) {
                            str = "550 Unable to seek to requested position in ASCII mode";
                        } else {
                            loop1: while (true) {
                                while (true) {
                                    int i2 = bufferedInputStreamM38676.read(bArr);
                                    if (i2 == -1) {
                                        break loop1;
                                    }
                                    byte[] bArr2 = {C0698cb.f2569k, 10};
                                    int i3 = 0;
                                    int i4 = 0;
                                    while (i3 < i2) {
                                        if (bArr[i3] == 10) {
                                            c21302.m48160(i4, i3 - i4, bArr);
                                            if (i3 == 0) {
                                                if (!z) {
                                                    c21302.m48160(0, 1, bArr2);
                                                }
                                            } else if (bArr[i3 - 1] != 13) {
                                                c21302.m48160(0, 1, bArr2);
                                            }
                                            i4 = i3;
                                        }
                                        i3++;
                                    }
                                    c21302.m48160(i4, i3 - i4, bArr);
                                    z = bArr[i2 + (-1)] == 13;
                                }
                            }
                            bufferedInputStreamM38676.close();
                            str = null;
                        }
                    } else {
                        str = "425 Error opening socket\r\n";
                    }
                    bufferedInputStreamM38676.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStreamM38676.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (FileNotFoundException unused) {
                str = "550 File not found\r\n";
            } catch (IOException unused2) {
                str = "425 Network error\r\n";
            }
        } else {
            str = "550 No read permissions\r\n";
        }
        c21302.m48154();
        if (str != null) {
            c21302.m48173(str);
        } else {
            c21302.m48173("226 Transmission finished\r\n");
        }
    }
}
