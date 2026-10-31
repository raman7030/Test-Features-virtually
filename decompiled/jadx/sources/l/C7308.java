package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۟ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7308 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f22430;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f22431;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f22432;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C21834 f22434;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f22435;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4900 f22433 = new C4900();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f22429 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m19589(C7308 c7308, String str) {
        c7308.f22435 = C7017.m18950(str);
        c7308.f22431 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19586(C7308 c7308, String str) {
        c7308.f22430 = C7017.m18950(str);
        c7308.f22432 = true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m19591(C7308 c7308) {
        if (!c7308.f22431 || !c7308.f22432) {
            throw new IllegalStateException("Syntax dependencies are not fully loaded");
        }
        return ((c7308.f22435 + 127224) * 31) + c7308.f22430;
    }
}
