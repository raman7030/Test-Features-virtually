package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ܰ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C15388 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ ActivityC17874 f43974;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C23631 f43975;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ DialogInterfaceC1814 f43976;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15388(C23631 c23631, ActivityC17874 activityC17874, ActivityC17874 activityC17875, DialogInterfaceC1814 dialogInterfaceC1814) {
        super(activityC17874, -1);
        this.f43975 = c23631;
        this.f43974 = activityC17875;
        this.f43976 = dialogInterfaceC1814;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strTrim = m33346().trim();
        C23631 c23631 = this.f43975;
        Bundle bundle = c23631.f8386;
        if (strTrim.isEmpty()) {
            strTrim = null;
        }
        if (strTrim == null) {
            bundle.remove("remark");
        } else {
            bundle.putString("remark", strTrim);
        }
        c23631.mo7637("remark");
        m33348();
        c23631.f75217 = null;
        C11249 c11249 = c23631.f8387;
        if (c11249 != null) {
            c11249.m26114(c23631.m52578());
        }
        this.f43974.m40665();
        DialogInterfaceC1814 dialogInterfaceC1814 = this.f43976;
        if (dialogInterfaceC1814 != null) {
            dialogInterfaceC1814.setTitle(c23631.m52579());
            dialogInterfaceC1814.show();
        }
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ۖ */
    public final void mo33339() {
        DialogInterfaceC1814 dialogInterfaceC1814 = this.f43976;
        if (dialogInterfaceC1814 != null) {
            dialogInterfaceC1814.show();
        }
    }
}
