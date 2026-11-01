package p067l;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.json.JSONObject;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֫᩹ */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes.dex */
public final class C0946 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: ᩶ۘۘ, reason: not valid java name and contains not printable characters */
    public static int f81894;

    /* JADX INFO: renamed from: ֫ᩴۘ, reason: not valid java name and contains not printable characters */
    public static MenuItem m55972(Object obj, int i, int i2, int i3, int i4) {
        return ((Menu) obj).add(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۘ۠ۜ, reason: not valid java name and contains not printable characters */
    public static void m55973(Object obj, Object obj2) {
        ((Executor) obj).execute((Runnable) obj2);
    }

    /* JADX INFO: renamed from: ۛ᩹ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m55974(Object obj, Object obj2) {
        return ((String) obj).equalsIgnoreCase((String) obj2);
    }

    /* JADX INFO: renamed from: ۡۗ֡, reason: not valid java name and contains not printable characters */
    public static long m55975(Object obj, int i) {
        return ((C4949) obj).m10493(i);
    }

    /* JADX INFO: renamed from: ۢ᩻ۖ, reason: not valid java name and contains not printable characters */
    public static void m55976(Object obj, int i) {
        ((TextView) obj).setText(i);
    }

    /* JADX INFO: renamed from: ۧۛ᩵, reason: not valid java name and contains not printable characters */
    public static StringBuilder m55977(Object obj, char c) {
        return ((StringBuilder) obj).append(c);
    }

    /* JADX INFO: renamed from: ۨۘ᩷, reason: not valid java name and contains not printable characters */
    public static Looper m55978() {
        return Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: ܶܺ֨, reason: not valid java name and contains not printable characters */
    public static int m55979(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ܽ᩶ۘ, reason: not valid java name and contains not printable characters */
    public static int m55980() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩳ֫۬, reason: not valid java name and contains not printable characters */
    public static void m55981(Object obj, Object obj2) {
        ((AbstractC5996) obj).mo13456((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩵֫ۛ, reason: not valid java name and contains not printable characters */
    public static void m55982(Object obj) {
        ((View) obj).invalidate();
    }

    /* JADX INFO: renamed from: ᩵ۤ᩵, reason: not valid java name and contains not printable characters */
    public static void m55983(Object obj, Object obj2, int i, int i2, int i3) {
        ((SpannableStringBuilder) obj).setSpan(obj2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ᩹ۢ۬, reason: not valid java name and contains not printable characters */
    public static void m55984(Object obj, Object obj2) {
        ((C13220) obj).m30230((String) obj2);
    }

    /* JADX INFO: renamed from: ᩺᩷ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC17043 m55985(Object obj) {
        return ((AbstractC17043) obj).m38685();
    }

    /* JADX INFO: renamed from: ᩻۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m55986(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩻ۨ᩸, reason: not valid java name and contains not printable characters */
    public static String m55987(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).getString((String) obj2, (String) obj3);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C1401(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C1401(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C1401[i];
    }
}
