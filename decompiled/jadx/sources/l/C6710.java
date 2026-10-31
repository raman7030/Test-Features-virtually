package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6710 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f20821;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f20822;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f20823;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f20824;

    public C6710(ActivityC17169 activityC17169, List list, boolean z) {
        this.f20824 = activityC17169;
        this.f20823 = list;
        this.f20821 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f20824, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C5672, IOException {
        C19452 c19452 = this.f20824.f52621;
        C11003.requireNonNull(c19452);
        c19452.m44821(this.f20823);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f20822 = true;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ActivityC17169.m40277(this.f20824, exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        if (this.f20822) {
            this.f20824.m40288(this.f20821, false);
        }
    }
}
