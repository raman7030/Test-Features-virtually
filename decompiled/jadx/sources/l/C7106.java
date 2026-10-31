package l;

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

/* JADX INFO: renamed from: l.۟, reason: contains not printable characters */
/* JADX INFO: compiled from: N5RR */
/* JADX INFO: loaded from: classes.dex */
public final class C7106 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ۗۤۛ, reason: not valid java name and contains not printable characters */
    public static int f21815;

    /* JADX INFO: renamed from: ۘ۠ۖ, reason: not valid java name and contains not printable characters */
    public static int m19106(Object obj) {
        return ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX INFO: renamed from: ۚ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static void m19107(Object obj) {
        ((InterfaceC13049) obj).apply();
    }

    /* JADX INFO: renamed from: ۛ֡ۧ, reason: not valid java name and contains not printable characters */
    public static byte m19108(Object obj) {
        return ((C12951) obj).readByte();
    }

    /* JADX INFO: renamed from: ۜۛۛ, reason: not valid java name and contains not printable characters */
    public static void m19109(Object obj) {
        ((C7744) obj).close();
    }

    /* JADX INFO: renamed from: ۜܿܰ, reason: not valid java name and contains not printable characters */
    public static String m19110(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۢ᩷ᩴ, reason: not valid java name and contains not printable characters */
    public static long m19111(Object obj) {
        return ((C3545) obj).getSize();
    }

    /* JADX INFO: renamed from: ۢ᩺ۢ, reason: not valid java name and contains not printable characters */
    public static String m19112(Object obj, Object obj2) {
        return ((BaseBundle) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ۧ۠֫, reason: not valid java name and contains not printable characters */
    public static String m19113(Object obj) {
        return C14460.m34531((byte[]) obj);
    }

    /* JADX INFO: renamed from: ۧ۫ܺ, reason: not valid java name and contains not printable characters */
    public static void m19114(Object obj, int i) {
        ((C19258) obj).m44416(i);
    }

    /* JADX INFO: renamed from: ܶ᩸۬, reason: not valid java name and contains not printable characters */
    public static Window m19115(Object obj) {
        return ((Activity) obj).getWindow();
    }

    /* JADX INFO: renamed from: ܽܿۡ, reason: not valid java name and contains not printable characters */
    public static void m19116(Object obj) {
        ((Closeable) obj).close();
    }

    /* JADX INFO: renamed from: ᩴۗᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m19117(Object obj, Object obj2) {
        return ((ArrayList) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ᩵ᩳۡ, reason: not valid java name and contains not printable characters */
    public static MenuItem m19118(Object obj, int i) {
        return ((Menu) obj).findItem(i);
    }

    /* JADX INFO: renamed from: ᩶֫ۛ, reason: not valid java name and contains not printable characters */
    public static boolean m19119(Object obj) {
        return ((AbstractC15440) obj).mo23119();
    }

    /* JADX INFO: renamed from: ᩹ۚܶ, reason: not valid java name and contains not printable characters */
    public static int m19120() {
        return 405721252;
    }

    /* JADX INFO: renamed from: ᩻֡᩵, reason: not valid java name and contains not printable characters */
    public static boolean m19121(Object obj) {
        return ((String) obj).isEmpty();
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C10677(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C10677[i];
    }
}
