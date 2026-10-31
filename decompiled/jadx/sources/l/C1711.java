package l;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import bin.mt.plugin.api.PluginContext;
import java.io.File;

/* JADX INFO: renamed from: l.֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4VX */
/* JADX INFO: loaded from: classes.dex */
public final class C1711 {

    /* JADX INFO: renamed from: ۠ۤۜ, reason: not valid java name and contains not printable characters */
    public static boolean f5919;

    /* JADX INFO: renamed from: ֫ܿۨ, reason: not valid java name and contains not printable characters */
    public static String m5726(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۖܽۡ, reason: not valid java name and contains not printable characters */
    public static void m5727(Object obj, Object obj2) {
        ((C19258) obj).m44421((View) obj2);
    }

    /* JADX INFO: renamed from: ۜۡ֫, reason: not valid java name and contains not printable characters */
    public static void m5728(int i) {
        C21374.m48463(i);
    }

    /* JADX INFO: renamed from: ۠ܺ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m5729() {
        return C23196.m51454();
    }

    /* JADX INFO: renamed from: ۢܰܶ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m5730(Object obj, long j) {
        return ((ObjectAnimator) obj).setDuration(j);
    }

    /* JADX INFO: renamed from: ۧܺۖ, reason: not valid java name and contains not printable characters */
    public static void m5731(Object obj) {
        ((Runnable) obj).run();
    }

    /* JADX INFO: renamed from: ۬᩺֡, reason: not valid java name and contains not printable characters */
    public static boolean m5732(Object obj) {
        return ((File) obj).exists();
    }

    /* JADX INFO: renamed from: ܰ᩷ܺ, reason: not valid java name and contains not printable characters */
    public static char m5733(Object obj, int i) {
        return ((String) obj).charAt(i);
    }

    /* JADX INFO: renamed from: ܳۚۨ, reason: not valid java name and contains not printable characters */
    public static void m5734(Object obj, Object obj2) {
        ((C0492) obj).m2168((String[]) obj2);
    }

    /* JADX INFO: renamed from: ᩳܳۙ, reason: not valid java name and contains not printable characters */
    public static void m5735(Object obj) {
        ((AbstractC15440) obj).m36508();
    }

    /* JADX INFO: renamed from: ᩸֫ۡ, reason: not valid java name and contains not printable characters */
    public static int m5736() {
        return 1849734846;
    }

    /* JADX INFO: renamed from: ᩸ۚ᩶, reason: not valid java name and contains not printable characters */
    public static int m5737(Object obj) {
        return ((View) obj).getId();
    }

    /* JADX INFO: renamed from: ᩹ۘۨ, reason: not valid java name and contains not printable characters */
    public static Intent m5738(Object obj, int i) {
        return ((Intent) obj).addFlags(i);
    }

    /* JADX INFO: renamed from: ᩻ۢۖ, reason: not valid java name and contains not printable characters */
    public static String m5739(Object obj, Object obj2) {
        return ((PluginContext) obj).getStringNullable((String) obj2);
    }

    /* JADX INFO: renamed from: ᩻ۨۖ, reason: not valid java name and contains not printable characters */
    public static boolean m5740(Object obj) {
        return ((View) obj).requestFocus();
    }

    /* JADX INFO: renamed from: ᩻ܳܽ, reason: not valid java name and contains not printable characters */
    public static int m5741(Object obj) {
        return ((String) obj).length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5725(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof InterfaceC20345) {
                editorInfo.hintText = ((InterfaceC20345) parent).getHint();
                return;
            }
        }
    }
}
