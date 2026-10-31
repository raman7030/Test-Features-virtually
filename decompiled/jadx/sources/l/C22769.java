package l;

/* JADX INFO: renamed from: l.᩺ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6S3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22769 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21605 f73520;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7247 f73522;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f73523;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C13596 f73524;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f73521 = -1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f73519 = -1;

    public C22769(C7247 c7247, C21605 c21605, C13596 c13596) {
        this.f73522 = c7247;
        this.f73520 = c21605;
        this.f73524 = c13596;
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C21605 m50847() {
        C21605 c21605;
        synchronized (this.f73522) {
            if (this.f73523 || this.f73522.f22245 != this || this.f73522.f22241 || this.f73522.f22240 != this.f73524) {
                throw new IllegalStateException("Recovery candidate has not been durably published");
            }
            this.f73523 = true;
            this.f73522.f22245 = null;
            c21605 = this.f73520;
        }
        return c21605;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f73522) {
            if (this.f73523) {
                return;
            }
            boolean z = true;
            this.f73523 = true;
            this.f73522.f22245 = null;
            if (this.f73522.f22241 || (this.f73522.f22240 != null && this.f73522.f22240.f40546.equals(this.f73524.f40546))) {
                z = false;
            }
            if (z) {
                C7247 c7247 = this.f73522;
                C13596 c13596 = this.f73524;
                C21605 c21605 = this.f73520;
                c21605.m48804().m10910((InterfaceC8017) new C15991(c7247, c13596, c21605));
            }
            this.f73520.close();
        }
    }
}
