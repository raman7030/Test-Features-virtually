package l;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۖ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46SG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2764 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f8587;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f8588;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final UUID f8589;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2267 f8590;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C7247 f8591;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f8592;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1143 f8593;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f8594;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f8592) {
            return;
        }
        if (this.f8594 || this.f8587) {
            throw new IllegalStateException("Cannot release migration ownership during use");
        }
        try {
            this.f8591.close();
            this.f8592 = true;
            C2267 c2267 = this.f8590;
            if (c2267 != null) {
                c2267.close();
                this.f8590 = null;
            }
        } catch (Throwable th) {
            this.f8592 = true;
            C2267 c2268 = this.f8590;
            if (c2268 != null) {
                c2268.close();
                this.f8590 = null;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized Object m8525(C23909 c23909) {
        Object objM8524;
        if (this.f8592) {
            throw new IllegalStateException("Migration result is closed");
        }
        if (this.f8587 || this.f8594) {
            throw new IllegalStateException("Migration result is already in use");
        }
        this.f8587 = true;
        try {
            objM8524 = m8524(c23909);
            this.f8587 = false;
        } catch (Throwable th) {
            this.f8587 = false;
            throw th;
        }
        return objM8524;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m8527(C22044 c22044) {
        if (this.f8592) {
            throw new IllegalStateException("Migration result is closed");
        }
        if (this.f8594 || this.f8587) {
            throw new IllegalStateException("Migration result is already in use");
        }
        this.f8594 = true;
        try {
            m8524(null);
            c22044.m49606();
            this.f8594 = false;
        } catch (Throwable th) {
            this.f8594 = false;
            throw th;
        }
    }

    public C2764(InterfaceC20758 interfaceC20758, C7247 c7247, UUID uuid, C1143 c1143) {
        this.f8588 = interfaceC20758;
        this.f8591 = c7247;
        this.f8589 = uuid;
        this.f8593 = c1143;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 m8526() {
        return this.f8588;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final UUID m8528() {
        return this.f8589;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8523(C2764 c2764) throws IOException {
        c2764.m8524(null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Object m8524(C23909 c23909) throws IOException {
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        InterfaceC20758 interfaceC20758 = this.f8588;
        C7247 c7247 = this.f8591;
        C13596 c13596M19394 = c7247.m19394();
        UUID uuid = c13596M19394.f40549;
        UUID uuid2 = this.f8589;
        if (!uuid.equals(uuid2)) {
            throw new IOException("Migration recovery identity does not match");
        }
        InterfaceC20758 interfaceC20758M19382 = c7247.m19382(c13596M19394);
        C1143 c1143 = this.f8593;
        C21605 c21605M48785 = C21605.m48785(interfaceC20758M19382, c1143);
        try {
            try {
                C9323 c9323M22371 = new C8617(c21605M48785).m22371(C20612.f66331);
                try {
                    C7247.m19368(c13596M19394, c21605M48785, c9323M22371.f28277);
                    if (c9323M22371.f28285 != 0 || c9323M22371.f28278 != null || c9323M22371.f28280 != null) {
                        throw new IOException("Migration recovery requires explicit repair before cleanup");
                    }
                    C12641 c12641M30913 = C12641.m30913(c9323M22371.m24001());
                    if (!c12641M30913.f38084.equals(uuid2)) {
                        throw new IOException("Migration metadata identity does not match");
                    }
                    c12641M30913.m30918(interfaceC20758, c1143);
                    c21605M48785.f69371.mo14386();
                    interfaceC23015.mo28630(interfaceC20758);
                    C2267 c2267 = this.f8590;
                    this.f8590 = c9323M22371.m24000();
                    if (c2267 != null) {
                        c2267.close();
                    }
                    if (c23909 != null) {
                        C12704 c12704 = new C12704(c9323M22371.m24002(), c9323M22371.f28286);
                        try {
                            Object objM52662 = c23909.m52662(c12704, c12641M30913);
                            c12704.close();
                            c9323M22371.close();
                            c21605M48785.close();
                            return objM52662;
                        } catch (Throwable th) {
                            try {
                                c12704.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    c9323M22371.close();
                    c21605M48785.close();
                    return null;
                } catch (Throwable th3) {
                    try {
                        c9323M22371.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                c21605M48785.close();
                throw th5;
            }
            c21605M48785.close();
        } catch (Throwable th6) {
            th5.addSuppressed(th6);
        }
        throw th5;
    }
}
