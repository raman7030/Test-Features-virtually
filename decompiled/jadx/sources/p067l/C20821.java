package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.᩵ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20821 implements InterfaceC1100 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14784 f65425;

    public C20821(C14784 c14784) {
        this.f65425 = c14784;
    }

    @Override // p067l.InterfaceC1100
    public final boolean perform(View view, AbstractC1310 abstractC1310) {
        if (!C14784.m33725(view)) {
            return false;
        }
        C14784 c14784 = this.f65425;
        if (c14784.m33731(view) == 2) {
            return false;
        }
        c14784.m33736(view, true);
        return true;
    }
}
