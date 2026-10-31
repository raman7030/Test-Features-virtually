package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes3.dex */
public final class C7095 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16266 f21799;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f21800;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16376 f21801;

    public C7095(C16266 c16266) {
        this.f21799 = c16266;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C16266 c16266 = this.f21799;
        c16266.f50029.setVisibility(0);
        c16266.f50032 = true;
        c16266.f50025 = false;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C16266 c16266 = this.f21799;
        c16266.f50034.m29734();
        if (c16266.f50024) {
            if (!c16266.f50027) {
                C11005 c11005M34233 = c16266.m34233(c16266.f50026.m36268());
                if (c11005M34233.m27336()) {
                    C16266.m38265(c16266, C12951.m31485(c11005M34233.m27337()));
                    this.f21800 = true;
                    return;
                }
            }
            c16266.f50027 = false;
            this.f21801 = C16266.m38269(c16266);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C16266 c16266 = this.f21799;
        if (c16266.f50024 && !this.f21800) {
            c16266.f50035.m17981(this.f21801);
            if (this.f21801 == null) {
                C21374.m48457(R.string.MT_Protector);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16266 c16266 = this.f21799;
        if (c16266.f50024) {
            c16266.f50025 = true;
            c16266.f50030.m11384((Throwable) exc);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C16266 c16266 = this.f21799;
        if (c16266.f50024) {
            c16266.f50029.setVisibility(8);
        }
        c16266.f50032 = false;
    }
}
