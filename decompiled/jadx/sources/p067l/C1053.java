package p067l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ᩻ */
/* JADX INFO: compiled from: I9N6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1053 implements Drawable.Callback {

    /* JADX INFO: renamed from: ᩵ۜ֨, reason: not valid java name and contains not printable characters */
    public static int f81965;

    /* JADX INFO: renamed from: ᩸ */
    public Drawable.Callback f16617;

    /* JADX INFO: renamed from: ۗۙۙ, reason: not valid java name and contains not printable characters */
    public static String m56320(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replaceAll((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۗ᩹ܶ, reason: not valid java name and contains not printable characters */
    public static View m56321(Object obj, int i) {
        return ((AbstractActivityC5549) obj).m12277(i);
    }

    /* JADX INFO: renamed from: ۘ᩷᩸, reason: not valid java name and contains not printable characters */
    public static void m56322(Object obj, boolean z) {
        ((C0990) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ۙ۫ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m56323(Object obj) {
        return ((C14677) obj).m33585();
    }

    /* JADX INFO: renamed from: ۙ۫᩻, reason: not valid java name and contains not printable characters */
    public static void m56324(Object obj, int i, int i2) {
        ((ViewOnClickListenerC22974) obj).m51304(i, i2);
    }

    /* JADX INFO: renamed from: ۙܺܶ, reason: not valid java name and contains not printable characters */
    public static String m56325(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۛ֡᩷, reason: not valid java name and contains not printable characters */
    public static boolean m56326(Object obj, Object obj2, boolean z) {
        return ((InterfaceC14100) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۨ᩻ۚ, reason: not valid java name and contains not printable characters */
    public static int m56327() {
        return -1950000564;
    }

    /* JADX INFO: renamed from: ۬ۖ۠, reason: not valid java name and contains not printable characters */
    public static Object m56328(Object obj, Object obj2) {
        return ((HashMap) obj).get(obj2);
    }

    /* JADX INFO: renamed from: ۬ۗۗ, reason: not valid java name and contains not printable characters */
    public static void m56329(Object obj) {
        ((AbstractC9542) obj).m22250();
    }

    /* JADX INFO: renamed from: ܿᩴܽ, reason: not valid java name and contains not printable characters */
    public static boolean m56330(Object obj) {
        return ((C17436) obj).m39714();
    }

    /* JADX INFO: renamed from: ܿ᩹۬, reason: not valid java name and contains not printable characters */
    public static void m56331(Object obj, Object obj2) {
        ((View) obj).setTag(obj2);
    }

    /* JADX INFO: renamed from: ᩴᩳۚ, reason: not valid java name and contains not printable characters */
    public static boolean m56332(Object obj) {
        return TextUtils.isEmpty((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ᩷ۘ֡, reason: not valid java name and contains not printable characters */
    public static String m56333(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC14100) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩺ۖۗ, reason: not valid java name and contains not printable characters */
    public static String m56334(Object obj) {
        return C20186.m45682((String) obj);
    }

    /* JADX INFO: renamed from: ᩻ۛۢ, reason: not valid java name and contains not printable characters */
    public static byte m56335(Object obj, int i) {
        return ((C19279) obj).m43961(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14693(Drawable.Callback callback) {
        this.f16617 = callback;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Drawable.Callback m14692() {
        Drawable.Callback callback = this.f16617;
        this.f16617 = null;
        return callback;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.f16617;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.f16617;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}
