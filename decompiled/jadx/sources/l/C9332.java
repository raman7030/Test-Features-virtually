package l;

/* JADX INFO: renamed from: l.ۢۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9332 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC17092 f28304;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C20621 f28305 = new C20621();

    static {
        AbstractC17092 abstractC17092 = null;
        try {
            int i = C23442.f75256;
            abstractC17092 = (AbstractC17092) C23442.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f28304 = abstractC17092;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C20621 m24022() {
        return f28305;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC17092 m24021() {
        AbstractC17092 abstractC17092 = f28304;
        if (abstractC17092 != null) {
            return abstractC17092;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
