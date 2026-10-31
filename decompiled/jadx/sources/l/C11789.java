package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۨܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C11789 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6144 f35177;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f35178;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C0149 f35179;

    public C11789(C0149 c0149, C6144 c6144, int i) {
        this.f35179 = c0149;
        this.f35177 = c6144;
        this.f35178 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11789 m28842(C23721 c23721, InterfaceC20900 interfaceC20900, C1143 c1143, int i, InterfaceC17066 interfaceC17066) throws Throwable {
        C12494 c12494M28843 = m28843(interfaceC20900, c1143, i, interfaceC17066);
        try {
            try {
                C0149 c0149M1233 = C0149.m1233(c23721, c12494M28843.f37533, C14776.m35151(c12494M28843.f37532));
                try {
                    m28844(interfaceC17066);
                    return new C11789(c0149M1233, c12494M28843.f37533, c12494M28843.f37532);
                } catch (Error e) {
                    e = e;
                    c0149M1233.m1247();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    c0149M1233.m1247();
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    c12494M28843.f37533.close();
                } catch (IOException e4) {
                    e.addSuppressed(e4);
                }
                throw e;
            }
        } catch (Error e5) {
            e = e5;
            c12494M28843.f37533.close();
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            c12494M28843.f37533.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13199 m28845(InterfaceC20900 interfaceC20900, C1143 c1143, int i, InterfaceC17066 interfaceC17066) throws Throwable {
        C12494 c12494M28843 = m28843(interfaceC20900, c1143, i, interfaceC17066);
        try {
            return new C13199(new C7953(c12494M28843.f37533.mo14081(), C14776.m35151(c12494M28843.f37532), c1143), c12494M28843.f37532);
        } catch (IOException | Error | RuntimeException e) {
            try {
                c12494M28843.f37533.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12494 m28843(InterfaceC20900 interfaceC20900, C1143 c1143, int i, InterfaceC17066 interfaceC17066) throws Throwable {
        if (interfaceC17066 instanceof C2037) {
            interfaceC20900 = new C23182(interfaceC20900, interfaceC17066);
        }
        m28844(interfaceC17066);
        C6788 c6788Identity = interfaceC20900.identity();
        C5377 c5377M3921 = c1143.m3921(33024L);
        InputStream inputStream = null;
        inputStream = null;
        C5377 c5377 = null;
        inputStream = null;
        inputStream = null;
        try {
            try {
                byte[] bArr = new byte[32768];
                m28844(interfaceC17066);
                InputStream inputStreamMo14081 = interfaceC20900.mo14081();
                int i2 = 0;
                while (i2 < 32768) {
                    try {
                        m28844(interfaceC17066);
                        int iMin = Math.min(1024, 32768 - i2);
                        int i3 = inputStreamMo14081.read(bArr, i2, iMin);
                        if (i3 == -1) {
                            break;
                        }
                        if (i3 <= 0 || i3 > iMin) {
                            throw new IOException("Text input made invalid progress");
                        }
                        i2 += i3;
                    } catch (IOException | Error | RuntimeException e) {
                        inputStream = inputStreamMo14081;
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
                m28844(interfaceC17066);
                if (i2 == 0) {
                    i = C14776.f45134;
                } else if (i == -1) {
                    String strM38652 = C16398.m38652(i2, bArr);
                    i = strM38652 == null ? -1 : C14776.m35149(strM38652);
                    if (i == -1) {
                        i = C14776.m35152(i2, bArr);
                    }
                }
                try {
                    return new C12494(new C6144(c6788Identity, new C10378(inputStreamMo14081, bArr, i2, c5377M3921)), i);
                } catch (IOException e3) {
                    e = e3;
                    c5377M3921 = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw e;
                } catch (Error e4) {
                    e = e4;
                    c5377M3921 = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw e;
                } catch (RuntimeException e5) {
                    e = e5;
                    c5377M3921 = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (c5377 != null) {
                        c5377.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c5377 = c5377M3921;
                if (c5377 != null) {
                    c5377.close();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11789 m28841(C23721 c23721, InterfaceC20900 interfaceC20900, int i) {
        return new C11789(C0149.m1232(c23721, interfaceC20900), null, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28844(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new CancellationException("Text loading is canceled");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23077 m28848() {
        return new C23077(0, this.f35178, false, 0, null, null, null);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5131 m28847() {
        return this.f35179.m1245();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable m28846() {
        return this.f35179.m1248();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18495 m28849() {
        C0149 c0149 = this.f35179;
        return c0149.m1245().m14693() == 0 ? c0149.m1249() : c0149.m1242(65536);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f35179.m1247();
        C6144 c6144 = this.f35177;
        if (c6144 != null) {
            c6144.close();
        }
    }
}
