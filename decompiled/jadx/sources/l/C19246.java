package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8VQ */
/* JADX INFO: loaded from: classes5.dex */
public class C19246 extends AbstractC3723 {
    public C19246(Context context) {
        super(context);
        m6898((InterfaceC7550) new C15472());
    }

    public C19246(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6898((InterfaceC7550) new C15472());
    }

    public C19246(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6898((InterfaceC7550) new C15472());
    }

    public C19246(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m6898((InterfaceC7550) new C15472());
    }

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        CharSequence[] charSequenceArr = {m6886().getString(R.string.MT_Protector), m6886().getString(R.string.MT_Protector)};
        int i = m11313().getInt(m6911(), 0);
        final boolean[] zArr = {(i & 1) != 0, (i & 2) != 0};
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44436(m6909());
        c19258.m44431(charSequenceArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.ᩴۙ᩷
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i3, boolean z) {
                zArr[i3] = z;
            }
        });
        c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7388(3, this, zArr));
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44376(C19246 c19246, boolean[] zArr) {
        int i = 0;
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                i |= 1 << i2;
            }
        }
        c19246.m11313().edit().putInt(c19246.m6911(), i).apply();
        c19246.mo6922();
    }
}
