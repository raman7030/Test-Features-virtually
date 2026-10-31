package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RI */
/* JADX INFO: loaded from: classes.dex */
public class C22731 extends AbstractC3723 {
    public C22731(Context context) {
        super(context);
    }

    public C22731(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C22731(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C22731(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ۤ */
    public final void mo6912() {
        super.mo6912();
        mo6894((CharSequence) String.valueOf(m11313().getInt(m6911(), 4)));
    }

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        SeekBar seekBar = (SeekBar) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewM10216.findViewById(R.id.textView);
        seekBar.setOnSeekBarChangeListener(new C11443(this, textView));
        int i = m11313().getInt(m6911(), 4);
        seekBar.setProgress(i - 1);
        textView.setText(String.valueOf(i));
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44436(m6909());
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44438();
    }
}
