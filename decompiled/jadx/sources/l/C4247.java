package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۘ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09F6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4247 extends C10971 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20993 f13772;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12216 f13773;

    public C4247(EnumC22094 enumC22094, C12216 c12216, long j, long j2, C20993 c20993, int i) {
        super(49, enumC22094, EnumC22799.SMB2_WRITE, j, j2, Math.min(i, c20993.mo23238()));
        this.f13773 = c12216;
        this.f13772 = c20993;
    }

    @Override // l.C16614
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8728(C0097 c0097) {
        c0097.m26086(this.f51046);
        c0097.m26086(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        c0097.m26088(m27283());
        C20993 c20993 = this.f13772;
        c0097.m26093(c20993.m24675());
        this.f13773.m29707(c0097);
        c0097.m26088(0L);
        c0097.m26088(Math.max(0, c20993.mo23238() - m27283()));
        c0097.m26086(0);
        c0097.m26086(0);
        c0097.m26088(0L);
        c20993.m24673(c0097, ((C23670) mo3028()).m52214());
    }

    @Override // l.AbstractC0803
    /* JADX INFO: renamed from: ܽ */
    public final int mo3029() {
        return m27283() + UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }
}
