package p067l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۢ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11184 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final C11084 f31031;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ AbstractC17043 f31032;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ ActivityC18686 f31033;

    /* JADX INFO: renamed from: ܳ */
    public C9729 f31034;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ String f31035;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C9842 f31036;

    /* JADX INFO: renamed from: ᩻ */
    public C22739 f31037;

    public C11184(C9842 c9842, ActivityC18686 activityC18686, String str, AbstractC17043 abstractC17043) {
        this.f31036 = c9842;
        this.f31033 = activityC18686;
        this.f31035 = str;
        this.f31032 = abstractC17043;
        this.f31031 = C11084.m25530(c9842.getViewLifecycleOwner());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f31034 = this.f31036.f27290.m32500().mo28595();
        m22246(this.f31033, this.f31031);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C9729 c9729 = this.f31034;
        try {
            C22739 c22739M18506 = C7991.m18506(c9729);
            this.f31037 = c22739M18506;
            c22739M18506.m50886("<--id-c5skl23kjndf-->", this.f31035);
            this.f31032.m38668(this.f31037.mo16897());
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
        if (this.f31031.m25532()) {
            long jMo25091 = this.f31032.mo25091();
            C9842 c9842 = this.f31036;
            c9842.f27279 = jMo25091;
            c9842.startActivity(new Intent(c9842.getContext(), (Class<?>) ActivityC15366.class));
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        int iM40851;
        if (this.f31031.m25532()) {
            this.f31033.m12259(exc, (DialogInterface.OnDismissListener) null);
            if (!(exc instanceof C3870) || (iM40851 = ((C3870) exc).m7629().m40851()) == -1) {
                return;
            }
            this.f31036.f27290.m32436(iM40851 - 1);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C9729 c9729 = this.f31034;
        if (c9729 != null) {
            c9729.close();
        }
        m22249();
    }
}
