package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.֡ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0456 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5396 f2015;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18177 f2016;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C8218 f2017;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
    }

    public C0456(ViewOnClickListenerC5396 viewOnClickListenerC5396, C18177 c18177, C8218 c8218) {
        this.f2015 = viewOnClickListenerC5396;
        this.f2016 = c18177;
        this.f2017 = c8218;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        this.f2017.m21770();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f2015;
        if (viewOnClickListenerC5396.f16788 == this) {
            viewOnClickListenerC5396.f16788 = null;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C6807 c6807;
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f2015;
        if (viewOnClickListenerC5396.f16788 != this || viewOnClickListenerC5396.f16785 || viewOnClickListenerC5396.f16791 || viewOnClickListenerC5396.isFinishing() || viewOnClickListenerC5396.isDestroyed() || (c6807 = viewOnClickListenerC5396.f16793) == null) {
            return;
        }
        C18177 c18177M27414 = c6807.f21109.m27414();
        C18177 c18177 = this.f2016;
        if (c18177M27414 == c18177 && viewOnClickListenerC5396.f16775 == this.f2017 && !viewOnClickListenerC5396.f16790.m43452(c18177)) {
            if (exc instanceof C5519) {
                viewOnClickListenerC5396.m15399();
            } else {
                viewOnClickListenerC5396.m10235(R.string.MT_Protector);
            }
        }
    }
}
