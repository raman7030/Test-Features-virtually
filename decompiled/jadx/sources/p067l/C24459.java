package p067l;

import android.app.Application;

/* JADX INFO: renamed from: l.᩺᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24459 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        C13731 c13731 = new C13731();
        String strM31240 = ((C13731) c17613.m40106()).m31240();
        try {
            Application applicationM16232 = C7050.m16232();
            c13731.m31208(applicationM16232.getClass().getMethod(strM31240, null).invoke(applicationM16232, null));
        } catch (Exception unused) {
        }
        c17613.m40105(c13731);
    }
}
