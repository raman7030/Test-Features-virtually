package l;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.᩹ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C9CO */
/* JADX INFO: loaded from: classes.dex */
public class C22067 extends AbstractC3723 {
    public C22067(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public C22067(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C22067(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C22067(Context context) {
        super(context);
    }

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        abstractActivityC3346.startActivity(new Intent(abstractActivityC3346, (Class<?>) ActivityC9923.class));
    }
}
