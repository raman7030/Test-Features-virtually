package p067l;

import android.app.Activity;
import android.content.Intent;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫᩺ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class C0947 {

    /* JADX INFO: renamed from: ֫ܰۨ, reason: not valid java name and contains not printable characters */
    public static boolean f81895;

    /* JADX INFO: renamed from: ֫᩻ۗ, reason: not valid java name and contains not printable characters */
    public static void m55988(Object obj, Object obj2) {
        C13045.m29865(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۗ᩷᩻, reason: not valid java name and contains not printable characters */
    public static int m55989(Object obj) {
        return ((List) obj).size();
    }

    /* JADX INFO: renamed from: ۘ֡ܳ, reason: not valid java name and contains not printable characters */
    public static String m55990(Object obj) {
        return ((C20521) obj).m46313();
    }

    /* JADX INFO: renamed from: ۙܽܰ, reason: not valid java name and contains not printable characters */
    public static Intent m55991(Object obj) {
        return ((Activity) obj).getIntent();
    }

    /* JADX INFO: renamed from: ۛܳ۬, reason: not valid java name and contains not printable characters */
    public static C5276 m55992(Object obj) {
        return C17384.m39450((Exception) obj);
    }

    /* JADX INFO: renamed from: ۤᩴܿ, reason: not valid java name and contains not printable characters */
    public static String m55993(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۫ۧۗ, reason: not valid java name and contains not printable characters */
    public static Iterator m55994(Object obj) {
        return ((AbstractC20050) obj).iterator();
    }

    /* JADX INFO: renamed from: ۬ܳܶ, reason: not valid java name and contains not printable characters */
    public static String m55995(Object obj) {
        return ((String) obj).trim();
    }

    /* JADX INFO: renamed from: ܰۖܳ, reason: not valid java name and contains not printable characters */
    public static void m55996(Object obj, Object obj2) {
        ((View) obj).setOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ܳۚۨ, reason: not valid java name and contains not printable characters */
    public static boolean m55997() {
        return false;
    }

    /* JADX INFO: renamed from: ܶܺ֫, reason: not valid java name and contains not printable characters */
    public static int m55998(Object obj) {
        return ((MenuItem) obj).getItemId();
    }

    /* JADX INFO: renamed from: ܶ᩷۬, reason: not valid java name and contains not printable characters */
    public static void m55999(Object obj, Object obj2) {
        ((ViewGroup) obj).addView((View) obj2);
    }

    /* JADX INFO: renamed from: ᩶ܺۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC18422 m56000(Object obj) {
        return ((C18107) obj).m41270();
    }

    /* JADX INFO: renamed from: ᩸֡۟, reason: not valid java name and contains not printable characters */
    public static boolean m56001(Object obj) {
        return ((C24164) obj).m53444();
    }

    /* JADX INFO: renamed from: ᩸ۢۛ, reason: not valid java name and contains not printable characters */
    public static C19279 m56002(long j) {
        return C19279.m43928(j);
    }

    /* JADX INFO: renamed from: ᩸ܶܺ, reason: not valid java name and contains not printable characters */
    public static MenuItem m56003(Object obj, boolean z) {
        return ((MenuItem) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9140(View view, String[] strArr, InterfaceC1736 interfaceC1736) {
        if (interfaceC1736 == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC1402(interfaceC1736));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String[] m9141(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1028 m9139(View view, C1028 c1028) {
        ContentInfo contentInfoM13311 = c1028.m13311();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM13311);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM13311 ? c1028 : new C1028(new C1273(contentInfoPerformReceiveContent));
    }
}
