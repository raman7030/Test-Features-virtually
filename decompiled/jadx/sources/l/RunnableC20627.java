package l;

import com.umeng.analytics.pro.cb;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J68J */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC20627 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f66350;

    public RunnableC20627(C19922 c19922, String str) {
        super(c19922);
        this.f66350 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z;
        long j;
        int i;
        String strM48358 = AbstractRunnableC21333.m48358(this.f66350);
        C19922 c19922 = this.f68752;
        AbstractC15440 abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strM48358);
        if (m48366(abstractC15440M48364)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC15440M48364.mo23113()) {
            str = "550 Can't RETR a directory\r\n";
        } else if (!abstractC15440M48364.mo23120()) {
            str = "550 File does not exist\r\n";
        } else if (abstractC15440M48364.mo27936()) {
            try {
                BufferedInputStream bufferedInputStreamM36518 = abstractC15440M48364.m36518();
                try {
                    byte[] bArr = new byte[65536];
                    if (c19922.m45863()) {
                        c19922.m45860("150 Sending file\r\n");
                        if (c19922.m45858()) {
                            long jMo23127 = abstractC15440M48364.mo23127() - 1;
                            long j2 = c19922.f64496;
                            if (j2 >= 0) {
                                long j3 = c19922.f64491;
                                j = j3 >= j2 ? j3 : jMo23127;
                                c19922.f64496 = -1L;
                                c19922.f64491 = -1L;
                            } else {
                                j2 = 0;
                                j = jMo23127;
                            }
                            long j4 = (j - j2) + 1;
                            C22194.m49856(j2, bufferedInputStreamM36518);
                            while (true) {
                                if (j4 > 0 && (i = bufferedInputStreamM36518.read(bArr)) != -1) {
                                    int iMin = (int) Math.min(i, j4);
                                    if (c19922.m45847(0, iMin, bArr)) {
                                        j4 -= (long) iMin;
                                    } else {
                                        str = "426 Data socket error\r\n";
                                    }
                                } else {
                                    bufferedInputStreamM36518.close();
                                    str = null;
                                }
                            }
                        } else if (c19922.f64496 >= 0) {
                            str = "550 Unable to seek to requested position in ASCII mode";
                        } else {
                            loop1: while (true) {
                                while (true) {
                                    int i2 = bufferedInputStreamM36518.read(bArr);
                                    if (i2 == -1) {
                                        break loop1;
                                    }
                                    byte[] bArr2 = {cb.k, 10};
                                    int i3 = 0;
                                    int i4 = 0;
                                    while (i3 < i2) {
                                        if (bArr[i3] == 10) {
                                            c19922.m45847(i4, i3 - i4, bArr);
                                            if (i3 == 0) {
                                                if (!z) {
                                                    c19922.m45847(0, 1, bArr2);
                                                }
                                            } else if (bArr[i3 - 1] != 13) {
                                                c19922.m45847(0, 1, bArr2);
                                            }
                                            i4 = i3;
                                        }
                                        i3++;
                                    }
                                    c19922.m45847(i4, i3 - i4, bArr);
                                    z = bArr[i2 + (-1)] == 13;
                                }
                            }
                            bufferedInputStreamM36518.close();
                            str = null;
                        }
                    } else {
                        str = "425 Error opening socket\r\n";
                    }
                    bufferedInputStreamM36518.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStreamM36518.close();
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
        c19922.m45841();
        if (str != null) {
            c19922.m45860(str);
        } else {
            c19922.m45860("226 Transmission finished\r\n");
        }
    }
}
