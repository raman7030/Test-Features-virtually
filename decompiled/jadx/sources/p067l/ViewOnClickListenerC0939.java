package p067l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.֫ܿ */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0939 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۨ۫ᩳ, reason: not valid java name and contains not printable characters */
    public static int f81888;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1044 f9309;

    /* JADX INFO: renamed from: ֨᩺᩶, reason: not valid java name and contains not printable characters */
    public static void m55940(Object obj, Object obj2, boolean z) {
        ((Bundle) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۙ֫۬, reason: not valid java name and contains not printable characters */
    public static int m55941() {
        return -1688876032;
    }

    /* JADX INFO: renamed from: ۟ۚܿ, reason: not valid java name and contains not printable characters */
    public static byte[] m55942(Object obj) {
        return ((AbstractC17043) obj).m38664();
    }

    /* JADX INFO: renamed from: ۡ۫֨, reason: not valid java name and contains not printable characters */
    public static int m55943(float f) {
        return C13076.m29939(f);
    }

    /* JADX INFO: renamed from: ۤ֨ۨ, reason: not valid java name and contains not printable characters */
    public static long m55944() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۧ۫֨, reason: not valid java name and contains not printable characters */
    public static void m55945(Object obj, float f) {
        ((View) obj).setAlpha(f);
    }

    /* JADX INFO: renamed from: ܰ۟ۘ, reason: not valid java name and contains not printable characters */
    public static void m55946(Object obj) {
        ((AbstractC21283) obj).notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܰ᩷ۤ, reason: not valid java name and contains not printable characters */
    public static String m55947(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܳۖ᩷, reason: not valid java name and contains not printable characters */
    public static String[] m55948(Object obj, Object obj2) {
        return ((String) obj).split((String) obj2);
    }

    /* JADX INFO: renamed from: ܺۤ֨, reason: not valid java name and contains not printable characters */
    public static boolean m55949(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ܽ᩶ܿ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14770 m55950(Object obj) {
        return ((InterfaceC14100) obj).edit();
    }

    /* JADX INFO: renamed from: ᩳۧۛ, reason: not valid java name and contains not printable characters */
    public static JSONObject m55951(Object obj, Object obj2, int i) {
        return ((JSONObject) obj).add((String) obj2, i);
    }

    /* JADX INFO: renamed from: ᩳᩳۚ, reason: not valid java name and contains not printable characters */
    public static String m55952(Object obj) {
        return ((C25065) obj).m55011();
    }

    /* JADX INFO: renamed from: ᩵᩻ۡ, reason: not valid java name and contains not printable characters */
    public static void m55953(Object obj, int i, Object obj2) {
        ((C20671) obj).m46736(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ᩷ۙ۠, reason: not valid java name and contains not printable characters */
    public static void m55954(Object obj, Object obj2) {
        ((C14849) obj).setAdapter((AbstractC21283) obj2);
    }

    /* JADX INFO: renamed from: ᩻ܰ᩷, reason: not valid java name and contains not printable characters */
    public static void m55955(Object obj, long j) {
        C7050.m16213((Runnable) obj, j);
    }

    public ViewOnClickListenerC0939(C1044 c1044) {
        this.f9309 = c1044;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        C1044 c1044 = this.f9309;
        if (view == c1044.f15767 && (message3 = c1044.f15796) != null) {
            messageObtain = Message.obtain(message3);
        } else if (view == c1044.f15792 && (message2 = c1044.f15804) != null) {
            messageObtain = Message.obtain(message2);
        } else {
            messageObtain = (view != c1044.f15799 || (message = c1044.f15777) == null) ? null : Message.obtain(message);
        }
        if (messageObtain != null) {
            messageObtain.sendToTarget();
        }
        c1044.f15788.obtainMessage(1, c1044.f15776).sendToTarget();
    }
}
