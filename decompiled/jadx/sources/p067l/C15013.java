package p067l;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۬ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36RQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15013 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫֫ */
    public final UUID f42884;

    /* JADX INFO: renamed from: ۗ */
    public final byte[] f42885;

    /* JADX INFO: renamed from: ۙ */
    public final Bundle f42886;

    /* JADX INFO: renamed from: ۛ */
    public String f42887;

    /* JADX INFO: renamed from: ۟ */
    public boolean f42888;

    /* JADX INFO: renamed from: ۤ */
    public int f42889;

    /* JADX INFO: renamed from: ۧ֫ */
    public Bundle f42890;

    /* JADX INFO: renamed from: ۨ */
    public boolean f42891;

    /* JADX INFO: renamed from: ۫ */
    public boolean f42892;

    /* JADX INFO: renamed from: ۬ */
    public byte[] f42893;

    /* JADX INFO: renamed from: ܰ */
    public final long f42894;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C5154 f42895;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f42896;

    /* JADX INFO: renamed from: ᩸ */
    public C13280 f42897;

    /* JADX INFO: renamed from: ᩹ */
    public C9217 f42898;

    /* JADX INFO: renamed from: ᩺ */
    public C14343 f42899;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C13280 m34372() {
        return this.f42897;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m34380() {
        return this.f42889;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m34375() {
        return this.f42887;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Bundle m34377() {
        return new Bundle(this.f42886);
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m34376() {
        return this.f42892;
    }

    public C15013(C9217 c9217, C14343 c14343, Bundle bundle, C5154 c5154) {
        this.f42895 = c5154;
        this.f42890 = new Bundle(bundle);
        this.f42886 = new Bundle(bundle);
        this.f42885 = C16111.m36668().digest(c14343.m32941());
        UUID uuidM21236 = c9217.m21236();
        this.f42884 = uuidM21236;
        this.f42894 = c9217.m21235();
        byte[] bArrM21232 = c9217.m21232();
        this.f42893 = bArrM21232;
        C9847.m23111(uuidM21236, bArrM21232);
        this.f42898 = c9217;
        this.f42899 = c14343;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15013 m34369(C14146 c14146, Bundle bundle, C24301 c24301, byte[] bArr, byte[] bArr2, int i, long j, byte[] bArr3) {
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        if (!(interfaceC9768M32500 instanceof C6495)) {
            throw new IllegalStateException("Fragment checkpoint requires a session owner");
        }
        C6495 c6495 = (C6495) interfaceC9768M32500;
        C24913 c24913Mo3999 = c6495.mo3999();
        long jM54774 = c24913Mo3999.m54774();
        C5154 c5154M32581 = c14146.m32581();
        C14443 c14443M54760 = c24913Mo3999.m54760();
        try {
            C14343 c14343M19154 = C8308.m19154(c14443M54760, bundle, c24301, c5154M32581, bArr, bArr2, i);
            c14443M54760.close();
            try {
                synchronized (c24913Mo3999) {
                    if (c24913Mo3999.m54774() != jM54774 || c14146.m32500() != interfaceC9768M32500) {
                        throw new C5626("Fragment owner changed during capture");
                    }
                    if (jM54774 != j || !Arrays.equals(bArr3, C16111.m36668().digest(c14343M19154.m32941()))) {
                        C9217 c9217M54763 = c24913Mo3999.m54763();
                        try {
                            C15013 c15013 = new C15013(c9217M54763, c14343M19154, bundle, c5154M32581);
                            c15013.f42892 = c6495.isChanged();
                            c15013.f42889 = c24301 == null ? 0 : c24301.f76968;
                            c15013.f42887 = c14146.m32595();
                            return c15013;
                        } catch (Throwable th) {
                            c9217M54763.close();
                            throw th;
                        }
                    }
                    c14343M19154.close();
                    return null;
                }
            } catch (Throwable th2) {
                c14343M19154.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c14443M54760.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] m34378() {
        return (byte[]) this.f42885.clone();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C5154 m34379() {
        return this.f42895;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m34371(InterfaceC22097 interfaceC22097, C3455 c3455) {
        C9217 c9217;
        C14343 c14343;
        byte[] bArrM32941;
        C13280 c13280M30341;
        C9217 c9217M34370;
        synchronized (this) {
            if (this.f42896 || this.f42891 || this.f42888) {
                throw new IllegalStateException("Fragment checkpoint is unavailable");
            }
            this.f42888 = true;
            c9217 = this.f42898;
            c14343 = this.f42899;
            bArrM32941 = c14343.m32941();
            c13280M30341 = this.f42897;
        }
        try {
            C7479 c7479M32942 = c14343.m32942((((long) bArrM32941.length) * 4) + X931RNG.BLOCK64_RESEED_MAX);
            if (c13280M30341 == null) {
                try {
                    c13280M30341 = C13280.m30341(interfaceC22097, this.f42884, new ByteArrayInputStream(bArrM32941), bArrM32941.length, bArrM32941.length, c3455);
                } catch (Throwable th) {
                    if (c7479M32942 == null) {
                        throw th;
                    }
                    try {
                        c7479M32942.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f42897 = c13280M30341;
                if (this.f42896) {
                    throw new CancellationException("Fragment checkpoint was discarded");
                }
            }
            C11150.m25681(interfaceC22097, this.f42890);
            long jM21233 = c9217.m21233(C9847.m23110(this.f42893, c13280M30341, this.f42884));
            synchronized (this) {
                this.f42891 = true;
            }
            if (c7479M32942 != null) {
                c7479M32942.close();
            }
            synchronized (this) {
                this.f42888 = false;
                c9217M34370 = (this.f42896 || this.f42891) ? m34370() : null;
            }
            if (c9217M34370 != null) {
                c9217M34370.close();
            }
            return jM21233;
        } catch (Throwable th3) {
            synchronized (this) {
                this.f42888 = false;
                c9217M34370 = (this.f42896 || this.f42891) ? m34370() : null;
                if (c9217M34370 != null) {
                    c9217M34370.close();
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final long m34373() {
        return this.f42894;
    }

    /* JADX INFO: renamed from: ۘ */
    public final UUID m34374() {
        return this.f42884;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C9217 c9217M34370;
        synchronized (this) {
            this.f42896 = true;
            c9217M34370 = !this.f42888 ? m34370() : null;
        }
        if (c9217M34370 != null) {
            c9217M34370.close();
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    private C9217 m34370() {
        C9217 c9217 = this.f42898;
        this.f42898 = null;
        this.f42893 = null;
        this.f42890 = null;
        C14343 c14343 = this.f42899;
        this.f42899 = null;
        if (c14343 != null) {
            c14343.close();
        }
        return c9217;
    }
}
