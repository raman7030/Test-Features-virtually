package l;

/* JADX INFO: renamed from: l.ۛܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A18X */
/* JADX INFO: loaded from: classes2.dex */
public final class C6134 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21162 f18774;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19814 f18775 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19814 f18776 = null;

    public C6134(AbstractC21162 abstractC21162) {
        this.f18774 = abstractC21162;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:58:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19814 m17056(C19814 c19814, C19814 c19815) {
        EnumC9873 enumC9873;
        this.f18775 = c19814;
        this.f18776 = null;
        int i = 0;
        AbstractC11347 abstractC11347M28087 = c19815;
        while (abstractC11347M28087 != null) {
            if (abstractC11347M28087 instanceof C19814) {
                C19814 c19816 = (C19814) abstractC11347M28087;
                if (this.f18774.mo2753(this.f18775, c19816)) {
                    this.f18776 = c19816;
                    enumC9873 = EnumC9873.STOP;
                } else {
                    enumC9873 = EnumC9873.CONTINUE;
                }
            } else {
                enumC9873 = EnumC9873.CONTINUE;
            }
            if (enumC9873 != EnumC9873.STOP) {
                if (enumC9873 == EnumC9873.CONTINUE && abstractC11347M28087.mo10981() > 0) {
                    abstractC11347M28087 = abstractC11347M28087.m28087(0);
                    i++;
                } else {
                    while (abstractC11347M28087.m28093() == null && i > 0) {
                        EnumC9873 enumC9874 = EnumC9873.CONTINUE;
                        if (enumC9873 == enumC9874 || enumC9873 == EnumC9873.SKIP_CHILDREN) {
                            if (enumC9874 != EnumC9873.STOP) {
                                enumC9873 = enumC9874;
                            }
                        }
                        AbstractC11347 abstractC11347M28085 = abstractC11347M28087.m28085();
                        i--;
                        if (enumC9873 == EnumC9873.REMOVE) {
                            abstractC11347M28087.m28091();
                        }
                        enumC9873 = enumC9874;
                        abstractC11347M28087 = abstractC11347M28085;
                    }
                    EnumC9873 enumC9875 = EnumC9873.CONTINUE;
                    if (enumC9873 == enumC9875 || enumC9873 == EnumC9873.SKIP_CHILDREN) {
                        if (enumC9875 != EnumC9873.STOP) {
                            enumC9873 = enumC9875;
                            if (abstractC11347M28087 == c19815) {
                                AbstractC11347 abstractC11347M28093 = abstractC11347M28087.m28093();
                                if (enumC9873 == EnumC9873.REMOVE) {
                                    abstractC11347M28087.m28091();
                                }
                                abstractC11347M28087 = abstractC11347M28093;
                            }
                        }
                    } else if (abstractC11347M28087 == c19815) {
                        AbstractC11347 abstractC11347M28094 = abstractC11347M28087.m28093();
                        if (enumC9873 == EnumC9873.REMOVE) {
                            abstractC11347M28087.m28091();
                        }
                        abstractC11347M28087 = abstractC11347M28094;
                    }
                }
            }
            return this.f18776;
        }
        EnumC9873 enumC9876 = EnumC9873.CONTINUE;
        return this.f18776;
    }
}
