package p067l;

import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨۟ */
/* JADX INFO: compiled from: 855Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0890 {

    /* JADX INFO: renamed from: ᩹֫᩷, reason: not valid java name and contains not printable characters */
    public static int f81849;

    /* JADX INFO: renamed from: ֡ۚۧ, reason: not valid java name and contains not printable characters */
    public static String m55726(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۘ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m55727(Object obj, Object obj2, boolean z) {
        return ((InterfaceC14100) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۘۤ᩵, reason: not valid java name and contains not printable characters */
    public static void m55728(Object obj, boolean z) {
        ((C0990) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ۤۘܺ, reason: not valid java name and contains not printable characters */
    public static void m55729(Object obj) {
        ((AbstractC9542) obj).m22250();
    }

    /* JADX INFO: renamed from: ۤ᩺᩵, reason: not valid java name and contains not printable characters */
    public static boolean m55730(Object obj) {
        return TextUtils.isEmpty((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ۧ᩺ܳ, reason: not valid java name and contains not printable characters */
    public static void m55731(Object obj, Object obj2) {
        ((View) obj).setTag(obj2);
    }

    /* JADX INFO: renamed from: ۨ֫᩸, reason: not valid java name and contains not printable characters */
    public static boolean m55732(Object obj) {
        return ((C17436) obj).m39714();
    }

    /* JADX INFO: renamed from: ۨ᩹ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m55733(Object obj) {
        return ((C14677) obj).m33585();
    }

    /* JADX INFO: renamed from: ܰ֨ܳ, reason: not valid java name and contains not printable characters */
    public static String m55734(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC14100) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ܶܳܿ, reason: not valid java name and contains not printable characters */
    public static String m55735(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replaceAll((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ܺ᩶۫, reason: not valid java name and contains not printable characters */
    public static View m55736(Object obj, int i) {
        return ((AbstractActivityC5549) obj).m12277(i);
    }

    /* JADX INFO: renamed from: ᩳۨ᩺, reason: not valid java name and contains not printable characters */
    public static Object m55737(Object obj, Object obj2) {
        return ((HashMap) obj).get(obj2);
    }

    /* JADX INFO: renamed from: ᩳ᩵᩺, reason: not valid java name and contains not printable characters */
    public static String m55738(Object obj) {
        return C20186.m45682((String) obj);
    }

    /* JADX INFO: renamed from: ᩶֨ܿ, reason: not valid java name and contains not printable characters */
    public static byte m55739(Object obj, int i) {
        return ((C19279) obj).m43961(i);
    }

    /* JADX INFO: renamed from: ᩶۫ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m55740() {
        return true;
    }

    /* JADX INFO: renamed from: ᩸ۜۚ, reason: not valid java name and contains not printable characters */
    public static void m55741(Object obj, int i, int i2) {
        ((ViewOnClickListenerC22974) obj).m51304(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Interpolator m5717(Path path) {
        return new PathInterpolator(path);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Interpolator m5715(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Interpolator m5716(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }
}
