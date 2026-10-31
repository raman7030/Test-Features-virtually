package l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1937 implements Runnable {

    /* JADX INFO: renamed from: ۚ᩷᩹, reason: not valid java name and contains not printable characters */
    public static int f6483;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23809 f6484;

    /* JADX INFO: renamed from: ֡ۤ۬, reason: not valid java name and contains not printable characters */
    public static boolean m6373() {
        return C23196.m51460();
    }

    /* JADX INFO: renamed from: ֨ۚܿ, reason: not valid java name and contains not printable characters */
    public static Iterator m6374(Object obj) {
        return ((List) obj).iterator();
    }

    /* JADX INFO: renamed from: ֫۬ۛ, reason: not valid java name and contains not printable characters */
    public static void m6375(Object obj) {
        ((C19697) obj).m45389();
    }

    /* JADX INFO: renamed from: ۗ֫ۤ, reason: not valid java name and contains not printable characters */
    public static void m6376(Object obj) {
        ((C11971) obj).m29244();
    }

    /* JADX INFO: renamed from: ۚۖۧ, reason: not valid java name and contains not printable characters */
    public static void m6377(Object obj, Object obj2) {
        ((TextView) obj).setText((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۛ֫ۖ, reason: not valid java name and contains not printable characters */
    public static String m6378(Object obj) {
        return ((String) obj).toLowerCase();
    }

    /* JADX INFO: renamed from: ۜܺᩳ, reason: not valid java name and contains not printable characters */
    public static void m6379(Object obj, Object obj2, Object obj3) {
        ((C0994) obj).m3474((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۟ۧۘ, reason: not valid java name and contains not printable characters */
    public static int m6380(Object obj) {
        return ((C12951) obj).m31494();
    }

    /* JADX INFO: renamed from: ۠᩶᩵, reason: not valid java name and contains not printable characters */
    public static boolean m6381(Object obj) {
        return ((C9047) obj).m23345();
    }

    /* JADX INFO: renamed from: ۫ۘ֡, reason: not valid java name and contains not printable characters */
    public static int m6382(Object obj) {
        return ((SpannableStringBuilder) obj).length();
    }

    /* JADX INFO: renamed from: ܳᩴۡ, reason: not valid java name and contains not printable characters */
    public static void m6383(Object obj) {
        ((ArrayList) obj).clear();
    }

    /* JADX INFO: renamed from: ᩴ᩻ۢ, reason: not valid java name and contains not printable characters */
    public static int m6384(Object obj) {
        return ((TextView) obj).length();
    }

    /* JADX INFO: renamed from: ᩵۠ܽ, reason: not valid java name and contains not printable characters */
    public static String m6385(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩹ۙۚ, reason: not valid java name and contains not printable characters */
    public static boolean m6386(Object obj, Object obj2) {
        return ((ArrayList) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ᩻֫۠, reason: not valid java name and contains not printable characters */
    public static int m6387() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩻ۙۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6388(Object obj) {
        return C15799.m37396((String) obj);
    }

    public RunnableC1937(ActivityC23809 activityC23809) {
        this.f6484 = activityC23809;
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
