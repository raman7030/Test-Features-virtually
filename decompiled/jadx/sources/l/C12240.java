package l;

/* JADX INFO: renamed from: l.۫ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12240 implements InterfaceC9330 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16887 f36491;

    public C12240(C16887 c16887) {
        this.f36491 = c16887;
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24020(C17796 c17796) {
        C16887 c16887 = this.f36491;
        C12323 c12323 = c16887.f51824;
        C14896 c14896 = c16887.f51838;
        AbstractC4308 abstractC4308 = c17796.f26338;
        Object obj = c17796.f54417;
        if (abstractC4308.mo3258() == EnumC9454.CLASS) {
            C12171.m29642(obj instanceof String);
            c14896.m35348(115);
            c14896.m35351(C13028.m31613(c12323.f36883, c16887.f51841.f18880.m30652((String) obj)));
            return;
        }
        switch (C12945.f38839[abstractC4308.mo3258().ordinal()]) {
            case 1:
                c14896.m35348(66);
                break;
            case 2:
                c14896.m35348(67);
                break;
            case 3:
                c14896.m35348(83);
                break;
            case 4:
                c14896.m35348(73);
                break;
            case 5:
                c14896.m35348(74);
                break;
            case 6:
                c14896.m35348(70);
                break;
            case 7:
                c14896.m35348(68);
                break;
            case 8:
                c14896.m35348(90);
                break;
            default:
                throw new AssertionError(abstractC4308);
        }
        c14896.m35351(c12323.m29888(obj));
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24019(C17090 c17090) {
        C16887 c16887 = this.f36491;
        C14896 c14896 = c16887.f51838;
        c14896.m35348(101);
        C12323 c12323 = c16887.f51824;
        C12048 c12048 = c17090.f52397;
        c14896.m35351(c12323.m29893(c12048.f17560));
        c14896.m35351(C13028.m31613(c12323.f36883, c12048.f17562));
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24016(C10741 c10741) {
        C16887 c16887 = this.f36491;
        C14896 c14896 = c16887.f51838;
        c14896.m35348(99);
        c14896.m35351(c16887.f51824.m29893(c10741.f32362));
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24018(C16384 c16384) {
        C16887 c16887 = this.f36491;
        c16887.f51838.m35348(64);
        c16887.m39713(c16384);
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24017(C14267 c14267) {
        throw new AssertionError(c14267);
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24015(C1568 c1568) {
        C14896 c14896 = this.f36491.f51838;
        c14896.m35348(91);
        AbstractC8624[] abstractC8624Arr = c1568.f5564;
        c14896.m35351(abstractC8624Arr.length);
        for (AbstractC8624 abstractC8624 : abstractC8624Arr) {
            abstractC8624.mo5382(this);
        }
    }
}
