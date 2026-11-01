package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.֡ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2802 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ViewOnClickListenerC7497 f4790;

    /* JADX INFO: renamed from: ܳ */
    public final C19644 f4791;

    /* JADX INFO: renamed from: ᩻ */
    public final C10179 f4792;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
    }

    public C2802(ViewOnClickListenerC7497 viewOnClickListenerC7497, C19644 c19644, C10179 c10179) {
        this.f4790 = viewOnClickListenerC7497;
        this.f4791 = c19644;
        this.f4792 = c10179;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        this.f4792.m23739();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f4790;
        if (viewOnClickListenerC7497.f19624 == this) {
            viewOnClickListenerC7497.f19624 = null;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C8838 c8838;
        ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f4790;
        if (viewOnClickListenerC7497.f19624 != this || viewOnClickListenerC7497.f19621 || viewOnClickListenerC7497.f19627 || viewOnClickListenerC7497.isFinishing() || viewOnClickListenerC7497.isDestroyed() || (c8838 = viewOnClickListenerC7497.f19629) == null) {
            return;
        }
        C19644 c19644M29476 = c8838.f23986.m29476();
        C19644 c19644 = this.f4791;
        if (c19644M29476 == c19644 && viewOnClickListenerC7497.f19611 == this.f4792 && !viewOnClickListenerC7497.f19626.m45721(c19644)) {
            if (exc instanceof C7614) {
                viewOnClickListenerC7497.m17310();
            } else {
                viewOnClickListenerC7497.m12271(R.string.MT_Protector);
            }
        }
    }
}
