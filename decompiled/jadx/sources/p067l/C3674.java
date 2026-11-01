package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3674 implements InterfaceC4720 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC4030 f7782;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ View f7783;

    public C3674(ActivityC4030 activityC4030, View view) {
        this.f7782 = activityC4030;
        this.f7783 = view;
    }

    @Override // p067l.InterfaceC4720
    /* JADX INFO: renamed from: ֫ */
    public final View mo7096() {
        return this.f7783.findViewById(R.id.MT_Protector);
    }

    @Override // p067l.InterfaceC4720
    /* JADX INFO: renamed from: ۧ */
    public final void mo7097() {
        ActivityC4030 activityC4030 = this.f7782;
        activityC4030.m8057();
        activityC4030.m8052();
    }
}
