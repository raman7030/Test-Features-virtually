package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 8985 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18353 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C14882 f57026;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f57027;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f57028;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f57029;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f57030;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C19277 f57031;

    public C18353(Main main, long j, boolean z) {
        this.f57030 = main;
        this.f57027 = j;
        this.f57028 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f57030);
        c22933.m51049(R.string.MT_Protector);
        c22933.m51040("...");
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f57029 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C22933 c22933 = this.f57029;
        C11003.requireNonNull(c22933);
        this.f57026 = C21939.m49412(this.f57027, this.f57028, new C11298(c22933), new C16941(this));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C14882 c14882 = this.f57026;
        if (c14882 == null || c14882.m35316() || this.f57029.m51053()) {
            return;
        }
        if (this.f57026.m35317() > 0) {
            C21374.m48459((CharSequence) C4925.m14306(R.string.MT_Protector, Integer.valueOf(this.f57026.m35317())));
        } else {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f57030.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f57029.m51051();
        C15528.m36596();
    }
}
