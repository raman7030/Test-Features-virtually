package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩵ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19416 implements InterfaceC5198 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13064 f62812;

    public C19416(C13064 c13064) {
        this.f62812 = c13064;
    }

    @Override // l.InterfaceC5198
    public final boolean perform(View view, AbstractC9432 abstractC9432) {
        if (!C13064.m31638(view)) {
            return false;
        }
        C13064 c13064 = this.f62812;
        if (c13064.m31644(view) == 2) {
            return false;
        }
        c13064.m31649(view, true);
        return true;
    }
}
