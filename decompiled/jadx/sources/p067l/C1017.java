package p067l;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.WindowInsetsAnimation;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ᩺ */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes.dex */
public final class C1017 {

    /* JADX INFO: renamed from: ۡ᩺֡, reason: not valid java name and contains not printable characters */
    public static int f81942;

    /* JADX INFO: renamed from: ֫ */
    public final C1388 f14038;

    /* JADX INFO: renamed from: ۧ */
    public final C1388 f14039;

    /* JADX INFO: renamed from: ֡۟۬, reason: not valid java name and contains not printable characters */
    public static View m56181(Object obj, int i) {
        return ((AbstractActivityC5549) obj).m12252(i);
    }

    /* JADX INFO: renamed from: ۜܶۤ, reason: not valid java name and contains not printable characters */
    public static void m56182(Object obj, Object obj2) {
        ((C20671) obj).m46718((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۠ᩴۛ, reason: not valid java name and contains not printable characters */
    public static void m56183(Object obj, Object obj2) {
        ViewOnClickListenerC10539.m24293((SpannableStringBuilder) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۡܰ۬, reason: not valid java name and contains not printable characters */
    public static void m56184(Object obj, Object obj2) {
        ((AbstractC9542) obj).m22242((AbstractActivityC5549) obj2);
    }

    /* JADX INFO: renamed from: ۢ֫ۡ, reason: not valid java name and contains not printable characters */
    public static void m56185(Object obj) {
        C21306.m48191((String) obj);
    }

    /* JADX INFO: renamed from: ۢ۠ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m56186(Object obj) {
        return ((C18736) obj).m42773();
    }

    /* JADX INFO: renamed from: ۤ֨ۗ, reason: not valid java name and contains not printable characters */
    public static int m56187() {
        return 2093741987;
    }

    /* JADX INFO: renamed from: ۧ۫֫, reason: not valid java name and contains not printable characters */
    public static Bundle m56188(Object obj) {
        return ((ComponentCallbacksC11117) obj).requireArguments();
    }

    /* JADX INFO: renamed from: ۫ᩳ᩵, reason: not valid java name and contains not printable characters */
    public static String m56189(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܶۜ᩻, reason: not valid java name and contains not printable characters */
    public static Object m56190(Object obj) {
        return C12826.requireNonNull(obj);
    }

    /* JADX INFO: renamed from: ܺۙ᩶, reason: not valid java name and contains not printable characters */
    public static C16576 m56191(Object obj) {
        return ((ActivityC23283) obj).f73252;
    }

    /* JADX INFO: renamed from: ᩳۗۚ, reason: not valid java name and contains not printable characters */
    public static long m56192() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ᩴۛۤ, reason: not valid java name and contains not printable characters */
    public static void m56193(Object obj) throws IOException {
        ((OutputStream) obj).close();
    }

    /* JADX INFO: renamed from: ᩷ۘۚ, reason: not valid java name and contains not printable characters */
    public static int m56194(Object obj) {
        return ((InterfaceC4059) obj).mo4189();
    }

    /* JADX INFO: renamed from: ᩸ۛۧ, reason: not valid java name and contains not printable characters */
    public static boolean m56195(Object obj) {
        return ((ArrayList) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ᩸۬۬, reason: not valid java name and contains not printable characters */
    public static Object m56196(Object obj, int i) {
        return ((ArrayList) obj).get(i);
    }

    public C1017(C1388 c1388, C1388 c1389) {
        this.f14038 = c1388;
        this.f14039 = c1389;
    }

    public C1017(WindowInsetsAnimation.Bounds bounds) {
        this.f14038 = C1669.m41423(bounds);
        this.f14039 = C1669.m41421(bounds);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1388 m12737() {
        return this.f14038;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C1388 m12738() {
        return this.f14039;
    }

    public final String toString() {
        return "Bounds{lower=" + this.f14038 + " upper=" + this.f14039 + C0249l.f1198d;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1017 m12736(WindowInsetsAnimation.Bounds bounds) {
        return new C1017(bounds);
    }
}
