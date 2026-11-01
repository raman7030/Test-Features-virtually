package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RI */
/* JADX INFO: loaded from: classes.dex */
public class C23972 extends AbstractC5907 {
    public C23972(Context context) {
        super(context);
    }

    public C23972(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C23972(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C23972(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۤ */
    public final void mo9038() {
        super.mo9038();
        mo9020((CharSequence) String.valueOf(m13265().getInt(m9037(), 4)));
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        SeekBar seekBar = (SeekBar) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.textView);
        seekBar.setOnSeekBarChangeListener(new C13244(this, textView));
        int i = m13265().getInt(m9037(), 4);
        seekBar.setProgress(i - 1);
        textView.setText(String.valueOf(i));
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46730(m9035());
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46732();
    }
}
