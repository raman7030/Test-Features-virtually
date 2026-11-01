package p067l;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.widget.TextView;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۘ */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes.dex */
public final class C0955 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: ۚܶۖ, reason: not valid java name and contains not printable characters */
    public static boolean f81898;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1935 f10150;

    /* JADX INFO: renamed from: ֨᩻ۧ, reason: not valid java name and contains not printable characters */
    public static String m56022(Object obj) {
        return ((AbstractC18422) obj).m41982();
    }

    /* JADX INFO: renamed from: ۖۙ᩵, reason: not valid java name and contains not printable characters */
    public static int m56023(int i, int i2) {
        return Math.min(i, i2);
    }

    /* JADX INFO: renamed from: ۗܰܺ, reason: not valid java name and contains not printable characters */
    public static boolean m56024(Object obj, Object obj2) {
        return ((C18608) obj).mo42343((C18608) obj2);
    }

    /* JADX INFO: renamed from: ۙܰۚ, reason: not valid java name and contains not printable characters */
    public static boolean m56025() {
        return false;
    }

    /* JADX INFO: renamed from: ۙܶ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m56026(Object obj) {
        return ((C5738) obj).isDirectory();
    }

    /* JADX INFO: renamed from: ۜۨۧ, reason: not valid java name and contains not printable characters */
    public static void m56027(Object obj) {
        ((Activity) obj).finish();
    }

    /* JADX INFO: renamed from: ۠ۢ᩸, reason: not valid java name and contains not printable characters */
    public static int m56028(Object obj) {
        return ((C7972) obj).m18461();
    }

    /* JADX INFO: renamed from: ۠ܶܿ, reason: not valid java name and contains not printable characters */
    public static String m56029(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۠ܿܿ, reason: not valid java name and contains not printable characters */
    public static void m56030(Object obj, Object obj2, Object obj3) {
        ((AbstractC2655) obj).m4066((InterfaceC24784) obj2, (InterfaceC3326) obj3);
    }

    /* JADX INFO: renamed from: ۧܰ᩹, reason: not valid java name and contains not printable characters */
    public static Object m56031(Object obj, Object obj2) {
        return ((Context) obj).getSystemService((String) obj2);
    }

    /* JADX INFO: renamed from: ۫۬ۙ, reason: not valid java name and contains not printable characters */
    public static C19279 m56032(Object obj, Object obj2) {
        return ((C19279) obj).m43951((C19279) obj2);
    }

    /* JADX INFO: renamed from: ܶ᩺ۛ, reason: not valid java name and contains not printable characters */
    public static C19701 m56033(int i) {
        return C19701.m44739(i);
    }

    /* JADX INFO: renamed from: ܿ۫ܽ, reason: not valid java name and contains not printable characters */
    public static void m56034(Object obj) {
        ((InputStream) obj).close();
    }

    /* JADX INFO: renamed from: ᩴۛۚ, reason: not valid java name and contains not printable characters */
    public static Object m56035(Object obj) {
        return ((Iterator) obj).next();
    }

    /* JADX INFO: renamed from: ᩷۬ܺ, reason: not valid java name and contains not printable characters */
    public static void m56036(Object obj, Object obj2, Object obj3) {
        C20966.m47304((C18107) obj, (InterfaceC19370) obj2, (InterfaceC20295) obj3);
    }

    /* JADX INFO: renamed from: ᩷ܳ۫, reason: not valid java name and contains not printable characters */
    public static void m56037(Object obj, Object obj2) {
        ((AbstractActivityC5549) obj).m12263((C1326) obj2);
    }

    public C0955(C1935 c1935) {
        this.f10150 = c1935;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f10150.m51905();
        return true;
    }
}
