package p067l;

import android.content.DialogInterface;
import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܳۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16082 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ View f47321;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC8707 f47322;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f47323;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ DialogInterfaceC2564 f47324;

    public C16082(View view, ActivityC8707 activityC8707, DialogInterfaceC2564 dialogInterfaceC2564, String str) {
        this.f47322 = activityC8707;
        this.f47323 = str;
        this.f47324 = dialogInterfaceC2564;
        this.f47321 = view;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f47322, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C16150 {
        ActivityC8707 activityC8707 = this.f47322;
        C25065 c25065M9847 = C4654.m9847(this.f47323, activityC8707.f23598.f79255);
        if (c25065M9847.m55016()) {
            return;
        }
        if (activityC8707.f23598.f79255) {
            throw new C16150(C3865.m7621(c25065M9847, R.string.MT_Protector));
        }
        throw new C16150(C3865.m7621(c25065M9847, R.string.MT_Protector));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C7050.m16213(new Runnable() { // from class: l.ܿۡ᩷
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC8707 activityC8707 = this.f56068.f47322;
                Main mainM38753 = C17127.m38753();
                if (mainM38753 != null) {
                    mainM38753.m12254(R.string.MT_Protector, activityC8707.f23598.f79257, false);
                } else {
                    C22682.m50800(activityC8707.f23598.f79257);
                }
            }
        }, 1000L);
        this.f47324.dismiss();
        C4654.m9886();
        this.f47322.finish();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f47321.setEnabled(true);
        this.f47322.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
