package l;

import android.app.Activity;
import android.content.Intent;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class C2126 {

    /* JADX INFO: renamed from: ֫ܰۨ, reason: not valid java name and contains not printable characters */
    public static boolean f7087;

    /* JADX INFO: renamed from: ֫᩻ۗ, reason: not valid java name and contains not printable characters */
    public static void m7031(Object obj, Object obj2) {
        C11233.m27803(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۗ᩷᩻, reason: not valid java name and contains not printable characters */
    public static int m7032(Object obj) {
        return ((List) obj).size();
    }

    /* JADX INFO: renamed from: ۘ֡ܳ, reason: not valid java name and contains not printable characters */
    public static String m7033(Object obj) {
        return ((C19099) obj).m44019();
    }

    /* JADX INFO: renamed from: ۙܽܰ, reason: not valid java name and contains not printable characters */
    public static Intent m7034(Object obj) {
        return ((Activity) obj).getIntent();
    }

    /* JADX INFO: renamed from: ۛܳ۬, reason: not valid java name and contains not printable characters */
    public static C3059 m7035(Object obj) {
        return C15799.m37279((Exception) obj);
    }

    /* JADX INFO: renamed from: ۤᩴܿ, reason: not valid java name and contains not printable characters */
    public static String m7036(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۫ۧۗ, reason: not valid java name and contains not printable characters */
    public static Iterator m7037(Object obj) {
        return ((AbstractC18605) obj).iterator();
    }

    /* JADX INFO: renamed from: ۬ܳܶ, reason: not valid java name and contains not printable characters */
    public static String m7038(Object obj) {
        return ((String) obj).trim();
    }

    /* JADX INFO: renamed from: ܰۖܳ, reason: not valid java name and contains not printable characters */
    public static void m7039(Object obj, Object obj2) {
        ((View) obj).setOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ܳۚۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7040() {
        return false;
    }

    /* JADX INFO: renamed from: ܶܺ֫, reason: not valid java name and contains not printable characters */
    public static int m7041(Object obj) {
        return ((MenuItem) obj).getItemId();
    }

    /* JADX INFO: renamed from: ܶ᩷۬, reason: not valid java name and contains not printable characters */
    public static void m7042(Object obj, Object obj2) {
        ((ViewGroup) obj).addView((View) obj2);
    }

    /* JADX INFO: renamed from: ᩶ܺۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC16891 m7043(Object obj) {
        return ((C16560) obj).m39044();
    }

    /* JADX INFO: renamed from: ᩸֡۟, reason: not valid java name and contains not printable characters */
    public static boolean m7044(Object obj) {
        return ((C22933) obj).m51053();
    }

    /* JADX INFO: renamed from: ᩸ۢۛ, reason: not valid java name and contains not printable characters */
    public static C17793 m7045(long j) {
        return C17793.m41682(j);
    }

    /* JADX INFO: renamed from: ᩸ܶܺ, reason: not valid java name and contains not printable characters */
    public static MenuItem m7046(Object obj, boolean z) {
        return ((MenuItem) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7029(View view, String[] strArr, InterfaceC18022 interfaceC18022) {
        if (interfaceC18022 == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC11299(interfaceC18022));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] m7030(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3746 m7028(View view, C3746 c3746) {
        ContentInfo contentInfoM11375 = c3746.m11375();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM11375);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM11375 ? c3746 : new C3746(new C8685(contentInfoPerformReceiveContent));
    }
}
