package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6373 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12018 f19713;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23306 f19714;

    public RunnableC6373(C12018 c12018) {
        this.f19713 = c12018;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17674(C9711 c9711) {
        C23306 c23306 = this.f19714;
        if (c23306 != null && c23306.f74921.f35972 == c9711) {
            return true;
        }
        C12018 c12018 = this.f19713;
        return c12018 != null && c12018.f35972 == c9711;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17673(C12018 c12018) {
        this.f19713 = c12018;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23306 c23306;
        while (true) {
            synchronized (C11041.class) {
                if (C11041.f33186 != this) {
                    return;
                }
                C12018 c12018 = this.f19713;
                if (c12018 == null) {
                    C11041.f33186 = null;
                    return;
                }
                this.f19713 = null;
                if (C11041.f33185 == c12018.f35972) {
                    try {
                        c23306 = new C23306(c12018, c12018.f35972.m24680());
                        try {
                            this.f19714 = c23306;
                        } catch (IOException | RuntimeException unused) {
                        }
                    } catch (IOException | RuntimeException unused2) {
                        c23306 = null;
                    }
                } else {
                    c23306 = null;
                }
                if (c23306 != null) {
                    C11041.m27377(c23306);
                }
                synchronized (C11041.class) {
                    if (C11041.f33186 != this) {
                        return;
                    }
                    if (this.f19714 == c23306) {
                        this.f19714 = null;
                    }
                    if (this.f19713 == null) {
                        C11041.f33186 = null;
                        return;
                    }
                }
            }
        }
    }
}
