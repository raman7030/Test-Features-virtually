package p067l;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۢܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S57O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLongClickListenerC11555 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f32212;

    public /* synthetic */ ViewOnLongClickListenerC11555(int i) {
        this.f32212 = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f32212) {
            case 0:
                C7050.m16211((CharSequence) ((TextView) view).getText().toString());
                break;
            default:
                int i = C7797.f20441;
                Context context = view.getContext();
                context.startActivity(new Intent(context, (Class<?>) ActivityC2822.class).addFlags(268435456).putExtra("pageIndex", ((Integer) view.getTag(R.id.tabLayout)).intValue()));
                break;
        }
        return true;
    }
}
