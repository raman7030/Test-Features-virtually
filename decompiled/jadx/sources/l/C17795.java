package l;

/* JADX INFO: renamed from: l.ᩳۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AID */
/* JADX INFO: loaded from: classes4.dex */
public final class C17795 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C2828 f54413 = C2828.ofMillis(C13132.FOREVER_NS);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2828 f54414;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2828 f54415;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f54416;

    public C17795(C2828 c2828, C2828 c2829, int i) {
        boolean zM31293 = C12856.m31293(c2828);
        C2828 c28210 = f54413;
        this.f54414 = zM31293 ? c2828 : c28210;
        this.f54415 = C12856.m31293(c2829) ? c2829 : c28210;
        this.f54416 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2828 m41728() {
        return this.f54414;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2828 m41729() {
        return this.f54415;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m41730() {
        return this.f54416;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EvictionConfig [idleEvictDuration=");
        sb.append(this.f54414);
        sb.append(", idleSoftEvictDuration=");
        sb.append(this.f54415);
        sb.append(", minIdle=");
        return C3200.m9831(this.f54416, "]", sb);
    }
}
