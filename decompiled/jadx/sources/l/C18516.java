package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18516 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f57383;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f57384;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19222 f57385;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6102 f57386;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23077 f57387;

    public C18516(C3699 c3699) {
        this.f57385 = c3699.f11676;
        this.f57386 = c3699.f11679.finish();
        this.f57387 = c3699.f11674.m16317();
        this.f57384 = c3699.f11678;
        this.f57383 = c3699.f11677;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18516 m43037(C17371 c17371, InterfaceC20758 interfaceC20758, C1143 c1143, int i) {
        C18516 c18516M43036;
        synchronized (c17371) {
            C12641 c12641M30913 = C12641.m30913(c17371.m40710());
            if (!c12641M30913.m30920().equals(c17371.m40711())) {
                throw new IOException("Migration app identity does not match");
            }
            C12704 c12704M40714 = c17371.m40714();
            try {
                c18516M43036 = m43036(c12704M40714, c12641M30913, interfaceC20758, c1143, i);
                c12704M40714.close();
            } catch (Throwable th) {
                try {
                    c12704M40714.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return c18516M43036;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18516 m43036(C12704 c12704, C12641 c12641, InterfaceC20758 interfaceC20758, C1143 c1143, int i) throws IOException {
        if (!c12641.m30919() || i < 0 || c12641.m30922() > i) {
            throw new IOException("Migration app state is missing or exceeds limit");
        }
        C3699 c3699 = new C3699(c12704, i);
        try {
            C17580.m41105(c12641.m30915(interfaceC20758, c1143), c12641.m30922(), c1143, c3699);
            c3699.m11283();
            C18516 c18516 = new C18516(c3699);
            c3699.close();
            return c18516;
        } catch (Throwable th) {
            try {
                c3699.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
