package p067l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.LocaleList;
import android.view.MenuItem;
import bin.p000mt.json.JSONObject;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۖ۫ */
/* JADX INFO: compiled from: S3QK */
/* JADX INFO: loaded from: classes.dex */
public final class C0967 {

    /* JADX INFO: renamed from: ۖ֫ܿ, reason: not valid java name and contains not printable characters */
    public static int f81910;

    /* JADX INFO: renamed from: ֡ܿۨ, reason: not valid java name and contains not printable characters */
    public static boolean m56065(Object obj) {
        return ((C14146) obj).m32583();
    }

    /* JADX INFO: renamed from: ֫۬ܶ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m56066(Object obj, Object obj2, Object obj3) {
        return ObjectAnimator.ofFloat(obj, (String) obj2, (float[]) obj3);
    }

    /* JADX INFO: renamed from: ۛܰ۟, reason: not valid java name and contains not printable characters */
    public static MenuItem m56067(Object obj, int i) {
        return ((MenuItem) obj).setIcon(i);
    }

    /* JADX INFO: renamed from: ۜۗᩴ, reason: not valid java name and contains not printable characters */
    public static int m56068(Object obj) {
        return ((C12412) obj).length();
    }

    /* JADX INFO: renamed from: ۜ᩵ۨ, reason: not valid java name and contains not printable characters */
    public static float m56069(Object obj) {
        return ((Paint) obj).getTextSize();
    }

    /* JADX INFO: renamed from: ۟ۗۤ, reason: not valid java name and contains not printable characters */
    public static int m56070(Object obj) {
        return ((InterfaceC21384) obj).readInt();
    }

    /* JADX INFO: renamed from: ۠ۛܳ, reason: not valid java name and contains not printable characters */
    public static boolean m56071(Object obj, Object obj2, boolean z) {
        return ((SharedPreferences) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۠ᩳۜ, reason: not valid java name and contains not printable characters */
    public static JSONObject m56072(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).add((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۢۛᩳ, reason: not valid java name and contains not printable characters */
    public static void m56073(Object obj, Object obj2, Object obj3) {
        ((C10844) obj).m24988((C5738) obj2, (C19561) obj3);
    }

    /* JADX INFO: renamed from: ۢۨۚ, reason: not valid java name and contains not printable characters */
    public static boolean m56074() {
        return false;
    }

    /* JADX INFO: renamed from: ۬ܳ᩸, reason: not valid java name and contains not printable characters */
    public static void m56075(Object obj) {
        ((C19561) obj).close();
    }

    /* JADX INFO: renamed from: ܺۨܰ, reason: not valid java name and contains not printable characters */
    public static void m56076(Object obj, int i, Object obj2) {
        ((C20671) obj).m46728(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ᩴ۟ۚ, reason: not valid java name and contains not printable characters */
    public static String m56077(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩵᩵ۙ, reason: not valid java name and contains not printable characters */
    public static int m56078(Object obj) {
        return ((C14146) obj).m32512();
    }

    /* JADX INFO: renamed from: ᩸ۨ᩺, reason: not valid java name and contains not printable characters */
    public static C25085 m56079() {
        return C8992.m20786();
    }

    /* JADX INFO: renamed from: ᩹᩷ۤ, reason: not valid java name and contains not printable characters */
    public static void m56080(Object obj, int i, Object obj2) {
        ((C20671) obj).m46734(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static LocaleList m10062(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static LocaleList m10061() {
        return LocaleList.getAdjustedDefault();
    }

    /* JADX INFO: renamed from: ۧ */
    public static LocaleList m10063() {
        return LocaleList.getDefault();
    }
}
