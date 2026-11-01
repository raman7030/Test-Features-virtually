package p067l;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes4.dex */
public final class C14202 implements InterfaceC8759 {

    /* JADX INFO: renamed from: ۗ */
    public final int f40465;

    /* JADX INFO: renamed from: ۙ */
    public final C17142 f40466;

    /* JADX INFO: renamed from: ۤ */
    public boolean f40467;

    /* JADX INFO: renamed from: ۫ */
    public final ArrayList f40468 = new ArrayList();

    /* JADX INFO: renamed from: ۬ */
    public final C13532 f40469;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f40470;

    /* JADX INFO: renamed from: ᩸ */
    public C14872 f40471;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f40472;

    public C14202(AbstractC17043 abstractC17043, C17142 c17142) throws Throwable {
        C12826.requireNonNull(abstractC17043, "file");
        this.f40466 = c17142;
        this.f40465 = Integer.MAX_VALUE;
        C18973 c18973M37085 = C16290.m37085();
        FileChannel fileChannel = null;
        try {
            FileChannel fileChannelMo29983 = abstractC17043.mo29983();
            C12826.requireNonNull(fileChannelMo29983, "checkpoint channel");
            try {
                this.f40469 = new C13532(fileChannelMo29983, c18973M37085);
            } catch (IOException | Error | RuntimeException e) {
                fileChannel = fileChannelMo29983;
                e = e;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (Throwable th) {
                        e.addSuppressed(th);
                    }
                }
                try {
                    c18973M37085.close();
                    throw e;
                } catch (Throwable th2) {
                    e.addSuppressed(th2);
                    throw e;
                }
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Error e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32675(C14202 c14202, C14872 c14872) {
        if (c14202.f40471 != c14872) {
            throw new IllegalStateException("Hex restore delta entry is not active");
        }
        c14202.f40471 = null;
    }

    @Override // p067l.InterfaceC8759
    public final void finish() throws IOException {
        if (this.f40472) {
            throw new IllegalStateException("Hex restore delta store is closed");
        }
        if (this.f40471 != null) {
            throw new IOException("Hex restore delta entry is incomplete");
        }
        this.f40470 = true;
    }

    @Override // p067l.InterfaceC8759
    /* JADX INFO: renamed from: ܽ֫ */
    public final void mo20241() {
        if (this.f40472 || this.f40467 || !this.f40470 || this.f40471 != null) {
            throw new IllegalStateException("Hex restore delta store is not transferable");
        }
        this.f40467 = true;
        this.f40472 = true;
        this.f40468.clear();
        this.f40469.m30793();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f40472) {
            return;
        }
        this.f40472 = true;
        ArrayList arrayList = this.f40468;
        Throwable th = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            try {
                ((C5485) arrayList.get(size)).close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    th.addSuppressed(th2);
                }
            }
        }
        arrayList.clear();
        try {
            this.f40469.m30793();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            } else {
                th.addSuppressed(th3);
            }
        }
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new IOException("Unable to close hex restore delta store", th);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m32676(C14202 c14202) {
        if (c14202.f40472 || c14202.f40470 || c14202.f40467) {
            throw new IllegalStateException("Hex restore delta store is not writable");
        }
    }

    @Override // p067l.InterfaceC8759
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC16134 mo20242(int i) throws Throwable {
        if (!this.f40472 && !this.f40470 && !this.f40467) {
            if (this.f40471 != null) {
                throw new IllegalStateException("Previous hex restore delta entry is unfinished");
            }
            if (i <= 0 || i > this.f40465) {
                throw new IOException("Invalid hex restore delta entry length");
            }
            C5485 c5485 = null;
            try {
                C5485 c5486 = new C5485(this.f40469, i);
                try {
                    C14872 c14872 = new C14872(this, c5486, this.f40466, i);
                    this.f40468.add(c5486);
                    this.f40471 = c14872;
                    return c14872;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c5485 = c5486;
                    if (c5485 != null) {
                        try {
                            c5485.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
        } else {
            throw new IllegalStateException("Hex restore delta store is not writable");
        }
    }
}
