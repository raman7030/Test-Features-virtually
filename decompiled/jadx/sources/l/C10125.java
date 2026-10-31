package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10125 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11536 f30470;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f30471;

    public C10125(ActivityC11536 activityC11536, boolean z) {
        this.f30470 = activityC11536;
        this.f30471 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        ActivityC11536 activityC11536 = this.f30470;
        activityC11536.f34445.setVisibility(8);
        activityC11536.f34442.m29958(true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f30470.f34443 = C13651.m32804(this.f30471);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f30470.f34446.getAdapter().notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f30470.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ActivityC11536 activityC11536 = this.f30470;
        activityC11536.f34442.m29958(false);
        if (activityC11536.f34443.isEmpty()) {
            activityC11536.f34445.setVisibility(0);
        }
    }
}
