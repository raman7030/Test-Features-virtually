package p067l;

import android.content.Context;
import android.util.AttributeSet;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y16E */
/* JADX INFO: loaded from: classes5.dex */
public class C21961 extends AbstractC5907 {
    public C21961(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m9024((InterfaceC9544) new C4407(this));
    }

    public C21961(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9024((InterfaceC9544) new C4407(this));
    }

    public C21961(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9024((InterfaceC9544) new C4407(this));
    }

    public C21961(Context context) {
        super(context);
        m9024((InterfaceC9544) new C4407(this));
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        C1627 c1627 = new C1627(abstractActivityC5549, null);
        c1627.setMax(22);
        c1627.setPadding(c1627.getPaddingLeft(), C13076.m29939(20.0f) + c1627.getPaddingTop(), c1627.getPaddingRight(), c1627.getPaddingBottom());
        c1627.setProgress(m13265().getInt(m9037(), 12) - 6);
        String str = abstractActivityC5549.getString(R.string.MT_Protector) + " (";
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(c1627.getProgress() + 6);
        sbM17248.append("dp)");
        c20671BuildDialog.m46730(sbM17248.toString());
        c20671BuildDialog.m46715(c1627);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c1627.setOnSeekBarChangeListener(new C8549(this, c20671BuildDialog.m46732(), str));
    }
}
