package p067l;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.ۖۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y64E */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4518 {

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC18873 f10137;

    /* JADX INFO: renamed from: ֫ */
    public int f10136 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܽ */
    public final Rect f10138 = new Rect();

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo9554();

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo9555(View view);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9556(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo9558();

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo9559(View view);

    /* JADX INFO: renamed from: ܳ */
    public abstract int mo9560();

    /* JADX INFO: renamed from: ܳ */
    public abstract int mo9561(View view);

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo9562();

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo9563(View view);

    /* JADX INFO: renamed from: ܿ */
    public abstract int mo9564();

    /* JADX INFO: renamed from: ܿ */
    public abstract int mo9565(View view);

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo9566();

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo9567(View view);

    /* JADX INFO: renamed from: ᩻ */
    public abstract int mo9569();

    public AbstractC4518(AbstractC18873 abstractC18873) {
        this.f10137 = abstractC18873;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m9568() {
        this.f10136 = mo9569();
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m9557() {
        if (Integer.MIN_VALUE == this.f10136) {
            return 0;
        }
        return mo9569() - this.f10136;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC4518 m9553(AbstractC18873 abstractC18873, int i) {
        if (i == 0) {
            return new C10553(abstractC18873);
        }
        if (i != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C17257(abstractC18873);
    }
}
