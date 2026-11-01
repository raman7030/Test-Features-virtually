package p067l;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֨᩺ */
/* JADX INFO: compiled from: 151S */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0912 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۨ֨۬, reason: not valid java name and contains not printable characters */
    public static int f81867;

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC1962 f7870;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ View f7871;

    public /* synthetic */ C0912(InterfaceC1962 interfaceC1962, View view) {
        this.f7870 = interfaceC1962;
        this.f7871 = view;
    }

    /* JADX INFO: renamed from: ۘ֫֨, reason: not valid java name and contains not printable characters */
    public static String m55822(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ۬ۜ, reason: not valid java name and contains not printable characters */
    public static byte[] m55823(Object obj, Object obj2, Object obj3) {
        return ((C19561) obj).m44452((C5738) obj2, (C20689) obj3);
    }

    /* JADX INFO: renamed from: ۜۢۘ, reason: not valid java name and contains not printable characters */
    public static void m55824(Object obj, Object obj2) {
        ((AbstractC17043) obj).m38660((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ۡ۟ۖ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m55825(Object obj, Object obj2) {
        return ((StringBuilder) obj).append((String) obj2);
    }

    /* JADX INFO: renamed from: ۡۧۙ, reason: not valid java name and contains not printable characters */
    public static String m55826(int i, Object obj) {
        return C7050.m16203(i, (Object[]) obj);
    }

    /* JADX INFO: renamed from: ۢܰ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m55827(Object obj, Object obj2) {
        return ((AbstractC5996) obj).m13488((String) obj2);
    }

    /* JADX INFO: renamed from: ۤۡ᩶, reason: not valid java name and contains not printable characters */
    public static void m55828(Object obj, int i) {
        ((TextView) obj).setTextColor(i);
    }

    /* JADX INFO: renamed from: ۨ۬۠, reason: not valid java name and contains not printable characters */
    public static String m55829(int i, Object obj) {
        return C20778.m46922(i, (String) obj);
    }

    /* JADX INFO: renamed from: ۬ܿܺ, reason: not valid java name and contains not printable characters */
    public static InputStream m55830(Object obj) {
        return ((AbstractC17043) obj).mo29987();
    }

    /* JADX INFO: renamed from: ܶۗ᩻, reason: not valid java name and contains not printable characters */
    public static Boolean m55831(boolean z) {
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ܺ᩸ۤ, reason: not valid java name and contains not printable characters */
    public static C18736 m55832() {
        return C18736.m42768();
    }

    /* JADX INFO: renamed from: ᩴۘ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m55833() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷ۛۖ, reason: not valid java name and contains not printable characters */
    public static void m55834(Object obj, int i) throws IOException {
        ((DataOutputStream) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ᩷ۡۚ, reason: not valid java name and contains not printable characters */
    public static int m55835(Object obj) {
        return ((C14146) obj).m32508();
    }

    /* JADX INFO: renamed from: ᩸ۗ᩹, reason: not valid java name and contains not printable characters */
    public static Integer m55836(int i) {
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩸ᩴۡ, reason: not valid java name and contains not printable characters */
    public static boolean m55837(Object obj) {
        return ((AbstractC17043) obj).mo25094();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7870.mo40091(this.f7871);
    }
}
