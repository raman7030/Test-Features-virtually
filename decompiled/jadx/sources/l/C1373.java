package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1373 implements InterfaceC2474 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1748 f5010;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f5011;

    public C1373(ActivityC1748 activityC1748, View view) {
        this.f5010 = activityC1748;
        this.f5011 = view;
    }

    @Override // l.InterfaceC2474
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View mo4858() {
        return this.f5011.findViewById(R.id.MT_Protector);
    }

    @Override // l.InterfaceC2474
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo4859() {
        ActivityC1748 activityC1748 = this.f5010;
        activityC1748.m5847();
        activityC1748.m5842();
    }
}
