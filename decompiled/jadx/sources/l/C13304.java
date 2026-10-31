package l;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۬ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36RQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13304 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final UUID f39817;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f39818;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle f39819;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f39820;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f39821;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f39822;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public Bundle f39823;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f39824;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f39825;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f39826;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f39827;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C2931 f39828;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f39829;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C11481 f39830;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7206 f39831;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C12599 f39832;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C11481 m32271() {
        return this.f39830;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m32279() {
        return this.f39822;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m32274() {
        return this.f39820;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Bundle m32276() {
        return new Bundle(this.f39819);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m32275() {
        return this.f39825;
    }

    public C13304(C7206 c7206, C12599 c12599, Bundle bundle, C2931 c2931) {
        this.f39828 = c2931;
        this.f39823 = new Bundle(bundle);
        this.f39819 = new Bundle(bundle);
        this.f39818 = C14460.m34534().digest(c12599.m30864());
        UUID uuidM19289 = c7206.m19289();
        this.f39817 = uuidM19289;
        this.f39827 = c7206.m19288();
        byte[] bArrM19285 = c7206.m19285();
        this.f39826 = bArrM19285;
        C7869.m21146(uuidM19289, bArrM19285);
        this.f39831 = c7206;
        this.f39832 = c12599;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13304 m32268(C12392 c12392, Bundle bundle, C23077 c23077, byte[] bArr, byte[] bArr2, int i, long j, byte[] bArr3) {
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        if (!(interfaceC7785M30436 instanceof C4342)) {
            throw new IllegalStateException("Fragment checkpoint requires a session owner");
        }
        C4342 c4342 = (C4342) interfaceC7785M30436;
        C23721 c23721Mo1601 = c4342.mo1601();
        long jM52371 = c23721Mo1601.m52371();
        C2931 c2931M30517 = c12392.m30517();
        C12704 c12704M52357 = c23721Mo1601.m52357();
        try {
            C12599 c12599M17216 = C6249.m17216(c12704M52357, bundle, c23077, c2931M30517, bArr, bArr2, i);
            c12704M52357.close();
            try {
                synchronized (c23721Mo1601) {
                    if (c23721Mo1601.m52371() != jM52371 || c12392.m30436() != interfaceC7785M30436) {
                        throw new C3427("Fragment owner changed during capture");
                    }
                    if (jM52371 != j || !Arrays.equals(bArr3, C14460.m34534().digest(c12599M17216.m30864()))) {
                        C7206 c7206M52360 = c23721Mo1601.m52360();
                        try {
                            C13304 c13304 = new C13304(c7206M52360, c12599M17216, bundle, c2931M30517);
                            c13304.f39825 = c4342.isChanged();
                            c13304.f39822 = c23077 == null ? 0 : c23077.f74223;
                            c13304.f39820 = c12392.m30531();
                            return c13304;
                        } catch (Throwable th) {
                            c7206M52360.close();
                            throw th;
                        }
                    }
                    c12599M17216.close();
                    return null;
                }
            } catch (Throwable th2) {
                c12599M17216.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c12704M52357.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m32277() {
        return (byte[]) this.f39818.clone();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C2931 m32278() {
        return this.f39828;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m32270(InterfaceC20758 interfaceC20758, C1143 c1143) {
        C7206 c7206;
        C12599 c12599;
        byte[] bArrM30864;
        C11481 c11481M28297;
        C7206 c7206M32269;
        synchronized (this) {
            if (this.f39829 || this.f39824 || this.f39821) {
                throw new IllegalStateException("Fragment checkpoint is unavailable");
            }
            this.f39821 = true;
            c7206 = this.f39831;
            c12599 = this.f39832;
            bArrM30864 = c12599.m30864();
            c11481M28297 = this.f39830;
        }
        try {
            C5377 c5377M30865 = c12599.m30865((((long) bArrM30864.length) * 4) + X931RNG.BLOCK64_RESEED_MAX);
            if (c11481M28297 == null) {
                try {
                    c11481M28297 = C11481.m28297(interfaceC20758, this.f39817, new ByteArrayInputStream(bArrM30864), bArrM30864.length, bArrM30864.length, c1143);
                } catch (Throwable th) {
                    if (c5377M30865 == null) {
                        throw th;
                    }
                    try {
                        c5377M30865.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f39830 = c11481M28297;
                if (this.f39829) {
                    throw new CancellationException("Fragment checkpoint was discarded");
                }
            }
            C9240.m23681(interfaceC20758, this.f39823);
            long jM19286 = c7206.m19286(C7869.m21145(this.f39826, c11481M28297, this.f39817));
            synchronized (this) {
                this.f39824 = true;
            }
            if (c5377M30865 != null) {
                c5377M30865.close();
            }
            synchronized (this) {
                this.f39821 = false;
                c7206M32269 = (this.f39829 || this.f39824) ? m32269() : null;
            }
            if (c7206M32269 != null) {
                c7206M32269.close();
            }
            return jM19286;
        } catch (Throwable th3) {
            synchronized (this) {
                this.f39821 = false;
                c7206M32269 = (this.f39829 || this.f39824) ? m32269() : null;
                if (c7206M32269 != null) {
                    c7206M32269.close();
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m32272() {
        return this.f39827;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final UUID m32273() {
        return this.f39817;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C7206 c7206M32269;
        synchronized (this) {
            this.f39829 = true;
            c7206M32269 = !this.f39821 ? m32269() : null;
        }
        if (c7206M32269 != null) {
            c7206M32269.close();
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C7206 m32269() {
        C7206 c7206 = this.f39831;
        this.f39831 = null;
        this.f39826 = null;
        this.f39823 = null;
        C12599 c12599 = this.f39832;
        this.f39832 = null;
        if (c12599 != null) {
            c12599.close();
        }
        return c7206;
    }
}
