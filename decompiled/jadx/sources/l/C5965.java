package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4YL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5965 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f18296 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f18297 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C5965 f18298;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1566 f18299;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m16702(Context context, int i) {
        return this.f18299.m5356(context, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16703(Context context) {
        this.f18299.m5358(context);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m16704(Context context, int i) {
        return this.f18299.m5357(context, i, true);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized ColorStateList m16705(Context context, int i) {
        return this.f18299.m5360(context, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized PorterDuffColorFilter m16699(int i, PorterDuff.Mode mode) {
        return C1566.m5347(i, mode);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized C5965 m16700() {
        if (f18298 == null) {
            m16701();
        }
        return f18298;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static synchronized void m16701() {
        if (f18298 == null) {
            C5965 c5965 = new C5965();
            f18298 = c5965;
            c5965.f18299 = C1566.m5349();
            f18298.f18299.m5359(new C10199());
        }
    }
}
