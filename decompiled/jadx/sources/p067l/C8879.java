package p067l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۜܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8879 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final C11084 f24070;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ AbstractC17043 f24071;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ ActivityC17874 f24072;

    /* JADX INFO: renamed from: ܳ */
    public C9729 f24073;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ String f24074;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C23631 f24075;

    /* JADX INFO: renamed from: ᩻ */
    public C22739 f24076;

    public C8879(C23631 c23631, ActivityC17874 activityC17874, String str, AbstractC17043 abstractC17043) {
        this.f24075 = c23631;
        this.f24072 = activityC17874;
        this.f24074 = str;
        this.f24071 = abstractC17043;
        this.f24070 = C11084.m25530(c23631.getViewLifecycleOwner());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f24073 = this.f24075.f75242.m32500().mo28595();
        m22246(this.f24072, this.f24070);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C9729 c9729 = this.f24073;
        try {
            C22739 c22739M18506 = C7991.m18506(c9729);
            this.f24076 = c22739M18506;
            c22739M18506.m50886("<--id-c5skl23kjndf-->", this.f24074);
            this.f24071.m38668(this.f24076.mo16897());
            if (c9729 != null) {
                c9729.close();
            }
        } catch (Throwable th) {
            if (c9729 != null) {
                try {
                    c9729.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f24070.m25532()) {
            long jMo25091 = this.f24071.mo25091();
            C23631 c23631 = this.f24075;
            c23631.f75215 = jMo25091;
            c23631.startActivity(new Intent(c23631.getContext(), (Class<?>) ActivityC15366.class));
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        int iM40851;
        if (this.f24070.m25532()) {
            this.f24072.m12259(exc, (DialogInterface.OnDismissListener) null);
            if (!(exc instanceof C3870) || (iM40851 = ((C3870) exc).m7629().m40851()) == -1) {
                return;
            }
            this.f24075.f75242.m32436(iM40851 - 1);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C9729 c9729 = this.f24073;
        if (c9729 != null) {
            c9729.close();
        }
        m22249();
    }
}
