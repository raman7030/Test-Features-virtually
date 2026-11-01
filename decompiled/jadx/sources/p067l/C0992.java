package p067l;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۚ */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes.dex */
public final class C0992 {

    /* JADX INFO: renamed from: ܶۛᩴ, reason: not valid java name and contains not printable characters */
    public static int f81922;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C1342 f12350;

    /* JADX INFO: renamed from: ۧ */
    public float f12348 = Float.NaN;

    /* JADX INFO: renamed from: ܽ */
    public int f12349 = -1;

    /* JADX INFO: renamed from: ֫ */
    public int f12347 = -1;

    /* JADX INFO: renamed from: ۖܽܳ, reason: not valid java name and contains not printable characters */
    public static int m56101(Object obj) {
        return ((InterfaceC4059) obj).mo4189();
    }

    /* JADX INFO: renamed from: ۙ۟ܺ, reason: not valid java name and contains not printable characters */
    public static String m56102(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۜۜۙ, reason: not valid java name and contains not printable characters */
    public static void m56103(Object obj) throws IOException {
        ((OutputStream) obj).close();
    }

    /* JADX INFO: renamed from: ۟ۡ֨, reason: not valid java name and contains not printable characters */
    public static void m56104(Object obj, Object obj2) {
        ((C20671) obj).m46718((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۟ᩴܰ, reason: not valid java name and contains not printable characters */
    public static void m56105(Object obj) {
        C21306.m48191((String) obj);
    }

    /* JADX INFO: renamed from: ۤۧۜ, reason: not valid java name and contains not printable characters */
    public static Bundle m56106(Object obj) {
        return ((ComponentCallbacksC11117) obj).requireArguments();
    }

    /* JADX INFO: renamed from: ۤۧ᩺, reason: not valid java name and contains not printable characters */
    public static int m56107() {
        return 971925145;
    }

    /* JADX INFO: renamed from: ۧ۫᩺, reason: not valid java name and contains not printable characters */
    public static boolean m56108(Object obj) {
        return ((ArrayList) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ܶۚ᩻, reason: not valid java name and contains not printable characters */
    public static Object m56109(Object obj) {
        return C12826.requireNonNull(obj);
    }

    /* JADX INFO: renamed from: ܺۨۜ, reason: not valid java name and contains not printable characters */
    public static boolean m56110(Object obj) {
        return ((C18736) obj).m42773();
    }

    /* JADX INFO: renamed from: ܽ۠᩵, reason: not valid java name and contains not printable characters */
    public static View m56111(Object obj, int i) {
        return ((AbstractActivityC5549) obj).m12252(i);
    }

    /* JADX INFO: renamed from: ܿᩳۤ, reason: not valid java name and contains not printable characters */
    public static void m56112(Object obj, Object obj2) {
        ((AbstractC9542) obj).m22242((AbstractActivityC5549) obj2);
    }

    /* JADX INFO: renamed from: ᩳۖܶ, reason: not valid java name and contains not printable characters */
    public static void m56113(Object obj, Object obj2) {
        ViewOnClickListenerC10539.m24293((SpannableStringBuilder) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ᩴۧ᩺, reason: not valid java name and contains not printable characters */
    public static long m56114() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ᩶ܳ۠, reason: not valid java name and contains not printable characters */
    public static Object m56115(Object obj, int i) {
        return ((ArrayList) obj).get(i);
    }

    /* JADX INFO: renamed from: ᩹ۖ᩻, reason: not valid java name and contains not printable characters */
    public static C16576 m56116(Object obj) {
        return ((ActivityC23283) obj).f73252;
    }

    public C0992(C1342 c1342) {
        this.f12350 = c1342;
    }
}
