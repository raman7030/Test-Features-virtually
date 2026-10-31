package l;

import android.content.Context;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8VV */
/* JADX INFO: loaded from: classes4.dex */
public class C14305 extends AbstractC3723 {

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public C6874 f43131;

    public C14305(Context context) {
        super(context);
        m34131();
    }

    public C14305(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m34131();
    }

    public C14305(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m34131();
    }

    public C14305(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m34131();
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    private void m34131() {
        mo6894((CharSequence) C4925.m14327(R.string.MT_Protector).concat(" mt.cc"));
    }

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        if (this.f43131 == null) {
            this.f43131 = new C6874(abstractActivityC3346);
        }
        this.f43131.m18609(false, new RunnableC0709());
    }
}
