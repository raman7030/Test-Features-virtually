package p067l;

/* JADX INFO: renamed from: l.ܺۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17434 {

    /* JADX INFO: renamed from: ᩻ */
    public static final C0878 f52104 = new C0878(C21265.f66817.f66888.m30927());

    /* JADX INFO: renamed from: ֫ */
    public boolean f52105;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 f52106;

    /* JADX INFO: renamed from: ܳ */
    public final String f52107;

    /* JADX INFO: renamed from: ܽ */
    public final C0878 f52108;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f52109;

    /* JADX INFO: renamed from: ᩳ */
    public final String f52110;

    public /* synthetic */ C17434(int i) {
        this();
    }

    public C17434() {
        this.f52106 = null;
        this.f52107 = "..";
        this.f52109 = true;
        this.f52110 = null;
        this.f52108 = f52104;
    }

    public C17434(AbstractC17043 abstractC17043) {
        this.f52106 = abstractC17043;
        this.f52107 = abstractC17043.getName();
        boolean zMo25087 = abstractC17043.mo25087();
        this.f52109 = zMo25087;
        StringBuilder sb = new StringBuilder();
        sb.append(C18794.m42823(abstractC17043.mo25091()));
        if (!zMo25087) {
            sb.append(EnumC2483.f3919);
            sb.append(C24158.m53411(abstractC17043.mo25101()));
        }
        this.f52110 = sb.toString();
        if (zMo25087) {
            this.f52108 = f52104;
        } else {
            this.f52108 = new C0878(C21265.f66833.f66888.m30927());
        }
    }
}
