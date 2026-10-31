package l;

/* JADX INFO: renamed from: l.ۡۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N70B */
/* JADX INFO: loaded from: classes3.dex */
public final class C8596 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15650 f26249;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14986 f26250;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23097 f26251;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f26252;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18474 f26253;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f26254;

    public C8596(C18474 c18474, long j, C23097 c23097, C15650 c15650, C14986 c14986) {
        this.f26253 = c18474;
        this.f26254 = j;
        this.f26251 = c23097;
        this.f26249 = c15650;
        this.f26250 = c14986;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22310(C8596 c8596, C18474 c18474, boolean z) {
        synchronized (c8596) {
            if (c8596.f26253 != c18474) {
                throw new IllegalArgumentException("Syntax request belongs to another session");
            }
            if (z != (c8596.f26249 != null)) {
                throw new IllegalArgumentException("Syntax request type does not match construction");
            }
            if (c8596.f26252) {
                throw new IllegalStateException("Syntax request was already constructed");
            }
            c8596.f26252 = true;
        }
    }
}
