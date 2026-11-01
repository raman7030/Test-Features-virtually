package p067l;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֫᩵ */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0942 {

    /* JADX INFO: renamed from: ܶ᩻᩷, reason: not valid java name and contains not printable characters */
    public static int f81890;

    /* JADX INFO: renamed from: ֡ۛۧ, reason: not valid java name and contains not printable characters */
    public static void m55956(Object obj, Object obj2) {
        ((C1326) obj).setNavigationOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ֨ۤۖ, reason: not valid java name and contains not printable characters */
    public static C16820 m55957(Object obj) {
        return C16820.m38130((InputStream) obj);
    }

    /* JADX INFO: renamed from: ۘۤ۫, reason: not valid java name and contains not printable characters */
    public static void m55958(Object obj) {
        ((C10844) obj).close();
    }

    /* JADX INFO: renamed from: ۙۘᩳ, reason: not valid java name and contains not printable characters */
    public static Looper m55959() {
        return Looper.myLooper();
    }

    /* JADX INFO: renamed from: ۜ֫ܳ, reason: not valid java name and contains not printable characters */
    public static String m55960(Object obj, int i) {
        return C3865.m7621((C25065) obj, i);
    }

    /* JADX INFO: renamed from: ۟ۚۘ, reason: not valid java name and contains not printable characters */
    public static boolean m55961(Object obj, int i) {
        return ((C20689) obj).m46754(i);
    }

    /* JADX INFO: renamed from: ۡ۬ܳ, reason: not valid java name and contains not printable characters */
    public static Class m55962(Object obj) {
        return obj.getClass();
    }

    /* JADX INFO: renamed from: ۫۠ۗ, reason: not valid java name and contains not printable characters */
    public static Context m55963(Object obj) {
        return ((View) obj).getContext();
    }

    /* JADX INFO: renamed from: ܰ۫ܺ, reason: not valid java name and contains not printable characters */
    public static String m55964() {
        return C24414.m53855();
    }

    /* JADX INFO: renamed from: ܳ۟ۖ, reason: not valid java name and contains not printable characters */
    public static void m55965(Object obj, int i, Object obj2, int i2, int i3) {
        System.arraycopy(obj, i, obj2, i2, i3);
    }

    /* JADX INFO: renamed from: ܳ᩺۟, reason: not valid java name and contains not printable characters */
    public static boolean m55966(Object obj) {
        return ((AbstractC17043) obj).mo25503();
    }

    /* JADX INFO: renamed from: ܶܰۧ, reason: not valid java name and contains not printable characters */
    public static String m55967(Object obj, Object obj2) {
        return ((Intent) obj).getStringExtra((String) obj2);
    }

    /* JADX INFO: renamed from: ᩺ۗۛ, reason: not valid java name and contains not printable characters */
    public static void m55968(Object obj, int i) {
        C2641.m4030((TextInputLayout) obj, i);
    }

    /* JADX INFO: renamed from: ᩺᩹᩷, reason: not valid java name and contains not printable characters */
    public static int m55969(Object obj) {
        return Integer.parseInt((String) obj);
    }

    /* JADX INFO: renamed from: ᩻ۚܺ, reason: not valid java name and contains not printable characters */
    public static String m55970(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩻ۧܶ, reason: not valid java name and contains not printable characters */
    public static boolean m55971() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8701(C1991 c1991);
}
