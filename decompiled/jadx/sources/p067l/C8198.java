package p067l;

/* JADX INFO: renamed from: l.ۛܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A18X */
/* JADX INFO: loaded from: classes2.dex */
public final class C8198 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22481 f21632;

    /* JADX INFO: renamed from: ۧ */
    public C21199 f21633 = null;

    /* JADX INFO: renamed from: ܽ */
    public C21199 f21634 = null;

    public C8198(AbstractC22481 abstractC22481) {
        this.f21632 = abstractC22481;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:58:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: ֫ */
    public final C21199 m18987(C21199 c21199, C21199 c211910) {
        EnumC11752 enumC11752;
        this.f21633 = c21199;
        this.f21634 = null;
        int i = 0;
        AbstractC13152 abstractC13152M30131 = c211910;
        while (abstractC13152M30131 != null) {
            if (abstractC13152M30131 instanceof C21199) {
                C21199 c211911 = (C21199) abstractC13152M30131;
                if (this.f21632.mo5092(this.f21633, c211911)) {
                    this.f21634 = c211911;
                    enumC11752 = EnumC11752.STOP;
                } else {
                    enumC11752 = EnumC11752.CONTINUE;
                }
            } else {
                enumC11752 = EnumC11752.CONTINUE;
            }
            if (enumC11752 != EnumC11752.STOP) {
                if (enumC11752 == EnumC11752.CONTINUE && abstractC13152M30131.mo12957() > 0) {
                    abstractC13152M30131 = abstractC13152M30131.m30131(0);
                    i++;
                } else {
                    while (abstractC13152M30131.m30137() == null && i > 0) {
                        EnumC11752 enumC11753 = EnumC11752.CONTINUE;
                        if (enumC11752 == enumC11753 || enumC11752 == EnumC11752.SKIP_CHILDREN) {
                            if (enumC11753 != EnumC11752.STOP) {
                                enumC11752 = enumC11753;
                            }
                        }
                        AbstractC13152 abstractC13152M30129 = abstractC13152M30131.m30129();
                        i--;
                        if (enumC11752 == EnumC11752.REMOVE) {
                            abstractC13152M30131.m30135();
                        }
                        enumC11752 = enumC11753;
                        abstractC13152M30131 = abstractC13152M30129;
                    }
                    EnumC11752 enumC11754 = EnumC11752.CONTINUE;
                    if (enumC11752 == enumC11754 || enumC11752 == EnumC11752.SKIP_CHILDREN) {
                        if (enumC11754 != EnumC11752.STOP) {
                            enumC11752 = enumC11754;
                            if (abstractC13152M30131 == c211910) {
                                AbstractC13152 abstractC13152M30137 = abstractC13152M30131.m30137();
                                if (enumC11752 == EnumC11752.REMOVE) {
                                    abstractC13152M30131.m30135();
                                }
                                abstractC13152M30131 = abstractC13152M30137;
                            }
                        }
                    } else if (abstractC13152M30131 == c211910) {
                        AbstractC13152 abstractC13152M30138 = abstractC13152M30131.m30137();
                        if (enumC11752 == EnumC11752.REMOVE) {
                            abstractC13152M30131.m30135();
                        }
                        abstractC13152M30131 = abstractC13152M30138;
                    }
                }
            }
            return this.f21634;
        }
        EnumC11752 enumC11755 = EnumC11752.CONTINUE;
        return this.f21634;
    }
}
