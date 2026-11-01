package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 8985 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19812 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public C16512 f60246;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ long f60247;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f60248;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f60249;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractActivityC5549 f60250;

    /* JADX INFO: renamed from: ᩻ */
    public C20689 f60251;

    public C19812(Main main, long j, boolean z) {
        this.f60250 = main;
        this.f60247 = j;
        this.f60248 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f60250);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431("...");
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f60249 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C24164 c24164 = this.f60249;
        C12826.requireNonNull(c24164);
        this.f60246 = C23219.m51749(this.f60247, this.f60248, new C13107(c24164), new C18470(this));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C16512 c16512 = this.f60246;
        if (c16512 == null || c16512.m37468() || this.f60249.m53444()) {
            return;
        }
        if (this.f60246.m37469() > 0) {
            C22682.m50795((CharSequence) C7050.m16203(R.string.MT_Protector, Integer.valueOf(this.f60246.m37469())));
        } else {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f60250.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f60249.m53442();
        C17127.m38756();
    }
}
