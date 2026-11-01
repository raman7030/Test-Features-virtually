package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8VQ */
/* JADX INFO: loaded from: classes5.dex */
public class C20660 extends AbstractC5907 {
    public C20660(Context context) {
        super(context);
        m9024((InterfaceC9544) new C17073());
    }

    public C20660(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9024((InterfaceC9544) new C17073());
    }

    public C20660(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9024((InterfaceC9544) new C17073());
    }

    public C20660(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m9024((InterfaceC9544) new C17073());
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        CharSequence[] charSequenceArr = {m9012().getString(R.string.MT_Protector), m9012().getString(R.string.MT_Protector)};
        int i = m13265().getInt(m9037(), 0);
        final boolean[] zArr = {(i & 1) != 0, (i & 2) != 0};
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46730(m9035());
        c20671.m46725(charSequenceArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.ᩴۙ᩷
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i3, boolean z) {
                zArr[i3] = z;
            }
        });
        c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9390(3, this, zArr));
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46670(C20660 c20660, boolean[] zArr) {
        int i = 0;
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                i |= 1 << i2;
            }
        }
        c20660.m13265().edit().putInt(c20660.m9037(), i).apply();
        c20660.mo9048();
    }
}
