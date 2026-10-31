package l;

import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R54E */
/* JADX INFO: loaded from: classes.dex */
public final class C4117 {

    /* JADX INFO: renamed from: ܿ۬ܿ, reason: not valid java name and contains not printable characters */
    public static int f13076;

    /* JADX INFO: renamed from: ۜ۠ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m12349(Object obj) {
        return ((Activity) obj).isFinishing();
    }

    /* JADX INFO: renamed from: ۜ᩸ۜ, reason: not valid java name and contains not printable characters */
    public static Editable m12350(Object obj) {
        return ((EditText) obj).getText();
    }

    /* JADX INFO: renamed from: ۟ܳ᩻, reason: not valid java name and contains not printable characters */
    public static String m12351(Object obj, Object obj2) {
        return ((String) obj).concat((String) obj2);
    }

    /* JADX INFO: renamed from: ۠۠۫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m12352(Object obj, long j) {
        return ((StringBuilder) obj).append(j);
    }

    /* JADX INFO: renamed from: ۡۤ֡, reason: not valid java name and contains not printable characters */
    public static String m12353(Object obj) {
        return ((InterfaceC0748) obj).getTypeName();
    }

    /* JADX INFO: renamed from: ۤ֡ۖ, reason: not valid java name and contains not printable characters */
    public static Iterator m12354(Object obj) {
        return ((ArrayList) obj).iterator();
    }

    /* JADX INFO: renamed from: ۤ֨ۢ, reason: not valid java name and contains not printable characters */
    public static String m12355(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ֡ۘ, reason: not valid java name and contains not printable characters */
    public static AbstractC7379 m12356(Object obj) {
        return ((InterfaceC23586) obj).getLifecycle();
    }

    /* JADX INFO: renamed from: ۨܽ᩸, reason: not valid java name and contains not printable characters */
    public static JSONObject m12357() {
        return JSON.object();
    }

    /* JADX INFO: renamed from: ۨᩴܳ, reason: not valid java name and contains not printable characters */
    public static void m12358(Object obj, Object obj2) {
        C19926.m45879((String) obj, (Throwable) obj2);
    }

    /* JADX INFO: renamed from: ܳۚۚ, reason: not valid java name and contains not printable characters */
    public static String m12359(Object obj) {
        return ((AbstractC15440) obj).mo23554();
    }

    /* JADX INFO: renamed from: ᩵᩺ܳ, reason: not valid java name and contains not printable characters */
    public static Long m12360(long j) {
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ᩶ܺ᩻, reason: not valid java name and contains not printable characters */
    public static View m12361(Object obj, int i) {
        return ((ViewGroup) obj).getChildAt(i);
    }

    /* JADX INFO: renamed from: ᩹ۙᩴ, reason: not valid java name and contains not printable characters */
    public static int m12362(Object obj, int i) {
        return ((String) obj).indexOf(i);
    }

    /* JADX INFO: renamed from: ᩹ۤ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m12363(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: ᩻᩺۫, reason: not valid java name and contains not printable characters */
    public static int m12364() {
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12348(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
