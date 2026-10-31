package l;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.ۖۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y64E */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2262 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC17366 f7349;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7348 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Rect f7350 = new Rect();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo7472();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo7473(View view);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo7474(int i);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract int mo7476();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract int mo7477(View view);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract int mo7478();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract int mo7479(View view);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract int mo7480();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract int mo7481(View view);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public abstract int mo7482();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public abstract int mo7483(View view);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract int mo7484();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract int mo7485(View view);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract int mo7487();

    public AbstractC2262(AbstractC17366 abstractC17366) {
        this.f7349 = abstractC17366;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7486() {
        this.f7348 = mo7487();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m7475() {
        if (Integer.MIN_VALUE == this.f7348) {
            return 0;
        }
        return mo7487() - this.f7348;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC2262 m7471(AbstractC17366 abstractC17366, int i) {
        if (i == 0) {
            return new C8612(abstractC17366);
        }
        if (i != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C15666(abstractC17366);
    }
}
