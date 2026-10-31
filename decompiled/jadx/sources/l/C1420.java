package l;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 151S */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1420 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۨ֨۬, reason: not valid java name and contains not printable characters */
    public static int f5096;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC22587 f5097;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f5098;

    public /* synthetic */ C1420(InterfaceC22587 interfaceC22587, View view) {
        this.f5097 = interfaceC22587;
        this.f5098 = view;
    }

    /* JADX INFO: renamed from: ۘ֫֨, reason: not valid java name and contains not printable characters */
    public static String m4902(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ۬ۜ, reason: not valid java name and contains not printable characters */
    public static byte[] m4903(Object obj, Object obj2, Object obj3) {
        return ((C18090) obj).m42193((C3545) obj2, (C19277) obj3);
    }

    /* JADX INFO: renamed from: ۜۢۘ, reason: not valid java name and contains not printable characters */
    public static void m4904(Object obj, Object obj2) {
        ((AbstractC15440) obj).m36502((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ۡ۟ۖ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m4905(Object obj, Object obj2) {
        return ((StringBuilder) obj).append((String) obj2);
    }

    /* JADX INFO: renamed from: ۡۧۙ, reason: not valid java name and contains not printable characters */
    public static String m4906(int i, Object obj) {
        return C4925.m14306(i, (Object[]) obj);
    }

    /* JADX INFO: renamed from: ۢܰ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m4907(Object obj, Object obj2) {
        return ((AbstractC3817) obj).m11552((String) obj2);
    }

    /* JADX INFO: renamed from: ۤۡ᩶, reason: not valid java name and contains not printable characters */
    public static void m4908(Object obj, int i) {
        ((TextView) obj).setTextColor(i);
    }

    /* JADX INFO: renamed from: ۨ۬۠, reason: not valid java name and contains not printable characters */
    public static String m4909(int i, Object obj) {
        return C19370.m44628(i, (String) obj);
    }

    /* JADX INFO: renamed from: ۬ܿܺ, reason: not valid java name and contains not printable characters */
    public static InputStream m4910(Object obj) {
        return ((AbstractC15440) obj).mo27926();
    }

    /* JADX INFO: renamed from: ܶۗ᩻, reason: not valid java name and contains not printable characters */
    public static Boolean m4911(boolean z) {
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ܺ᩸ۤ, reason: not valid java name and contains not printable characters */
    public static C17222 m4912() {
        return C17222.m40521();
    }

    /* JADX INFO: renamed from: ᩴۘ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m4913() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷ۛۖ, reason: not valid java name and contains not printable characters */
    public static void m4914(Object obj, int i) throws IOException {
        ((DataOutputStream) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ᩷ۡۚ, reason: not valid java name and contains not printable characters */
    public static int m4915(Object obj) {
        return ((C12392) obj).m30444();
    }

    /* JADX INFO: renamed from: ᩸ۗ᩹, reason: not valid java name and contains not printable characters */
    public static Integer m4916(int i) {
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩸ᩴۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4917(Object obj) {
        return ((AbstractC15440) obj).mo23120();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5097.mo37904(this.f5098);
    }
}
