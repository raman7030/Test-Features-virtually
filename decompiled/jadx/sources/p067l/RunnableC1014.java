package p067l;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗ᩷ */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1014 implements Runnable {

    /* JADX INFO: renamed from: ᩸᩺ᩳ, reason: not valid java name and contains not printable characters */
    public static int f81941;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1364 f13798;

    /* JADX INFO: renamed from: ۖۧۙ, reason: not valid java name and contains not printable characters */
    public static Class m56165(Object obj) {
        return obj.getClass();
    }

    /* JADX INFO: renamed from: ۘ᩷۠, reason: not valid java name and contains not printable characters */
    public static Looper m56166() {
        return Looper.myLooper();
    }

    /* JADX INFO: renamed from: ۜ֨ۤ, reason: not valid java name and contains not printable characters */
    public static C16820 m56167(Object obj) {
        return C16820.m38130((InputStream) obj);
    }

    /* JADX INFO: renamed from: ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m56168(Object obj, int i) {
        C2641.m4030((TextInputLayout) obj, i);
    }

    /* JADX INFO: renamed from: ۢ֫ܺ, reason: not valid java name and contains not printable characters */
    public static Context m56169(Object obj) {
        return ((View) obj).getContext();
    }

    /* JADX INFO: renamed from: ۢۚܺ, reason: not valid java name and contains not printable characters */
    public static void m56170(Object obj, int i, Object obj2, int i2, int i3) {
        System.arraycopy(obj, i, obj2, i2, i3);
    }

    /* JADX INFO: renamed from: ۧۧ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m56171(Object obj, int i) {
        return ((C20689) obj).m46754(i);
    }

    /* JADX INFO: renamed from: ۧܽۗ, reason: not valid java name and contains not printable characters */
    public static void m56172(Object obj, Object obj2) {
        ((C1326) obj).setNavigationOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۨۖۜ, reason: not valid java name and contains not printable characters */
    public static boolean m56173(Object obj) {
        return ((AbstractC17043) obj).mo25503();
    }

    /* JADX INFO: renamed from: ۬᩹ܶ, reason: not valid java name and contains not printable characters */
    public static String m56174() {
        return C24414.m53855();
    }

    /* JADX INFO: renamed from: ܶۤᩴ, reason: not valid java name and contains not printable characters */
    public static String m56175(Object obj, Object obj2) {
        return ((Intent) obj).getStringExtra((String) obj2);
    }

    /* JADX INFO: renamed from: ܶᩳۤ, reason: not valid java name and contains not printable characters */
    public static void m56176(Object obj) {
        ((C10844) obj).close();
    }

    /* JADX INFO: renamed from: ܺۛܰ, reason: not valid java name and contains not printable characters */
    public static boolean m56177() {
        return true;
    }

    /* JADX INFO: renamed from: ܽܺܿ, reason: not valid java name and contains not printable characters */
    public static String m56178(Object obj, int i) {
        return C3865.m7621((C25065) obj, i);
    }

    /* JADX INFO: renamed from: ᩴۖ۬, reason: not valid java name and contains not printable characters */
    public static int m56179(Object obj) {
        return Integer.parseInt((String) obj);
    }

    /* JADX INFO: renamed from: ᩷ۖ۠, reason: not valid java name and contains not printable characters */
    public static String m56180(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    public RunnableC1014(C1364 c1364) {
        this.f13798 = c1364;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1364 c1364 = this.f13798;
        c1364.m28471();
        c1364.f34540 = c1364.f34553.animate().translationY(-c1364.f34553.getHeight()).setListener(c1364.f34529);
    }
}
