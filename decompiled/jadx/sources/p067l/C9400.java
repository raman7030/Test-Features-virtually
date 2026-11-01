package p067l;

/* JADX INFO: renamed from: l.۟ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class C9400 extends AbstractC12636 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8769 f25689;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9400(C8769 c8769) {
        super(c8769);
        this.f25689 = c8769;
    }

    @Override // p067l.AbstractC12636
    /* JADX INFO: renamed from: ۧ */
    public final C4848 mo21895(C3108 c3108, EnumC20544 enumC20544, AbstractC6462 abstractC6462, boolean z) {
        C20271 c20271 = new C20271();
        AbstractC6462 abstractC6462M5300 = c3108.m5300();
        C8769 c8769 = this.f25689;
        if (abstractC6462M5300 != null) {
            c20271.m45777(new C24705(c8769, c3108, enumC20544, new EnumC20544[0]));
        }
        c20271.m45777(new C15987(c8769, c3108, abstractC6462, enumC20544));
        if (z) {
            return c20271.m45783();
        }
        if (enumC20544 == EnumC20544.f63504) {
            c20271.m45777(new C22024(c8769, c3108, abstractC6462));
        }
        c20271.m45777(new C16144(c8769, c3108, abstractC6462, enumC20544));
        return c20271.m45783();
    }
}
