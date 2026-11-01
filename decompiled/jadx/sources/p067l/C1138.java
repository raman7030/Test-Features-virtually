package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۛۢ */
/* JADX INFO: compiled from: A4YL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1138 {

    /* JADX INFO: renamed from: ۧ */
    public static final /* synthetic */ int f21149 = 0;

    /* JADX INFO: renamed from: ܽ */
    public static final PorterDuff.Mode f21150 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᩳ */
    public static C1138 f21151;

    /* JADX INFO: renamed from: ֫ */
    public C0920 f21152;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized Drawable m18628(Context context, int i) {
        return this.f21152.m7585(context, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m18629(Context context) {
        this.f21152.m7587(context);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized Drawable m18630(Context context, int i) {
        return this.f21152.m7586(context, i, true);
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized ColorStateList m18631(Context context, int i) {
        return this.f21152.m7589(context, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized PorterDuffColorFilter m18625(int i, PorterDuff.Mode mode) {
        return C0920.m7576(i, mode);
    }

    /* JADX INFO: renamed from: ۧ */
    public static synchronized C1138 m18626() {
        if (f21151 == null) {
            m18627();
        }
        return f21151;
    }

    /* JADX INFO: renamed from: ܽ */
    public static synchronized void m18627() {
        if (f21151 == null) {
            C1138 c1138 = new C1138();
            f21151 = c1138;
            c1138.f21152 = C0920.m7578();
            f21151.f21152.m7588(new C1348());
        }
    }
}
