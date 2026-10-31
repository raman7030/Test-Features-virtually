package l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.AbstractCollection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 65YF */
/* JADX INFO: loaded from: classes.dex */
public final class C1128 {

    /* JADX INFO: renamed from: ۫ۙ᩺, reason: not valid java name and contains not printable characters */
    public static int f4106;

    /* JADX INFO: renamed from: ֡۠ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m3839(Object obj, Object obj2) {
        return ((C16560) obj).m39035((String) obj2);
    }

    /* JADX INFO: renamed from: ֨ۛۚ, reason: not valid java name and contains not printable characters */
    public static String m3840(Object obj) {
        return ((C3545) obj).getName();
    }

    /* JADX INFO: renamed from: ֨ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m3841(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֨᩷ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m3842(Object obj, Object obj2) {
        return ((HashMap) obj).containsKey(obj2);
    }

    /* JADX INFO: renamed from: ֫᩵᩹, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3845(Object obj, Object obj2) {
        return ((StringBuilder) obj).append(obj2);
    }

    /* JADX INFO: renamed from: ۗۗۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3846(Object obj) {
        return ((AbstractCollection) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ۘۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3847(Object obj) {
        return ((View) obj).getScrollX();
    }

    /* JADX INFO: renamed from: ۟ܰۚ, reason: not valid java name and contains not printable characters */
    public static int m3848(Object obj) {
        return ((ViewGroup) obj).getChildCount();
    }

    /* JADX INFO: renamed from: ۡۙ᩵, reason: not valid java name and contains not printable characters */
    public static void m3849(Object obj, int i) {
        ((AbstractC3817) obj).m11536(i);
    }

    /* JADX INFO: renamed from: ܰۗܽ, reason: not valid java name and contains not printable characters */
    public static boolean m3850(Object obj, Object obj2) {
        return ((String) obj).endsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ܳܳۧ, reason: not valid java name and contains not printable characters */
    public static int m3851() {
        return 1106450381;
    }

    /* JADX INFO: renamed from: ܶۙ᩵, reason: not valid java name and contains not printable characters */
    public static void m3852(Object obj) {
        C0349.m1793((AutoCloseable) obj);
    }

    /* JADX INFO: renamed from: ᩳ֫ۖ, reason: not valid java name and contains not printable characters */
    public static void m3853(Object obj, int i) {
        ((View) obj).setVisibility(i);
    }

    /* JADX INFO: renamed from: ᩴ᩵᩸, reason: not valid java name and contains not printable characters */
    public static void m3854(Object obj) {
        ((C13136) obj).m31864();
    }

    /* JADX INFO: renamed from: ᩵᩵ܽ, reason: not valid java name and contains not printable characters */
    public static void m3855(Object obj, Object obj2) {
        ((C8918) obj).write((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ᩶ۧܺ, reason: not valid java name and contains not printable characters */
    public static Object m3856(Object obj, Object obj2, Object obj3) {
        return ((HashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m3844(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m3843(Drawable drawable) {
        return drawable.getLayoutDirection();
    }
}
