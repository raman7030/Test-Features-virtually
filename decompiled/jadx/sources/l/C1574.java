package l;

/* JADX INFO: renamed from: l.֫ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K434 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1574 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11576 f5577;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC10747 f5578;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14273 f5579;

    public C1574(C14273 c14273) {
        this.f5579 = c14273;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5391(C9378 c9378) {
        AbstractC12612 abstractC12612 = c9378.f28488;
        AbstractC10370 abstractC10370 = c9378.f28484;
        C14273 c14273 = this.f5579;
        if (abstractC12612 != null && abstractC10370 != c14273.f42980.f18867) {
            if (c14273.m33957(c9378.f28488, false) != null) {
                m5390(EnumC10747.VAR);
            } else {
                m5390(EnumC10747.EXPLICIT);
            }
        }
        if ((c9378.f28488 != null || abstractC10370 == c14273.f42980.f18867) && (c9378.f28488 == null || abstractC10370 != c14273.f42980.f18867)) {
            return;
        }
        m5390(EnumC10747.IMPLICIT);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5390(EnumC10747 enumC10747) {
        EnumC10747 enumC10748;
        EnumC10747 enumC10749 = this.f5578;
        if (enumC10749 == null) {
            this.f5578 = enumC10747;
            return;
        }
        if (enumC10749 == enumC10747 || enumC10749 == (enumC10748 = EnumC10747.ERROR)) {
            return;
        }
        this.f5578 = enumC10748;
        int i = enumC10749.f32374;
        EnumC10747 enumC107410 = EnumC10747.VAR;
        this.f5577 = (EnumC10637.f31985.m26686(this.f5579.f42983) || !(i == enumC107410.f32374 || enumC10747.f32374 == enumC107410.f32374)) ? C14273.f42978[enumC10749.f32374][enumC10747.f32374] : null;
    }
}
