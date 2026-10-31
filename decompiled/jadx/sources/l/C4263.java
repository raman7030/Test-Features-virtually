package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I9N6 */
/* JADX INFO: loaded from: classes.dex */
public final class C4263 implements Drawable.Callback {

    /* JADX INFO: renamed from: ᩵ۜ֨, reason: not valid java name and contains not printable characters */
    public static int f13799;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Drawable.Callback f13800;

    /* JADX INFO: renamed from: ۗۙۙ, reason: not valid java name and contains not printable characters */
    public static String m12812(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replaceAll((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۗ᩹ܶ, reason: not valid java name and contains not printable characters */
    public static View m12813(Object obj, int i) {
        return ((AbstractActivityC3346) obj).m10241(i);
    }

    /* JADX INFO: renamed from: ۘ᩷᩸, reason: not valid java name and contains not printable characters */
    public static void m12814(Object obj, boolean z) {
        ((C2978) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ۙ۫ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m12815(Object obj) {
        return ((C12951) obj).m31498();
    }

    /* JADX INFO: renamed from: ۙ۫᩻, reason: not valid java name and contains not printable characters */
    public static void m12816(Object obj, int i, int i2) {
        ((ViewOnClickListenerC21681) obj).m48955(i, i2);
    }

    /* JADX INFO: renamed from: ۙܺܶ, reason: not valid java name and contains not printable characters */
    public static String m12817(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۛ֡᩷, reason: not valid java name and contains not printable characters */
    public static boolean m12818(Object obj, Object obj2, boolean z) {
        return ((InterfaceC12344) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۨ᩻ۚ, reason: not valid java name and contains not printable characters */
    public static int m12819() {
        return -1950000564;
    }

    /* JADX INFO: renamed from: ۬ۖ۠, reason: not valid java name and contains not printable characters */
    public static Object m12820(Object obj, Object obj2) {
        return ((HashMap) obj).get(obj2);
    }

    /* JADX INFO: renamed from: ۬ۗۗ, reason: not valid java name and contains not printable characters */
    public static void m12821(Object obj) {
        ((AbstractC7548) obj).m20274();
    }

    /* JADX INFO: renamed from: ܿᩴܽ, reason: not valid java name and contains not printable characters */
    public static boolean m12822(Object obj) {
        return ((C15854) obj).m37542();
    }

    /* JADX INFO: renamed from: ܿ᩹۬, reason: not valid java name and contains not printable characters */
    public static void m12823(Object obj, Object obj2) {
        ((View) obj).setTag(obj2);
    }

    /* JADX INFO: renamed from: ᩴᩳۚ, reason: not valid java name and contains not printable characters */
    public static boolean m12824(Object obj) {
        return TextUtils.isEmpty((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ᩷ۘ֡, reason: not valid java name and contains not printable characters */
    public static String m12825(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC12344) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩺ۖۗ, reason: not valid java name and contains not printable characters */
    public static String m12826(Object obj) {
        return C18747.m43415((String) obj);
    }

    /* JADX INFO: renamed from: ᩻ۛۢ, reason: not valid java name and contains not printable characters */
    public static byte m12827(Object obj, int i) {
        return ((C17793) obj).m41715(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12829(Drawable.Callback callback) {
        this.f13800 = callback;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable.Callback m12828() {
        Drawable.Callback callback = this.f13800;
        this.f13800 = null;
        return callback;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.f13800;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.f13800;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}
