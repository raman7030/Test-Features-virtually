package p067l;

/* JADX INFO: renamed from: l.۫ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14001 implements InterfaceC11235 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C18418 f39508;

    public C14001(C18418 c18418) {
        this.f39508 = c18418;
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26029(C19281 c19281) {
        C18418 c18418 = this.f39508;
        C14080 c14080 = c18418.f55005;
        C16525 c16525 = c18418.f55019;
        AbstractC6462 abstractC6462 = c19281.f29256;
        Object obj = c19281.f57613;
        if (abstractC6462.mo5577() == EnumC11353.CLASS) {
            C1446.m31704(obj instanceof String);
            c16525.m37500(115);
            c16525.m37503(C14750.m33698(c14080.f39897, c18418.f55022.f21738.m32717((String) obj)));
            return;
        }
        switch (C14671.f41883[abstractC6462.mo5577().ordinal()]) {
            case 1:
                c16525.m37500(66);
                break;
            case 2:
                c16525.m37500(67);
                break;
            case 3:
                c16525.m37500(83);
                break;
            case 4:
                c16525.m37500(73);
                break;
            case 5:
                c16525.m37500(74);
                break;
            case 6:
                c16525.m37500(70);
                break;
            case 7:
                c16525.m37500(68);
                break;
            case 8:
                c16525.m37500(90);
                break;
            default:
                throw new AssertionError(abstractC6462);
        }
        c16525.m37503(c14080.m31948(obj));
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26028(C18610 c18610) {
        C18418 c18418 = this.f39508;
        C16525 c16525 = c18418.f55019;
        c16525.m37500(101);
        C14080 c14080 = c18418.f55005;
        C13818 c13818 = c18610.f55580;
        c16525.m37503(c14080.m31953(c13818.f20406));
        c16525.m37503(C14750.m33698(c14080.f39897, c13818.f20408));
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26025(C12576 c12576) {
        C18418 c18418 = this.f39508;
        C16525 c16525 = c18418.f55019;
        c16525.m37500(99);
        c16525.m37503(c18418.f55005.m31953(c12576.f35337));
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26027(C17939 c17939) {
        C18418 c18418 = this.f39508;
        c18418.f55019.m37500(64);
        c18418.m41954(c17939);
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26026(C15927 c15927) {
        throw new AssertionError(c15927);
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26024(C3858 c3858) {
        C16525 c16525 = this.f39508.f55019;
        c16525.m37500(91);
        AbstractC10564[] abstractC10564Arr = c3858.f8345;
        c16525.m37503(abstractC10564Arr.length);
        for (AbstractC10564 abstractC10564 : abstractC10564Arr) {
            abstractC10564.mo7611(this);
        }
    }
}
