package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;

/* JADX INFO: renamed from: l.֨᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3712 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public C19721 f7855;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC22429 f7856;

    public C3712(ActivityC22429 activityC22429) {
        this.f7856 = activityC22429;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f7856);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C5651 c5651 = new C5651();
        this.f7856.f70775.f60051.m29921(c5651);
        c5651.m12586();
        byte[] bArr = new byte[c5651.m12587()];
        c5651.m12584(new C3838(bArr));
        this.f7855 = C4654.m9844("", bArr, ApplicationC21448.f67649.mo20199((byte) 0, "dex_decompile_engine"));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        boolean zM55016 = this.f7855.f59997.m55016();
        ActivityC22429 activityC22429 = this.f7856;
        if (!zM55016) {
            C25065 c25065 = this.f7855.f59997;
            c25065.getClass();
            activityC22429.m12257(C3865.m7621(c25065, R.string.MT_Protector), false);
            return;
        }
        C7741 c7741 = activityC22429.f70776;
        C19721 c19721 = this.f7855;
        String strM25286 = C10965.m25286(new StringBuilder(), activityC22429.f70775.f60061, ".java");
        int i = ActivityC16573.f48667;
        C5178.m11082(ActivityC22429.class, c19721, "textViewer_dec");
        Intent intent = new Intent(C7050.m16232(), (Class<?>) ActivityC16573.class);
        intent.putExtra(AbstractC0213e.f995s, 2);
        intent.putExtra("title", strM25286);
        intent.putExtra("saveStateOnResult", true);
        c7741.m17868(intent);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f7856.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
