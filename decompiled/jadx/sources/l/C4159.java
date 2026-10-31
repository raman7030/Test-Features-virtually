package l;

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

/* JADX INFO: renamed from: l.ۘ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes.dex */
public final class C4159 {

    /* JADX INFO: renamed from: ܶۗۡ, reason: not valid java name and contains not printable characters */
    public static boolean f13567;

    /* JADX INFO: renamed from: ۜܺ᩵, reason: not valid java name and contains not printable characters */
    public static int m12563(Object obj) {
        return ((List) obj).size();
    }

    /* JADX INFO: renamed from: ۜ᩺᩷, reason: not valid java name and contains not printable characters */
    public static void m12564(Object obj, Object obj2) {
        ((View) obj).setOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۟֡ܿ, reason: not valid java name and contains not printable characters */
    public static int m12565() {
        return -1097002647;
    }

    /* JADX INFO: renamed from: ۟۫ۤ, reason: not valid java name and contains not printable characters */
    public static MenuItem m12566(Object obj, boolean z) {
        return ((MenuItem) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ۟۫ᩳ, reason: not valid java name and contains not printable characters */
    public static int m12567(Object obj) {
        return ((MenuItem) obj).getItemId();
    }

    /* JADX INFO: renamed from: ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m12568(Object obj) {
        return ((AbstractC18605) obj).iterator();
    }

    /* JADX INFO: renamed from: ۡۨ֨, reason: not valid java name and contains not printable characters */
    public static AbstractC16891 m12569(Object obj) {
        return ((C16560) obj).m39044();
    }

    /* JADX INFO: renamed from: ۨ֡ۡ, reason: not valid java name and contains not printable characters */
    public static String m12570(Object obj) {
        return ((String) obj).trim();
    }

    /* JADX INFO: renamed from: ܶۖۘ, reason: not valid java name and contains not printable characters */
    public static Intent m12571(Object obj) {
        return ((Activity) obj).getIntent();
    }

    /* JADX INFO: renamed from: ܺ֡ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m12572(Object obj) {
        return ((C22933) obj).m51053();
    }

    /* JADX INFO: renamed from: ܽ۠֨, reason: not valid java name and contains not printable characters */
    public static C17793 m12573(long j) {
        return C17793.m41682(j);
    }

    /* JADX INFO: renamed from: ܽᩴۢ, reason: not valid java name and contains not printable characters */
    public static void m12574(Object obj, Object obj2) {
        ((ViewGroup) obj).addView((View) obj2);
    }

    /* JADX INFO: renamed from: ᩴۗᩴ, reason: not valid java name and contains not printable characters */
    public static void m12575(Object obj, Object obj2) {
        C11233.m27803(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ᩵ۚۜ, reason: not valid java name and contains not printable characters */
    public static C3059 m12576(Object obj) {
        return C15799.m37279((Exception) obj);
    }

    /* JADX INFO: renamed from: ᩷ܰۤ, reason: not valid java name and contains not printable characters */
    public static String m12577(Object obj) {
        return ((C19099) obj).m44019();
    }

    /* JADX INFO: renamed from: ᩻ۤܶ, reason: not valid java name and contains not printable characters */
    public static String m12578(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Action.Builder m12560(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m12562(Notification.Builder builder, Object obj) {
        return builder.setSmallIcon((Icon) obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m12561(Notification.Builder builder, Icon icon) {
        return builder.setLargeIcon(icon);
    }
}
