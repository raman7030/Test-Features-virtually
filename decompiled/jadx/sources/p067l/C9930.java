package p067l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes3.dex */
public final class C9930 extends AbstractC5462 {

    /* JADX INFO: renamed from: ֫ */
    public final ImageView f27509;

    /* JADX INFO: renamed from: ۧ */
    public final TextView f27510;

    public C9930(View view) {
        super(view);
        this.f27509 = (ImageView) view.findViewById(R.id.icon);
        this.f27510 = (TextView) view.findViewById(R.id.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23230(int i, int i2) {
        this.f27510.setText(i);
        this.f27509.setImageResource(i2);
    }
}
