package p067l;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۢ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 77IH */
/* JADX INFO: loaded from: classes4.dex */
public class C11506 extends AbstractC5907 {
    public C11506(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public C11506(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C11506(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C11506(Context context) {
        super(context);
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        abstractActivityC5549.startActivity(new Intent(abstractActivityC5549, (Class<?>) ActivityC8446.class));
    }
}
