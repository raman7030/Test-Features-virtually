package l;

import android.content.ClipData;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import java.util.AbstractCollection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes.dex */
public final class C3746 {

    /* JADX INFO: renamed from: ۖۚ֡, reason: not valid java name and contains not printable characters */
    public static int f11829;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15739 f11830;

    /* JADX INFO: renamed from: ֨ۜ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m11356(Object obj, Object obj2) {
        return ((C16560) obj).m39035((String) obj2);
    }

    /* JADX INFO: renamed from: ۚ᩻֫, reason: not valid java name and contains not printable characters */
    public static String m11357(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۛ֡ۘ, reason: not valid java name and contains not printable characters */
    public static int m11358(Object obj) {
        return ((ViewGroup) obj).getChildCount();
    }

    /* JADX INFO: renamed from: ۜۗۚ, reason: not valid java name and contains not printable characters */
    public static void m11359(Object obj, Object obj2) {
        ((C8918) obj).write((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ۜۧܽ, reason: not valid java name and contains not printable characters */
    public static void m11360(Object obj, int i) {
        ((View) obj).setVisibility(i);
    }

    /* JADX INFO: renamed from: ۠۬֨, reason: not valid java name and contains not printable characters */
    public static void m11361(Object obj, int i) {
        ((AbstractC3817) obj).m11536(i);
    }

    /* JADX INFO: renamed from: ۢۖ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m11362(Object obj, Object obj2) {
        return ((HashMap) obj).containsKey(obj2);
    }

    /* JADX INFO: renamed from: ۫֫ۧ, reason: not valid java name and contains not printable characters */
    public static String m11363(Object obj) {
        return ((C3545) obj).getName();
    }

    /* JADX INFO: renamed from: ۫ܳ۫, reason: not valid java name and contains not printable characters */
    public static boolean m11364(Object obj) {
        return ((AbstractCollection) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ۬ۘۖ, reason: not valid java name and contains not printable characters */
    public static void m11365(Object obj) {
        ((C13136) obj).m31864();
    }

    /* JADX INFO: renamed from: ۬ۢ᩹, reason: not valid java name and contains not printable characters */
    public static int m11366(Object obj) {
        return ((View) obj).getScrollX();
    }

    /* JADX INFO: renamed from: ܺ᩸ᩳ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m11367(Object obj, Object obj2) {
        return ((StringBuilder) obj).append(obj2);
    }

    /* JADX INFO: renamed from: ᩳۚ᩺, reason: not valid java name and contains not printable characters */
    public static Object m11368(Object obj, Object obj2, Object obj3) {
        return ((HashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ᩴۡۡ, reason: not valid java name and contains not printable characters */
    public static int m11369() {
        return -1212953762;
    }

    /* JADX INFO: renamed from: ᩹֡۟, reason: not valid java name and contains not printable characters */
    public static boolean m11370(Object obj, Object obj2) {
        return ((String) obj).endsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ᩻ۛ᩻, reason: not valid java name and contains not printable characters */
    public static void m11371(Object obj) {
        C0349.m1793((AutoCloseable) obj);
    }

    public C3746(InterfaceC15739 interfaceC15739) {
        this.f11830 = interfaceC15739;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ContentInfo m11375() {
        ContentInfo contentInfoMo7597 = this.f11830.mo7597();
        C11003.requireNonNull(contentInfoMo7597);
        return contentInfoMo7597;
    }

    public final String toString() {
        return this.f11830.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ClipData m11372() {
        return this.f11830.mo7598();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m11374() {
        return this.f11830.getSource();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m11373() {
        return this.f11830.mo7599();
    }
}
