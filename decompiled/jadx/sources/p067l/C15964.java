package p067l;

import android.content.Context;
import android.util.AttributeSet;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܳۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8VV */
/* JADX INFO: loaded from: classes4.dex */
public class C15964 extends AbstractC5907 {

    /* JADX INFO: renamed from: ۫֫ */
    public C8902 f46223;

    public C15964(Context context) {
        super(context);
        m36264();
    }

    public C15964(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m36264();
    }

    public C15964(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m36264();
    }

    public C15964(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m36264();
    }

    /* JADX INFO: renamed from: ۢ֫ */
    private void m36264() {
        mo9020((CharSequence) C7050.m16224(R.string.MT_Protector).concat(" mt.cc"));
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        if (this.f46223 == null) {
            this.f46223 = new C8902(abstractActivityC5549);
        }
        this.f46223.m20558(false, new RunnableC3043());
    }
}
