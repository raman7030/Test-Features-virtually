package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.۠᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8429 extends C13802 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1748 f25821;

    public C8429(ActivityC1748 activityC1748) {
        this.f25821 = activityC1748;
    }

    @Override // l.C13802
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22095(ResultCallback resultCallback) {
        ActivityC1748 activityC1748 = this.f25821;
        if (activityC1748.f6067.f40731.booleanValue()) {
            super.mo22095(resultCallback);
        } else {
            ActivityC1748.m5839(activityC1748, true, false, resultCallback);
        }
    }

    @Override // l.C13802
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo22097() {
        ActivityC1748 activityC1748 = this.f25821;
        return !activityC1748.f6067.f40731.booleanValue() && activityC1748.f6064.m20096().m30297();
    }

    @Override // l.C13802
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo22096() {
        ActivityC1748 activityC1748 = this.f25821;
        if (activityC1748.f6067.f40727 == null && activityC1748.f6067.f40732 != null) {
            return activityC1748.f6067.f40732.mo23554();
        }
        return null;
    }

    @Override // l.C13802
    /* JADX INFO: renamed from: ۧ */
    public final String mo8403() {
        ActivityC1748 activityC1748 = this.f25821;
        if (activityC1748.f6067.f40727 != null) {
            return activityC1748.f6067.f40727;
        }
        return activityC1748.f6067.f40732 != null ? activityC1748.f6067.f40732.getName() : "";
    }
}
