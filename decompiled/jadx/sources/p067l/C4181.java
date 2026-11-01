package p067l;

import android.view.View;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.֫ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes.dex */
public final class C4181 extends AbstractViewOnClickListenerC3510 {

    /* JADX INFO: renamed from: ۙ᩸᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f81883;

    /* JADX INFO: renamed from: ۗ */
    public final boolean f9208;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC5769 f9209;

    /* JADX INFO: renamed from: ᩶ */
    public final C5522 f9210;

    static {
        ApplicationC14266.m56479(27);
        f81883 = new short[]{9293, 29164, 29174, 11836, 11555, 16076};
    }

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    @Override // p067l.AbstractC13374
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461() {
        return 6;
    }

    public C4181(Main main, C5522 c5522) {
        super(main);
        this.f9210 = c5522;
        this.f9209 = null;
        this.f9208 = true;
    }

    public C4181(Main main, C5522 c5522, AbstractC5769 abstractC5769) {
        super(main);
        this.f9210 = c5522;
        this.f9209 = abstractC5769;
        this.f9208 = false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m8462() {
        return this.f9208;
    }
}
