package p067l;

/* JADX INFO: renamed from: l.ۢۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11237 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC18612 f31254;

    /* JADX INFO: renamed from: ۧ */
    public static final C21966 f31255 = new C21966();

    static {
        AbstractC18612 abstractC18612 = null;
        try {
            int i = C24647.f78004;
            abstractC18612 = (AbstractC18612) C24647.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f31254 = abstractC18612;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C21966 m26031() {
        return f31255;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC18612 m26030() {
        AbstractC18612 abstractC18612 = f31254;
        if (abstractC18612 != null) {
            return abstractC18612;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
