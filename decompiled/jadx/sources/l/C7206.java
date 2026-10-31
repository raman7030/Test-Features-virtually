package l;

import java.util.UUID;

/* JADX INFO: renamed from: l.۟ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7206 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23721 f22055;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final UUID f22056;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15007 f22057;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f22058;

    public C7206(C23721 c23721, C15007 c15007, UUID uuid, long j) {
        this.f22055 = c23721;
        this.f22057 = c15007;
        this.f22056 = uuid;
        this.f22058 = j;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m19288() {
        long j;
        synchronized (this.f22055) {
            j = m19284().f45764;
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final UUID m19289() {
        UUID uuid;
        synchronized (this.f22055) {
            m19284();
            uuid = this.f22056;
        }
        return uuid;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m19285() {
        byte[] bArr;
        synchronized (this.f22055) {
            bArr = (byte[]) m19284().f45763.f7359.clone();
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12704 m19287() {
        C12704 c12704;
        synchronized (this.f22055) {
            C12704 c12705 = m19284().f45762;
            c12704 = new C12704(c12705.m32420(), c12705.m30979());
        }
        return c12704;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m19286(byte[] bArr) {
        long j;
        synchronized (this.f22055) {
            this.f22055.m52325();
            this.f22055.m52318();
            C15007 c15007M19284 = m19284();
            if (c15007M19284.f45764 <= this.f22055.f76802) {
                throw new IllegalStateException("Checkpoint has been superseded");
            }
            C2267 c2267M7494 = C2267.m7494(this.f22055.f76801 == null ? null : this.f22055.f76801.f69370, bArr);
            try {
                C12704 c12704 = new C12704(c15007M19284.f45762.m32420(), c15007M19284.f45762.m30979());
                try {
                    this.f22055.f76806.m25280(new C15007(c12704, c2267M7494, c15007M19284.f45765, c15007M19284.f45766, c15007M19284.f45764), Math.max(1L, Math.max(this.f22058, bArr.length)));
                    this.f22055.f76802 = c15007M19284.f45764;
                    if (this.f22055.f76799 == c15007M19284.f45764) {
                        C2267 c2267 = this.f22055.f76820;
                        C23721 c23721 = this.f22055;
                        c2267M7494.m7497();
                        c23721.f76820 = c2267M7494;
                        c2267.close();
                        this.f22055.f76819 = 0L;
                    }
                    j = c15007M19284.f45764;
                    close();
                    c2267M7494.close();
                } catch (Error | RuntimeException e) {
                    c12704.close();
                    throw e;
                }
            } catch (Throwable th) {
                c2267M7494.close();
                throw th;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C15007 m19284() {
        C15007 c15007 = this.f22057;
        if (c15007 != null) {
            return c15007;
        }
        throw new IllegalStateException("Checkpoint is closed or already published");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f22055) {
            C15007 c15007 = this.f22057;
            this.f22057 = null;
            if (c15007 != null) {
                c15007.close();
            }
        }
    }
}
