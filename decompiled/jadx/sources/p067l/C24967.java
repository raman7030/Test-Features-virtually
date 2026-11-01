package p067l;

import android.text.TextUtils;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩻ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C682 */
/* JADX INFO: loaded from: classes.dex */
public final class C24967 implements InterfaceC9544 {

    /* JADX INFO: renamed from: ᩸ */
    public static C24967 f79724;

    @Override // p067l.InterfaceC9544
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo9168(C4360 c4360) {
        C8874 c8874 = (C8874) c4360;
        if (TextUtils.isEmpty(c8874.m20478())) {
            return c8874.m9012().getString(R.string.MT_Protector);
        }
        return c8874.m20478();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24967 m54858() {
        if (f79724 == null) {
            f79724 = new C24967();
        }
        return f79724;
    }
}
