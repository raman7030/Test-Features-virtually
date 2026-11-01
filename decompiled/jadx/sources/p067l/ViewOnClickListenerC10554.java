package p067l;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import bin.p000mt.plus.ShortcutActivity;

/* JADX INFO: renamed from: l.ۡۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC10554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f29231;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractActivityC5549 f29232;

    public /* synthetic */ ViewOnClickListenerC10554(AbstractActivityC5549 abstractActivityC5549, int i) {
        this.f29231 = i;
        this.f29232 = abstractActivityC5549;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f29231) {
            case 0:
                AbstractActivityC5549 abstractActivityC5549 = this.f29232;
                Intent intent = new Intent(abstractActivityC5549, (Class<?>) ActivityC23336.class);
                intent.putExtra("fromDialog", true);
                abstractActivityC5549.startActivity(intent);
                break;
            case 1:
                boolean zM26415 = C11419.m26415();
                AbstractActivityC5549 abstractActivityC55410 = this.f29232;
                if (!zM26415) {
                    ActivityC12554.m28933((Context) abstractActivityC55410, C25165.m55226(), false);
                } else {
                    ActivityC12554.m28933((Context) abstractActivityC55410, C25165.m55231(), false);
                }
                break;
            default:
                ShortcutActivity.m136(this.f29232, true);
                break;
        }
    }
}
