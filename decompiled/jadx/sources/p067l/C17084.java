package p067l;

import bin.p000mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ܶ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17084 extends C15486 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ ActivityC4030 f50494;

    public C17084(ActivityC4030 activityC4030) {
        this.f50494 = activityC4030;
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ֫ */
    public final void mo24065(ResultCallback resultCallback) {
        ActivityC4030 activityC4030 = this.f50494;
        if (activityC4030.f8828.f43812.booleanValue()) {
            super.mo24065(resultCallback);
        } else {
            ActivityC4030.m8049(activityC4030, false, true, resultCallback);
        }
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo24067() {
        ActivityC4030 activityC4030 = this.f50494;
        return !activityC4030.f8828.f43812.booleanValue() && activityC4030.f8840.m22052().m32361();
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ܽ */
    public final String mo24066() {
        ActivityC4030 activityC4030 = this.f50494;
        if (activityC4030.f8828.f43808 == null && activityC4030.f8828.f43813 != null) {
            return activityC4030.f8828.f43813.mo25505();
        }
        return null;
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ۧ */
    public final String mo10449() {
        ActivityC4030 activityC4030 = this.f50494;
        if (activityC4030.f8828.f43808 != null) {
            return activityC4030.f8828.f43808;
        }
        return activityC4030.f8828.f43813 != null ? activityC4030.f8828.f43813.getName() : "";
    }
}
