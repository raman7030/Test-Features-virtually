package p067l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: NA5M */
/* JADX INFO: loaded from: classes5.dex */
public final class C20681 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractActivityC5549 f63873;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C7269 f63874;

    public C20681(AbstractActivityC5549 abstractActivityC5549, C7269 c7269) {
        this.f63873 = abstractActivityC5549;
        this.f63874 = c7269;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f63873, R.string.MT_Protector);
        C14853 c14853 = this.f26234;
        C12826.requireNonNull(c14853);
        c14853.m33952(new RunnableC24165(3, c14853));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C7269 c7269 = this.f63874;
        C18724 c18724M16647 = c7269.m16647();
        if (!c7269.f18960.isEmpty()) {
            C19395 c19395M42717 = c18724M16647.m42717();
            c19395M42717.m44152(new C22692(c7269.f18960));
            c18724M16647 = c19395M42717.m44143();
        }
        C12421 c12421 = new C12421(c18724M16647, c7269.f18962);
        if (!TextUtils.isEmpty(c7269.f18961)) {
            c12421.m28620(c7269.f18961, c7269.f18958, false);
        }
        c12421.m28625(c7269.f18962 + "/");
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f26234.m33960()) {
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f26234.m33960()) {
            return;
        }
        this.f63873.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        if (this.f26234.m33960()) {
            return;
        }
        m22249();
    }
}
