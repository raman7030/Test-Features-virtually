package p067l;

import android.app.Notification;
import android.app.Person;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.json.JSONObject;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֡᩶ */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes.dex */
public final class C0873 {

    /* JADX INFO: renamed from: ܳܶ۠, reason: not valid java name and contains not printable characters */
    public static int f81841;

    /* JADX INFO: renamed from: ֡ۚ᩹, reason: not valid java name and contains not printable characters */
    public static void m55676(Object obj, Object obj2) {
        ((Executor) obj).execute((Runnable) obj2);
    }

    /* JADX INFO: renamed from: ۘܶ᩹, reason: not valid java name and contains not printable characters */
    public static long m55677(Object obj, int i) {
        return ((C4949) obj).m10493(i);
    }

    /* JADX INFO: renamed from: ۚ֨֨, reason: not valid java name and contains not printable characters */
    public static boolean m55678() {
        return false;
    }

    /* JADX INFO: renamed from: ۛ֫᩵, reason: not valid java name and contains not printable characters */
    public static Looper m55679() {
        return Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: ۜ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m55680(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۜ᩵֨, reason: not valid java name and contains not printable characters */
    public static StringBuilder m55681(Object obj, char c) {
        return ((StringBuilder) obj).append(c);
    }

    /* JADX INFO: renamed from: ۟ܿۡ, reason: not valid java name and contains not printable characters */
    public static boolean m55682(Object obj, Object obj2) {
        return ((String) obj).equalsIgnoreCase((String) obj2);
    }

    /* JADX INFO: renamed from: ۠᩸ۗ, reason: not valid java name and contains not printable characters */
    public static void m55683(Object obj, Object obj2) {
        ((C13220) obj).m30230((String) obj2);
    }

    /* JADX INFO: renamed from: ۢ۠᩶, reason: not valid java name and contains not printable characters */
    public static void m55684(Object obj, int i) {
        ((TextView) obj).setText(i);
    }

    /* JADX INFO: renamed from: ۤۡۖ, reason: not valid java name and contains not printable characters */
    public static String m55685(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ܿ۟֫, reason: not valid java name and contains not printable characters */
    public static void m55686(Object obj, Object obj2) {
        ((AbstractC5996) obj).mo13456((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܿܶܿ, reason: not valid java name and contains not printable characters */
    public static MenuItem m55687(Object obj, int i, int i2, int i3, int i4) {
        return ((Menu) obj).add(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ᩳ۠ۖ, reason: not valid java name and contains not printable characters */
    public static void m55688(Object obj) {
        ((View) obj).invalidate();
    }

    /* JADX INFO: renamed from: ᩶ۚۛ, reason: not valid java name and contains not printable characters */
    public static String m55689(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩸᩸ۛ, reason: not valid java name and contains not printable characters */
    public static void m55690(Object obj, Object obj2, int i, int i2, int i3) {
        ((SpannableStringBuilder) obj).setSpan(obj2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ᩺ܳ᩵, reason: not valid java name and contains not printable characters */
    public static AbstractC17043 m55691(Object obj) {
        return ((AbstractC17043) obj).m38685();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Action.Builder m4916(Notification.Action.Builder builder, int i) {
        return builder.setSemanticAction(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m4917(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }
}
