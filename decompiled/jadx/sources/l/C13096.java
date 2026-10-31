package l;

import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AL3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13096 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39208 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int f39209 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean f39210 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f39211 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int f39212 = 1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f39213 = true;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean f39214 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31739(int i) {
        if (i < 0 || i > 2) {
            return 1;
        }
        return i;
    }

    static {
        m31743();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static void m31742() {
        m31743();
        C4925.m14312(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m31741() {
        return f39210;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31746(boolean z) {
        f39210 = z;
        C22870.m50970(ApplicationC20075.f65008, "scp_6", z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m31754() {
        return f39214;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m31750(boolean z) {
        f39214 = z;
        ApplicationC20075.f65008.edit().putBoolean("scp_1", z).apply();
        C4925.m14312(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m31755() {
        return f39213;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31740(boolean z) {
        f39213 = z;
        C22870.m50970(ApplicationC20075.f65008, "scp_5", z);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m31747() {
        float dimension;
        int i = f39212;
        if (i == 0) {
            dimension = C4925.m14338().getDimension(R.dimen.MT_Protector);
        } else if (i == 2) {
            dimension = C4925.m14338().getDimension(R.dimen.MT_Protector);
        } else {
            dimension = C4925.m14338().getDimension(R.dimen.MT_Protector);
        }
        return (int) dimension;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m31751() {
        return f39212;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m31753(int i) {
        int iM31739 = m31739(i);
        f39212 = iM31739;
        ApplicationC20075.f65008.edit().mo25853(iM31739, "scp_2").apply();
        C4925.m14312(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31738() {
        int i = f39209;
        if (i != 0) {
            return i != 2 ? 8 : 6;
        }
        return 10;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m31744() {
        return f39209;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31745(int i) {
        int iM31739 = m31739(i);
        f39209 = iM31739;
        ApplicationC20075.f65008.edit().mo25853(iM31739, "scp_3").apply();
        C4925.m14312(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m31752() {
        int i = f39211;
        if (i != 0) {
            return i != 2 ? 20 : 30;
        }
        return 10;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m31748() {
        return f39211;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m31749(int i) {
        int iM31739 = m31739(i);
        f39211 = iM31739;
        ApplicationC20075.f65008.edit().mo25853(iM31739, "scp_4").apply();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m31743() {
        f39210 = ApplicationC20075.f65008.getBoolean("scp_6", false);
        f39214 = ApplicationC20075.f65008.getBoolean("scp_1", true);
        f39213 = ApplicationC20075.f65008.getBoolean("scp_5", true);
        f39212 = m31739(ApplicationC20075.f65008.getInt("scp_2", 1));
        f39209 = m31739(ApplicationC20075.f65008.getInt("scp_3", 1));
        f39211 = m31739(ApplicationC20075.f65008.getInt("scp_4", 1));
    }
}
