package l;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes.dex */
public final class C2105 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: ᩶ۘۘ, reason: not valid java name and contains not printable characters */
    public static int f7037;

    /* JADX INFO: renamed from: ֫ᩴۘ, reason: not valid java name and contains not printable characters */
    public static MenuItem m6974(Object obj, int i, int i2, int i3, int i4) {
        return ((Menu) obj).add(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۘ۠ۜ, reason: not valid java name and contains not printable characters */
    public static void m6975(Object obj, Object obj2) {
        ((Executor) obj).execute((Runnable) obj2);
    }

    /* JADX INFO: renamed from: ۛ᩹ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6976(Object obj, Object obj2) {
        return ((String) obj).equalsIgnoreCase((String) obj2);
    }

    /* JADX INFO: renamed from: ۡۗ֡, reason: not valid java name and contains not printable characters */
    public static long m6977(Object obj, int i) {
        return ((C2715) obj).m8447(i);
    }

    /* JADX INFO: renamed from: ۢ᩻ۖ, reason: not valid java name and contains not printable characters */
    public static void m6978(Object obj, int i) {
        ((TextView) obj).setText(i);
    }

    /* JADX INFO: renamed from: ۧۛ᩵, reason: not valid java name and contains not printable characters */
    public static StringBuilder m6979(Object obj, char c) {
        return ((StringBuilder) obj).append(c);
    }

    /* JADX INFO: renamed from: ۨۘ᩷, reason: not valid java name and contains not printable characters */
    public static Looper m6980() {
        return Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: ܶܺ֨, reason: not valid java name and contains not printable characters */
    public static int m6981(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ܽ᩶ۘ, reason: not valid java name and contains not printable characters */
    public static int m6982() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩳ֫۬, reason: not valid java name and contains not printable characters */
    public static void m6983(Object obj, Object obj2) {
        ((AbstractC3817) obj).mo11520((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩵֫ۛ, reason: not valid java name and contains not printable characters */
    public static void m6984(Object obj) {
        ((View) obj).invalidate();
    }

    /* JADX INFO: renamed from: ᩵ۤ᩵, reason: not valid java name and contains not printable characters */
    public static void m6985(Object obj, Object obj2, int i, int i2, int i3) {
        ((SpannableStringBuilder) obj).setSpan(obj2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ᩹ۢ۬, reason: not valid java name and contains not printable characters */
    public static void m6986(Object obj, Object obj2) {
        ((C11418) obj).m28186((String) obj2);
    }

    /* JADX INFO: renamed from: ᩺᩷ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m6987(Object obj) {
        return ((AbstractC15440) obj).m36527();
    }

    /* JADX INFO: renamed from: ᩻۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m6988(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩻ۨ᩸, reason: not valid java name and contains not printable characters */
    public static String m6989(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).getString((String) obj2, (String) obj3);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C11278(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C11278(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C11278[i];
    }
}
