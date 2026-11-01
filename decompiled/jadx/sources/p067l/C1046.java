package p067l;

import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘᩴ */
/* JADX INFO: compiled from: R54E */
/* JADX INFO: loaded from: classes.dex */
public final class C1046 {

    /* JADX INFO: renamed from: ܿ۬ܿ, reason: not valid java name and contains not printable characters */
    public static int f81962;

    /* JADX INFO: renamed from: ۜ۠ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m56287(Object obj) {
        return ((Activity) obj).isFinishing();
    }

    /* JADX INFO: renamed from: ۜ᩸ۜ, reason: not valid java name and contains not printable characters */
    public static Editable m56288(Object obj) {
        return ((EditText) obj).getText();
    }

    /* JADX INFO: renamed from: ۟ܳ᩻, reason: not valid java name and contains not printable characters */
    public static String m56289(Object obj, Object obj2) {
        return ((String) obj).concat((String) obj2);
    }

    /* JADX INFO: renamed from: ۠۠۫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m56290(Object obj, long j) {
        return ((StringBuilder) obj).append(j);
    }

    /* JADX INFO: renamed from: ۡۤ֡, reason: not valid java name and contains not printable characters */
    public static String m56291(Object obj) {
        return ((InterfaceC3080) obj).getTypeName();
    }

    /* JADX INFO: renamed from: ۤ֡ۖ, reason: not valid java name and contains not printable characters */
    public static Iterator m56292(Object obj) {
        return ((ArrayList) obj).iterator();
    }

    /* JADX INFO: renamed from: ۤ֨ۢ, reason: not valid java name and contains not printable characters */
    public static String m56293(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ֡ۘ, reason: not valid java name and contains not printable characters */
    public static AbstractC9381 m56294(Object obj) {
        return ((InterfaceC24784) obj).getLifecycle();
    }

    /* JADX INFO: renamed from: ۨܽ᩸, reason: not valid java name and contains not printable characters */
    public static JSONObject m56295() {
        return JSON.object();
    }

    /* JADX INFO: renamed from: ۨᩴܳ, reason: not valid java name and contains not printable characters */
    public static void m56296(Object obj, Object obj2) {
        C21306.m48192((String) obj, (Throwable) obj2);
    }

    /* JADX INFO: renamed from: ܳۚۚ, reason: not valid java name and contains not printable characters */
    public static String m56297(Object obj) {
        return ((AbstractC17043) obj).mo25505();
    }

    /* JADX INFO: renamed from: ᩵᩺ܳ, reason: not valid java name and contains not printable characters */
    public static Long m56298(long j) {
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ᩶ܺ᩻, reason: not valid java name and contains not printable characters */
    public static View m56299(Object obj, int i) {
        return ((ViewGroup) obj).getChildAt(i);
    }

    /* JADX INFO: renamed from: ᩹ۙᩴ, reason: not valid java name and contains not printable characters */
    public static int m56300(Object obj, int i) {
        return ((String) obj).indexOf(i);
    }

    /* JADX INFO: renamed from: ᩹ۤ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m56301(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: ᩻᩺۫, reason: not valid java name and contains not printable characters */
    public static int m56302() {
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14253(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
