package l;

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

/* JADX INFO: renamed from: l.۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public final class C7811 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ܺܺܶ, reason: not valid java name and contains not printable characters */
    public static int f24123;

    /* JADX INFO: renamed from: ֡۫֡, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m20832(Object obj, Object obj2) {
        return C15799.m37375((C14852) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۘ֨ۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m20833(Object obj) {
        return ((Iterable) obj).iterator();
    }

    /* JADX INFO: renamed from: ۙᩳۖ, reason: not valid java name and contains not printable characters */
    public static boolean m20834(Object obj, Object obj2) {
        return ((HashSet) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ۛܰᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13049 m20835(Object obj, Object obj2, boolean z) {
        return ((InterfaceC13049) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۠ۘۨ, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m20836(Object obj) {
        return ((View) obj).getLayoutParams();
    }

    /* JADX INFO: renamed from: ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static String m20837(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ֨ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m20838(Object obj, Object obj2) {
        return ((String) obj).startsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ۬᩷۫, reason: not valid java name and contains not printable characters */
    public static Button m20839(Object obj) {
        return ((DialogInterfaceC0206) obj).m1448();
    }

    /* JADX INFO: renamed from: ܺܽۘ, reason: not valid java name and contains not printable characters */
    public static void m20840(Object obj, Object obj2) {
        ViewOnClickListenerC14813.m35216((TextView) obj, (CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܺ᩶᩺, reason: not valid java name and contains not printable characters */
    public static void m20841(Object obj, char c) {
        ((C11418) obj).append(c);
    }

    /* JADX INFO: renamed from: ܺ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static void m20842(Object obj, int i) {
        ((Handler) obj).removeMessages(i);
    }

    /* JADX INFO: renamed from: ܺ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public static String m20843(Object obj, char c, char c2) {
        return ((String) obj).replace(c, c2);
    }

    /* JADX INFO: renamed from: ܿ۠۠, reason: not valid java name and contains not printable characters */
    public static int m20844() {
        return 0;
    }

    /* JADX INFO: renamed from: ܿᩴ۠, reason: not valid java name and contains not printable characters */
    public static Collection m20845(Object obj) {
        return ((C18090) obj).m42210();
    }

    /* JADX INFO: renamed from: ᩷᩹᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC8293 m20846(Object obj) {
        return ((InterfaceC10952) obj).getReference();
    }

    /* JADX INFO: renamed from: ᩻᩻ۗ, reason: not valid java name and contains not printable characters */
    public static String m20847(Object obj) {
        return ((Throwable) obj).getMessage();
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C14866(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C14866[i];
    }
}
