package p067l;

/* JADX INFO: renamed from: l.ᩳۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AID */
/* JADX INFO: loaded from: classes4.dex */
public final class C19280 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C5057 f57609 = C5057.ofMillis(C14849.FOREVER_NS);

    /* JADX INFO: renamed from: ֫ */
    public final C5057 f57610;

    /* JADX INFO: renamed from: ۧ */
    public final C5057 f57611;

    /* JADX INFO: renamed from: ܽ */
    public final int f57612;

    public C19280(C5057 c5057, C5057 c5058, int i) {
        boolean zM33379 = C14586.m33379(c5057);
        C5057 c5059 = f57609;
        this.f57610 = zM33379 ? c5057 : c5059;
        this.f57611 = C14586.m33379(c5058) ? c5058 : c5059;
        this.f57612 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5057 m43974() {
        return this.f57610;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C5057 m43975() {
        return this.f57611;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m43976() {
        return this.f57612;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EvictionConfig [idleEvictDuration=");
        sb.append(this.f57610);
        sb.append(", idleSoftEvictDuration=");
        sb.append(this.f57611);
        sb.append(", minIdle=");
        return C5410.m11876(this.f57612, "]", sb);
    }
}
