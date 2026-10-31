package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10126 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f30472;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f30473;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f30474;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11825 f30475;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14772 f30476;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
    }

    public C10126(C14772 c14772, ActivityC17169 activityC17169, boolean z, C11825 c11825) {
        this.f30476 = c14772;
        this.f30472 = activityC17169;
        this.f30473 = z;
        this.f30475 = c11825;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f30472);
        c22933.m51049(R.string.MT_Protector);
        c22933.m51040(C4925.m14306(R.string.MT_Protector, 0));
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f30474 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C12242 c12242 = new C12242(this);
        C14772 c14772 = this.f30476;
        C11393 c11393 = new C11393(c14772.f45110);
        boolean z = this.f30473;
        C11825 c11825 = this.f30475;
        if (z) {
            int i = c11825.f35279;
            if (i == 0) {
                C6180.m17089(c14772.f45110, c11825.f35277, c12242);
                return;
            } else if (i == 1) {
                C6180.m17092(c14772.f45110, c11393, c11825.f35277, c11825.f35280, c11825.f35278, c12242);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                C6180.m17090(c14772.f45110, c11393, c11825.f35277, c11825.f35280, c11825.f35276, c12242);
                return;
            }
        }
        int i2 = c11825.f35279;
        if (i2 == 0) {
            C6180.m17099(c14772.f45110, c11825.f35277, c12242);
        } else {
            if (i2 != 1) {
                return;
            }
            C6180.m17091(c14772.f45110, c11393, c11825.f35277, c11825.f35280, c12242);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f30472.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f30474.m51051();
    }
}
