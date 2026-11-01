package p067l;

import android.content.Context;

/* JADX INFO: renamed from: l.۠ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10187 extends C16891 {

    /* JADX INFO: renamed from: ܽ */
    public C7764 f28252;

    /* JADX INFO: renamed from: ܿ */
    public boolean f28253;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f28254;

    public C10187(C7014 c7014, C2017 c2017, boolean z) {
        super(c7014, c2017);
        this.f28253 = false;
        this.f28254 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7764 m23747(Context context) {
        if (this.f28253) {
            return this.f28252;
        }
        C7764 c7764M24166 = C10446.m24166(context, m38449().m16145(), m38449().m16143() == EnumC21767.VISIBLE, this.f28254);
        this.f28252 = c7764M24166;
        this.f28253 = true;
        return c7764M24166;
    }
}
