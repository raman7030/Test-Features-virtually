package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۟ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9314 {

    /* JADX INFO: renamed from: ۧ */
    public int f25321;

    /* JADX INFO: renamed from: ܳ */
    public boolean f25322;

    /* JADX INFO: renamed from: ܽ */
    public boolean f25323;

    /* JADX INFO: renamed from: ᩳ */
    public C23120 f25325;

    /* JADX INFO: renamed from: ᩻ */
    public int f25326;

    /* JADX INFO: renamed from: ܿ */
    public final C7026 f25324 = new C7026();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f25320 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public static void m21557(C9314 c9314, String str) {
        c9314.f25326 = C9038.m20907(str);
        c9314.f25322 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21554(C9314 c9314, String str) {
        c9314.f25321 = C9038.m20907(str);
        c9314.f25323 = true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m21559(C9314 c9314) {
        if (!c9314.f25322 || !c9314.f25323) {
            throw new IllegalStateException("Syntax dependencies are not fully loaded");
        }
        return ((c9314.f25326 + 127224) * 31) + c9314.f25321;
    }
}
