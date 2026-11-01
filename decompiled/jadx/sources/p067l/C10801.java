package p067l;

/* JADX INFO: renamed from: l.ۡ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8TF */
/* JADX INFO: loaded from: classes3.dex */
public final class C10801 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f29935;

    /* JADX INFO: renamed from: ۧ */
    public boolean f29936;

    /* JADX INFO: renamed from: ܽ */
    public boolean f29937;

    /* JADX INFO: renamed from: ۧ */
    public final void m24897() {
        this.f29935 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24896(boolean z) {
        this.f29936 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24898(boolean z) {
        this.f29937 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17505 m24895() {
        if (!this.f29935 && (this.f29936 || this.f29937)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new C17505(this);
    }
}
