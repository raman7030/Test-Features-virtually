package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ܰ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C13699 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f40893;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f40894;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19598 f40895;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13699(C22372 c22372, ActivityC16315 activityC16315, ActivityC16315 activityC16316, DialogInterfaceC19598 dialogInterfaceC19598) {
        super(activityC16315, -1);
        this.f40894 = c22372;
        this.f40893 = activityC16316;
        this.f40895 = dialogInterfaceC19598;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strTrim = m31260().trim();
        C22372 c22372 = this.f40894;
        Bundle bundle = c22372.f5606;
        if (strTrim.isEmpty()) {
            strTrim = null;
        }
        if (strTrim == null) {
            bundle.remove("remark");
        } else {
            bundle.putString("remark", strTrim);
        }
        c22372.mo5408("remark");
        m31262();
        c22372.f72492 = null;
        C9344 c9344 = c22372.f5607;
        if (c9344 != null) {
            c9344.m24105(c22372.m50238());
        }
        this.f40893.m38450();
        DialogInterfaceC19598 dialogInterfaceC19598 = this.f40895;
        if (dialogInterfaceC19598 != null) {
            dialogInterfaceC19598.setTitle(c22372.m50239());
            dialogInterfaceC19598.show();
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ۖ */
    public final void mo31253() {
        DialogInterfaceC19598 dialogInterfaceC19598 = this.f40895;
        if (dialogInterfaceC19598 != null) {
            dialogInterfaceC19598.show();
        }
    }
}
