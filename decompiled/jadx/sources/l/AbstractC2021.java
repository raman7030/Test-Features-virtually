package l;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2021 {

    /* JADX INFO: renamed from: ܶ᩻᩷, reason: not valid java name and contains not printable characters */
    public static int f6743;

    /* JADX INFO: renamed from: ֡ۛۧ, reason: not valid java name and contains not printable characters */
    public static void m6559(Object obj, Object obj2) {
        ((C9762) obj).setNavigationOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ֨ۤۖ, reason: not valid java name and contains not printable characters */
    public static C15206 m6560(Object obj) {
        return C15206.m35970((InputStream) obj);
    }

    /* JADX INFO: renamed from: ۘۤ۫, reason: not valid java name and contains not printable characters */
    public static void m6561(Object obj) {
        ((C8918) obj).close();
    }

    /* JADX INFO: renamed from: ۙۘᩳ, reason: not valid java name and contains not printable characters */
    public static Looper m6562() {
        return Looper.myLooper();
    }

    /* JADX INFO: renamed from: ۜ֫ܳ, reason: not valid java name and contains not printable characters */
    public static String m6563(Object obj, int i) {
        return C1575.m5392((C23881) obj, i);
    }

    /* JADX INFO: renamed from: ۟ۚۘ, reason: not valid java name and contains not printable characters */
    public static boolean m6564(Object obj, int i) {
        return ((C19277) obj).m44460(i);
    }

    /* JADX INFO: renamed from: ۡ۬ܳ, reason: not valid java name and contains not printable characters */
    public static Class m6565(Object obj) {
        return obj.getClass();
    }

    /* JADX INFO: renamed from: ۫۠ۗ, reason: not valid java name and contains not printable characters */
    public static Context m6566(Object obj) {
        return ((View) obj).getContext();
    }

    /* JADX INFO: renamed from: ܰ۫ܺ, reason: not valid java name and contains not printable characters */
    public static String m6567() {
        return C23196.m51459();
    }

    /* JADX INFO: renamed from: ܳ۟ۖ, reason: not valid java name and contains not printable characters */
    public static void m6568(Object obj, int i, Object obj2, int i2, int i3) {
        System.arraycopy(obj, i, obj2, i2, i3);
    }

    /* JADX INFO: renamed from: ܳ᩺۟, reason: not valid java name and contains not printable characters */
    public static boolean m6569(Object obj) {
        return ((AbstractC15440) obj).mo23552();
    }

    /* JADX INFO: renamed from: ܶܰۧ, reason: not valid java name and contains not printable characters */
    public static String m6570(Object obj, Object obj2) {
        return ((Intent) obj).getStringExtra((String) obj2);
    }

    /* JADX INFO: renamed from: ᩺ۗۛ, reason: not valid java name and contains not printable characters */
    public static void m6571(Object obj, int i) {
        C0287.m1630((TextInputLayout) obj, i);
    }

    /* JADX INFO: renamed from: ᩺᩹᩷, reason: not valid java name and contains not printable characters */
    public static int m6572(Object obj) {
        return Integer.parseInt((String) obj);
    }

    /* JADX INFO: renamed from: ᩻ۚܺ, reason: not valid java name and contains not printable characters */
    public static String m6573(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩻ۧܶ, reason: not valid java name and contains not printable characters */
    public static boolean m6574() {
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo6575(C23166 c23166);
}
