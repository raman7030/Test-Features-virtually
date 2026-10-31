package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C22167 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9170 f71939;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f71940;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7744 f71941;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f71942;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C18258 f71943;

    public C22167(C22372 c22372, ActivityC16315 activityC16315) {
        this.f71942 = c22372;
        this.f71940 = activityC16315;
        this.f71939 = C9170.m23579(c22372.getViewLifecycleOwner());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f71941 = this.f71942.f72517.m30436().mo26562();
        m20266(this.f71940);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C7744 c7744 = this.f71941;
        try {
            String string = c7744.toString();
            C19562 c19562 = new C19562();
            c19562.f63232 = 28;
            C19357 c19357 = new C19357(C7897.m21184(28));
            C9684.m24627(string, c19357, c19562);
            C21473 c21473 = new C21473();
            c19357.m48534(c21473);
            this.f71943 = C2405.m7781("", c21473.m48624(), ApplicationC20075.f65008.mo18251((byte) 0, "dex_decompile_engine"));
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
        if (this.f71939.m23581()) {
            C22372 c22372 = this.f71942;
            if (!c22372.f72508 || c22372.isDetached() || c22372.m5414()) {
                return;
            }
            if (!this.f71943.f56780.m52607()) {
                C23881 c23881 = this.f71943.f56780;
                c23881.getClass();
                this.f71940.m10221(C1575.m5392(c23881, R.string.MT_Protector), false);
                return;
            }
            ActivityC14946.m35400(c22372.f72509, this.f71943, c22372.m5420().m10173() + ".java");
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f71939.m23581()) {
            C22372 c22372 = this.f71942;
            if (!c22372.f72508 || c22372.isDetached() || c22372.m5414()) {
                return;
            }
            c22372.m50144(exc, this.f71940);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C7744 c7744 = this.f71941;
        if (c7744 != null) {
            c7744.close();
        }
        m20273();
    }
}
