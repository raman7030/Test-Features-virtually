package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1958 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۨ۫ᩳ, reason: not valid java name and contains not printable characters */
    public static int f6529;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4075 f6530;

    /* JADX INFO: renamed from: ֨᩺᩶, reason: not valid java name and contains not printable characters */
    public static void m6428(Object obj, Object obj2, boolean z) {
        ((Bundle) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۙ֫۬, reason: not valid java name and contains not printable characters */
    public static int m6429() {
        return -1688876032;
    }

    /* JADX INFO: renamed from: ۟ۚܿ, reason: not valid java name and contains not printable characters */
    public static byte[] m6430(Object obj) {
        return ((AbstractC15440) obj).m36506();
    }

    /* JADX INFO: renamed from: ۡ۫֨, reason: not valid java name and contains not printable characters */
    public static int m6431(float f) {
        return C11266.m27878(f);
    }

    /* JADX INFO: renamed from: ۤ֨ۨ, reason: not valid java name and contains not printable characters */
    public static long m6432() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۧ۫֨, reason: not valid java name and contains not printable characters */
    public static void m6433(Object obj, float f) {
        ((View) obj).setAlpha(f);
    }

    /* JADX INFO: renamed from: ܰ۟ۘ, reason: not valid java name and contains not printable characters */
    public static void m6434(Object obj) {
        ((AbstractC19902) obj).notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܰ᩷ۤ, reason: not valid java name and contains not printable characters */
    public static String m6435(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܳۖ᩷, reason: not valid java name and contains not printable characters */
    public static String[] m6436(Object obj, Object obj2) {
        return ((String) obj).split((String) obj2);
    }

    /* JADX INFO: renamed from: ܺۤ֨, reason: not valid java name and contains not printable characters */
    public static boolean m6437(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ܽ᩶ܿ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13049 m6438(Object obj) {
        return ((InterfaceC12344) obj).edit();
    }

    /* JADX INFO: renamed from: ᩳۧۛ, reason: not valid java name and contains not printable characters */
    public static JSONObject m6439(Object obj, Object obj2, int i) {
        return ((JSONObject) obj).add((String) obj2, i);
    }

    /* JADX INFO: renamed from: ᩳᩳۚ, reason: not valid java name and contains not printable characters */
    public static String m6440(Object obj) {
        return ((C23881) obj).m52602();
    }

    /* JADX INFO: renamed from: ᩵᩻ۡ, reason: not valid java name and contains not printable characters */
    public static void m6441(Object obj, int i, Object obj2) {
        ((C19258) obj).m44442(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ᩷ۙ۠, reason: not valid java name and contains not printable characters */
    public static void m6442(Object obj, Object obj2) {
        ((C13132) obj).setAdapter((AbstractC19902) obj2);
    }

    /* JADX INFO: renamed from: ᩻ܰ᩷, reason: not valid java name and contains not printable characters */
    public static void m6443(Object obj, long j) {
        C4925.m14316((Runnable) obj, j);
    }

    public ViewOnClickListenerC1958(C4075 c4075) {
        this.f6530 = c4075;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        C4075 c4075 = this.f6530;
        if (view == c4075.f12952 && (message3 = c4075.f12981) != null) {
            messageObtain = Message.obtain(message3);
        } else if (view == c4075.f12977 && (message2 = c4075.f12989) != null) {
            messageObtain = Message.obtain(message2);
        } else {
            messageObtain = (view != c4075.f12984 || (message = c4075.f12962) == null) ? null : Message.obtain(message);
        }
        if (messageObtain != null) {
            messageObtain.sendToTarget();
        }
        c4075.f12973.obtainMessage(1, c4075.f12961).sendToTarget();
    }
}
