package l;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: CB27 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1108 implements Runnable {

    /* JADX INFO: renamed from: ۬᩷᩶, reason: not valid java name and contains not printable characters */
    public static boolean f4040;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23706 f4041;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Typeface f4042;

    /* JADX INFO: renamed from: ֡֨ۖ, reason: not valid java name and contains not printable characters */
    public static void m3780(Object obj, Object obj2) {
        ((AbstractActivityC3346) obj).m10227((C9762) obj2);
    }

    /* JADX INFO: renamed from: ֫ۗۗ, reason: not valid java name and contains not printable characters */
    public static void m3781(Object obj) {
        ((Activity) obj).finish();
    }

    /* JADX INFO: renamed from: ֫ۨᩳ, reason: not valid java name and contains not printable characters */
    public static C17793 m3782(Object obj, Object obj2) {
        return ((C17793) obj).m41705((C17793) obj2);
    }

    /* JADX INFO: renamed from: ۗܺܶ, reason: not valid java name and contains not printable characters */
    public static int m3783(int i, int i2) {
        return Math.min(i, i2);
    }

    /* JADX INFO: renamed from: ۗ᩺᩺, reason: not valid java name and contains not printable characters */
    public static int m3784(Object obj) {
        return ((C5896) obj).m16535();
    }

    /* JADX INFO: renamed from: ۘۖܶ, reason: not valid java name and contains not printable characters */
    public static void m3785(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX INFO: renamed from: ۚۚۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3786(Object obj, Object obj2) {
        return ((C17087) obj).mo40098((C17087) obj2);
    }

    /* JADX INFO: renamed from: ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static C18237 m3787(int i) {
        return C18237.m42480(i);
    }

    /* JADX INFO: renamed from: ۠۬᩵, reason: not valid java name and contains not printable characters */
    public static void m3788(Object obj, Object obj2, Object obj3) {
        ((AbstractC0302) obj).m1668((InterfaceC23586) obj2, (InterfaceC1008) obj3);
    }

    /* JADX INFO: renamed from: ۢܽ֨, reason: not valid java name and contains not printable characters */
    public static String m3789(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۬֫ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3790() {
        return false;
    }

    /* JADX INFO: renamed from: ۬ۖܳ, reason: not valid java name and contains not printable characters */
    public static Object m3791(Object obj) {
        return ((Iterator) obj).next();
    }

    /* JADX INFO: renamed from: ᩴۙܳ, reason: not valid java name and contains not printable characters */
    public static String m3792(Object obj) {
        return ((AbstractC16891) obj).m39741();
    }

    /* JADX INFO: renamed from: ᩵۫ۡ, reason: not valid java name and contains not printable characters */
    public static Object m3793(Object obj, Object obj2) {
        return ((Context) obj).getSystemService((String) obj2);
    }

    /* JADX INFO: renamed from: ᩵ᩳ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3794(Object obj) {
        return ((C3545) obj).isDirectory();
    }

    /* JADX INFO: renamed from: ᩶᩺ܽ, reason: not valid java name and contains not printable characters */
    public static void m3795(Object obj, Object obj2, Object obj3) {
        C19568.m45009((C16560) obj, (InterfaceC17889) obj2, (InterfaceC18862) obj3);
    }

    public RunnableC1108(C23706 c23706, Typeface typeface) {
        this.f4041 = c23706;
        this.f4042 = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4041.m52268(this.f4042);
    }
}
