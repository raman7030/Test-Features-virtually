package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4144 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final int f9142;

    /* JADX INFO: renamed from: ۙ */
    public final C19644 f9143;

    /* JADX INFO: renamed from: ۛ */
    public final int f9144;

    /* JADX INFO: renamed from: ۤ */
    public C11598 f9145;

    /* JADX INFO: renamed from: ۨ */
    public C17631 f9146;

    /* JADX INFO: renamed from: ۫ */
    public final C12862 f9147;

    /* JADX INFO: renamed from: ۬ */
    public boolean f9148;

    /* JADX INFO: renamed from: ܰ */
    public final C18302 f9149;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f9150;

    /* JADX INFO: renamed from: ᩸ */
    public final C11598 f9151;

    /* JADX INFO: renamed from: ᩹ */
    public final C22327 f9152;

    /* JADX INFO: renamed from: ᩺ */
    public final int f9153;

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
        C11598 c11598;
        if (this.f9150) {
            return;
        }
        this.f9150 = true;
        this.f9149.close();
        try {
            this.f9152.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        C17631 c17631 = this.f9146;
        if (c17631 == null) {
            c11598 = this.f9145;
            if (c11598 != null) {
                if (e == null) {
                    return;
                } else {
                    throw e;
                }
            } else {
                c11598.close();
                if (e == null) {
                    return;
                } else {
                    throw e;
                }
            }
        }
        try {
            c17631.close();
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        c11598 = this.f9145;
        if (c11598 != null) {
            if (e == null) {
                return;
            } else {
                throw e;
            }
        }
        try {
            c11598.close();
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

    public C4144(C12862 c12862, C11598 c11598, C22327 c22327, C19644 c19644, C18302 c18302, int i, int i2, int i3) {
        this.f9147 = c12862;
        this.f9151 = c11598;
        this.f9152 = c22327;
        this.f9143 = c19644;
        this.f9149 = c18302;
        this.f9153 = i;
        this.f9142 = i2;
        this.f9144 = i3;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0046 */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8397(C24756 c24756) {
        C11598 c11598M50148;
        Throwable th;
        synchronized (this) {
            if (this.f9150 || this.f9148) {
                throw new IllegalStateException("Paste request is already consumed");
            }
            this.f9148 = true;
        }
        C17631 c17631 = null;
        try {
            try {
                c11598M50148 = this.f9152.m50148(c24756);
                try {
                    C17631 c17631M41680 = this.f9149.m41680(c24756);
                    try {
                        synchronized (this) {
                            try {
                                if (this.f9150) {
                                    throw new IllegalStateException("Paste request is closed");
                                }
                                this.f9145 = c11598M50148;
                                this.f9146 = c17631M41680;
                                try {
                                    this.f9149.close();
                                    try {
                                        this.f9152.close();
                                        return;
                                    } catch (IOException unused) {
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    c11598M50148 = null;
                                    while (true) {
                                        break;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                c17631 = c17631M41680;
                                th = th3;
                            }
                        }
                        break;
                        throw th;
                    } catch (IOException | Error | RuntimeException e) {
                        c17631 = c17631M41680;
                        e = e;
                        if (c17631 != null) {
                            try {
                                c17631.close();
                            } catch (IOException e2) {
                                e.addSuppressed(e2);
                            }
                        }
                        if (c11598M50148 != null) {
                            try {
                                c11598M50148.close();
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
                this.f9149.close();
                try {
                    this.f9152.close();
                } catch (IOException unused2) {
                }
                throw th4;
            }
        } catch (IOException | Error | RuntimeException e7) {
            e = e7;
            c11598M50148 = null;
        }
    }
}
