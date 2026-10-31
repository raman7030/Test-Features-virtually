package l;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.WindowInsetsAnimation;
import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes.dex */
public final class C3537 {

    /* JADX INFO: renamed from: ۡ᩺֡, reason: not valid java name and contains not printable characters */
    public static int f11231;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11007 f11232;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11007 f11233;

    /* JADX INFO: renamed from: ֡۟۬, reason: not valid java name and contains not printable characters */
    public static View m10739(Object obj, int i) {
        return ((AbstractActivityC3346) obj).m10216(i);
    }

    /* JADX INFO: renamed from: ۜܶۤ, reason: not valid java name and contains not printable characters */
    public static void m10741(Object obj, Object obj2) {
        ((C19258) obj).m44424((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۠ᩴۛ, reason: not valid java name and contains not printable characters */
    public static void m10742(Object obj, Object obj2) {
        ViewOnClickListenerC8597.m22324((SpannableStringBuilder) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۡܰ۬, reason: not valid java name and contains not printable characters */
    public static void m10743(Object obj, Object obj2) {
        ((AbstractC7548) obj).m20266((AbstractActivityC3346) obj2);
    }

    /* JADX INFO: renamed from: ۢ֫ۡ, reason: not valid java name and contains not printable characters */
    public static void m10744(Object obj) {
        C19926.m45878((String) obj);
    }

    /* JADX INFO: renamed from: ۢ۠ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m10745(Object obj) {
        return ((C17222) obj).m40526();
    }

    /* JADX INFO: renamed from: ۤ֨ۗ, reason: not valid java name and contains not printable characters */
    public static int m10746() {
        return 2093741987;
    }

    /* JADX INFO: renamed from: ۧ۫֫, reason: not valid java name and contains not printable characters */
    public static Bundle m10747(Object obj) {
        return ((ComponentCallbacksC9205) obj).requireArguments();
    }

    /* JADX INFO: renamed from: ۫ᩳ᩵, reason: not valid java name and contains not printable characters */
    public static String m10748(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܶۜ᩻, reason: not valid java name and contains not printable characters */
    public static Object m10749(Object obj) {
        return C11003.requireNonNull(obj);
    }

    /* JADX INFO: renamed from: ܺۙ᩶, reason: not valid java name and contains not printable characters */
    public static C14949 m10750(Object obj) {
        return ((ActivityC22006) obj).f70539;
    }

    /* JADX INFO: renamed from: ᩳۗۚ, reason: not valid java name and contains not printable characters */
    public static long m10751() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ᩴۛۤ, reason: not valid java name and contains not printable characters */
    public static void m10752(Object obj) throws IOException {
        ((OutputStream) obj).close();
    }

    /* JADX INFO: renamed from: ᩷ۘۚ, reason: not valid java name and contains not printable characters */
    public static int m10753(Object obj) {
        return ((InterfaceC1779) obj).mo1790();
    }

    /* JADX INFO: renamed from: ᩸ۛۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10754(Object obj) {
        return ((ArrayList) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ᩸۬۬, reason: not valid java name and contains not printable characters */
    public static Object m10755(Object obj, int i) {
        return ((ArrayList) obj).get(i);
    }

    public C3537(C11007 c11007, C11007 c11008) {
        this.f11232 = c11007;
        this.f11233 = c11008;
    }

    public C3537(WindowInsetsAnimation.Bounds bounds) {
        this.f11232 = C16670.m39188(bounds);
        this.f11233 = C16670.m39186(bounds);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11007 m10756() {
        return this.f11232;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11007 m10757() {
        return this.f11233;
    }

    public final String toString() {
        return "Bounds{lower=" + this.f11232 + " upper=" + this.f11233 + l.d;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3537 m10740(WindowInsetsAnimation.Bounds bounds) {
        return new C3537(bounds);
    }
}
