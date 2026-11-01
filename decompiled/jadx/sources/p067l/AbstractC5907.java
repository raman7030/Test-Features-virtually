package p067l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۘۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 85PM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5907 extends C4360 {
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8363(AbstractActivityC5549 abstractActivityC5549);

    public AbstractC5907(Context context) {
        super(context);
    }

    public AbstractC5907(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC5907(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AbstractC5907(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۛ */
    public final void mo9034() {
        mo8363((AbstractActivityC5549) C7453.m17221(m9012()));
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final SharedPreferences m13265() {
        SharedPreferences sharedPreferencesM9009 = m9009();
        C12826.requireNonNull(sharedPreferencesM9009);
        return sharedPreferencesM9009;
    }
}
