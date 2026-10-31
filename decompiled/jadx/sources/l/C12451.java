package l;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes4.dex */
public final class C12451 implements InterfaceC6724 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f37449;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15544 f37450;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f37451;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f37452 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C11746 f37453;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f37454;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C13156 f37455;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f37456;

    public C12451(AbstractC15440 abstractC15440, C15544 c15544) throws Throwable {
        C11003.requireNonNull(abstractC15440, "file");
        this.f37450 = c15544;
        this.f37449 = Integer.MAX_VALUE;
        C17471 c17471M34938 = C14648.m34938();
        FileChannel fileChannel = null;
        try {
            FileChannel fileChannelMo27922 = abstractC15440.mo27922();
            C11003.requireNonNull(fileChannelMo27922, "checkpoint channel");
            try {
                this.f37453 = new C11746(fileChannelMo27922, c17471M34938);
            } catch (IOException | Error | RuntimeException e) {
                fileChannel = fileChannelMo27922;
                e = e;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (Throwable th) {
                        e.addSuppressed(th);
                    }
                }
                try {
                    c17471M34938.close();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30610(C12451 c12451, C13156 c13156) {
        if (c12451.f37455 != c13156) {
            throw new IllegalStateException("Hex restore delta entry is not active");
        }
        c12451.f37455 = null;
    }

    @Override // l.InterfaceC6724
    public final void finish() throws IOException {
        if (this.f37456) {
            throw new IllegalStateException("Hex restore delta store is closed");
        }
        if (this.f37455 != null) {
            throw new IOException("Hex restore delta entry is incomplete");
        }
        this.f37454 = true;
    }

    @Override // l.InterfaceC6724
    /* JADX INFO: renamed from: ܽ֫ */
    public final void mo18293() {
        if (this.f37456 || this.f37451 || !this.f37454 || this.f37455 != null) {
            throw new IllegalStateException("Hex restore delta store is not transferable");
        }
        this.f37451 = true;
        this.f37456 = true;
        this.f37452.clear();
        this.f37453.m28745();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f37456) {
            return;
        }
        this.f37456 = true;
        ArrayList arrayList = this.f37452;
        Throwable th = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            try {
                ((C3279) arrayList.get(size)).close();
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
            this.f37453.m28745();
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m30611(C12451 c12451) {
        if (c12451.f37456 || c12451.f37454 || c12451.f37451) {
            throw new IllegalStateException("Hex restore delta store is not writable");
        }
    }

    @Override // l.InterfaceC6724
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC14484 mo18294(int i) throws Throwable {
        if (!this.f37456 && !this.f37454 && !this.f37451) {
            if (this.f37455 != null) {
                throw new IllegalStateException("Previous hex restore delta entry is unfinished");
            }
            if (i <= 0 || i > this.f37449) {
                throw new IOException("Invalid hex restore delta entry length");
            }
            C3279 c3279 = null;
            try {
                C3279 c32710 = new C3279(this.f37453, i);
                try {
                    C13156 c13156 = new C13156(this, c32710, this.f37450, i);
                    this.f37452.add(c32710);
                    this.f37455 = c13156;
                    return c13156;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c3279 = c32710;
                    if (c3279 != null) {
                        try {
                            c3279.close();
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
