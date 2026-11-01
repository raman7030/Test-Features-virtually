package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12471 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC8645 f34904;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ boolean f34905;

    public C12471(ActivityC8645 activityC8645, boolean z) {
        this.f34904 = activityC8645;
        this.f34905 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f34904, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        C11996 c11996 = new C11996();
        ActivityC8645 activityC8645 = this.f34904;
        activityC8645.f23213.f78324.m25229();
        activityC8645.f23213.f78324.m25227(c11996, (C20689) null);
        AbstractC17043 abstractC17043 = activityC8645.f23213.f78321;
        abstractC17043.getClass();
        abstractC17043.m38655(new C17714(0, c11996));
        activityC8645.f23213.f78333 = false;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f34905) {
            this.f34904.finish();
        } else {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f34904.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
