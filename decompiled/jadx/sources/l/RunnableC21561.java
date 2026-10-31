package l;

/* JADX INFO: renamed from: l.᩸ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC21561 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f69274;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f69275;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f69276;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f69277;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f69278;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22266 f69279;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC6434 f69280;

    public /* synthetic */ RunnableC21561(C22266 c22266, EnumC6434 enumC6434, C2450 c2450, AbstractC15440 abstractC15440, long j, boolean z, boolean z2) {
        this.f69279 = c22266;
        this.f69280 = enumC6434;
        this.f69278 = c2450;
        this.f69275 = abstractC15440;
        this.f69274 = j;
        this.f69277 = z;
        this.f69276 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0994 c0994;
        EnumC6434 enumC6434 = EnumC6434.ZIP;
        C22266 c22266 = this.f69279;
        EnumC6434 enumC6435 = this.f69280;
        C2450 c2450 = this.f69278;
        AbstractC15440 abstractC15440 = this.f69275;
        long j = this.f69274;
        boolean z = this.f69277;
        if (enumC6435 == enumC6434) {
            int i = C15104.f46193;
            c0994 = new C0994(C17659.class);
            c0994.m3478(c2450.m7909());
            c0994.m3474("output", abstractC15440.mo23554());
            c0994.m3474("password", c22266.m47072());
            c0994.m3470(c22266.m47074(), "level");
            c0994.m3475("deleteSources", c22266.m47063());
            c0994.m3471(j, "splitSize");
            c0994.m3475("replaceExisting", z);
        } else if (enumC6435 == EnumC6434.SEVEN_ZIP) {
            int i2 = C15104.f46193;
            c0994 = new C0994(C10272.class);
            c0994.m3478(c2450.m7909());
            c0994.m3474("output", abstractC15440.mo23554());
            c0994.m3474("password", c22266.m47072());
            c0994.m3470(c22266.m47069(), "level");
            c0994.m3475("headerEncryption", c22266.m47070());
            c0994.m3475("deleteSources", c22266.m47063());
            c0994.m3471(j, "splitSize");
            c0994.m3475("replaceExisting", z);
        } else {
            int i3 = C15104.f46193;
            c0994 = new C0994(C2137.class);
            c0994.m3478(c2450.m7909());
            c0994.m3474("output", abstractC15440.mo23554());
            c0994.m3470(enumC6435.ordinal(), "format");
            c0994.m3470(c22266.m47073(), "level");
            c0994.m3475("deleteSources", c22266.m47063());
            c0994.m3475("replaceExisting", z);
        }
        c22266.m47060();
        C24009.m52847(c0994, c2450, this.f69276);
    }
}
