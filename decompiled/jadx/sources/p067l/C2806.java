package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.֡ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2806 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractActivityC5549 f4795;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ String f4796;

    /* JADX INFO: renamed from: ܳ */
    public String f4797;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f4798;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ViewOnClickListenerC22924 f4799;

    public C2806(ViewOnClickListenerC22924 viewOnClickListenerC22924, AbstractActivityC5549 abstractActivityC5549, String str, String str2) {
        this.f4799 = viewOnClickListenerC22924;
        this.f4795 = abstractActivityC5549;
        this.f4798 = str;
        this.f4796 = str2;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f4795, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3870, IOException {
        String strM38647 = C18524.m42109(this.f4798, new String[0]).m38647();
        this.f4797 = strM38647;
        C21976.m49530(strM38647);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f4799.m51215(R.string.MT_Protector, this.f4796, this.f4797);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f4795.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
