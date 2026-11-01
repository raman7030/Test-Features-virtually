package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۨܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C13573 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final C8208 f38176;

    /* JADX INFO: renamed from: ᩸ */
    public final int f38177;

    /* JADX INFO: renamed from: ᩹ */
    public final C2510 f38178;

    public C13573(C2510 c2510, C8208 c8208, int i) {
        this.f38178 = c2510;
        this.f38176 = c8208;
        this.f38177 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13573 m30891(C24913 c24913, InterfaceC22232 interfaceC22232, C3455 c3455, int i, InterfaceC18588 interfaceC18588) throws Throwable {
        C14243 c14243M30892 = m30892(interfaceC22232, c3455, i, interfaceC18588);
        try {
            try {
                C2510 c2510M3635 = C2510.m3635(c24913, c14243M30892.f40556, C16412.m37298(c14243M30892.f40555));
                try {
                    m30893(interfaceC18588);
                    return new C13573(c2510M3635, c14243M30892.f40556, c14243M30892.f40555);
                } catch (Error e) {
                    e = e;
                    c2510M3635.m3649();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    c2510M3635.m3649();
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    c14243M30892.f40556.close();
                } catch (IOException e4) {
                    e.addSuppressed(e4);
                }
                throw e;
            }
        } catch (Error e5) {
            e = e5;
            c14243M30892.f40556.close();
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            c14243M30892.f40556.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14913 m30894(InterfaceC22232 interfaceC22232, C3455 c3455, int i, InterfaceC18588 interfaceC18588) throws Throwable {
        C14243 c14243M30892 = m30892(interfaceC22232, c3455, i, interfaceC18588);
        try {
            return new C14913(new C9927(c14243M30892.f40556.mo15961(), C16412.m37298(c14243M30892.f40555), c3455), c14243M30892.f40555);
        } catch (IOException | Error | RuntimeException e) {
            try {
                c14243M30892.f40556.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static C14243 m30892(InterfaceC22232 interfaceC22232, C3455 c3455, int i, InterfaceC18588 interfaceC18588) throws Throwable {
        if (interfaceC18588 instanceof C4305) {
            interfaceC22232 = new C24401(interfaceC22232, interfaceC18588);
        }
        m30893(interfaceC18588);
        C8820 c8820Identity = interfaceC22232.identity();
        C7479 c7479M6162 = c3455.m6162(33024L);
        InputStream inputStream = null;
        inputStream = null;
        C7479 c7479 = null;
        inputStream = null;
        inputStream = null;
        try {
            try {
                byte[] bArr = new byte[32768];
                m30893(interfaceC18588);
                InputStream inputStreamMo15961 = interfaceC22232.mo15961();
                int i2 = 0;
                while (i2 < 32768) {
                    try {
                        m30893(interfaceC18588);
                        int iMin = Math.min(1024, 32768 - i2);
                        int i3 = inputStreamMo15961.read(bArr, i2, iMin);
                        if (i3 == -1) {
                            break;
                        }
                        if (i3 <= 0 || i3 > iMin) {
                            throw new IOException("Text input made invalid progress");
                        }
                        i2 += i3;
                    } catch (IOException | Error | RuntimeException e) {
                        inputStream = inputStreamMo15961;
                        e = e;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                e.addSuppressed(e2);
                            }
                        }
                        throw e;
                    }
                }
                m30893(interfaceC18588);
                if (i2 == 0) {
                    i = C16412.f48248;
                } else if (i == -1) {
                    String strM40868 = C17953.m40868(i2, bArr);
                    i = strM40868 == null ? -1 : C16412.m37296(strM40868);
                    if (i == -1) {
                        i = C16412.m37299(i2, bArr);
                    }
                }
                try {
                    return new C14243(new C8208(c8820Identity, new C12232(inputStreamMo15961, bArr, i2, c7479M6162)), i);
                } catch (IOException e3) {
                    e = e3;
                    c7479M6162 = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw e;
                } catch (Error e4) {
                    e = e4;
                    c7479M6162 = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw e;
                } catch (RuntimeException e5) {
                    e = e5;
                    c7479M6162 = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (c7479 != null) {
                        c7479.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c7479 = c7479M6162;
                if (c7479 != null) {
                    c7479.close();
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (Error e7) {
            e = e7;
        } catch (RuntimeException e8) {
            e = e8;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13573 m30890(C24913 c24913, InterfaceC22232 interfaceC22232, int i) {
        return new C13573(C2510.m3634(c24913, interfaceC22232), null, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30893(InterfaceC18588 interfaceC18588) {
        if (interfaceC18588.mo3924()) {
            throw new CancellationException("Text loading is canceled");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C24301 m30897() {
        return new C24301(0, this.f38177, false, 0, null, null, null);
    }

    /* JADX INFO: renamed from: ܳ */
    public final C7245 m30896() {
        return this.f38178.m3647();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Throwable m30895() {
        return this.f38178.m3650();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C19946 m30898() {
        C2510 c2510 = this.f38178;
        return c2510.m3647().m16601() == 0 ? c2510.m3651() : c2510.m3644(65536);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f38178.m3649();
        C8208 c8208 = this.f38176;
        if (c8208 != null) {
            c8208.close();
        }
    }
}
