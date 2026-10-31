package l;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import bin.mt.plus.ShortcutActivity;

/* JADX INFO: renamed from: l.ۡۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8613 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26315;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f26316;

    public /* synthetic */ ViewOnClickListenerC8613(AbstractActivityC3346 abstractActivityC3346, int i) {
        this.f26315 = i;
        this.f26316 = abstractActivityC3346;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f26315) {
            case 0:
                AbstractActivityC3346 abstractActivityC3346 = this.f26316;
                Intent intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC22062.class);
                intent.putExtra("fromDialog", true);
                abstractActivityC3346.startActivity(intent);
                break;
            case 1:
                boolean zM24405 = C9523.m24405();
                AbstractActivityC3346 abstractActivityC3347 = this.f26316;
                if (!zM24405) {
                    ActivityC10717.m26893((Context) abstractActivityC3347, C23986.m52820(), false);
                } else {
                    ActivityC10717.m26893((Context) abstractActivityC3347, C23986.m52825(), false);
                }
                break;
            default:
                ShortcutActivity.m138(this.f26316, true);
                break;
        }
    }
}
