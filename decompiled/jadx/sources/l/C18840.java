package l;

import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V685 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18840 implements InterfaceC7550 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C18840 f59427;

    @Override // l.InterfaceC7550
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo7073(C2095 c2095) {
        C19546 c19546 = (C19546) c2095;
        if (TextUtils.isEmpty(c19546.m44959())) {
            return c19546.m6886().getString(R.string.MT_Protector);
        }
        return c19546.m44959();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18840 m43526() {
        if (f59427 == null) {
            f59427 = new C18840();
        }
        return f59427;
    }
}
