package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: EDB */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLongClickListenerC10809 implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Long l2 = (Long) view.getTag(R.id.MT_Protector);
        if (l2 == null) {
            return true;
        }
        String strValueOf = String.valueOf(l2);
        C7050.m16214(strValueOf, C7050.m16224(R.string.MT_Protector) + ": " + strValueOf);
        return true;
    }
}
