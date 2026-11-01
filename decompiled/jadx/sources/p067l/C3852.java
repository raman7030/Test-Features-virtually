package p067l;

import java.p066io.UncheckedIOException;

/* JADX INFO: renamed from: l.֫ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6RP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3852 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final C22902 f8294;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f8295;

    /* JADX INFO: renamed from: ᩹ */
    public final C7738 f8296;

    public C3852(C22902 c22902, C22902 c22903) {
        this.f8294 = c22902;
        this.f8296 = new C7738(c22902, c22903);
    }

    public C3852(C22902 c22902, C22902 c22903, int i) {
        this.f8294 = c22902;
        this.f8296 = C7738.m17852(c22902, c22903);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16631 m7567(C16631 c16631) {
        if (this.f8295) {
            throw new IllegalStateException("Recovery graph copy is closed");
        }
        C14443 c14443 = c16631.f48875;
        if (c14443.m34522().f38940 != this.f8294) {
            throw new IllegalArgumentException("Snapshot belongs to another recovery generation");
        }
        try {
            C13773 c13773M17856 = this.f8296.m17856(c14443.m34522());
            C4563 c4563M7565 = m7565(c16631.f48878);
            C14443 c14444 = new C14443(c13773M17856, c14443.m33057());
            try {
                return new C16631(c14444, c16631.f48876, c4563M7565, c16631.f48879, c16631.f48877);
            } catch (Error | RuntimeException e) {
                c14444.close();
                throw e;
            }
        } catch (UncheckedIOException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7568(Runnable runnable) {
        this.f8296.m17859(runnable);
    }

    /* JADX INFO: renamed from: ֫ */
    private C4563 m7565(C4563 c4563) {
        if (c4563 == null) {
            return null;
        }
        C7738 c7738 = this.f8296;
        C4563 c4564 = (C4563) c7738.m17855(c4563);
        if (c4564 != null) {
            return c4564;
        }
        c7738.m17857();
        C11503 c11503 = c4563.f10227;
        C4563 c4565 = new C4563(new C11503(new C17302(m7566(c11503.f32103.f51603, true)), new C17302(m7566(c11503.f32102.f51603, true)), c11503.f32101, c11503.f32100), c4563.f10229, c4563.f10226, c4563.f10230, c4563.f10228);
        c7738.m17858(c4563, c4565);
        return c4565;
    }

    /* JADX INFO: renamed from: ֫ */
    private C11269 m7566(C11269 c11269, boolean z) {
        Object c24441;
        C11269 c112610;
        if (c11269 == null) {
            return null;
        }
        C7738 c7738 = this.f8296;
        C11269 c112611 = (C11269) c7738.m17855(c11269);
        if (c112611 != null) {
            return c112611;
        }
        c7738.m17857();
        Object obj = c11269.f31388;
        if (obj == null) {
            c112610 = new C11269(m7566(c11269.f31390, z), m7566(c11269.f31389, z));
        } else {
            if (!z) {
                C24441 c24442 = (C24441) obj;
                c24441 = (C24441) c7738.m17855(c24442);
                if (c24441 == null) {
                    c7738.m17857();
                    c24441 = new C24441(c24442.f77380, c24442.f77383, c24442.f77381, c24442.f77386, c7738.m17856(c24442.f77382), c7738.m17856(c24442.f77379));
                    c7738.m17858(c24442, c24441);
                }
            } else {
                C10832 c10832 = (C10832) obj;
                c24441 = (C10832) c7738.m17855(c10832);
                if (c24441 == null) {
                    c7738.m17857();
                    c24441 = new C10832(c10832.f30005, c10832.f30006, c10832.f30007, new C17302(m7566(c10832.f30004.f51603, false)));
                    c7738.m17858(c10832, c24441);
                }
            }
            c112610 = new C11269(c24441);
        }
        c7738.m17858(c11269, c112610);
        return c112610;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f8295) {
            return;
        }
        this.f8295 = true;
        this.f8296.close();
    }
}
