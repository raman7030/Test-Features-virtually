package l;

import android.app.Notification;
import android.app.Person;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֡᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes.dex */
public final class C0630 {

    /* JADX INFO: renamed from: ܳܶ۠, reason: not valid java name and contains not printable characters */
    public static int f2410;

    /* JADX INFO: renamed from: ֡ۚ᩹, reason: not valid java name and contains not printable characters */
    public static void m2560(Object obj, Object obj2) {
        ((Executor) obj).execute((Runnable) obj2);
    }

    /* JADX INFO: renamed from: ۘܶ᩹, reason: not valid java name and contains not printable characters */
    public static long m2563(Object obj, int i) {
        return ((C2715) obj).m8447(i);
    }

    /* JADX INFO: renamed from: ۚ֨֨, reason: not valid java name and contains not printable characters */
    public static boolean m2564() {
        return false;
    }

    /* JADX INFO: renamed from: ۛ֫᩵, reason: not valid java name and contains not printable characters */
    public static Looper m2565() {
        return Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: ۜ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m2566(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۜ᩵֨, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2567(Object obj, char c) {
        return ((StringBuilder) obj).append(c);
    }

    /* JADX INFO: renamed from: ۟ܿۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2568(Object obj, Object obj2) {
        return ((String) obj).equalsIgnoreCase((String) obj2);
    }

    /* JADX INFO: renamed from: ۠᩸ۗ, reason: not valid java name and contains not printable characters */
    public static void m2569(Object obj, Object obj2) {
        ((C11418) obj).m28186((String) obj2);
    }

    /* JADX INFO: renamed from: ۢ۠᩶, reason: not valid java name and contains not printable characters */
    public static void m2570(Object obj, int i) {
        ((TextView) obj).setText(i);
    }

    /* JADX INFO: renamed from: ۤۡۖ, reason: not valid java name and contains not printable characters */
    public static String m2571(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ܿ۟֫, reason: not valid java name and contains not printable characters */
    public static void m2572(Object obj, Object obj2) {
        ((AbstractC3817) obj).mo11520((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܿܶܿ, reason: not valid java name and contains not printable characters */
    public static MenuItem m2573(Object obj, int i, int i2, int i3, int i4) {
        return ((Menu) obj).add(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ᩳ۠ۖ, reason: not valid java name and contains not printable characters */
    public static void m2574(Object obj) {
        ((View) obj).invalidate();
    }

    /* JADX INFO: renamed from: ᩶ۚۛ, reason: not valid java name and contains not printable characters */
    public static String m2575(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩸᩸ۛ, reason: not valid java name and contains not printable characters */
    public static void m2576(Object obj, Object obj2, int i, int i2, int i3) {
        ((SpannableStringBuilder) obj).setSpan(obj2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ᩺ܳ᩵, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m2577(Object obj) {
        return ((AbstractC15440) obj).m36527();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Action.Builder m2561(Notification.Action.Builder builder, int i) {
        return builder.setSemanticAction(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m2562(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }
}
