package p067l;

/* JADX INFO: renamed from: l.᩻᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25178 {

    /* JADX INFO: renamed from: ֫ */
    public final C4848 f80536;

    /* JADX INFO: renamed from: ۧ */
    public final int f80537;

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC24413 f80538;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC7783 f80539;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C9085 f80540;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC25178 f80541;

    public AbstractC25178(C9085 c9085, AbstractC24413 abstractC24413) {
        this.f80540 = c9085;
        this.f80538 = abstractC24413;
        this.f80539 = c9085.m21010(true);
        this.f80537 = c9085.f24625.m10289() - 1;
        this.f80541 = c9085.m21025();
        C11097 c11097 = c9085.f24628;
        this.f80536 = c11097.f30760.m19462(c11097.f30760.m19435(c11097.f30756, c11097.f30758.f21725, abstractC24413.f77303, 1536L));
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m55243() {
        AbstractC6462 abstractC6462 = this.f80538.f77303;
        abstractC6462.getClass();
        return (abstractC6462 instanceof C7921) || m55242() || this.f80536.m10289() > 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m55242() {
        C11097 c11097 = this.f80540.f24628;
        if (c11097.f30748) {
            return true;
        }
        return c11097.f30760.m19467(c11097.f30747.f69169.f16705, this.f80538.f77303) != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m55241() {
        AbstractC12224 abstractC12224 = this.f80539.f20408;
        if (abstractC12224 == null) {
            return "null";
        }
        String string = abstractC12224.toString();
        if (string.equals("<clinit>")) {
            return "static";
        }
        return string.equals("<init>") ? "new" : string;
    }
}
