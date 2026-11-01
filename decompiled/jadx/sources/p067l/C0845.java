package p067l;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import java.io.DataInputStream;

/* JADX INFO: renamed from: l.֡֡ */
/* JADX INFO: compiled from: 05NO */
/* JADX INFO: loaded from: classes.dex */
public final class C0845 {

    /* JADX INFO: renamed from: ֫ۤܳ, reason: not valid java name and contains not printable characters */
    public static int f81821;

    /* JADX INFO: renamed from: ֨᩶۬, reason: not valid java name and contains not printable characters */
    public static void m55577(Object obj, Object obj2) {
        ((C10844) obj).m24986((String) obj2);
    }

    /* JADX INFO: renamed from: ۜᩴۗ, reason: not valid java name and contains not printable characters */
    public static void m55578(Object obj, Object obj2) {
        ((C3422) obj).m6072((AbstractC9476) obj2);
    }

    /* JADX INFO: renamed from: ۠ܽ᩻, reason: not valid java name and contains not printable characters */
    public static String m55579(int i) {
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: ۢۤܶ, reason: not valid java name and contains not printable characters */
    public static void m55580() {
        C17127.m38756();
    }

    /* JADX INFO: renamed from: ۧ᩸֡, reason: not valid java name and contains not printable characters */
    public static void m55581(Object obj, int i, Object obj2) {
        ((C1502) obj).m34390(i, obj2);
    }

    /* JADX INFO: renamed from: ۫ۢᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m55582(Object obj, Object obj2) {
        return ((String) obj).contains((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܳۛ֡, reason: not valid java name and contains not printable characters */
    public static int m55583(Object obj) {
        return ((DataInputStream) obj).readInt();
    }

    /* JADX INFO: renamed from: ܺ۬ۚ, reason: not valid java name and contains not printable characters */
    public static int m55584() {
        return 711912257;
    }

    /* JADX INFO: renamed from: ᩳۜ۟, reason: not valid java name and contains not printable characters */
    public static String m55585(Object obj) {
        return C17384.m39569((AbstractC17043) obj);
    }

    /* JADX INFO: renamed from: ᩴܽܽ, reason: not valid java name and contains not printable characters */
    public static int m55586(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ᩹ۖۗ, reason: not valid java name and contains not printable characters */
    public static MenuItem m55587(Object obj, boolean z) {
        return ((MenuItem) obj).setVisible(z);
    }

    /* JADX INFO: renamed from: ᩹ۘ۠, reason: not valid java name and contains not printable characters */
    public static void m55588(Object obj, int i) {
        ((C10844) obj).m24992(i);
    }

    /* JADX INFO: renamed from: ᩹᩻ܽ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m55589(Object obj, int i) {
        return ((StringBuilder) obj).append(i);
    }

    /* JADX INFO: renamed from: ᩻֫ۧ, reason: not valid java name and contains not printable characters */
    public static String m55590(Object obj, int i) {
        return ((Context) obj).getString(i);
    }

    /* JADX INFO: renamed from: ᩻ۗۖ, reason: not valid java name and contains not printable characters */
    public static String m55591(Object obj) {
        return obj.toString();
    }

    /* JADX INFO: renamed from: ᩻ۛ۠, reason: not valid java name and contains not printable characters */
    public static String m55592(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3343(View view) {
        try {
            view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m3341(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return C20778.m46922(i, "?");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3342() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
    }
}
