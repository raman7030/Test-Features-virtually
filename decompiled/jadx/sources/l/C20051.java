package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20051 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9170 f64963;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f64964;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7744 f64965;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f64966;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C18258 f64967;

    public C20051(C22372 c22372, ActivityC16315 activityC16315) {
        this.f64966 = c22372;
        this.f64964 = activityC16315;
        this.f64963 = C9170.m23579(c22372.getViewLifecycleOwner());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f64965 = this.f64966.f72517.m30436().mo26562();
        m20266(this.f64964);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C7744 c7744 = this.f64965;
        try {
            this.f64967 = C2405.m7781("", C10755.m26959(c7744.toString()), ApplicationC20075.f65008.mo18251((byte) 0, "dex_decompile_engine"));
            c7744.close();
        } catch (Throwable th) {
            if (c7744 != null) {
                try {
                    c7744.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f64963.m23581()) {
            C22372 c22372 = this.f64966;
            if (!c22372.f72508 || c22372.isDetached() || c22372.m5414()) {
                return;
            }
            if (!this.f64967.f56780.m52607()) {
                C23881 c23881 = this.f64967.f56780;
                c23881.getClass();
                this.f64964.m10221(C1575.m5392(c23881, R.string.MT_Protector), false);
                return;
            }
            ActivityC14946.m35400(c22372.f72509, this.f64967, c22372.m5420().m10173() + ".java");
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f64963.m23581()) {
            C22372 c22372 = this.f64966;
            if (!c22372.f72508 || c22372.isDetached() || c22372.m5414()) {
                return;
            }
            c22372.m50144(exc, this.f64964);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C7744 c7744 = this.f64965;
        if (c7744 != null) {
            c7744.close();
        }
        m20273();
    }
}
