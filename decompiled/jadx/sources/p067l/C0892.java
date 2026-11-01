package p067l;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.֨ۡ */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes.dex */
public final class C0892 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܶᩴ᩶, reason: not valid java name and contains not printable characters */
    public static boolean f81851;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1907 f6496;

    /* JADX INFO: renamed from: ֫֨۫, reason: not valid java name and contains not printable characters */
    public static C20521 m55742(Object obj) {
        return ((ActivityC14326) obj).f40957;
    }

    /* JADX INFO: renamed from: ۘۛۖ, reason: not valid java name and contains not printable characters */
    public static long m55743(long j, long j2) {
        return C19644.m44631(j, j2);
    }

    /* JADX INFO: renamed from: ۛۚ۫, reason: not valid java name and contains not printable characters */
    public static String m55744(Object obj) {
        return ((AbstractC17043) obj).getName();
    }

    /* JADX INFO: renamed from: ۜۧ۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC9768 m55745(Object obj) {
        return ((C14146) obj).m32500();
    }

    /* JADX INFO: renamed from: ۠ۡۜ, reason: not valid java name and contains not printable characters */
    public static int m55746(Object obj) {
        return ((View) obj).getHeight();
    }

    /* JADX INFO: renamed from: ۤۘᩳ, reason: not valid java name and contains not printable characters */
    public static void m55747(Object obj) {
        ((Thread) obj).start();
    }

    /* JADX INFO: renamed from: ۤ۠᩷, reason: not valid java name and contains not printable characters */
    public static char m55748(int i, Object obj) {
        return C9417.m21911(i, (String) obj);
    }

    /* JADX INFO: renamed from: ۤܶ֫, reason: not valid java name and contains not printable characters */
    public static boolean m55749() {
        return true;
    }

    /* JADX INFO: renamed from: ۤܿۢ, reason: not valid java name and contains not printable characters */
    public static String m55750(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ᩹ۡ, reason: not valid java name and contains not printable characters */
    public static C24913 m55751(Object obj) {
        return ((InterfaceC9768) obj).mo3999();
    }

    /* JADX INFO: renamed from: ܰܽۧ, reason: not valid java name and contains not printable characters */
    public static boolean m55752(Object obj, Object obj2) {
        return ((Bundle) obj).getBoolean((String) obj2);
    }

    /* JADX INFO: renamed from: ᩵ܿܽ, reason: not valid java name and contains not printable characters */
    public static C19279 m55753(Object obj, Object obj2) {
        return ((C19279) obj).m43971((C19279) obj2);
    }

    /* JADX INFO: renamed from: ᩷᩵ܿ, reason: not valid java name and contains not printable characters */
    public static String m55754(Object obj, Object obj2, Object obj3) {
        return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩸֫ۗ, reason: not valid java name and contains not printable characters */
    public static View m55755(Object obj, int i) {
        return ((View) obj).findViewById(i);
    }

    /* JADX INFO: renamed from: ᩸֫᩶, reason: not valid java name and contains not printable characters */
    public static void m55756(Object obj, int i) {
        ((C11233) obj).m26014(i);
    }

    /* JADX INFO: renamed from: ᩻ۨܳ, reason: not valid java name and contains not printable characters */
    public static String m55757(Object obj, int i, int i2) {
        return ((String) obj).substring(i, i2);
    }

    public C0892(C1907 c1907) {
        this.f6496 = c1907;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1907 c1907 = this.f6496;
        c1907.f71790.setSelection(i);
        if (c1907.f71790.getOnItemClickListener() != null) {
            c1907.f71790.performItemClick(view, i, c1907.f71786.getItemId(i));
        }
        c1907.dismiss();
    }
}
