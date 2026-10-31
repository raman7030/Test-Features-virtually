package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.֫ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes.dex */
public final class C1907 extends AbstractViewOnClickListenerC1201 {

    /* JADX INFO: renamed from: ۙ᩸᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f6427;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f6428;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3577 f6429;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3318 f6430;

    static {
        ApplicationC12518.m30701(27);
        f6427 = new short[]{9293, 29164, 29174, 11836, 11555, 16076};
    }

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    @Override // l.AbstractC11580
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo6259() {
        return 6;
    }

    public C1907(Main main, C3318 c3318) {
        super(main);
        this.f6430 = c3318;
        this.f6429 = null;
        this.f6428 = true;
    }

    public C1907(Main main, C3318 c3318, AbstractC3577 abstractC3577) {
        super(main);
        this.f6430 = c3318;
        this.f6429 = abstractC3577;
        this.f6428 = false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m6260() {
        return this.f6428;
    }
}
