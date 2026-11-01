package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۗۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C627 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5231 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractActivityC5549 f12281;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ String f12282;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f12283;

    /* JADX INFO: renamed from: ܳ */
    public final C11084 f12284;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f12285;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractC14618 f12286;

    public C5231(AbstractC14618 abstractC14618, AbstractActivityC5549 abstractActivityC5549, String str, String str2, boolean z) {
        this.f12286 = abstractC14618;
        this.f12281 = abstractActivityC5549;
        this.f12282 = str;
        this.f12285 = str2;
        this.f12283 = z;
        this.f12284 = C11084.m25530(abstractActivityC5549);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f12281, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f12286.mo19589(this.f12282, this.f12285, this.f12283);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f12284.m25532()) {
            this.f12286.mo19588();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f12284.m25532()) {
            this.f12281.m12259(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
