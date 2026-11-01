package p067l;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨۫ */
/* JADX INFO: compiled from: CB27 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0897 implements Runnable {

    /* JADX INFO: renamed from: ۬᩷᩶, reason: not valid java name and contains not printable characters */
    public static boolean f81856;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2018 f6812;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Typeface f6813;

    /* JADX INFO: renamed from: ֡֨ۖ, reason: not valid java name and contains not printable characters */
    public static void m55774(Object obj, Object obj2) {
        ((AbstractActivityC5549) obj).m12263((C1326) obj2);
    }

    /* JADX INFO: renamed from: ֫ۗۗ, reason: not valid java name and contains not printable characters */
    public static void m55775(Object obj) {
        ((Activity) obj).finish();
    }

    /* JADX INFO: renamed from: ֫ۨᩳ, reason: not valid java name and contains not printable characters */
    public static C19279 m55776(Object obj, Object obj2) {
        return ((C19279) obj).m43951((C19279) obj2);
    }

    /* JADX INFO: renamed from: ۗܺܶ, reason: not valid java name and contains not printable characters */
    public static int m55777(int i, int i2) {
        return Math.min(i, i2);
    }

    /* JADX INFO: renamed from: ۗ᩺᩺, reason: not valid java name and contains not printable characters */
    public static int m55778(Object obj) {
        return ((C7972) obj).m18461();
    }

    /* JADX INFO: renamed from: ۘۖܶ, reason: not valid java name and contains not printable characters */
    public static void m55779(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX INFO: renamed from: ۚۚۧ, reason: not valid java name and contains not printable characters */
    public static boolean m55780(Object obj, Object obj2) {
        return ((C18608) obj).mo42343((C18608) obj2);
    }

    /* JADX INFO: renamed from: ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static C19701 m55781(int i) {
        return C19701.m44739(i);
    }

    /* JADX INFO: renamed from: ۠۬᩵, reason: not valid java name and contains not printable characters */
    public static void m55782(Object obj, Object obj2, Object obj3) {
        ((AbstractC2655) obj).m4066((InterfaceC24784) obj2, (InterfaceC3326) obj3);
    }

    /* JADX INFO: renamed from: ۢܽ֨, reason: not valid java name and contains not printable characters */
    public static String m55783(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۬֫ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m55784() {
        return false;
    }

    /* JADX INFO: renamed from: ۬ۖܳ, reason: not valid java name and contains not printable characters */
    public static Object m55785(Object obj) {
        return ((Iterator) obj).next();
    }

    /* JADX INFO: renamed from: ᩴۙܳ, reason: not valid java name and contains not printable characters */
    public static String m55786(Object obj) {
        return ((AbstractC18422) obj).m41982();
    }

    /* JADX INFO: renamed from: ᩵۫ۡ, reason: not valid java name and contains not printable characters */
    public static Object m55787(Object obj, Object obj2) {
        return ((Context) obj).getSystemService((String) obj2);
    }

    /* JADX INFO: renamed from: ᩵ᩳ۠, reason: not valid java name and contains not printable characters */
    public static boolean m55788(Object obj) {
        return ((C5738) obj).isDirectory();
    }

    /* JADX INFO: renamed from: ᩶᩺ܽ, reason: not valid java name and contains not printable characters */
    public static void m55789(Object obj, Object obj2, Object obj3) {
        C20966.m47304((C18107) obj, (InterfaceC19370) obj2, (InterfaceC20295) obj3);
    }

    public RunnableC0897(C2018 c2018, Typeface typeface) {
        this.f6812 = c2018;
        this.f6813 = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6812.m54671(this.f6813);
    }
}
