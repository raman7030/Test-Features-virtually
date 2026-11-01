package p067l;

import bin.p000mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.۠᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10380 extends C15486 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ ActivityC4030 f28734;

    public C10380(ActivityC4030 activityC4030) {
        this.f28734 = activityC4030;
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ֫ */
    public final void mo24065(ResultCallback resultCallback) {
        ActivityC4030 activityC4030 = this.f28734;
        if (activityC4030.f8843.f43812.booleanValue()) {
            super.mo24065(resultCallback);
        } else {
            ActivityC4030.m8049(activityC4030, true, false, resultCallback);
        }
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo24067() {
        ActivityC4030 activityC4030 = this.f28734;
        return !activityC4030.f8843.f43812.booleanValue() && activityC4030.f8840.m22071().m32361();
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ܽ */
    public final String mo24066() {
        ActivityC4030 activityC4030 = this.f28734;
        if (activityC4030.f8843.f43808 == null && activityC4030.f8843.f43813 != null) {
            return activityC4030.f8843.f43813.mo25505();
        }
        return null;
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ۧ */
    public final String mo10449() {
        ActivityC4030 activityC4030 = this.f28734;
        if (activityC4030.f8843.f43808 != null) {
            return activityC4030.f8843.f43808;
        }
        return activityC4030.f8843.f43813 != null ? activityC4030.f8843.f43813.getName() : "";
    }
}
