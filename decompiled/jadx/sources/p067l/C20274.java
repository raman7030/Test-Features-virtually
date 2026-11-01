package p067l;

import android.text.TextUtils;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩴܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V685 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20274 implements InterfaceC9544 {

    /* JADX INFO: renamed from: ᩸ */
    public static C20274 f62655;

    @Override // p067l.InterfaceC9544
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo9168(C4360 c4360) {
        C20945 c20945 = (C20945) c4360;
        if (TextUtils.isEmpty(c20945.m47259())) {
            return c20945.m9012().getString(R.string.MT_Protector);
        }
        return c20945.m47259();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20274 m45792() {
        if (f62655 == null) {
            f62655 = new C20274();
        }
        return f62655;
    }
}
