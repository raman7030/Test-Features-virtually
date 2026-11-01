package p067l;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܰۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AVR */
/* JADX INFO: loaded from: classes4.dex */
public class C15254 extends AbstractC5907 {
    public C15254(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public C15254(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C15254(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C15254(Context context) {
        super(context);
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        abstractActivityC5549.startActivity(new Intent(abstractActivityC5549, (Class<?>) ActivityC2822.class));
    }
}
