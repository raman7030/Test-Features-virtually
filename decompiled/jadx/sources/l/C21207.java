package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes5.dex */
public final class C21207 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16376 f68336;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16266 f68337;

    public C21207(C16266 c16266) {
        this.f68337 = c16266;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C16266 c16266 = this.f68337;
        c16266.f50029.setVisibility(0);
        c16266.f50032 = true;
        c16266.f50025 = false;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C16266 c16266 = this.f68337;
        c16266.f50034.m29734();
        if (c16266.f50024) {
            this.f68336 = C16266.m38269(c16266);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C16266 c16266 = this.f68337;
        if (c16266.f50024) {
            c16266.f50035.m17981(this.f68336);
            if (this.f68336 == null) {
                C21374.m48457(R.string.MT_Protector);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16266 c16266 = this.f68337;
        if (c16266.f50024) {
            c16266.f50025 = true;
            c16266.f50030.m11384((Throwable) exc);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C16266 c16266 = this.f68337;
        if (c16266.f50024) {
            c16266.f50029.setVisibility(8);
        }
        c16266.f50032 = false;
    }
}
