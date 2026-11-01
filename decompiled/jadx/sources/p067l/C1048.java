package p067l;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ᩶ */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes.dex */
public final class C1048 {

    /* JADX INFO: renamed from: ܶۗۡ, reason: not valid java name and contains not printable characters */
    public static boolean f81963;

    /* JADX INFO: renamed from: ۜܺ᩵, reason: not valid java name and contains not printable characters */
    public static int m56303(Object obj) {
        return ((List) obj).size();
    }

    /* JADX INFO: renamed from: ۜ᩺᩷, reason: not valid java name and contains not printable characters */
    public static void m56304(Object obj, Object obj2) {
        ((View) obj).setOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۟֡ܿ, reason: not valid java name and contains not printable characters */
    public static int m56305() {
        return -1097002647;
    }

    /* JADX INFO: renamed from: ۟۫ۤ, reason: not valid java name and contains not printable characters */
    public static MenuItem m56306(Object obj, boolean z) {
        return ((MenuItem) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ۟۫ᩳ, reason: not valid java name and contains not printable characters */
    public static int m56307(Object obj) {
        return ((MenuItem) obj).getItemId();
    }

    /* JADX INFO: renamed from: ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m56308(Object obj) {
        return ((AbstractC20050) obj).iterator();
    }

    /* JADX INFO: renamed from: ۡۨ֨, reason: not valid java name and contains not printable characters */
    public static AbstractC18422 m56309(Object obj) {
        return ((C18107) obj).m41270();
    }

    /* JADX INFO: renamed from: ۨ֡ۡ, reason: not valid java name and contains not printable characters */
    public static String m56310(Object obj) {
        return ((String) obj).trim();
    }

    /* JADX INFO: renamed from: ܶۖۘ, reason: not valid java name and contains not printable characters */
    public static Intent m56311(Object obj) {
        return ((Activity) obj).getIntent();
    }

    /* JADX INFO: renamed from: ܺ֡ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m56312(Object obj) {
        return ((C24164) obj).m53444();
    }

    /* JADX INFO: renamed from: ܽ۠֨, reason: not valid java name and contains not printable characters */
    public static C19279 m56313(long j) {
        return C19279.m43928(j);
    }

    /* JADX INFO: renamed from: ܽᩴۢ, reason: not valid java name and contains not printable characters */
    public static void m56314(Object obj, Object obj2) {
        ((ViewGroup) obj).addView((View) obj2);
    }

    /* JADX INFO: renamed from: ᩴۗᩴ, reason: not valid java name and contains not printable characters */
    public static void m56315(Object obj, Object obj2) {
        C13045.m29865(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ᩵ۚۜ, reason: not valid java name and contains not printable characters */
    public static C5276 m56316(Object obj) {
        return C17384.m39450((Exception) obj);
    }

    /* JADX INFO: renamed from: ᩷ܰۤ, reason: not valid java name and contains not printable characters */
    public static String m56317(Object obj) {
        return ((C20521) obj).m46313();
    }

    /* JADX INFO: renamed from: ᩻ۤܶ, reason: not valid java name and contains not printable characters */
    public static String m56318(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Action.Builder m14450(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m14452(Notification.Builder builder, Object obj) {
        return builder.setSmallIcon((Icon) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m14451(Notification.Builder builder, Icon icon) {
        return builder.setLargeIcon(icon);
    }
}
