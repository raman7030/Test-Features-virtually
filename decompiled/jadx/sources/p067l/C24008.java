package p067l;

/* JADX INFO: renamed from: l.᩺ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6S3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24008 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ */
    public final C22902 f76246;

    /* JADX INFO: renamed from: ᩶ */
    public final C9256 f76248;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f76249;

    /* JADX INFO: renamed from: ᩹ */
    public C15290 f76250;

    /* JADX INFO: renamed from: ۬ */
    public long f76247 = -1;

    /* JADX INFO: renamed from: ۗ */
    public long f76245 = -1;

    public C24008(C9256 c9256, C22902 c22902, C15290 c15290) {
        this.f76248 = c9256;
        this.f76246 = c22902;
        this.f76250 = c15290;
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final C22902 m53180() {
        C22902 c22902;
        synchronized (this.f76248) {
            if (this.f76249 || this.f76248.f25127 != this || this.f76248.f25123 || this.f76248.f25122 != this.f76250) {
                throw new IllegalStateException("Recovery candidate has not been durably published");
            }
            this.f76249 = true;
            this.f76248.f25127 = null;
            c22902 = this.f76246;
        }
        return c22902;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f76248) {
            if (this.f76249) {
                return;
            }
            boolean z = true;
            this.f76249 = true;
            this.f76248.f25127 = null;
            if (this.f76248.f25123 || (this.f76248.f25122 != null && this.f76248.f25122.f43622.equals(this.f76250.f43622))) {
                z = false;
            }
            if (z) {
                C9256 c9256 = this.f76248;
                C15290 c15290 = this.f76250;
                C22902 c22902 = this.f76246;
                c22902.m51151().m12887((InterfaceC9988) new C17566(c9256, c15290, c22902));
            }
            this.f76246.close();
        }
    }
}
