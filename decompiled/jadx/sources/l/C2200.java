package l;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2200 extends AbstractC3255 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View f7228;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f7229;

    public C2200(View view) {
        super(view);
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.f7229 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f7228 = view.findViewById(R.id.MT_Protector);
    }
}
