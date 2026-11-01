package p067l;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۖ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46SG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4996 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public boolean f11381;

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC22097 f11382;

    /* JADX INFO: renamed from: ۤ */
    public final UUID f11383;

    /* JADX INFO: renamed from: ۫ */
    public C4523 f11384;

    /* JADX INFO: renamed from: ۬ */
    public final C9256 f11385;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f11386;

    /* JADX INFO: renamed from: ᩸ */
    public final C3455 f11387;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f11388;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f11386) {
            return;
        }
        if (this.f11388 || this.f11381) {
            throw new IllegalStateException("Cannot release migration ownership during use");
        }
        try {
            this.f11385.close();
            this.f11386 = true;
            C4523 c4523 = this.f11384;
            if (c4523 != null) {
                c4523.close();
                this.f11384 = null;
            }
        } catch (Throwable th) {
            this.f11386 = true;
            C4523 c4524 = this.f11384;
            if (c4524 != null) {
                c4524.close();
                this.f11384 = null;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized Object m10573(C25092 c25092) {
        Object objM10572;
        if (this.f11386) {
            throw new IllegalStateException("Migration result is closed");
        }
        if (this.f11381 || this.f11388) {
            throw new IllegalStateException("Migration result is already in use");
        }
        this.f11381 = true;
        try {
            objM10572 = m10572(c25092);
            this.f11381 = false;
        } catch (Throwable th) {
            this.f11381 = false;
            throw th;
        }
        return objM10572;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m10575(C23319 c23319) {
        if (this.f11386) {
            throw new IllegalStateException("Migration result is closed");
        }
        if (this.f11388 || this.f11381) {
            throw new IllegalStateException("Migration result is already in use");
        }
        this.f11388 = true;
        try {
            m10572(null);
            c23319.m51942();
            this.f11388 = false;
        } catch (Throwable th) {
            this.f11388 = false;
            throw th;
        }
    }

    public C4996(InterfaceC22097 interfaceC22097, C9256 c9256, UUID uuid, C3455 c3455) {
        this.f11382 = interfaceC22097;
        this.f11385 = c9256;
        this.f11383 = uuid;
        this.f11387 = c3455;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22097 m10574() {
        return this.f11382;
    }

    /* JADX INFO: renamed from: ܽ */
    public final UUID m10576() {
        return this.f11383;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10571(C4996 c4996) throws IOException {
        c4996.m10572(null);
    }

    /* JADX INFO: renamed from: ۧ */
    private Object m10572(C25092 c25092) throws IOException {
        InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
        InterfaceC22097 interfaceC22097 = this.f11382;
        C9256 c9256 = this.f11385;
        C15290 c15290M21343 = c9256.m21343();
        UUID uuid = c15290M21343.f43625;
        UUID uuid2 = this.f11383;
        if (!uuid.equals(uuid2)) {
            throw new IOException("Migration recovery identity does not match");
        }
        InterfaceC22097 interfaceC22097M21331 = c9256.m21331(c15290M21343);
        C3455 c3455 = this.f11387;
        C22902 c22902M51132 = C22902.m51132(interfaceC22097M21331, c3455);
        try {
            try {
                C11229 c11229M24340 = new C10558(c22902M51132).m24340(C21958.f69011);
                try {
                    C9256.m21317(c15290M21343, c22902M51132, c11229M24340.f31225);
                    if (c11229M24340.f31233 != 0 || c11229M24340.f31226 != null || c11229M24340.f31228 != null) {
                        throw new IOException("Migration recovery requires explicit repair before cleanup");
                    }
                    C14383 c14383M32991 = C14383.m32991(c11229M24340.m26010());
                    if (!c14383M32991.f41110.equals(uuid2)) {
                        throw new IOException("Migration metadata identity does not match");
                    }
                    c14383M32991.m32996(interfaceC22097, c3455);
                    c22902M51132.f72074.mo16283();
                    interfaceC24242.mo30678(interfaceC22097);
                    C4523 c4523 = this.f11384;
                    this.f11384 = c11229M24340.m26009();
                    if (c4523 != null) {
                        c4523.close();
                    }
                    if (c25092 != null) {
                        C14443 c14443 = new C14443(c11229M24340.m26011(), c11229M24340.f31234);
                        try {
                            Object objM55071 = c25092.m55071(c14443, c14383M32991);
                            c14443.close();
                            c11229M24340.close();
                            c22902M51132.close();
                            return objM55071;
                        } catch (Throwable th) {
                            try {
                                c14443.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    c11229M24340.close();
                    c22902M51132.close();
                    return null;
                } catch (Throwable th3) {
                    try {
                        c11229M24340.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                c22902M51132.close();
                throw th5;
            }
            c22902M51132.close();
        } catch (Throwable th6) {
            th5.addSuppressed(th6);
        }
        throw th5;
    }
}
