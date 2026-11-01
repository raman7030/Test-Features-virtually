package p067l;

import android.widget.TextView;
import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;

/* JADX INFO: renamed from: l.֡ᩴ */
/* JADX INFO: compiled from: 95DO */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0871 implements Runnable {

    /* JADX INFO: renamed from: ܳۤ֫, reason: not valid java name and contains not printable characters */
    public static int f81839;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnLongClickListenerC1116 f5084;

    public /* synthetic */ RunnableC0871(ViewOnLongClickListenerC1116 viewOnLongClickListenerC1116) {
        this.f5084 = viewOnLongClickListenerC1116;
    }

    /* JADX INFO: renamed from: ۙ۬ۚ, reason: not valid java name and contains not printable characters */
    public static ActivityC3069 m55660(Object obj) {
        return ((ComponentCallbacksC11117) obj).requireActivity();
    }

    /* JADX INFO: renamed from: ۚ֫۟, reason: not valid java name and contains not printable characters */
    public static void m55661(Object obj, Object obj2) {
        C13045.m29867(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۠ۤۗ, reason: not valid java name and contains not printable characters */
    public static String m55662(Object obj) {
        return ((C5168) obj).m11037();
    }

    /* JADX INFO: renamed from: ۠᩵ܳ, reason: not valid java name and contains not printable characters */
    public static int m55663(Object obj) {
        return ((C14146) obj).m32606();
    }

    /* JADX INFO: renamed from: ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static C2836 m55664(Object obj, Object obj2) {
        return C7531.m17431((String) obj, (String[]) obj2);
    }

    /* JADX INFO: renamed from: ۧ᩷ۜ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14770 m55665(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC14770) obj).putString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۧ᩷ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m55666(Object obj, Object obj2) {
        return C12826.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: ۫ۘ᩺, reason: not valid java name and contains not printable characters */
    public static String m55667(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۬ܽ۬, reason: not valid java name and contains not printable characters */
    public static C25065 m55668(Object obj) {
        return ((C19701) obj).m44755();
    }

    /* JADX INFO: renamed from: ܳ᩶ۢ, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC2564 m55669(Object obj) {
        return ((C20671) obj).m46732();
    }

    /* JADX INFO: renamed from: ܺܰ֡, reason: not valid java name and contains not printable characters */
    public static JSONArray m55670() {
        return JSON.array();
    }

    /* JADX INFO: renamed from: ܽۖ۫, reason: not valid java name and contains not printable characters */
    public static C22682 m55671(Object obj) {
        return C22682.m50795((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ᩳۛۧ, reason: not valid java name and contains not printable characters */
    public static int m55672() {
        return -63168048;
    }

    /* JADX INFO: renamed from: ᩴۧۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m55673(Object obj) {
        return ((TextView) obj).getText();
    }

    /* JADX INFO: renamed from: ᩺ۚۗ, reason: not valid java name and contains not printable characters */
    public static String m55674(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
    }

    /* JADX INFO: renamed from: ᩺ܰۚ, reason: not valid java name and contains not printable characters */
    public static void m55675(Object obj, Object obj2) {
        ((C18107) obj).m41279((String) obj2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5084.m17586();
    }
}
