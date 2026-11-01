package p067l;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import bin.p000mt.plugin.api.PluginContext;
import java.io.File;

/* JADX INFO: renamed from: l.֫ۡ */
/* JADX INFO: compiled from: B4VX */
/* JADX INFO: loaded from: classes.dex */
public final class C0927 {

    /* JADX INFO: renamed from: ۠ۤۜ, reason: not valid java name and contains not printable characters */
    public static boolean f81875;

    /* JADX INFO: renamed from: ֫ܿۨ, reason: not valid java name and contains not printable characters */
    public static String m55863(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۖܽۡ, reason: not valid java name and contains not printable characters */
    public static void m55864(Object obj, Object obj2) {
        ((C20671) obj).m46715((View) obj2);
    }

    /* JADX INFO: renamed from: ۜۡ֫, reason: not valid java name and contains not printable characters */
    public static void m55865(int i) {
        C22682.m50799(i);
    }

    /* JADX INFO: renamed from: ۠ܺ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m55866() {
        return C24414.m53850();
    }

    /* JADX INFO: renamed from: ۢܰܶ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m55867(Object obj, long j) {
        return ((ObjectAnimator) obj).setDuration(j);
    }

    /* JADX INFO: renamed from: ۧܺۖ, reason: not valid java name and contains not printable characters */
    public static void m55868(Object obj) {
        ((Runnable) obj).run();
    }

    /* JADX INFO: renamed from: ۬᩺֡, reason: not valid java name and contains not printable characters */
    public static boolean m55869(Object obj) {
        return ((File) obj).exists();
    }

    /* JADX INFO: renamed from: ܰ᩷ܺ, reason: not valid java name and contains not printable characters */
    public static char m55870(Object obj, int i) {
        return ((String) obj).charAt(i);
    }

    /* JADX INFO: renamed from: ܳۚۨ, reason: not valid java name and contains not printable characters */
    public static void m55871(Object obj, Object obj2) {
        ((C2836) obj).m4535((String[]) obj2);
    }

    /* JADX INFO: renamed from: ᩳܳۙ, reason: not valid java name and contains not printable characters */
    public static void m55872(Object obj) {
        ((AbstractC17043) obj).m38666();
    }

    /* JADX INFO: renamed from: ᩸֫ۡ, reason: not valid java name and contains not printable characters */
    public static int m55873() {
        return 1849734846;
    }

    /* JADX INFO: renamed from: ᩸ۚ᩶, reason: not valid java name and contains not printable characters */
    public static int m55874(Object obj) {
        return ((View) obj).getId();
    }

    /* JADX INFO: renamed from: ᩹ۘۨ, reason: not valid java name and contains not printable characters */
    public static Intent m55875(Object obj, int i) {
        return ((Intent) obj).addFlags(i);
    }

    /* JADX INFO: renamed from: ᩻ۢۖ, reason: not valid java name and contains not printable characters */
    public static String m55876(Object obj, Object obj2) {
        return ((PluginContext) obj).getStringNullable((String) obj2);
    }

    /* JADX INFO: renamed from: ᩻ۨۖ, reason: not valid java name and contains not printable characters */
    public static boolean m55877(Object obj) {
        return ((View) obj).requestFocus();
    }

    /* JADX INFO: renamed from: ᩻ܳܽ, reason: not valid java name and contains not printable characters */
    public static int m55878(Object obj) {
        return ((String) obj).length();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7951(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof InterfaceC1851) {
                editorInfo.hintText = ((InterfaceC1851) parent).getHint();
                return;
            }
        }
    }
}
