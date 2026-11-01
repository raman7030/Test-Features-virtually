package p067l;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.TextView;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۨ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class C1071 {

    /* JADX INFO: renamed from: ۡۗۙ, reason: not valid java name and contains not printable characters */
    public static int f81975;

    /* JADX INFO: renamed from: ֡ᩳ᩵, reason: not valid java name and contains not printable characters */
    public static String m56336(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۖ֫ᩳ, reason: not valid java name and contains not printable characters */
    public static Button m56337(Object obj) {
        return ((DialogInterfaceC2564) obj).m3861();
    }

    /* JADX INFO: renamed from: ۚܽ֡, reason: not valid java name and contains not printable characters */
    public static boolean m56338(Object obj, Object obj2) {
        return ((HashSet) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ۠ܳ۬, reason: not valid java name and contains not printable characters */
    public static AbstractC17043 m56339(Object obj, Object obj2) {
        return C17384.m39546((C16484) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۠ܶ᩷, reason: not valid java name and contains not printable characters */
    public static void m56340(Object obj, Object obj2) {
        ViewOnClickListenerC16447.m37364((TextView) obj, (CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۡ᩷᩸, reason: not valid java name and contains not printable characters */
    public static InterfaceC14770 m56341(Object obj, Object obj2, boolean z) {
        return ((InterfaceC14770) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۧۡܳ, reason: not valid java name and contains not printable characters */
    public static String m56342(Object obj, char c, char c2) {
        return ((String) obj).replace(c, c2);
    }

    /* JADX INFO: renamed from: ۧۢ᩶, reason: not valid java name and contains not printable characters */
    public static int m56343() {
        return 0;
    }

    /* JADX INFO: renamed from: ۬ۜۛ, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m56344(Object obj) {
        return ((View) obj).getLayoutParams();
    }

    /* JADX INFO: renamed from: ܰ᩵۬, reason: not valid java name and contains not printable characters */
    public static boolean m56345(Object obj, Object obj2) {
        return ((String) obj).startsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ܽ۠ۚ, reason: not valid java name and contains not printable characters */
    public static Iterator m56346(Object obj) {
        return ((Iterable) obj).iterator();
    }

    /* JADX INFO: renamed from: ܽܶᩳ, reason: not valid java name and contains not printable characters */
    public static void m56347(Object obj, char c) {
        ((C13220) obj).append(c);
    }

    /* JADX INFO: renamed from: ܿۚ᩺, reason: not valid java name and contains not printable characters */
    public static Collection m56348(Object obj) {
        return ((C19561) obj).m44469();
    }

    /* JADX INFO: renamed from: ᩳۧ۟, reason: not valid java name and contains not printable characters */
    public static void m56349(Object obj, int i) {
        ((Handler) obj).removeMessages(i);
    }

    /* JADX INFO: renamed from: ᩶ܳܺ, reason: not valid java name and contains not printable characters */
    public static String m56350(Object obj) {
        return ((Throwable) obj).getMessage();
    }

    /* JADX INFO: renamed from: ᩷ܺܺ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10250 m56351(Object obj) {
        return ((InterfaceC12777) obj).getReference();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15434(View view) {
        view.requestApplyInsets();
    }

    /* JADX INFO: renamed from: ۧ */
    public static WindowInsets m15435(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: ֫ */
    public static WindowInsets m15433(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
