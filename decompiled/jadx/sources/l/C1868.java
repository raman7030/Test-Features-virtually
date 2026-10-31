package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1868 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f6361;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18177 f6362;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f6363;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9711 f6364;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C16059 f6365;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11041 f6366;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f6367;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16765 f6368;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f6369;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9711 f6370;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21000 f6371;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f6372;

    /* JADX WARN: Code duplicated, block: B:29:0x0038 A[DONT_INVERT, PHI: r1
      0x0038: PHI (r1v9 'e' java.io.IOException) = 
      (r1v7 'e' java.io.IOException)
      (r1v7 'e' java.io.IOException)
      (r1v8 'e' java.io.IOException)
      (r1v7 'e' java.io.IOException)
     binds: [B:22:0x002a, B:28:0x0035, B:27:0x0033, B:23:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x003a A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:32:0x003c A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #3 {, blocks: (B:4:0x0002, B:9:0x0009, B:10:0x0010, B:13:0x0018, B:15:0x001c, B:21:0x0028, B:23:0x002c, B:32:0x003c, B:28:0x0035, B:20:0x0025), top: B:42:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x003a, please report this as an issue */
    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C9711 c9711;
        if (this.f6369) {
            return;
        }
        this.f6369 = true;
        this.f6368.close();
        try {
            this.f6371.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        C16059 c16059 = this.f6365;
        if (c16059 == null) {
            c9711 = this.f6364;
            if (c9711 != null) {
                if (e == null) {
                    return;
                } else {
                    throw e;
                }
            } else {
                c9711.close();
                if (e == null) {
                    return;
                } else {
                    throw e;
                }
            }
        }
        try {
            c16059.close();
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        c9711 = this.f6364;
        if (c9711 != null) {
            if (e == null) {
                return;
            } else {
                throw e;
            }
        }
        try {
            c9711.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            } else {
                e.addSuppressed(e3);
            }
        }
        if (e == null) {
            return;
        } else {
            throw e;
        }
        throw th;
    }

    public C1868(C11041 c11041, C9711 c9711, C21000 c21000, C18177 c18177, C16765 c16765, int i, int i2, int i3) {
        this.f6366 = c11041;
        this.f6370 = c9711;
        this.f6371 = c21000;
        this.f6362 = c18177;
        this.f6368 = c16765;
        this.f6372 = i;
        this.f6361 = i2;
        this.f6363 = i3;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0046 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6195(C23556 c23556) {
        C9711 c9711M47818;
        Throwable th;
        synchronized (this) {
            if (this.f6369 || this.f6367) {
                throw new IllegalStateException("Paste request is already consumed");
            }
            this.f6367 = true;
        }
        C16059 c16059 = null;
        try {
            try {
                c9711M47818 = this.f6371.m47818(c23556);
                try {
                    C16059 c16059M39444 = this.f6368.m39444(c23556);
                    try {
                        synchronized (this) {
                            try {
                                if (this.f6369) {
                                    throw new IllegalStateException("Paste request is closed");
                                }
                                this.f6364 = c9711M47818;
                                this.f6365 = c16059M39444;
                                try {
                                    this.f6368.close();
                                    try {
                                        this.f6371.close();
                                        return;
                                    } catch (IOException unused) {
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    c9711M47818 = null;
                                    while (true) {
                                        break;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                c16059 = c16059M39444;
                                th = th3;
                            }
                        }
                        break;
                        throw th;
                    } catch (IOException | Error | RuntimeException e) {
                        c16059 = c16059M39444;
                        e = e;
                        if (c16059 != null) {
                            try {
                                c16059.close();
                            } catch (IOException e2) {
                                e.addSuppressed(e2);
                            }
                        }
                        if (c9711M47818 != null) {
                            try {
                                c9711M47818.close();
                                throw e;
                            } catch (IOException e3) {
                                e.addSuppressed(e3);
                                throw e;
                            }
                        }
                        throw e;
                    }
                } catch (IOException e4) {
                    e = e4;
                } catch (Error e5) {
                    e = e5;
                } catch (RuntimeException e6) {
                    e = e6;
                }
            } catch (Throwable th4) {
                this.f6368.close();
                try {
                    this.f6371.close();
                } catch (IOException unused2) {
                }
                throw th4;
            }
        } catch (IOException | Error | RuntimeException e7) {
            e = e7;
            c9711M47818 = null;
        }
    }
}
