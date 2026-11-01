package p067l;

import android.content.Intent;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AL3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14815 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f42256 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static int f42257 = 1;

    /* JADX INFO: renamed from: ܳ */
    public static boolean f42258 = false;

    /* JADX INFO: renamed from: ܽ */
    public static int f42259 = 1;

    /* JADX INFO: renamed from: ܿ */
    public static int f42260 = 1;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f42261 = true;

    /* JADX INFO: renamed from: ᩻ */
    public static boolean f42262 = true;

    /* JADX INFO: renamed from: ֫ */
    public static int m33829(int i) {
        if (i < 0 || i > 2) {
            return 1;
        }
        return i;
    }

    static {
        m33833();
    }

    /* JADX INFO: renamed from: ۡ */
    public static void m33832() {
        m33833();
        C7050.m16209(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ۜ */
    public static boolean m33831() {
        return f42258;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33836(boolean z) {
        f42258 = z;
        C24104.m53360(ApplicationC21448.f67649, "scp_6", z);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static boolean m33844() {
        return f42262;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m33840(boolean z) {
        f42262 = z;
        ApplicationC21448.f67649.edit().putBoolean("scp_1", z).apply();
        C7050.m16209(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m33845() {
        return f42261;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33830(boolean z) {
        f42261 = z;
        C24104.m53360(ApplicationC21448.f67649, "scp_5", z);
    }

    /* JADX INFO: renamed from: ܳ */
    public static int m33837() {
        float dimension;
        int i = f42260;
        if (i == 0) {
            dimension = C7050.m16235().getDimension(R.dimen.MT_Protector);
        } else if (i == 2) {
            dimension = C7050.m16235().getDimension(R.dimen.MT_Protector);
        } else {
            dimension = C7050.m16235().getDimension(R.dimen.MT_Protector);
        }
        return (int) dimension;
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m33841() {
        return f42260;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m33843(int i) {
        int iM33829 = m33829(i);
        f42260 = iM33829;
        ApplicationC21448.f67649.edit().mo27875(iM33829, "scp_2").apply();
        C7050.m16209(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m33828() {
        int i = f42257;
        if (i != 0) {
            return i != 2 ? 8 : 6;
        }
        return 10;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m33834() {
        return f42257;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33835(int i) {
        int iM33829 = m33829(i);
        f42257 = iM33829;
        ApplicationC21448.f67649.edit().mo27875(iM33829, "scp_3").apply();
        C7050.m16209(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m33842() {
        int i = f42259;
        if (i != 0) {
            return i != 2 ? 20 : 30;
        }
        return 10;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m33838() {
        return f42259;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m33839(int i) {
        int iM33829 = m33829(i);
        f42259 = iM33829;
        ApplicationC21448.f67649.edit().mo27875(iM33829, "scp_4").apply();
    }

    /* JADX INFO: renamed from: ۢ */
    public static void m33833() {
        f42258 = ApplicationC21448.f67649.getBoolean("scp_6", false);
        f42262 = ApplicationC21448.f67649.getBoolean("scp_1", true);
        f42261 = ApplicationC21448.f67649.getBoolean("scp_5", true);
        f42260 = m33829(ApplicationC21448.f67649.getInt("scp_2", 1));
        f42257 = m33829(ApplicationC21448.f67649.getInt("scp_3", 1));
        f42259 = m33829(ApplicationC21448.f67649.getInt("scp_4", 1));
    }
}
