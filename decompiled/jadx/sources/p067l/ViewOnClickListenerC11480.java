package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۢ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: EDB */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11480 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long l2 = (Long) view.getTag(R.id.MT_Protector);
        if (l2 != null) {
            String strM53411 = C24158.m53411(l2.longValue());
            C7050.m16214(strM53411, C7050.m16224(R.string.MT_Protector) + ": " + strM53411);
        }
    }
}
