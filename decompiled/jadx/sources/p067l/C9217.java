package p067l;

import java.util.UUID;

/* JADX INFO: renamed from: l.۟ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9217 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C24913 f24932;

    /* JADX INFO: renamed from: ᩶ */
    public final UUID f24933;

    /* JADX INFO: renamed from: ᩸ */
    public C16631 f24934;

    /* JADX INFO: renamed from: ᩹ */
    public final long f24935;

    public C9217(C24913 c24913, C16631 c16631, UUID uuid, long j) {
        this.f24932 = c24913;
        this.f24934 = c16631;
        this.f24933 = uuid;
        this.f24935 = j;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m21235() {
        long j;
        synchronized (this.f24932) {
            j = m21231().f48877;
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final UUID m21236() {
        UUID uuid;
        synchronized (this.f24932) {
            m21231();
            uuid = this.f24933;
        }
        return uuid;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m21232() {
        byte[] bArr;
        synchronized (this.f24932) {
            bArr = (byte[]) m21231().f48876.f10147.clone();
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C14443 m21234() {
        C14443 c14443;
        synchronized (this.f24932) {
            C14443 c14444 = m21231().f48875;
            c14443 = new C14443(c14444.m34522(), c14444.m33057());
        }
        return c14443;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m21233(byte[] bArr) {
        long j;
        synchronized (this.f24932) {
            this.f24932.m54728();
            this.f24932.m54721();
            C16631 c16631M21231 = m21231();
            if (c16631M21231.f48877 <= this.f24932.f79551) {
                throw new IllegalStateException("Checkpoint has been superseded");
            }
            C4523 c4523M9576 = C4523.m9576(this.f24932.f79550 == null ? null : this.f24932.f79550.f72073, bArr);
            try {
                C14443 c14443 = new C14443(c16631M21231.f48875.m34522(), c16631M21231.f48875.m33057());
                try {
                    this.f24932.f79555.m27297(new C16631(c14443, c4523M9576, c16631M21231.f48878, c16631M21231.f48879, c16631M21231.f48877), Math.max(1L, Math.max(this.f24935, bArr.length)));
                    this.f24932.f79551 = c16631M21231.f48877;
                    if (this.f24932.f79548 == c16631M21231.f48877) {
                        C4523 c4523 = this.f24932.f79569;
                        C24913 c24913 = this.f24932;
                        c4523M9576.m9579();
                        c24913.f79569 = c4523M9576;
                        c4523.close();
                        this.f24932.f79568 = 0L;
                    }
                    j = c16631M21231.f48877;
                    close();
                    c4523M9576.close();
                } catch (Error | RuntimeException e) {
                    c14443.close();
                    throw e;
                }
            } catch (Throwable th) {
                c4523M9576.close();
                throw th;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩻ */
    private C16631 m21231() {
        C16631 c16631 = this.f24934;
        if (c16631 != null) {
            return c16631;
        }
        throw new IllegalStateException("Checkpoint is closed or already published");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f24932) {
            C16631 c16631 = this.f24934;
            this.f24934 = null;
            if (c16631 != null) {
                c16631.close();
            }
        }
    }
}
