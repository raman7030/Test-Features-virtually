package l;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.TextView;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class C4616 {

    /* JADX INFO: renamed from: ۡۗۙ, reason: not valid java name and contains not printable characters */
    public static int f14690;

    /* JADX INFO: renamed from: ֡ᩳ᩵, reason: not valid java name and contains not printable characters */
    public static String m13542(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۖ֫ᩳ, reason: not valid java name and contains not printable characters */
    public static Button m13545(Object obj) {
        return ((DialogInterfaceC0206) obj).m1448();
    }

    /* JADX INFO: renamed from: ۚܽ֡, reason: not valid java name and contains not printable characters */
    public static boolean m13546(Object obj, Object obj2) {
        return ((HashSet) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ۠ܳ۬, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m13547(Object obj, Object obj2) {
        return C15799.m37375((C14852) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۠ܶ᩷, reason: not valid java name and contains not printable characters */
    public static void m13548(Object obj, Object obj2) {
        ViewOnClickListenerC14813.m35216((TextView) obj, (CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۡ᩷᩸, reason: not valid java name and contains not printable characters */
    public static InterfaceC13049 m13549(Object obj, Object obj2, boolean z) {
        return ((InterfaceC13049) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۧۡܳ, reason: not valid java name and contains not printable characters */
    public static String m13551(Object obj, char c, char c2) {
        return ((String) obj).replace(c, c2);
    }

    /* JADX INFO: renamed from: ۧۢ᩶, reason: not valid java name and contains not printable characters */
    public static int m13552() {
        return 0;
    }

    /* JADX INFO: renamed from: ۬ۜۛ, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m13553(Object obj) {
        return ((View) obj).getLayoutParams();
    }

    /* JADX INFO: renamed from: ܰ᩵۬, reason: not valid java name and contains not printable characters */
    public static boolean m13554(Object obj, Object obj2) {
        return ((String) obj).startsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ܽ۠ۚ, reason: not valid java name and contains not printable characters */
    public static Iterator m13555(Object obj) {
        return ((Iterable) obj).iterator();
    }

    /* JADX INFO: renamed from: ܽܶᩳ, reason: not valid java name and contains not printable characters */
    public static void m13556(Object obj, char c) {
        ((C11418) obj).append(c);
    }

    /* JADX INFO: renamed from: ܿۚ᩺, reason: not valid java name and contains not printable characters */
    public static Collection m13557(Object obj) {
        return ((C18090) obj).m42210();
    }

    /* JADX INFO: renamed from: ᩳۧ۟, reason: not valid java name and contains not printable characters */
    public static void m13558(Object obj, int i) {
        ((Handler) obj).removeMessages(i);
    }

    /* JADX INFO: renamed from: ᩶ܳܺ, reason: not valid java name and contains not printable characters */
    public static String m13559(Object obj) {
        return ((Throwable) obj).getMessage();
    }

    /* JADX INFO: renamed from: ᩷ܺܺ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8293 m13560(Object obj) {
        return ((InterfaceC10952) obj).getReference();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13544(View view) {
        view.requestApplyInsets();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m13550(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static WindowInsets m13543(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
