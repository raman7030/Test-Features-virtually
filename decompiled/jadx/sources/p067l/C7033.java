package p067l;

/* JADX INFO: renamed from: l.ۙ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C7033 extends C3680 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C5692 f18328;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC6462 f18329;

    /* JADX INFO: renamed from: ᩹ */
    public C21333 f18330;

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        EnumC11728 enumC11728 = (EnumC11728) obj;
        C5692 c5692 = this.f18328;
        C8374 c8374 = c5692.f13886;
        C22004 c22004 = c8374.f22480;
        AbstractC6462 abstractC6462 = c8374.f22480.f69204;
        EnumC17268 enumC17268 = c21215.f66702;
        int i = C12889.f36248[enumC17268.ordinal()];
        if (i == 1) {
            AbstractC6462 abstractC6463 = c21215.f66703;
            abstractC6463.getClass();
            abstractC6462 = (AbstractC6462) abstractC6463.mo5291(c5692, enumC11728);
            if (abstractC6462.m14777(EnumC11353.BOT)) {
                return c22004.f69204;
            }
        } else if (i == 2) {
            AbstractC6462 abstractC6464 = c21215.f66703;
            EnumC11728 enumC11728Mo20948 = enumC11728.mo20948();
            abstractC6464.getClass();
            abstractC6462 = (AbstractC6462) abstractC6464.mo5291(c5692, enumC11728Mo20948);
            if (abstractC6462.m14777(EnumC11353.BOT)) {
                abstractC6462 = c22004.f69208;
                enumC17268 = EnumC17268.UNBOUND;
            }
        }
        return new C21786(abstractC6462, enumC17268, c5692.f13886.f22480.f69162);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    @Override // p067l.C4351, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final AbstractC6462 mo4507(AbstractC6462 abstractC6462, EnumC11728 enumC11728) {
        EnumC17268 enumC17268;
        C5692 c5692 = this.f18328;
        C8374 c8374 = c5692.f13886;
        Object obj = EnumC11728.f32763;
        if (enumC11728 == obj) {
            return c8374.f22480.f69204;
        }
        Object obj2 = EnumC11728.f32761;
        abstractC6462.getClass();
        AbstractC6462 abstractC6463 = (AbstractC6462) abstractC6462.mo5291(c5692, obj2);
        AbstractC6462 abstractC6464 = (AbstractC6462) abstractC6462.mo5291(c5692, obj);
        C4848 c4848Mo14802 = this.f18330.f16705.f20406.mo14802();
        if (!c8374.m19490(abstractC6463, c8374.f22480.f69208)) {
            AbstractC6462 abstractC6465 = this.f18329;
            if (abstractC6465.m14792(c4848Mo14802) || !c8374.m19486(abstractC6465, abstractC6463, true)) {
                enumC17268 = EnumC17268.EXTENDS;
            } else if (!abstractC6464.m14777(EnumC11353.BOT)) {
                abstractC6463 = abstractC6464;
                enumC17268 = EnumC17268.SUPER;
            } else {
                abstractC6463 = c8374.f22480.f69208;
                enumC17268 = EnumC17268.UNBOUND;
            }
        } else if (!abstractC6464.m14777(EnumC11353.BOT)) {
            abstractC6463 = abstractC6464;
            enumC17268 = EnumC17268.SUPER;
        } else {
            abstractC6463 = c8374.f22480.f69208;
            enumC17268 = EnumC17268.UNBOUND;
        }
        return new C21786(abstractC6463, enumC17268, c5692.f13886.f22480.f69162);
    }

    public C7033(C5692 c5692, C21333 c21333, AbstractC6462 abstractC6462) {
        this.f18328 = c5692;
        this.f18330 = c21333;
        this.f18329 = abstractC6462;
    }
}
