package l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۘۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 85PM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3723 extends C2095 {
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6161(AbstractActivityC3346 abstractActivityC3346);

    public AbstractC3723(Context context) {
        super(context);
    }

    public AbstractC3723(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC3723(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AbstractC3723(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ۛ */
    public final void mo6908() {
        mo6161((AbstractActivityC3346) C5350.m15313(m6886()));
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final SharedPreferences m11313() {
        SharedPreferences sharedPreferencesM6883 = m6883();
        C11003.requireNonNull(sharedPreferencesM6883);
        return sharedPreferencesM6883;
    }
}
