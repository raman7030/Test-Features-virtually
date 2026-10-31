package l;

import android.app.Application;

/* JADX INFO: renamed from: l.᩺᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23243 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        C11955 c11955 = new C11955();
        String strM29186 = ((C11955) c16040.m37919()).m29186();
        try {
            Application applicationM14335 = C4925.m14335();
            c11955.m29154(applicationM14335.getClass().getMethod(strM29186, null).invoke(applicationM14335, null));
        } catch (Exception unused) {
        }
        c16040.m37918(c11955);
    }
}
