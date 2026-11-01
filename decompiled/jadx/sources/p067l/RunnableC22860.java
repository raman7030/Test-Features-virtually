package p067l;

/* JADX INFO: renamed from: l.᩸ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC22860 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ long f71976;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ AbstractC17043 f71977;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ boolean f71978;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ boolean f71979;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C4697 f71980;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23530 f71981;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ EnumC8483 f71982;

    public /* synthetic */ RunnableC22860(C23530 c23530, EnumC8483 enumC8483, C4697 c4697, AbstractC17043 abstractC17043, long j, boolean z, boolean z2) {
        this.f71981 = c23530;
        this.f71982 = enumC8483;
        this.f71980 = c4697;
        this.f71977 = abstractC17043;
        this.f71976 = j;
        this.f71979 = z;
        this.f71978 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3313 c3313;
        EnumC8483 enumC8483 = EnumC8483.ZIP;
        C23530 c23530 = this.f71981;
        EnumC8483 enumC8484 = this.f71982;
        C4697 c4697 = this.f71980;
        AbstractC17043 abstractC17043 = this.f71977;
        long j = this.f71976;
        boolean z = this.f71979;
        if (enumC8484 == enumC8483) {
            int i = C16723.f49313;
            c3313 = new C3313(C19152.class);
            c3313.m5781(c4697.m9957());
            c3313.m5777("output", abstractC17043.mo25505());
            c3313.m5777("password", c23530.m49395());
            c3313.m5773(c23530.m49397(), "level");
            c3313.m5778("deleteSources", c23530.m49386());
            c3313.m5774(j, "splitSize");
            c3313.m5778("replaceExisting", z);
        } else if (enumC8484 == EnumC8483.SEVEN_ZIP) {
            int i2 = C16723.f49313;
            c3313 = new C3313(C12131.class);
            c3313.m5781(c4697.m9957());
            c3313.m5777("output", abstractC17043.mo25505());
            c3313.m5777("password", c23530.m49395());
            c3313.m5773(c23530.m49392(), "level");
            c3313.m5778("headerEncryption", c23530.m49393());
            c3313.m5778("deleteSources", c23530.m49386());
            c3313.m5774(j, "splitSize");
            c3313.m5778("replaceExisting", z);
        } else {
            int i3 = C16723.f49313;
            c3313 = new C3313(C4400.class);
            c3313.m5781(c4697.m9957());
            c3313.m5777("output", abstractC17043.mo25505());
            c3313.m5773(enumC8484.ordinal(), "format");
            c3313.m5773(c23530.m49396(), "level");
            c3313.m5778("deleteSources", c23530.m49386());
            c3313.m5778("replaceExisting", z);
        }
        c23530.m49383();
        C25187.m55253(c3313, c4697, this.f71978);
    }
}
