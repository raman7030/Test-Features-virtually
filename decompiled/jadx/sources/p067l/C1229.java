package p067l;

import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public final class C1229 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ܺܺܶ, reason: not valid java name and contains not printable characters */
    public static int f82066;

    /* JADX INFO: renamed from: ֡۫֡, reason: not valid java name and contains not printable characters */
    public static AbstractC17043 m56398(Object obj, Object obj2) {
        return C17384.m39546((C16484) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۘ֨ۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m56399(Object obj) {
        return ((Iterable) obj).iterator();
    }

    /* JADX INFO: renamed from: ۙᩳۖ, reason: not valid java name and contains not printable characters */
    public static boolean m56400(Object obj, Object obj2) {
        return ((HashSet) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ۛܰᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14770 m56401(Object obj, Object obj2, boolean z) {
        return ((InterfaceC14770) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۠ۘۨ, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m56402(Object obj) {
        return ((View) obj).getLayoutParams();
    }

    /* JADX INFO: renamed from: ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static String m56403(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ֨ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m56404(Object obj, Object obj2) {
        return ((String) obj).startsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ۬᩷۫, reason: not valid java name and contains not printable characters */
    public static Button m56405(Object obj) {
        return ((DialogInterfaceC2564) obj).m3861();
    }

    /* JADX INFO: renamed from: ܺܽۘ, reason: not valid java name and contains not printable characters */
    public static void m56406(Object obj, Object obj2) {
        ViewOnClickListenerC16447.m37364((TextView) obj, (CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܺ᩶᩺, reason: not valid java name and contains not printable characters */
    public static void m56407(Object obj, char c) {
        ((C13220) obj).append(c);
    }

    /* JADX INFO: renamed from: ܺ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static void m56408(Object obj, int i) {
        ((Handler) obj).removeMessages(i);
    }

    /* JADX INFO: renamed from: ܺ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public static String m56409(Object obj, char c, char c2) {
        return ((String) obj).replace(c, c2);
    }

    /* JADX INFO: renamed from: ܿ۠۠, reason: not valid java name and contains not printable characters */
    public static int m56410() {
        return 0;
    }

    /* JADX INFO: renamed from: ܿᩴ۠, reason: not valid java name and contains not printable characters */
    public static Collection m56411(Object obj) {
        return ((C19561) obj).m44469();
    }

    /* JADX INFO: renamed from: ᩷᩹᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC10250 m56412(Object obj) {
        return ((InterfaceC12777) obj).getReference();
    }

    /* JADX INFO: renamed from: ᩻᩻ۗ, reason: not valid java name and contains not printable characters */
    public static String m56413(Object obj) {
        return ((Throwable) obj).getMessage();
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C1579(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C1579[i];
    }
}
