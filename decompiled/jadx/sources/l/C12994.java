package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12994 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4733 f38918;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f38919;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f38920;

    public C12994(C22372 c22372, ActivityC16315 activityC16315, C4733 c4733) {
        this.f38919 = c22372;
        this.f38920 = activityC16315;
        this.f38918 = c4733;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f38920, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C23077 c23077 = new C23077(0, C14776.f45134, false, 0, null, null, null);
        synchronized (this.f38919.f72498) {
            C8967 c8967M50142 = C22372.m50142(this.f38919, c23077);
            try {
                c8967M50142.f27243.m35203(this.f38918);
                c8967M50142.close();
            } catch (Throwable th) {
                if (c8967M50142 != null) {
                    try {
                        c8967M50142.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f38919.m50144(exc, this.f38920);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
