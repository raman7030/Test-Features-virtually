package p067l;

/* JADX INFO: renamed from: l.ۙۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6UK */
/* JADX INFO: loaded from: classes2.dex */
public final class C6574 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C11939 f16971;

    /* JADX INFO: renamed from: ۙ */
    public C22902 f16972;

    /* JADX INFO: renamed from: ᩶ */
    public final C22902 f16973;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f16974;

    /* JADX INFO: renamed from: ᩹ */
    public final C10558 f16975;

    public C6574(C11939 c11939, C10558 c10558, C22902 c22902) {
        this.f16971 = c11939;
        this.f16975 = c10558;
        this.f16973 = c22902;
        this.f16972 = c22902;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15011() {
        synchronized (this.f16971) {
            if (this.f16974) {
                throw new IllegalStateException("Recovery generation already installed");
            }
            this.f16974 = true;
            this.f16972 = this.f16971.f33241;
            this.f16971.f33241 = this.f16973;
            this.f16971.f33240 = this.f16975;
            this.f16971.f33232 = false;
            this.f16971.getClass();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C22902 c22902 = this.f16972;
        this.f16972 = null;
        if (c22902 != null) {
            c22902.m51159();
        }
    }
}
