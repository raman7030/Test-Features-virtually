package p067l;

import bin.p000mt.json.JSON;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩸ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22601 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f71336;

    /* JADX INFO: renamed from: ۧ */
    public boolean f71337;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C14553 f71338;

    /* JADX INFO: renamed from: ܽ */
    public long f71339;

    /* JADX INFO: renamed from: ܿ */
    public final String f71340;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043 f71341;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f71342;

    public C22601(C14553 c14553, String str, AbstractC17043 abstractC17043, C14362 c14362) {
        this.f71338 = c14553;
        this.f71340 = str;
        this.f71341 = abstractC17043;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m50650(OutputStream outputStream) throws Throwable {
        Throwable th;
        String str = this.f71340;
        C14553 c14553 = this.f71338;
        if (this.f71336) {
            if (this.f71337) {
                throw new IllegalStateException("The stable source can only be copied once");
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f71341.mo29987(), 65536);
                try {
                    long jM50646 = m50646(bufferedInputStream, outputStream);
                    try {
                        bufferedInputStream.close();
                        this.f71339 = jM50646;
                        this.f71337 = true;
                        this.f71342 = false;
                        return jM50646;
                    } catch (IOException e) {
                        c14553.f41513.getClass();
                        throw C19247.m43846(str, e);
                    } catch (RuntimeException e2) {
                        if (C14553.m33272(e2)) {
                            c14553.f41513.getClass();
                            throw C19247.m43845(e2, str);
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
                                c14553.f41513.getClass();
                                throw C19247.m43846(str, e4);
                            }
                        } catch (RuntimeException e5) {
                            if (th != null) {
                                th.addSuppressed(e5);
                            } else {
                                if (C14553.m33272(e5)) {
                                    c14553.f41513.getClass();
                                    throw C19247.m43845(e5, str);
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
                } catch (C5276 e8) {
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
                c14553.f41513.getClass();
                throw C19247.m43846(str, e9);
            } catch (RuntimeException e10) {
                if (!C14553.m33272(e10)) {
                    throw e10;
                }
                c14553.f41513.getClass();
                throw C19247.m43845(e10, str);
            }
        }
        throw new IllegalStateException("The stable source is only valid during its action");
    }

    /* JADX INFO: renamed from: ֫ */
    private long m50646(BufferedInputStream bufferedInputStream, OutputStream outputStream) throws C5276, IOException {
        long j;
        String str = this.f71340;
        C14553 c14553 = this.f71338;
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
                        m50647(1, j2);
                        outputStream.write(i2);
                        j = 1;
                    } catch (IOException e) {
                        c14553.f41513.getClass();
                        throw C19247.m43846(str, e);
                    } catch (RuntimeException e2) {
                        if (!C14553.m33272(e2)) {
                            throw e2;
                        }
                        c14553.f41513.getClass();
                        throw C19247.m43845(e2, str);
                    }
                } else {
                    m50647(i, j2);
                    outputStream.write(bArr, 0, i);
                    j = i;
                }
                j2 += j;
            } catch (IOException e3) {
                c14553.f41513.getClass();
                throw C19247.m43846(str, e3);
            } catch (RuntimeException e4) {
                if (!C14553.m33272(e4)) {
                    throw e4;
                }
                c14553.f41513.getClass();
                throw C19247.m43845(e4, str);
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50647(int i, long j) throws C5276 {
        if (j <= 9007199254740991L - ((long) i)) {
            return;
        }
        throw C14553.m33231(JSON.array(), "The local source size exceeds the supported JSON integer range.", this.f71340, this.f71338.f41513.m43852().f25641, "copy_source");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50651(long j) {
        if (this.f71336) {
            if (!this.f71337) {
                throw new IllegalStateException("The stable source must be copied before it can be validated");
            }
            this.f71342 = false;
            if (j != this.f71339) {
                throw new IllegalStateException("The copied byte count does not match the source result");
            }
            this.f71338.f41513.m43852().m21856(this.f71340);
            this.f71342 = true;
            return;
        }
        throw new IllegalStateException("The stable source is only valid during its action");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50648(C22601 c22601) {
        if (!c22601.f71337 || !c22601.f71342) {
            throw new IllegalStateException("The stable source must be copied and validated before the action returns");
        }
    }
}
