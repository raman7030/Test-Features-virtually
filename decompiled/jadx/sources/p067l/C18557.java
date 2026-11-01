package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18557 extends AbstractC19484 {

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C23663 f55391;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18557(C23663 c23663, AbstractC12224 abstractC12224, AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849) {
        super(c23663, abstractC12224, abstractC6462, c4848, c4849);
        this.f55391 = c23663;
    }

    @Override // p067l.AbstractC19484
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7783 mo19776(C4036 c4036, EnumC18298 enumC18298) {
        AbstractC6462 abstractC6462 = this.f6711;
        enumC18298.m41671();
        return this.f55391.m52646(c4036, abstractC6462, this.f6709, this.f6707, this.f6710, enumC18298.m41672());
    }

    @Override // p067l.AbstractC19484, p067l.AbstractC3390
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo5929(C4036 c4036, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC7783 abstractC7784) {
        if (abstractC7784.f20405.m6625()) {
            return super.mo5929(c4036, interfaceC5323, abstractC7783, abstractC7784);
        }
        C5771 c5771 = (C5771) abstractC7784;
        if ((c5771.f20409 & 70368744177664L) == 0) {
            return abstractC7784;
        }
        ((C10545) c4036.f8849).f29204 = EnumC18298.f54636;
        C23663 c23663 = this.f55391;
        C8769 c8769 = c23663.f75312;
        C14119 c14119 = c23663.f75305;
        C22004 c22004 = c8769.f23796;
        AbstractC6462 abstractC6462Mo14787 = c5771.f20406.mo14787();
        int i = C3918.f8504[c4036.f8848.f8850.mo3383().ordinal()];
        if (i == 1) {
            C19327 c19327 = (C19327) c4036.f8848.f8850;
            if (C9268.m21424(c19327.f57710) == c4036.f8850) {
                abstractC6462Mo14787 = c19327.f57709.f18925;
            }
        } else if (i == 2 && C9268.m21424(((C12344) c4036.f8848.f8850).f34446) == c4036.f8850) {
            abstractC6462Mo14787 = c22004.f69183;
        }
        return c23663.m52658(abstractC7784, new C12497(this.f6707.m10287((Function) new C16657(c8769, c5771, c14119.f40077)), abstractC6462Mo14787, c5771.f20406.mo14794(), c22004.f69163));
    }
}
