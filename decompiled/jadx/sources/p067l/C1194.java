package p067l;

import android.app.Activity;
import android.os.BaseBundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۟ */
/* JADX INFO: compiled from: N5RR */
/* JADX INFO: loaded from: classes.dex */
public final class C1194 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ۗۤۛ, reason: not valid java name and contains not printable characters */
    public static int f82045;

    /* JADX INFO: renamed from: ۘ۠ۖ, reason: not valid java name and contains not printable characters */
    public static int m56382(Object obj) {
        return ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX INFO: renamed from: ۚ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static void m56383(Object obj) {
        ((InterfaceC14770) obj).apply();
    }

    /* JADX INFO: renamed from: ۛ֡ۧ, reason: not valid java name and contains not printable characters */
    public static byte m56384(Object obj) {
        return ((C14677) obj).readByte();
    }

    /* JADX INFO: renamed from: ۜۛۛ, reason: not valid java name and contains not printable characters */
    public static void m56385(Object obj) {
        ((C9729) obj).close();
    }

    /* JADX INFO: renamed from: ۜܿܰ, reason: not valid java name and contains not printable characters */
    public static String m56386(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۢ᩷ᩴ, reason: not valid java name and contains not printable characters */
    public static long m56387(Object obj) {
        return ((C5738) obj).getSize();
    }

    /* JADX INFO: renamed from: ۢ᩺ۢ, reason: not valid java name and contains not printable characters */
    public static String m56388(Object obj, Object obj2) {
        return ((BaseBundle) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ۧ۠֫, reason: not valid java name and contains not printable characters */
    public static String m56389(Object obj) {
        return C16111.m36665((byte[]) obj);
    }

    /* JADX INFO: renamed from: ۧ۫ܺ, reason: not valid java name and contains not printable characters */
    public static void m56390(Object obj, int i) {
        ((C20671) obj).m46710(i);
    }

    /* JADX INFO: renamed from: ܶ᩸۬, reason: not valid java name and contains not printable characters */
    public static Window m56391(Object obj) {
        return ((Activity) obj).getWindow();
    }

    /* JADX INFO: renamed from: ܽܿۡ, reason: not valid java name and contains not printable characters */
    public static void m56392(Object obj) {
        ((Closeable) obj).close();
    }

    /* JADX INFO: renamed from: ᩴۗᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m56393(Object obj, Object obj2) {
        return ((ArrayList) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ᩵ᩳۡ, reason: not valid java name and contains not printable characters */
    public static MenuItem m56394(Object obj, int i) {
        return ((Menu) obj).findItem(i);
    }

    /* JADX INFO: renamed from: ᩶֫ۛ, reason: not valid java name and contains not printable characters */
    public static boolean m56395(Object obj) {
        return ((AbstractC17043) obj).mo25093();
    }

    /* JADX INFO: renamed from: ᩹ۚܶ, reason: not valid java name and contains not printable characters */
    public static int m56396() {
        return 405721252;
    }

    /* JADX INFO: renamed from: ᩻֡᩵, reason: not valid java name and contains not printable characters */
    public static boolean m56397(Object obj) {
        return ((String) obj).isEmpty();
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C1372(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C1372[i];
    }
}
