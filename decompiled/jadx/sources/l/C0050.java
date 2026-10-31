package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import java.io.DataInputStream;

/* JADX INFO: renamed from: l.֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 05NO */
/* JADX INFO: loaded from: classes.dex */
public final class C0050 {

    /* JADX INFO: renamed from: ֫ۤܳ, reason: not valid java name and contains not printable characters */
    public static int f910;

    /* JADX INFO: renamed from: ֨᩶۬, reason: not valid java name and contains not printable characters */
    public static void m930(Object obj, Object obj2) {
        ((C8918) obj).m23012((String) obj2);
    }

    /* JADX INFO: renamed from: ۜᩴۗ, reason: not valid java name and contains not printable characters */
    public static void m934(Object obj, Object obj2) {
        ((C1109) obj).m3815((AbstractC7479) obj2);
    }

    /* JADX INFO: renamed from: ۠ܽ᩻, reason: not valid java name and contains not printable characters */
    public static String m935(int i) {
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: ۢۤܶ, reason: not valid java name and contains not printable characters */
    public static void m936() {
        C15528.m36596();
    }

    /* JADX INFO: renamed from: ۧ᩸֡, reason: not valid java name and contains not printable characters */
    public static void m937(Object obj, int i, Object obj2) {
        ((C13309) obj).m32289(i, obj2);
    }

    /* JADX INFO: renamed from: ۫ۢᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m938(Object obj, Object obj2) {
        return ((String) obj).contains((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܳۛ֡, reason: not valid java name and contains not printable characters */
    public static int m939(Object obj) {
        return ((DataInputStream) obj).readInt();
    }

    /* JADX INFO: renamed from: ܺ۬ۚ, reason: not valid java name and contains not printable characters */
    public static int m940() {
        return 711912257;
    }

    /* JADX INFO: renamed from: ᩳۜ۟, reason: not valid java name and contains not printable characters */
    public static String m941(Object obj) {
        return C15799.m37398((AbstractC15440) obj);
    }

    /* JADX INFO: renamed from: ᩴܽܽ, reason: not valid java name and contains not printable characters */
    public static int m942(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ᩹ۖۗ, reason: not valid java name and contains not printable characters */
    public static MenuItem m943(Object obj, boolean z) {
        return ((MenuItem) obj).setVisible(z);
    }

    /* JADX INFO: renamed from: ᩹ۘ۠, reason: not valid java name and contains not printable characters */
    public static void m944(Object obj, int i) {
        ((C8918) obj).m23018(i);
    }

    /* JADX INFO: renamed from: ᩹᩻ܽ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m945(Object obj, int i) {
        return ((StringBuilder) obj).append(i);
    }

    /* JADX INFO: renamed from: ᩻֫ۧ, reason: not valid java name and contains not printable characters */
    public static String m946(Object obj, int i) {
        return ((Context) obj).getString(i);
    }

    /* JADX INFO: renamed from: ᩻ۗۖ, reason: not valid java name and contains not printable characters */
    public static String m947(Object obj) {
        return obj.toString();
    }

    /* JADX INFO: renamed from: ᩻ۛ۠, reason: not valid java name and contains not printable characters */
    public static String m948(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m933(View view) {
        try {
            view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m931(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return C19370.m44628(i, "?");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m932() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
    }
}
