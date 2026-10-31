package l;

/* JADX INFO: renamed from: l.ܺۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15852 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C0734 f48966 = new C0734(C19883.f64181.f64252.m28878());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f48967;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f48968;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f48969;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0734 f48970;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f48971;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f48972;

    public /* synthetic */ C15852(int i) {
        this();
    }

    public C15852() {
        this.f48968 = null;
        this.f48969 = "..";
        this.f48971 = true;
        this.f48972 = null;
        this.f48970 = f48966;
    }

    public C15852(AbstractC15440 abstractC15440) {
        this.f48968 = abstractC15440;
        this.f48969 = abstractC15440.getName();
        boolean zMo23113 = abstractC15440.mo23113();
        this.f48971 = zMo23113;
        StringBuilder sb = new StringBuilder();
        sb.append(C17283.m40572(abstractC15440.mo23117()));
        if (!zMo23113) {
            sb.append(EnumC0121.f1143);
            sb.append(C22927.m51020(abstractC15440.mo23127()));
        }
        this.f48972 = sb.toString();
        if (zMo23113) {
            this.f48970 = f48966;
        } else {
            this.f48970 = new C0734(C19883.f64197.f64252.m28878());
        }
    }
}
