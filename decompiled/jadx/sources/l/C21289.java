package l;

import bin.mt.json.JSON;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩸ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21289 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f68644;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f68645;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12821 f68646;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f68647;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f68648;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f68649;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f68650;

    public C21289(C12821 c12821, String str, AbstractC15440 abstractC15440, C12619 c12619) {
        this.f68646 = c12821;
        this.f68648 = str;
        this.f68649 = abstractC15440;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m48316(OutputStream outputStream) throws Throwable {
        Throwable th;
        String str = this.f68648;
        C12821 c12821 = this.f68646;
        if (this.f68644) {
            if (this.f68645) {
                throw new IllegalStateException("The stable source can only be copied once");
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f68649.mo27926(), 65536);
                try {
                    long jM48312 = m48312(bufferedInputStream, outputStream);
                    try {
                        bufferedInputStream.close();
                        this.f68647 = jM48312;
                        this.f68645 = true;
                        this.f68650 = false;
                        return jM48312;
                    } catch (IOException e) {
                        c12821.f38470.getClass();
                        throw C17760.m41601(str, e);
                    } catch (RuntimeException e2) {
                        if (C12821.m31186(e2)) {
                            c12821.f38470.getClass();
                            throw C17760.m41600(e2, str);
                        }
                        throw e2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    th = e;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e4) {
                            if (th != null) {
                                th.addSuppressed(e4);
                            } else {
                                c12821.f38470.getClass();
                                throw C17760.m41601(str, e4);
                            }
                        } catch (RuntimeException e5) {
                            if (th != null) {
                                th.addSuppressed(e5);
                            } else {
                                if (C12821.m31186(e5)) {
                                    c12821.f38470.getClass();
                                    throw C17760.m41600(e5, str);
                                }
                                throw e5;
                            }
                        }
                        throw th;
                    }
                } catch (Error e6) {
                    e = e6;
                    th = e;
                    throw th;
                } catch (RuntimeException e7) {
                    e = e7;
                    th = e;
                    throw th;
                } catch (C3059 e8) {
                    e = e8;
                    th = e;
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                    th = null;
                    bufferedInputStream.close();
                    throw th;
                }
            } catch (IOException e9) {
                c12821.f38470.getClass();
                throw C17760.m41601(str, e9);
            } catch (RuntimeException e10) {
                if (!C12821.m31186(e10)) {
                    throw e10;
                }
                c12821.f38470.getClass();
                throw C17760.m41600(e10, str);
            }
        }
        throw new IllegalStateException("The stable source is only valid during its action");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m48312(BufferedInputStream bufferedInputStream, OutputStream outputStream) throws C3059, IOException {
        long j;
        String str = this.f68648;
        C12821 c12821 = this.f68646;
        byte[] bArr = new byte[65536];
        long j2 = 0;
        while (true) {
            try {
                int i = bufferedInputStream.read(bArr);
                if (i < 0) {
                    break;
                }
                if (i == 0) {
                    try {
                        int i2 = bufferedInputStream.read();
                        if (i2 < 0) {
                            break;
                        }
                        m48313(1, j2);
                        outputStream.write(i2);
                        j = 1;
                    } catch (IOException e) {
                        c12821.f38470.getClass();
                        throw C17760.m41601(str, e);
                    } catch (RuntimeException e2) {
                        if (!C12821.m31186(e2)) {
                            throw e2;
                        }
                        c12821.f38470.getClass();
                        throw C17760.m41600(e2, str);
                    }
                } else {
                    m48313(i, j2);
                    outputStream.write(bArr, 0, i);
                    j = i;
                }
                j2 += j;
            } catch (IOException e3) {
                c12821.f38470.getClass();
                throw C17760.m41601(str, e3);
            } catch (RuntimeException e4) {
                if (!C12821.m31186(e4)) {
                    throw e4;
                }
                c12821.f38470.getClass();
                throw C17760.m41600(e4, str);
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48313(int i, long j) throws C3059 {
        if (j <= 9007199254740991L - ((long) i)) {
            return;
        }
        throw C12821.m31145(JSON.array(), "The local source size exceeds the supported JSON integer range.", this.f68648, this.f68646.f38470.m41607().f22729, "copy_source");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48317(long j) {
        if (this.f68644) {
            if (!this.f68645) {
                throw new IllegalStateException("The stable source must be copied before it can be validated");
            }
            this.f68650 = false;
            if (j != this.f68647) {
                throw new IllegalStateException("The copied byte count does not match the source result");
            }
            this.f68646.f38470.m41607().m19883(this.f68648);
            this.f68650 = true;
            return;
        }
        throw new IllegalStateException("The stable source is only valid during its action");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48314(C21289 c21289) {
        if (!c21289.f68645 || !c21289.f68650) {
            throw new IllegalStateException("The stable source must be copied and validated before the action returns");
        }
    }
}
