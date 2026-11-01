package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.۬ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9HP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14805 extends C12795 {

    /* JADX INFO: renamed from: ۜ */
    public final boolean f42230;

    /* JADX INFO: renamed from: ۢ */
    public long f42231;

    /* JADX INFO: renamed from: ܳ */
    public final long f42232;

    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC11591 f42233;

    /* JADX INFO: renamed from: ᩻ */
    public final C13978 f42234;

    public C14805(EnumC23366 enumC23366, long j, long j2, long j3, C13978 c13978, AbstractC11591 abstractC11591, int i) {
        super(57, enumC23366, EnumC24036.SMB2_IOCTL, j, j2, Math.max(abstractC11591.mo25182(), i));
        this.f42232 = j3;
        this.f42234 = c13978;
        this.f42233 = abstractC11591;
        this.f42230 = true;
        this.f42231 = i;
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10795(C2460 c2460) {
        c2460.m28111(this.f54223);
        c2460.m3476();
        c2460.m28113(this.f42232);
        this.f42234.m31769(c2460);
        AbstractC11591 abstractC11591 = this.f42233;
        int iMo25182 = abstractC11591.mo25182();
        if (iMo25182 > 0) {
            c2460.m28113(UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
            c2460.m28113(iMo25182);
        } else {
            c2460.m28113(0L);
            c2460.m28113(0L);
        }
        c2460.m28113(0L);
        c2460.m28113(0L);
        c2460.m28113(0L);
        c2460.m28113(this.f42231);
        c2460.m28113(this.f42230 ? 1L : 0L);
        c2460.m3477();
        while (abstractC11591.mo25182() > 0) {
            abstractC11591.m26686(c2460);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long m33812() {
        return this.f42232;
    }
}
