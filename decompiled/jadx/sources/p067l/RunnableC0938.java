package p067l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܽ */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0938 implements Runnable {

    /* JADX INFO: renamed from: ۚ᩷᩹, reason: not valid java name and contains not printable characters */
    public static int f81886;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC2023 f9263;

    /* JADX INFO: renamed from: ֡ۤ۬, reason: not valid java name and contains not printable characters */
    public static boolean m55924() {
        return C24414.m53856();
    }

    /* JADX INFO: renamed from: ֨ۚܿ, reason: not valid java name and contains not printable characters */
    public static Iterator m55925(Object obj) {
        return ((List) obj).iterator();
    }

    /* JADX INFO: renamed from: ֫۬ۛ, reason: not valid java name and contains not printable characters */
    public static void m55926(Object obj) {
        ((C21089) obj).m47686();
    }

    /* JADX INFO: renamed from: ۗ֫ۤ, reason: not valid java name and contains not printable characters */
    public static void m55927(Object obj) {
        ((C13746) obj).m31298();
    }

    /* JADX INFO: renamed from: ۚۖۧ, reason: not valid java name and contains not printable characters */
    public static void m55928(Object obj, Object obj2) {
        ((TextView) obj).setText((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۛ֫ۖ, reason: not valid java name and contains not printable characters */
    public static String m55929(Object obj) {
        return ((String) obj).toLowerCase();
    }

    /* JADX INFO: renamed from: ۜܺᩳ, reason: not valid java name and contains not printable characters */
    public static void m55930(Object obj, Object obj2, Object obj3) {
        ((C3313) obj).m5777((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۟ۧۘ, reason: not valid java name and contains not printable characters */
    public static int m55931(Object obj) {
        return ((C14677) obj).m33581();
    }

    /* JADX INFO: renamed from: ۠᩶᩵, reason: not valid java name and contains not printable characters */
    public static boolean m55932(Object obj) {
        return ((C10967) obj).m25290();
    }

    /* JADX INFO: renamed from: ۫ۘ֡, reason: not valid java name and contains not printable characters */
    public static int m55933(Object obj) {
        return ((SpannableStringBuilder) obj).length();
    }

    /* JADX INFO: renamed from: ܳᩴۡ, reason: not valid java name and contains not printable characters */
    public static void m55934(Object obj) {
        ((ArrayList) obj).clear();
    }

    /* JADX INFO: renamed from: ᩴ᩻ۢ, reason: not valid java name and contains not printable characters */
    public static int m55935(Object obj) {
        return ((TextView) obj).length();
    }

    /* JADX INFO: renamed from: ᩵۠ܽ, reason: not valid java name and contains not printable characters */
    public static String m55936(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩹ۙۚ, reason: not valid java name and contains not printable characters */
    public static boolean m55937(Object obj, Object obj2) {
        return ((ArrayList) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ᩻֫۠, reason: not valid java name and contains not printable characters */
    public static int m55938() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩻ۙۨ, reason: not valid java name and contains not printable characters */
    public static boolean m55939(Object obj) {
        return C17384.m39567((String) obj);
    }

    public RunnableC0938(ActivityC2023 activityC2023) {
        this.f9263 = activityC2023;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }
}
