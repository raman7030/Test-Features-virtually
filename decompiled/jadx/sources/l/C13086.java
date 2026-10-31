package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.۬ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9HP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13086 extends C10971 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f39182;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f39183;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f39184;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC9704 f39185;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12216 f39186;

    public C13086(EnumC22094 enumC22094, long j, long j2, long j3, C12216 c12216, AbstractC9704 abstractC9704, int i) {
        super(57, enumC22094, EnumC22799.SMB2_IOCTL, j, j2, Math.max(abstractC9704.mo23238(), i));
        this.f39184 = j3;
        this.f39186 = c12216;
        this.f39185 = abstractC9704;
        this.f39182 = true;
        this.f39183 = i;
    }

    @Override // l.C16614
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8728(C0097 c0097) {
        c0097.m26086(this.f51046);
        c0097.m1080();
        c0097.m26088(this.f39184);
        this.f39186.m29707(c0097);
        AbstractC9704 abstractC9704 = this.f39185;
        int iMo23238 = abstractC9704.mo23238();
        if (iMo23238 > 0) {
            c0097.m26088(UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
            c0097.m26088(iMo23238);
        } else {
            c0097.m26088(0L);
            c0097.m26088(0L);
        }
        c0097.m26088(0L);
        c0097.m26088(0L);
        c0097.m26088(0L);
        c0097.m26088(this.f39183);
        c0097.m26088(this.f39182 ? 1L : 0L);
        c0097.m1081();
        while (abstractC9704.mo23238() > 0) {
            abstractC9704.m24672(c0097);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m31722() {
        return this.f39184;
    }
}
