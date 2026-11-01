package p067l;

import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: l.᩺ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes.dex */
public final class C24261 {

    /* JADX INFO: renamed from: ֫ */
    public C9509 f76870;

    /* JADX INFO: renamed from: ۧ */
    public boolean f76871;

    /* JADX INFO: renamed from: ܽ */
    public final int f76872;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C12688 f76873;

    /* JADX INFO: renamed from: ᩳ */
    public C9509 f76874;

    public C24261(C12688 c12688) {
        this.f76873 = c12688;
        this.f76872 = c12688.f35592;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53597(C13533 c13533) {
        if (this.f76871) {
            throw new IllegalStateException("Line builder is finished");
        }
        C9509 c9509 = this.f76874;
        if (c9509 != null && c9509.f26018 == 1024 && c9509 != null) {
            this.f76870 = C12688.m29186(this.f76870, c9509);
            this.f76874 = null;
        }
        if (this.f76874 == null) {
            this.f76874 = new C9509(8);
        }
        this.f76874.m22124(c13533);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53598() {
        C12688 c12688 = this.f76873;
        if (this.f76871) {
            return false;
        }
        this.f76871 = true;
        try {
            if (this.f76872 == c12688.f35592) {
                C9509 c9509 = this.f76874;
                if (c9509 != null) {
                    this.f76870 = C12688.m29186(this.f76870, c9509);
                    this.f76874 = null;
                }
                if (this.f76870 != null) {
                    c12688.f35591 = C12688.m29183(c12688.f35591, this.f76870);
                    c12688.f35592++;
                    this.f76874 = null;
                    this.f76870 = null;
                    return true;
                }
                this.f76874 = null;
                this.f76870 = null;
                return false;
            }
            throw new ConcurrentModificationException("Line table changed while building");
        } catch (Throwable th) {
            this.f76874 = null;
            this.f76870 = null;
            throw th;
        }
    }
}
