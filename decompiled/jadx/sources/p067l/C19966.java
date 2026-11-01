package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C19966 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f60604;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f60605;

    /* JADX INFO: renamed from: ܽ */
    public final C20637 f60606;

    /* JADX INFO: renamed from: ܿ */
    public final C8168 f60607;

    /* JADX INFO: renamed from: ᩳ */
    public final C24301 f60608;

    public C19966(C5884 c5884) {
        this.f60606 = c5884.f14478;
        this.f60607 = c5884.f14481.finish();
        this.f60608 = c5884.f14476.m18242();
        this.f60605 = c5884.f14480;
        this.f60604 = c5884.f14479;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19966 m45315(C18878 c18878, InterfaceC22097 interfaceC22097, C3455 c3455, int i) {
        C19966 c19966M45314;
        synchronized (c18878) {
            C14383 c14383M32991 = C14383.m32991(c18878.m42961());
            if (!c14383M32991.m32998().equals(c18878.m42962())) {
                throw new IOException("Migration app identity does not match");
            }
            C14443 c14443M42965 = c18878.m42965();
            try {
                c19966M45314 = m45314(c14443M42965, c14383M32991, interfaceC22097, c3455, i);
                c14443M42965.close();
            } catch (Throwable th) {
                try {
                    c14443M42965.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return c19966M45314;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19966 m45314(C14443 c14443, C14383 c14383, InterfaceC22097 interfaceC22097, C3455 c3455, int i) throws IOException {
        if (!c14383.m32997() || i < 0 || c14383.m33000() > i) {
            throw new IOException("Migration app state is missing or exceeds limit");
        }
        C5884 c5884 = new C5884(c14443, i);
        try {
            C19077.m43351(c14383.m32993(interfaceC22097, c3455), c14383.m33000(), c3455, c5884);
            c5884.m13230();
            C19966 c19966 = new C19966(c5884);
            c5884.close();
            return c19966;
        } catch (Throwable th) {
            try {
                c5884.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
