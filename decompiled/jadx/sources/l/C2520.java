package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.LocaleList;
import android.view.MenuItem;
import bin.mt.json.JSONObject;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: S3QK */
/* JADX INFO: loaded from: classes.dex */
public final class C2520 {

    /* JADX INFO: renamed from: ۖ֫ܿ, reason: not valid java name and contains not printable characters */
    public static int f8000;

    /* JADX INFO: renamed from: ֡ܿۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8015(Object obj) {
        return ((C12392) obj).m30519();
    }

    /* JADX INFO: renamed from: ֫۬ܶ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m8018(Object obj, Object obj2, Object obj3) {
        return ObjectAnimator.ofFloat(obj, (String) obj2, (float[]) obj3);
    }

    /* JADX INFO: renamed from: ۛܰ۟, reason: not valid java name and contains not printable characters */
    public static MenuItem m8019(Object obj, int i) {
        return ((MenuItem) obj).setIcon(i);
    }

    /* JADX INFO: renamed from: ۜۗᩴ, reason: not valid java name and contains not printable characters */
    public static int m8020(Object obj) {
        return ((C10567) obj).length();
    }

    /* JADX INFO: renamed from: ۜ᩵ۨ, reason: not valid java name and contains not printable characters */
    public static float m8021(Object obj) {
        return ((Paint) obj).getTextSize();
    }

    /* JADX INFO: renamed from: ۟ۗۤ, reason: not valid java name and contains not printable characters */
    public static int m8022(Object obj) {
        return ((InterfaceC20008) obj).readInt();
    }

    /* JADX INFO: renamed from: ۠ۛܳ, reason: not valid java name and contains not printable characters */
    public static boolean m8023(Object obj, Object obj2, boolean z) {
        return ((SharedPreferences) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۠ᩳۜ, reason: not valid java name and contains not printable characters */
    public static JSONObject m8024(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).add((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۢۛᩳ, reason: not valid java name and contains not printable characters */
    public static void m8025(Object obj, Object obj2, Object obj3) {
        ((C8918) obj).m23014((C3545) obj2, (C18090) obj3);
    }

    /* JADX INFO: renamed from: ۢۨۚ, reason: not valid java name and contains not printable characters */
    public static boolean m8026() {
        return false;
    }

    /* JADX INFO: renamed from: ۬ܳ᩸, reason: not valid java name and contains not printable characters */
    public static void m8028(Object obj) {
        ((C18090) obj).close();
    }

    /* JADX INFO: renamed from: ܺۨܰ, reason: not valid java name and contains not printable characters */
    public static void m8029(Object obj, int i, Object obj2) {
        ((C19258) obj).m44434(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ᩴ۟ۚ, reason: not valid java name and contains not printable characters */
    public static String m8030(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩵᩵ۙ, reason: not valid java name and contains not printable characters */
    public static int m8031(Object obj) {
        return ((C12392) obj).m30448();
    }

    /* JADX INFO: renamed from: ᩸ۨ᩺, reason: not valid java name and contains not printable characters */
    public static C23902 m8032() {
        return C6969.m18832();
    }

    /* JADX INFO: renamed from: ᩹᩷ۤ, reason: not valid java name and contains not printable characters */
    public static void m8033(Object obj, int i, Object obj2) {
        ((C19258) obj).m44440(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LocaleList m8017(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LocaleList m8016() {
        return LocaleList.getAdjustedDefault();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static LocaleList m8027() {
        return LocaleList.getDefault();
    }
}
