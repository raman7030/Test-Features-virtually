package p067l;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4459 extends AbstractC5462 {

    /* JADX INFO: renamed from: ֫ */
    public final View f10013;

    /* JADX INFO: renamed from: ۧ */
    public final TextView f10014;

    public C4459(View view) {
        super(view);
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.f10014 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f10013 = view.findViewById(R.id.MT_Protector);
    }
}
