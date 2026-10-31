package l;

import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.֫ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6RP */
/* JADX INFO: loaded from: classes2.dex */
public final class C1561 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21605 f5514;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f5515;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5649 f5516;

    public C1561(C21605 c21605, C21605 c21606) {
        this.f5514 = c21605;
        this.f5516 = new C5649(c21605, c21606);
    }

    public C1561(C21605 c21605, C21605 c21606, int i) {
        this.f5514 = c21605;
        this.f5516 = C5649.m15931(c21605, c21606);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15007 m5338(C15007 c15007) {
        if (this.f5515) {
            throw new IllegalStateException("Recovery graph copy is closed");
        }
        C12704 c12704 = c15007.f45762;
        if (c12704.m32420().f35930 != this.f5514) {
            throw new IllegalArgumentException("Snapshot belongs to another recovery generation");
        }
        try {
            C11999 c11999M15935 = this.f5516.m15935(c12704.m32420());
            C2309 c2309M5336 = m5336(c15007.f45765);
            C12704 c12705 = new C12704(c11999M15935, c12704.m30979());
            try {
                return new C15007(c12705, c15007.f45763, c2309M5336, c15007.f45766, c15007.f45764);
            } catch (Error | RuntimeException e) {
                c12705.close();
                throw e;
            }
        } catch (UncheckedIOException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5339(Runnable runnable) {
        this.f5516.m15938(runnable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2309 m5336(C2309 c2309) {
        if (c2309 == null) {
            return null;
        }
        C5649 c5649 = this.f5516;
        C2309 c23010 = (C2309) c5649.m15934(c2309);
        if (c23010 != null) {
            return c23010;
        }
        c5649.m15936();
        C9611 c9611 = c2309.f7441;
        C2309 c23011 = new C2309(new C9611(new C15713(m5337(c9611.f29156.f48465, true)), new C15713(m5337(c9611.f29155.f48465, true)), c9611.f29154, c9611.f29153), c2309.f7443, c2309.f7440, c2309.f7444, c2309.f7442);
        c5649.m15937(c2309, c23011);
        return c23011;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9365 m5337(C9365 c9365, boolean z) {
        Object c23224;
        C9365 c9366;
        if (c9365 == null) {
            return null;
        }
        C5649 c5649 = this.f5516;
        C9365 c9367 = (C9365) c5649.m15934(c9365);
        if (c9367 != null) {
            return c9367;
        }
        c5649.m15936();
        Object obj = c9365.f28439;
        if (obj == null) {
            c9366 = new C9365(m5337(c9365.f28441, z), m5337(c9365.f28440, z));
        } else {
            if (!z) {
                C23224 c23225 = (C23224) obj;
                c23224 = (C23224) c5649.m15934(c23225);
                if (c23224 == null) {
                    c5649.m15936();
                    c23224 = new C23224(c23225.f74637, c23225.f74640, c23225.f74638, c23225.f74643, c5649.m15935(c23225.f74639), c5649.m15935(c23225.f74636));
                    c5649.m15937(c23225, c23224);
                }
            } else {
                C8905 c8905 = (C8905) obj;
                c23224 = (C8905) c5649.m15934(c8905);
                if (c23224 == null) {
                    c5649.m15936();
                    c23224 = new C8905(c8905.f27082, c8905.f27083, c8905.f27084, new C15713(m5337(c8905.f27081.f48465, false)));
                    c5649.m15937(c8905, c23224);
                }
            }
            c9366 = new C9365(c23224);
        }
        c5649.m15937(c9365, c9366);
        return c9366;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f5515) {
            return;
        }
        this.f5515 = true;
        this.f5516.close();
    }
}
