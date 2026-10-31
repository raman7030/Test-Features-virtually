package l;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S57O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLongClickListenerC9666 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29263;

    public /* synthetic */ ViewOnLongClickListenerC9666(int i) {
        this.f29263 = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f29263) {
            case 0:
                C4925.m14314((CharSequence) ((TextView) view).getText().toString());
                break;
            default:
                int i = C5712.f17595;
                Context context = view.getContext();
                context.startActivity(new Intent(context, (Class<?>) ActivityC0477.class).addFlags(268435456).putExtra("pageIndex", ((Integer) view.getTag(R.id.tabLayout)).intValue()));
                break;
        }
        return true;
    }
}
