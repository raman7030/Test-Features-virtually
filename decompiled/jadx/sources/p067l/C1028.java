package p067l;

import android.content.ClipData;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import java.util.AbstractCollection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘۛ */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes.dex */
public final class C1028 {

    /* JADX INFO: renamed from: ۖۚ֡, reason: not valid java name and contains not printable characters */
    public static int f81950;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1623 f14636;

    /* JADX INFO: renamed from: ֨ۜ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m56234(Object obj, Object obj2) {
        return ((C18107) obj).m41261((String) obj2);
    }

    /* JADX INFO: renamed from: ۚ᩻֫, reason: not valid java name and contains not printable characters */
    public static String m56235(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۛ֡ۘ, reason: not valid java name and contains not printable characters */
    public static int m56236(Object obj) {
        return ((ViewGroup) obj).getChildCount();
    }

    /* JADX INFO: renamed from: ۜۗۚ, reason: not valid java name and contains not printable characters */
    public static void m56237(Object obj, Object obj2) {
        ((C10844) obj).write((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ۜۧܽ, reason: not valid java name and contains not printable characters */
    public static void m56238(Object obj, int i) {
        ((View) obj).setVisibility(i);
    }

    /* JADX INFO: renamed from: ۠۬֨, reason: not valid java name and contains not printable characters */
    public static void m56239(Object obj, int i) {
        ((AbstractC5996) obj).m13472(i);
    }

    /* JADX INFO: renamed from: ۢۖ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m56240(Object obj, Object obj2) {
        return ((HashMap) obj).containsKey(obj2);
    }

    /* JADX INFO: renamed from: ۫֫ۧ, reason: not valid java name and contains not printable characters */
    public static String m56241(Object obj) {
        return ((C5738) obj).getName();
    }

    /* JADX INFO: renamed from: ۫ܳ۫, reason: not valid java name and contains not printable characters */
    public static boolean m56242(Object obj) {
        return ((AbstractCollection) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ۬ۘۖ, reason: not valid java name and contains not printable characters */
    public static void m56243(Object obj) {
        ((C14853) obj).m33956();
    }

    /* JADX INFO: renamed from: ۬ۢ᩹, reason: not valid java name and contains not printable characters */
    public static int m56244(Object obj) {
        return ((View) obj).getScrollX();
    }

    /* JADX INFO: renamed from: ܺ᩸ᩳ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m56245(Object obj, Object obj2) {
        return ((StringBuilder) obj).append(obj2);
    }

    /* JADX INFO: renamed from: ᩳۚ᩺, reason: not valid java name and contains not printable characters */
    public static Object m56246(Object obj, Object obj2, Object obj3) {
        return ((HashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ᩴۡۡ, reason: not valid java name and contains not printable characters */
    public static int m56247() {
        return -1212953762;
    }

    /* JADX INFO: renamed from: ᩹֡۟, reason: not valid java name and contains not printable characters */
    public static boolean m56248(Object obj, Object obj2) {
        return ((String) obj).endsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ᩻ۛ᩻, reason: not valid java name and contains not printable characters */
    public static void m56249(Object obj) {
        C2700.m4192((AutoCloseable) obj);
    }

    public C1028(InterfaceC1623 interfaceC1623) {
        this.f14636 = interfaceC1623;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ContentInfo m13311() {
        ContentInfo contentInfoMo9668 = this.f14636.mo9668();
        C12826.requireNonNull(contentInfoMo9668);
        return contentInfoMo9668;
    }

    public final String toString() {
        return this.f14636.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final ClipData m13308() {
        return this.f14636.mo9669();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m13310() {
        return this.f14636.getSource();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m13309() {
        return this.f14636.mo9670();
    }
}
