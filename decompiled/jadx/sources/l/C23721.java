package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23721 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicBoolean f76797 = new AtomicBoolean();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C2309 f76798;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public volatile long f76799;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f76800;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C21605 f76801;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f76802;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2827 f76803;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final UUID f76804;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f76805;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C10070 f76806;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f76807;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7247 f76808;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C14302 f76809;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f76810;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f76811;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f76812;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f76813;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C5131 f76814;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f76815;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public long f76816;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C15713 f76817;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public long f76818;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f76819;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public C2267 f76820;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0149 f76821;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f76822;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C16419 f76823;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C18077 f76824;

    public /* synthetic */ C23721(C21605 c21605, C2827 c2827, C2267 c2267, C2309 c2309, C8617 c8617, C20194 c20194, C12891 c12891, int i) {
        this(c21605, c2827, c2267, c2309, c8617, c20194, c12891);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final synchronized long m52329() {
        m52328();
        return this.f76798.f7440;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52334(int i, int i2) {
        m52319();
        C5089 c5089 = new C5089(i, i2);
        if (i > this.f76803.length() || i2 > this.f76803.length()) {
            throw new IndexOutOfBoundsException("Selection exceeds text length");
        }
        if (c5089.equals(this.f76798.f7443)) {
            return;
        }
        C2309 c2309 = this.f76798;
        this.f76798 = new C2309(c2309.f7441, c5089, c2309.f7440, c2309.f7444, c2309.f7442);
        m52326(1L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52336(C0149 c0149) {
        if (this.f76821 == c0149) {
            m52319();
            m52318();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52337(C0149 c0149, EnumC0191 enumC0191, EnumC19243 enumC19243) {
        m52318();
        if (this.f76821 != c0149) {
            return;
        }
        m52319();
        C5131 c5131M14683 = this.f76814.m14683(enumC0191, enumC19243);
        this.f76814 = c5131M14683;
        c0149.f1295 = c5131M14683;
        this.f76821 = null;
        m52326(1L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52338(C0149 c0149, C5131 c5131) {
        m52319();
        m52318();
        if (this.f76821 != null) {
            throw new IllegalStateException("Text loader is already active");
        }
        if (c5131 != null) {
            if (this.f76803.length() != 0 || this.f76814.m14685() != null || this.f76798.f7441.m24543() || !this.f76798.f7441.f29155.isEmpty()) {
                throw new IllegalStateException("Initial text loading requires an empty session");
            }
            this.f76814 = c5131;
        } else {
            if (this.f76814.m14691() || this.f76814.m14685() == null) {
                throw new IllegalStateException("No incomplete text source to resume");
            }
            this.f76814 = this.f76814.m14683(EnumC0191.LOADING, EnumC19243.NONE);
        }
        this.f76821 = c0149;
        c0149.f1295 = this.f76814;
        m52326(1L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52340(C10776 c10776, C4922 c4922) {
        C16419 c16419 = this.f76823;
        if (c16419 == null || c16419.f50504 != c10776 || c10776.f32427) {
            throw new IllegalStateException("History replay step is not active");
        }
        c10776.f32427 = true;
        m52301(EnumC14051.USER, c4922, c10776);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52341(C14548 c14548) {
        m52319();
        m52318();
        if (this.f76821 != null || this.f76813) {
            throw new IllegalStateException("Cannot replace active loading or checkpoint session");
        }
        synchronized (c14548) {
            C15007 c15007M34739 = C14548.m34739(c14548);
            C21605 c21605 = c15007M34739.f45762.m32420().f35930;
            C21605 c21606 = this.f76801;
            C20612.f66331.getClass();
            C1561 c1561 = new C1561(c21605, c21606, 0);
            try {
                C15007 c15007M5338 = c1561.m5338(c15007M34739);
                try {
                    C2827 c2827 = new C2827(c15007M5338.f45762.m32420(), c15007M5338.f45762.m30979());
                    C14302 c14302 = new C14302();
                    try {
                        C2309 c2309 = c15007M5338.f45765;
                        C2309 c23010 = new C2309(c2309.f7441.m24540(c14302, c2309.f7442, m52368()), c2309.f7443, c2309.f7440, c2309.f7444, c2309.f7442);
                        C21605 c21607 = this.f76801;
                        C2267 c2267M7494 = C2267.m7494(c21607 == null ? null : c21607.f69370, c15007M5338.f45763.f7359);
                        C2827 c2828 = this.f76803;
                        C2267 c2267 = this.f76820;
                        C14302 c14303 = this.f76809;
                        synchronized (this.f76810) {
                            this.f76803 = c2827;
                        }
                        this.f76820 = c2267M7494;
                        this.f76798 = c23010;
                        this.f76814 = c15007M5338.f45766;
                        this.f76809 = c14302;
                        try {
                            m52326(Math.max(1, c2827.length()));
                            c2828.close();
                            c2267.close();
                            c14303.m34130();
                            c15007M5338.close();
                            c1561.close();
                        } catch (Throwable th) {
                            c2828.close();
                            c2267.close();
                            c14303.m34130();
                            throw th;
                        }
                    } catch (Error e) {
                        e = e;
                        c2827.close();
                        c14302.m34130();
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        c2827.close();
                        c14302.m34130();
                        throw e;
                    }
                } catch (Throwable th2) {
                    try {
                        c15007M5338.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    c1561.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52342(C18077 c18077) {
        if (this.f76824 != c18077 || c18077.f56305) {
            throw new IllegalStateException("Text load publication is not active");
        }
        if (!m52312(c18077.f56308, c18077.f56304, c18077.f56309, c18077.f56306, c18077.f56307, c18077)) {
            throw new IllegalStateException("Text load publication was invalidated");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52344(C0149 c0149, char[] cArr, int i, C5131 c5131, int i2) {
        m52318();
        return m52312(c0149, cArr, i, c5131, i2, (C18077) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52345(InterfaceC0897 interfaceC0897, C0149 c0149, char[] cArr, int i, C5131 c5131, int i2) {
        if (this.f76821 == c0149 && !c0149.m1246()) {
            m52319();
            m52318();
            if (((long) this.f76803.length()) + ((long) i) > i2) {
                return false;
            }
            C18077 c18077 = new C18077(c0149, cArr, i, c5131, i2);
            this.f76824 = c18077;
            try {
                if (i == 0) {
                    m52342(c18077);
                } else {
                    interfaceC0897.mo3243(c18077);
                }
                boolean z = c18077.f56305;
                this.f76824 = null;
                return z;
            } catch (Throwable th) {
                this.f76824 = null;
                throw th;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52347() {
        m52319();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m52348() {
        m52328();
        return (byte[]) this.f76820.f7359.clone();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52349() {
        m52319();
        m52318();
        if (this.f76798.f7441.m24543() || !this.f76798.f7441.f29155.isEmpty()) {
            C9611 c9611 = this.f76798.f7441;
            c9611.getClass();
            C9611 c9612 = new C9611(new C15713(), new C15713(), c9611.f29154, c9611.f29153);
            C2309 c2309 = this.f76798;
            this.f76798 = new C2309(c9612, c2309.f7443, c2309.f7440, c2309.f7444, c2309.f7442);
            this.f76809.m34130();
            m52326(1L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C5131 m52350() {
        m52328();
        return this.f76814;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final synchronized C15007 m52351() {
        m52328();
        if (this.f76807 || this.f76823 != null || this.f76805 || this.f76824 != null) {
            throw new IllegalStateException("Cannot capture session during edit");
        }
        if (this.f76813 && this.f76802 != this.f76799) {
            throw new IllegalStateException("Current session state requires an explicit checkpoint");
        }
        return new C15007(this.f76803.m8724(), this.f76820, this.f76798, this.f76814, this.f76799);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final synchronized UUID m52352() {
        C21605 c21605;
        m52328();
        c21605 = this.f76801;
        return c21605 == null ? this.f76804 : c21605.f69374;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized C21605 m52353() {
        m52319();
        m52318();
        if (this.f76806 == null) {
            throw new IllegalStateException("Operation requires persistent storage");
        }
        this.f76801.m48811();
        return this.f76801;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized FutureC3575 m52354(long j) {
        C10070 c10070;
        m52328();
        m52318();
        if (this.f76806 == null && j > this.f76799) {
            throw new IllegalArgumentException("Revision exceeds current session");
        }
        c10070 = this.f76806;
        return c10070 == null ? FutureC3575.m10905(Long.valueOf(this.f76799)) : c10070.m25275(j);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52355(byte[] bArr) {
        m52319();
        if (Arrays.equals(this.f76820.f7359, bArr)) {
            return;
        }
        C21605 c21605 = this.f76801;
        C2267 c2267M7494 = C2267.m7494(c21605 == null ? null : c21605.f69370, bArr);
        C2267 c2267 = this.f76820;
        this.f76820 = c2267M7494;
        try {
            m52326(Math.max(1, bArr.length));
            c2267.close();
        } catch (Throwable th) {
            c2267.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52356(boolean z) {
        C6542 c6542M18043;
        m52328();
        c6542M18043 = C6542.m18043(this.f76798, z);
        return (c6542M18043 == null || c6542M18043.m18045() || !c6542M18043.m18044()) ? false : true;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final synchronized void m52358() {
        m52328();
        C10070 c10070 = this.f76806;
        if (c10070 != null) {
            c10070.m25283();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C5089 m52359() {
        m52328();
        return this.f76798.f7443;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized C7206 m52360() {
        C7206 c7206;
        m52319();
        m52318();
        if (!this.f76813) {
            throw new IllegalStateException("Explicit checkpoints are not enabled");
        }
        c7206 = new C7206(this, new C15007(this.f76803.m8724(), this.f76820, this.f76798, this.f76814, this.f76799 + 1), this.f76801.f69374, this.f76819);
        this.f76799++;
        return c7206;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52362() {
        m52328();
        return !this.f76798.f7441.f29155.isEmpty();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52363(long j) {
        m52319();
        m52318();
        if (j < 0) {
            throw new IllegalArgumentException("Invalid history budget");
        }
        C2309 c2309 = this.f76798;
        if (j == c2309.f7442) {
            return;
        }
        C9611 c9611M24540 = c2309.f7441.m24540(this.f76809, j, m52368());
        C2309 c23010 = this.f76798;
        this.f76798 = new C2309(c9611M24540, c23010.f7443, c23010.f7440, c23010.f7444, j);
        m52326(1L);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52364() {
        m52328();
        return this.f76798.f7441.m24543();
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52365() {
        if (this.f76806 == null) {
            throw new IllegalStateException("Operation requires persistent storage");
        }
        m52319();
        m52318();
        if (this.f76813) {
            return;
        }
        this.f76813 = true;
        this.f76802 = this.f76799;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final synchronized C12704 m52367() {
        m52328();
        if (!this.f76814.m14691()) {
            throw new IllegalStateException("Text loading is incomplete");
        }
        return this.f76803.m8724();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized void m52369() {
        m52319();
        m52318();
        if (this.f76821 != null) {
            throw new IllegalStateException("Text loading is still active");
        }
        this.f76814 = C5131.f16061;
        m52349();
        m52326(1L);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized long m52370() {
        m52328();
        return this.f76798.f7442;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized C14548 m52372() {
        m52328();
        m52318();
        if (this.f76807 || this.f76821 != null || !this.f76814.m14691()) {
            throw new IllegalStateException("Cannot transfer incomplete or editing session");
        }
        return new C14548(new C15007(this.f76803.m8724(), this.f76820, this.f76798, this.f76814, this.f76799));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52305(C23721 c23721, BooleanSupplier booleanSupplier, C15007 c15007, C22728 c22728, long j, long j2) {
        c23721.getClass();
        if (booleanSupplier.getAsBoolean() || c23721.f76812 || c23721.f76811 || c23721.f76799 != c15007.f45764) {
            throw new CancellationException("Automatic compaction yielded");
        }
        C11440 c11440 = c22728.f73431;
        if (System.nanoTime() - j >= j2) {
            throw new C1849();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52335(Runnable runnable) {
        m52319();
        m52318();
        this.f76817 = new C15713();
        this.f76818 = this.f76798.f7441.f29154;
        this.f76816 = 0L;
        try {
            runnable.run();
            try {
                C2309 c2309 = this.f76798;
                C9611 c9611M24540 = c2309.f7441.m24540(this.f76809, c2309.f7442, m52368());
                C2309 c23010 = this.f76798;
                C2309 c23011 = new C2309(c9611M24540, c23010.f7443, c23010.f7440, c23010.f7444, c23010.f7442);
                this.f76798 = c23011;
                long j = this.f76816;
                this.f76816 = 0L;
                this.f76818 = 0L;
                this.f76817 = null;
                try {
                    C14302 c14302 = this.f76809;
                    C9611 c9611 = c23011.f7441;
                    c14302.m34129(c9611.f29156, c9611.f29155);
                    if (j != 0) {
                        m52324(j);
                    }
                } catch (Throwable th) {
                    if (j != 0) {
                        m52324(j);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                long j2 = this.f76816;
                this.f76816 = 0L;
                this.f76818 = 0L;
                this.f76817 = null;
                try {
                    C14302 c14303 = this.f76809;
                    C9611 c9612 = this.f76798.f7441;
                    c14303.m34129(c9612.f29156, c9612.f29155);
                    throw th2;
                } finally {
                    if (j2 != 0) {
                        m52324(j2);
                    }
                }
            }
        } catch (Throwable th3) {
            try {
                this.f76798 = new C2309(this.f76798.f7441.m24540(this.f76809, this.f76798.f7442, m52368()), this.f76798.f7443, this.f76798.f7440, this.f76798.f7444, this.f76798.f7442);
                long j3 = this.f76816;
                this.f76816 = 0L;
                this.f76818 = 0L;
                this.f76817 = null;
                try {
                    this.f76809.m34129(this.f76798.f7441.f29156, this.f76798.f7441.f29155);
                    if (j3 == j) {
                        throw th3;
                    }
                    throw th3;
                } finally {
                    if (j3 != 0) {
                        m52324(j3);
                    }
                }
            } catch (Throwable th4) {
                long j4 = this.f76816;
                this.f76816 = 0L;
                this.f76818 = 0L;
                this.f76817 = null;
                try {
                    C14302 c14304 = this.f76809;
                    C9611 c9613 = this.f76798.f7441;
                    c14304.m34129(c9613.f29156, c9613.f29155);
                    throw th4;
                } finally {
                    if (j4 != 0) {
                        m52324(j4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52343(boolean z) {
        C9611 c9611;
        m52319();
        if (this.f76823 != null || this.f76805 || this.f76824 != null) {
            throw new IllegalStateException("Operation is unavailable during editable history replay");
        }
        C12704 c12704M8724 = this.f76803.m8724();
        try {
            C11999 c11999M32420 = c12704M8724.m32420();
            C11999 c11999M29333 = C11999.m29333(c11999M32420.f35927, c11999M32420.f35928, c11999M32420.f35930);
            int iMax = Math.max(0, this.f76798.f7443.m14642());
            C2309 c2309 = this.f76798;
            long j = c2309.f7440;
            C23224 c23224 = new C23224(iMax, j, j, c2309.f7443, c11999M29333, c11999M29333);
            if (this.f76818 != 0) {
                C8905 c8905M24544 = this.f76798.f7441.m24544();
                if (c8905M24544 != null && c8905M24544.f27082 == this.f76818) {
                    C9611 c9611M52296 = m52296(this.f76798.f7441, new C15713().m37044(c23224));
                    C2309 c23010 = this.f76798;
                    this.f76798 = new C2309(c9611M52296, c23010.f7443, c23010.f7440, c23010.f7444, c23010.f7442);
                    this.f76809.m34129(c9611M52296.f29156, c9611M52296.f29155);
                    m52326(1L);
                    c12704M8724.close();
                    return;
                }
                this.f76817 = this.f76817.m37044(c23224);
                c12704M8724.close();
                return;
            }
            if (z) {
                C9611 c9612 = this.f76798.f7441;
                c9611 = new C9611(c9612.f29156, c9612.f29155, c9612.f29154, true);
            } else {
                c9611 = this.f76798.f7441;
            }
            C9611 c9611M24540 = c9611.m24542(c23224, System.currentTimeMillis()).m24540(this.f76809, this.f76798.f7442, m52368());
            C2309 c23011 = this.f76798;
            this.f76798 = new C2309(c9611M24540, c23011.f7443, c23011.f7440, c23011.f7444, c23011.f7442);
            m52326(1L);
            c12704M8724.close();
        } catch (Throwable th) {
            try {
                c12704M8724.close();
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m52295(final C23721 c23721, final BooleanSupplier booleanSupplier, final C22728 c22728, C20177 c20177) throws Throwable {
        Runnable runnable;
        Runnable runnable2;
        long j;
        RunnableC11022 runnableC11022;
        boolean z;
        int i;
        RunnableC11022 runnableC11023;
        RunnableC11022 runnableC11024;
        C15007 c15007;
        Object obj;
        Throwable th;
        Throwable th2;
        Throwable th3;
        RunnableC11022 runnableC11025;
        C23721 c23722 = c23721;
        c23721.getClass();
        if (booleanSupplier.getAsBoolean()) {
            return -1L;
        }
        AtomicBoolean atomicBoolean = f76797;
        boolean z2 = false;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return -1L;
        }
        RunnableC11022 runnableC11026 = new RunnableC11022();
        try {
            try {
                synchronized (c23721) {
                    try {
                        if (!c23721.m52322() || c23721.m52361() < c23722.f76799) {
                            runnableC11023 = runnableC11026;
                            runnable2 = null;
                            j = -1;
                            try {
                            } catch (Throwable th4) {
                                th = th4;
                                runnableC11022 = runnableC11023;
                                z = false;
                                i = 1;
                                while (true) {
                                    try {
                                        break;
                                    } catch (C1849 unused) {
                                        c23722 = c23722;
                                        c23722.f76822 = Math.min(63, c23722.f76822 + i);
                                        runnableC11022.f33142 = runnable2;
                                        f76797.set(z);
                                        return -3L;
                                    } catch (CancellationException unused2) {
                                        runnableC11022.f33142 = runnable2;
                                        f76797.set(z);
                                        return j;
                                    }
                                }
                                throw th;
                            }
                        } else {
                            C7247 c7247 = c23722.f76808;
                            long jM34128 = (c23722.f76809.m34128() * 2) + (((long) c23722.f76803.length()) * 3) + 65536;
                            final C15007 c15007M52351 = c23721.m52351();
                            try {
                                try {
                                    final long jM48808 = c15007M52351.f45762.m32420().f35930.m48808();
                                    c22728.getClass();
                                    if (jM48808 < 67108864 || jM48808 - jM34128 < 33554432 || jM48808 / 2 < jM34128) {
                                        runnableC11023 = runnableC11026;
                                        runnable2 = null;
                                        j = -1;
                                        c15007M52351.close();
                                    } else {
                                        final long jNanoTime = System.nanoTime();
                                        int i2 = c23722.f76822;
                                        j = -1;
                                        try {
                                            long j2 = c22728.f73432;
                                            long j3 = C13132.FOREVER_NS;
                                            if (j2 <= (C13132.FOREVER_NS >> i2)) {
                                                j3 = j2 << i2;
                                            }
                                            c15007 = c15007M52351;
                                            final long j4 = j3;
                                            try {
                                                runnableC11026.f33142 = new Runnable() { // from class: l.֨ۗᩳ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C23721.m52305(this.f3343, booleanSupplier, c15007M52351, c22728, jNanoTime, j4);
                                                    }
                                                };
                                                runnableC11026.run();
                                                try {
                                                    if (c7247.m19390() < jM34128 + 16777216) {
                                                        throw new IOException("Insufficient space for automatic compaction");
                                                    }
                                                    final C22769 c22769M19385 = c7247.m19385(c15007.f45762.m32420().f35930);
                                                    try {
                                                        C1561 c1561 = new C1561(c15007.f45762.m32420().f35930, c22769M19385.f73520);
                                                        try {
                                                            final Runnable runnable3 = runnableC11026.f33142;
                                                            runnableC11026.f33142 = new Runnable() { // from class: l.۠ۗᩳ
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    runnable3.run();
                                                                    if (c22769M19385.f73520.m48808() > jM48808) {
                                                                        throw new CancellationException("Automatic compaction exceeded source size");
                                                                    }
                                                                }
                                                            };
                                                            c1561.m5339(runnableC11026);
                                                            try {
                                                                if (c23721.m52313(c15007, c1561, c22769M19385, c7247, new C8617(c22769M19385.f73520, runnableC11026), c20177, runnableC11026, jM48808)) {
                                                                    c23722.f76822 = 0;
                                                                    long j5 = c15007.f45764;
                                                                    try {
                                                                        c1561.close();
                                                                        try {
                                                                            c22769M19385.close();
                                                                            try {
                                                                                c15007.close();
                                                                                runnableC11026.f33142 = null;
                                                                                atomicBoolean.set(false);
                                                                                return j5;
                                                                            } catch (C1849 unused3) {
                                                                                runnableC11025 = runnableC11026;
                                                                                runnable2 = null;
                                                                                z = false;
                                                                                i = 1;
                                                                                runnableC11022 = runnableC11025;
                                                                                c23722.f76822 = Math.min(63, c23722.f76822 + i);
                                                                                runnableC11022.f33142 = runnable2;
                                                                                f76797.set(z);
                                                                                return -3L;
                                                                            } catch (CancellationException unused4) {
                                                                                runnableC11025 = runnableC11026;
                                                                                runnable2 = null;
                                                                                z = false;
                                                                                runnableC11022 = runnableC11025;
                                                                                runnableC11022.f33142 = runnable2;
                                                                                f76797.set(z);
                                                                                return j;
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                runnableC11025 = runnableC11026;
                                                                                z2 = false;
                                                                                runnableC11026 = runnableC11025;
                                                                                runnable = null;
                                                                                runnableC11026.f33142 = runnable;
                                                                                f76797.set(z2);
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            th = th;
                                                                            c15007.close();
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        th2 = th;
                                                                        try {
                                                                            c22769M19385.close();
                                                                            throw th2;
                                                                        } catch (Throwable th8) {
                                                                            th2.addSuppressed(th8);
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                }
                                                                runnableC11025 = runnableC11026;
                                                                try {
                                                                    runnableC11025.run();
                                                                    try {
                                                                        c1561.close();
                                                                        try {
                                                                            c22769M19385.close();
                                                                            try {
                                                                                c15007.close();
                                                                                runnableC11025.f33142 = null;
                                                                                atomicBoolean.set(false);
                                                                                return -2L;
                                                                            } catch (C1849 unused5) {
                                                                                runnable2 = null;
                                                                                z = false;
                                                                                i = 1;
                                                                                runnableC11022 = runnableC11025;
                                                                                c23722.f76822 = Math.min(63, c23722.f76822 + i);
                                                                                runnableC11022.f33142 = runnable2;
                                                                                f76797.set(z);
                                                                                return -3L;
                                                                            } catch (CancellationException unused6) {
                                                                                runnable2 = null;
                                                                                z = false;
                                                                                runnableC11022 = runnableC11025;
                                                                                runnableC11022.f33142 = runnable2;
                                                                                f76797.set(z);
                                                                                return j;
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                                z2 = false;
                                                                                runnableC11026 = runnableC11025;
                                                                                runnable = null;
                                                                                runnableC11026.f33142 = runnable;
                                                                                f76797.set(z2);
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            th = th;
                                                                            c15007.close();
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        th2 = th;
                                                                        c22769M19385.close();
                                                                        throw th2;
                                                                    }
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    th3 = th;
                                                                    try {
                                                                        c1561.close();
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
                                                    runnableC11026.f33142 = runnable;
                                                    f76797.set(z2);
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
                                            c15007 = c15007M52351;
                                        }
                                    }
                                } catch (Throwable th20) {
                                    th = th20;
                                    c15007 = c15007M52351;
                                    obj = null;
                                }
                                th = th;
                                try {
                                    c15007.close();
                                    throw th;
                                } catch (Throwable th21) {
                                    th.addSuppressed(th21);
                                    throw th;
                                }
                            } catch (C1849 unused7) {
                                runnableC11022 = runnableC11026;
                                z = false;
                                i = 1;
                                c23722.f76822 = Math.min(63, c23722.f76822 + i);
                                runnableC11022.f33142 = runnable2;
                                f76797.set(z);
                                return -3L;
                            } catch (CancellationException unused8) {
                                runnableC11022 = runnableC11026;
                                z = false;
                                runnableC11022.f33142 = runnable2;
                                f76797.set(z);
                                return j;
                            } catch (Throwable th22) {
                                th = th22;
                                runnableC11026 = runnableC11024;
                                z2 = false;
                            }
                        }
                    } catch (Throwable th23) {
                        th = th23;
                        runnable2 = null;
                        runnableC11022 = runnableC11026;
                        j = -1;
                    }
                }
                runnableC11023.f33142 = runnable2;
                atomicBoolean.set(false);
                return j;
            } catch (Throwable th24) {
                th = th24;
            }
        } catch (C1849 unused9) {
            runnable2 = null;
        } catch (CancellationException unused10) {
            runnable2 = null;
            j = -1;
        } catch (Throwable th25) {
            th = th25;
            runnable = null;
            runnableC11026 = runnableC11026;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized l.EnumC16665 m52333(boolean r18, l.InterfaceC7702 r19) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23721.m52333(boolean, l.۟᩶ᩳ):l.ܽ۬ᩳ");
    }

    public C23721(C21605 c21605, C2827 c2827, C2267 c2267, C2309 c2309, C8617 c8617, C20194 c20194, C12891 c12891) {
        this.f76810 = new Object();
        this.f76814 = C5131.f16061;
        this.f76809 = new C14302();
        this.f76815 = new FutureC3575();
        this.f76804 = UUID.randomUUID();
        this.f76801 = c21605;
        this.f76803 = c2827;
        this.f76820 = c2267;
        this.f76798 = c2309;
        C14302 c14302 = this.f76809;
        C9611 c9611 = c2309.f7441;
        c14302.m34129(c9611.f29156, c9611.f29155);
        this.f76799 = c8617.m22370();
        this.f76806 = new C10070(c8617, c21605, c20194, c12891);
    }

    public C23721(CharSequence charSequence) {
        this.f76810 = new Object();
        this.f76814 = C5131.f16061;
        this.f76809 = new C14302();
        this.f76815 = new FutureC3575();
        this.f76804 = UUID.randomUUID();
        this.f76803 = new C2827(charSequence);
        this.f76798 = new C2309();
        this.f76820 = C2267.m7494(null, new byte[0]);
        this.f76806 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23721 m52298(CharSequence charSequence) {
        return new C23721(charSequence);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m52368() {
        return this.f76806 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52302(InterfaceC20758 interfaceC20758) {
        C7247.m19372(interfaceC20758);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23721 m52300(InterfaceC20758 interfaceC20758, C1143 c1143, C4671 c4671) {
        C7247[] c7247Arr = new C7247[1];
        C22769[] c22769Arr = new C22769[1];
        C23721 c23721M52299 = null;
        try {
            c23721M52299 = m52299(c1143, c4671, C12891.f38696, new C4384(c7247Arr, interfaceC20758, c22769Arr, c1143));
            c7247Arr[0].m19387(c22769Arr[0], c23721M52299.f76799);
            c22769Arr[0].m50847();
            c23721M52299.f76808 = c7247Arr[0];
            return c23721M52299;
        } catch (Throwable th) {
            if (c23721M52299 != null) {
                try {
                    c23721M52299.m52331().m10930();
                } catch (Throwable th2) {
                    try {
                        C22769 c22769 = c22769Arr[0];
                        if (c22769 != null) {
                            c22769.close();
                        }
                        throw th2;
                    } finally {
                        C7247 c7247 = c7247Arr[0];
                        if (c7247 != null) {
                            c7247.close();
                        }
                    }
                }
            }
            try {
                C22769 c227610 = c22769Arr[0];
                if (c227610 != null) {
                    c227610.close();
                }
                throw th;
            } finally {
                C7247 c7248 = c7247Arr[0];
                if (c7248 != null) {
                    c7248.close();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23721 m52299(C1143 c1143, C4671 c4671, C12891 c12891, C4384 c4384) throws Throwable {
        C21605 c21605;
        C2267 c2267M7494;
        C20194 c20194M13735 = c4671.m13735();
        C2827 c2827 = null;
        try {
            C7247[] c7247Arr = c4384.f14066;
            InterfaceC20758 interfaceC20758 = c4384.f14067;
            C22769[] c22769Arr = c4384.f14068;
            C1143 c1144 = c4384.f14069;
            C7247 c7247M19363 = C7247.m19363(interfaceC20758);
            c7247Arr[0] = c7247M19363;
            C22769 c22769M19383 = c7247M19363.m19383(c1144);
            c22769Arr[0] = c22769M19383;
            c21605 = c22769M19383.f73520;
            try {
                c2267M7494 = C2267.m7494(c1143, new byte[0]);
                try {
                    C2827 c2828 = new C2827(C11999.m29333(c21605.f69369, c21605.f69373, c21605), 0L);
                    try {
                        C8617 c8617 = new C8617(c21605);
                        C2309 c2309 = new C2309();
                        C12704 c12704M8724 = c2828.m8724();
                        try {
                            byte[] bArr = c2267M7494.f7359;
                            synchronized (c8617) {
                                c8617.m22374(c12704M8724, bArr, c2309, null, 0L);
                            }
                            c12704M8724.close();
                            return new C23721(c21605, c2828, c2267M7494, c2309, c8617, c20194M13735, c12891);
                        } catch (Throwable th) {
                            try {
                                c12704M8724.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c2827 = c2828;
                        if (c2827 != null) {
                            try {
                                c2827.close();
                            } catch (Throwable th4) {
                                if (c21605 != null) {
                                    try {
                                        c21605.close();
                                    } finally {
                                        c20194M13735.close();
                                    }
                                }
                                throw th4;
                            }
                        }
                        if (c2267M7494 != null) {
                            c2267M7494.close();
                        }
                        if (c21605 != null) {
                            try {
                                c21605.close();
                            } finally {
                                c20194M13735.close();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                c2267M7494 = null;
            }
        } catch (Throwable th7) {
            th = th7;
            c21605 = null;
            c2267M7494 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17371 m52316(InterfaceC20758 interfaceC20758, C1143 c1143, C4671 c4671) {
        C7247 c7247M19379;
        C21605 c21605M48793;
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        C20194 c20194M13735 = c4671.m13735();
        C9323 c9323M22371 = null;
        try {
            c7247M19379 = C7247.m19379(interfaceC20758);
            try {
                C13596 c13596M19381 = c7247M19379.m19381();
                c21605M48793 = C21605.m48793(interfaceC23015.mo28628(c7247M19379.m19382(c13596M19381), false), c1143);
                try {
                    C8617 c8617 = new C8617(c21605M48793);
                    c9323M22371 = c8617.m22371(C20612.f66331);
                    C7247.m19368(c13596M19381, c21605M48793, c9323M22371.f28277);
                    C17371 c17371 = new C17371(c21605M48793, c8617, c9323M22371, c20194M13735);
                    c17371.f53187 = c7247M19379;
                    return c17371;
                } catch (Throwable th) {
                    th = th;
                    if (c9323M22371 != null) {
                        try {
                            c9323M22371.close();
                        } catch (Throwable th2) {
                            if (c21605M48793 != null) {
                                try {
                                    c21605M48793.close();
                                } catch (Throwable th3) {
                                    if (c7247M19379 != null) {
                                        try {
                                            c7247M19379.close();
                                        } finally {
                                            c20194M13735.close();
                                        }
                                    }
                                    throw th3;
                                }
                            }
                            if (c7247M19379 != null) {
                                try {
                                    c7247M19379.close();
                                } finally {
                                    c20194M13735.close();
                                }
                            }
                            throw th2;
                        }
                    }
                    if (c21605M48793 != null) {
                        try {
                            c21605M48793.close();
                        } catch (Throwable th4) {
                            if (c7247M19379 != null) {
                                try {
                                    c7247M19379.close();
                                } finally {
                                    c20194M13735.close();
                                }
                            }
                            throw th4;
                        }
                    }
                    if (c7247M19379 != null) {
                        try {
                            c7247M19379.close();
                        } finally {
                            c20194M13735.close();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                c21605M48793 = null;
            }
        } catch (Throwable th6) {
            th = th6;
            c7247M19379 = null;
            c21605M48793 = null;
        }
    }

    public final int length() {
        int length;
        synchronized (this.f76810) {
            length = this.f76803.length();
        }
        return length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m52330(int i) {
        C11999 c11999M8723;
        synchronized (this.f76810) {
            c11999M8723 = this.f76803.m8723(i);
        }
        C21605 c21605 = c11999M8723.f35930;
        try {
            return c11999M8723.m29340(i);
        } finally {
            if (c21605 != null) {
                c21605.m48812();
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long m52371() {
        return this.f76799;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long m52361() {
        C10070 c10070 = this.f76806;
        return c10070 == null ? this.f76799 : c10070.m25282();
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C12704 m52357() {
        C12704 c12704M8724;
        synchronized (this.f76810) {
            c12704M8724 = this.f76803.m8724();
        }
        return c12704M8724;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52346(C12704 c12704) {
        boolean zM8726;
        synchronized (this.f76810) {
            zM8726 = this.f76803.m8726(c12704);
        }
        return zM8726;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52312(final C0149 c0149, final char[] cArr, final int i, final C5131 c5131, int i2, C18077 c18077) {
        if (this.f76821 == c0149 && !c0149.m1246()) {
            m52319();
            long j = i;
            if (((long) this.f76803.length()) + j <= i2) {
                this.f76807 = true;
                try {
                    if (i != 0) {
                        this.f76803.m8725(new Consumer() { // from class: l.ۤۗᩳ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C23517.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                C0149 c01410 = c0149;
                                char[] cArr2 = cArr;
                                int i3 = i;
                                C5131 c5132 = c5131;
                                C16231 c16231 = (C16231) obj;
                                try {
                                    c01410.m1243();
                                    c16231.m38195(c16231.m38196(), c16231.m38196(), CharBuffer.wrap(cArr2, 0, i3));
                                    c01410.m1244(c5132.m14691());
                                } catch (IOException e) {
                                    throw new UncheckedIOException(e);
                                }
                            }
                        }, null);
                    } else {
                        try {
                            c0149.m1244(c5131.m14691());
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    }
                    this.f76814 = c5131;
                    c0149.f1295 = c5131;
                    if (c18077 != null) {
                        c18077.f56305 = true;
                    }
                    if (c5131.m14691()) {
                        this.f76821 = null;
                    }
                    m52326(Math.max(1L, j * 2));
                    this.f76807 = false;
                    return true;
                } catch (Throwable th) {
                    this.f76807 = false;
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9611 m52296(C9611 c9611, C15713 c15713) {
        if (c15713.isEmpty()) {
            return c9611;
        }
        C8905 c8905M24544 = c9611.m24544();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c8905M24544 != null) {
            long j = c8905M24544.f27082;
            if (j == this.f76818) {
                return new C9611(c9611.f29156.m37047(new C8905(j, jCurrentTimeMillis, EnumC14051.BATCH, c8905M24544.f27081.m37045(c15713))), c9611.f29155, c9611.f29154, c9611.f29153);
            }
        }
        return c9611.m24541(this.f76817.m37045(c15713), jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52339(C3511 c3511) {
        EnumC14051 enumC14051 = EnumC14051.USER;
        synchronized (this) {
            m52301(enumC14051, c3511, (C10776) null);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52301(final EnumC14051 enumC14051, final Consumer consumer, C10776 c10776) throws Throwable {
        boolean z;
        m52319();
        EnumC14051 enumC14052 = EnumC14051.LOADER;
        if (enumC14051 == enumC14052) {
            m52318();
        }
        if (enumC14051 != EnumC14051.USER && enumC14051 != EnumC14051.BATCH && enumC14051 != enumC14052) {
            throw new IllegalArgumentException("Unsupported session edit origin");
        }
        int i = 1;
        this.f76807 = true;
        long jM8727 = this.f76803.m8727();
        final long[] jArr = new long[1];
        final C2309 c2309 = this.f76798;
        final C2309[] c2309Arr = new C2309[1];
        final C5089[] c5089Arr = {c2309.f7443};
        C23475 c23475 = (enumC14051 == enumC14052 || c10776 != null) ? null : new C23475(enumC14051, c2309.f7440, c2309.f7444, new C17170(i, c5089Arr), true);
        int i2 = 0;
        C16419 c16419 = this.f76823;
        final C23475 c23476 = c16419 != null ? new C23475(EnumC14051.BATCH, c16419.f50503, c16419.f50508, new C2973(i2, c5089Arr), false) : null;
        try {
            final C23475 c23477 = c23475;
            final C23475 c23478 = c23475;
            z = false;
            try {
                this.f76803.m8725(new Consumer() { // from class: l.۬ۗᩳ
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        C23721.m52306(this.f38607, consumer, jArr, c23477, c2309, c2309Arr, c5089Arr, c23476, (C16231) obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return C23517.$default$andThen(this, consumer2);
                    }
                }, new InterfaceC9177() { // from class: l.۫ۗᩳ
                    @Override // l.InterfaceC9177
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo23583(int i3, int i4, C11999 c11999, C11999 c119910, int i5) {
                        if (enumC14051 == EnumC14051.LOADER) {
                            if (i3 != c11999.m29347() || i4 != i3) {
                                throw new IllegalArgumentException("Loader may only append text");
                            }
                            return;
                        }
                        C23475 c23479 = c23478;
                        if (c23479 != null) {
                            c23479.mo23583(i3, i4, c11999, c119910, i5);
                        }
                        C23475 c234710 = c23476;
                        if (c234710 != null) {
                            c234710.mo23583(i3, i4, c11999, c119910, i5);
                        }
                        C5089[] c5089Arr2 = c5089Arr;
                        c5089Arr2[0] = c5089Arr2[0].m14641(i3, i4, i5);
                    }
                });
                if (this.f76803.m8727() != jM8727) {
                    if (c23476 != null) {
                        this.f76823.m38693();
                    }
                    this.f76798 = c2309Arr[0];
                    m52326(jArr[0]);
                }
                try {
                    C14302 c14302 = this.f76809;
                    C9611 c9611 = this.f76798.f7441;
                    c14302.m34129(c9611.f29156, c9611.f29155);
                } finally {
                    this.f76807 = false;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C14302 c14303 = this.f76809;
                    C9611 c9612 = this.f76798.f7441;
                    c14303.m34129(c9612.f29156, c9612.f29155);
                    throw th;
                } finally {
                    this.f76807 = z;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52306(C23721 c23721, Consumer consumer, long[] jArr, C23475 c23475, C2309 c2309, C2309[] c2309Arr, C5089[] c5089Arr, C23475 c23476, C16231 c16231) {
        C9611 c9611M52296;
        consumer.accept(c16231);
        jArr[0] = c16231.m38193();
        if (c23475 == null) {
            c9611M52296 = c2309.f7441;
        } else {
            c9611M52296 = c23721.f76818 != 0 ? c23721.m52296(c2309.f7441, c23475.m51929()) : c23475.m51928(c2309.f7441, System.currentTimeMillis());
        }
        if (c23721.f76818 == 0) {
            c9611M52296 = c9611M52296.m24540(c23721.f76809, c2309.f7442, c23721.m52368());
        }
        C2309 c23010 = new C2309(c9611M52296, c5089Arr[0], c23475 == null ? c2309.f7440 : c23475.m51930(), c23475 == null ? c2309.f7444 : c23475.m51931(), c2309.f7442);
        c2309Arr[0] = c23010;
        if (c23476 != null) {
            c23721.f76823.m38692(c23476, c23010);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public void m52318() {
        if (this.f76823 != null || this.f76805 || this.f76824 != null) {
            throw new IllegalStateException("Operation is unavailable during editable history replay");
        }
        if (this.f76818 != 0) {
            throw new IllegalStateException("Operation is unavailable during history grouping");
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m52326(long j) {
        this.f76799++;
        if (this.f76818 != 0) {
            long jMax = Math.max(1L, j);
            long j2 = this.f76816;
            long j3 = C13132.FOREVER_NS;
            if (jMax <= C13132.FOREVER_NS - j2) {
                j3 = j2 + jMax;
            }
            this.f76816 = j3;
            return;
        }
        m52324(j);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m52324(long j) {
        C10070 c10070;
        boolean z = this.f76813;
        long j2 = C13132.FOREVER_NS;
        if (z) {
            long j3 = this.f76819;
            this.f76819 = j > C13132.FOREVER_NS - j3 ? Long.MAX_VALUE : j3 + j;
        }
        C16419 c16419 = this.f76823;
        if (c16419 != null) {
            long j4 = c16419.f50502;
            if (j <= C13132.FOREVER_NS - j4) {
                j2 = j4 + j;
            }
            c16419.f50502 = j2;
            return;
        }
        if (z || (c10070 = this.f76806) == null) {
            return;
        }
        c10070.m25280(new C15007(this.f76803.m8724(), this.f76820, this.f76798, this.f76814, this.f76799), j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14548 m52297(C12951 c12951) {
        return new C14548(C3678.m11205(c12951));
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m52332(final BooleanSupplier booleanSupplier) {
        final C22728 c22728 = C22728.f73430;
        final C20177 c20177 = new C20177();
        synchronized (this) {
            C11003.requireNonNull(booleanSupplier);
            if (m52322()) {
                return this.f76806.m25276((C5795) new InterfaceC3014() { // from class: l.ۛۗᩳ
                    @Override // l.InterfaceC3014
                    public final long run() {
                        return C23721.m52295(this.f17829, booleanSupplier, c22728, c20177);
                    }
                }, true).m10921((InterfaceC21423) new C18566(6));
            }
            return FutureC3575.m10905(EnumC13555.SKIPPED);
        }
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private boolean m52322() {
        if (this.f76808 == null || this.f76812 || this.f76811 || this.f76807 || this.f76823 != null || this.f76805 || this.f76824 != null || this.f76821 != null || !this.f76814.m14691()) {
            return false;
        }
        return !this.f76813 || this.f76802 == this.f76799;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m52313(C15007 c15007, C1561 c1561, C22769 c22769, C7247 c7247, C8617 c8617, C20177 c20177, Runnable runnable, long j) {
        boolean z;
        C14302 c14302;
        C2827 c2827;
        C4425 c4425;
        C4425 c4425M25277;
        ?? r9;
        ?? r10;
        C4425 c4426;
        C15007 c15007M5338 = c1561.m5338(c15007);
        try {
            RunnableC11022 runnableC11022 = (RunnableC11022) runnable;
            runnableC11022.run();
            c8617.m22374(c15007M5338.f45762, c15007M5338.f45763.f7359, c15007M5338.f45765, c15007M5338.f45766, c15007M5338.f45764);
            runnableC11022.run();
            if (j > 0 && j - c22769.f73520.m48808() < 33554432) {
                c15007M5338.close();
                return false;
            }
            c7247.m19386(c15007M5338.f45764, c22769, runnable);
            runnableC11022.run();
            C2827 c2828 = new C2827(c15007M5338.f45762.m32420(), c15007M5338.f45762.m30979());
            C14302 c14303 = new C14302();
            ?? r7 = 0;
            c14302 = null;
            c14302 = null;
            C14302 c14304 = null;
            try {
                C9611 c9611 = c15007M5338.f45765.f7441;
                c14303.m34129(c9611.f29156, c9611.f29155);
                synchronized (this) {
                    try {
                        m52328();
                        if (this.f76811) {
                            throw new CancellationException("Session is closing during compaction");
                        }
                        if (this.f76799 != c15007M5338.f45764) {
                            try {
                                c2828.close();
                                c14303.m34130();
                                c15007M5338.close();
                                return false;
                            } catch (Throwable th) {
                                c14303.m34130();
                                throw th;
                            }
                        }
                        runnableC11022.run();
                        c4425M25277 = this.f76806.m25277(c8617, c22769.f73520);
                        try {
                            try {
                                c7247.m19389(c22769, c15007M5338.f45764);
                                c2827 = this.f76803;
                                try {
                                    r9 = this.f76801;
                                    try {
                                        c14304 = this.f76809;
                                        this.f76801 = c22769.m50847();
                                        synchronized (this.f76810) {
                                            this.f76803 = c2828;
                                        }
                                        this.f76798 = c15007M5338.f45765;
                                        this.f76809 = c14303;
                                        c4425M25277.m13147();
                                        try {
                                            try {
                                                r9.m48804().m10910((InterfaceC8017) new C14966(this, c7247, r9.f69370));
                                                try {
                                                    c2827.close();
                                                    try {
                                                        r9.close();
                                                        c14304.m34130();
                                                        c4425M25277.close();
                                                        c15007M5338.close();
                                                        return true;
                                                    } catch (Throwable th2) {
                                                        c14304.m34130();
                                                        throw th2;
                                                    }
                                                } catch (Throwable th3) {
                                                    try {
                                                        r9.close();
                                                        throw th3;
                                                    } finally {
                                                        c14304.m34130();
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                c4425M25277.close();
                                                throw th4;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            z = true;
                                            r10 = r9;
                                            C14302 c14305 = c14304;
                                            c4426 = c4425M25277;
                                            c14302 = c14305;
                                            while (true) {
                                                break;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        z = false;
                                        r10 = r9;
                                        C14302 c14306 = c14304;
                                        c4426 = c4425M25277;
                                        c14302 = c14306;
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
                                c2827 = null;
                                r9 = c2827;
                                z = false;
                                r10 = r9;
                                C14302 c14307 = c14304;
                                c4426 = c4425M25277;
                                c14302 = c14307;
                                while (true) {
                                    break;
                                    break;
                                }
                                throw th;
                            }
                        } catch (IOException | Error | RuntimeException e) {
                            if (c7247.m19393()) {
                                this.f76806.m25279(e);
                            }
                            throw e;
                        }
                        try {
                            c15007M5338.close();
                            throw th;
                        } catch (Throwable th9) {
                            th.addSuppressed(th9);
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        c4425M25277 = null;
                        c2827 = null;
                    }
                }
                try {
                    break;
                    throw th;
                } catch (Throwable th11) {
                    th = th11;
                    ?? r14 = r10;
                    c4425 = c4426;
                    r7 = r14;
                    try {
                        if (z) {
                            r7.m48804().m10910((InterfaceC8017) new C14966(this, c7247, r7.f69370));
                            try {
                                c2827.close();
                                try {
                                    r7.close();
                                    c14302.m34130();
                                } catch (Throwable th12) {
                                    c14302.m34130();
                                    throw th12;
                                }
                            } catch (Throwable th13) {
                                try {
                                    r7.close();
                                    throw th13;
                                } finally {
                                    c14302.m34130();
                                }
                            }
                        } else {
                            try {
                                c2828.close();
                                c14303.m34130();
                            } catch (Throwable th14) {
                                c14303.m34130();
                                throw th14;
                            }
                        }
                        if (c4425 != null) {
                            c4425.close();
                        }
                        throw th;
                    } catch (Throwable th15) {
                        if (c4425 != null) {
                            c4425.close();
                        }
                        throw th15;
                    }
                }
            } catch (Throwable th16) {
                th = th16;
                z = false;
                c14302 = null;
                c2827 = null;
                c4425 = null;
            }
        } catch (Throwable th17) {
            c15007M5338.close();
            throw th17;
        }
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    private void m52328() {
        if (this.f76812) {
            throw new C2121("Text session is closed");
        }
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    private void m52319() {
        m52325();
        if (this.f76799 == C13132.FOREVER_NS) {
            throw new IllegalStateException("Session revision exhausted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public void m52325() {
        m52328();
        C7247 c7247 = this.f76808;
        if (c7247 != null && c7247.m19393()) {
            throw new IllegalStateException("Recovery generation requires reopening");
        }
        if (this.f76811 || this.f76807) {
            throw new IllegalStateException("Text session is closing or already editing");
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m52366() {
        synchronized (this) {
            if (this.f76812) {
                return this.f76815;
            }
            if (this.f76806 == null) {
                return m52331();
            }
            FutureC3575 futureC3575 = this.f76800;
            if (futureC3575 != null) {
                return futureC3575;
            }
            if (!this.f76807 && this.f76823 == null && !this.f76805 && this.f76824 == null && this.f76818 == 0) {
                if (this.f76813 && this.f76802 != this.f76799) {
                    throw new IllegalStateException("Current session state requires an explicit checkpoint");
                }
                if (this.f76813 && this.f76821 != null) {
                    throw new IllegalStateException("Stop loading before the final explicit checkpoint");
                }
                C7247 c7247 = this.f76808;
                if (c7247 == null || !c7247.m19393()) {
                    C0149 c0149 = this.f76821;
                    if (c0149 != null) {
                        C5131 c5131M14683 = this.f76814.m14683(EnumC0191.CANCELED, EnumC19243.NONE);
                        this.f76814 = c5131M14683;
                        c0149.f1295 = c5131M14683;
                        this.f76821 = null;
                        m52326(1L);
                    }
                    this.f76811 = true;
                    FutureC3575 futureC3576 = new FutureC3575();
                    this.f76800 = futureC3576;
                    long j = this.f76799;
                    if (c0149 != null) {
                        c0149.m1247();
                    }
                    this.f76806.m25275(j).m10910((InterfaceC8017) new C20068(this, futureC3576));
                    return futureC3576;
                }
                FutureC3575 futureC3577 = new FutureC3575();
                futureC3577.m10914((Throwable) new IOException("Recovery generation requires reopening; abandon before recovery"));
                return futureC3577;
            }
            throw new IllegalStateException("Cannot close during session edit");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52308(C23721 c23721, FutureC3575 futureC3575, Throwable th) {
        if (th != null) {
            synchronized (c23721) {
                c23721.f76811 = false;
                c23721.f76800 = null;
            }
            futureC3575.m10914(th);
            return;
        }
        c23721.m52331().m10910((InterfaceC8017) new C19907(futureC3575));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m52331() {
        synchronized (this) {
            if (this.f76812) {
                return this.f76815;
            }
            if (this.f76807 || this.f76823 != null || this.f76805 || this.f76824 != null || this.f76818 != 0) {
                throw new IllegalStateException("Cannot abandon during session edit");
            }
            C0149 c0149 = this.f76821;
            if (c0149 != null) {
                c0149.f1295 = this.f76814.m14683(EnumC0191.CANCELED, EnumC19243.NONE);
            }
            this.f76821 = null;
            this.f76812 = true;
            C2267 c2267 = this.f76820;
            this.f76820 = null;
            this.f76798 = null;
            final C7247 c7247 = this.f76808;
            this.f76808 = null;
            this.f76809.m34130();
            if (c0149 != null) {
                c0149.m1247();
            }
            this.f76803.close();
            th = null;
            try {
                c2267.close();
            } catch (Throwable th) {
                if (th == null) {
                    th = th;
                } else if (th != th) {
                    th.addSuppressed(th);
                }
            }
            try {
                C21605 c21605 = this.f76801;
                if (c21605 != null) {
                    c21605.close();
                }
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    th.addSuppressed(th2);
                }
            }
            C10070 c10070 = this.f76806;
            if (c10070 == null) {
                if (th == null) {
                    this.f76815.m10912((Object) null);
                } else {
                    this.f76815.m10914(th);
                }
                return this.f76815;
            }
            c10070.m25284().m10910(new InterfaceC8017() { // from class: l.᩹ۗᩳ
                @Override // l.InterfaceC8017
                /* JADX INFO: renamed from: ۧ */
                public final void mo4663(Object obj, Throwable th3) {
                    C23721.m52304(this.f70587, th, c7247, th3);
                }
            });
            this.f76806.m25278();
            return this.f76815;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52304(C23721 c23721, Throwable th, C7247 c7247, Throwable th2) {
        FutureC3575 futureC3575 = c23721.f76815;
        if (th2 != null) {
            if (th == null) {
                th = th2;
            } else if (th != th2) {
                th.addSuppressed(th2);
            }
        }
        if (c7247 != null) {
            try {
                c7247.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else if (th != th3) {
                    th.addSuppressed(th3);
                }
            }
        }
        if (th == null) {
            futureC3575.m10912((Object) null);
        } else {
            futureC3575.m10914(th);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        FutureC3575 futureC3575M52366 = m52366();
        if (C4671.m13734() && !futureC3575M52366.isDone()) {
            throw new IllegalStateException("Use closeAsync from persistence callbacks");
        }
        try {
            futureC3575M52366.m10930();
        } catch (C13452 e) {
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
