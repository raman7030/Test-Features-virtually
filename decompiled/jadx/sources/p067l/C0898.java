package p067l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.AbstractCollection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨۬ */
/* JADX INFO: compiled from: 65YF */
/* JADX INFO: loaded from: classes.dex */
public final class C0898 {

    /* JADX INFO: renamed from: ۫ۙ᩺, reason: not valid java name and contains not printable characters */
    public static int f81858;

    /* JADX INFO: renamed from: ֡۠ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m55790(Object obj, Object obj2) {
        return ((C18107) obj).m41261((String) obj2);
    }

    /* JADX INFO: renamed from: ֨ۛۚ, reason: not valid java name and contains not printable characters */
    public static String m55791(Object obj) {
        return ((C5738) obj).getName();
    }

    /* JADX INFO: renamed from: ֨ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m55792(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֨᩷ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m55793(Object obj, Object obj2) {
        return ((HashMap) obj).containsKey(obj2);
    }

    /* JADX INFO: renamed from: ֫᩵᩹, reason: not valid java name and contains not printable characters */
    public static StringBuilder m55794(Object obj, Object obj2) {
        return ((StringBuilder) obj).append(obj2);
    }

    /* JADX INFO: renamed from: ۗۗۡ, reason: not valid java name and contains not printable characters */
    public static boolean m55795(Object obj) {
        return ((AbstractCollection) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ۘۡۢ, reason: not valid java name and contains not printable characters */
    public static int m55796(Object obj) {
        return ((View) obj).getScrollX();
    }

    /* JADX INFO: renamed from: ۟ܰۚ, reason: not valid java name and contains not printable characters */
    public static int m55797(Object obj) {
        return ((ViewGroup) obj).getChildCount();
    }

    /* JADX INFO: renamed from: ۡۙ᩵, reason: not valid java name and contains not printable characters */
    public static void m55798(Object obj, int i) {
        ((AbstractC5996) obj).m13472(i);
    }

    /* JADX INFO: renamed from: ܰۗܽ, reason: not valid java name and contains not printable characters */
    public static boolean m55799(Object obj, Object obj2) {
        return ((String) obj).endsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ܳܳۧ, reason: not valid java name and contains not printable characters */
    public static int m55800() {
        return 1106450381;
    }

    /* JADX INFO: renamed from: ܶۙ᩵, reason: not valid java name and contains not printable characters */
    public static void m55801(Object obj) {
        C2700.m4192((AutoCloseable) obj);
    }

    /* JADX INFO: renamed from: ᩳ֫ۖ, reason: not valid java name and contains not printable characters */
    public static void m55802(Object obj, int i) {
        ((View) obj).setVisibility(i);
    }

    /* JADX INFO: renamed from: ᩴ᩵᩸, reason: not valid java name and contains not printable characters */
    public static void m55803(Object obj) {
        ((C14853) obj).m33956();
    }

    /* JADX INFO: renamed from: ᩵᩵ܽ, reason: not valid java name and contains not printable characters */
    public static void m55804(Object obj, Object obj2) {
        ((C10844) obj).write((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ᩶ۧܺ, reason: not valid java name and contains not printable characters */
    public static Object m55805(Object obj, Object obj2, Object obj3) {
        return ((HashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m6097(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m6096(Drawable drawable) {
        return drawable.getLayoutDirection();
    }
}
