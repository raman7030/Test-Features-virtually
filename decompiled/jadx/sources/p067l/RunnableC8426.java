package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC8426 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public C13791 f22586;

    /* JADX INFO: renamed from: ᩹ */
    public C24519 f22587;

    public RunnableC8426(C13791 c13791) {
        this.f22586 = c13791;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19619(C11598 c11598) {
        C24519 c24519 = this.f22587;
        if (c24519 != null && c24519.f77666.f38982 == c11598) {
            return true;
        }
        C13791 c13791 = this.f22586;
        return c13791 != null && c13791.f38982 == c11598;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19618(C13791 c13791) {
        this.f22586 = c13791;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C24519 c24519;
        while (true) {
            synchronized (C12862.class) {
                if (C12862.f36181 != this) {
                    return;
                }
                C13791 c13791 = this.f22586;
                if (c13791 == null) {
                    C12862.f36181 = null;
                    return;
                }
                this.f22586 = null;
                if (C12862.f36180 == c13791.f38982) {
                    try {
                        c24519 = new C24519(c13791, c13791.f38982.m26694());
                        try {
                            this.f22587 = c24519;
                        } catch (IOException | RuntimeException unused) {
                        }
                    } catch (IOException | RuntimeException unused2) {
                        c24519 = null;
                    }
                } else {
                    c24519 = null;
                }
                if (c24519 != null) {
                    C12862.m29439(c24519);
                }
                synchronized (C12862.class) {
                    if (C12862.f36181 != this) {
                        return;
                    }
                    if (this.f22587 == c24519) {
                        this.f22587 = null;
                    }
                    if (this.f22586 == null) {
                        C12862.f36181 = null;
                        return;
                    }
                }
            }
        }
    }
}
