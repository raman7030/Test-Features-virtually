package p067l;

import java.io.IOException;
import java.nio.CharBuffer;
import java.p066io.UncheckedIOException;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24913 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final AtomicBoolean f79546 = new AtomicBoolean();

    /* JADX INFO: renamed from: ֫֫ */
    public C4563 f79547;

    /* JADX INFO: renamed from: ۖ֫ */
    public volatile long f79548;

    /* JADX INFO: renamed from: ۗ */
    public FutureC5767 f79549;

    /* JADX INFO: renamed from: ۘ֫ */
    public C22902 f79550;

    /* JADX INFO: renamed from: ۙ */
    public long f79551;

    /* JADX INFO: renamed from: ۛ */
    public C5056 f79552;

    /* JADX INFO: renamed from: ۜ֫ */
    public final UUID f79553;

    /* JADX INFO: renamed from: ۟ */
    public boolean f79554;

    /* JADX INFO: renamed from: ۡ֫ */
    public final C11939 f79555;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f79556;

    /* JADX INFO: renamed from: ۤ */
    public C9256 f79557;

    /* JADX INFO: renamed from: ۧ֫ */
    public C15961 f79558;

    /* JADX INFO: renamed from: ۨ */
    public final Object f79559;

    /* JADX INFO: renamed from: ۫ */
    public volatile boolean f79560;

    /* JADX INFO: renamed from: ۬ */
    public volatile boolean f79561;

    /* JADX INFO: renamed from: ܰ */
    public boolean f79562;

    /* JADX INFO: renamed from: ܳ֫ */
    public C7245 f79563;

    /* JADX INFO: renamed from: ܺ֫ */
    public final FutureC5767 f79564;

    /* JADX INFO: renamed from: ܽ֫ */
    public long f79565;

    /* JADX INFO: renamed from: ܿ֫ */
    public C17302 f79566;

    /* JADX INFO: renamed from: ᩳ֫ */
    public long f79567;

    /* JADX INFO: renamed from: ᩶ */
    public long f79568;

    /* JADX INFO: renamed from: ᩷֫ */
    public C4523 f79569;

    /* JADX INFO: renamed from: ᩸ */
    public C2510 f79570;

    /* JADX INFO: renamed from: ᩹ */
    public int f79571;

    /* JADX INFO: renamed from: ᩺ */
    public C17973 f79572;

    /* JADX INFO: renamed from: ᩻֫ */
    public C19549 f79573;

    public /* synthetic */ C24913(C22902 c22902, C5056 c5056, C4523 c4523, C4563 c4563, C10558 c10558, C21561 c21561, C14620 c14620, int i) {
        this(c22902, c5056, c4523, c4563, c10558, c21561, c14620);
    }

    /* JADX INFO: renamed from: ֡ */
    public final synchronized long m54732() {
        m54731();
        return this.f79547.f10226;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m54737(int i, int i2) {
        m54722();
        C7205 c7205 = new C7205(i, i2);
        if (i > this.f79552.length() || i2 > this.f79552.length()) {
            throw new IndexOutOfBoundsException("Selection exceeds text length");
        }
        if (c7205.equals(this.f79547.f10229)) {
            return;
        }
        C4563 c4563 = this.f79547;
        this.f79547 = new C4563(c4563.f10227, c7205, c4563.f10226, c4563.f10230, c4563.f10228);
        m54729(1L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m54739(C2510 c2510) {
        if (this.f79570 == c2510) {
            m54722();
            m54721();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m54740(C2510 c2510, EnumC2550 enumC2550, EnumC20657 enumC20657) {
        m54721();
        if (this.f79570 != c2510) {
            return;
        }
        m54722();
        C7245 c7245M16591 = this.f79563.m16591(enumC2550, enumC20657);
        this.f79563 = c7245M16591;
        c2510.f4070 = c7245M16591;
        this.f79570 = null;
        m54729(1L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m54741(C2510 c2510, C7245 c7245) {
        m54722();
        m54721();
        if (this.f79570 != null) {
            throw new IllegalStateException("Text loader is already active");
        }
        if (c7245 != null) {
            if (this.f79552.length() != 0 || this.f79563.m16593() != null || this.f79547.f10227.m26556() || !this.f79547.f10227.f32102.isEmpty()) {
                throw new IllegalStateException("Initial text loading requires an empty session");
            }
            this.f79563 = c7245;
        } else {
            if (this.f79563.m16599() || this.f79563.m16593() == null) {
                throw new IllegalStateException("No incomplete text source to resume");
            }
            this.f79563 = this.f79563.m16591(EnumC2550.LOADING, EnumC20657.NONE);
        }
        this.f79570 = c2510;
        c2510.f4070 = this.f79563;
        m54729(1L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m54743(C12610 c12610, C7047 c7047) {
        C17973 c17973 = this.f79572;
        if (c17973 == null || c17973.f53676 != c12610 || c12610.f35402) {
            throw new IllegalStateException("History replay step is not active");
        }
        c12610.f35402 = true;
        m54704(EnumC15723.USER, c7047, c12610);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m54744(C16195 c16195) {
        m54722();
        m54721();
        if (this.f79570 != null || this.f79562) {
            throw new IllegalStateException("Cannot replace active loading or checkpoint session");
        }
        synchronized (c16195) {
            C16631 c16631M36888 = C16195.m36888(c16195);
            C22902 c22902 = c16631M36888.f48875.m34522().f38940;
            C22902 c22903 = this.f79550;
            C21958.f69011.getClass();
            C3852 c3852 = new C3852(c22902, c22903, 0);
            try {
                C16631 c16631M7567 = c3852.m7567(c16631M36888);
                try {
                    C5056 c5056 = new C5056(c16631M7567.f48875.m34522(), c16631M7567.f48875.m33057());
                    C15961 c15961 = new C15961();
                    try {
                        C4563 c4563 = c16631M7567.f48878;
                        C4563 c4564 = new C4563(c4563.f10227.m26553(c15961, c4563.f10228, m54771()), c4563.f10229, c4563.f10226, c4563.f10230, c4563.f10228);
                        C22902 c22904 = this.f79550;
                        C4523 c4523M9576 = C4523.m9576(c22904 == null ? null : c22904.f72073, c16631M7567.f48876.f10147);
                        C5056 c5057 = this.f79552;
                        C4523 c4523 = this.f79569;
                        C15961 c15962 = this.f79558;
                        synchronized (this.f79559) {
                            this.f79552 = c5056;
                        }
                        this.f79569 = c4523M9576;
                        this.f79547 = c4564;
                        this.f79563 = c16631M7567.f48879;
                        this.f79558 = c15961;
                        try {
                            m54729(Math.max(1, c5056.length()));
                            c5057.close();
                            c4523.close();
                            c15962.m36263();
                            c16631M7567.close();
                            c3852.close();
                        } catch (Throwable th) {
                            c5057.close();
                            c4523.close();
                            c15962.m36263();
                            throw th;
                        }
                    } catch (Error e) {
                        e = e;
                        c5056.close();
                        c15961.m36263();
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        c5056.close();
                        c15961.m36263();
                        throw e;
                    }
                } catch (Throwable th2) {
                    try {
                        c16631M7567.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    c3852.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m54745(C19549 c19549) {
        if (this.f79573 != c19549 || c19549.f59510) {
            throw new IllegalStateException("Text load publication is not active");
        }
        if (!m54715(c19549.f59513, c19549.f59509, c19549.f59514, c19549.f59511, c19549.f59512, c19549)) {
            throw new IllegalStateException("Text load publication was invalidated");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m54747(C2510 c2510, char[] cArr, int i, C7245 c7245, int i2) {
        m54721();
        return m54715(c2510, cArr, i, c7245, i2, (C19549) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m54748(InterfaceC3221 interfaceC3221, C2510 c2510, char[] cArr, int i, C7245 c7245, int i2) {
        if (this.f79570 == c2510 && !c2510.m3648()) {
            m54722();
            m54721();
            if (((long) this.f79552.length()) + ((long) i) > i2) {
                return false;
            }
            C19549 c19549 = new C19549(c2510, cArr, i, c7245, i2);
            this.f79573 = c19549;
            try {
                if (i == 0) {
                    m54745(c19549);
                } else {
                    interfaceC3221.mo5557(c19549);
                }
                boolean z = c19549.f59510;
                this.f79573 = null;
                return z;
            } catch (Throwable th) {
                this.f79573 = null;
                throw th;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ */
    public final synchronized void m54750() {
        m54722();
    }

    /* JADX INFO: renamed from: ۗ */
    public final synchronized byte[] m54751() {
        m54731();
        return (byte[]) this.f79569.f10147.clone();
    }

    /* JADX INFO: renamed from: ۘ */
    public final synchronized void m54752() {
        m54722();
        m54721();
        if (this.f79547.f10227.m26556() || !this.f79547.f10227.f32102.isEmpty()) {
            C11503 c11503 = this.f79547.f10227;
            c11503.getClass();
            C11503 c11504 = new C11503(new C17302(), new C17302(), c11503.f32101, c11503.f32100);
            C4563 c4563 = this.f79547;
            this.f79547 = new C4563(c11504, c4563.f10229, c4563.f10226, c4563.f10230, c4563.f10228);
            this.f79558.m36263();
            m54729(1L);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public final synchronized C7245 m54753() {
        m54731();
        return this.f79563;
    }

    /* JADX INFO: renamed from: ۜ */
    public final synchronized C16631 m54754() {
        m54731();
        if (this.f79556 || this.f79572 != null || this.f79554 || this.f79573 != null) {
            throw new IllegalStateException("Cannot capture session during edit");
        }
        if (this.f79562 && this.f79551 != this.f79548) {
            throw new IllegalStateException("Current session state requires an explicit checkpoint");
        }
        return new C16631(this.f79552.m10785(), this.f79569, this.f79547, this.f79563, this.f79548);
    }

    /* JADX INFO: renamed from: ۟ */
    public final synchronized UUID m54755() {
        C22902 c22902;
        m54731();
        c22902 = this.f79550;
        return c22902 == null ? this.f79553 : c22902.f72077;
    }

    /* JADX INFO: renamed from: ۤ */
    public final synchronized C22902 m54756() {
        m54722();
        m54721();
        if (this.f79555 == null) {
            throw new IllegalStateException("Operation requires persistent storage");
        }
        this.f79550.m51158();
        return this.f79550;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized FutureC5767 m54757(long j) {
        C11939 c11939;
        m54731();
        m54721();
        if (this.f79555 == null && j > this.f79548) {
            throw new IllegalArgumentException("Revision exceeds current session");
        }
        c11939 = this.f79555;
        return c11939 == null ? FutureC5767.m12882(Long.valueOf(this.f79548)) : c11939.m27292(j);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m54758(byte[] bArr) {
        m54722();
        if (Arrays.equals(this.f79569.f10147, bArr)) {
            return;
        }
        C22902 c22902 = this.f79550;
        C4523 c4523M9576 = C4523.m9576(c22902 == null ? null : c22902.f72073, bArr);
        C4523 c4523 = this.f79569;
        this.f79569 = c4523M9576;
        try {
            m54729(Math.max(1, bArr.length));
            c4523.close();
        } catch (Throwable th) {
            c4523.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean m54759(boolean z) {
        C8586 c8586M19993;
        m54731();
        c8586M19993 = C8586.m19993(this.f79547, z);
        return (c8586M19993 == null || c8586M19993.m19995() || !c8586M19993.m19994()) ? false : true;
    }

    /* JADX INFO: renamed from: ۬ */
    public final synchronized void m54761() {
        m54731();
        C11939 c11939 = this.f79555;
        if (c11939 != null) {
            c11939.m27300();
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public final synchronized C7205 m54762() {
        m54731();
        return this.f79547.f10229;
    }

    /* JADX INFO: renamed from: ܳ */
    public final synchronized C9217 m54763() {
        C9217 c9217;
        m54722();
        m54721();
        if (!this.f79562) {
            throw new IllegalStateException("Explicit checkpoints are not enabled");
        }
        c9217 = new C9217(this, new C16631(this.f79552.m10785(), this.f79569, this.f79547, this.f79563, this.f79548 + 1), this.f79550.f72077, this.f79568);
        this.f79548++;
        return c9217;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized boolean m54765() {
        m54731();
        return !this.f79547.f10227.f32102.isEmpty();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized void m54766(long j) {
        m54722();
        m54721();
        if (j < 0) {
            throw new IllegalArgumentException("Invalid history budget");
        }
        C4563 c4563 = this.f79547;
        if (j == c4563.f10228) {
            return;
        }
        C11503 c11503M26553 = c4563.f10227.m26553(this.f79558, j, m54771());
        C4563 c4564 = this.f79547;
        this.f79547 = new C4563(c11503M26553, c4564.f10229, c4564.f10226, c4564.f10230, j);
        m54729(1L);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized boolean m54767() {
        m54731();
        return this.f79547.f10227.m26556();
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final synchronized void m54768() {
        if (this.f79555 == null) {
            throw new IllegalStateException("Operation requires persistent storage");
        }
        m54722();
        m54721();
        if (this.f79562) {
            return;
        }
        this.f79562 = true;
        this.f79551 = this.f79548;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final synchronized C14443 m54770() {
        m54731();
        if (!this.f79563.m16599()) {
            throw new IllegalStateException("Text loading is incomplete");
        }
        return this.f79552.m10785();
    }

    /* JADX INFO: renamed from: ᩸ */
    public final synchronized void m54772() {
        m54722();
        m54721();
        if (this.f79570 != null) {
            throw new IllegalStateException("Text loading is still active");
        }
        this.f79563 = C7245.f18895;
        m54752();
        m54729(1L);
    }

    /* JADX INFO: renamed from: ᩹ */
    public final synchronized long m54773() {
        m54731();
        return this.f79547.f10228;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final synchronized C16195 m54775() {
        m54731();
        m54721();
        if (this.f79556 || this.f79570 != null || !this.f79563.m16599()) {
            throw new IllegalStateException("Cannot transfer incomplete or editing session");
        }
        return new C16195(new C16631(this.f79552.m10785(), this.f79569, this.f79547, this.f79563, this.f79548));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54708(C24913 c24913, BooleanSupplier booleanSupplier, C16631 c16631, C23969 c23969, long j, long j2) {
        c24913.getClass();
        if (booleanSupplier.getAsBoolean() || c24913.f79561 || c24913.f79560 || c24913.f79548 != c16631.f48877) {
            throw new CancellationException("Automatic compaction yielded");
        }
        C13241 c13241 = c23969.f76154;
        if (System.nanoTime() - j >= j2) {
            throw new C4126();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m54738(Runnable runnable) {
        m54722();
        m54721();
        this.f79566 = new C17302();
        this.f79567 = this.f79547.f10227.f32101;
        this.f79565 = 0L;
        try {
            runnable.run();
            try {
                C4563 c4563 = this.f79547;
                C11503 c11503M26553 = c4563.f10227.m26553(this.f79558, c4563.f10228, m54771());
                C4563 c4564 = this.f79547;
                C4563 c4565 = new C4563(c11503M26553, c4564.f10229, c4564.f10226, c4564.f10230, c4564.f10228);
                this.f79547 = c4565;
                long j = this.f79565;
                this.f79565 = 0L;
                this.f79567 = 0L;
                this.f79566 = null;
                try {
                    C15961 c15961 = this.f79558;
                    C11503 c11503 = c4565.f10227;
                    c15961.m36262(c11503.f32103, c11503.f32102);
                    if (j != 0) {
                        m54727(j);
                    }
                } catch (Throwable th) {
                    if (j != 0) {
                        m54727(j);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                long j2 = this.f79565;
                this.f79565 = 0L;
                this.f79567 = 0L;
                this.f79566 = null;
                try {
                    C15961 c15962 = this.f79558;
                    C11503 c11504 = this.f79547.f10227;
                    c15962.m36262(c11504.f32103, c11504.f32102);
                    throw th2;
                } finally {
                    if (j2 != 0) {
                        m54727(j2);
                    }
                }
            }
        } catch (Throwable th3) {
            try {
                this.f79547 = new C4563(this.f79547.f10227.m26553(this.f79558, this.f79547.f10228, m54771()), this.f79547.f10229, this.f79547.f10226, this.f79547.f10230, this.f79547.f10228);
                long j3 = this.f79565;
                this.f79565 = 0L;
                this.f79567 = 0L;
                this.f79566 = null;
                try {
                    this.f79558.m36262(this.f79547.f10227.f32103, this.f79547.f10227.f32102);
                    if (j3 == j) {
                        throw th3;
                    }
                    throw th3;
                } finally {
                    if (j3 != 0) {
                        m54727(j3);
                    }
                }
            } catch (Throwable th4) {
                long j4 = this.f79565;
                this.f79565 = 0L;
                this.f79567 = 0L;
                this.f79566 = null;
                try {
                    C15961 c15963 = this.f79558;
                    C11503 c11505 = this.f79547.f10227;
                    c15963.m36262(c11505.f32103, c11505.f32102);
                    throw th4;
                } finally {
                    if (j4 != 0) {
                        m54727(j4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m54746(boolean z) {
        C11503 c11503;
        m54722();
        if (this.f79572 != null || this.f79554 || this.f79573 != null) {
            throw new IllegalStateException("Operation is unavailable during editable history replay");
        }
        C14443 c14443M10785 = this.f79552.m10785();
        try {
            C13773 c13773M34522 = c14443M10785.m34522();
            C13773 c13773M31388 = C13773.m31388(c13773M34522.f38937, c13773M34522.f38938, c13773M34522.f38940);
            int iMax = Math.max(0, this.f79547.f10229.m16550());
            C4563 c4563 = this.f79547;
            long j = c4563.f10226;
            C24441 c24441 = new C24441(iMax, j, j, c4563.f10229, c13773M31388, c13773M31388);
            if (this.f79567 != 0) {
                C10832 c10832M26557 = this.f79547.f10227.m26557();
                if (c10832M26557 != null && c10832M26557.f30005 == this.f79567) {
                    C11503 c11503M54699 = m54699(this.f79547.f10227, new C17302().m39211(c24441));
                    C4563 c4564 = this.f79547;
                    this.f79547 = new C4563(c11503M54699, c4564.f10229, c4564.f10226, c4564.f10230, c4564.f10228);
                    this.f79558.m36262(c11503M54699.f32103, c11503M54699.f32102);
                    m54729(1L);
                    c14443M10785.close();
                    return;
                }
                this.f79566 = this.f79566.m39211(c24441);
                c14443M10785.close();
                return;
            }
            if (z) {
                C11503 c11504 = this.f79547.f10227;
                c11503 = new C11503(c11504.f32103, c11504.f32102, c11504.f32101, true);
            } else {
                c11503 = this.f79547.f10227;
            }
            C11503 c11503M26553 = c11503.m26555(c24441, System.currentTimeMillis()).m26553(this.f79558, this.f79547.f10228, m54771());
            C4563 c4565 = this.f79547;
            this.f79547 = new C4563(c11503M26553, c4565.f10229, c4565.f10226, c4565.f10230, c4565.f10228);
            m54729(1L);
            c14443M10785.close();
        } catch (Throwable th) {
            try {
                c14443M10785.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x016a */
    /* JADX WARN: Bottom block not found for handler: all -> 0x01cf */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01ab: MOVE (r14 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:114:0x01ab */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m54698(final C24913 c24913, final BooleanSupplier booleanSupplier, final C23969 c23969, C21545 c21545) throws Throwable {
        Runnable runnable;
        Runnable runnable2;
        long j;
        RunnableC12844 runnableC12844;
        boolean z;
        int i;
        RunnableC12844 runnableC12845;
        RunnableC12844 runnableC12846;
        C16631 c16631;
        Object obj;
        Throwable th;
        Throwable th2;
        Throwable th3;
        RunnableC12844 runnableC12847;
        C24913 c24914 = c24913;
        c24913.getClass();
        if (booleanSupplier.getAsBoolean()) {
            return -1L;
        }
        AtomicBoolean atomicBoolean = f79546;
        boolean z2 = false;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return -1L;
        }
        RunnableC12844 runnableC12848 = new RunnableC12844();
        try {
            try {
                synchronized (c24913) {
                    try {
                        if (!c24913.m54725() || c24913.m54764() < c24914.f79548) {
                            runnableC12845 = runnableC12848;
                            runnable2 = null;
                            j = -1;
                            try {
                            } catch (Throwable th4) {
                                th = th4;
                                runnableC12844 = runnableC12845;
                                z = false;
                                i = 1;
                                while (true) {
                                    try {
                                        break;
                                    } catch (C4126 unused) {
                                        c24914 = c24914;
                                        c24914.f79571 = Math.min(63, c24914.f79571 + i);
                                        runnableC12844.f36135 = runnable2;
                                        f79546.set(z);
                                        return -3L;
                                    } catch (CancellationException unused2) {
                                        runnableC12844.f36135 = runnable2;
                                        f79546.set(z);
                                        return j;
                                    }
                                }
                                throw th;
                            }
                        } else {
                            C9256 c9256 = c24914.f79557;
                            long jM36261 = (c24914.f79558.m36261() * 2) + (((long) c24914.f79552.length()) * 3) + 65536;
                            final C16631 c16631M54754 = c24913.m54754();
                            try {
                                try {
                                    final long jM51155 = c16631M54754.f48875.m34522().f38940.m51155();
                                    c23969.getClass();
                                    if (jM51155 < 67108864 || jM51155 - jM36261 < 33554432 || jM51155 / 2 < jM36261) {
                                        runnableC12845 = runnableC12848;
                                        runnable2 = null;
                                        j = -1;
                                        c16631M54754.close();
                                    } else {
                                        final long jNanoTime = System.nanoTime();
                                        int i2 = c24914.f79571;
                                        j = -1;
                                        try {
                                            long j2 = c23969.f76155;
                                            long j3 = C14849.FOREVER_NS;
                                            if (j2 <= (C14849.FOREVER_NS >> i2)) {
                                                j3 = j2 << i2;
                                            }
                                            c16631 = c16631M54754;
                                            final long j4 = j3;
                                            try {
                                                runnableC12848.f36135 = new Runnable() { // from class: l.֨ۗᩳ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C24913.m54708(this.f6116, booleanSupplier, c16631M54754, c23969, jNanoTime, j4);
                                                    }
                                                };
                                                runnableC12848.run();
                                                try {
                                                    if (c9256.m21339() < jM36261 + 16777216) {
                                                        throw new IOException("Insufficient space for automatic compaction");
                                                    }
                                                    final C24008 c24008M21334 = c9256.m21334(c16631.f48875.m34522().f38940);
                                                    try {
                                                        C3852 c3852 = new C3852(c16631.f48875.m34522().f38940, c24008M21334.f76246);
                                                        try {
                                                            final Runnable runnable3 = runnableC12848.f36135;
                                                            runnableC12848.f36135 = new Runnable() { // from class: l.۠ۗᩳ
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    runnable3.run();
                                                                    if (c24008M21334.f76246.m51155() > jM51155) {
                                                                        throw new CancellationException("Automatic compaction exceeded source size");
                                                                    }
                                                                }
                                                            };
                                                            c3852.m7568(runnableC12848);
                                                            try {
                                                                if (c24913.m54716(c16631, c3852, c24008M21334, c9256, new C10558(c24008M21334.f76246, runnableC12848), c21545, runnableC12848, jM51155)) {
                                                                    c24914.f79571 = 0;
                                                                    long j5 = c16631.f48877;
                                                                    try {
                                                                        c3852.close();
                                                                        try {
                                                                            c24008M21334.close();
                                                                            try {
                                                                                c16631.close();
                                                                                runnableC12848.f36135 = null;
                                                                                atomicBoolean.set(false);
                                                                                return j5;
                                                                            } catch (C4126 unused3) {
                                                                                runnableC12847 = runnableC12848;
                                                                                runnable2 = null;
                                                                                z = false;
                                                                                i = 1;
                                                                                runnableC12844 = runnableC12847;
                                                                                c24914.f79571 = Math.min(63, c24914.f79571 + i);
                                                                                runnableC12844.f36135 = runnable2;
                                                                                f79546.set(z);
                                                                                return -3L;
                                                                            } catch (CancellationException unused4) {
                                                                                runnableC12847 = runnableC12848;
                                                                                runnable2 = null;
                                                                                z = false;
                                                                                runnableC12844 = runnableC12847;
                                                                                runnableC12844.f36135 = runnable2;
                                                                                f79546.set(z);
                                                                                return j;
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                runnableC12847 = runnableC12848;
                                                                                z2 = false;
                                                                                runnableC12848 = runnableC12847;
                                                                                runnable = null;
                                                                                runnableC12848.f36135 = runnable;
                                                                                f79546.set(z2);
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            th = th;
                                                                            c16631.close();
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        th2 = th;
                                                                        try {
                                                                            c24008M21334.close();
                                                                            throw th2;
                                                                        } catch (Throwable th8) {
                                                                            th2.addSuppressed(th8);
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                }
                                                                runnableC12847 = runnableC12848;
                                                                try {
                                                                    runnableC12847.run();
                                                                    try {
                                                                        c3852.close();
                                                                        try {
                                                                            c24008M21334.close();
                                                                            try {
                                                                                c16631.close();
                                                                                runnableC12847.f36135 = null;
                                                                                atomicBoolean.set(false);
                                                                                return -2L;
                                                                            } catch (C4126 unused5) {
                                                                                runnable2 = null;
                                                                                z = false;
                                                                                i = 1;
                                                                                runnableC12844 = runnableC12847;
                                                                                c24914.f79571 = Math.min(63, c24914.f79571 + i);
                                                                                runnableC12844.f36135 = runnable2;
                                                                                f79546.set(z);
                                                                                return -3L;
                                                                            } catch (CancellationException unused6) {
                                                                                runnable2 = null;
                                                                                z = false;
                                                                                runnableC12844 = runnableC12847;
                                                                                runnableC12844.f36135 = runnable2;
                                                                                f79546.set(z);
                                                                                return j;
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                                z2 = false;
                                                                                runnableC12848 = runnableC12847;
                                                                                runnable = null;
                                                                                runnableC12848.f36135 = runnable;
                                                                                f79546.set(z2);
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            th = th;
                                                                            c16631.close();
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        th2 = th;
                                                                        c24008M21334.close();
                                                                        throw th2;
                                                                    }
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    th3 = th;
                                                                    try {
                                                                        c3852.close();
                                                                        throw th3;
                                                                    } catch (Throwable th13) {
                                                                        th3.addSuppressed(th13);
                                                                        throw th3;
                                                                    }
                                                                }
                                                            } catch (Throwable th14) {
                                                                th = th14;
                                                            }
                                                        } catch (Throwable th15) {
                                                            th3 = th15;
                                                        }
                                                    } catch (Throwable th16) {
                                                        th = th16;
                                                    }
                                                    runnableC12848.f36135 = runnable;
                                                    f79546.set(z2);
                                                    throw th;
                                                } catch (Throwable th17) {
                                                    th = th17;
                                                }
                                            } catch (Throwable th18) {
                                                th = th18;
                                                obj = null;
                                            }
                                        } catch (Throwable th19) {
                                            th = th19;
                                            c16631 = c16631M54754;
                                        }
                                    }
                                } catch (Throwable th20) {
                                    th = th20;
                                    c16631 = c16631M54754;
                                    obj = null;
                                }
                                th = th;
                                try {
                                    c16631.close();
                                    throw th;
                                } catch (Throwable th21) {
                                    th.addSuppressed(th21);
                                    throw th;
                                }
                            } catch (C4126 unused7) {
                                runnableC12844 = runnableC12848;
                                z = false;
                                i = 1;
                                c24914.f79571 = Math.min(63, c24914.f79571 + i);
                                runnableC12844.f36135 = runnable2;
                                f79546.set(z);
                                return -3L;
                            } catch (CancellationException unused8) {
                                runnableC12844 = runnableC12848;
                                z = false;
                                runnableC12844.f36135 = runnable2;
                                f79546.set(z);
                                return j;
                            } catch (Throwable th22) {
                                th = th22;
                                runnableC12848 = runnableC12846;
                                z2 = false;
                            }
                        }
                    } catch (Throwable th23) {
                        th = th23;
                        runnable2 = null;
                        runnableC12844 = runnableC12848;
                        j = -1;
                    }
                }
                runnableC12845.f36135 = runnable2;
                atomicBoolean.set(false);
                return j;
            } catch (Throwable th24) {
                th = th24;
            }
        } catch (C4126 unused9) {
            runnable2 = null;
        } catch (CancellationException unused10) {
            runnable2 = null;
            j = -1;
        } catch (Throwable th25) {
            th = th25;
            runnable = null;
            runnableC12848 = runnableC12848;
            z2 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d7 A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0102 A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010b A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x010e A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0114 A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0117 A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0142  */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    /* JADX INFO: renamed from: ֫ */
    public final synchronized p067l.EnumC18207 m54736(boolean r18, p067l.InterfaceC9689 r19) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C24913.m54736(boolean, l.۟᩶ᩳ):l.ܽ۬ᩳ");
    }

    public C24913(C22902 c22902, C5056 c5056, C4523 c4523, C4563 c4563, C10558 c10558, C21561 c21561, C14620 c14620) {
        this.f79559 = new Object();
        this.f79563 = C7245.f18895;
        this.f79558 = new C15961();
        this.f79564 = new FutureC5767();
        this.f79553 = UUID.randomUUID();
        this.f79550 = c22902;
        this.f79552 = c5056;
        this.f79569 = c4523;
        this.f79547 = c4563;
        C15961 c15961 = this.f79558;
        C11503 c11503 = c4563.f10227;
        c15961.m36262(c11503.f32103, c11503.f32102);
        this.f79548 = c10558.m24339();
        this.f79555 = new C11939(c10558, c22902, c21561, c14620);
    }

    public C24913(CharSequence charSequence) {
        this.f79559 = new Object();
        this.f79563 = C7245.f18895;
        this.f79558 = new C15961();
        this.f79564 = new FutureC5767();
        this.f79553 = UUID.randomUUID();
        this.f79552 = new C5056(charSequence);
        this.f79547 = new C4563();
        this.f79569 = C4523.m9576(null, new byte[0]);
        this.f79555 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24913 m54701(CharSequence charSequence) {
        return new C24913(charSequence);
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m54771() {
        return this.f79555 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54705(InterfaceC22097 interfaceC22097) {
        C9256.m21321(interfaceC22097);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24913 m54703(InterfaceC22097 interfaceC22097, C3455 c3455, C6808 c6808) {
        C9256[] c9256Arr = new C9256[1];
        C24008[] c24008Arr = new C24008[1];
        C24913 c24913M54702 = null;
        try {
            c24913M54702 = m54702(c3455, c6808, C14620.f41739, new C6535(c9256Arr, interfaceC22097, c24008Arr, c3455));
            c9256Arr[0].m21336(c24008Arr[0], c24913M54702.f79548);
            c24008Arr[0].m53180();
            c24913M54702.f79557 = c9256Arr[0];
            return c24913M54702;
        } catch (Throwable th) {
            if (c24913M54702 != null) {
                try {
                    c24913M54702.m54734().m12907();
                } catch (Throwable th2) {
                    try {
                        C24008 c24008 = c24008Arr[0];
                        if (c24008 != null) {
                            c24008.close();
                        }
                        throw th2;
                    } finally {
                        C9256 c9256 = c9256Arr[0];
                        if (c9256 != null) {
                            c9256.close();
                        }
                    }
                }
            }
            try {
                C24008 c24009 = c24008Arr[0];
                if (c24009 != null) {
                    c24009.close();
                }
                throw th;
            } finally {
                C9256 c9257 = c9256Arr[0];
                if (c9257 != null) {
                    c9257.close();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24913 m54702(C3455 c3455, C6808 c6808, C14620 c14620, C6535 c6535) throws Throwable {
        C22902 c22902;
        C4523 c4523M9576;
        C21561 c21561M15610 = c6808.m15610();
        C5056 c5056 = null;
        try {
            C9256[] c9256Arr = c6535.f16881;
            InterfaceC22097 interfaceC22097 = c6535.f16882;
            C24008[] c24008Arr = c6535.f16883;
            C3455 c3456 = c6535.f16884;
            C9256 c9256M21312 = C9256.m21312(interfaceC22097);
            c9256Arr[0] = c9256M21312;
            C24008 c24008M21332 = c9256M21312.m21332(c3456);
            c24008Arr[0] = c24008M21332;
            c22902 = c24008M21332.f76246;
            try {
                c4523M9576 = C4523.m9576(c3455, new byte[0]);
                try {
                    C5056 c5057 = new C5056(C13773.m31388(c22902.f72072, c22902.f72076, c22902), 0L);
                    try {
                        C10558 c10558 = new C10558(c22902);
                        C4563 c4563 = new C4563();
                        C14443 c14443M10785 = c5057.m10785();
                        try {
                            byte[] bArr = c4523M9576.f10147;
                            synchronized (c10558) {
                                c10558.m24343(c14443M10785, bArr, c4563, null, 0L);
                            }
                            c14443M10785.close();
                            return new C24913(c22902, c5057, c4523M9576, c4563, c10558, c21561M15610, c14620);
                        } catch (Throwable th) {
                            try {
                                c14443M10785.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c5056 = c5057;
                        if (c5056 != null) {
                            try {
                                c5056.close();
                            } catch (Throwable th4) {
                                if (c22902 != null) {
                                    try {
                                        c22902.close();
                                    } finally {
                                        c21561M15610.close();
                                    }
                                }
                                throw th4;
                            }
                        }
                        if (c4523M9576 != null) {
                            c4523M9576.close();
                        }
                        if (c22902 != null) {
                            try {
                                c22902.close();
                            } finally {
                                c21561M15610.close();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                c4523M9576 = null;
            }
        } catch (Throwable th7) {
            th = th7;
            c22902 = null;
            c4523M9576 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C18878 m54719(InterfaceC22097 interfaceC22097, C3455 c3455, C6808 c6808) {
        C9256 c9256M21328;
        C22902 c22902M51140;
        InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
        C21561 c21561M15610 = c6808.m15610();
        C11229 c11229M24340 = null;
        try {
            c9256M21328 = C9256.m21328(interfaceC22097);
            try {
                C15290 c15290M21330 = c9256M21328.m21330();
                c22902M51140 = C22902.m51140(interfaceC24242.mo30676(c9256M21328.m21331(c15290M21330), false), c3455);
                try {
                    C10558 c10558 = new C10558(c22902M51140);
                    c11229M24340 = c10558.m24340(C21958.f69011);
                    C9256.m21317(c15290M21330, c22902M51140, c11229M24340.f31225);
                    C18878 c18878 = new C18878(c22902M51140, c10558, c11229M24340, c21561M15610);
                    c18878.f56370 = c9256M21328;
                    return c18878;
                } catch (Throwable th) {
                    th = th;
                    if (c11229M24340 != null) {
                        try {
                            c11229M24340.close();
                        } catch (Throwable th2) {
                            if (c22902M51140 != null) {
                                try {
                                    c22902M51140.close();
                                } catch (Throwable th3) {
                                    if (c9256M21328 != null) {
                                        try {
                                            c9256M21328.close();
                                        } finally {
                                            c21561M15610.close();
                                        }
                                    }
                                    throw th3;
                                }
                            }
                            if (c9256M21328 != null) {
                                try {
                                    c9256M21328.close();
                                } finally {
                                    c21561M15610.close();
                                }
                            }
                            throw th2;
                        }
                    }
                    if (c22902M51140 != null) {
                        try {
                            c22902M51140.close();
                        } catch (Throwable th4) {
                            if (c9256M21328 != null) {
                                try {
                                    c9256M21328.close();
                                } finally {
                                    c21561M15610.close();
                                }
                            }
                            throw th4;
                        }
                    }
                    if (c9256M21328 != null) {
                        try {
                            c9256M21328.close();
                        } finally {
                            c21561M15610.close();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                c22902M51140 = null;
            }
        } catch (Throwable th6) {
            th = th6;
            c9256M21328 = null;
            c22902M51140 = null;
        }
    }

    public final int length() {
        int length;
        synchronized (this.f79559) {
            length = this.f79552.length();
        }
        return length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final char m54733(int i) {
        C13773 c13773M10784;
        synchronized (this.f79559) {
            c13773M10784 = this.f79552.m10784(i);
        }
        C22902 c22902 = c13773M10784.f38940;
        try {
            return c13773M10784.m31395(i);
        } finally {
            if (c22902 != null) {
                c22902.m51159();
            }
        }
    }

    /* JADX INFO: renamed from: ᩺ */
    public final long m54774() {
        return this.f79548;
    }

    /* JADX INFO: renamed from: ܶ */
    public final long m54764() {
        C11939 c11939 = this.f79555;
        return c11939 == null ? this.f79548 : c11939.m27299();
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final C14443 m54760() {
        C14443 c14443M10785;
        synchronized (this.f79559) {
            c14443M10785 = this.f79552.m10785();
        }
        return c14443M10785;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54749(C14443 c14443) {
        boolean zM10787;
        synchronized (this.f79559) {
            zM10787 = this.f79552.m10787(c14443);
        }
        return zM10787;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m54715(final C2510 c2510, final char[] cArr, final int i, final C7245 c7245, int i2, C19549 c19549) {
        if (this.f79570 == c2510 && !c2510.m3648()) {
            m54722();
            long j = i;
            if (((long) this.f79552.length()) + j <= i2) {
                this.f79556 = true;
                try {
                    if (i != 0) {
                        this.f79552.m10786(new Consumer() { // from class: l.ۤۗᩳ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C24719.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                C2510 c2511 = c2510;
                                char[] cArr2 = cArr;
                                int i3 = i;
                                C7245 c7246 = c7245;
                                C17795 c17795 = (C17795) obj;
                                try {
                                    c2511.m3645();
                                    c17795.m40407(c17795.m40408(), c17795.m40408(), CharBuffer.wrap(cArr2, 0, i3));
                                    c2511.m3646(c7246.m16599());
                                } catch (IOException e) {
                                    throw new UncheckedIOException(e);
                                }
                            }
                        }, null);
                    } else {
                        try {
                            c2510.m3646(c7245.m16599());
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    }
                    this.f79563 = c7245;
                    c2510.f4070 = c7245;
                    if (c19549 != null) {
                        c19549.f59510 = true;
                    }
                    if (c7245.m16599()) {
                        this.f79570 = null;
                    }
                    m54729(Math.max(1L, j * 2));
                    this.f79556 = false;
                    return true;
                } catch (Throwable th) {
                    this.f79556 = false;
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private C11503 m54699(C11503 c11503, C17302 c17302) {
        if (c17302.isEmpty()) {
            return c11503;
        }
        C10832 c10832M26557 = c11503.m26557();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c10832M26557 != null) {
            long j = c10832M26557.f30005;
            if (j == this.f79567) {
                return new C11503(c11503.f32103.m39214(new C10832(j, jCurrentTimeMillis, EnumC15723.BATCH, c10832M26557.f30004.m39212(c17302))), c11503.f32102, c11503.f32101, c11503.f32100);
            }
        }
        return c11503.m26554(this.f79566.m39212(c17302), jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54742(C5706 c5706) {
        EnumC15723 enumC15723 = EnumC15723.USER;
        synchronized (this) {
            m54704(enumC15723, c5706, (C12610) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.۫ۗᩳ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    private void m54704(final EnumC15723 enumC15723, final Consumer consumer, C12610 c12610) throws Throwable {
        boolean z;
        m54722();
        EnumC15723 enumC15724 = EnumC15723.LOADER;
        if (enumC15723 == enumC15724) {
            m54721();
        }
        if (enumC15723 != EnumC15723.USER && enumC15723 != EnumC15723.BATCH && enumC15723 != enumC15724) {
            throw new IllegalArgumentException("Unsupported session edit origin");
        }
        int i = 1;
        this.f79556 = true;
        long jM10788 = this.f79552.m10788();
        final long[] jArr = new long[1];
        final C4563 c4563 = this.f79547;
        final C4563[] c4563Arr = new C4563[1];
        final C7205[] c7205Arr = {c4563.f10229};
        C24679 c24679 = (enumC15723 == enumC15724 || c12610 != null) ? null : new C24679(enumC15723, c4563.f10226, c4563.f10230, new C18687(i, c7205Arr), true);
        int i2 = 0;
        C17973 c17973 = this.f79572;
        final C24679 c246710 = c17973 != null ? new C24679(EnumC15723.BATCH, c17973.f53675, c17973.f53680, new C5194(i2, c7205Arr), false) : null;
        try {
            final C24679 c246711 = c24679;
            final C24679 c246712 = c24679;
            z = false;
            try {
                this.f79552.m10786(new Consumer() { // from class: l.۬ۗᩳ
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        C24913.m54709(this.f41649, consumer, jArr, c246711, c4563, c4563Arr, c7205Arr, c246710, (C17795) obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return C24719.$default$andThen(this, consumer2);
                    }
                }, new InterfaceC11091() { // from class: l.۫ۗᩳ
                    @Override // p067l.InterfaceC11091
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo25534(int i3, int i4, C13773 c13773, C13773 c13774, int i5) {
                        if (enumC15723 == EnumC15723.LOADER) {
                            if (i3 != c13773.m31402() || i4 != i3) {
                                throw new IllegalArgumentException("Loader may only append text");
                            }
                            return;
                        }
                        C24679 c246713 = c246712;
                        if (c246713 != null) {
                            c246713.mo25534(i3, i4, c13773, c13774, i5);
                        }
                        C24679 c246714 = c246710;
                        if (c246714 != null) {
                            c246714.mo25534(i3, i4, c13773, c13774, i5);
                        }
                        C7205[] c7205Arr2 = c7205Arr;
                        c7205Arr2[0] = c7205Arr2[0].m16549(i3, i4, i5);
                    }
                });
                if (this.f79552.m10788() != jM10788) {
                    if (c246710 != null) {
                        this.f79572.m40910();
                    }
                    this.f79547 = c4563Arr[0];
                    m54729(jArr[0]);
                }
                try {
                    C15961 c15961 = this.f79558;
                    C11503 c11503 = this.f79547.f10227;
                    c15961.m36262(c11503.f32103, c11503.f32102);
                } finally {
                    this.f79556 = false;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C15961 c15962 = this.f79558;
                    C11503 c11504 = this.f79547.f10227;
                    c15962.m36262(c11504.f32103, c11504.f32102);
                    throw th;
                } finally {
                    this.f79556 = z;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m54709(C24913 c24913, Consumer consumer, long[] jArr, C24679 c24679, C4563 c4563, C4563[] c4563Arr, C7205[] c7205Arr, C24679 c246710, C17795 c17795) {
        C11503 c11503M54699;
        consumer.accept(c17795);
        jArr[0] = c17795.m40405();
        if (c24679 == null) {
            c11503M54699 = c4563.f10227;
        } else {
            c11503M54699 = c24913.f79567 != 0 ? c24913.m54699(c4563.f10227, c24679.m54331()) : c24679.m54330(c4563.f10227, System.currentTimeMillis());
        }
        if (c24913.f79567 == 0) {
            c11503M54699 = c11503M54699.m26553(c24913.f79558, c4563.f10228, c24913.m54771());
        }
        C4563 c4564 = new C4563(c11503M54699, c7205Arr[0], c24679 == null ? c4563.f10226 : c24679.m54332(), c24679 == null ? c4563.f10230 : c24679.m54333(), c4563.f10228);
        c4563Arr[0] = c4564;
        if (c246710 != null) {
            c24913.f79572.m40909(c246710, c4564);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ֫ */
    public void m54721() {
        if (this.f79572 != null || this.f79554 || this.f79573 != null) {
            throw new IllegalStateException("Operation is unavailable during editable history replay");
        }
        if (this.f79567 != 0) {
            throw new IllegalStateException("Operation is unavailable during history grouping");
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m54729(long j) {
        this.f79548++;
        if (this.f79567 != 0) {
            long jMax = Math.max(1L, j);
            long j2 = this.f79565;
            long j3 = C14849.FOREVER_NS;
            if (jMax <= C14849.FOREVER_NS - j2) {
                j3 = j2 + jMax;
            }
            this.f79565 = j3;
            return;
        }
        m54727(j);
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m54727(long j) {
        C11939 c11939;
        boolean z = this.f79562;
        long j2 = C14849.FOREVER_NS;
        if (z) {
            long j3 = this.f79568;
            this.f79568 = j > C14849.FOREVER_NS - j3 ? Long.MAX_VALUE : j3 + j;
        }
        C17973 c17973 = this.f79572;
        if (c17973 != null) {
            long j4 = c17973.f53674;
            if (j <= C14849.FOREVER_NS - j4) {
                j2 = j4 + j;
            }
            c17973.f53674 = j2;
            return;
        }
        if (z || (c11939 = this.f79555) == null) {
            return;
        }
        c11939.m27297(new C16631(this.f79552.m10785(), this.f79569, this.f79547, this.f79563, this.f79548), j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16195 m54700(C14677 c14677) {
        return new C16195(C5864.m13165(c14677));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.ۛۗᩳ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m54735(final BooleanSupplier booleanSupplier) {
        final C23969 c23969 = C23969.f76153;
        final C21545 c21545 = new C21545();
        synchronized (this) {
            C12826.requireNonNull(booleanSupplier);
            if (m54725()) {
                return this.f79555.m27293((C7876) new InterfaceC5233() { // from class: l.ۛۗᩳ
                    @Override // p067l.InterfaceC5233
                    public final long run() {
                        return C24913.m54698(this.f20675, booleanSupplier, c23969, c21545);
                    }
                }, true).m12898((InterfaceC22729) new C20013(6));
            }
            return FutureC5767.m12882(EnumC15251.SKIPPED);
        }
    }

    /* JADX INFO: renamed from: ܿ֫ */
    private boolean m54725() {
        if (this.f79557 == null || this.f79561 || this.f79560 || this.f79556 || this.f79572 != null || this.f79554 || this.f79573 != null || this.f79570 != null || !this.f79563.m16599()) {
            return false;
        }
        return !this.f79562 || this.f79551 == this.f79548;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x012f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [l.᩸۬ᩳ] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [l.᩸۬ᩳ] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m54716(C16631 c16631, C3852 c3852, C24008 c24008, C9256 c9256, C10558 c10558, C21545 c21545, Runnable runnable, long j) {
        boolean z;
        C15961 c15961;
        C5056 c5056;
        C6574 c6574;
        C6574 c6574M27294;
        ?? r9;
        ?? r10;
        C6574 c6575;
        C16631 c16631M7567 = c3852.m7567(c16631);
        try {
            RunnableC12844 runnableC12844 = (RunnableC12844) runnable;
            runnableC12844.run();
            c10558.m24343(c16631M7567.f48875, c16631M7567.f48876.f10147, c16631M7567.f48878, c16631M7567.f48879, c16631M7567.f48877);
            runnableC12844.run();
            if (j > 0 && j - c24008.f76246.m51155() < 33554432) {
                c16631M7567.close();
                return false;
            }
            c9256.m21335(c16631M7567.f48877, c24008, runnable);
            runnableC12844.run();
            C5056 c5057 = new C5056(c16631M7567.f48875.m34522(), c16631M7567.f48875.m33057());
            C15961 c15962 = new C15961();
            ?? r7 = 0;
            c15961 = null;
            c15961 = null;
            C15961 c15963 = null;
            try {
                C11503 c11503 = c16631M7567.f48878.f10227;
                c15962.m36262(c11503.f32103, c11503.f32102);
                synchronized (this) {
                    try {
                        m54731();
                        if (this.f79560) {
                            throw new CancellationException("Session is closing during compaction");
                        }
                        if (this.f79548 != c16631M7567.f48877) {
                            try {
                                c5057.close();
                                c15962.m36263();
                                c16631M7567.close();
                                return false;
                            } catch (Throwable th) {
                                c15962.m36263();
                                throw th;
                            }
                        }
                        runnableC12844.run();
                        c6574M27294 = this.f79555.m27294(c10558, c24008.f76246);
                        try {
                            try {
                                c9256.m21338(c24008, c16631M7567.f48877);
                                c5056 = this.f79552;
                                try {
                                    r9 = this.f79550;
                                    try {
                                        c15963 = this.f79558;
                                        this.f79550 = c24008.m53180();
                                        synchronized (this.f79559) {
                                            this.f79552 = c5057;
                                        }
                                        this.f79547 = c16631M7567.f48878;
                                        this.f79558 = c15962;
                                        c6574M27294.m15011();
                                        try {
                                            try {
                                                r9.m51151().m12887((InterfaceC9988) new C16592(this, c9256, r9.f72073));
                                                try {
                                                    c5056.close();
                                                    try {
                                                        r9.close();
                                                        c15963.m36263();
                                                        c6574M27294.close();
                                                        c16631M7567.close();
                                                        return true;
                                                    } catch (Throwable th2) {
                                                        c15963.m36263();
                                                        throw th2;
                                                    }
                                                } catch (Throwable th3) {
                                                    try {
                                                        r9.close();
                                                        throw th3;
                                                    } finally {
                                                        c15963.m36263();
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                c6574M27294.close();
                                                throw th4;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            z = true;
                                            r10 = r9;
                                            C15961 c15964 = c15963;
                                            c6575 = c6574M27294;
                                            c15961 = c15964;
                                            while (true) {
                                                break;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        z = false;
                                        r10 = r9;
                                        C15961 c15965 = c15963;
                                        c6575 = c6574M27294;
                                        c15961 = c15965;
                                        while (true) {
                                            break;
                                            break;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    r9 = 0;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                c5056 = null;
                                r9 = c5056;
                                z = false;
                                r10 = r9;
                                C15961 c15966 = c15963;
                                c6575 = c6574M27294;
                                c15961 = c15966;
                                while (true) {
                                    break;
                                    break;
                                }
                                throw th;
                            }
                        } catch (IOException | Error | RuntimeException e) {
                            if (c9256.m21342()) {
                                this.f79555.m27296(e);
                            }
                            throw e;
                        }
                        try {
                            c16631M7567.close();
                            throw th;
                        } catch (Throwable th9) {
                            th.addSuppressed(th9);
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        c6574M27294 = null;
                        c5056 = null;
                    }
                }
                try {
                    break;
                    throw th;
                } catch (Throwable th11) {
                    th = th11;
                    ?? r14 = r10;
                    c6574 = c6575;
                    r7 = r14;
                    try {
                        if (z) {
                            r7.m51151().m12887((InterfaceC9988) new C16592(this, c9256, r7.f72073));
                            try {
                                c5056.close();
                                try {
                                    r7.close();
                                    c15961.m36263();
                                } catch (Throwable th12) {
                                    c15961.m36263();
                                    throw th12;
                                }
                            } catch (Throwable th13) {
                                try {
                                    r7.close();
                                    throw th13;
                                } finally {
                                    c15961.m36263();
                                }
                            }
                        } else {
                            try {
                                c5057.close();
                                c15962.m36263();
                            } catch (Throwable th14) {
                                c15962.m36263();
                                throw th14;
                            }
                        }
                        if (c6574 != null) {
                            c6574.close();
                        }
                        throw th;
                    } catch (Throwable th15) {
                        if (c6574 != null) {
                            c6574.close();
                        }
                        throw th15;
                    }
                }
            } catch (Throwable th16) {
                th = th16;
                z = false;
                c15961 = null;
                c5056 = null;
                c6574 = null;
            }
        } catch (Throwable th17) {
            c16631M7567.close();
            throw th17;
        }
    }

    /* JADX INFO: renamed from: ᩻֫ */
    private void m54731() {
        if (this.f79561) {
            throw new C4385("Text session is closed");
        }
    }

    /* JADX INFO: renamed from: ܺ֫ */
    private void m54722() {
        m54728();
        if (this.f79548 == C14849.FOREVER_NS) {
            throw new IllegalStateException("Session revision exhausted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷֫ */
    public void m54728() {
        m54731();
        C9256 c9256 = this.f79557;
        if (c9256 != null && c9256.m21342()) {
            throw new IllegalStateException("Recovery generation requires reopening");
        }
        if (this.f79560 || this.f79556) {
            throw new IllegalStateException("Text session is closing or already editing");
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final FutureC5767 m54769() {
        synchronized (this) {
            if (this.f79561) {
                return this.f79564;
            }
            if (this.f79555 == null) {
                return m54734();
            }
            FutureC5767 futureC5767 = this.f79549;
            if (futureC5767 != null) {
                return futureC5767;
            }
            if (!this.f79556 && this.f79572 == null && !this.f79554 && this.f79573 == null && this.f79567 == 0) {
                if (this.f79562 && this.f79551 != this.f79548) {
                    throw new IllegalStateException("Current session state requires an explicit checkpoint");
                }
                if (this.f79562 && this.f79570 != null) {
                    throw new IllegalStateException("Stop loading before the final explicit checkpoint");
                }
                C9256 c9256 = this.f79557;
                if (c9256 == null || !c9256.m21342()) {
                    C2510 c2510 = this.f79570;
                    if (c2510 != null) {
                        C7245 c7245M16591 = this.f79563.m16591(EnumC2550.CANCELED, EnumC20657.NONE);
                        this.f79563 = c7245M16591;
                        c2510.f4070 = c7245M16591;
                        this.f79570 = null;
                        m54729(1L);
                    }
                    this.f79560 = true;
                    FutureC5767 futureC5768 = new FutureC5767();
                    this.f79549 = futureC5768;
                    long j = this.f79548;
                    if (c2510 != null) {
                        c2510.m3649();
                    }
                    this.f79555.m27292(j).m12887((InterfaceC9988) new C21441(this, futureC5768));
                    return futureC5768;
                }
                FutureC5767 futureC5769 = new FutureC5767();
                futureC5769.m12891((Throwable) new IOException("Recovery generation requires reopening; abandon before recovery"));
                return futureC5769;
            }
            throw new IllegalStateException("Cannot close during session edit");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m54711(C24913 c24913, FutureC5767 futureC5767, Throwable th) {
        if (th != null) {
            synchronized (c24913) {
                c24913.f79560 = false;
                c24913.f79549 = null;
            }
            futureC5767.m12891(th);
            return;
        }
        c24913.m54734().m12887((InterfaceC9988) new C21288(futureC5767));
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m54734() {
        synchronized (this) {
            if (this.f79561) {
                return this.f79564;
            }
            if (this.f79556 || this.f79572 != null || this.f79554 || this.f79573 != null || this.f79567 != 0) {
                throw new IllegalStateException("Cannot abandon during session edit");
            }
            C2510 c2510 = this.f79570;
            if (c2510 != null) {
                c2510.f4070 = this.f79563.m16591(EnumC2550.CANCELED, EnumC20657.NONE);
            }
            this.f79570 = null;
            this.f79561 = true;
            C4523 c4523 = this.f79569;
            this.f79569 = null;
            this.f79547 = null;
            final C9256 c9256 = this.f79557;
            this.f79557 = null;
            this.f79558.m36263();
            if (c2510 != null) {
                c2510.m3649();
            }
            this.f79552.close();
            th = null;
            try {
                c4523.close();
            } catch (Throwable th) {
                if (th == null) {
                    th = th;
                } else if (th != th) {
                    th.addSuppressed(th);
                }
            }
            try {
                C22902 c22902 = this.f79550;
                if (c22902 != null) {
                    c22902.close();
                }
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    th.addSuppressed(th2);
                }
            }
            C11939 c11939 = this.f79555;
            if (c11939 == null) {
                if (th == null) {
                    this.f79564.m12889((Object) null);
                } else {
                    this.f79564.m12891(th);
                }
                return this.f79564;
            }
            c11939.m27301().m12887(new InterfaceC9988() { // from class: l.᩹ۗᩳ
                @Override // p067l.InterfaceC9988
                /* JADX INFO: renamed from: ۧ */
                public final void mo6895(Object obj, Throwable th3) {
                    C24913.m54707(this.f73300, th, c9256, th3);
                }
            });
            this.f79555.m27295();
            return this.f79564;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54707(C24913 c24913, Throwable th, C9256 c9256, Throwable th2) {
        FutureC5767 futureC5767 = c24913.f79564;
        if (th2 != null) {
            if (th == null) {
                th = th2;
            } else if (th != th2) {
                th.addSuppressed(th2);
            }
        }
        if (c9256 != null) {
            try {
                c9256.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else if (th != th3) {
                    th.addSuppressed(th3);
                }
            }
        }
        if (th == null) {
            futureC5767.m12889((Object) null);
        } else {
            futureC5767.m12891(th);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        FutureC5767 futureC5767M54769 = m54769();
        if (C6808.m15609() && !futureC5767M54769.isDone()) {
            throw new IllegalStateException("Use closeAsync from persistence callbacks");
        }
        try {
            futureC5767M54769.m12907();
        } catch (C15154 e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException("Failed to close text session", cause);
            }
            throw ((RuntimeException) cause);
        }
    }
}
